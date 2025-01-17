/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdplus.toolkit.desktop.plugin.ui.mru;

import jdplus.toolkit.base.tsp.DataSourceListener;
import jdplus.toolkit.base.tsp.DataSourceLoader;
import jdplus.toolkit.base.tsp.DataSourceProvider;
import jdplus.toolkit.desktop.plugin.TsManager;
import jdplus.toolkit.desktop.plugin.util.InstallerStep;
import java.util.prefs.Preferences;

import jdplus.toolkit.base.tsp.DataSource;
import org.openide.util.Lookup;
import org.openide.util.NbPreferences;

/**
 *
 * @author Philippe Charles
 */
public class MruProvidersStep extends InstallerStep.LookupStep<DataSourceProvider> {

    final Preferences prefs = NbPreferences.forModule(MruWorkspacesStep.class).node("Mru");
    final Listener listener;

    public MruProvidersStep() {
        super(DataSourceProvider.class);
        this.listener = new Listener();
    }

    @Override
    protected void onResultChanged(Lookup.Result<DataSourceProvider> lookup) {
        // won't be added twice
        TsManager.get().getProviders()
                .filter(DataSourceLoader.class::isInstance)
                .map(DataSourceLoader.class::cast)
                .forEach(o -> o.addDataSourceListener(listener));
    }

    @Override
    protected void onRestore(Lookup.Result<DataSourceProvider> lookup) {
        MruPreferences.INSTANCE.load(prefs, MruList.getProvidersInstance());
        TsManager.get().getProviders()
                .filter(DataSourceLoader.class::isInstance)
                .map(DataSourceLoader.class::cast)
                .forEach(o -> o.addDataSourceListener(listener));
    }

    @Override
    protected void onClose(Lookup.Result<DataSourceProvider> lookup) {
        TsManager.get().getProviders()
                .filter(DataSourceLoader.class::isInstance)
                .map(DataSourceLoader.class::cast)
                .forEach(o -> o.removeDataSourceListener(listener));
        MruPreferences.INSTANCE.store(prefs, MruList.getProvidersInstance());
    }

    static class Listener implements DataSourceListener {

        @Override
        public void opened(DataSource dataSource) {
            TsManager.get()
                    .getProvider(DataSourceProvider.class, dataSource)
                    .ifPresent(provider -> MruList.getProvidersInstance().add(new SourceId(dataSource, provider.getDisplayName(dataSource))));
        }

        @Override
        public void closed(DataSource ds) {
        }

        @Override
        public void changed(DataSource ds) {
        }

        @Override
        public void allClosed(String string) {
        }
    }
}
