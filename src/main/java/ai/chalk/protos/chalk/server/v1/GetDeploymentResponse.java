// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/deploy.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.GetDeploymentResponse}
 */
public final class GetDeploymentResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.GetDeploymentResponse)
    GetDeploymentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      GetDeploymentResponse.class.getName());
  }
  // Use GetDeploymentResponse.newBuilder() to construct.
  private GetDeploymentResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetDeploymentResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.DeployProto.internal_static_chalk_server_v1_GetDeploymentResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.DeployProto.internal_static_chalk_server_v1_GetDeploymentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.GetDeploymentResponse.class, ai.chalk.protos.chalk.server.v1.GetDeploymentResponse.Builder.class);
  }

  private int bitField0_;
  public static final int DEPLOYMENT_FIELD_NUMBER = 1;
  private ai.chalk.protos.chalk.server.v1.Deployment deployment_;
  /**
   * <code>.chalk.server.v1.Deployment deployment = 1 [json_name = "deployment"];</code>
   * @return Whether the deployment field is set.
   */
  @java.lang.Override
  public boolean hasDeployment() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.server.v1.Deployment deployment = 1 [json_name = "deployment"];</code>
   * @return The deployment.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.Deployment getDeployment() {
    return deployment_ == null ? ai.chalk.protos.chalk.server.v1.Deployment.getDefaultInstance() : deployment_;
  }
  /**
   * <code>.chalk.server.v1.Deployment deployment = 1 [json_name = "deployment"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.DeploymentOrBuilder getDeploymentOrBuilder() {
    return deployment_ == null ? ai.chalk.protos.chalk.server.v1.Deployment.getDefaultInstance() : deployment_;
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
      output.writeMessage(1, getDeployment());
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
        .computeMessageSize(1, getDeployment());
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.GetDeploymentResponse)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.GetDeploymentResponse other = (ai.chalk.protos.chalk.server.v1.GetDeploymentResponse) obj;

    if (hasDeployment() != other.hasDeployment()) return false;
    if (hasDeployment()) {
      if (!getDeployment()
          .equals(other.getDeployment())) return false;
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
    if (hasDeployment()) {
      hash = (37 * hash) + DEPLOYMENT_FIELD_NUMBER;
      hash = (53 * hash) + getDeployment().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.GetDeploymentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDeploymentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDeploymentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDeploymentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDeploymentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDeploymentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDeploymentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDeploymentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.GetDeploymentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.GetDeploymentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDeploymentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetDeploymentResponse parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.GetDeploymentResponse prototype) {
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
   * Protobuf type {@code chalk.server.v1.GetDeploymentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.GetDeploymentResponse)
      ai.chalk.protos.chalk.server.v1.GetDeploymentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.DeployProto.internal_static_chalk_server_v1_GetDeploymentResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.DeployProto.internal_static_chalk_server_v1_GetDeploymentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.GetDeploymentResponse.class, ai.chalk.protos.chalk.server.v1.GetDeploymentResponse.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.GetDeploymentResponse.newBuilder()
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
        getDeploymentFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      deployment_ = null;
      if (deploymentBuilder_ != null) {
        deploymentBuilder_.dispose();
        deploymentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.DeployProto.internal_static_chalk_server_v1_GetDeploymentResponse_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetDeploymentResponse getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.GetDeploymentResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetDeploymentResponse build() {
      ai.chalk.protos.chalk.server.v1.GetDeploymentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetDeploymentResponse buildPartial() {
      ai.chalk.protos.chalk.server.v1.GetDeploymentResponse result = new ai.chalk.protos.chalk.server.v1.GetDeploymentResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.GetDeploymentResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deployment_ = deploymentBuilder_ == null
            ? deployment_
            : deploymentBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.server.v1.GetDeploymentResponse) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.GetDeploymentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.GetDeploymentResponse other) {
      if (other == ai.chalk.protos.chalk.server.v1.GetDeploymentResponse.getDefaultInstance()) return this;
      if (other.hasDeployment()) {
        mergeDeployment(other.getDeployment());
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
                  getDeploymentFieldBuilder().getBuilder(),
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

    private ai.chalk.protos.chalk.server.v1.Deployment deployment_;
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.server.v1.Deployment, ai.chalk.protos.chalk.server.v1.Deployment.Builder, ai.chalk.protos.chalk.server.v1.DeploymentOrBuilder> deploymentBuilder_;
    /**
     * <code>.chalk.server.v1.Deployment deployment = 1 [json_name = "deployment"];</code>
     * @return Whether the deployment field is set.
     */
    public boolean hasDeployment() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.chalk.server.v1.Deployment deployment = 1 [json_name = "deployment"];</code>
     * @return The deployment.
     */
    public ai.chalk.protos.chalk.server.v1.Deployment getDeployment() {
      if (deploymentBuilder_ == null) {
        return deployment_ == null ? ai.chalk.protos.chalk.server.v1.Deployment.getDefaultInstance() : deployment_;
      } else {
        return deploymentBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.server.v1.Deployment deployment = 1 [json_name = "deployment"];</code>
     */
    public Builder setDeployment(ai.chalk.protos.chalk.server.v1.Deployment value) {
      if (deploymentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deployment_ = value;
      } else {
        deploymentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.Deployment deployment = 1 [json_name = "deployment"];</code>
     */
    public Builder setDeployment(
        ai.chalk.protos.chalk.server.v1.Deployment.Builder builderForValue) {
      if (deploymentBuilder_ == null) {
        deployment_ = builderForValue.build();
      } else {
        deploymentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.Deployment deployment = 1 [json_name = "deployment"];</code>
     */
    public Builder mergeDeployment(ai.chalk.protos.chalk.server.v1.Deployment value) {
      if (deploymentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          deployment_ != null &&
          deployment_ != ai.chalk.protos.chalk.server.v1.Deployment.getDefaultInstance()) {
          getDeploymentBuilder().mergeFrom(value);
        } else {
          deployment_ = value;
        }
      } else {
        deploymentBuilder_.mergeFrom(value);
      }
      if (deployment_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.server.v1.Deployment deployment = 1 [json_name = "deployment"];</code>
     */
    public Builder clearDeployment() {
      bitField0_ = (bitField0_ & ~0x00000001);
      deployment_ = null;
      if (deploymentBuilder_ != null) {
        deploymentBuilder_.dispose();
        deploymentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.Deployment deployment = 1 [json_name = "deployment"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.Deployment.Builder getDeploymentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDeploymentFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.server.v1.Deployment deployment = 1 [json_name = "deployment"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.DeploymentOrBuilder getDeploymentOrBuilder() {
      if (deploymentBuilder_ != null) {
        return deploymentBuilder_.getMessageOrBuilder();
      } else {
        return deployment_ == null ?
            ai.chalk.protos.chalk.server.v1.Deployment.getDefaultInstance() : deployment_;
      }
    }
    /**
     * <code>.chalk.server.v1.Deployment deployment = 1 [json_name = "deployment"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.server.v1.Deployment, ai.chalk.protos.chalk.server.v1.Deployment.Builder, ai.chalk.protos.chalk.server.v1.DeploymentOrBuilder> 
        getDeploymentFieldBuilder() {
      if (deploymentBuilder_ == null) {
        deploymentBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.chalk.protos.chalk.server.v1.Deployment, ai.chalk.protos.chalk.server.v1.Deployment.Builder, ai.chalk.protos.chalk.server.v1.DeploymentOrBuilder>(
                getDeployment(),
                getParentForChildren(),
                isClean());
        deployment_ = null;
      }
      return deploymentBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:chalk.server.v1.GetDeploymentResponse)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.GetDeploymentResponse)
  private static final ai.chalk.protos.chalk.server.v1.GetDeploymentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.GetDeploymentResponse();
  }

  public static ai.chalk.protos.chalk.server.v1.GetDeploymentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDeploymentResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetDeploymentResponse>() {
    @java.lang.Override
    public GetDeploymentResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDeploymentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDeploymentResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.GetDeploymentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
