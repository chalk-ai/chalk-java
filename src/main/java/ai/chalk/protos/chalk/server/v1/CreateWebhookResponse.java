// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/webhook.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.CreateWebhookResponse}
 */
public final class CreateWebhookResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.CreateWebhookResponse)
    CreateWebhookResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateWebhookResponse.newBuilder() to construct.
  private CreateWebhookResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateWebhookResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateWebhookResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.WebhookProto.internal_static_chalk_server_v1_CreateWebhookResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.WebhookProto.internal_static_chalk_server_v1_CreateWebhookResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.CreateWebhookResponse.class, ai.chalk.protos.chalk.server.v1.CreateWebhookResponse.Builder.class);
  }

  private int bitField0_;
  public static final int WEBHOOK_FIELD_NUMBER = 1;
  private ai.chalk.protos.chalk.server.v1.Webhook webhook_;
  /**
   * <code>.chalk.server.v1.Webhook webhook = 1 [json_name = "webhook"];</code>
   * @return Whether the webhook field is set.
   */
  @java.lang.Override
  public boolean hasWebhook() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.server.v1.Webhook webhook = 1 [json_name = "webhook"];</code>
   * @return The webhook.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.Webhook getWebhook() {
    return webhook_ == null ? ai.chalk.protos.chalk.server.v1.Webhook.getDefaultInstance() : webhook_;
  }
  /**
   * <code>.chalk.server.v1.Webhook webhook = 1 [json_name = "webhook"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.WebhookOrBuilder getWebhookOrBuilder() {
    return webhook_ == null ? ai.chalk.protos.chalk.server.v1.Webhook.getDefaultInstance() : webhook_;
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
      output.writeMessage(1, getWebhook());
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
        .computeMessageSize(1, getWebhook());
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.CreateWebhookResponse)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.CreateWebhookResponse other = (ai.chalk.protos.chalk.server.v1.CreateWebhookResponse) obj;

    if (hasWebhook() != other.hasWebhook()) return false;
    if (hasWebhook()) {
      if (!getWebhook()
          .equals(other.getWebhook())) return false;
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
    if (hasWebhook()) {
      hash = (37 * hash) + WEBHOOK_FIELD_NUMBER;
      hash = (53 * hash) + getWebhook().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.CreateWebhookResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateWebhookResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateWebhookResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateWebhookResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateWebhookResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateWebhookResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateWebhookResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateWebhookResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.CreateWebhookResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.CreateWebhookResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateWebhookResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateWebhookResponse parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.CreateWebhookResponse prototype) {
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
   * Protobuf type {@code chalk.server.v1.CreateWebhookResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.CreateWebhookResponse)
      ai.chalk.protos.chalk.server.v1.CreateWebhookResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.WebhookProto.internal_static_chalk_server_v1_CreateWebhookResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.WebhookProto.internal_static_chalk_server_v1_CreateWebhookResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.CreateWebhookResponse.class, ai.chalk.protos.chalk.server.v1.CreateWebhookResponse.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.CreateWebhookResponse.newBuilder()
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
        getWebhookFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      webhook_ = null;
      if (webhookBuilder_ != null) {
        webhookBuilder_.dispose();
        webhookBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.WebhookProto.internal_static_chalk_server_v1_CreateWebhookResponse_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateWebhookResponse getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.CreateWebhookResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateWebhookResponse build() {
      ai.chalk.protos.chalk.server.v1.CreateWebhookResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateWebhookResponse buildPartial() {
      ai.chalk.protos.chalk.server.v1.CreateWebhookResponse result = new ai.chalk.protos.chalk.server.v1.CreateWebhookResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.CreateWebhookResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.webhook_ = webhookBuilder_ == null
            ? webhook_
            : webhookBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.server.v1.CreateWebhookResponse) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.CreateWebhookResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.CreateWebhookResponse other) {
      if (other == ai.chalk.protos.chalk.server.v1.CreateWebhookResponse.getDefaultInstance()) return this;
      if (other.hasWebhook()) {
        mergeWebhook(other.getWebhook());
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
                  getWebhookFieldBuilder().getBuilder(),
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

    private ai.chalk.protos.chalk.server.v1.Webhook webhook_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.Webhook, ai.chalk.protos.chalk.server.v1.Webhook.Builder, ai.chalk.protos.chalk.server.v1.WebhookOrBuilder> webhookBuilder_;
    /**
     * <code>.chalk.server.v1.Webhook webhook = 1 [json_name = "webhook"];</code>
     * @return Whether the webhook field is set.
     */
    public boolean hasWebhook() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.chalk.server.v1.Webhook webhook = 1 [json_name = "webhook"];</code>
     * @return The webhook.
     */
    public ai.chalk.protos.chalk.server.v1.Webhook getWebhook() {
      if (webhookBuilder_ == null) {
        return webhook_ == null ? ai.chalk.protos.chalk.server.v1.Webhook.getDefaultInstance() : webhook_;
      } else {
        return webhookBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.server.v1.Webhook webhook = 1 [json_name = "webhook"];</code>
     */
    public Builder setWebhook(ai.chalk.protos.chalk.server.v1.Webhook value) {
      if (webhookBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        webhook_ = value;
      } else {
        webhookBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.Webhook webhook = 1 [json_name = "webhook"];</code>
     */
    public Builder setWebhook(
        ai.chalk.protos.chalk.server.v1.Webhook.Builder builderForValue) {
      if (webhookBuilder_ == null) {
        webhook_ = builderForValue.build();
      } else {
        webhookBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.Webhook webhook = 1 [json_name = "webhook"];</code>
     */
    public Builder mergeWebhook(ai.chalk.protos.chalk.server.v1.Webhook value) {
      if (webhookBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          webhook_ != null &&
          webhook_ != ai.chalk.protos.chalk.server.v1.Webhook.getDefaultInstance()) {
          getWebhookBuilder().mergeFrom(value);
        } else {
          webhook_ = value;
        }
      } else {
        webhookBuilder_.mergeFrom(value);
      }
      if (webhook_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.server.v1.Webhook webhook = 1 [json_name = "webhook"];</code>
     */
    public Builder clearWebhook() {
      bitField0_ = (bitField0_ & ~0x00000001);
      webhook_ = null;
      if (webhookBuilder_ != null) {
        webhookBuilder_.dispose();
        webhookBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.Webhook webhook = 1 [json_name = "webhook"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.Webhook.Builder getWebhookBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWebhookFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.server.v1.Webhook webhook = 1 [json_name = "webhook"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.WebhookOrBuilder getWebhookOrBuilder() {
      if (webhookBuilder_ != null) {
        return webhookBuilder_.getMessageOrBuilder();
      } else {
        return webhook_ == null ?
            ai.chalk.protos.chalk.server.v1.Webhook.getDefaultInstance() : webhook_;
      }
    }
    /**
     * <code>.chalk.server.v1.Webhook webhook = 1 [json_name = "webhook"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.Webhook, ai.chalk.protos.chalk.server.v1.Webhook.Builder, ai.chalk.protos.chalk.server.v1.WebhookOrBuilder> 
        getWebhookFieldBuilder() {
      if (webhookBuilder_ == null) {
        webhookBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.server.v1.Webhook, ai.chalk.protos.chalk.server.v1.Webhook.Builder, ai.chalk.protos.chalk.server.v1.WebhookOrBuilder>(
                getWebhook(),
                getParentForChildren(),
                isClean());
        webhook_ = null;
      }
      return webhookBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.server.v1.CreateWebhookResponse)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.CreateWebhookResponse)
  private static final ai.chalk.protos.chalk.server.v1.CreateWebhookResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.CreateWebhookResponse();
  }

  public static ai.chalk.protos.chalk.server.v1.CreateWebhookResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWebhookResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateWebhookResponse>() {
    @java.lang.Override
    public CreateWebhookResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateWebhookResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWebhookResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.CreateWebhookResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

