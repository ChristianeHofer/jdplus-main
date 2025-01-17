/*
* Copyright 2013 National Bank of Belgium
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


package jdplus.toolkit.base.api.util;

import java.util.Map;
import nbbrd.design.Development;
import org.checkerframework.checker.nullness.qual.NonNull;


/**
 * Generic interface for providing meta data
 * @author Jean Palate
 */
@Development(status = Development.Status.Alpha)
public interface Documented {
    /**
     * Returns the documentation in the form of meta data
     * @return The meta data. .
     */
    @NonNull
    Map<String, String> getMetadata();
}
