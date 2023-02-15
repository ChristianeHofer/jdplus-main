/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdplus.x11.pseudoadd;

import demetra.data.DoubleSeq;
import jdplus.x11.X11Context;
import jdplus.x11.filter.MsrFilterSelection;

/**
 *
 * @author Nina Gonschorreck
 */
public class MsrFilterSelectionPseudoAdd extends MsrFilterSelection {

    @Override
    protected DoubleSeq calcIrregular(X11Context context, DoubleSeq series, DoubleSeq seas) {
        return PseudoAddUtility.removeIrregular(series, seas);
    }

}
