// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/prompt.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.ListPromptEvaluationRunsRequest}
 */
public final class ListPromptEvaluationRunsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.ListPromptEvaluationRunsRequest)
    ListPromptEvaluationRunsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPromptEvaluationRunsRequest.newBuilder() to construct.
  private ListPromptEvaluationRunsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPromptEvaluationRunsRequest() {
    cursor_ = "";
    namedPromptId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListPromptEvaluationRunsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.PromptProto.internal_static_chalk_server_v1_ListPromptEvaluationRunsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.PromptProto.internal_static_chalk_server_v1_ListPromptEvaluationRunsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest.class, ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int CURSOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cursor_ = "";
  /**
   * <code>optional string cursor = 1 [json_name = "cursor"];</code>
   * @return Whether the cursor field is set.
   */
  @java.lang.Override
  public boolean hasCursor() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string cursor = 1 [json_name = "cursor"];</code>
   * @return The cursor.
   */
  @java.lang.Override
  public java.lang.String getCursor() {
    java.lang.Object ref = cursor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cursor_ = s;
      return s;
    }
  }
  /**
   * <code>optional string cursor = 1 [json_name = "cursor"];</code>
   * @return The bytes for cursor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCursorBytes() {
    java.lang.Object ref = cursor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cursor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIMIT_FIELD_NUMBER = 2;
  private int limit_ = 0;
  /**
   * <code>optional int32 limit = 2 [json_name = "limit"];</code>
   * @return Whether the limit field is set.
   */
  @java.lang.Override
  public boolean hasLimit() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 limit = 2 [json_name = "limit"];</code>
   * @return The limit.
   */
  @java.lang.Override
  public int getLimit() {
    return limit_;
  }

  public static final int NAMED_PROMPT_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object namedPromptId_ = "";
  /**
   * <code>optional string named_prompt_id = 3 [json_name = "namedPromptId"];</code>
   * @return Whether the namedPromptId field is set.
   */
  @java.lang.Override
  public boolean hasNamedPromptId() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional string named_prompt_id = 3 [json_name = "namedPromptId"];</code>
   * @return The namedPromptId.
   */
  @java.lang.Override
  public java.lang.String getNamedPromptId() {
    java.lang.Object ref = namedPromptId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namedPromptId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string named_prompt_id = 3 [json_name = "namedPromptId"];</code>
   * @return The bytes for namedPromptId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNamedPromptIdBytes() {
    java.lang.Object ref = namedPromptId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      namedPromptId_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cursor_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, limit_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, namedPromptId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cursor_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, limit_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, namedPromptId_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest other = (ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest) obj;

    if (hasCursor() != other.hasCursor()) return false;
    if (hasCursor()) {
      if (!getCursor()
          .equals(other.getCursor())) return false;
    }
    if (hasLimit() != other.hasLimit()) return false;
    if (hasLimit()) {
      if (getLimit()
          != other.getLimit()) return false;
    }
    if (hasNamedPromptId() != other.hasNamedPromptId()) return false;
    if (hasNamedPromptId()) {
      if (!getNamedPromptId()
          .equals(other.getNamedPromptId())) return false;
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
    if (hasCursor()) {
      hash = (37 * hash) + CURSOR_FIELD_NUMBER;
      hash = (53 * hash) + getCursor().hashCode();
    }
    if (hasLimit()) {
      hash = (37 * hash) + LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getLimit();
    }
    if (hasNamedPromptId()) {
      hash = (37 * hash) + NAMED_PROMPT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNamedPromptId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest prototype) {
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
   * Protobuf type {@code chalk.server.v1.ListPromptEvaluationRunsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.ListPromptEvaluationRunsRequest)
      ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.PromptProto.internal_static_chalk_server_v1_ListPromptEvaluationRunsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.PromptProto.internal_static_chalk_server_v1_ListPromptEvaluationRunsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest.class, ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest.newBuilder()
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
      cursor_ = "";
      limit_ = 0;
      namedPromptId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.PromptProto.internal_static_chalk_server_v1_ListPromptEvaluationRunsRequest_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest build() {
      ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest buildPartial() {
      ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest result = new ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cursor_ = cursor_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.limit_ = limit_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.namedPromptId_ = namedPromptId_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest other) {
      if (other == ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest.getDefaultInstance()) return this;
      if (other.hasCursor()) {
        cursor_ = other.cursor_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasLimit()) {
        setLimit(other.getLimit());
      }
      if (other.hasNamedPromptId()) {
        namedPromptId_ = other.namedPromptId_;
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
              cursor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              limit_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              namedPromptId_ = input.readStringRequireUtf8();
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

    private java.lang.Object cursor_ = "";
    /**
     * <code>optional string cursor = 1 [json_name = "cursor"];</code>
     * @return Whether the cursor field is set.
     */
    public boolean hasCursor() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string cursor = 1 [json_name = "cursor"];</code>
     * @return The cursor.
     */
    public java.lang.String getCursor() {
      java.lang.Object ref = cursor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cursor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string cursor = 1 [json_name = "cursor"];</code>
     * @return The bytes for cursor.
     */
    public com.google.protobuf.ByteString
        getCursorBytes() {
      java.lang.Object ref = cursor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cursor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string cursor = 1 [json_name = "cursor"];</code>
     * @param value The cursor to set.
     * @return This builder for chaining.
     */
    public Builder setCursor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cursor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional string cursor = 1 [json_name = "cursor"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCursor() {
      cursor_ = getDefaultInstance().getCursor();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>optional string cursor = 1 [json_name = "cursor"];</code>
     * @param value The bytes for cursor to set.
     * @return This builder for chaining.
     */
    public Builder setCursorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cursor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int limit_ ;
    /**
     * <code>optional int32 limit = 2 [json_name = "limit"];</code>
     * @return Whether the limit field is set.
     */
    @java.lang.Override
    public boolean hasLimit() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 limit = 2 [json_name = "limit"];</code>
     * @return The limit.
     */
    @java.lang.Override
    public int getLimit() {
      return limit_;
    }
    /**
     * <code>optional int32 limit = 2 [json_name = "limit"];</code>
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(int value) {

      limit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 limit = 2 [json_name = "limit"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLimit() {
      bitField0_ = (bitField0_ & ~0x00000002);
      limit_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object namedPromptId_ = "";
    /**
     * <code>optional string named_prompt_id = 3 [json_name = "namedPromptId"];</code>
     * @return Whether the namedPromptId field is set.
     */
    public boolean hasNamedPromptId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string named_prompt_id = 3 [json_name = "namedPromptId"];</code>
     * @return The namedPromptId.
     */
    public java.lang.String getNamedPromptId() {
      java.lang.Object ref = namedPromptId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namedPromptId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string named_prompt_id = 3 [json_name = "namedPromptId"];</code>
     * @return The bytes for namedPromptId.
     */
    public com.google.protobuf.ByteString
        getNamedPromptIdBytes() {
      java.lang.Object ref = namedPromptId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        namedPromptId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string named_prompt_id = 3 [json_name = "namedPromptId"];</code>
     * @param value The namedPromptId to set.
     * @return This builder for chaining.
     */
    public Builder setNamedPromptId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      namedPromptId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional string named_prompt_id = 3 [json_name = "namedPromptId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNamedPromptId() {
      namedPromptId_ = getDefaultInstance().getNamedPromptId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>optional string named_prompt_id = 3 [json_name = "namedPromptId"];</code>
     * @param value The bytes for namedPromptId to set.
     * @return This builder for chaining.
     */
    public Builder setNamedPromptIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      namedPromptId_ = value;
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


    // @@protoc_insertion_point(builder_scope:chalk.server.v1.ListPromptEvaluationRunsRequest)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.ListPromptEvaluationRunsRequest)
  private static final ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest();
  }

  public static ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPromptEvaluationRunsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListPromptEvaluationRunsRequest>() {
    @java.lang.Override
    public ListPromptEvaluationRunsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListPromptEvaluationRunsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPromptEvaluationRunsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

