// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/dataset_response.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

/**
 * Protobuf type {@code chalk.common.v1.DatasetSampleFilter}
 */
public final class DatasetSampleFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.common.v1.DatasetSampleFilter)
    DatasetSampleFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DatasetSampleFilter.newBuilder() to construct.
  private DatasetSampleFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DatasetSampleFilter() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DatasetSampleFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.common.v1.DatasetResponseProto.internal_static_chalk_common_v1_DatasetSampleFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.common.v1.DatasetResponseProto.internal_static_chalk_common_v1_DatasetSampleFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.common.v1.DatasetSampleFilter.class, ai.chalk.protos.chalk.common.v1.DatasetSampleFilter.Builder.class);
  }

  private int bitField0_;
  public static final int LOWER_BOUND_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp lowerBound_;
  /**
   * <code>optional .google.protobuf.Timestamp lower_bound = 1 [json_name = "lowerBound"];</code>
   * @return Whether the lowerBound field is set.
   */
  @java.lang.Override
  public boolean hasLowerBound() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .google.protobuf.Timestamp lower_bound = 1 [json_name = "lowerBound"];</code>
   * @return The lowerBound.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getLowerBound() {
    return lowerBound_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lowerBound_;
  }
  /**
   * <code>optional .google.protobuf.Timestamp lower_bound = 1 [json_name = "lowerBound"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getLowerBoundOrBuilder() {
    return lowerBound_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lowerBound_;
  }

  public static final int UPPER_BOUND_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp upperBound_;
  /**
   * <code>optional .google.protobuf.Timestamp upper_bound = 2 [json_name = "upperBound"];</code>
   * @return Whether the upperBound field is set.
   */
  @java.lang.Override
  public boolean hasUpperBound() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .google.protobuf.Timestamp upper_bound = 2 [json_name = "upperBound"];</code>
   * @return The upperBound.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpperBound() {
    return upperBound_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : upperBound_;
  }
  /**
   * <code>optional .google.protobuf.Timestamp upper_bound = 2 [json_name = "upperBound"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpperBoundOrBuilder() {
    return upperBound_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : upperBound_;
  }

  public static final int MAX_SAMPLES_FIELD_NUMBER = 3;
  private int maxSamples_ = 0;
  /**
   * <code>optional int32 max_samples = 3 [json_name = "maxSamples"];</code>
   * @return Whether the maxSamples field is set.
   */
  @java.lang.Override
  public boolean hasMaxSamples() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int32 max_samples = 3 [json_name = "maxSamples"];</code>
   * @return The maxSamples.
   */
  @java.lang.Override
  public int getMaxSamples() {
    return maxSamples_;
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
      output.writeMessage(1, getLowerBound());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpperBound());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, maxSamples_);
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
        .computeMessageSize(1, getLowerBound());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpperBound());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, maxSamples_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.common.v1.DatasetSampleFilter)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.common.v1.DatasetSampleFilter other = (ai.chalk.protos.chalk.common.v1.DatasetSampleFilter) obj;

    if (hasLowerBound() != other.hasLowerBound()) return false;
    if (hasLowerBound()) {
      if (!getLowerBound()
          .equals(other.getLowerBound())) return false;
    }
    if (hasUpperBound() != other.hasUpperBound()) return false;
    if (hasUpperBound()) {
      if (!getUpperBound()
          .equals(other.getUpperBound())) return false;
    }
    if (hasMaxSamples() != other.hasMaxSamples()) return false;
    if (hasMaxSamples()) {
      if (getMaxSamples()
          != other.getMaxSamples()) return false;
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
    if (hasLowerBound()) {
      hash = (37 * hash) + LOWER_BOUND_FIELD_NUMBER;
      hash = (53 * hash) + getLowerBound().hashCode();
    }
    if (hasUpperBound()) {
      hash = (37 * hash) + UPPER_BOUND_FIELD_NUMBER;
      hash = (53 * hash) + getUpperBound().hashCode();
    }
    if (hasMaxSamples()) {
      hash = (37 * hash) + MAX_SAMPLES_FIELD_NUMBER;
      hash = (53 * hash) + getMaxSamples();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.common.v1.DatasetSampleFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetSampleFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetSampleFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetSampleFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetSampleFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetSampleFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetSampleFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetSampleFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.common.v1.DatasetSampleFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.common.v1.DatasetSampleFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetSampleFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetSampleFilter parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.common.v1.DatasetSampleFilter prototype) {
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
   * Protobuf type {@code chalk.common.v1.DatasetSampleFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.common.v1.DatasetSampleFilter)
      ai.chalk.protos.chalk.common.v1.DatasetSampleFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.common.v1.DatasetResponseProto.internal_static_chalk_common_v1_DatasetSampleFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.common.v1.DatasetResponseProto.internal_static_chalk_common_v1_DatasetSampleFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.common.v1.DatasetSampleFilter.class, ai.chalk.protos.chalk.common.v1.DatasetSampleFilter.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.common.v1.DatasetSampleFilter.newBuilder()
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
        getLowerBoundFieldBuilder();
        getUpperBoundFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      lowerBound_ = null;
      if (lowerBoundBuilder_ != null) {
        lowerBoundBuilder_.dispose();
        lowerBoundBuilder_ = null;
      }
      upperBound_ = null;
      if (upperBoundBuilder_ != null) {
        upperBoundBuilder_.dispose();
        upperBoundBuilder_ = null;
      }
      maxSamples_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.common.v1.DatasetResponseProto.internal_static_chalk_common_v1_DatasetSampleFilter_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.DatasetSampleFilter getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.common.v1.DatasetSampleFilter.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.DatasetSampleFilter build() {
      ai.chalk.protos.chalk.common.v1.DatasetSampleFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.DatasetSampleFilter buildPartial() {
      ai.chalk.protos.chalk.common.v1.DatasetSampleFilter result = new ai.chalk.protos.chalk.common.v1.DatasetSampleFilter(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.common.v1.DatasetSampleFilter result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.lowerBound_ = lowerBoundBuilder_ == null
            ? lowerBound_
            : lowerBoundBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.upperBound_ = upperBoundBuilder_ == null
            ? upperBound_
            : upperBoundBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.maxSamples_ = maxSamples_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof ai.chalk.protos.chalk.common.v1.DatasetSampleFilter) {
        return mergeFrom((ai.chalk.protos.chalk.common.v1.DatasetSampleFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.common.v1.DatasetSampleFilter other) {
      if (other == ai.chalk.protos.chalk.common.v1.DatasetSampleFilter.getDefaultInstance()) return this;
      if (other.hasLowerBound()) {
        mergeLowerBound(other.getLowerBound());
      }
      if (other.hasUpperBound()) {
        mergeUpperBound(other.getUpperBound());
      }
      if (other.hasMaxSamples()) {
        setMaxSamples(other.getMaxSamples());
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
                  getLowerBoundFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpperBoundFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              maxSamples_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.google.protobuf.Timestamp lowerBound_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> lowerBoundBuilder_;
    /**
     * <code>optional .google.protobuf.Timestamp lower_bound = 1 [json_name = "lowerBound"];</code>
     * @return Whether the lowerBound field is set.
     */
    public boolean hasLowerBound() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .google.protobuf.Timestamp lower_bound = 1 [json_name = "lowerBound"];</code>
     * @return The lowerBound.
     */
    public com.google.protobuf.Timestamp getLowerBound() {
      if (lowerBoundBuilder_ == null) {
        return lowerBound_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lowerBound_;
      } else {
        return lowerBoundBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp lower_bound = 1 [json_name = "lowerBound"];</code>
     */
    public Builder setLowerBound(com.google.protobuf.Timestamp value) {
      if (lowerBoundBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lowerBound_ = value;
      } else {
        lowerBoundBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp lower_bound = 1 [json_name = "lowerBound"];</code>
     */
    public Builder setLowerBound(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (lowerBoundBuilder_ == null) {
        lowerBound_ = builderForValue.build();
      } else {
        lowerBoundBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp lower_bound = 1 [json_name = "lowerBound"];</code>
     */
    public Builder mergeLowerBound(com.google.protobuf.Timestamp value) {
      if (lowerBoundBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          lowerBound_ != null &&
          lowerBound_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getLowerBoundBuilder().mergeFrom(value);
        } else {
          lowerBound_ = value;
        }
      } else {
        lowerBoundBuilder_.mergeFrom(value);
      }
      if (lowerBound_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp lower_bound = 1 [json_name = "lowerBound"];</code>
     */
    public Builder clearLowerBound() {
      bitField0_ = (bitField0_ & ~0x00000001);
      lowerBound_ = null;
      if (lowerBoundBuilder_ != null) {
        lowerBoundBuilder_.dispose();
        lowerBoundBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp lower_bound = 1 [json_name = "lowerBound"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getLowerBoundBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLowerBoundFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.protobuf.Timestamp lower_bound = 1 [json_name = "lowerBound"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getLowerBoundOrBuilder() {
      if (lowerBoundBuilder_ != null) {
        return lowerBoundBuilder_.getMessageOrBuilder();
      } else {
        return lowerBound_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : lowerBound_;
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp lower_bound = 1 [json_name = "lowerBound"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getLowerBoundFieldBuilder() {
      if (lowerBoundBuilder_ == null) {
        lowerBoundBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getLowerBound(),
                getParentForChildren(),
                isClean());
        lowerBound_ = null;
      }
      return lowerBoundBuilder_;
    }

    private com.google.protobuf.Timestamp upperBound_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> upperBoundBuilder_;
    /**
     * <code>optional .google.protobuf.Timestamp upper_bound = 2 [json_name = "upperBound"];</code>
     * @return Whether the upperBound field is set.
     */
    public boolean hasUpperBound() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .google.protobuf.Timestamp upper_bound = 2 [json_name = "upperBound"];</code>
     * @return The upperBound.
     */
    public com.google.protobuf.Timestamp getUpperBound() {
      if (upperBoundBuilder_ == null) {
        return upperBound_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : upperBound_;
      } else {
        return upperBoundBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp upper_bound = 2 [json_name = "upperBound"];</code>
     */
    public Builder setUpperBound(com.google.protobuf.Timestamp value) {
      if (upperBoundBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        upperBound_ = value;
      } else {
        upperBoundBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp upper_bound = 2 [json_name = "upperBound"];</code>
     */
    public Builder setUpperBound(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (upperBoundBuilder_ == null) {
        upperBound_ = builderForValue.build();
      } else {
        upperBoundBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp upper_bound = 2 [json_name = "upperBound"];</code>
     */
    public Builder mergeUpperBound(com.google.protobuf.Timestamp value) {
      if (upperBoundBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          upperBound_ != null &&
          upperBound_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getUpperBoundBuilder().mergeFrom(value);
        } else {
          upperBound_ = value;
        }
      } else {
        upperBoundBuilder_.mergeFrom(value);
      }
      if (upperBound_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp upper_bound = 2 [json_name = "upperBound"];</code>
     */
    public Builder clearUpperBound() {
      bitField0_ = (bitField0_ & ~0x00000002);
      upperBound_ = null;
      if (upperBoundBuilder_ != null) {
        upperBoundBuilder_.dispose();
        upperBoundBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp upper_bound = 2 [json_name = "upperBound"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpperBoundBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpperBoundFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.protobuf.Timestamp upper_bound = 2 [json_name = "upperBound"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpperBoundOrBuilder() {
      if (upperBoundBuilder_ != null) {
        return upperBoundBuilder_.getMessageOrBuilder();
      } else {
        return upperBound_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : upperBound_;
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp upper_bound = 2 [json_name = "upperBound"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getUpperBoundFieldBuilder() {
      if (upperBoundBuilder_ == null) {
        upperBoundBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getUpperBound(),
                getParentForChildren(),
                isClean());
        upperBound_ = null;
      }
      return upperBoundBuilder_;
    }

    private int maxSamples_ ;
    /**
     * <code>optional int32 max_samples = 3 [json_name = "maxSamples"];</code>
     * @return Whether the maxSamples field is set.
     */
    @java.lang.Override
    public boolean hasMaxSamples() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 max_samples = 3 [json_name = "maxSamples"];</code>
     * @return The maxSamples.
     */
    @java.lang.Override
    public int getMaxSamples() {
      return maxSamples_;
    }
    /**
     * <code>optional int32 max_samples = 3 [json_name = "maxSamples"];</code>
     * @param value The maxSamples to set.
     * @return This builder for chaining.
     */
    public Builder setMaxSamples(int value) {

      maxSamples_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 max_samples = 3 [json_name = "maxSamples"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxSamples() {
      bitField0_ = (bitField0_ & ~0x00000004);
      maxSamples_ = 0;
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


    // @@protoc_insertion_point(builder_scope:chalk.common.v1.DatasetSampleFilter)
  }

  // @@protoc_insertion_point(class_scope:chalk.common.v1.DatasetSampleFilter)
  private static final ai.chalk.protos.chalk.common.v1.DatasetSampleFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.common.v1.DatasetSampleFilter();
  }

  public static ai.chalk.protos.chalk.common.v1.DatasetSampleFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DatasetSampleFilter>
      PARSER = new com.google.protobuf.AbstractParser<DatasetSampleFilter>() {
    @java.lang.Override
    public DatasetSampleFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<DatasetSampleFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DatasetSampleFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.DatasetSampleFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

