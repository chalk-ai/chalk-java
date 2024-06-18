// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.UpsertFeaturePermissionsRequest}
 */
public final class UpsertFeaturePermissionsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.UpsertFeaturePermissionsRequest)
    UpsertFeaturePermissionsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpsertFeaturePermissionsRequest.newBuilder() to construct.
  private UpsertFeaturePermissionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpsertFeaturePermissionsRequest() {
    role_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpsertFeaturePermissionsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_UpsertFeaturePermissionsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_UpsertFeaturePermissionsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest.class, ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ROLE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object role_ = "";
  /**
   * <code>string role = 1 [json_name = "role"];</code>
   * @return The role.
   */
  @java.lang.Override
  public java.lang.String getRole() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      role_ = s;
      return s;
    }
  }
  /**
   * <code>string role = 1 [json_name = "role"];</code>
   * @return The bytes for role.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRoleBytes() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      role_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERMISSIONS_FIELD_NUMBER = 2;
  private ai.chalk.protos.chalk.auth.v1.FeaturePermissions permissions_;
  /**
   * <code>.chalk.auth.v1.FeaturePermissions permissions = 2 [json_name = "permissions"];</code>
   * @return Whether the permissions field is set.
   */
  @java.lang.Override
  public boolean hasPermissions() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.auth.v1.FeaturePermissions permissions = 2 [json_name = "permissions"];</code>
   * @return The permissions.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.auth.v1.FeaturePermissions getPermissions() {
    return permissions_ == null ? ai.chalk.protos.chalk.auth.v1.FeaturePermissions.getDefaultInstance() : permissions_;
  }
  /**
   * <code>.chalk.auth.v1.FeaturePermissions permissions = 2 [json_name = "permissions"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.auth.v1.FeaturePermissionsOrBuilder getPermissionsOrBuilder() {
    return permissions_ == null ? ai.chalk.protos.chalk.auth.v1.FeaturePermissions.getDefaultInstance() : permissions_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(role_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, role_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getPermissions());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(role_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, role_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPermissions());
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest other = (ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest) obj;

    if (!getRole()
        .equals(other.getRole())) return false;
    if (hasPermissions() != other.hasPermissions()) return false;
    if (hasPermissions()) {
      if (!getPermissions()
          .equals(other.getPermissions())) return false;
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
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + getRole().hashCode();
    if (hasPermissions()) {
      hash = (37 * hash) + PERMISSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPermissions().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest prototype) {
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
   * Protobuf type {@code chalk.server.v1.UpsertFeaturePermissionsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.UpsertFeaturePermissionsRequest)
      ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_UpsertFeaturePermissionsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_UpsertFeaturePermissionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest.class, ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest.newBuilder()
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
        getPermissionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      role_ = "";
      permissions_ = null;
      if (permissionsBuilder_ != null) {
        permissionsBuilder_.dispose();
        permissionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_UpsertFeaturePermissionsRequest_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest build() {
      ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest buildPartial() {
      ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest result = new ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.role_ = role_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.permissions_ = permissionsBuilder_ == null
            ? permissions_
            : permissionsBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest other) {
      if (other == ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest.getDefaultInstance()) return this;
      if (!other.getRole().isEmpty()) {
        role_ = other.role_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPermissions()) {
        mergePermissions(other.getPermissions());
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
              role_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPermissionsFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object role_ = "";
    /**
     * <code>string role = 1 [json_name = "role"];</code>
     * @return The role.
     */
    public java.lang.String getRole() {
      java.lang.Object ref = role_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        role_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string role = 1 [json_name = "role"];</code>
     * @return The bytes for role.
     */
    public com.google.protobuf.ByteString
        getRoleBytes() {
      java.lang.Object ref = role_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        role_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string role = 1 [json_name = "role"];</code>
     * @param value The role to set.
     * @return This builder for chaining.
     */
    public Builder setRole(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      role_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string role = 1 [json_name = "role"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRole() {
      role_ = getDefaultInstance().getRole();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string role = 1 [json_name = "role"];</code>
     * @param value The bytes for role to set.
     * @return This builder for chaining.
     */
    public Builder setRoleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      role_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private ai.chalk.protos.chalk.auth.v1.FeaturePermissions permissions_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.auth.v1.FeaturePermissions, ai.chalk.protos.chalk.auth.v1.FeaturePermissions.Builder, ai.chalk.protos.chalk.auth.v1.FeaturePermissionsOrBuilder> permissionsBuilder_;
    /**
     * <code>.chalk.auth.v1.FeaturePermissions permissions = 2 [json_name = "permissions"];</code>
     * @return Whether the permissions field is set.
     */
    public boolean hasPermissions() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.chalk.auth.v1.FeaturePermissions permissions = 2 [json_name = "permissions"];</code>
     * @return The permissions.
     */
    public ai.chalk.protos.chalk.auth.v1.FeaturePermissions getPermissions() {
      if (permissionsBuilder_ == null) {
        return permissions_ == null ? ai.chalk.protos.chalk.auth.v1.FeaturePermissions.getDefaultInstance() : permissions_;
      } else {
        return permissionsBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.auth.v1.FeaturePermissions permissions = 2 [json_name = "permissions"];</code>
     */
    public Builder setPermissions(ai.chalk.protos.chalk.auth.v1.FeaturePermissions value) {
      if (permissionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        permissions_ = value;
      } else {
        permissionsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.auth.v1.FeaturePermissions permissions = 2 [json_name = "permissions"];</code>
     */
    public Builder setPermissions(
        ai.chalk.protos.chalk.auth.v1.FeaturePermissions.Builder builderForValue) {
      if (permissionsBuilder_ == null) {
        permissions_ = builderForValue.build();
      } else {
        permissionsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.auth.v1.FeaturePermissions permissions = 2 [json_name = "permissions"];</code>
     */
    public Builder mergePermissions(ai.chalk.protos.chalk.auth.v1.FeaturePermissions value) {
      if (permissionsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          permissions_ != null &&
          permissions_ != ai.chalk.protos.chalk.auth.v1.FeaturePermissions.getDefaultInstance()) {
          getPermissionsBuilder().mergeFrom(value);
        } else {
          permissions_ = value;
        }
      } else {
        permissionsBuilder_.mergeFrom(value);
      }
      if (permissions_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.auth.v1.FeaturePermissions permissions = 2 [json_name = "permissions"];</code>
     */
    public Builder clearPermissions() {
      bitField0_ = (bitField0_ & ~0x00000002);
      permissions_ = null;
      if (permissionsBuilder_ != null) {
        permissionsBuilder_.dispose();
        permissionsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.auth.v1.FeaturePermissions permissions = 2 [json_name = "permissions"];</code>
     */
    public ai.chalk.protos.chalk.auth.v1.FeaturePermissions.Builder getPermissionsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPermissionsFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.auth.v1.FeaturePermissions permissions = 2 [json_name = "permissions"];</code>
     */
    public ai.chalk.protos.chalk.auth.v1.FeaturePermissionsOrBuilder getPermissionsOrBuilder() {
      if (permissionsBuilder_ != null) {
        return permissionsBuilder_.getMessageOrBuilder();
      } else {
        return permissions_ == null ?
            ai.chalk.protos.chalk.auth.v1.FeaturePermissions.getDefaultInstance() : permissions_;
      }
    }
    /**
     * <code>.chalk.auth.v1.FeaturePermissions permissions = 2 [json_name = "permissions"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.auth.v1.FeaturePermissions, ai.chalk.protos.chalk.auth.v1.FeaturePermissions.Builder, ai.chalk.protos.chalk.auth.v1.FeaturePermissionsOrBuilder> 
        getPermissionsFieldBuilder() {
      if (permissionsBuilder_ == null) {
        permissionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.auth.v1.FeaturePermissions, ai.chalk.protos.chalk.auth.v1.FeaturePermissions.Builder, ai.chalk.protos.chalk.auth.v1.FeaturePermissionsOrBuilder>(
                getPermissions(),
                getParentForChildren(),
                isClean());
        permissions_ = null;
      }
      return permissionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.server.v1.UpsertFeaturePermissionsRequest)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.UpsertFeaturePermissionsRequest)
  private static final ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest();
  }

  public static ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpsertFeaturePermissionsRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpsertFeaturePermissionsRequest>() {
    @java.lang.Override
    public UpsertFeaturePermissionsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpsertFeaturePermissionsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpsertFeaturePermissionsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
