/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdplus.toolkit.desktop.plugin.star;

import jdplus.toolkit.desktop.plugin.util.InstallerStep;
import jdplus.toolkit.base.api.timeseries.TsFactory;
import jdplus.toolkit.base.api.timeseries.TsProvider;
import jdplus.toolkit.base.tsp.DataSource;
import jdplus.toolkit.base.tsp.DataSourceLoader;
import nbbrd.io.text.Formatter;
import nbbrd.io.text.Parser;
import org.openide.util.NbPreferences;

import java.util.Comparator;
import java.util.logging.Level;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import java.util.stream.Stream;

/**
 * @author Philippe Charles
 */
@lombok.extern.java.Log
public class StarStep extends InstallerStep {

    static final String DATASOURCE_PROPERTY = "StarDataSource";
    final Preferences prefs = NbPreferences.forModule(StarStep.class).node("Star");

    @Override
    public void restore() {
        StarListManager.get().clear();
        Parser<DataSource> parser = Parser.of(DataSource::parse);
        try {
            Stream.of(prefs.childrenNames())
                    .sorted(Comparator.reverseOrder())
                    .forEach(o -> {
                        Preferences node = prefs.node(o);
                        String tmp = node.get(DATASOURCE_PROPERTY, null);
                        if (tmp == null) {
                            return;
                        }
                        java.util.Optional<DataSource> dataSource = parser.parseValue(tmp);
                        if (dataSource.isPresent()) {
                            StarListManager.get().toggle(dataSource.orElseThrow());
                        }
                    });
        } catch (BackingStoreException ex) {
            log.log(Level.WARNING, "Can't get star items", ex);
        }

        for (DataSource o : StarListManager.get()) {
            java.util.Optional<TsProvider> provider = TsFactory.getDefault().getProvider(o.getProviderName());
            if (provider.isPresent()) {
                DataSourceLoader loader = (DataSourceLoader) provider.orElseThrow();
                loader.open(o);
            }
        }
    }

    @Override
    public void close() {
        // clear the backing store
        Formatter<DataSource> formatter = Formatter.of(DataSource::toString);
        int i = 0;
        for (DataSource o : StarListManager.get()) {
            Preferences node = prefs.node(String.valueOf(i++));
            node.put(DATASOURCE_PROPERTY, formatter.formatValueAsString(o).orElseThrow());
        }
        try {
            prefs.flush();
        } catch (BackingStoreException ex) {
            log.log(Level.WARNING, "Can't flush storage", ex);
        }
    }
}
