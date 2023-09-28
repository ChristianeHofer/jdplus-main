/*
 * Copyright 2022 National Bank of Belgium
 * 
 * Licensed under the EUPL, Version 1.2 or – as soon they will be approved 
 * by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * 
 * https://joinup.ec.europa.eu/software/page/eupl
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and 
 * limitations under the Licence.
 */
package jdplus.text.base.r;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import jdplus.text.base.api.XmlBean;
import jdplus.text.base.api.XmlProvider;
import jdplus.toolkit.base.api.timeseries.Ts;
import jdplus.toolkit.base.api.timeseries.TsCollection;
import jdplus.toolkit.base.api.timeseries.TsData;
import jdplus.toolkit.base.api.timeseries.TsFactory;
import jdplus.toolkit.base.api.timeseries.TsInformationType;
import jdplus.toolkit.base.api.timeseries.TsMoniker;
import jdplus.toolkit.base.tsp.DataSet;
import jdplus.toolkit.base.tsp.DataSource;

/**
 *
 * @author palatej
 */
@lombok.experimental.UtilityClass
public class XmlFiles {

    private final XmlProvider PROVIDER = new XmlProvider();

    static XmlProvider currentProvider() {
        return (XmlProvider) TsFactory.getDefault().getProvider(XmlProvider.NAME).orElse(null);
    }

    public List<TsMoniker> changeFiles(List<TsMoniker> monikers, File ofile, File nfile) {
        List<TsMoniker> rslt = new ArrayList<>();
        for (TsMoniker moniker : monikers) {
            Optional<DataSet> set = PROVIDER.toDataSet(moniker);
            set.ifPresentOrElse(
                    (DataSet d) -> {
                        XmlBean bean = PROVIDER.decodeBean(d.getDataSource());
                        if (bean.getFile().equals(ofile)) {
                            bean.setFile(nfile);
                            DataSource src = PROVIDER.encodeBean(bean);

                            DataSet nd = d.toBuilder()
                                    .dataSource(src)
                                    .build();
                            rslt.add(PROVIDER.toMoniker(nd));
                        } else {
                            rslt.add(moniker);
                        }
                    }, () -> rslt.add(moniker));
        }
        return rslt;
    }

    public TsMoniker changeFile(TsMoniker moniker, File ofile, File nfile) {
        Optional<DataSet> set = PROVIDER.toDataSet(moniker);
        Optional<TsMoniker> m = set.<TsMoniker>map(d -> {
            XmlBean bean = PROVIDER.decodeBean(d.getDataSource());
            if (bean.getFile().equals(ofile)) {
                bean.setFile(nfile);
                DataSource src = PROVIDER.encodeBean(bean);

                DataSet nd = d.toBuilder()
                        .dataSource(src)
                        .build();
                return PROVIDER.toMoniker(nd);
            } else {
                return moniker;
            }
        });
        return m.orElse(moniker);
    }

    public DataSource source(String file, String cs) {
        XmlBean bean = new XmlBean();
        bean.setFile(new File(file));
        if (cs != null) {
            Charset charset = Charset.forName(cs);
            bean.setCharset(charset);
        }
        return PROVIDER.encodeBean(bean);
    }

    public String[] series(DataSource source) throws Exception {
        XmlProvider currentProvider = currentProvider();
        if (currentProvider == null) {
            throw new Exception("XmlProvider is not available");
        }
        try {
            currentProvider.open(source);
            List<DataSet> all = currentProvider.children(source);
            return all.stream().map(s -> currentProvider.getDisplayNodeName(s)).toArray(String[]::new);
        } finally {
            currentProvider.close(source);
        }
    }

    public Ts series(DataSource source, int series, boolean fullName) throws Exception {
        XmlProvider currentProvider = currentProvider();
        if (currentProvider == null) {
            throw new Exception("TxtProvider is not available");
        }
        try {
            currentProvider.open(source);
            List<DataSet> all = currentProvider.children(source);
            if (series > all.size()) {
                throw new IllegalArgumentException("Invalid sheet");
            }
            DataSet s = all.get(series - 1);
            TsMoniker moniker = currentProvider.toMoniker(s);
            return currentProvider.getTs(moniker, TsInformationType.All).withName(fullName ? currentProvider.getDisplayName(s) : currentProvider.getDisplayNodeName(s));
        } finally {
            currentProvider.close(source);
        }
    }

    private Ts of(XmlProvider provider, DataSet c) {
        TsMoniker moniker = provider.toMoniker(c);
        try {
            return provider.getTs(moniker, TsInformationType.All)
                    .withName(provider.getDisplayNodeName(c));
        } catch (IOException ex) {
            return Ts.builder()
                    .moniker(moniker)
                    .data(TsData.empty("Unavailable"))
                    .build();

        }
    }

    public TsCollection collection(DataSource source, boolean fullNames) throws Exception {
        XmlProvider currentProvider = currentProvider();
        if (currentProvider == null) {
            throw new Exception("TxtProvider is not available");
        }
        try {
            currentProvider.open(source);
            TsMoniker moniker = currentProvider.toMoniker(source);
            if (fullNames) {
                return currentProvider.getTsCollection(moniker, TsInformationType.All).withName(currentProvider.getDisplayName(source));
            } else {
                List<DataSet> schildren = currentProvider.children(source);
                List<Ts> all = schildren.stream().map(c -> of(currentProvider, c)).toList();
                return TsCollection.builder()
                        .name(currentProvider.getDisplayName(source))
                        .moniker(moniker)
                        .items(all)
                        .build();
            }
        } finally {
            currentProvider.close(source);
        }
    }

    public void setPaths(String[] paths) throws Exception {
        XmlProvider provider = currentProvider();
        if (provider == null) {
            throw new Exception("XmlProvider is not available");
        }
        File[] files = Arrays.stream(paths).map(p -> new File(p)).toArray(n -> new File[n]);
        provider.setPaths(files);
    }

}
