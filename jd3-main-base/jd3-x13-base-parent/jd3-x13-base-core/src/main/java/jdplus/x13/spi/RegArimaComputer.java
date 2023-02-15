/*
 * Copyright 2020 National Bank of Belgium
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
package jdplus.x13.spi;

import demetra.processing.DefaultProcessingLog;
import demetra.processing.GenericResults;
import demetra.processing.ProcResults;
import demetra.regarima.RegArima;
import demetra.regarima.RegArimaSpec;
import demetra.timeseries.TsData;
import demetra.timeseries.regression.ModellingContext;
import java.util.List;
import jdplus.regsarima.regular.RegSarimaModel;
import jdplus.x13.regarima.RegArimaKernel;
import nbbrd.service.ServiceProvider;

/**
 *
 * @author palatej
 */
@ServiceProvider(RegArima.Processor.class)
public class RegArimaComputer implements RegArima.Processor{

    @Override
    public ProcResults process(TsData series, RegArimaSpec spec, ModellingContext context, List<String> addtionalItems) {
        RegArimaKernel processor = RegArimaKernel.of(spec, context);
        DefaultProcessingLog log=new DefaultProcessingLog();
        RegSarimaModel rslt = processor.process(series, log);
        return GenericResults.of(rslt, addtionalItems, log);
    }
    
}
