/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demetra.tramoseats.io.protobuf;

import demetra.toolkit.io.protobuf.ToolkitProtosUtility;
import demetra.tramo.TransformSpec;

/**
 *
 * @author PALATEJ
 */
@lombok.experimental.UtilityClass
public class BasicProto {

    public void fill(TransformSpec spec, TramoSpec.BasicSpec.Builder builder) {
        builder.setSpan(ToolkitProtosUtility.convert(spec.getSpan()))
                .setPreliminaryCheck(spec.isPreliminaryCheck());
    }

    public TramoSpec.BasicSpec convert(TransformSpec spec) {
        TramoSpec.BasicSpec.Builder builder = TramoSpec.BasicSpec.newBuilder();
        fill(spec, builder);
        return builder.build();
    }

 }
