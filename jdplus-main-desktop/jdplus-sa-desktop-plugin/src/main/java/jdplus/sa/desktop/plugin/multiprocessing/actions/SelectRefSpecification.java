/*
 * Copyright 2016 National Bank of Belgium
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
package jdplus.sa.desktop.plugin.multiprocessing.actions;

import jdplus.sa.desktop.plugin.multiprocessing.ui.MultiProcessingController;
import jdplus.sa.desktop.plugin.multiprocessing.ui.MultiProcessingDocument;
import jdplus.sa.desktop.plugin.multiprocessing.ui.MultiProcessingManager;
import jdplus.sa.desktop.plugin.multiprocessing.ui.SaBatchUI;
import jdplus.sa.desktop.plugin.multiprocessing.ui.SaNode;
import jdplus.toolkit.desktop.plugin.workspace.WorkspaceItem;
import jdplus.toolkit.desktop.plugin.ui.ActiveViewAction;
import jdplus.toolkit.desktop.plugin.workspace.ui.JSpecSelectionComponent;
import jdplus.sa.base.api.SaSpecification;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(category = "SaProcessing",
        id = "demetra.sa.multiprocessing.actions.RefSpecification")
@ActionRegistration(displayName = "#CTL_RefSpecification", lazy = false)
@ActionReferences({
    @ActionReference(path = MultiProcessingManager.CONTEXTPATH + Edit.PATH, position = 1500, separatorBefore = 1499),
    @ActionReference(path = MultiProcessingManager.LOCALPATH + Edit.PATH, position = 1500)
})
@Messages("CTL_RefSpecification=Reference Specification...")
public final class SelectRefSpecification extends ActiveViewAction<SaBatchUI> {

    public SelectRefSpecification() {
        super(SaBatchUI.class);
        refreshAction();
        putValue(NAME, Bundle.CTL_RefSpecification());
    }

    @Override
    protected void refreshAction() {
        SaBatchUI ui = context();
        enabled = ui != null && ui.getSelectionCount() > 0;
    }

    @Override
    protected void process(SaBatchUI cur) {
        cur.stop();
        SaNode[] selection = cur.getSelection();
        SaSpecification spec = null;
        // find unique spec
        for (SaNode o : selection) {
            SaSpecification dspec = o.domainSpec();

            if (spec == null) {
                spec = dspec;
            } else if (!spec.equals(dspec)) {
                spec = null;
                break;
            }
        }
        JSpecSelectionComponent c = new JSpecSelectionComponent();
        c.setFamily(SaSpecification.FAMILY);
        DialogDescriptor dd = c.createDialogDescriptor("Choose reference specification");
        if (DialogDisplayer.getDefault().notify(dd) == NotifyDescriptor.OK_OPTION) {
            MultiProcessingController controller = cur.getController();
            WorkspaceItem<MultiProcessingDocument> document = controller.getDocument();
            for (SaNode o : selection) {
                SaNode n = o.withDomainSpecification((SaSpecification) c.getSpecification());
                document.getElement().replace(o.getId(), n);
            }
            cur.redrawAll();
            document.setDirty();
            controller.setSaProcessingState(MultiProcessingController.SaProcessingState.READY);
        }
    }
}
