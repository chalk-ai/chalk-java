// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/builder.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.RebuildDeploymentRequest}
 */
public final class RebuildDeploymentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.RebuildDeploymentRequest)
    RebuildDeploymentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RebuildDeploymentRequest.newBuilder() to construct.
  private RebuildDeploymentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RebuildDeploymentRequest() {
    existingDeploymentId_ = "";
    newImageTag_ = "";
    baseImageOverride_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RebuildDeploymentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.BuilderProto.internal_static_chalk_server_v1_RebuildDeploymentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.BuilderProto.internal_static_chalk_server_v1_RebuildDeploymentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest.class, ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest.Builder.class);
  }

  private int bitField0_;
  public static final int EXISTING_DEPLOYMENT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object existingDeploymentId_ = "";
  /**
   * <code>string existing_deployment_id = 1 [json_name = "existingDeploymentId"];</code>
   * @return The existingDeploymentId.
   */
  @java.lang.Override
  public java.lang.String getExistingDeploymentId() {
    java.lang.Object ref = existingDeploymentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      existingDeploymentId_ = s;
      return s;
    }
  }
  /**
   * <code>string existing_deployment_id = 1 [json_name = "existingDeploymentId"];</code>
   * @return The bytes for existingDeploymentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExistingDeploymentIdBytes() {
    java.lang.Object ref = existingDeploymentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      existingDeploymentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEW_IMAGE_TAG_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object newImageTag_ = "";
  /**
   * <code>string new_image_tag = 2 [json_name = "newImageTag"];</code>
   * @return The newImageTag.
   */
  @java.lang.Override
  public java.lang.String getNewImageTag() {
    java.lang.Object ref = newImageTag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newImageTag_ = s;
      return s;
    }
  }
  /**
   * <code>string new_image_tag = 2 [json_name = "newImageTag"];</code>
   * @return The bytes for newImageTag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewImageTagBytes() {
    java.lang.Object ref = newImageTag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newImageTag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BASE_IMAGE_OVERRIDE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object baseImageOverride_ = "";
  /**
   * <code>optional string base_image_override = 3 [json_name = "baseImageOverride"];</code>
   * @return Whether the baseImageOverride field is set.
   */
  @java.lang.Override
  public boolean hasBaseImageOverride() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string base_image_override = 3 [json_name = "baseImageOverride"];</code>
   * @return The baseImageOverride.
   */
  @java.lang.Override
  public java.lang.String getBaseImageOverride() {
    java.lang.Object ref = baseImageOverride_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      baseImageOverride_ = s;
      return s;
    }
  }
  /**
   * <code>optional string base_image_override = 3 [json_name = "baseImageOverride"];</code>
   * @return The bytes for baseImageOverride.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBaseImageOverrideBytes() {
    java.lang.Object ref = baseImageOverride_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      baseImageOverride_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENABLE_PROFILING_FIELD_NUMBER = 4;
  private boolean enableProfiling_ = false;
  /**
   * <code>bool enable_profiling = 4 [json_name = "enableProfiling"];</code>
   * @return The enableProfiling.
   */
  @java.lang.Override
  public boolean getEnableProfiling() {
    return enableProfiling_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(existingDeploymentId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, existingDeploymentId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newImageTag_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, newImageTag_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, baseImageOverride_);
    }
    if (enableProfiling_ != false) {
      output.writeBool(4, enableProfiling_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(existingDeploymentId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, existingDeploymentId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newImageTag_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, newImageTag_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, baseImageOverride_);
    }
    if (enableProfiling_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, enableProfiling_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest other = (ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest) obj;

    if (!getExistingDeploymentId()
        .equals(other.getExistingDeploymentId())) return false;
    if (!getNewImageTag()
        .equals(other.getNewImageTag())) return false;
    if (hasBaseImageOverride() != other.hasBaseImageOverride()) return false;
    if (hasBaseImageOverride()) {
      if (!getBaseImageOverride()
          .equals(other.getBaseImageOverride())) return false;
    }
    if (getEnableProfiling()
        != other.getEnableProfiling()) return false;
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
    hash = (37 * hash) + EXISTING_DEPLOYMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getExistingDeploymentId().hashCode();
    hash = (37 * hash) + NEW_IMAGE_TAG_FIELD_NUMBER;
    hash = (53 * hash) + getNewImageTag().hashCode();
    if (hasBaseImageOverride()) {
      hash = (37 * hash) + BASE_IMAGE_OVERRIDE_FIELD_NUMBER;
      hash = (53 * hash) + getBaseImageOverride().hashCode();
    }
    hash = (37 * hash) + ENABLE_PROFILING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableProfiling());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest prototype) {
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
   * Protobuf type {@code chalk.server.v1.RebuildDeploymentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.RebuildDeploymentRequest)
      ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.BuilderProto.internal_static_chalk_server_v1_RebuildDeploymentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.BuilderProto.internal_static_chalk_server_v1_RebuildDeploymentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest.class, ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest.newBuilder()
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
      existingDeploymentId_ = "";
      newImageTag_ = "";
      baseImageOverride_ = "";
      enableProfiling_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.BuilderProto.internal_static_chalk_server_v1_RebuildDeploymentRequest_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest build() {
      ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest buildPartial() {
      ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest result = new ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.existingDeploymentId_ = existingDeploymentId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.newImageTag_ = newImageTag_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.baseImageOverride_ = baseImageOverride_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.enableProfiling_ = enableProfiling_;
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
      if (other instanceof ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest other) {
      if (other == ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest.getDefaultInstance()) return this;
      if (!other.getExistingDeploymentId().isEmpty()) {
        existingDeploymentId_ = other.existingDeploymentId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getNewImageTag().isEmpty()) {
        newImageTag_ = other.newImageTag_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasBaseImageOverride()) {
        baseImageOverride_ = other.baseImageOverride_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getEnableProfiling() != false) {
        setEnableProfiling(other.getEnableProfiling());
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
              existingDeploymentId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              newImageTag_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              baseImageOverride_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              enableProfiling_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object existingDeploymentId_ = "";
    /**
     * <code>string existing_deployment_id = 1 [json_name = "existingDeploymentId"];</code>
     * @return The existingDeploymentId.
     */
    public java.lang.String getExistingDeploymentId() {
      java.lang.Object ref = existingDeploymentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        existingDeploymentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string existing_deployment_id = 1 [json_name = "existingDeploymentId"];</code>
     * @return The bytes for existingDeploymentId.
     */
    public com.google.protobuf.ByteString
        getExistingDeploymentIdBytes() {
      java.lang.Object ref = existingDeploymentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        existingDeploymentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string existing_deployment_id = 1 [json_name = "existingDeploymentId"];</code>
     * @param value The existingDeploymentId to set.
     * @return This builder for chaining.
     */
    public Builder setExistingDeploymentId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      existingDeploymentId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string existing_deployment_id = 1 [json_name = "existingDeploymentId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExistingDeploymentId() {
      existingDeploymentId_ = getDefaultInstance().getExistingDeploymentId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string existing_deployment_id = 1 [json_name = "existingDeploymentId"];</code>
     * @param value The bytes for existingDeploymentId to set.
     * @return This builder for chaining.
     */
    public Builder setExistingDeploymentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      existingDeploymentId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object newImageTag_ = "";
    /**
     * <code>string new_image_tag = 2 [json_name = "newImageTag"];</code>
     * @return The newImageTag.
     */
    public java.lang.String getNewImageTag() {
      java.lang.Object ref = newImageTag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newImageTag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string new_image_tag = 2 [json_name = "newImageTag"];</code>
     * @return The bytes for newImageTag.
     */
    public com.google.protobuf.ByteString
        getNewImageTagBytes() {
      java.lang.Object ref = newImageTag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newImageTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string new_image_tag = 2 [json_name = "newImageTag"];</code>
     * @param value The newImageTag to set.
     * @return This builder for chaining.
     */
    public Builder setNewImageTag(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      newImageTag_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string new_image_tag = 2 [json_name = "newImageTag"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNewImageTag() {
      newImageTag_ = getDefaultInstance().getNewImageTag();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string new_image_tag = 2 [json_name = "newImageTag"];</code>
     * @param value The bytes for newImageTag to set.
     * @return This builder for chaining.
     */
    public Builder setNewImageTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      newImageTag_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object baseImageOverride_ = "";
    /**
     * <code>optional string base_image_override = 3 [json_name = "baseImageOverride"];</code>
     * @return Whether the baseImageOverride field is set.
     */
    public boolean hasBaseImageOverride() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string base_image_override = 3 [json_name = "baseImageOverride"];</code>
     * @return The baseImageOverride.
     */
    public java.lang.String getBaseImageOverride() {
      java.lang.Object ref = baseImageOverride_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        baseImageOverride_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string base_image_override = 3 [json_name = "baseImageOverride"];</code>
     * @return The bytes for baseImageOverride.
     */
    public com.google.protobuf.ByteString
        getBaseImageOverrideBytes() {
      java.lang.Object ref = baseImageOverride_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        baseImageOverride_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string base_image_override = 3 [json_name = "baseImageOverride"];</code>
     * @param value The baseImageOverride to set.
     * @return This builder for chaining.
     */
    public Builder setBaseImageOverride(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      baseImageOverride_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional string base_image_override = 3 [json_name = "baseImageOverride"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBaseImageOverride() {
      baseImageOverride_ = getDefaultInstance().getBaseImageOverride();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>optional string base_image_override = 3 [json_name = "baseImageOverride"];</code>
     * @param value The bytes for baseImageOverride to set.
     * @return This builder for chaining.
     */
    public Builder setBaseImageOverrideBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      baseImageOverride_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean enableProfiling_ ;
    /**
     * <code>bool enable_profiling = 4 [json_name = "enableProfiling"];</code>
     * @return The enableProfiling.
     */
    @java.lang.Override
    public boolean getEnableProfiling() {
      return enableProfiling_;
    }
    /**
     * <code>bool enable_profiling = 4 [json_name = "enableProfiling"];</code>
     * @param value The enableProfiling to set.
     * @return This builder for chaining.
     */
    public Builder setEnableProfiling(boolean value) {

      enableProfiling_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_profiling = 4 [json_name = "enableProfiling"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableProfiling() {
      bitField0_ = (bitField0_ & ~0x00000008);
      enableProfiling_ = false;
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


    // @@protoc_insertion_point(builder_scope:chalk.server.v1.RebuildDeploymentRequest)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.RebuildDeploymentRequest)
  private static final ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest();
  }

  public static ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RebuildDeploymentRequest>
      PARSER = new com.google.protobuf.AbstractParser<RebuildDeploymentRequest>() {
    @java.lang.Override
    public RebuildDeploymentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RebuildDeploymentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RebuildDeploymentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

