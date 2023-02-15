/*
 * Copyright 2020 National Bank of Belgium
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
package demetra.timeseries;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;

import demetra.time.ISO_8601;
import demetra.time.TimeInterval;

/**
 *
 * @param <D>
 *
 * @author Philippe Charles
 */
@ISO_8601
public interface TimeSeriesInterval<D extends TemporalAmount> extends TimeInterval<LocalDateTime, D> {

}
