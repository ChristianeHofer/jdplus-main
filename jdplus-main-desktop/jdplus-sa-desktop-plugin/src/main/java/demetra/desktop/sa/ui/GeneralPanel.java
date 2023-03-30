/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/template_mypluginPanel.java to edit this template
 */
package demetra.desktop.sa.ui;

import demetra.desktop.DemetraIcons;
import demetra.desktop.actions.Resetable;
import demetra.desktop.nodes.AbstractNodeBuilder;
import demetra.desktop.nodes.NamedServiceNode;
import demetra.desktop.sa.output.OutputFactoryBuddy;
import jdplus.sa.base.api.EstimationPolicyType;
import jdplus.sa.base.api.SaSpecification;
import ec.util.list.swing.JListSelection;
import java.awt.Dimension;
import java.awt.Image;
import java.beans.PropertyChangeEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.DropDownButtonFactory;
import org.openide.explorer.ExplorerManager;
import org.openide.nodes.Node;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;

final class GeneralPanel extends javax.swing.JPanel {

    private final GeneralOptionsPanelController controller;

    private final SpecSelectionComponent specComponent = new SpecSelectionComponent(true);
    private final JPopupMenu specPopup = new JPopupMenu();

    private final JListSelection<String> fieldSelectionComponent = new JListSelection<>();

    private EstimationPolicyType[] types = {EstimationPolicyType.Complete,
        EstimationPolicyType.FreeParameters,
        EstimationPolicyType.None};

    private ExplorerManager getOutputsExplorerManager() {
        return ((ExplorerManager.Provider) outputsPanel).getExplorerManager();

    }

