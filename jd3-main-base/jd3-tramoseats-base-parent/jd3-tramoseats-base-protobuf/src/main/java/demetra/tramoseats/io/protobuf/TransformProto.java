/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demetra.tramoseats.io.protobuf;

import demetra.modelling.io.protobuf.ModellingProtosUtility;
import demetra.tramo.TransformSpec;
import demetra.toolkit.io.protobuf.ToolkitProtosUtility;

/**
 *
 * @author PALATEJ
 */
@lombok.experimental.UtilityClass
public class TransformProto {
    
    public void fill(TransformSpec spec, TramoSpec.TransformSpec.Builder builder) {
        builder.setTransformation(ModellingProtosUtility.convert(spec.getFunction()))
                .setFct(spec.getFct())
                .setAdjust(ModellingProtosUtility.convert(spec.getAdjust()))
                .setOutliersCorrection(spec.isOutliersCorrection());
        
    }
    // TODO outliers
    public TramoSpec.TransformSpec convert(TransformSpec spec) {
        TramoSpec.TransformSpec.Builder builder = TramoSpec.TransformSpec.newBuilder();
        fill(spec, builder);
        return builder.build();
    }
    
    public TransformSpec convert(TramoSpec.BasicSpec bspec, TramoSpec.TransformSpec tspec) {
        return TransformSpec.builder()
                .span(ToolkitProtosUtility.convert(bspec.getSpan()))
                .preliminaryCheck(bspec.getPreliminaryCheck())
                .function(ModellingProtosUtility.convert(tspec.getTransformation()))
                .fct(tspec.getFct())
                .adjust(ModellingProtosUtility.convert(tspec.getAdjust()))
                .outliersCorrection(tspec.getOutliersCorrection())
                .build();
    }
    
}
