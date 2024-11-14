// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/builder.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.CreateClusterGatewayRequest}
 */
public final class CreateClusterGatewayRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.CreateClusterGatewayRequest)
    CreateClusterGatewayRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateClusterGatewayRequest.newBuilder() to construct.
  private CreateClusterGatewayRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateClusterGatewayRequest() {
    environmentId_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    environmentIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    specsString_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateClusterGatewayRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.BuilderProto.internal_static_chalk_server_v1_CreateClusterGatewayRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.BuilderProto.internal_static_chalk_server_v1_CreateClusterGatewayRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest.class, ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest.Builder.class);
  }

  public static final int ENVIRONMENT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList environmentId_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * spelling
   * </pre>
   *
   * <code>repeated string environment_id = 1 [json_name = "environmentId", deprecated = true];</code>
   * @deprecated chalk.server.v1.CreateClusterGatewayRequest.environment_id is deprecated.
   *     See chalk/server/v1/builder.proto;l=157
   * @return A list containing the environmentId.
   */
  @java.lang.Deprecated public com.google.protobuf.ProtocolStringList
      getEnvironmentIdList() {
    return environmentId_;
  }
  /**
   * <pre>
   * spelling
   * </pre>
   *
   * <code>repeated string environment_id = 1 [json_name = "environmentId", deprecated = true];</code>
   * @deprecated chalk.server.v1.CreateClusterGatewayRequest.environment_id is deprecated.
   *     See chalk/server/v1/builder.proto;l=157
   * @return The count of environmentId.
   */
  @java.lang.Deprecated public int getEnvironmentIdCount() {
    return environmentId_.size();
  }
  /**
   * <pre>
   * spelling
   * </pre>
   *
   * <code>repeated string environment_id = 1 [json_name = "environmentId", deprecated = true];</code>
   * @deprecated chalk.server.v1.CreateClusterGatewayRequest.environment_id is deprecated.
   *     See chalk/server/v1/builder.proto;l=157
   * @param index The index of the element to return.
   * @return The environmentId at the given index.
   */
  @java.lang.Deprecated public java.lang.String getEnvironmentId(int index) {
    return environmentId_.get(index);
  }
  /**
   * <pre>
   * spelling
   * </pre>
   *
   * <code>repeated string environment_id = 1 [json_name = "environmentId", deprecated = true];</code>
   * @deprecated chalk.server.v1.CreateClusterGatewayRequest.environment_id is deprecated.
   *     See chalk/server/v1/builder.proto;l=157
   * @param index The index of the value to return.
   * @return The bytes of the environmentId at the given index.
   */
  @java.lang.Deprecated public com.google.protobuf.ByteString
      getEnvironmentIdBytes(int index) {
    return environmentId_.getByteString(index);
  }

  public static final int ENVIRONMENT_IDS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList environmentIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string environment_ids = 3 [json_name = "environmentIds"];</code>
   * @return A list containing the environmentIds.
   */
  public com.google.protobuf.ProtocolStringList
      getEnvironmentIdsList() {
    return environmentIds_;
  }
  /**
   * <code>repeated string environment_ids = 3 [json_name = "environmentIds"];</code>
   * @return The count of environmentIds.
   */
  public int getEnvironmentIdsCount() {
    return environmentIds_.size();
  }
  /**
   * <code>repeated string environment_ids = 3 [json_name = "environmentIds"];</code>
   * @param index The index of the element to return.
   * @return The environmentIds at the given index.
   */
  public java.lang.String getEnvironmentIds(int index) {
    return environmentIds_.get(index);
  }
  /**
   * <code>repeated string environment_ids = 3 [json_name = "environmentIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the environmentIds at the given index.
   */
  public com.google.protobuf.ByteString
      getEnvironmentIdsBytes(int index) {
    return environmentIds_.getByteString(index);
  }

  public static final int SPECS_STRING_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object specsString_ = "";
  /**
   * <code>string specs_string = 2 [json_name = "specsString"];</code>
   * @return The specsString.
   */
  @java.lang.Override
  public java.lang.String getSpecsString() {
    java.lang.Object ref = specsString_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      specsString_ = s;
      return s;
    }
  }
  /**
   * <code>string specs_string = 2 [json_name = "specsString"];</code>
   * @return The bytes for specsString.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSpecsStringBytes() {
    java.lang.Object ref = specsString_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      specsString_ = b;
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
    for (int i = 0; i < environmentId_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, environmentId_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(specsString_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, specsString_);
    }
    for (int i = 0; i < environmentIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, environmentIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < environmentId_.size(); i++) {
        dataSize += computeStringSizeNoTag(environmentId_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEnvironmentIdList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(specsString_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, specsString_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < environmentIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(environmentIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEnvironmentIdsList().size();
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest other = (ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest) obj;

    if (!getEnvironmentIdList()
        .equals(other.getEnvironmentIdList())) return false;
    if (!getEnvironmentIdsList()
        .equals(other.getEnvironmentIdsList())) return false;
    if (!getSpecsString()
        .equals(other.getSpecsString())) return false;
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
    if (getEnvironmentIdCount() > 0) {
      hash = (37 * hash) + ENVIRONMENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEnvironmentIdList().hashCode();
    }
    if (getEnvironmentIdsCount() > 0) {
      hash = (37 * hash) + ENVIRONMENT_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getEnvironmentIdsList().hashCode();
    }
    hash = (37 * hash) + SPECS_STRING_FIELD_NUMBER;
    hash = (53 * hash) + getSpecsString().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest prototype) {
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
   * Protobuf type {@code chalk.server.v1.CreateClusterGatewayRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.CreateClusterGatewayRequest)
      ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.BuilderProto.internal_static_chalk_server_v1_CreateClusterGatewayRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.BuilderProto.internal_static_chalk_server_v1_CreateClusterGatewayRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest.class, ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest.newBuilder()
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
      environmentId_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      environmentIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      specsString_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.BuilderProto.internal_static_chalk_server_v1_CreateClusterGatewayRequest_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest build() {
      ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest buildPartial() {
      ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest result = new ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        environmentId_.makeImmutable();
        result.environmentId_ = environmentId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        environmentIds_.makeImmutable();
        result.environmentIds_ = environmentIds_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.specsString_ = specsString_;
      }
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
      if (other instanceof ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest other) {
      if (other == ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest.getDefaultInstance()) return this;
      if (!other.environmentId_.isEmpty()) {
        if (environmentId_.isEmpty()) {
          environmentId_ = other.environmentId_;
          bitField0_ |= 0x00000001;
        } else {
          ensureEnvironmentIdIsMutable();
          environmentId_.addAll(other.environmentId_);
        }
        onChanged();
      }
      if (!other.environmentIds_.isEmpty()) {
        if (environmentIds_.isEmpty()) {
          environmentIds_ = other.environmentIds_;
          bitField0_ |= 0x00000002;
        } else {
          ensureEnvironmentIdsIsMutable();
          environmentIds_.addAll(other.environmentIds_);
        }
        onChanged();
      }
      if (!other.getSpecsString().isEmpty()) {
        specsString_ = other.specsString_;
        bitField0_ |= 0x00000004;
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureEnvironmentIdIsMutable();
              environmentId_.add(s);
              break;
            } // case 10
            case 18: {
              specsString_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureEnvironmentIdsIsMutable();
              environmentIds_.add(s);
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

    private com.google.protobuf.LazyStringArrayList environmentId_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureEnvironmentIdIsMutable() {
      if (!environmentId_.isModifiable()) {
        environmentId_ = new com.google.protobuf.LazyStringArrayList(environmentId_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * spelling
     * </pre>
     *
     * <code>repeated string environment_id = 1 [json_name = "environmentId", deprecated = true];</code>
     * @deprecated chalk.server.v1.CreateClusterGatewayRequest.environment_id is deprecated.
     *     See chalk/server/v1/builder.proto;l=157
     * @return A list containing the environmentId.
     */
    @java.lang.Deprecated public com.google.protobuf.ProtocolStringList
        getEnvironmentIdList() {
      environmentId_.makeImmutable();
      return environmentId_;
    }
    /**
     * <pre>
     * spelling
     * </pre>
     *
     * <code>repeated string environment_id = 1 [json_name = "environmentId", deprecated = true];</code>
     * @deprecated chalk.server.v1.CreateClusterGatewayRequest.environment_id is deprecated.
     *     See chalk/server/v1/builder.proto;l=157
     * @return The count of environmentId.
     */
    @java.lang.Deprecated public int getEnvironmentIdCount() {
      return environmentId_.size();
    }
    /**
     * <pre>
     * spelling
     * </pre>
     *
     * <code>repeated string environment_id = 1 [json_name = "environmentId", deprecated = true];</code>
     * @deprecated chalk.server.v1.CreateClusterGatewayRequest.environment_id is deprecated.
     *     See chalk/server/v1/builder.proto;l=157
     * @param index The index of the element to return.
     * @return The environmentId at the given index.
     */
    @java.lang.Deprecated public java.lang.String getEnvironmentId(int index) {
      return environmentId_.get(index);
    }
    /**
     * <pre>
     * spelling
     * </pre>
     *
     * <code>repeated string environment_id = 1 [json_name = "environmentId", deprecated = true];</code>
     * @deprecated chalk.server.v1.CreateClusterGatewayRequest.environment_id is deprecated.
     *     See chalk/server/v1/builder.proto;l=157
     * @param index The index of the value to return.
     * @return The bytes of the environmentId at the given index.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getEnvironmentIdBytes(int index) {
      return environmentId_.getByteString(index);
    }
    /**
     * <pre>
     * spelling
     * </pre>
     *
     * <code>repeated string environment_id = 1 [json_name = "environmentId", deprecated = true];</code>
     * @deprecated chalk.server.v1.CreateClusterGatewayRequest.environment_id is deprecated.
     *     See chalk/server/v1/builder.proto;l=157
     * @param index The index to set the value at.
     * @param value The environmentId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setEnvironmentId(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEnvironmentIdIsMutable();
      environmentId_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * spelling
     * </pre>
     *
     * <code>repeated string environment_id = 1 [json_name = "environmentId", deprecated = true];</code>
     * @deprecated chalk.server.v1.CreateClusterGatewayRequest.environment_id is deprecated.
     *     See chalk/server/v1/builder.proto;l=157
     * @param value The environmentId to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addEnvironmentId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEnvironmentIdIsMutable();
      environmentId_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * spelling
     * </pre>
     *
     * <code>repeated string environment_id = 1 [json_name = "environmentId", deprecated = true];</code>
     * @deprecated chalk.server.v1.CreateClusterGatewayRequest.environment_id is deprecated.
     *     See chalk/server/v1/builder.proto;l=157
     * @param values The environmentId to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addAllEnvironmentId(
        java.lang.Iterable<java.lang.String> values) {
      ensureEnvironmentIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, environmentId_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * spelling
     * </pre>
     *
     * <code>repeated string environment_id = 1 [json_name = "environmentId", deprecated = true];</code>
     * @deprecated chalk.server.v1.CreateClusterGatewayRequest.environment_id is deprecated.
     *     See chalk/server/v1/builder.proto;l=157
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearEnvironmentId() {
      environmentId_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * spelling
     * </pre>
     *
     * <code>repeated string environment_id = 1 [json_name = "environmentId", deprecated = true];</code>
     * @deprecated chalk.server.v1.CreateClusterGatewayRequest.environment_id is deprecated.
     *     See chalk/server/v1/builder.proto;l=157
     * @param value The bytes of the environmentId to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addEnvironmentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureEnvironmentIdIsMutable();
      environmentId_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList environmentIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureEnvironmentIdsIsMutable() {
      if (!environmentIds_.isModifiable()) {
        environmentIds_ = new com.google.protobuf.LazyStringArrayList(environmentIds_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated string environment_ids = 3 [json_name = "environmentIds"];</code>
     * @return A list containing the environmentIds.
     */
    public com.google.protobuf.ProtocolStringList
        getEnvironmentIdsList() {
      environmentIds_.makeImmutable();
      return environmentIds_;
    }
    /**
     * <code>repeated string environment_ids = 3 [json_name = "environmentIds"];</code>
     * @return The count of environmentIds.
     */
    public int getEnvironmentIdsCount() {
      return environmentIds_.size();
    }
    /**
     * <code>repeated string environment_ids = 3 [json_name = "environmentIds"];</code>
     * @param index The index of the element to return.
     * @return The environmentIds at the given index.
     */
    public java.lang.String getEnvironmentIds(int index) {
      return environmentIds_.get(index);
    }
    /**
     * <code>repeated string environment_ids = 3 [json_name = "environmentIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the environmentIds at the given index.
     */
    public com.google.protobuf.ByteString
        getEnvironmentIdsBytes(int index) {
      return environmentIds_.getByteString(index);
    }
    /**
     * <code>repeated string environment_ids = 3 [json_name = "environmentIds"];</code>
     * @param index The index to set the value at.
     * @param value The environmentIds to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironmentIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEnvironmentIdsIsMutable();
      environmentIds_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string environment_ids = 3 [json_name = "environmentIds"];</code>
     * @param value The environmentIds to add.
     * @return This builder for chaining.
     */
    public Builder addEnvironmentIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEnvironmentIdsIsMutable();
      environmentIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string environment_ids = 3 [json_name = "environmentIds"];</code>
     * @param values The environmentIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllEnvironmentIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureEnvironmentIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, environmentIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string environment_ids = 3 [json_name = "environmentIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEnvironmentIds() {
      environmentIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string environment_ids = 3 [json_name = "environmentIds"];</code>
     * @param value The bytes of the environmentIds to add.
     * @return This builder for chaining.
     */
    public Builder addEnvironmentIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureEnvironmentIdsIsMutable();
      environmentIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object specsString_ = "";
    /**
     * <code>string specs_string = 2 [json_name = "specsString"];</code>
     * @return The specsString.
     */
    public java.lang.String getSpecsString() {
      java.lang.Object ref = specsString_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        specsString_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string specs_string = 2 [json_name = "specsString"];</code>
     * @return The bytes for specsString.
     */
    public com.google.protobuf.ByteString
        getSpecsStringBytes() {
      java.lang.Object ref = specsString_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        specsString_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string specs_string = 2 [json_name = "specsString"];</code>
     * @param value The specsString to set.
     * @return This builder for chaining.
     */
    public Builder setSpecsString(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      specsString_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string specs_string = 2 [json_name = "specsString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSpecsString() {
      specsString_ = getDefaultInstance().getSpecsString();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string specs_string = 2 [json_name = "specsString"];</code>
     * @param value The bytes for specsString to set.
     * @return This builder for chaining.
     */
    public Builder setSpecsStringBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      specsString_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:chalk.server.v1.CreateClusterGatewayRequest)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.CreateClusterGatewayRequest)
  private static final ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest();
  }

  public static ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateClusterGatewayRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateClusterGatewayRequest>() {
    @java.lang.Override
    public CreateClusterGatewayRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateClusterGatewayRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateClusterGatewayRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

