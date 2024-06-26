// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.CreateServiceTokenResponse}
 */
public final class CreateServiceTokenResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.CreateServiceTokenResponse)
    CreateServiceTokenResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateServiceTokenResponse.newBuilder() to construct.
  private CreateServiceTokenResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateServiceTokenResponse() {
    clientSecret_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateServiceTokenResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_CreateServiceTokenResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_CreateServiceTokenResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse.class, ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse.Builder.class);
  }

  private int bitField0_;
  public static final int AGENT_FIELD_NUMBER = 1;
  private ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent agent_;
  /**
   * <code>.chalk.auth.v1.ServiceTokenAgent agent = 1 [json_name = "agent"];</code>
   * @return Whether the agent field is set.
   */
  @java.lang.Override
  public boolean hasAgent() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.auth.v1.ServiceTokenAgent agent = 1 [json_name = "agent"];</code>
   * @return The agent.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent getAgent() {
    return agent_ == null ? ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent.getDefaultInstance() : agent_;
  }
  /**
   * <code>.chalk.auth.v1.ServiceTokenAgent agent = 1 [json_name = "agent"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.auth.v1.ServiceTokenAgentOrBuilder getAgentOrBuilder() {
    return agent_ == null ? ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent.getDefaultInstance() : agent_;
  }

  public static final int CLIENT_SECRET_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clientSecret_ = "";
  /**
   * <code>string client_secret = 2 [json_name = "clientSecret", (.chalk.utils.v1.sensitive) = true];</code>
   * @return The clientSecret.
   */
  @java.lang.Override
  public java.lang.String getClientSecret() {
    java.lang.Object ref = clientSecret_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientSecret_ = s;
      return s;
    }
  }
  /**
   * <code>string client_secret = 2 [json_name = "clientSecret", (.chalk.utils.v1.sensitive) = true];</code>
   * @return The bytes for clientSecret.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientSecretBytes() {
    java.lang.Object ref = clientSecret_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientSecret_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
      output.writeMessage(1, getAgent());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientSecret_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clientSecret_);
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
        .computeMessageSize(1, getAgent());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientSecret_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clientSecret_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse other = (ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse) obj;

    if (hasAgent() != other.hasAgent()) return false;
    if (hasAgent()) {
      if (!getAgent()
          .equals(other.getAgent())) return false;
    }
    if (!getClientSecret()
        .equals(other.getClientSecret())) return false;
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
    if (hasAgent()) {
      hash = (37 * hash) + AGENT_FIELD_NUMBER;
      hash = (53 * hash) + getAgent().hashCode();
    }
    hash = (37 * hash) + CLIENT_SECRET_FIELD_NUMBER;
    hash = (53 * hash) + getClientSecret().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse prototype) {
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
   * Protobuf type {@code chalk.server.v1.CreateServiceTokenResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.CreateServiceTokenResponse)
      ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_CreateServiceTokenResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_CreateServiceTokenResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse.class, ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse.newBuilder()
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
        getAgentFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      agent_ = null;
      if (agentBuilder_ != null) {
        agentBuilder_.dispose();
        agentBuilder_ = null;
      }
      clientSecret_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_CreateServiceTokenResponse_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse build() {
      ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse buildPartial() {
      ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse result = new ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.agent_ = agentBuilder_ == null
            ? agent_
            : agentBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clientSecret_ = clientSecret_;
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
      if (other instanceof ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse other) {
      if (other == ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse.getDefaultInstance()) return this;
      if (other.hasAgent()) {
        mergeAgent(other.getAgent());
      }
      if (!other.getClientSecret().isEmpty()) {
        clientSecret_ = other.clientSecret_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                  getAgentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              clientSecret_ = input.readStringRequireUtf8();
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

    private ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent agent_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent, ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent.Builder, ai.chalk.protos.chalk.auth.v1.ServiceTokenAgentOrBuilder> agentBuilder_;
    /**
     * <code>.chalk.auth.v1.ServiceTokenAgent agent = 1 [json_name = "agent"];</code>
     * @return Whether the agent field is set.
     */
    public boolean hasAgent() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.chalk.auth.v1.ServiceTokenAgent agent = 1 [json_name = "agent"];</code>
     * @return The agent.
     */
    public ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent getAgent() {
      if (agentBuilder_ == null) {
        return agent_ == null ? ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent.getDefaultInstance() : agent_;
      } else {
        return agentBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.auth.v1.ServiceTokenAgent agent = 1 [json_name = "agent"];</code>
     */
    public Builder setAgent(ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent value) {
      if (agentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agent_ = value;
      } else {
        agentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.auth.v1.ServiceTokenAgent agent = 1 [json_name = "agent"];</code>
     */
    public Builder setAgent(
        ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent.Builder builderForValue) {
      if (agentBuilder_ == null) {
        agent_ = builderForValue.build();
      } else {
        agentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.auth.v1.ServiceTokenAgent agent = 1 [json_name = "agent"];</code>
     */
    public Builder mergeAgent(ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent value) {
      if (agentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          agent_ != null &&
          agent_ != ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent.getDefaultInstance()) {
          getAgentBuilder().mergeFrom(value);
        } else {
          agent_ = value;
        }
      } else {
        agentBuilder_.mergeFrom(value);
      }
      if (agent_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.auth.v1.ServiceTokenAgent agent = 1 [json_name = "agent"];</code>
     */
    public Builder clearAgent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      agent_ = null;
      if (agentBuilder_ != null) {
        agentBuilder_.dispose();
        agentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.auth.v1.ServiceTokenAgent agent = 1 [json_name = "agent"];</code>
     */
    public ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent.Builder getAgentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAgentFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.auth.v1.ServiceTokenAgent agent = 1 [json_name = "agent"];</code>
     */
    public ai.chalk.protos.chalk.auth.v1.ServiceTokenAgentOrBuilder getAgentOrBuilder() {
      if (agentBuilder_ != null) {
        return agentBuilder_.getMessageOrBuilder();
      } else {
        return agent_ == null ?
            ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent.getDefaultInstance() : agent_;
      }
    }
    /**
     * <code>.chalk.auth.v1.ServiceTokenAgent agent = 1 [json_name = "agent"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent, ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent.Builder, ai.chalk.protos.chalk.auth.v1.ServiceTokenAgentOrBuilder> 
        getAgentFieldBuilder() {
      if (agentBuilder_ == null) {
        agentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent, ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent.Builder, ai.chalk.protos.chalk.auth.v1.ServiceTokenAgentOrBuilder>(
                getAgent(),
                getParentForChildren(),
                isClean());
        agent_ = null;
      }
      return agentBuilder_;
    }

    private java.lang.Object clientSecret_ = "";
    /**
     * <code>string client_secret = 2 [json_name = "clientSecret", (.chalk.utils.v1.sensitive) = true];</code>
     * @return The clientSecret.
     */
    public java.lang.String getClientSecret() {
      java.lang.Object ref = clientSecret_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientSecret_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string client_secret = 2 [json_name = "clientSecret", (.chalk.utils.v1.sensitive) = true];</code>
     * @return The bytes for clientSecret.
     */
    public com.google.protobuf.ByteString
        getClientSecretBytes() {
      java.lang.Object ref = clientSecret_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientSecret_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string client_secret = 2 [json_name = "clientSecret", (.chalk.utils.v1.sensitive) = true];</code>
     * @param value The clientSecret to set.
     * @return This builder for chaining.
     */
    public Builder setClientSecret(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clientSecret_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string client_secret = 2 [json_name = "clientSecret", (.chalk.utils.v1.sensitive) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientSecret() {
      clientSecret_ = getDefaultInstance().getClientSecret();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string client_secret = 2 [json_name = "clientSecret", (.chalk.utils.v1.sensitive) = true];</code>
     * @param value The bytes for clientSecret to set.
     * @return This builder for chaining.
     */
    public Builder setClientSecretBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientSecret_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:chalk.server.v1.CreateServiceTokenResponse)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.CreateServiceTokenResponse)
  private static final ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse();
  }

  public static ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateServiceTokenResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateServiceTokenResponse>() {
    @java.lang.Override
    public CreateServiceTokenResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateServiceTokenResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateServiceTokenResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

