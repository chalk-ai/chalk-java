// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/aggregate/v1/service.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.aggregate.v1;

/**
 * Protobuf type {@code chalk.aggregate.v1.PlanAggregateBackfillRequest}
 */
public final class PlanAggregateBackfillRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.aggregate.v1.PlanAggregateBackfillRequest)
    PlanAggregateBackfillRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlanAggregateBackfillRequest.newBuilder() to construct.
  private PlanAggregateBackfillRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlanAggregateBackfillRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlanAggregateBackfillRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.aggregate.v1.ServiceProto.internal_static_chalk_aggregate_v1_PlanAggregateBackfillRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.aggregate.v1.ServiceProto.internal_static_chalk_aggregate_v1_PlanAggregateBackfillRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest.class, ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARAMS_FIELD_NUMBER = 1;
  private ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams params_;
  /**
   * <code>.chalk.aggregate.v1.AggregateBackfillUserParams params = 1 [json_name = "params"];</code>
   * @return Whether the params field is set.
   */
  @java.lang.Override
  public boolean hasParams() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.aggregate.v1.AggregateBackfillUserParams params = 1 [json_name = "params"];</code>
   * @return The params.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams getParams() {
    return params_ == null ? ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams.getDefaultInstance() : params_;
  }
  /**
   * <code>.chalk.aggregate.v1.AggregateBackfillUserParams params = 1 [json_name = "params"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParamsOrBuilder getParamsOrBuilder() {
    return params_ == null ? ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams.getDefaultInstance() : params_;
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
      output.writeMessage(1, getParams());
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
        .computeMessageSize(1, getParams());
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
    if (!(obj instanceof ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest other = (ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest) obj;

    if (hasParams() != other.hasParams()) return false;
    if (hasParams()) {
      if (!getParams()
          .equals(other.getParams())) return false;
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
    if (hasParams()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParams().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest prototype) {
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
   * Protobuf type {@code chalk.aggregate.v1.PlanAggregateBackfillRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.aggregate.v1.PlanAggregateBackfillRequest)
      ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.aggregate.v1.ServiceProto.internal_static_chalk_aggregate_v1_PlanAggregateBackfillRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.aggregate.v1.ServiceProto.internal_static_chalk_aggregate_v1_PlanAggregateBackfillRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest.class, ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest.newBuilder()
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
        getParamsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.aggregate.v1.ServiceProto.internal_static_chalk_aggregate_v1_PlanAggregateBackfillRequest_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest build() {
      ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest buildPartial() {
      ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest result = new ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.params_ = paramsBuilder_ == null
            ? params_
            : paramsBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest) {
        return mergeFrom((ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest other) {
      if (other == ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest.getDefaultInstance()) return this;
      if (other.hasParams()) {
        mergeParams(other.getParams());
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
                  getParamsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams params_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams.Builder, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParamsOrBuilder> paramsBuilder_;
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillUserParams params = 1 [json_name = "params"];</code>
     * @return Whether the params field is set.
     */
    public boolean hasParams() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillUserParams params = 1 [json_name = "params"];</code>
     * @return The params.
     */
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillUserParams params = 1 [json_name = "params"];</code>
     */
    public Builder setParams(ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        params_ = value;
      } else {
        paramsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillUserParams params = 1 [json_name = "params"];</code>
     */
    public Builder setParams(
        ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        params_ = builderForValue.build();
      } else {
        paramsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillUserParams params = 1 [json_name = "params"];</code>
     */
    public Builder mergeParams(ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams value) {
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          params_ != null &&
          params_ != ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams.getDefaultInstance()) {
          getParamsBuilder().mergeFrom(value);
        } else {
          params_ = value;
        }
      } else {
        paramsBuilder_.mergeFrom(value);
      }
      if (params_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillUserParams params = 1 [json_name = "params"];</code>
     */
    public Builder clearParams() {
      bitField0_ = (bitField0_ & ~0x00000001);
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillUserParams params = 1 [json_name = "params"];</code>
     */
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams.Builder getParamsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillUserParams params = 1 [json_name = "params"];</code>
     */
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParamsOrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ?
            ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams.getDefaultInstance() : params_;
      }
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillUserParams params = 1 [json_name = "params"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams.Builder, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParamsOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams.Builder, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParamsOrBuilder>(
                getParams(),
                getParentForChildren(),
                isClean());
        params_ = null;
      }
      return paramsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.aggregate.v1.PlanAggregateBackfillRequest)
  }

  // @@protoc_insertion_point(class_scope:chalk.aggregate.v1.PlanAggregateBackfillRequest)
  private static final ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest();
  }

  public static ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlanAggregateBackfillRequest>
      PARSER = new com.google.protobuf.AbstractParser<PlanAggregateBackfillRequest>() {
    @java.lang.Override
    public PlanAggregateBackfillRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlanAggregateBackfillRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlanAggregateBackfillRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