    GeneralPanel(GeneralOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        initSpecButton();

        fieldSelectionComponent.setSourceHeader(new JLabel("Available items :"));
        fieldSelectionComponent.setTargetHeader(new JLabel("Selected items :"));
        fieldSelectionComponent.setBorder(new EmptyBorder(10, 10, 10, 10));
        fieldSelectionComponent.setPreferredSize(new Dimension(400, 300));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lastYearsPanel = new javax.swing.JPanel();
        spectralLabel = new javax.swing.JLabel();
        spectralLength = new javax.swing.JSpinner();
        seasonalityLabel = new javax.swing.JLabel();
        seasonalityLength = new javax.swing.JSpinner();
        stabilityLabel = new javax.swing.JLabel();
        stabilityLength = new javax.swing.JSpinner();
        saPanel = new javax.swing.JPanel();
        defaultSpecLabel = new javax.swing.JLabel();
        specButton = DropDownButtonFactory.createDropDownButton(DemetraIcons.BLOG_16, specPopup);
        selectedSpecLabel = new javax.swing.JLabel();
        revisionHistoryPanel = new javax.swing.JPanel();
        estimationLabel = new javax.swing.JLabel();
        estimationPolicyComboBox = new javax.swing.JComboBox();
        outputsPanel = new ExtPanel();
        jToolBar1 = new javax.swing.JToolBar();
        editOutput = new javax.swing.JButton();
        resetOutput = new javax.swing.JButton();
        outputsView = new org.openide.explorer.view.OutlineView("Diagnostics");

        lastYearsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.lastYearsPanel.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(spectralLabel, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.spectralLabel.text")); // NOI18N

        spectralLength.setModel(new javax.swing.SpinnerNumberModel());

        org.openide.awt.Mnemonics.setLocalizedText(seasonalityLabel, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.seasonalityLabel.text")); // NOI18N

        seasonalityLength.setModel(new javax.swing.SpinnerNumberModel(10, 4, null, 1));

        org.openide.awt.Mnemonics.setLocalizedText(stabilityLabel, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.stabilityLabel.text")); // NOI18N

        stabilityLength.setModel(new javax.swing.SpinnerNumberModel(8, 4, null, 1));

        javax.swing.GroupLayout lastYearsPanelLayout = new javax.swing.GroupLayout(lastYearsPanel);
        lastYearsPanel.setLayout(lastYearsPanelLayout);
        lastYearsPanelLayout.setHorizontalGroup(
            lastYearsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastYearsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lastYearsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spectralLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lastYearsPanelLayout.createSequentialGroup()
                        .addComponent(stabilityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(seasonalityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lastYearsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lastYearsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(stabilityLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seasonalityLength))
                    .addComponent(spectralLength, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        lastYearsPanelLayout.setVerticalGroup(
            lastYearsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastYearsPanelLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(lastYearsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spectralLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spectralLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lastYearsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seasonalityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seasonalityLength))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lastYearsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stabilityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stabilityLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        saPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.saPanel.border.title"))); // NOI18N
        saPanel.setLayout(new javax.swing.BoxLayout(saPanel, javax.swing.BoxLayout.LINE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(defaultSpecLabel, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.defaultSpecLabel.text")); // NOI18N
        defaultSpecLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 20));
        saPanel.add(defaultSpecLabel);

        org.openide.awt.Mnemonics.setLocalizedText(specButton, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.specButton.text")); // NOI18N
        saPanel.add(specButton);

        org.openide.awt.Mnemonics.setLocalizedText(selectedSpecLabel, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.selectedSpecLabel.text")); // NOI18N
        selectedSpecLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        saPanel.add(selectedSpecLabel);

        revisionHistoryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.revisionHistoryPanel.border.title"))); // NOI18N
        revisionHistoryPanel.setLayout(new javax.swing.BoxLayout(revisionHistoryPanel, javax.swing.BoxLayout.LINE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(estimationLabel, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.estimationLabel.text")); // NOI18N
        estimationLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 20));
        revisionHistoryPanel.add(estimationLabel);

        revisionHistoryPanel.add(estimationPolicyComboBox);

        outputsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.outputsPanel.border.title"))); // NOI18N

        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        editOutput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demetra/desktop/sa/ui/preferences-system_16x16.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(editOutput, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.editOutput.text")); // NOI18N
        editOutput.setFocusable(false);
        editOutput.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editOutput.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editOutputActionPerformed(evt);
            }
        });
        jToolBar1.add(editOutput);

        resetOutput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demetra/desktop/sa/ui/reset_16x16.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(resetOutput, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.resetOutput.text")); // NOI18N
        resetOutput.setFocusable(false);
        resetOutput.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resetOutput.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        resetOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetOutputActionPerformed(evt);
            }
        });
        jToolBar1.add(resetOutput);

        outputsView.setColumnHeader(null);
        outputsView.setColumnHeaderView(null);
        outputsView.setQuickSearchAllowed(false);
        outputsView.setRowHeaderView(null);

        javax.swing.GroupLayout outputsPanelLayout = new javax.swing.GroupLayout(outputsPanel);
        outputsPanel.setLayout(outputsPanelLayout);
        outputsPanelLayout.setHorizontalGroup(
            outputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outputsView, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        outputsPanelLayout.setVerticalGroup(
            outputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(outputsPanelLayout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 74, Short.MAX_VALUE))
                    .addGroup(outputsPanelLayout.createSequentialGroup()
                        .addComponent(outputsView, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(revisionHistoryPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addComponent(lastYearsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lastYearsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(revisionHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editOutputActionPerformed
        if (getOutputsExplorerManager().getSelectedNodes() != null && getOutputsExplorerManager().getSelectedNodes().length != 0) {
            getOutputsExplorerManager().getSelectedNodes()[0].getPreferredAction().actionPerformed(evt);
        }
    }//GEN-LAST:event_editOutputActionPerformed

    private void resetOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetOutputActionPerformed
        Node[] sel = getOutputsExplorerManager().getSelectedNodes();
        if (sel == null || sel.length == 0) {
            return;
        }
        Node node = sel[0];
        Resetable r = node.getLookup().lookup(Resetable.class);
        if (r == null) {
            return;
        }
        NotifyDescriptor d = new NotifyDescriptor.Confirmation("Would you like to reset to default values ?", "Reset", NotifyDescriptor.YES_NO_OPTION);
        if (DialogDisplayer.getDefault().notify(d) == NotifyDescriptor.YES_OPTION) {
            r.reset();
        }
    }//GEN-LAST:event_resetOutputActionPerformed

    void load() {
        DemetraSaUI saui = DemetraSaUI.get();
        spectralLength.setValue(saui.getSpectralLastYears());
        seasonalityLength.setValue(saui.getSeasonalityLength());

        stabilityLength.setValue(saui.getStabilityLength());

        estimationPolicyComboBox.setModel(new DefaultComboBoxModel(types));
        estimationPolicyComboBox.setSelectedItem(saui.getEstimationPolicyType());

        specComponent.setSpecification(saui.getDefaultSaSpec());
        selectedSpecLabel.setText(saui.getDefaultSaSpec() == null ? "" : saui.getDefaultSaSpec().display());

        AbstractNodeBuilder root = new AbstractNodeBuilder()
                .name("Ouputs")
                .add(Lookup.getDefault().lookupAll(OutputFactoryBuddy.class).stream().map(NamedServiceNode::new));
        getOutputsExplorerManager().setRootContext(root.build());
    }

    void store() {
        DemetraSaUI ui = DemetraSaUI.get();
        ui.setSpectralLastYears((Integer) spectralLength.getValue());
        ui.setSeasonalityLength((Integer) seasonalityLength.getValue());

        ui.setStabilityLength((Integer) stabilityLength.getValue());

        ui.setEstimationPolicyType((EstimationPolicyType) estimationPolicyComboBox.getSelectedItem());
        ui.setDefaultSaSpec(specComponent.getSpecification());

//        NamedServiceNode.storeAll(getDiagnosticsExplorerManager());
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel defaultSpecLabel;
    private javax.swing.JButton editOutput;
    private javax.swing.JLabel estimationLabel;
    private javax.swing.JComboBox estimationPolicyComboBox;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel lastYearsPanel;
    private javax.swing.JPanel outputsPanel;
    private org.openide.explorer.view.OutlineView outputsView;
    private javax.swing.JButton resetOutput;
    private javax.swing.JPanel revisionHistoryPanel;
    private javax.swing.JPanel saPanel;
    private javax.swing.JLabel seasonalityLabel;
    private javax.swing.JSpinner seasonalityLength;
    private javax.swing.JLabel selectedSpecLabel;
    private javax.swing.JButton specButton;
    private javax.swing.JLabel spectralLabel;
    private javax.swing.JSpinner spectralLength;
    private javax.swing.JLabel stabilityLabel;
    private javax.swing.JSpinner stabilityLength;
    // End of variables declaration//GEN-END:variables
    private void initSpecButton() {
        specPopup.add(specComponent);
        specComponent.addPropertyChangeListener((PropertyChangeEvent evt) -> {
            String p = evt.getPropertyName();
            if (p.equals(SpecSelectionComponent.SPECIFICATION_PROPERTY) && evt.getNewValue() != null) {
                selectedSpecLabel.setText(((SaSpecification) evt.getNewValue()).longDisplay());
            } else if (p.equals(SpecSelectionComponent.ICON_PROPERTY) && evt.getNewValue() != null) {
                specButton.setIcon(ImageUtilities.image2Icon((Image) evt.getNewValue()));
            }
        });
    }
    
        private static final class ExtPanel extends JPanel implements ExplorerManager.Provider {

        private final ExplorerManager em = new ExplorerManager();

        @Override
        public ExplorerManager getExplorerManager() {
            return em;
        }
    }

}
