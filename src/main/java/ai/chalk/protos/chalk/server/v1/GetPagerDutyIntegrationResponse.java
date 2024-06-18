// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/monitoring.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.GetPagerDutyIntegrationResponse}
 */
public final class GetPagerDutyIntegrationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.GetPagerDutyIntegrationResponse)
    GetPagerDutyIntegrationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPagerDutyIntegrationResponse.newBuilder() to construct.
  private GetPagerDutyIntegrationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPagerDutyIntegrationResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPagerDutyIntegrationResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.MonitoringProto.internal_static_chalk_server_v1_GetPagerDutyIntegrationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.MonitoringProto.internal_static_chalk_server_v1_GetPagerDutyIntegrationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse.class, ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse.Builder.class);
  }

  private int bitField0_;
  public static final int INTEGRATION_FIELD_NUMBER = 1;
  private ai.chalk.protos.chalk.server.v1.PagerDutyIntegration integration_;
  /**
   * <code>.chalk.server.v1.PagerDutyIntegration integration = 1 [json_name = "integration"];</code>
   * @return Whether the integration field is set.
   */
  @java.lang.Override
  public boolean hasIntegration() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.server.v1.PagerDutyIntegration integration = 1 [json_name = "integration"];</code>
   * @return The integration.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.PagerDutyIntegration getIntegration() {
    return integration_ == null ? ai.chalk.protos.chalk.server.v1.PagerDutyIntegration.getDefaultInstance() : integration_;
  }
  /**
   * <code>.chalk.server.v1.PagerDutyIntegration integration = 1 [json_name = "integration"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.PagerDutyIntegrationOrBuilder getIntegrationOrBuilder() {
    return integration_ == null ? ai.chalk.protos.chalk.server.v1.PagerDutyIntegration.getDefaultInstance() : integration_;
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
      output.writeMessage(1, getIntegration());
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
        .computeMessageSize(1, getIntegration());
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse other = (ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse) obj;

    if (hasIntegration() != other.hasIntegration()) return false;
    if (hasIntegration()) {
      if (!getIntegration()
          .equals(other.getIntegration())) return false;
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
    if (hasIntegration()) {
      hash = (37 * hash) + INTEGRATION_FIELD_NUMBER;
      hash = (53 * hash) + getIntegration().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse prototype) {
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
   * Protobuf type {@code chalk.server.v1.GetPagerDutyIntegrationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.GetPagerDutyIntegrationResponse)
      ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.MonitoringProto.internal_static_chalk_server_v1_GetPagerDutyIntegrationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.MonitoringProto.internal_static_chalk_server_v1_GetPagerDutyIntegrationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse.class, ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse.newBuilder()
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
        getIntegrationFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      integration_ = null;
      if (integrationBuilder_ != null) {
        integrationBuilder_.dispose();
        integrationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.MonitoringProto.internal_static_chalk_server_v1_GetPagerDutyIntegrationResponse_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse build() {
      ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse buildPartial() {
      ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse result = new ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.integration_ = integrationBuilder_ == null
            ? integration_
            : integrationBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse other) {
      if (other == ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse.getDefaultInstance()) return this;
      if (other.hasIntegration()) {
        mergeIntegration(other.getIntegration());
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
                  getIntegrationFieldBuilder().getBuilder(),
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

    private ai.chalk.protos.chalk.server.v1.PagerDutyIntegration integration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.PagerDutyIntegration, ai.chalk.protos.chalk.server.v1.PagerDutyIntegration.Builder, ai.chalk.protos.chalk.server.v1.PagerDutyIntegrationOrBuilder> integrationBuilder_;
    /**
     * <code>.chalk.server.v1.PagerDutyIntegration integration = 1 [json_name = "integration"];</code>
     * @return Whether the integration field is set.
     */
    public boolean hasIntegration() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.chalk.server.v1.PagerDutyIntegration integration = 1 [json_name = "integration"];</code>
     * @return The integration.
     */
    public ai.chalk.protos.chalk.server.v1.PagerDutyIntegration getIntegration() {
      if (integrationBuilder_ == null) {
        return integration_ == null ? ai.chalk.protos.chalk.server.v1.PagerDutyIntegration.getDefaultInstance() : integration_;
      } else {
        return integrationBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.server.v1.PagerDutyIntegration integration = 1 [json_name = "integration"];</code>
     */
    public Builder setIntegration(ai.chalk.protos.chalk.server.v1.PagerDutyIntegration value) {
      if (integrationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        integration_ = value;
      } else {
        integrationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.PagerDutyIntegration integration = 1 [json_name = "integration"];</code>
     */
    public Builder setIntegration(
        ai.chalk.protos.chalk.server.v1.PagerDutyIntegration.Builder builderForValue) {
      if (integrationBuilder_ == null) {
        integration_ = builderForValue.build();
      } else {
        integrationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.PagerDutyIntegration integration = 1 [json_name = "integration"];</code>
     */
    public Builder mergeIntegration(ai.chalk.protos.chalk.server.v1.PagerDutyIntegration value) {
      if (integrationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          integration_ != null &&
          integration_ != ai.chalk.protos.chalk.server.v1.PagerDutyIntegration.getDefaultInstance()) {
          getIntegrationBuilder().mergeFrom(value);
        } else {
          integration_ = value;
        }
      } else {
        integrationBuilder_.mergeFrom(value);
      }
      if (integration_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.server.v1.PagerDutyIntegration integration = 1 [json_name = "integration"];</code>
     */
    public Builder clearIntegration() {
      bitField0_ = (bitField0_ & ~0x00000001);
      integration_ = null;
      if (integrationBuilder_ != null) {
        integrationBuilder_.dispose();
        integrationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.PagerDutyIntegration integration = 1 [json_name = "integration"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.PagerDutyIntegration.Builder getIntegrationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIntegrationFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.server.v1.PagerDutyIntegration integration = 1 [json_name = "integration"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.PagerDutyIntegrationOrBuilder getIntegrationOrBuilder() {
      if (integrationBuilder_ != null) {
        return integrationBuilder_.getMessageOrBuilder();
      } else {
        return integration_ == null ?
            ai.chalk.protos.chalk.server.v1.PagerDutyIntegration.getDefaultInstance() : integration_;
      }
    }
    /**
     * <code>.chalk.server.v1.PagerDutyIntegration integration = 1 [json_name = "integration"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.PagerDutyIntegration, ai.chalk.protos.chalk.server.v1.PagerDutyIntegration.Builder, ai.chalk.protos.chalk.server.v1.PagerDutyIntegrationOrBuilder> 
        getIntegrationFieldBuilder() {
      if (integrationBuilder_ == null) {
        integrationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.server.v1.PagerDutyIntegration, ai.chalk.protos.chalk.server.v1.PagerDutyIntegration.Builder, ai.chalk.protos.chalk.server.v1.PagerDutyIntegrationOrBuilder>(
                getIntegration(),
                getParentForChildren(),
                isClean());
        integration_ = null;
      }
      return integrationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.server.v1.GetPagerDutyIntegrationResponse)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.GetPagerDutyIntegrationResponse)
  private static final ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse();
  }

  public static ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPagerDutyIntegrationResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetPagerDutyIntegrationResponse>() {
    @java.lang.Override
    public GetPagerDutyIntegrationResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetPagerDutyIntegrationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPagerDutyIntegrationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

