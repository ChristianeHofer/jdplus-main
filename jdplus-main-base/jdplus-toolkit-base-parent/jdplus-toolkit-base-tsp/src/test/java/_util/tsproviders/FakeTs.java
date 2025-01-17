/*
 * Copyright 2017 National Bank of Belgium
 * 
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved 
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
package _util.tsproviders;

import jdplus.toolkit.base.api.timeseries.TsUnit;
import jdplus.toolkit.base.api.timeseries.TsData;
import java.util.Collections;
import java.util.Map;

/**
 *
 * @author Philippe Charles
 */
@lombok.Value
@lombok.Builder
public final class FakeTs {

    @lombok.NonNull
    String label;
    @lombok.NonNull
    TsData data;
    @lombok.NonNull
    Map<String, String> meta = Collections.emptyMap();

    public static final FakeTs S1 = FakeTs.builder().label("Series 1").data(TsData.random(TsUnit.MONTH, 1)).build();
    public static final FakeTs S2 = FakeTs.builder().label("Series 2").data(TsData.random(TsUnit.MONTH, 2)).build();
    public static final FakeTs S3 = FakeTs.builder().label("Series 3").data(TsData.empty("Missing")).build();
}
