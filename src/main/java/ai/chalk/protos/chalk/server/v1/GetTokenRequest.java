// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/auth.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.GetTokenRequest}
 */
public final class GetTokenRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.GetTokenRequest)
    GetTokenRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTokenRequest.newBuilder() to construct.
  private GetTokenRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTokenRequest() {
    clientId_ = "";
    clientSecret_ = "";
    grantType_ = "";
    scope_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTokenRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.AuthProto.internal_static_chalk_server_v1_GetTokenRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.AuthProto.internal_static_chalk_server_v1_GetTokenRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.GetTokenRequest.class, ai.chalk.protos.chalk.server.v1.GetTokenRequest.Builder.class);
  }

  private int bitField0_;
  public static final int CLIENT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clientId_ = "";
  /**
   * <code>string client_id = 1 [json_name = "clientId"];</code>
   * @return The clientId.
   */
  @java.lang.Override
  public java.lang.String getClientId() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientId_ = s;
      return s;
    }
  }
  /**
   * <code>string client_id = 1 [json_name = "clientId"];</code>
   * @return The bytes for clientId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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

  public static final int GRANT_TYPE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object grantType_ = "";
  /**
   * <code>string grant_type = 3 [json_name = "grantType"];</code>
   * @return The grantType.
   */
  @java.lang.Override
  public java.lang.String getGrantType() {
    java.lang.Object ref = grantType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      grantType_ = s;
      return s;
    }
  }
  /**
   * <code>string grant_type = 3 [json_name = "grantType"];</code>
   * @return The bytes for grantType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGrantTypeBytes() {
    java.lang.Object ref = grantType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      grantType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCOPE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object scope_ = "";
  /**
   * <code>optional string scope = 4 [json_name = "scope"];</code>
   * @return Whether the scope field is set.
   */
  @java.lang.Override
  public boolean hasScope() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string scope = 4 [json_name = "scope"];</code>
   * @return The scope.
   */
  @java.lang.Override
  public java.lang.String getScope() {
    java.lang.Object ref = scope_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scope_ = s;
      return s;
    }
  }
  /**
   * <code>optional string scope = 4 [json_name = "scope"];</code>
   * @return The bytes for scope.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getScopeBytes() {
    java.lang.Object ref = scope_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scope_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientSecret_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clientSecret_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(grantType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, grantType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, scope_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientSecret_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clientSecret_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(grantType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, grantType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, scope_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.GetTokenRequest)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.GetTokenRequest other = (ai.chalk.protos.chalk.server.v1.GetTokenRequest) obj;

    if (!getClientId()
        .equals(other.getClientId())) return false;
    if (!getClientSecret()
        .equals(other.getClientSecret())) return false;
    if (!getGrantType()
        .equals(other.getGrantType())) return false;
    if (hasScope() != other.hasScope()) return false;
    if (hasScope()) {
      if (!getScope()
          .equals(other.getScope())) return false;
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
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    hash = (37 * hash) + CLIENT_SECRET_FIELD_NUMBER;
    hash = (53 * hash) + getClientSecret().hashCode();
    hash = (37 * hash) + GRANT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getGrantType().hashCode();
    if (hasScope()) {
      hash = (37 * hash) + SCOPE_FIELD_NUMBER;
      hash = (53 * hash) + getScope().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.GetTokenRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetTokenRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetTokenRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetTokenRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetTokenRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetTokenRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetTokenRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetTokenRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.GetTokenRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.GetTokenRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetTokenRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetTokenRequest parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.GetTokenRequest prototype) {
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
   * Protobuf type {@code chalk.server.v1.GetTokenRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.GetTokenRequest)
      ai.chalk.protos.chalk.server.v1.GetTokenRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.AuthProto.internal_static_chalk_server_v1_GetTokenRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.AuthProto.internal_static_chalk_server_v1_GetTokenRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.GetTokenRequest.class, ai.chalk.protos.chalk.server.v1.GetTokenRequest.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.GetTokenRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      clientId_ = "";
      clientSecret_ = "";
      grantType_ = "";
      scope_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.AuthProto.internal_static_chalk_server_v1_GetTokenRequest_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetTokenRequest getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.GetTokenRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetTokenRequest build() {
      ai.chalk.protos.chalk.server.v1.GetTokenRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetTokenRequest buildPartial() {
      ai.chalk.protos.chalk.server.v1.GetTokenRequest result = new ai.chalk.protos.chalk.server.v1.GetTokenRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.GetTokenRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientId_ = clientId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clientSecret_ = clientSecret_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.grantType_ = grantType_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.scope_ = scope_;
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
      if (other instanceof ai.chalk.protos.chalk.server.v1.GetTokenRequest) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.GetTokenRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.GetTokenRequest other) {
      if (other == ai.chalk.protos.chalk.server.v1.GetTokenRequest.getDefaultInstance()) return this;
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getClientSecret().isEmpty()) {
        clientSecret_ = other.clientSecret_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getGrantType().isEmpty()) {
        grantType_ = other.grantType_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasScope()) {
        scope_ = other.scope_;
        bitField0_ |= 0x00000008;
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
              clientId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              clientSecret_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              grantType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              scope_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object clientId_ = "";
    /**
     * <code>string client_id = 1 [json_name = "clientId"];</code>
     * @return The clientId.
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string client_id = 1 [json_name = "clientId"];</code>
     * @return The bytes for clientId.
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string client_id = 1 [json_name = "clientId"];</code>
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string client_id = 1 [json_name = "clientId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      clientId_ = getDefaultInstance().getClientId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string client_id = 1 [json_name = "clientId"];</code>
     * @param value The bytes for clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
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

    private java.lang.Object grantType_ = "";
    /**
     * <code>string grant_type = 3 [json_name = "grantType"];</code>
     * @return The grantType.
     */
    public java.lang.String getGrantType() {
      java.lang.Object ref = grantType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        grantType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string grant_type = 3 [json_name = "grantType"];</code>
     * @return The bytes for grantType.
     */
    public com.google.protobuf.ByteString
        getGrantTypeBytes() {
      java.lang.Object ref = grantType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        grantType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string grant_type = 3 [json_name = "grantType"];</code>
     * @param value The grantType to set.
     * @return This builder for chaining.
     */
    public Builder setGrantType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      grantType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string grant_type = 3 [json_name = "grantType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearGrantType() {
      grantType_ = getDefaultInstance().getGrantType();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string grant_type = 3 [json_name = "grantType"];</code>
     * @param value The bytes for grantType to set.
     * @return This builder for chaining.
     */
    public Builder setGrantTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      grantType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object scope_ = "";
    /**
     * <code>optional string scope = 4 [json_name = "scope"];</code>
     * @return Whether the scope field is set.
     */
    public boolean hasScope() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional string scope = 4 [json_name = "scope"];</code>
     * @return The scope.
     */
    public java.lang.String getScope() {
      java.lang.Object ref = scope_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scope_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string scope = 4 [json_name = "scope"];</code>
     * @return The bytes for scope.
     */
    public com.google.protobuf.ByteString
        getScopeBytes() {
      java.lang.Object ref = scope_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scope_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string scope = 4 [json_name = "scope"];</code>
     * @param value The scope to set.
     * @return This builder for chaining.
     */
    public Builder setScope(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      scope_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional string scope = 4 [json_name = "scope"];</code>
     * @return This builder for chaining.
     */
    public Builder clearScope() {
      scope_ = getDefaultInstance().getScope();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>optional string scope = 4 [json_name = "scope"];</code>
     * @param value The bytes for scope to set.
     * @return This builder for chaining.
     */
    public Builder setScopeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      scope_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:chalk.server.v1.GetTokenRequest)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.GetTokenRequest)
  private static final ai.chalk.protos.chalk.server.v1.GetTokenRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.GetTokenRequest();
  }

  public static ai.chalk.protos.chalk.server.v1.GetTokenRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTokenRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetTokenRequest>() {
    @java.lang.Override
    public GetTokenRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetTokenRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTokenRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.GetTokenRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

