// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.graph.v1;

/**
 * Protobuf type {@code chalk.graph.v1.WindowInfo}
 */
public final class WindowInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.graph.v1.WindowInfo)
    WindowInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WindowInfo.newBuilder() to construct.
  private WindowInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WindowInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WindowInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_WindowInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_WindowInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.graph.v1.WindowInfo.class, ai.chalk.protos.chalk.graph.v1.WindowInfo.Builder.class);
  }

  private int bitField0_;
  public static final int DURATION_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration duration_;
  /**
   * <code>.google.protobuf.Duration duration = 1 [json_name = "duration"];</code>
   * @return Whether the duration field is set.
   */
  @java.lang.Override
  public boolean hasDuration() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.Duration duration = 1 [json_name = "duration"];</code>
   * @return The duration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getDuration() {
    return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
  }
  /**
   * <code>.google.protobuf.Duration duration = 1 [json_name = "duration"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
    return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
  }

  public static final int AGGREGATION_FIELD_NUMBER = 2;
  private ai.chalk.protos.chalk.graph.v1.WindowAggregation aggregation_;
  /**
   * <code>optional .chalk.graph.v1.WindowAggregation aggregation = 2 [json_name = "aggregation"];</code>
   * @return Whether the aggregation field is set.
   */
  @java.lang.Override
  public boolean hasAggregation() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .chalk.graph.v1.WindowAggregation aggregation = 2 [json_name = "aggregation"];</code>
   * @return The aggregation.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.WindowAggregation getAggregation() {
    return aggregation_ == null ? ai.chalk.protos.chalk.graph.v1.WindowAggregation.getDefaultInstance() : aggregation_;
  }
  /**
   * <code>optional .chalk.graph.v1.WindowAggregation aggregation = 2 [json_name = "aggregation"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.WindowAggregationOrBuilder getAggregationOrBuilder() {
    return aggregation_ == null ? ai.chalk.protos.chalk.graph.v1.WindowAggregation.getDefaultInstance() : aggregation_;
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
      output.writeMessage(1, getDuration());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getAggregation());
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
        .computeMessageSize(1, getDuration());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAggregation());
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
    if (!(obj instanceof ai.chalk.protos.chalk.graph.v1.WindowInfo)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.graph.v1.WindowInfo other = (ai.chalk.protos.chalk.graph.v1.WindowInfo) obj;

    if (hasDuration() != other.hasDuration()) return false;
    if (hasDuration()) {
      if (!getDuration()
          .equals(other.getDuration())) return false;
    }
    if (hasAggregation() != other.hasAggregation()) return false;
    if (hasAggregation()) {
      if (!getAggregation()
          .equals(other.getAggregation())) return false;
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
    if (hasDuration()) {
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getDuration().hashCode();
    }
    if (hasAggregation()) {
      hash = (37 * hash) + AGGREGATION_FIELD_NUMBER;
      hash = (53 * hash) + getAggregation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.graph.v1.WindowInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.WindowInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.WindowInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.WindowInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.WindowInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.WindowInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.WindowInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.graph.v1.WindowInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.graph.v1.WindowInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.graph.v1.WindowInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.WindowInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.graph.v1.WindowInfo parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.graph.v1.WindowInfo prototype) {
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
   * Protobuf type {@code chalk.graph.v1.WindowInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.graph.v1.WindowInfo)
      ai.chalk.protos.chalk.graph.v1.WindowInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_WindowInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_WindowInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.graph.v1.WindowInfo.class, ai.chalk.protos.chalk.graph.v1.WindowInfo.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.graph.v1.WindowInfo.newBuilder()
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
        getDurationFieldBuilder();
        getAggregationFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      duration_ = null;
      if (durationBuilder_ != null) {
        durationBuilder_.dispose();
        durationBuilder_ = null;
      }
      aggregation_ = null;
      if (aggregationBuilder_ != null) {
        aggregationBuilder_.dispose();
        aggregationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_WindowInfo_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.WindowInfo getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.graph.v1.WindowInfo.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.WindowInfo build() {
      ai.chalk.protos.chalk.graph.v1.WindowInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.WindowInfo buildPartial() {
      ai.chalk.protos.chalk.graph.v1.WindowInfo result = new ai.chalk.protos.chalk.graph.v1.WindowInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.graph.v1.WindowInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.duration_ = durationBuilder_ == null
            ? duration_
            : durationBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.aggregation_ = aggregationBuilder_ == null
            ? aggregation_
            : aggregationBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.graph.v1.WindowInfo) {
        return mergeFrom((ai.chalk.protos.chalk.graph.v1.WindowInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.graph.v1.WindowInfo other) {
      if (other == ai.chalk.protos.chalk.graph.v1.WindowInfo.getDefaultInstance()) return this;
      if (other.hasDuration()) {
        mergeDuration(other.getDuration());
      }
      if (other.hasAggregation()) {
        mergeAggregation(other.getAggregation());
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
                  getDurationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAggregationFieldBuilder().getBuilder(),
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

    private com.google.protobuf.Duration duration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> durationBuilder_;
    /**
     * <code>.google.protobuf.Duration duration = 1 [json_name = "duration"];</code>
     * @return Whether the duration field is set.
     */
    public boolean hasDuration() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.Duration duration = 1 [json_name = "duration"];</code>
     * @return The duration.
     */
    public com.google.protobuf.Duration getDuration() {
      if (durationBuilder_ == null) {
        return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
      } else {
        return durationBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Duration duration = 1 [json_name = "duration"];</code>
     */
    public Builder setDuration(com.google.protobuf.Duration value) {
      if (durationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        duration_ = value;
      } else {
        durationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration duration = 1 [json_name = "duration"];</code>
     */
    public Builder setDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (durationBuilder_ == null) {
        duration_ = builderForValue.build();
      } else {
        durationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration duration = 1 [json_name = "duration"];</code>
     */
    public Builder mergeDuration(com.google.protobuf.Duration value) {
      if (durationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          duration_ != null &&
          duration_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getDurationBuilder().mergeFrom(value);
        } else {
          duration_ = value;
        }
      } else {
        durationBuilder_.mergeFrom(value);
      }
      if (duration_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Duration duration = 1 [json_name = "duration"];</code>
     */
    public Builder clearDuration() {
      bitField0_ = (bitField0_ & ~0x00000001);
      duration_ = null;
      if (durationBuilder_ != null) {
        durationBuilder_.dispose();
        durationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration duration = 1 [json_name = "duration"];</code>
     */
    public com.google.protobuf.Duration.Builder getDurationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDurationFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Duration duration = 1 [json_name = "duration"];</code>
     */
    public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
      if (durationBuilder_ != null) {
        return durationBuilder_.getMessageOrBuilder();
      } else {
        return duration_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : duration_;
      }
    }
    /**
     * <code>.google.protobuf.Duration duration = 1 [json_name = "duration"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getDurationFieldBuilder() {
      if (durationBuilder_ == null) {
        durationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getDuration(),
                getParentForChildren(),
                isClean());
        duration_ = null;
      }
      return durationBuilder_;
    }

    private ai.chalk.protos.chalk.graph.v1.WindowAggregation aggregation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.graph.v1.WindowAggregation, ai.chalk.protos.chalk.graph.v1.WindowAggregation.Builder, ai.chalk.protos.chalk.graph.v1.WindowAggregationOrBuilder> aggregationBuilder_;
    /**
     * <code>optional .chalk.graph.v1.WindowAggregation aggregation = 2 [json_name = "aggregation"];</code>
     * @return Whether the aggregation field is set.
     */
    public boolean hasAggregation() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .chalk.graph.v1.WindowAggregation aggregation = 2 [json_name = "aggregation"];</code>
     * @return The aggregation.
     */
    public ai.chalk.protos.chalk.graph.v1.WindowAggregation getAggregation() {
      if (aggregationBuilder_ == null) {
        return aggregation_ == null ? ai.chalk.protos.chalk.graph.v1.WindowAggregation.getDefaultInstance() : aggregation_;
      } else {
        return aggregationBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .chalk.graph.v1.WindowAggregation aggregation = 2 [json_name = "aggregation"];</code>
     */
    public Builder setAggregation(ai.chalk.protos.chalk.graph.v1.WindowAggregation value) {
      if (aggregationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        aggregation_ = value;
      } else {
        aggregationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .chalk.graph.v1.WindowAggregation aggregation = 2 [json_name = "aggregation"];</code>
     */
    public Builder setAggregation(
        ai.chalk.protos.chalk.graph.v1.WindowAggregation.Builder builderForValue) {
      if (aggregationBuilder_ == null) {
        aggregation_ = builderForValue.build();
      } else {
        aggregationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .chalk.graph.v1.WindowAggregation aggregation = 2 [json_name = "aggregation"];</code>
     */
    public Builder mergeAggregation(ai.chalk.protos.chalk.graph.v1.WindowAggregation value) {
      if (aggregationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          aggregation_ != null &&
          aggregation_ != ai.chalk.protos.chalk.graph.v1.WindowAggregation.getDefaultInstance()) {
          getAggregationBuilder().mergeFrom(value);
        } else {
          aggregation_ = value;
        }
      } else {
        aggregationBuilder_.mergeFrom(value);
      }
      if (aggregation_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional .chalk.graph.v1.WindowAggregation aggregation = 2 [json_name = "aggregation"];</code>
     */
    public Builder clearAggregation() {
      bitField0_ = (bitField0_ & ~0x00000002);
      aggregation_ = null;
      if (aggregationBuilder_ != null) {
        aggregationBuilder_.dispose();
        aggregationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .chalk.graph.v1.WindowAggregation aggregation = 2 [json_name = "aggregation"];</code>
     */
    public ai.chalk.protos.chalk.graph.v1.WindowAggregation.Builder getAggregationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAggregationFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .chalk.graph.v1.WindowAggregation aggregation = 2 [json_name = "aggregation"];</code>
     */
    public ai.chalk.protos.chalk.graph.v1.WindowAggregationOrBuilder getAggregationOrBuilder() {
      if (aggregationBuilder_ != null) {
        return aggregationBuilder_.getMessageOrBuilder();
      } else {
        return aggregation_ == null ?
            ai.chalk.protos.chalk.graph.v1.WindowAggregation.getDefaultInstance() : aggregation_;
      }
    }
    /**
     * <code>optional .chalk.graph.v1.WindowAggregation aggregation = 2 [json_name = "aggregation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.graph.v1.WindowAggregation, ai.chalk.protos.chalk.graph.v1.WindowAggregation.Builder, ai.chalk.protos.chalk.graph.v1.WindowAggregationOrBuilder> 
        getAggregationFieldBuilder() {
      if (aggregationBuilder_ == null) {
        aggregationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.graph.v1.WindowAggregation, ai.chalk.protos.chalk.graph.v1.WindowAggregation.Builder, ai.chalk.protos.chalk.graph.v1.WindowAggregationOrBuilder>(
                getAggregation(),
                getParentForChildren(),
                isClean());
        aggregation_ = null;
      }
      return aggregationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.graph.v1.WindowInfo)
  }

  // @@protoc_insertion_point(class_scope:chalk.graph.v1.WindowInfo)
  private static final ai.chalk.protos.chalk.graph.v1.WindowInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.graph.v1.WindowInfo();
  }

  public static ai.chalk.protos.chalk.graph.v1.WindowInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WindowInfo>
      PARSER = new com.google.protobuf.AbstractParser<WindowInfo>() {
    @java.lang.Override
    public WindowInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<WindowInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WindowInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.WindowInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

