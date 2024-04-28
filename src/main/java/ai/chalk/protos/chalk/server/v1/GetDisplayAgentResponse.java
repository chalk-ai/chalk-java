// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.GetDisplayAgentResponse}
 */
public final class GetDisplayAgentResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.GetDisplayAgentResponse)
    GetDisplayAgentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      GetDisplayAgentResponse.class.getName());
  }
  // Use GetDisplayAgentResponse.newBuilder() to construct.
  private GetDisplayAgentResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetDisplayAgentResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_GetDisplayAgentResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_GetDisplayAgentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse.class, ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse.Builder.class);
  }

  private int bitField0_;
  public static final int AGENT_FIELD_NUMBER = 1;
  private ai.chalk.protos.chalk.auth.v1.DisplayAgent agent_;
  /**
   * <code>.chalk.auth.v1.DisplayAgent agent = 1 [json_name = "agent"];</code>
   * @return Whether the agent field is set.
   */
  @java.lang.Override
  public boolean hasAgent() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.auth.v1.DisplayAgent agent = 1 [json_name = "agent"];</code>
   * @return The agent.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.auth.v1.DisplayAgent getAgent() {
    return agent_ == null ? ai.chalk.protos.chalk.auth.v1.DisplayAgent.getDefaultInstance() : agent_;
  }
  /**
   * <code>.chalk.auth.v1.DisplayAgent agent = 1 [json_name = "agent"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.auth.v1.DisplayAgentOrBuilder getAgentOrBuilder() {
    return agent_ == null ? ai.chalk.protos.chalk.auth.v1.DisplayAgent.getDefaultInstance() : agent_;
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
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse other = (ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse) obj;

    if (hasAgent() != other.hasAgent()) return false;
    if (hasAgent()) {
      if (!getAgent()
          .equals(other.getAgent())) return false;
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
    if (hasAgent()) {
      hash = (37 * hash) + AGENT_FIELD_NUMBER;
      hash = (53 * hash) + getAgent().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code chalk.server.v1.GetDisplayAgentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.GetDisplayAgentResponse)
      ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_GetDisplayAgentResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_GetDisplayAgentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse.class, ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_GetDisplayAgentResponse_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse build() {
      ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse buildPartial() {
      ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse result = new ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.agent_ = agentBuilder_ == null
            ? agent_
            : agentBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse other) {
      if (other == ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse.getDefaultInstance()) return this;
      if (other.hasAgent()) {
        mergeAgent(other.getAgent());
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

    private ai.chalk.protos.chalk.auth.v1.DisplayAgent agent_;
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.auth.v1.DisplayAgent, ai.chalk.protos.chalk.auth.v1.DisplayAgent.Builder, ai.chalk.protos.chalk.auth.v1.DisplayAgentOrBuilder> agentBuilder_;
    /**
     * <code>.chalk.auth.v1.DisplayAgent agent = 1 [json_name = "agent"];</code>
     * @return Whether the agent field is set.
     */
    public boolean hasAgent() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.chalk.auth.v1.DisplayAgent agent = 1 [json_name = "agent"];</code>
     * @return The agent.
     */
    public ai.chalk.protos.chalk.auth.v1.DisplayAgent getAgent() {
      if (agentBuilder_ == null) {
        return agent_ == null ? ai.chalk.protos.chalk.auth.v1.DisplayAgent.getDefaultInstance() : agent_;
      } else {
        return agentBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.auth.v1.DisplayAgent agent = 1 [json_name = "agent"];</code>
     */
    public Builder setAgent(ai.chalk.protos.chalk.auth.v1.DisplayAgent value) {
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
     * <code>.chalk.auth.v1.DisplayAgent agent = 1 [json_name = "agent"];</code>
     */
    public Builder setAgent(
        ai.chalk.protos.chalk.auth.v1.DisplayAgent.Builder builderForValue) {
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
     * <code>.chalk.auth.v1.DisplayAgent agent = 1 [json_name = "agent"];</code>
     */
    public Builder mergeAgent(ai.chalk.protos.chalk.auth.v1.DisplayAgent value) {
      if (agentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          agent_ != null &&
          agent_ != ai.chalk.protos.chalk.auth.v1.DisplayAgent.getDefaultInstance()) {
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
     * <code>.chalk.auth.v1.DisplayAgent agent = 1 [json_name = "agent"];</code>
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
     * <code>.chalk.auth.v1.DisplayAgent agent = 1 [json_name = "agent"];</code>
     */
    public ai.chalk.protos.chalk.auth.v1.DisplayAgent.Builder getAgentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAgentFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.auth.v1.DisplayAgent agent = 1 [json_name = "agent"];</code>
     */
    public ai.chalk.protos.chalk.auth.v1.DisplayAgentOrBuilder getAgentOrBuilder() {
      if (agentBuilder_ != null) {
        return agentBuilder_.getMessageOrBuilder();
      } else {
        return agent_ == null ?
            ai.chalk.protos.chalk.auth.v1.DisplayAgent.getDefaultInstance() : agent_;
      }
    }
    /**
     * <code>.chalk.auth.v1.DisplayAgent agent = 1 [json_name = "agent"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.auth.v1.DisplayAgent, ai.chalk.protos.chalk.auth.v1.DisplayAgent.Builder, ai.chalk.protos.chalk.auth.v1.DisplayAgentOrBuilder> 
        getAgentFieldBuilder() {
      if (agentBuilder_ == null) {
        agentBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.chalk.protos.chalk.auth.v1.DisplayAgent, ai.chalk.protos.chalk.auth.v1.DisplayAgent.Builder, ai.chalk.protos.chalk.auth.v1.DisplayAgentOrBuilder>(
                getAgent(),
                getParentForChildren(),
                isClean());
        agent_ = null;
      }
      return agentBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:chalk.server.v1.GetDisplayAgentResponse)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.GetDisplayAgentResponse)
  private static final ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse();
  }

  public static ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDisplayAgentResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetDisplayAgentResponse>() {
    @java.lang.Override
    public GetDisplayAgentResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDisplayAgentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDisplayAgentResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
