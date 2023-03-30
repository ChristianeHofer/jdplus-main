/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demetra.desktop.core.tools;

import demetra.desktop.components.parts.HasTs;
import demetra.desktop.components.tools.PeriodogramView;
import java.beans.PropertyVetoException;
import java.lang.reflect.InvocationTargetException;

import jdplus.toolkit.base.api.timeseries.Ts;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.ExplorerUtils;
import org.openide.nodes.*;
import org.openide.nodes.Sheet.Set;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.Mode;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(dtd = "-//demetra.desktop.core.tools//Periodogram//EN",
        autostore = false)
@TopComponent.Description(preferredID = "PeriodogramTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_NEVER)
@TopComponent.Registration(mode = "output", openAtStartup = false)
@ActionID(category = "Window", id = "demetra.desktop.core.tools.PeriodogramTopComponent")
@ActionReference(path = "Menu/Tools/Spectral analysis", position = 200)
@TopComponent.OpenActionRegistration(displayName = "#CTL_PeriodogramAction")
@Messages({
    "CTL_PeriodogramAction=Periodogram",
    "CTL_PeriodogramTopComponent=Periodogram Window",
    "HINT_PeriodogramTopComponent=This is a Periodogram window"
})
public final class PeriodogramTopComponent extends TopComponent implements HasTs, ExplorerManager.Provider {

    private final ExplorerManager mgr = new ExplorerManager();

    @lombok.experimental.Delegate(types = HasTs.class)
    private final PeriodogramView view;

    public PeriodogramTopComponent() {
        initComponents();
        view = new PeriodogramView();
        add(view);
        setName(Bundle.CTL_PeriodogramTopComponent());
        setToolTipText(Bundle.HINT_PeriodogramTopComponent());
        associateLookup(ExplorerUtils.createLookup(mgr, getActionMap()));
    }

    @Override
    public ExplorerManager getExplorerManager() {
        return mgr;
    }

    @Override
    protected void componentOpened() {
        Node node = new InternalNode();
        try {
            mgr.setRootContext(node);
            mgr.setSelectedNodes(new Node[]{node});
        } catch (PropertyVetoException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    @Override
    protected void componentClosed() {
        mgr.setRootContext(Node.EMPTY);
    }

    @Override
    public void open() {
        super.open();
        Mode mode = WindowManager.getDefault().findMode("output");
        if (mode != null && mode.canDock(this)) {
            mode.dockInto(this);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "3.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

    @Override
    public Ts getTs() {
        return view.getTs();
    }

    @Override
    public void setTs(Ts ts) {
        view.setTs(ts);
    }

    class InternalNode extends AbstractNode {

        @Messages({
            "periodogramTopComponent.internalNode.displayName=Periodogram"
        })
        InternalNode() {
            super(Children.LEAF);
            setDisplayName(Bundle.periodogramTopComponent_internalNode_displayName());
        }

        @Override
        @Messages({
            "periodogramTopComponent.transform.name=Transform",
            "periodogramTopComponent.transform.displayName=Transformation",
            "periodogramTopComponent.display.name=Display",
            "periodogramTopComponent.display.displayName=Display",
            "periodogramTopComponent.log.name=Log",
            "periodogramTopComponent.log.desc=When marked, logarithmic transformation is used.",
            "periodogramTopComponent.differencing.name=Differencing",
            "periodogramTopComponent.differencing.desc=An order of a regular differencing of the series.",
            "periodogramTopComponent.differencingLag.name=Differencing lag",
            "periodogramTopComponent.differencingLag.desc=A number of lags used to take differences. For example, if Differencing lag = 3 then the differencing filter does not apply to the first lag (default) but to the third lag.",
            "periodogramTopComponent.lastYears.name=Last years",
            "periodogramTopComponent.lastYears.desc=A number of years of observations at the end of the time series used to produce the autoregressive spectrum (0=the whole time series is considered.",
            "periodogramTopComponent.fullYears.name=Full years",
            "periodogramTopComponent.fullYears.desc=Use full years (end of series)",
            "periodogramTopComponent.meanCorrection.name=Mean correction",
            "periodogramTopComponent.meanCorrection.desc=Remove the mean of the series prior to the computation of the periodogram",
            "periodogramTopComponent.db.name=Decibels",
            "periodogramTopComponent.db.desc=Periodogram in logs",})
        protected Sheet createSheet() {
            Sheet sheet = super.createSheet();
            Set transform = Sheet.createPropertiesSet();
            transform.setName(Bundle.periodogramTopComponent_transform_name());
            transform.setDisplayName(Bundle.periodogramTopComponent_transform_displayName());
            Property<Boolean> log = new Property(Boolean.class) {
                @Override
                public boolean canRead() {
                    return true;
                }

                @Override
                public Object getValue() throws IllegalAccessException, InvocationTargetException {
                    return view.isLogTransformation();
                }

                @Override
                public boolean canWrite() {
                    return true;
                }

                @Override
                public void setValue(Object t) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    view.setLogTransformation((Boolean) t);
                }
            };

            log.setName(Bundle.periodogramTopComponent_log_name());
            log.setShortDescription(Bundle.periodogramTopComponent_log_desc());
            transform.put(log);
            Property<Integer> diff = new Property(Integer.class) {
                @Override
                public boolean canRead() {
                    return true;
                }

                @Override
                public Object getValue() throws IllegalAccessException, InvocationTargetException {
                    return view.getDifferencingOrder();
                }

                @Override
                public boolean canWrite() {
                    return true;
                }

                @Override
                public void setValue(Object t) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    view.setDifferencingOrder((Integer) t);
                }
            };

            diff.setName(Bundle.periodogramTopComponent_differencing_name());
            diff.setShortDescription(Bundle.periodogramTopComponent_differencing_desc());
            transform.put(diff);
            Node.Property<Integer> diffLag = new Node.Property(Integer.class) {
                @Override
                public boolean canRead() {
                    return true;
                }

                @Override
                public Object getValue() throws IllegalAccessException, InvocationTargetException {
                    return view.getDifferencingLag();
                }

                @Override
                public boolean canWrite() {
                    return true;
                }

                @Override
                public void setValue(Object t) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    view.setDifferencingLag((Integer) t);
                }
            };
            diffLag.setName(Bundle.periodogramTopComponent_differencingLag_name());
            diffLag.setShortDescription(Bundle.periodogramTopComponent_differencingLag_desc());
            transform.put(diffLag);

            Node.Property<Integer> length = new Node.Property(Integer.class) {
                @Override
                public boolean canRead() {
                    return true;
                }

                @Override
                public Object getValue() throws IllegalAccessException, InvocationTargetException {
                    return view.getLastYears();
                }

                @Override
                public boolean canWrite() {
                    return true;
                }

                @Override
                public void setValue(Object t) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    view.setLastYears((Integer) t);
                }
            };
            length.setName(Bundle.periodogramTopComponent_lastYears_name());
            length.setShortDescription(Bundle.periodogramTopComponent_lastYears_desc());
            transform.put(length);

            Node.Property<Boolean> full = new Node.Property(Boolean.class) {
                @Override
                public boolean canRead() {
                    return true;
                }

                @Override
                public Object getValue() throws IllegalAccessException, InvocationTargetException {
                    return view.isFullYears();
                }

                @Override
                public boolean canWrite() {
                    return true;
                }

                @Override
                public void setValue(Object t) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    view.setFullYears((Boolean) t);
                }
            };
            full.setName(Bundle.periodogramTopComponent_fullYears_name());
            full.setShortDescription(Bundle.periodogramTopComponent_fullYears_desc());
            transform.put(full);
            Node.Property<Boolean> mean = new Node.Property(Boolean.class) {
                @Override
                public boolean canRead() {
                    return true;
                }

                @Override
                public Object getValue() throws IllegalAccessException, InvocationTargetException {
                    return view.isMeanCorrection();
                }

                @Override
                public boolean canWrite() {
                    return true;
                }

                @Override
                public void setValue(Object t) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    view.setMeanCorrection((Boolean) t);
                }
            };
            mean.setName(Bundle.periodogramTopComponent_meanCorrection_name());
            mean.setShortDescription(Bundle.periodogramTopComponent_meanCorrection_desc());
            transform.put(mean);
            sheet.put(transform);
            Set display = Sheet.createPropertiesSet();
            display.setName(Bundle.periodogramTopComponent_display_name());
            display.setDisplayName(Bundle.periodogramTopComponent_display_displayName());
            Node.Property<Boolean> db = new Node.Property(Boolean.class) {
                @Override
                public boolean canRead() {
                    return true;
                }

                @Override
                public Object getValue() throws IllegalAccessException, InvocationTargetException {
                    return view.isDb();
                }

                @Override
                public boolean canWrite() {
                    return true;
                }

                @Override
                public void setValue(Object t) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    view.setDb((Boolean) t);
                }
            };
            db.setName(Bundle.periodogramTopComponent_db_name());
            db.setShortDescription(Bundle.periodogramTopComponent_db_desc());
            display.put(db);
            sheet.put(display);
            return sheet;
        }
    }
}
