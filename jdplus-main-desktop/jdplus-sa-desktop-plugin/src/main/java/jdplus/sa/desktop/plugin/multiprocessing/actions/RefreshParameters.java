/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdplus.sa.desktop.plugin.multiprocessing.actions;

import jdplus.sa.desktop.plugin.multiprocessing.ui.MultiProcessingManager;
import jdplus.sa.desktop.plugin.multiprocessing.ui.SaBatchUI;
import jdplus.toolkit.desktop.plugin.ui.ActiveViewAction;
import jdplus.sa.base.api.EstimationPolicyType;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(category = "SaProcessing",
id = "demetra.desktop.sa.multiprocessing.actions.RefreshParameters")
@ActionRegistration(displayName = "#CTL_RefreshParameters", lazy=true)
@ActionReferences({
    @ActionReference(path = MultiProcessingManager.CONTEXTPATH+RefreshPartial.PATH, position = 1235)
})
@Messages("CTL_RefreshParameters=+ Arima parameters")
public final class RefreshParameters extends ActiveViewAction<SaBatchUI> {

    public RefreshParameters() {
        super(SaBatchUI.class);
        refreshAction();
        putValue(NAME, Bundle.CTL_RefreshParameters());
    }

    @Override
    protected void process(SaBatchUI ui) {
        ui.refresh(EstimationPolicyType.FreeParameters, true, true);
    }

    @Override
    protected void refreshAction() {
        SaBatchUI ui = context();
        enabled = ui != null && ui.getElement().isRefreshable();
    }
}