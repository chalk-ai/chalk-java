// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/kubernetes/v1/persistentvolume.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.kubernetes.v1;

/**
 * Protobuf type {@code chalk.kubernetes.v1.ChalkKubernetesPersistentVolume}
 */
public final class ChalkKubernetesPersistentVolume extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.kubernetes.v1.ChalkKubernetesPersistentVolume)
    ChalkKubernetesPersistentVolumeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChalkKubernetesPersistentVolume.newBuilder() to construct.
  private ChalkKubernetesPersistentVolume(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChalkKubernetesPersistentVolume() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChalkKubernetesPersistentVolume();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.kubernetes.v1.PersistentvolumeProto.internal_static_chalk_kubernetes_v1_ChalkKubernetesPersistentVolume_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.kubernetes.v1.PersistentvolumeProto.internal_static_chalk_kubernetes_v1_ChalkKubernetesPersistentVolume_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume.class, ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume.Builder.class);
  }

  private int bitField0_;
  public static final int SPEC_FIELD_NUMBER = 1;
  private ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec spec_;
  /**
   * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec spec = 1 [json_name = "spec"];</code>
   * @return Whether the spec field is set.
   */
  @java.lang.Override
  public boolean hasSpec() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec spec = 1 [json_name = "spec"];</code>
   * @return The spec.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec getSpec() {
    return spec_ == null ? ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec.getDefaultInstance() : spec_;
  }
  /**
   * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec spec = 1 [json_name = "spec"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpecOrBuilder getSpecOrBuilder() {
    return spec_ == null ? ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec.getDefaultInstance() : spec_;
  }

  public static final int METRICS_FIELD_NUMBER = 2;
  private ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics metrics_;
  /**
   * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics metrics = 2 [json_name = "metrics"];</code>
   * @return Whether the metrics field is set.
   */
  @java.lang.Override
  public boolean hasMetrics() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics metrics = 2 [json_name = "metrics"];</code>
   * @return The metrics.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics getMetrics() {
    return metrics_ == null ? ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics.getDefaultInstance() : metrics_;
  }
  /**
   * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics metrics = 2 [json_name = "metrics"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetricsOrBuilder getMetricsOrBuilder() {
    return metrics_ == null ? ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics.getDefaultInstance() : metrics_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getSpec());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getMetrics());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSpec());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMetrics());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume other = (ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume) obj;

    if (hasSpec() != other.hasSpec()) return false;
    if (hasSpec()) {
      if (!getSpec()
          .equals(other.getSpec())) return false;
    }
    if (hasMetrics() != other.hasMetrics()) return false;
    if (hasMetrics()) {
      if (!getMetrics()
          .equals(other.getMetrics())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasSpec()) {
      hash = (37 * hash) + SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getSpec().hashCode();
    }
    if (hasMetrics()) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getMetrics().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume prototype) {
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
   * Protobuf type {@code chalk.kubernetes.v1.ChalkKubernetesPersistentVolume}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.kubernetes.v1.ChalkKubernetesPersistentVolume)
      ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.kubernetes.v1.PersistentvolumeProto.internal_static_chalk_kubernetes_v1_ChalkKubernetesPersistentVolume_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.kubernetes.v1.PersistentvolumeProto.internal_static_chalk_kubernetes_v1_ChalkKubernetesPersistentVolume_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume.class, ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume.newBuilder()
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
        getSpecFieldBuilder();
        getMetricsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      spec_ = null;
      if (specBuilder_ != null) {
        specBuilder_.dispose();
        specBuilder_ = null;
      }
      metrics_ = null;
      if (metricsBuilder_ != null) {
        metricsBuilder_.dispose();
        metricsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.kubernetes.v1.PersistentvolumeProto.internal_static_chalk_kubernetes_v1_ChalkKubernetesPersistentVolume_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume build() {
      ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume buildPartial() {
      ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume result = new ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.spec_ = specBuilder_ == null
            ? spec_
            : specBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metrics_ = metricsBuilder_ == null
            ? metrics_
            : metricsBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume) {
        return mergeFrom((ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume other) {
      if (other == ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume.getDefaultInstance()) return this;
      if (other.hasSpec()) {
        mergeSpec(other.getSpec());
      }
      if (other.hasMetrics()) {
        mergeMetrics(other.getMetrics());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getSpecFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMetricsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec spec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec, ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec.Builder, ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpecOrBuilder> specBuilder_;
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec spec = 1 [json_name = "spec"];</code>
     * @return Whether the spec field is set.
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec spec = 1 [json_name = "spec"];</code>
     * @return The spec.
     */
    public ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec getSpec() {
      if (specBuilder_ == null) {
        return spec_ == null ? ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec.getDefaultInstance() : spec_;
      } else {
        return specBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec spec = 1 [json_name = "spec"];</code>
     */
    public Builder setSpec(ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec value) {
      if (specBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        spec_ = value;
      } else {
        specBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec spec = 1 [json_name = "spec"];</code>
     */
    public Builder setSpec(
        ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec.Builder builderForValue) {
      if (specBuilder_ == null) {
        spec_ = builderForValue.build();
      } else {
        specBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec spec = 1 [json_name = "spec"];</code>
     */
    public Builder mergeSpec(ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec value) {
      if (specBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          spec_ != null &&
          spec_ != ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec.getDefaultInstance()) {
          getSpecBuilder().mergeFrom(value);
        } else {
          spec_ = value;
        }
      } else {
        specBuilder_.mergeFrom(value);
      }
      if (spec_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec spec = 1 [json_name = "spec"];</code>
     */
    public Builder clearSpec() {
      bitField0_ = (bitField0_ & ~0x00000001);
      spec_ = null;
      if (specBuilder_ != null) {
        specBuilder_.dispose();
        specBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec spec = 1 [json_name = "spec"];</code>
     */
    public ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec.Builder getSpecBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSpecFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec spec = 1 [json_name = "spec"];</code>
     */
    public ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpecOrBuilder getSpecOrBuilder() {
      if (specBuilder_ != null) {
        return specBuilder_.getMessageOrBuilder();
      } else {
        return spec_ == null ?
            ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec.getDefaultInstance() : spec_;
      }
    }
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec spec = 1 [json_name = "spec"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec, ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec.Builder, ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpecOrBuilder> 
        getSpecFieldBuilder() {
      if (specBuilder_ == null) {
        specBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec, ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpec.Builder, ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeSpecOrBuilder>(
                getSpec(),
                getParentForChildren(),
                isClean());
        spec_ = null;
      }
      return specBuilder_;
    }

    private ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics metrics_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics, ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics.Builder, ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetricsOrBuilder> metricsBuilder_;
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics metrics = 2 [json_name = "metrics"];</code>
     * @return Whether the metrics field is set.
     */
    public boolean hasMetrics() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics metrics = 2 [json_name = "metrics"];</code>
     * @return The metrics.
     */
    public ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics getMetrics() {
      if (metricsBuilder_ == null) {
        return metrics_ == null ? ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics.getDefaultInstance() : metrics_;
      } else {
        return metricsBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics metrics = 2 [json_name = "metrics"];</code>
     */
    public Builder setMetrics(ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metrics_ = value;
      } else {
        metricsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics metrics = 2 [json_name = "metrics"];</code>
     */
    public Builder setMetrics(
        ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        metrics_ = builderForValue.build();
      } else {
        metricsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics metrics = 2 [json_name = "metrics"];</code>
     */
    public Builder mergeMetrics(ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics value) {
      if (metricsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          metrics_ != null &&
          metrics_ != ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics.getDefaultInstance()) {
          getMetricsBuilder().mergeFrom(value);
        } else {
          metrics_ = value;
        }
      } else {
        metricsBuilder_.mergeFrom(value);
      }
      if (metrics_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics metrics = 2 [json_name = "metrics"];</code>
     */
    public Builder clearMetrics() {
      bitField0_ = (bitField0_ & ~0x00000002);
      metrics_ = null;
      if (metricsBuilder_ != null) {
        metricsBuilder_.dispose();
        metricsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics metrics = 2 [json_name = "metrics"];</code>
     */
    public ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics.Builder getMetricsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMetricsFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics metrics = 2 [json_name = "metrics"];</code>
     */
    public ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetricsOrBuilder getMetricsOrBuilder() {
      if (metricsBuilder_ != null) {
        return metricsBuilder_.getMessageOrBuilder();
      } else {
        return metrics_ == null ?
            ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics.getDefaultInstance() : metrics_;
      }
    }
    /**
     * <code>.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics metrics = 2 [json_name = "metrics"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics, ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics.Builder, ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetricsOrBuilder> 
        getMetricsFieldBuilder() {
      if (metricsBuilder_ == null) {
        metricsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics, ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetrics.Builder, ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolumeMetricsOrBuilder>(
                getMetrics(),
                getParentForChildren(),
                isClean());
        metrics_ = null;
      }
      return metricsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.kubernetes.v1.ChalkKubernetesPersistentVolume)
  }

  // @@protoc_insertion_point(class_scope:chalk.kubernetes.v1.ChalkKubernetesPersistentVolume)
  private static final ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume();
  }

  public static ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChalkKubernetesPersistentVolume>
      PARSER = new com.google.protobuf.AbstractParser<ChalkKubernetesPersistentVolume>() {
    @java.lang.Override
    public ChalkKubernetesPersistentVolume parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ChalkKubernetesPersistentVolume> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChalkKubernetesPersistentVolume> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.kubernetes.v1.ChalkKubernetesPersistentVolume getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

