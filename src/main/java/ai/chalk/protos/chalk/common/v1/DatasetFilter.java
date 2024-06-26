// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/dataset_response.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

/**
 * Protobuf type {@code chalk.common.v1.DatasetFilter}
 */
public final class DatasetFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.common.v1.DatasetFilter)
    DatasetFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DatasetFilter.newBuilder() to construct.
  private DatasetFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DatasetFilter() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DatasetFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.common.v1.DatasetResponseProto.internal_static_chalk_common_v1_DatasetFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.common.v1.DatasetResponseProto.internal_static_chalk_common_v1_DatasetFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.common.v1.DatasetFilter.class, ai.chalk.protos.chalk.common.v1.DatasetFilter.Builder.class);
  }

  private int bitField0_;
  public static final int SAMPLE_FILTERS_FIELD_NUMBER = 1;
  private ai.chalk.protos.chalk.common.v1.DatasetSampleFilter sampleFilters_;
  /**
   * <code>.chalk.common.v1.DatasetSampleFilter sample_filters = 1 [json_name = "sampleFilters"];</code>
   * @return Whether the sampleFilters field is set.
   */
  @java.lang.Override
  public boolean hasSampleFilters() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.common.v1.DatasetSampleFilter sample_filters = 1 [json_name = "sampleFilters"];</code>
   * @return The sampleFilters.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.DatasetSampleFilter getSampleFilters() {
    return sampleFilters_ == null ? ai.chalk.protos.chalk.common.v1.DatasetSampleFilter.getDefaultInstance() : sampleFilters_;
  }
  /**
   * <code>.chalk.common.v1.DatasetSampleFilter sample_filters = 1 [json_name = "sampleFilters"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.DatasetSampleFilterOrBuilder getSampleFiltersOrBuilder() {
    return sampleFilters_ == null ? ai.chalk.protos.chalk.common.v1.DatasetSampleFilter.getDefaultInstance() : sampleFilters_;
  }

  public static final int MAX_CACHE_AGE_SECS_FIELD_NUMBER = 2;
  private float maxCacheAgeSecs_ = 0F;
  /**
   * <code>optional float max_cache_age_secs = 2 [json_name = "maxCacheAgeSecs"];</code>
   * @return Whether the maxCacheAgeSecs field is set.
   */
  @java.lang.Override
  public boolean hasMaxCacheAgeSecs() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional float max_cache_age_secs = 2 [json_name = "maxCacheAgeSecs"];</code>
   * @return The maxCacheAgeSecs.
   */
  @java.lang.Override
  public float getMaxCacheAgeSecs() {
    return maxCacheAgeSecs_;
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
      output.writeMessage(1, getSampleFilters());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeFloat(2, maxCacheAgeSecs_);
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
        .computeMessageSize(1, getSampleFilters());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, maxCacheAgeSecs_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.common.v1.DatasetFilter)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.common.v1.DatasetFilter other = (ai.chalk.protos.chalk.common.v1.DatasetFilter) obj;

    if (hasSampleFilters() != other.hasSampleFilters()) return false;
    if (hasSampleFilters()) {
      if (!getSampleFilters()
          .equals(other.getSampleFilters())) return false;
    }
    if (hasMaxCacheAgeSecs() != other.hasMaxCacheAgeSecs()) return false;
    if (hasMaxCacheAgeSecs()) {
      if (java.lang.Float.floatToIntBits(getMaxCacheAgeSecs())
          != java.lang.Float.floatToIntBits(
              other.getMaxCacheAgeSecs())) return false;
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
    if (hasSampleFilters()) {
      hash = (37 * hash) + SAMPLE_FILTERS_FIELD_NUMBER;
      hash = (53 * hash) + getSampleFilters().hashCode();
    }
    if (hasMaxCacheAgeSecs()) {
      hash = (37 * hash) + MAX_CACHE_AGE_SECS_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getMaxCacheAgeSecs());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.common.v1.DatasetFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.common.v1.DatasetFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.common.v1.DatasetFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.DatasetFilter parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.common.v1.DatasetFilter prototype) {
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
   * Protobuf type {@code chalk.common.v1.DatasetFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.common.v1.DatasetFilter)
      ai.chalk.protos.chalk.common.v1.DatasetFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.common.v1.DatasetResponseProto.internal_static_chalk_common_v1_DatasetFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.common.v1.DatasetResponseProto.internal_static_chalk_common_v1_DatasetFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.common.v1.DatasetFilter.class, ai.chalk.protos.chalk.common.v1.DatasetFilter.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.common.v1.DatasetFilter.newBuilder()
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
        getSampleFiltersFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sampleFilters_ = null;
      if (sampleFiltersBuilder_ != null) {
        sampleFiltersBuilder_.dispose();
        sampleFiltersBuilder_ = null;
      }
      maxCacheAgeSecs_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.common.v1.DatasetResponseProto.internal_static_chalk_common_v1_DatasetFilter_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.DatasetFilter getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.common.v1.DatasetFilter.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.DatasetFilter build() {
      ai.chalk.protos.chalk.common.v1.DatasetFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.DatasetFilter buildPartial() {
      ai.chalk.protos.chalk.common.v1.DatasetFilter result = new ai.chalk.protos.chalk.common.v1.DatasetFilter(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.common.v1.DatasetFilter result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sampleFilters_ = sampleFiltersBuilder_ == null
            ? sampleFilters_
            : sampleFiltersBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxCacheAgeSecs_ = maxCacheAgeSecs_;
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
      if (other instanceof ai.chalk.protos.chalk.common.v1.DatasetFilter) {
        return mergeFrom((ai.chalk.protos.chalk.common.v1.DatasetFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.common.v1.DatasetFilter other) {
      if (other == ai.chalk.protos.chalk.common.v1.DatasetFilter.getDefaultInstance()) return this;
      if (other.hasSampleFilters()) {
        mergeSampleFilters(other.getSampleFilters());
      }
      if (other.hasMaxCacheAgeSecs()) {
        setMaxCacheAgeSecs(other.getMaxCacheAgeSecs());
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
                  getSampleFiltersFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 21: {
              maxCacheAgeSecs_ = input.readFloat();
              bitField0_ |= 0x00000002;
              break;
            } // case 21
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

    private ai.chalk.protos.chalk.common.v1.DatasetSampleFilter sampleFilters_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.common.v1.DatasetSampleFilter, ai.chalk.protos.chalk.common.v1.DatasetSampleFilter.Builder, ai.chalk.protos.chalk.common.v1.DatasetSampleFilterOrBuilder> sampleFiltersBuilder_;
    /**
     * <code>.chalk.common.v1.DatasetSampleFilter sample_filters = 1 [json_name = "sampleFilters"];</code>
     * @return Whether the sampleFilters field is set.
     */
    public boolean hasSampleFilters() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.chalk.common.v1.DatasetSampleFilter sample_filters = 1 [json_name = "sampleFilters"];</code>
     * @return The sampleFilters.
     */
    public ai.chalk.protos.chalk.common.v1.DatasetSampleFilter getSampleFilters() {
      if (sampleFiltersBuilder_ == null) {
        return sampleFilters_ == null ? ai.chalk.protos.chalk.common.v1.DatasetSampleFilter.getDefaultInstance() : sampleFilters_;
      } else {
        return sampleFiltersBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.common.v1.DatasetSampleFilter sample_filters = 1 [json_name = "sampleFilters"];</code>
     */
    public Builder setSampleFilters(ai.chalk.protos.chalk.common.v1.DatasetSampleFilter value) {
      if (sampleFiltersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sampleFilters_ = value;
      } else {
        sampleFiltersBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.common.v1.DatasetSampleFilter sample_filters = 1 [json_name = "sampleFilters"];</code>
     */
    public Builder setSampleFilters(
        ai.chalk.protos.chalk.common.v1.DatasetSampleFilter.Builder builderForValue) {
      if (sampleFiltersBuilder_ == null) {
        sampleFilters_ = builderForValue.build();
      } else {
        sampleFiltersBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.common.v1.DatasetSampleFilter sample_filters = 1 [json_name = "sampleFilters"];</code>
     */
    public Builder mergeSampleFilters(ai.chalk.protos.chalk.common.v1.DatasetSampleFilter value) {
      if (sampleFiltersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          sampleFilters_ != null &&
          sampleFilters_ != ai.chalk.protos.chalk.common.v1.DatasetSampleFilter.getDefaultInstance()) {
          getSampleFiltersBuilder().mergeFrom(value);
        } else {
          sampleFilters_ = value;
        }
      } else {
        sampleFiltersBuilder_.mergeFrom(value);
      }
      if (sampleFilters_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.common.v1.DatasetSampleFilter sample_filters = 1 [json_name = "sampleFilters"];</code>
     */
    public Builder clearSampleFilters() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sampleFilters_ = null;
      if (sampleFiltersBuilder_ != null) {
        sampleFiltersBuilder_.dispose();
        sampleFiltersBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.common.v1.DatasetSampleFilter sample_filters = 1 [json_name = "sampleFilters"];</code>
     */
    public ai.chalk.protos.chalk.common.v1.DatasetSampleFilter.Builder getSampleFiltersBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSampleFiltersFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.common.v1.DatasetSampleFilter sample_filters = 1 [json_name = "sampleFilters"];</code>
     */
    public ai.chalk.protos.chalk.common.v1.DatasetSampleFilterOrBuilder getSampleFiltersOrBuilder() {
      if (sampleFiltersBuilder_ != null) {
        return sampleFiltersBuilder_.getMessageOrBuilder();
      } else {
        return sampleFilters_ == null ?
            ai.chalk.protos.chalk.common.v1.DatasetSampleFilter.getDefaultInstance() : sampleFilters_;
      }
    }
    /**
     * <code>.chalk.common.v1.DatasetSampleFilter sample_filters = 1 [json_name = "sampleFilters"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.common.v1.DatasetSampleFilter, ai.chalk.protos.chalk.common.v1.DatasetSampleFilter.Builder, ai.chalk.protos.chalk.common.v1.DatasetSampleFilterOrBuilder> 
        getSampleFiltersFieldBuilder() {
      if (sampleFiltersBuilder_ == null) {
        sampleFiltersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.common.v1.DatasetSampleFilter, ai.chalk.protos.chalk.common.v1.DatasetSampleFilter.Builder, ai.chalk.protos.chalk.common.v1.DatasetSampleFilterOrBuilder>(
                getSampleFilters(),
                getParentForChildren(),
                isClean());
        sampleFilters_ = null;
      }
      return sampleFiltersBuilder_;
    }

    private float maxCacheAgeSecs_ ;
    /**
     * <code>optional float max_cache_age_secs = 2 [json_name = "maxCacheAgeSecs"];</code>
     * @return Whether the maxCacheAgeSecs field is set.
     */
    @java.lang.Override
    public boolean hasMaxCacheAgeSecs() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional float max_cache_age_secs = 2 [json_name = "maxCacheAgeSecs"];</code>
     * @return The maxCacheAgeSecs.
     */
    @java.lang.Override
    public float getMaxCacheAgeSecs() {
      return maxCacheAgeSecs_;
    }
    /**
     * <code>optional float max_cache_age_secs = 2 [json_name = "maxCacheAgeSecs"];</code>
     * @param value The maxCacheAgeSecs to set.
     * @return This builder for chaining.
     */
    public Builder setMaxCacheAgeSecs(float value) {

      maxCacheAgeSecs_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional float max_cache_age_secs = 2 [json_name = "maxCacheAgeSecs"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxCacheAgeSecs() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxCacheAgeSecs_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:chalk.common.v1.DatasetFilter)
  }

  // @@protoc_insertion_point(class_scope:chalk.common.v1.DatasetFilter)
  private static final ai.chalk.protos.chalk.common.v1.DatasetFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.common.v1.DatasetFilter();
  }

  public static ai.chalk.protos.chalk.common.v1.DatasetFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DatasetFilter>
      PARSER = new com.google.protobuf.AbstractParser<DatasetFilter>() {
    @java.lang.Override
    public DatasetFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<DatasetFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DatasetFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.DatasetFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

