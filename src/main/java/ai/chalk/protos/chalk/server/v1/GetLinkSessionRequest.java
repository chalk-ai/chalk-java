// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/link.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

/**
 * <pre>
 * GET LINK
 * </pre>
 *
 * Protobuf type {@code chalk.server.v1.GetLinkSessionRequest}
 */
public final class GetLinkSessionRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.GetLinkSessionRequest)
    GetLinkSessionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      GetLinkSessionRequest.class.getName());
  }
  // Use GetLinkSessionRequest.newBuilder() to construct.
  private GetLinkSessionRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetLinkSessionRequest() {
    linkCode_ = "";
    projectName_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.LinkProto.internal_static_chalk_server_v1_GetLinkSessionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.LinkProto.internal_static_chalk_server_v1_GetLinkSessionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest.class, ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest.Builder.class);
  }

  public static final int LINK_CODE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object linkCode_ = "";
  /**
   * <code>string link_code = 1 [json_name = "linkCode"];</code>
   * @return The linkCode.
   */
  @java.lang.Override
  public java.lang.String getLinkCode() {
    java.lang.Object ref = linkCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      linkCode_ = s;
      return s;
    }
  }
  /**
   * <code>string link_code = 1 [json_name = "linkCode"];</code>
   * @return The bytes for linkCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLinkCodeBytes() {
    java.lang.Object ref = linkCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      linkCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROJECT_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object projectName_ = "";
  /**
   * <code>string project_name = 2 [json_name = "projectName"];</code>
   * @return The projectName.
   */
  @java.lang.Override
  public java.lang.String getProjectName() {
    java.lang.Object ref = projectName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectName_ = s;
      return s;
    }
  }
  /**
   * <code>string project_name = 2 [json_name = "projectName"];</code>
   * @return The bytes for projectName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectNameBytes() {
    java.lang.Object ref = projectName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectName_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(linkCode_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, linkCode_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(projectName_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, projectName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(linkCode_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, linkCode_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(projectName_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, projectName_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest other = (ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest) obj;

    if (!getLinkCode()
        .equals(other.getLinkCode())) return false;
    if (!getProjectName()
        .equals(other.getProjectName())) return false;
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
    hash = (37 * hash) + LINK_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLinkCode().hashCode();
    hash = (37 * hash) + PROJECT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getProjectName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest prototype) {
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
   * <pre>
   * GET LINK
   * </pre>
   *
   * Protobuf type {@code chalk.server.v1.GetLinkSessionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.GetLinkSessionRequest)
      ai.chalk.protos.chalk.server.v1.GetLinkSessionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.LinkProto.internal_static_chalk_server_v1_GetLinkSessionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.LinkProto.internal_static_chalk_server_v1_GetLinkSessionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest.class, ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      linkCode_ = "";
      projectName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.LinkProto.internal_static_chalk_server_v1_GetLinkSessionRequest_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest build() {
      ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest buildPartial() {
      ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest result = new ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.linkCode_ = linkCode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.projectName_ = projectName_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest other) {
      if (other == ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest.getDefaultInstance()) return this;
      if (!other.getLinkCode().isEmpty()) {
        linkCode_ = other.linkCode_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getProjectName().isEmpty()) {
        projectName_ = other.projectName_;
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
              linkCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              projectName_ = input.readStringRequireUtf8();
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

    private java.lang.Object linkCode_ = "";
    /**
     * <code>string link_code = 1 [json_name = "linkCode"];</code>
     * @return The linkCode.
     */
    public java.lang.String getLinkCode() {
      java.lang.Object ref = linkCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        linkCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string link_code = 1 [json_name = "linkCode"];</code>
     * @return The bytes for linkCode.
     */
    public com.google.protobuf.ByteString
        getLinkCodeBytes() {
      java.lang.Object ref = linkCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        linkCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string link_code = 1 [json_name = "linkCode"];</code>
     * @param value The linkCode to set.
     * @return This builder for chaining.
     */
    public Builder setLinkCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      linkCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string link_code = 1 [json_name = "linkCode"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLinkCode() {
      linkCode_ = getDefaultInstance().getLinkCode();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string link_code = 1 [json_name = "linkCode"];</code>
     * @param value The bytes for linkCode to set.
     * @return This builder for chaining.
     */
    public Builder setLinkCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      linkCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object projectName_ = "";
    /**
     * <code>string project_name = 2 [json_name = "projectName"];</code>
     * @return The projectName.
     */
    public java.lang.String getProjectName() {
      java.lang.Object ref = projectName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string project_name = 2 [json_name = "projectName"];</code>
     * @return The bytes for projectName.
     */
    public com.google.protobuf.ByteString
        getProjectNameBytes() {
      java.lang.Object ref = projectName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string project_name = 2 [json_name = "projectName"];</code>
     * @param value The projectName to set.
     * @return This builder for chaining.
     */
    public Builder setProjectName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      projectName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string project_name = 2 [json_name = "projectName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectName() {
      projectName_ = getDefaultInstance().getProjectName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string project_name = 2 [json_name = "projectName"];</code>
     * @param value The bytes for projectName to set.
     * @return This builder for chaining.
     */
    public Builder setProjectNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      projectName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:chalk.server.v1.GetLinkSessionRequest)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.GetLinkSessionRequest)
  private static final ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest();
  }

  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetLinkSessionRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetLinkSessionRequest>() {
    @java.lang.Override
    public GetLinkSessionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetLinkSessionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetLinkSessionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
