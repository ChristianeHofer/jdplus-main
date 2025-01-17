/*
 * Copyright 2019 National Bank of Belgium
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved 
 * by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://ec.europa.eu/idabc/eupl
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and 
 * limitations under the Licence.
 */
package jdplus.x13.base.r;

import tck.demetra.data.Data;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author PALATEJ
 */
public class RegArimaOutliersDetectionTest {
    
    public RegArimaOutliersDetectionTest() {
    }

    @Test
    public void testProd() {

        RegArimaOutliersDetection.Results rslts = RegArimaOutliersDetection.process(Data.TS_PROD, new int[]{0, 1, 1}, new int[]{0, 1, 1}, false, null, true, true, false, true, 4);
        String[] outliers = rslts.getData(RegArimaOutliersDetection.Results.BNAMES, String[].class);
//        if (outliers != null) {
//            for (int i = 0; i < outliers.length; ++i) {
//                System.out.println(outliers[i]);
//            }
//        }
        assertTrue(outliers == null);
    }
    
}
