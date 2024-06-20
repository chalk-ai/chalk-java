// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/query_values.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

/**
 * <pre>
 * Internal protobuf representing a next page token. Contains the operation id and the query timestamp for the last row in the pervious batch. Results are sorted query timestamp
 * then by operation id lexagraphically then by row id, so this is all we need to know where the next page begins
 * </pre>
 *
 * Protobuf type {@code chalk.common.v1.GetQueryValuesPageToken}
 */
public final class GetQueryValuesPageToken extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.common.v1.GetQueryValuesPageToken)
    GetQueryValuesPageTokenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetQueryValuesPageToken.newBuilder() to construct.
  private GetQueryValuesPageToken(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetQueryValuesPageToken() {
    operationIdHwm_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetQueryValuesPageToken();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.common.v1.QueryValuesProto.internal_static_chalk_common_v1_GetQueryValuesPageToken_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.common.v1.QueryValuesProto.internal_static_chalk_common_v1_GetQueryValuesPageToken_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken.class, ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken.Builder.class);
  }

  private int bitField0_;
  public static final int QUERY_TIMESTAMP_HWM_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp queryTimestampHwm_;
  /**
   * <code>.google.protobuf.Timestamp query_timestamp_hwm = 1 [json_name = "queryTimestampHwm"];</code>
   * @return Whether the queryTimestampHwm field is set.
   */
  @java.lang.Override
  public boolean hasQueryTimestampHwm() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.Timestamp query_timestamp_hwm = 1 [json_name = "queryTimestampHwm"];</code>
   * @return The queryTimestampHwm.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getQueryTimestampHwm() {
    return queryTimestampHwm_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : queryTimestampHwm_;
  }
  /**
   * <code>.google.protobuf.Timestamp query_timestamp_hwm = 1 [json_name = "queryTimestampHwm"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getQueryTimestampHwmOrBuilder() {
    return queryTimestampHwm_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : queryTimestampHwm_;
  }

  public static final int OPERATION_ID_HWM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object operationIdHwm_ = "";
  /**
   * <code>string operation_id_hwm = 2 [json_name = "operationIdHwm"];</code>
   * @return The operationIdHwm.
   */
  @java.lang.Override
  public java.lang.String getOperationIdHwm() {
    java.lang.Object ref = operationIdHwm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      operationIdHwm_ = s;
      return s;
    }
  }
  /**
   * <code>string operation_id_hwm = 2 [json_name = "operationIdHwm"];</code>
   * @return The bytes for operationIdHwm.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOperationIdHwmBytes() {
    java.lang.Object ref = operationIdHwm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      operationIdHwm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROW_ID_HWM_FIELD_NUMBER = 3;
  private long rowIdHwm_ = 0L;
  /**
   * <code>int64 row_id_hwm = 3 [json_name = "rowIdHwm"];</code>
   * @return The rowIdHwm.
   */
  @java.lang.Override
  public long getRowIdHwm() {
    return rowIdHwm_;
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
      output.writeMessage(1, getQueryTimestampHwm());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(operationIdHwm_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, operationIdHwm_);
    }
    if (rowIdHwm_ != 0L) {
      output.writeInt64(3, rowIdHwm_);
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
        .computeMessageSize(1, getQueryTimestampHwm());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(operationIdHwm_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, operationIdHwm_);
    }
    if (rowIdHwm_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, rowIdHwm_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken other = (ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken) obj;

    if (hasQueryTimestampHwm() != other.hasQueryTimestampHwm()) return false;
    if (hasQueryTimestampHwm()) {
      if (!getQueryTimestampHwm()
          .equals(other.getQueryTimestampHwm())) return false;
    }
    if (!getOperationIdHwm()
        .equals(other.getOperationIdHwm())) return false;
    if (getRowIdHwm()
        != other.getRowIdHwm()) return false;
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
    if (hasQueryTimestampHwm()) {
      hash = (37 * hash) + QUERY_TIMESTAMP_HWM_FIELD_NUMBER;
      hash = (53 * hash) + getQueryTimestampHwm().hashCode();
    }
    hash = (37 * hash) + OPERATION_ID_HWM_FIELD_NUMBER;
    hash = (53 * hash) + getOperationIdHwm().hashCode();
    hash = (37 * hash) + ROW_ID_HWM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRowIdHwm());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken prototype) {
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
   * <pre>
   * Internal protobuf representing a next page token. Contains the operation id and the query timestamp for the last row in the pervious batch. Results are sorted query timestamp
   * then by operation id lexagraphically then by row id, so this is all we need to know where the next page begins
   * </pre>
   *
   * Protobuf type {@code chalk.common.v1.GetQueryValuesPageToken}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.common.v1.GetQueryValuesPageToken)
      ai.chalk.protos.chalk.common.v1.GetQueryValuesPageTokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.common.v1.QueryValuesProto.internal_static_chalk_common_v1_GetQueryValuesPageToken_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.common.v1.QueryValuesProto.internal_static_chalk_common_v1_GetQueryValuesPageToken_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken.class, ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken.newBuilder()
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
        getQueryTimestampHwmFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      queryTimestampHwm_ = null;
      if (queryTimestampHwmBuilder_ != null) {
        queryTimestampHwmBuilder_.dispose();
        queryTimestampHwmBuilder_ = null;
      }
      operationIdHwm_ = "";
      rowIdHwm_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.common.v1.QueryValuesProto.internal_static_chalk_common_v1_GetQueryValuesPageToken_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken build() {
      ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken buildPartial() {
      ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken result = new ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.queryTimestampHwm_ = queryTimestampHwmBuilder_ == null
            ? queryTimestampHwm_
            : queryTimestampHwmBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.operationIdHwm_ = operationIdHwm_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.rowIdHwm_ = rowIdHwm_;
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
      if (other instanceof ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken) {
        return mergeFrom((ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken other) {
      if (other == ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken.getDefaultInstance()) return this;
      if (other.hasQueryTimestampHwm()) {
        mergeQueryTimestampHwm(other.getQueryTimestampHwm());
      }
      if (!other.getOperationIdHwm().isEmpty()) {
        operationIdHwm_ = other.operationIdHwm_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getRowIdHwm() != 0L) {
        setRowIdHwm(other.getRowIdHwm());
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
                  getQueryTimestampHwmFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              operationIdHwm_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              rowIdHwm_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.google.protobuf.Timestamp queryTimestampHwm_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> queryTimestampHwmBuilder_;
    /**
     * <code>.google.protobuf.Timestamp query_timestamp_hwm = 1 [json_name = "queryTimestampHwm"];</code>
     * @return Whether the queryTimestampHwm field is set.
     */
    public boolean hasQueryTimestampHwm() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp query_timestamp_hwm = 1 [json_name = "queryTimestampHwm"];</code>
     * @return The queryTimestampHwm.
     */
    public com.google.protobuf.Timestamp getQueryTimestampHwm() {
      if (queryTimestampHwmBuilder_ == null) {
        return queryTimestampHwm_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : queryTimestampHwm_;
      } else {
        return queryTimestampHwmBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp query_timestamp_hwm = 1 [json_name = "queryTimestampHwm"];</code>
     */
    public Builder setQueryTimestampHwm(com.google.protobuf.Timestamp value) {
      if (queryTimestampHwmBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        queryTimestampHwm_ = value;
      } else {
        queryTimestampHwmBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp query_timestamp_hwm = 1 [json_name = "queryTimestampHwm"];</code>
     */
    public Builder setQueryTimestampHwm(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (queryTimestampHwmBuilder_ == null) {
        queryTimestampHwm_ = builderForValue.build();
      } else {
        queryTimestampHwmBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp query_timestamp_hwm = 1 [json_name = "queryTimestampHwm"];</code>
     */
    public Builder mergeQueryTimestampHwm(com.google.protobuf.Timestamp value) {
      if (queryTimestampHwmBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          queryTimestampHwm_ != null &&
          queryTimestampHwm_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getQueryTimestampHwmBuilder().mergeFrom(value);
        } else {
          queryTimestampHwm_ = value;
        }
      } else {
        queryTimestampHwmBuilder_.mergeFrom(value);
      }
      if (queryTimestampHwm_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp query_timestamp_hwm = 1 [json_name = "queryTimestampHwm"];</code>
     */
    public Builder clearQueryTimestampHwm() {
      bitField0_ = (bitField0_ & ~0x00000001);
      queryTimestampHwm_ = null;
      if (queryTimestampHwmBuilder_ != null) {
        queryTimestampHwmBuilder_.dispose();
        queryTimestampHwmBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp query_timestamp_hwm = 1 [json_name = "queryTimestampHwm"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getQueryTimestampHwmBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getQueryTimestampHwmFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp query_timestamp_hwm = 1 [json_name = "queryTimestampHwm"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getQueryTimestampHwmOrBuilder() {
      if (queryTimestampHwmBuilder_ != null) {
        return queryTimestampHwmBuilder_.getMessageOrBuilder();
      } else {
        return queryTimestampHwm_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : queryTimestampHwm_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp query_timestamp_hwm = 1 [json_name = "queryTimestampHwm"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getQueryTimestampHwmFieldBuilder() {
      if (queryTimestampHwmBuilder_ == null) {
        queryTimestampHwmBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getQueryTimestampHwm(),
                getParentForChildren(),
                isClean());
        queryTimestampHwm_ = null;
      }
      return queryTimestampHwmBuilder_;
    }

    private java.lang.Object operationIdHwm_ = "";
    /**
     * <code>string operation_id_hwm = 2 [json_name = "operationIdHwm"];</code>
     * @return The operationIdHwm.
     */
    public java.lang.String getOperationIdHwm() {
      java.lang.Object ref = operationIdHwm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        operationIdHwm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string operation_id_hwm = 2 [json_name = "operationIdHwm"];</code>
     * @return The bytes for operationIdHwm.
     */
    public com.google.protobuf.ByteString
        getOperationIdHwmBytes() {
      java.lang.Object ref = operationIdHwm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        operationIdHwm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string operation_id_hwm = 2 [json_name = "operationIdHwm"];</code>
     * @param value The operationIdHwm to set.
     * @return This builder for chaining.
     */
    public Builder setOperationIdHwm(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      operationIdHwm_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string operation_id_hwm = 2 [json_name = "operationIdHwm"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOperationIdHwm() {
      operationIdHwm_ = getDefaultInstance().getOperationIdHwm();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string operation_id_hwm = 2 [json_name = "operationIdHwm"];</code>
     * @param value The bytes for operationIdHwm to set.
     * @return This builder for chaining.
     */
    public Builder setOperationIdHwmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      operationIdHwm_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long rowIdHwm_ ;
    /**
     * <code>int64 row_id_hwm = 3 [json_name = "rowIdHwm"];</code>
     * @return The rowIdHwm.
     */
    @java.lang.Override
    public long getRowIdHwm() {
      return rowIdHwm_;
    }
    /**
     * <code>int64 row_id_hwm = 3 [json_name = "rowIdHwm"];</code>
     * @param value The rowIdHwm to set.
     * @return This builder for chaining.
     */
    public Builder setRowIdHwm(long value) {

      rowIdHwm_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 row_id_hwm = 3 [json_name = "rowIdHwm"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRowIdHwm() {
      bitField0_ = (bitField0_ & ~0x00000004);
      rowIdHwm_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:chalk.common.v1.GetQueryValuesPageToken)
  }

  // @@protoc_insertion_point(class_scope:chalk.common.v1.GetQueryValuesPageToken)
  private static final ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken();
  }

  public static ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetQueryValuesPageToken>
      PARSER = new com.google.protobuf.AbstractParser<GetQueryValuesPageToken>() {
    @java.lang.Override
    public GetQueryValuesPageToken parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetQueryValuesPageToken> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetQueryValuesPageToken> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.GetQueryValuesPageToken getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

