// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/link.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.GetLinkSessionResponse}
 */
public final class GetLinkSessionResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.GetLinkSessionResponse)
    GetLinkSessionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      GetLinkSessionResponse.class.getName());
  }
  // Use GetLinkSessionResponse.newBuilder() to construct.
  private GetLinkSessionResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetLinkSessionResponse() {
    status_ = 0;
    message_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.LinkProto.internal_static_chalk_server_v1_GetLinkSessionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.LinkProto.internal_static_chalk_server_v1_GetLinkSessionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse.class, ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse.Builder.class);
  }

  private int bitField0_;
  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_ = 0;
  /**
   * <code>.chalk.server.v1.LinkSessionStatus status = 1 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.chalk.server.v1.LinkSessionStatus status = 1 [json_name = "status"];</code>
   * @return The status.
   */
  @java.lang.Override public ai.chalk.protos.chalk.server.v1.LinkSessionStatus getStatus() {
    ai.chalk.protos.chalk.server.v1.LinkSessionStatus result = ai.chalk.protos.chalk.server.v1.LinkSessionStatus.forNumber(status_);
    return result == null ? ai.chalk.protos.chalk.server.v1.LinkSessionStatus.UNRECOGNIZED : result;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKEN_FIELD_NUMBER = 3;
  private ai.chalk.protos.chalk.server.v1.LinkToken token_;
  /**
   * <code>optional .chalk.server.v1.LinkToken token = 3 [json_name = "token"];</code>
   * @return Whether the token field is set.
   */
  @java.lang.Override
  public boolean hasToken() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .chalk.server.v1.LinkToken token = 3 [json_name = "token"];</code>
   * @return The token.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.LinkToken getToken() {
    return token_ == null ? ai.chalk.protos.chalk.server.v1.LinkToken.getDefaultInstance() : token_;
  }
  /**
   * <code>optional .chalk.server.v1.LinkToken token = 3 [json_name = "token"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.LinkTokenOrBuilder getTokenOrBuilder() {
    return token_ == null ? ai.chalk.protos.chalk.server.v1.LinkToken.getDefaultInstance() : token_;
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
    if (status_ != ai.chalk.protos.chalk.server.v1.LinkSessionStatus.LINK_SESSION_STATUS_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, message_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getToken());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != ai.chalk.protos.chalk.server.v1.LinkSessionStatus.LINK_SESSION_STATUS_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, message_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getToken());
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse other = (ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse) obj;

    if (status_ != other.status_) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (hasToken() != other.hasToken()) return false;
    if (hasToken()) {
      if (!getToken()
          .equals(other.getToken())) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (hasToken()) {
      hash = (37 * hash) + TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getToken().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse prototype) {
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
   * Protobuf type {@code chalk.server.v1.GetLinkSessionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.GetLinkSessionResponse)
      ai.chalk.protos.chalk.server.v1.GetLinkSessionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.LinkProto.internal_static_chalk_server_v1_GetLinkSessionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.LinkProto.internal_static_chalk_server_v1_GetLinkSessionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse.class, ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse.newBuilder()
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
        getTokenFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      status_ = 0;
      message_ = "";
      token_ = null;
      if (tokenBuilder_ != null) {
        tokenBuilder_.dispose();
        tokenBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.LinkProto.internal_static_chalk_server_v1_GetLinkSessionResponse_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse build() {
      ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse buildPartial() {
      ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse result = new ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.status_ = status_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.message_ = message_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.token_ = tokenBuilder_ == null
            ? token_
            : tokenBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse other) {
      if (other == ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasToken()) {
        mergeToken(other.getToken());
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
            case 8: {
              status_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getTokenFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private int status_ = 0;
    /**
     * <code>.chalk.server.v1.LinkSessionStatus status = 1 [json_name = "status"];</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.chalk.server.v1.LinkSessionStatus status = 1 [json_name = "status"];</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.LinkSessionStatus status = 1 [json_name = "status"];</code>
     * @return The status.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.LinkSessionStatus getStatus() {
      ai.chalk.protos.chalk.server.v1.LinkSessionStatus result = ai.chalk.protos.chalk.server.v1.LinkSessionStatus.forNumber(status_);
      return result == null ? ai.chalk.protos.chalk.server.v1.LinkSessionStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.chalk.server.v1.LinkSessionStatus status = 1 [json_name = "status"];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(ai.chalk.protos.chalk.server.v1.LinkSessionStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.LinkSessionStatus status = 1 [json_name = "status"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2 [json_name = "message"];</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2 [json_name = "message"];</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2 [json_name = "message"];</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2 [json_name = "message"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2 [json_name = "message"];</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private ai.chalk.protos.chalk.server.v1.LinkToken token_;
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.server.v1.LinkToken, ai.chalk.protos.chalk.server.v1.LinkToken.Builder, ai.chalk.protos.chalk.server.v1.LinkTokenOrBuilder> tokenBuilder_;
    /**
     * <code>optional .chalk.server.v1.LinkToken token = 3 [json_name = "token"];</code>
     * @return Whether the token field is set.
     */
    public boolean hasToken() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .chalk.server.v1.LinkToken token = 3 [json_name = "token"];</code>
     * @return The token.
     */
    public ai.chalk.protos.chalk.server.v1.LinkToken getToken() {
      if (tokenBuilder_ == null) {
        return token_ == null ? ai.chalk.protos.chalk.server.v1.LinkToken.getDefaultInstance() : token_;
      } else {
        return tokenBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .chalk.server.v1.LinkToken token = 3 [json_name = "token"];</code>
     */
    public Builder setToken(ai.chalk.protos.chalk.server.v1.LinkToken value) {
      if (tokenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        token_ = value;
      } else {
        tokenBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .chalk.server.v1.LinkToken token = 3 [json_name = "token"];</code>
     */
    public Builder setToken(
        ai.chalk.protos.chalk.server.v1.LinkToken.Builder builderForValue) {
      if (tokenBuilder_ == null) {
        token_ = builderForValue.build();
      } else {
        tokenBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .chalk.server.v1.LinkToken token = 3 [json_name = "token"];</code>
     */
    public Builder mergeToken(ai.chalk.protos.chalk.server.v1.LinkToken value) {
      if (tokenBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          token_ != null &&
          token_ != ai.chalk.protos.chalk.server.v1.LinkToken.getDefaultInstance()) {
          getTokenBuilder().mergeFrom(value);
        } else {
          token_ = value;
        }
      } else {
        tokenBuilder_.mergeFrom(value);
      }
      if (token_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional .chalk.server.v1.LinkToken token = 3 [json_name = "token"];</code>
     */
    public Builder clearToken() {
      bitField0_ = (bitField0_ & ~0x00000004);
      token_ = null;
      if (tokenBuilder_ != null) {
        tokenBuilder_.dispose();
        tokenBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .chalk.server.v1.LinkToken token = 3 [json_name = "token"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.LinkToken.Builder getTokenBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getTokenFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .chalk.server.v1.LinkToken token = 3 [json_name = "token"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.LinkTokenOrBuilder getTokenOrBuilder() {
      if (tokenBuilder_ != null) {
        return tokenBuilder_.getMessageOrBuilder();
      } else {
        return token_ == null ?
            ai.chalk.protos.chalk.server.v1.LinkToken.getDefaultInstance() : token_;
      }
    }
    /**
     * <code>optional .chalk.server.v1.LinkToken token = 3 [json_name = "token"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.server.v1.LinkToken, ai.chalk.protos.chalk.server.v1.LinkToken.Builder, ai.chalk.protos.chalk.server.v1.LinkTokenOrBuilder> 
        getTokenFieldBuilder() {
      if (tokenBuilder_ == null) {
        tokenBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.chalk.protos.chalk.server.v1.LinkToken, ai.chalk.protos.chalk.server.v1.LinkToken.Builder, ai.chalk.protos.chalk.server.v1.LinkTokenOrBuilder>(
                getToken(),
                getParentForChildren(),
                isClean());
        token_ = null;
      }
      return tokenBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:chalk.server.v1.GetLinkSessionResponse)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.GetLinkSessionResponse)
  private static final ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse();
  }

  public static ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetLinkSessionResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetLinkSessionResponse>() {
    @java.lang.Override
    public GetLinkSessionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetLinkSessionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetLinkSessionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

