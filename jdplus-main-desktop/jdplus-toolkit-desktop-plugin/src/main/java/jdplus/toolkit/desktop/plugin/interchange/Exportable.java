/*
 * Copyright 2013 National Bank of Belgium
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
package jdplus.toolkit.desktop.plugin.interchange;

import jdplus.toolkit.desktop.plugin.Config;
import ec.util.various.swing.OnEDT;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Defines the ability of a component to export its state/configuration.
 *
 * @author charphi
 */
public interface Exportable {

    /**
     * Exports the current state of a component into a config object.
     *
     * @return a non-null config
     */
    @OnEDT
    @NonNull
    Config exportConfig();
}
