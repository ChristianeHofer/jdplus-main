// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: x13.proto

package demetra.x13.io.protobuf;

/**
 * Protobuf type {@code x13.MStatistics}
 */
public final class MStatistics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:x13.MStatistics)
    MStatisticsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MStatistics.newBuilder() to construct.
  private MStatistics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MStatistics() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MStatistics();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MStatistics(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 9: {

            m1_ = input.readDouble();
            break;
          }
          case 17: {

            m2_ = input.readDouble();
            break;
          }
          case 25: {

            m3_ = input.readDouble();
            break;
          }
          case 33: {

            m4_ = input.readDouble();
            break;
          }
          case 41: {

            m5_ = input.readDouble();
            break;
          }
          case 49: {

            m6_ = input.readDouble();
            break;
          }
          case 57: {

            m7_ = input.readDouble();
            break;
          }
          case 65: {

            m8_ = input.readDouble();
            break;
          }
          case 73: {

            m9_ = input.readDouble();
            break;
          }
          case 81: {

            m10_ = input.readDouble();
            break;
          }
          case 89: {

            m11_ = input.readDouble();
            break;
          }
          case 97: {

            q_ = input.readDouble();
            break;
          }
          case 105: {

            qm2_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return demetra.x13.io.protobuf.X13Protos.internal_static_x13_MStatistics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return demetra.x13.io.protobuf.X13Protos.internal_static_x13_MStatistics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            demetra.x13.io.protobuf.MStatistics.class, demetra.x13.io.protobuf.MStatistics.Builder.class);
  }

  public static final int M1_FIELD_NUMBER = 1;
  private double m1_;
  /**
   * <code>double m1 = 1;</code>
   * @return The m1.
   */
  @java.lang.Override
  public double getM1() {
    return m1_;
  }

  public static final int M2_FIELD_NUMBER = 2;
  private double m2_;
  /**
   * <code>double m2 = 2;</code>
   * @return The m2.
   */
  @java.lang.Override
  public double getM2() {
    return m2_;
  }

  public static final int M3_FIELD_NUMBER = 3;
  private double m3_;
  /**
   * <code>double m3 = 3;</code>
   * @return The m3.
   */
  @java.lang.Override
  public double getM3() {
    return m3_;
  }

  public static final int M4_FIELD_NUMBER = 4;
  private double m4_;
  /**
   * <code>double m4 = 4;</code>
   * @return The m4.
   */
  @java.lang.Override
  public double getM4() {
    return m4_;
  }

  public static final int M5_FIELD_NUMBER = 5;
  private double m5_;
  /**
   * <code>double m5 = 5;</code>
   * @return The m5.
   */
  @java.lang.Override
  public double getM5() {
    return m5_;
  }

  public static final int M6_FIELD_NUMBER = 6;
  private double m6_;
  /**
   * <code>double m6 = 6;</code>
   * @return The m6.
   */
  @java.lang.Override
  public double getM6() {
    return m6_;
  }

  public static final int M7_FIELD_NUMBER = 7;
  private double m7_;
  /**
   * <code>double m7 = 7;</code>
   * @return The m7.
   */
  @java.lang.Override
  public double getM7() {
    return m7_;
  }

  public static final int M8_FIELD_NUMBER = 8;
  private double m8_;
  /**
   * <code>double m8 = 8;</code>
   * @return The m8.
   */
  @java.lang.Override
  public double getM8() {
    return m8_;
  }

  public static final int M9_FIELD_NUMBER = 9;
  private double m9_;
  /**
   * <code>double m9 = 9;</code>
   * @return The m9.
   */
  @java.lang.Override
  public double getM9() {
    return m9_;
  }

  public static final int M10_FIELD_NUMBER = 10;
  private double m10_;
  /**
   * <code>double m10 = 10;</code>
   * @return The m10.
   */
  @java.lang.Override
  public double getM10() {
    return m10_;
  }

  public static final int M11_FIELD_NUMBER = 11;
  private double m11_;
  /**
   * <code>double m11 = 11;</code>
   * @return The m11.
   */
  @java.lang.Override
  public double getM11() {
    return m11_;
  }

  public static final int Q_FIELD_NUMBER = 12;
  private double q_;
  /**
   * <code>double q = 12;</code>
   * @return The q.
   */
  @java.lang.Override
  public double getQ() {
    return q_;
  }

  public static final int QM2_FIELD_NUMBER = 13;
  private double qm2_;
  /**
   * <code>double qm2 = 13;</code>
   * @return The qm2.
   */
  @java.lang.Override
  public double getQm2() {
    return qm2_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (m1_ != 0D) {
      output.writeDouble(1, m1_);
    }
    if (m2_ != 0D) {
      output.writeDouble(2, m2_);
    }
    if (m3_ != 0D) {
      output.writeDouble(3, m3_);
    }
    if (m4_ != 0D) {
      output.writeDouble(4, m4_);
    }
    if (m5_ != 0D) {
      output.writeDouble(5, m5_);
    }
    if (m6_ != 0D) {
      output.writeDouble(6, m6_);
    }
    if (m7_ != 0D) {
      output.writeDouble(7, m7_);
    }
    if (m8_ != 0D) {
      output.writeDouble(8, m8_);
    }
    if (m9_ != 0D) {
      output.writeDouble(9, m9_);
    }
    if (m10_ != 0D) {
      output.writeDouble(10, m10_);
    }
    if (m11_ != 0D) {
      output.writeDouble(11, m11_);
    }
    if (q_ != 0D) {
      output.writeDouble(12, q_);
    }
    if (qm2_ != 0D) {
      output.writeDouble(13, qm2_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (m1_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, m1_);
    }
    if (m2_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, m2_);
    }
    if (m3_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, m3_);
    }
    if (m4_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, m4_);
    }
    if (m5_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, m5_);
    }
    if (m6_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, m6_);
    }
    if (m7_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(7, m7_);
    }
    if (m8_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(8, m8_);
    }
    if (m9_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(9, m9_);
    }
    if (m10_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(10, m10_);
    }
    if (m11_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(11, m11_);
    }
    if (q_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(12, q_);
    }
    if (qm2_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(13, qm2_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof demetra.x13.io.protobuf.MStatistics)) {
      return super.equals(obj);
    }
    demetra.x13.io.protobuf.MStatistics other = (demetra.x13.io.protobuf.MStatistics) obj;

    if (java.lang.Double.doubleToLongBits(getM1())
        != java.lang.Double.doubleToLongBits(
            other.getM1())) return false;
    if (java.lang.Double.doubleToLongBits(getM2())
        != java.lang.Double.doubleToLongBits(
            other.getM2())) return false;
    if (java.lang.Double.doubleToLongBits(getM3())
        != java.lang.Double.doubleToLongBits(
            other.getM3())) return false;
    if (java.lang.Double.doubleToLongBits(getM4())
        != java.lang.Double.doubleToLongBits(
            other.getM4())) return false;
    if (java.lang.Double.doubleToLongBits(getM5())
        != java.lang.Double.doubleToLongBits(
            other.getM5())) return false;
    if (java.lang.Double.doubleToLongBits(getM6())
        != java.lang.Double.doubleToLongBits(
            other.getM6())) return false;
    if (java.lang.Double.doubleToLongBits(getM7())
        != java.lang.Double.doubleToLongBits(
            other.getM7())) return false;
    if (java.lang.Double.doubleToLongBits(getM8())
        != java.lang.Double.doubleToLongBits(
            other.getM8())) return false;
    if (java.lang.Double.doubleToLongBits(getM9())
        != java.lang.Double.doubleToLongBits(
            other.getM9())) return false;
    if (java.lang.Double.doubleToLongBits(getM10())
        != java.lang.Double.doubleToLongBits(
            other.getM10())) return false;
    if (java.lang.Double.doubleToLongBits(getM11())
        != java.lang.Double.doubleToLongBits(
            other.getM11())) return false;
    if (java.lang.Double.doubleToLongBits(getQ())
        != java.lang.Double.doubleToLongBits(
            other.getQ())) return false;
    if (java.lang.Double.doubleToLongBits(getQm2())
        != java.lang.Double.doubleToLongBits(
            other.getQm2())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + M1_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getM1()));
    hash = (37 * hash) + M2_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getM2()));
    hash = (37 * hash) + M3_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getM3()));
    hash = (37 * hash) + M4_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getM4()));
    hash = (37 * hash) + M5_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getM5()));
    hash = (37 * hash) + M6_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getM6()));
    hash = (37 * hash) + M7_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getM7()));
    hash = (37 * hash) + M8_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getM8()));
    hash = (37 * hash) + M9_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getM9()));
    hash = (37 * hash) + M10_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getM10()));
    hash = (37 * hash) + M11_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getM11()));
    hash = (37 * hash) + Q_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getQ()));
    hash = (37 * hash) + QM2_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getQm2()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static demetra.x13.io.protobuf.MStatistics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static demetra.x13.io.protobuf.MStatistics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static demetra.x13.io.protobuf.MStatistics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static demetra.x13.io.protobuf.MStatistics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static demetra.x13.io.protobuf.MStatistics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static demetra.x13.io.protobuf.MStatistics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static demetra.x13.io.protobuf.MStatistics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static demetra.x13.io.protobuf.MStatistics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static demetra.x13.io.protobuf.MStatistics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static demetra.x13.io.protobuf.MStatistics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static demetra.x13.io.protobuf.MStatistics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static demetra.x13.io.protobuf.MStatistics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(demetra.x13.io.protobuf.MStatistics prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code x13.MStatistics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:x13.MStatistics)
      demetra.x13.io.protobuf.MStatisticsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return demetra.x13.io.protobuf.X13Protos.internal_static_x13_MStatistics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return demetra.x13.io.protobuf.X13Protos.internal_static_x13_MStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              demetra.x13.io.protobuf.MStatistics.class, demetra.x13.io.protobuf.MStatistics.Builder.class);
    }

    // Construct using demetra.x13.io.protobuf.MStatistics.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      m1_ = 0D;

      m2_ = 0D;

      m3_ = 0D;

      m4_ = 0D;

      m5_ = 0D;

      m6_ = 0D;

      m7_ = 0D;

      m8_ = 0D;

      m9_ = 0D;

      m10_ = 0D;

      m11_ = 0D;

      q_ = 0D;

      qm2_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return demetra.x13.io.protobuf.X13Protos.internal_static_x13_MStatistics_descriptor;
    }

    @java.lang.Override
    public demetra.x13.io.protobuf.MStatistics getDefaultInstanceForType() {
      return demetra.x13.io.protobuf.MStatistics.getDefaultInstance();
    }

    @java.lang.Override
    public demetra.x13.io.protobuf.MStatistics build() {
      demetra.x13.io.protobuf.MStatistics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public demetra.x13.io.protobuf.MStatistics buildPartial() {
      demetra.x13.io.protobuf.MStatistics result = new demetra.x13.io.protobuf.MStatistics(this);
      result.m1_ = m1_;
      result.m2_ = m2_;
      result.m3_ = m3_;
      result.m4_ = m4_;
      result.m5_ = m5_;
      result.m6_ = m6_;
      result.m7_ = m7_;
      result.m8_ = m8_;
      result.m9_ = m9_;
      result.m10_ = m10_;
      result.m11_ = m11_;
      result.q_ = q_;
      result.qm2_ = qm2_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof demetra.x13.io.protobuf.MStatistics) {
        return mergeFrom((demetra.x13.io.protobuf.MStatistics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(demetra.x13.io.protobuf.MStatistics other) {
      if (other == demetra.x13.io.protobuf.MStatistics.getDefaultInstance()) return this;
      if (other.getM1() != 0D) {
        setM1(other.getM1());
      }
      if (other.getM2() != 0D) {
        setM2(other.getM2());
      }
      if (other.getM3() != 0D) {
        setM3(other.getM3());
      }
      if (other.getM4() != 0D) {
        setM4(other.getM4());
      }
      if (other.getM5() != 0D) {
        setM5(other.getM5());
      }
      if (other.getM6() != 0D) {
        setM6(other.getM6());
      }
      if (other.getM7() != 0D) {
        setM7(other.getM7());
      }
      if (other.getM8() != 0D) {
        setM8(other.getM8());
      }
      if (other.getM9() != 0D) {
        setM9(other.getM9());
      }
      if (other.getM10() != 0D) {
        setM10(other.getM10());
      }
      if (other.getM11() != 0D) {
        setM11(other.getM11());
      }
      if (other.getQ() != 0D) {
        setQ(other.getQ());
      }
      if (other.getQm2() != 0D) {
        setQm2(other.getQm2());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      demetra.x13.io.protobuf.MStatistics parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (demetra.x13.io.protobuf.MStatistics) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double m1_ ;
    /**
     * <code>double m1 = 1;</code>
     * @return The m1.
     */
    @java.lang.Override
    public double getM1() {
      return m1_;
    }
    /**
     * <code>double m1 = 1;</code>
     * @param value The m1 to set.
     * @return This builder for chaining.
     */
    public Builder setM1(double value) {
      
      m1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double m1 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearM1() {
      
      m1_ = 0D;
      onChanged();
      return this;
    }

    private double m2_ ;
    /**
     * <code>double m2 = 2;</code>
     * @return The m2.
     */
    @java.lang.Override
    public double getM2() {
      return m2_;
    }
    /**
     * <code>double m2 = 2;</code>
     * @param value The m2 to set.
     * @return This builder for chaining.
     */
    public Builder setM2(double value) {
      
      m2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double m2 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearM2() {
      
      m2_ = 0D;
      onChanged();
      return this;
    }

    private double m3_ ;
    /**
     * <code>double m3 = 3;</code>
     * @return The m3.
     */
    @java.lang.Override
    public double getM3() {
      return m3_;
    }
    /**
     * <code>double m3 = 3;</code>
     * @param value The m3 to set.
     * @return This builder for chaining.
     */
    public Builder setM3(double value) {
      
      m3_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double m3 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearM3() {
      
      m3_ = 0D;
      onChanged();
      return this;
    }

    private double m4_ ;
    /**
     * <code>double m4 = 4;</code>
     * @return The m4.
     */
    @java.lang.Override
    public double getM4() {
      return m4_;
    }
    /**
     * <code>double m4 = 4;</code>
     * @param value The m4 to set.
     * @return This builder for chaining.
     */
    public Builder setM4(double value) {
      
      m4_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double m4 = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearM4() {
      
      m4_ = 0D;
      onChanged();
      return this;
    }

    private double m5_ ;
    /**
     * <code>double m5 = 5;</code>
     * @return The m5.
     */
    @java.lang.Override
    public double getM5() {
      return m5_;
    }
    /**
     * <code>double m5 = 5;</code>
     * @param value The m5 to set.
     * @return This builder for chaining.
     */
    public Builder setM5(double value) {
      
      m5_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double m5 = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearM5() {
      
      m5_ = 0D;
      onChanged();
      return this;
    }

    private double m6_ ;
    /**
     * <code>double m6 = 6;</code>
     * @return The m6.
     */
    @java.lang.Override
    public double getM6() {
      return m6_;
    }
    /**
     * <code>double m6 = 6;</code>
     * @param value The m6 to set.
     * @return This builder for chaining.
     */
    public Builder setM6(double value) {
      
      m6_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double m6 = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearM6() {
      
      m6_ = 0D;
      onChanged();
      return this;
    }

    private double m7_ ;
    /**
     * <code>double m7 = 7;</code>
     * @return The m7.
     */
    @java.lang.Override
    public double getM7() {
      return m7_;
    }
    /**
     * <code>double m7 = 7;</code>
     * @param value The m7 to set.
     * @return This builder for chaining.
     */
    public Builder setM7(double value) {
      
      m7_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double m7 = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearM7() {
      
      m7_ = 0D;
      onChanged();
      return this;
    }

    private double m8_ ;
    /**
     * <code>double m8 = 8;</code>
     * @return The m8.
     */
    @java.lang.Override
    public double getM8() {
      return m8_;
    }
    /**
     * <code>double m8 = 8;</code>
     * @param value The m8 to set.
     * @return This builder for chaining.
     */
    public Builder setM8(double value) {
      
      m8_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double m8 = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearM8() {
      
      m8_ = 0D;
      onChanged();
      return this;
    }

    private double m9_ ;
    /**
     * <code>double m9 = 9;</code>
     * @return The m9.
     */
    @java.lang.Override
    public double getM9() {
      return m9_;
    }
    /**
     * <code>double m9 = 9;</code>
     * @param value The m9 to set.
     * @return This builder for chaining.
     */
    public Builder setM9(double value) {
      
      m9_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double m9 = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearM9() {
      
      m9_ = 0D;
      onChanged();
      return this;
    }

    private double m10_ ;
    /**
     * <code>double m10 = 10;</code>
     * @return The m10.
     */
    @java.lang.Override
    public double getM10() {
      return m10_;
    }
    /**
     * <code>double m10 = 10;</code>
     * @param value The m10 to set.
     * @return This builder for chaining.
     */
    public Builder setM10(double value) {
      
      m10_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double m10 = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearM10() {
      
      m10_ = 0D;
      onChanged();
      return this;
    }

    private double m11_ ;
    /**
     * <code>double m11 = 11;</code>
     * @return The m11.
     */
    @java.lang.Override
    public double getM11() {
      return m11_;
    }
    /**
     * <code>double m11 = 11;</code>
     * @param value The m11 to set.
     * @return This builder for chaining.
     */
    public Builder setM11(double value) {
      
      m11_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double m11 = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearM11() {
      
      m11_ = 0D;
      onChanged();
      return this;
    }

    private double q_ ;
    /**
     * <code>double q = 12;</code>
     * @return The q.
     */
    @java.lang.Override
    public double getQ() {
      return q_;
    }
    /**
     * <code>double q = 12;</code>
     * @param value The q to set.
     * @return This builder for chaining.
     */
    public Builder setQ(double value) {
      
      q_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double q = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearQ() {
      
      q_ = 0D;
      onChanged();
      return this;
    }

    private double qm2_ ;
    /**
     * <code>double qm2 = 13;</code>
     * @return The qm2.
     */
    @java.lang.Override
    public double getQm2() {
      return qm2_;
    }
    /**
     * <code>double qm2 = 13;</code>
     * @param value The qm2 to set.
     * @return This builder for chaining.
     */
    public Builder setQm2(double value) {
      
      qm2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double qm2 = 13;</code>
     * @return This builder for chaining.
     */
    public Builder clearQm2() {
      
      qm2_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:x13.MStatistics)
  }

  // @@protoc_insertion_point(class_scope:x13.MStatistics)
  private static final demetra.x13.io.protobuf.MStatistics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new demetra.x13.io.protobuf.MStatistics();
  }

  public static demetra.x13.io.protobuf.MStatistics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MStatistics>
      PARSER = new com.google.protobuf.AbstractParser<MStatistics>() {
    @java.lang.Override
    public MStatistics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MStatistics(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MStatistics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MStatistics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public demetra.x13.io.protobuf.MStatistics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

