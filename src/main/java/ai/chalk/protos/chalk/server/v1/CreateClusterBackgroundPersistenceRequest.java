// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/builder.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.CreateClusterBackgroundPersistenceRequest}
 */
public final class CreateClusterBackgroundPersistenceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.CreateClusterBackgroundPersistenceRequest)
    CreateClusterBackgroundPersistenceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateClusterBackgroundPersistenceRequest.newBuilder() to construct.
  private CreateClusterBackgroundPersistenceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateClusterBackgroundPersistenceRequest() {
    environmentIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    specsString_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateClusterBackgroundPersistenceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.BuilderProto.internal_static_chalk_server_v1_CreateClusterBackgroundPersistenceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.BuilderProto.internal_static_chalk_server_v1_CreateClusterBackgroundPersistenceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest.class, ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ENVIRONMENT_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList environmentIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string environment_ids = 1 [json_name = "environmentIds"];</code>
   * @return A list containing the environmentIds.
   */
  public com.google.protobuf.ProtocolStringList
      getEnvironmentIdsList() {
    return environmentIds_;
  }
  /**
   * <code>repeated string environment_ids = 1 [json_name = "environmentIds"];</code>
   * @return The count of environmentIds.
   */
  public int getEnvironmentIdsCount() {
    return environmentIds_.size();
  }
  /**
   * <code>repeated string environment_ids = 1 [json_name = "environmentIds"];</code>
   * @param index The index of the element to return.
   * @return The environmentIds at the given index.
   */
  public java.lang.String getEnvironmentIds(int index) {
    return environmentIds_.get(index);
  }
  /**
   * <code>repeated string environment_ids = 1 [json_name = "environmentIds"];</code>
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
   * <pre>
   * use specs instead
   * </pre>
   *
   * <code>string specs_string = 2 [json_name = "specsString", deprecated = true];</code>
   * @deprecated chalk.server.v1.CreateClusterBackgroundPersistenceRequest.specs_string is deprecated.
   *     See chalk/server/v1/builder.proto;l=267
   * @return The specsString.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getSpecsString() {
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
   * <pre>
   * use specs instead
   * </pre>
   *
   * <code>string specs_string = 2 [json_name = "specsString", deprecated = true];</code>
   * @deprecated chalk.server.v1.CreateClusterBackgroundPersistenceRequest.specs_string is deprecated.
   *     See chalk/server/v1/builder.proto;l=267
   * @return The bytes for specsString.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
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

  public static final int SPECS_FIELD_NUMBER = 3;
  private ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs specs_;
  /**
   * <code>.chalk.server.v1.BackgroundPersistenceDeploymentSpecs specs = 3 [json_name = "specs"];</code>
   * @return Whether the specs field is set.
   */
  @java.lang.Override
  public boolean hasSpecs() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.server.v1.BackgroundPersistenceDeploymentSpecs specs = 3 [json_name = "specs"];</code>
   * @return The specs.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs getSpecs() {
    return specs_ == null ? ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs.getDefaultInstance() : specs_;
  }
  /**
   * <code>.chalk.server.v1.BackgroundPersistenceDeploymentSpecs specs = 3 [json_name = "specs"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecsOrBuilder getSpecsOrBuilder() {
    return specs_ == null ? ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs.getDefaultInstance() : specs_;
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
    for (int i = 0; i < environmentIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, environmentIds_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(specsString_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, specsString_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getSpecs());
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
      for (int i = 0; i < environmentIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(environmentIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEnvironmentIdsList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(specsString_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, specsString_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSpecs());
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest other = (ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest) obj;

    if (!getEnvironmentIdsList()
        .equals(other.getEnvironmentIdsList())) return false;
    if (!getSpecsString()
        .equals(other.getSpecsString())) return false;
    if (hasSpecs() != other.hasSpecs()) return false;
    if (hasSpecs()) {
      if (!getSpecs()
          .equals(other.getSpecs())) return false;
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
    if (getEnvironmentIdsCount() > 0) {
      hash = (37 * hash) + ENVIRONMENT_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getEnvironmentIdsList().hashCode();
    }
    hash = (37 * hash) + SPECS_STRING_FIELD_NUMBER;
    hash = (53 * hash) + getSpecsString().hashCode();
    if (hasSpecs()) {
      hash = (37 * hash) + SPECS_FIELD_NUMBER;
      hash = (53 * hash) + getSpecs().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest prototype) {
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
   * Protobuf type {@code chalk.server.v1.CreateClusterBackgroundPersistenceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.CreateClusterBackgroundPersistenceRequest)
      ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.BuilderProto.internal_static_chalk_server_v1_CreateClusterBackgroundPersistenceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.BuilderProto.internal_static_chalk_server_v1_CreateClusterBackgroundPersistenceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest.class, ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest.newBuilder()
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
        getSpecsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      environmentIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      specsString_ = "";
      specs_ = null;
      if (specsBuilder_ != null) {
        specsBuilder_.dispose();
        specsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.BuilderProto.internal_static_chalk_server_v1_CreateClusterBackgroundPersistenceRequest_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest build() {
      ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest buildPartial() {
      ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest result = new ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        environmentIds_.makeImmutable();
        result.environmentIds_ = environmentIds_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.specsString_ = specsString_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.specs_ = specsBuilder_ == null
            ? specs_
            : specsBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest other) {
      if (other == ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest.getDefaultInstance()) return this;
      if (!other.environmentIds_.isEmpty()) {
        if (environmentIds_.isEmpty()) {
          environmentIds_ = other.environmentIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureEnvironmentIdsIsMutable();
          environmentIds_.addAll(other.environmentIds_);
        }
        onChanged();
      }
      if (!other.getSpecsString().isEmpty()) {
        specsString_ = other.specsString_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasSpecs()) {
        mergeSpecs(other.getSpecs());
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
              ensureEnvironmentIdsIsMutable();
              environmentIds_.add(s);
              break;
            } // case 10
            case 18: {
              specsString_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getSpecsFieldBuilder().getBuilder(),
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

    private com.google.protobuf.LazyStringArrayList environmentIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureEnvironmentIdsIsMutable() {
      if (!environmentIds_.isModifiable()) {
        environmentIds_ = new com.google.protobuf.LazyStringArrayList(environmentIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string environment_ids = 1 [json_name = "environmentIds"];</code>
     * @return A list containing the environmentIds.
     */
    public com.google.protobuf.ProtocolStringList
        getEnvironmentIdsList() {
      environmentIds_.makeImmutable();
      return environmentIds_;
    }
    /**
     * <code>repeated string environment_ids = 1 [json_name = "environmentIds"];</code>
     * @return The count of environmentIds.
     */
    public int getEnvironmentIdsCount() {
      return environmentIds_.size();
    }
    /**
     * <code>repeated string environment_ids = 1 [json_name = "environmentIds"];</code>
     * @param index The index of the element to return.
     * @return The environmentIds at the given index.
     */
    public java.lang.String getEnvironmentIds(int index) {
      return environmentIds_.get(index);
    }
    /**
     * <code>repeated string environment_ids = 1 [json_name = "environmentIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the environmentIds at the given index.
     */
    public com.google.protobuf.ByteString
        getEnvironmentIdsBytes(int index) {
      return environmentIds_.getByteString(index);
    }
    /**
     * <code>repeated string environment_ids = 1 [json_name = "environmentIds"];</code>
     * @param index The index to set the value at.
     * @param value The environmentIds to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironmentIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEnvironmentIdsIsMutable();
      environmentIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string environment_ids = 1 [json_name = "environmentIds"];</code>
     * @param value The environmentIds to add.
     * @return This builder for chaining.
     */
    public Builder addEnvironmentIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEnvironmentIdsIsMutable();
      environmentIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string environment_ids = 1 [json_name = "environmentIds"];</code>
     * @param values The environmentIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllEnvironmentIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureEnvironmentIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, environmentIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string environment_ids = 1 [json_name = "environmentIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEnvironmentIds() {
      environmentIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string environment_ids = 1 [json_name = "environmentIds"];</code>
     * @param value The bytes of the environmentIds to add.
     * @return This builder for chaining.
     */
    public Builder addEnvironmentIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureEnvironmentIdsIsMutable();
      environmentIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object specsString_ = "";
    /**
     * <pre>
     * use specs instead
     * </pre>
     *
     * <code>string specs_string = 2 [json_name = "specsString", deprecated = true];</code>
     * @deprecated chalk.server.v1.CreateClusterBackgroundPersistenceRequest.specs_string is deprecated.
     *     See chalk/server/v1/builder.proto;l=267
     * @return The specsString.
     */
    @java.lang.Deprecated public java.lang.String getSpecsString() {
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
     * <pre>
     * use specs instead
     * </pre>
     *
     * <code>string specs_string = 2 [json_name = "specsString", deprecated = true];</code>
     * @deprecated chalk.server.v1.CreateClusterBackgroundPersistenceRequest.specs_string is deprecated.
     *     See chalk/server/v1/builder.proto;l=267
     * @return The bytes for specsString.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
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
     * <pre>
     * use specs instead
     * </pre>
     *
     * <code>string specs_string = 2 [json_name = "specsString", deprecated = true];</code>
     * @deprecated chalk.server.v1.CreateClusterBackgroundPersistenceRequest.specs_string is deprecated.
     *     See chalk/server/v1/builder.proto;l=267
     * @param value The specsString to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setSpecsString(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      specsString_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * use specs instead
     * </pre>
     *
     * <code>string specs_string = 2 [json_name = "specsString", deprecated = true];</code>
     * @deprecated chalk.server.v1.CreateClusterBackgroundPersistenceRequest.specs_string is deprecated.
     *     See chalk/server/v1/builder.proto;l=267
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearSpecsString() {
      specsString_ = getDefaultInstance().getSpecsString();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * use specs instead
     * </pre>
     *
     * <code>string specs_string = 2 [json_name = "specsString", deprecated = true];</code>
     * @deprecated chalk.server.v1.CreateClusterBackgroundPersistenceRequest.specs_string is deprecated.
     *     See chalk/server/v1/builder.proto;l=267
     * @param value The bytes for specsString to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setSpecsStringBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      specsString_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs specs_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs, ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs.Builder, ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecsOrBuilder> specsBuilder_;
    /**
     * <code>.chalk.server.v1.BackgroundPersistenceDeploymentSpecs specs = 3 [json_name = "specs"];</code>
     * @return Whether the specs field is set.
     */
    public boolean hasSpecs() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.chalk.server.v1.BackgroundPersistenceDeploymentSpecs specs = 3 [json_name = "specs"];</code>
     * @return The specs.
     */
    public ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs getSpecs() {
      if (specsBuilder_ == null) {
        return specs_ == null ? ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs.getDefaultInstance() : specs_;
      } else {
        return specsBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.server.v1.BackgroundPersistenceDeploymentSpecs specs = 3 [json_name = "specs"];</code>
     */
    public Builder setSpecs(ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs value) {
      if (specsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        specs_ = value;
      } else {
        specsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.BackgroundPersistenceDeploymentSpecs specs = 3 [json_name = "specs"];</code>
     */
    public Builder setSpecs(
        ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs.Builder builderForValue) {
      if (specsBuilder_ == null) {
        specs_ = builderForValue.build();
      } else {
        specsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.BackgroundPersistenceDeploymentSpecs specs = 3 [json_name = "specs"];</code>
     */
    public Builder mergeSpecs(ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs value) {
      if (specsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          specs_ != null &&
          specs_ != ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs.getDefaultInstance()) {
          getSpecsBuilder().mergeFrom(value);
        } else {
          specs_ = value;
        }
      } else {
        specsBuilder_.mergeFrom(value);
      }
      if (specs_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.server.v1.BackgroundPersistenceDeploymentSpecs specs = 3 [json_name = "specs"];</code>
     */
    public Builder clearSpecs() {
      bitField0_ = (bitField0_ & ~0x00000004);
      specs_ = null;
      if (specsBuilder_ != null) {
        specsBuilder_.dispose();
        specsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.BackgroundPersistenceDeploymentSpecs specs = 3 [json_name = "specs"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs.Builder getSpecsBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getSpecsFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.server.v1.BackgroundPersistenceDeploymentSpecs specs = 3 [json_name = "specs"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecsOrBuilder getSpecsOrBuilder() {
      if (specsBuilder_ != null) {
        return specsBuilder_.getMessageOrBuilder();
      } else {
        return specs_ == null ?
            ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs.getDefaultInstance() : specs_;
      }
    }
    /**
     * <code>.chalk.server.v1.BackgroundPersistenceDeploymentSpecs specs = 3 [json_name = "specs"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs, ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs.Builder, ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecsOrBuilder> 
        getSpecsFieldBuilder() {
      if (specsBuilder_ == null) {
        specsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs, ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecs.Builder, ai.chalk.protos.chalk.server.v1.BackgroundPersistenceDeploymentSpecsOrBuilder>(
                getSpecs(),
                getParentForChildren(),
                isClean());
        specs_ = null;
      }
      return specsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.server.v1.CreateClusterBackgroundPersistenceRequest)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.CreateClusterBackgroundPersistenceRequest)
  private static final ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest();
  }

  public static ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateClusterBackgroundPersistenceRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateClusterBackgroundPersistenceRequest>() {
    @java.lang.Override
    public CreateClusterBackgroundPersistenceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateClusterBackgroundPersistenceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateClusterBackgroundPersistenceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

