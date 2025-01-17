/*
 * Copyright 2021 National Bank of Belgium
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
package jdplus.toolkit.base.api.data;

import nbbrd.design.Development;

/**
 * Describes an element cursor.
 *
 * @author Philippe Charles
 * @param <E>
 */
@Development(status = Development.Status.Release)
public interface SeqCursor<E> extends BaseSeqCursor {

    /**
     * Returns the current element and advances the cursor.
     *
     * @return
     */
    E getAndNext() throws IndexOutOfBoundsException;
}
