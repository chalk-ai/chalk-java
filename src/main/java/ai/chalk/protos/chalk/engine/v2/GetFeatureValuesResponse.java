// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v2/feature_values.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.engine.v2;

/**
 * Protobuf type {@code chalk.engine.v2.GetFeatureValuesResponse}
 */
public final class GetFeatureValuesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.engine.v2.GetFeatureValuesResponse)
    GetFeatureValuesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetFeatureValuesResponse.newBuilder() to construct.
  private GetFeatureValuesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetFeatureValuesResponse() {
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetFeatureValuesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.engine.v2.FeatureValuesProto.internal_static_chalk_engine_v2_GetFeatureValuesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.engine.v2.FeatureValuesProto.internal_static_chalk_engine_v2_GetFeatureValuesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse.class, ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse.Builder.class);
  }

  private int payloadCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object payload_;
  public enum PayloadCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    PARQUET(3),
    PAYLOAD_NOT_SET(0);
    private final int value;
    private PayloadCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PayloadCase valueOf(int value) {
      return forNumber(value);
    }

    public static PayloadCase forNumber(int value) {
      switch (value) {
        case 3: return PARQUET;
        case 0: return PAYLOAD_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public PayloadCase
  getPayloadCase() {
    return PayloadCase.forNumber(
        payloadCase_);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * If non-empty, call this endpoint again, with this next token to get the next page of responses.
   * </pre>
   *
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If non-empty, call this endpoint again, with this next token to get the next page of responses.
   * </pre>
   *
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_SIZE_FIELD_NUMBER = 2;
  private int totalSize_ = 0;
  /**
   * <pre>
   * The number of results returned
   * </pre>
   *
   * <code>int32 total_size = 2 [json_name = "totalSize"];</code>
   * @return The totalSize.
   */
  @java.lang.Override
  public int getTotalSize() {
    return totalSize_;
  }

  public static final int PARQUET_FIELD_NUMBER = 3;
  /**
   * <code>bytes parquet = 3 [json_name = "parquet"];</code>
   * @return Whether the parquet field is set.
   */
  @java.lang.Override
  public boolean hasParquet() {
    return payloadCase_ == 3;
  }
  /**
   * <code>bytes parquet = 3 [json_name = "parquet"];</code>
   * @return The parquet.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParquet() {
    if (payloadCase_ == 3) {
      return (com.google.protobuf.ByteString) payload_;
    }
    return com.google.protobuf.ByteString.EMPTY;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nextPageToken_);
    }
    if (totalSize_ != 0) {
      output.writeInt32(2, totalSize_);
    }
    if (payloadCase_ == 3) {
      output.writeBytes(
          3, (com.google.protobuf.ByteString) payload_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nextPageToken_);
    }
    if (totalSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, totalSize_);
    }
    if (payloadCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            3, (com.google.protobuf.ByteString) payload_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse other = (ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse) obj;

    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (getTotalSize()
        != other.getTotalSize()) return false;
    if (!getPayloadCase().equals(other.getPayloadCase())) return false;
    switch (payloadCase_) {
      case 3:
        if (!getParquet()
            .equals(other.getParquet())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (37 * hash) + TOTAL_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getTotalSize();
    switch (payloadCase_) {
      case 3:
        hash = (37 * hash) + PARQUET_FIELD_NUMBER;
        hash = (53 * hash) + getParquet().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse prototype) {
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
   * Protobuf type {@code chalk.engine.v2.GetFeatureValuesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.engine.v2.GetFeatureValuesResponse)
      ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.engine.v2.FeatureValuesProto.internal_static_chalk_engine_v2_GetFeatureValuesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.engine.v2.FeatureValuesProto.internal_static_chalk_engine_v2_GetFeatureValuesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse.class, ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse.newBuilder()
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
      nextPageToken_ = "";
      totalSize_ = 0;
      payloadCase_ = 0;
      payload_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.engine.v2.FeatureValuesProto.internal_static_chalk_engine_v2_GetFeatureValuesResponse_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse build() {
      ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse buildPartial() {
      ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse result = new ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.totalSize_ = totalSize_;
      }
    }

    private void buildPartialOneofs(ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse result) {
      result.payloadCase_ = payloadCase_;
      result.payload_ = this.payload_;
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
      if (other instanceof ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse) {
        return mergeFrom((ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse other) {
      if (other == ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse.getDefaultInstance()) return this;
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getTotalSize() != 0) {
        setTotalSize(other.getTotalSize());
      }
      switch (other.getPayloadCase()) {
        case PARQUET: {
          setParquet(other.getParquet());
          break;
        }
        case PAYLOAD_NOT_SET: {
          break;
        }
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
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              totalSize_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              payload_ = input.readBytes();
              payloadCase_ = 3;
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
    private int payloadCase_ = 0;
    private java.lang.Object payload_;
    public PayloadCase
        getPayloadCase() {
      return PayloadCase.forNumber(
          payloadCase_);
    }

    public Builder clearPayload() {
      payloadCase_ = 0;
      payload_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * If non-empty, call this endpoint again, with this next token to get the next page of responses.
     * </pre>
     *
     * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If non-empty, call this endpoint again, with this next token to get the next page of responses.
     * </pre>
     *
     * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If non-empty, call this endpoint again, with this next token to get the next page of responses.
     * </pre>
     *
     * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If non-empty, call this endpoint again, with this next token to get the next page of responses.
     * </pre>
     *
     * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If non-empty, call this endpoint again, with this next token to get the next page of responses.
     * </pre>
     *
     * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int totalSize_ ;
    /**
     * <pre>
     * The number of results returned
     * </pre>
     *
     * <code>int32 total_size = 2 [json_name = "totalSize"];</code>
     * @return The totalSize.
     */
    @java.lang.Override
    public int getTotalSize() {
      return totalSize_;
    }
    /**
     * <pre>
     * The number of results returned
     * </pre>
     *
     * <code>int32 total_size = 2 [json_name = "totalSize"];</code>
     * @param value The totalSize to set.
     * @return This builder for chaining.
     */
    public Builder setTotalSize(int value) {

      totalSize_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of results returned
     * </pre>
     *
     * <code>int32 total_size = 2 [json_name = "totalSize"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      totalSize_ = 0;
      onChanged();
      return this;
    }

    /**
     * <code>bytes parquet = 3 [json_name = "parquet"];</code>
     * @return Whether the parquet field is set.
     */
    public boolean hasParquet() {
      return payloadCase_ == 3;
    }
    /**
     * <code>bytes parquet = 3 [json_name = "parquet"];</code>
     * @return The parquet.
     */
    public com.google.protobuf.ByteString getParquet() {
      if (payloadCase_ == 3) {
        return (com.google.protobuf.ByteString) payload_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <code>bytes parquet = 3 [json_name = "parquet"];</code>
     * @param value The parquet to set.
     * @return This builder for chaining.
     */
    public Builder setParquet(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      payloadCase_ = 3;
      payload_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes parquet = 3 [json_name = "parquet"];</code>
     * @return This builder for chaining.
     */
    public Builder clearParquet() {
      if (payloadCase_ == 3) {
        payloadCase_ = 0;
        payload_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:chalk.engine.v2.GetFeatureValuesResponse)
  }

  // @@protoc_insertion_point(class_scope:chalk.engine.v2.GetFeatureValuesResponse)
  private static final ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse();
  }

  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetFeatureValuesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetFeatureValuesResponse>() {
    @java.lang.Override
    public GetFeatureValuesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetFeatureValuesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetFeatureValuesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v2.GetFeatureValuesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

