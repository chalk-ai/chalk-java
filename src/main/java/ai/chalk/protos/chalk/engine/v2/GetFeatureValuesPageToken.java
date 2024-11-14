// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v2/feature_values.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.engine.v2;

/**
 * <pre>
 * Internal protobuf representing a next page token. Contains the operation id and the query timestamp for the last row
 * in the previous batch. Results are sorted query timestamp, then by operation id, then observation id lexicographically,
 * so this is all we need to know where the next page begins
 * </pre>
 *
 * Protobuf type {@code chalk.engine.v2.GetFeatureValuesPageToken}
 */
public final class GetFeatureValuesPageToken extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.engine.v2.GetFeatureValuesPageToken)
    GetFeatureValuesPageTokenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetFeatureValuesPageToken.newBuilder() to construct.
  private GetFeatureValuesPageToken(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetFeatureValuesPageToken() {
    operationIdHwm_ = "";
    observationIdHwm_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetFeatureValuesPageToken();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.engine.v2.FeatureValuesProto.internal_static_chalk_engine_v2_GetFeatureValuesPageToken_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.engine.v2.FeatureValuesProto.internal_static_chalk_engine_v2_GetFeatureValuesPageToken_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken.class, ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken.Builder.class);
  }

  private int bitField0_;
  public static final int TIMESTAMP_HWM_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp timestampHwm_;
  /**
   * <code>.google.protobuf.Timestamp timestamp_hwm = 1 [json_name = "timestampHwm"];</code>
   * @return Whether the timestampHwm field is set.
   */
  @java.lang.Override
  public boolean hasTimestampHwm() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.Timestamp timestamp_hwm = 1 [json_name = "timestampHwm"];</code>
   * @return The timestampHwm.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTimestampHwm() {
    return timestampHwm_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestampHwm_;
  }
  /**
   * <code>.google.protobuf.Timestamp timestamp_hwm = 1 [json_name = "timestampHwm"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimestampHwmOrBuilder() {
    return timestampHwm_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestampHwm_;
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

  public static final int OBSERVATION_ID_HWM_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object observationIdHwm_ = "";
  /**
   * <code>string observation_id_hwm = 3 [json_name = "observationIdHwm"];</code>
   * @return The observationIdHwm.
   */
  @java.lang.Override
  public java.lang.String getObservationIdHwm() {
    java.lang.Object ref = observationIdHwm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      observationIdHwm_ = s;
      return s;
    }
  }
  /**
   * <code>string observation_id_hwm = 3 [json_name = "observationIdHwm"];</code>
   * @return The bytes for observationIdHwm.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getObservationIdHwmBytes() {
    java.lang.Object ref = observationIdHwm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      observationIdHwm_ = b;
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
      output.writeMessage(1, getTimestampHwm());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(operationIdHwm_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, operationIdHwm_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(observationIdHwm_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, observationIdHwm_);
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
        .computeMessageSize(1, getTimestampHwm());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(operationIdHwm_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, operationIdHwm_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(observationIdHwm_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, observationIdHwm_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken other = (ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken) obj;

    if (hasTimestampHwm() != other.hasTimestampHwm()) return false;
    if (hasTimestampHwm()) {
      if (!getTimestampHwm()
          .equals(other.getTimestampHwm())) return false;
    }
    if (!getOperationIdHwm()
        .equals(other.getOperationIdHwm())) return false;
    if (!getObservationIdHwm()
        .equals(other.getObservationIdHwm())) return false;
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
    if (hasTimestampHwm()) {
      hash = (37 * hash) + TIMESTAMP_HWM_FIELD_NUMBER;
      hash = (53 * hash) + getTimestampHwm().hashCode();
    }
    hash = (37 * hash) + OPERATION_ID_HWM_FIELD_NUMBER;
    hash = (53 * hash) + getOperationIdHwm().hashCode();
    hash = (37 * hash) + OBSERVATION_ID_HWM_FIELD_NUMBER;
    hash = (53 * hash) + getObservationIdHwm().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken prototype) {
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
   * Internal protobuf representing a next page token. Contains the operation id and the query timestamp for the last row
   * in the previous batch. Results are sorted query timestamp, then by operation id, then observation id lexicographically,
   * so this is all we need to know where the next page begins
   * </pre>
   *
   * Protobuf type {@code chalk.engine.v2.GetFeatureValuesPageToken}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.engine.v2.GetFeatureValuesPageToken)
      ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageTokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.engine.v2.FeatureValuesProto.internal_static_chalk_engine_v2_GetFeatureValuesPageToken_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.engine.v2.FeatureValuesProto.internal_static_chalk_engine_v2_GetFeatureValuesPageToken_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken.class, ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken.newBuilder()
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
        getTimestampHwmFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      timestampHwm_ = null;
      if (timestampHwmBuilder_ != null) {
        timestampHwmBuilder_.dispose();
        timestampHwmBuilder_ = null;
      }
      operationIdHwm_ = "";
      observationIdHwm_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.engine.v2.FeatureValuesProto.internal_static_chalk_engine_v2_GetFeatureValuesPageToken_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken build() {
      ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken buildPartial() {
      ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken result = new ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.timestampHwm_ = timestampHwmBuilder_ == null
            ? timestampHwm_
            : timestampHwmBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.operationIdHwm_ = operationIdHwm_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.observationIdHwm_ = observationIdHwm_;
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
      if (other instanceof ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken) {
        return mergeFrom((ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken other) {
      if (other == ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken.getDefaultInstance()) return this;
      if (other.hasTimestampHwm()) {
        mergeTimestampHwm(other.getTimestampHwm());
      }
      if (!other.getOperationIdHwm().isEmpty()) {
        operationIdHwm_ = other.operationIdHwm_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getObservationIdHwm().isEmpty()) {
        observationIdHwm_ = other.observationIdHwm_;
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
              input.readMessage(
                  getTimestampHwmFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              operationIdHwm_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              observationIdHwm_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.Timestamp timestampHwm_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timestampHwmBuilder_;
    /**
     * <code>.google.protobuf.Timestamp timestamp_hwm = 1 [json_name = "timestampHwm"];</code>
     * @return Whether the timestampHwm field is set.
     */
    public boolean hasTimestampHwm() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp_hwm = 1 [json_name = "timestampHwm"];</code>
     * @return The timestampHwm.
     */
    public com.google.protobuf.Timestamp getTimestampHwm() {
      if (timestampHwmBuilder_ == null) {
        return timestampHwm_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestampHwm_;
      } else {
        return timestampHwmBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp_hwm = 1 [json_name = "timestampHwm"];</code>
     */
    public Builder setTimestampHwm(com.google.protobuf.Timestamp value) {
      if (timestampHwmBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timestampHwm_ = value;
      } else {
        timestampHwmBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp_hwm = 1 [json_name = "timestampHwm"];</code>
     */
    public Builder setTimestampHwm(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timestampHwmBuilder_ == null) {
        timestampHwm_ = builderForValue.build();
      } else {
        timestampHwmBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp_hwm = 1 [json_name = "timestampHwm"];</code>
     */
    public Builder mergeTimestampHwm(com.google.protobuf.Timestamp value) {
      if (timestampHwmBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          timestampHwm_ != null &&
          timestampHwm_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getTimestampHwmBuilder().mergeFrom(value);
        } else {
          timestampHwm_ = value;
        }
      } else {
        timestampHwmBuilder_.mergeFrom(value);
      }
      if (timestampHwm_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp_hwm = 1 [json_name = "timestampHwm"];</code>
     */
    public Builder clearTimestampHwm() {
      bitField0_ = (bitField0_ & ~0x00000001);
      timestampHwm_ = null;
      if (timestampHwmBuilder_ != null) {
        timestampHwmBuilder_.dispose();
        timestampHwmBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp_hwm = 1 [json_name = "timestampHwm"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimestampHwmBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTimestampHwmFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp_hwm = 1 [json_name = "timestampHwm"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimestampHwmOrBuilder() {
      if (timestampHwmBuilder_ != null) {
        return timestampHwmBuilder_.getMessageOrBuilder();
      } else {
        return timestampHwm_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : timestampHwm_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp_hwm = 1 [json_name = "timestampHwm"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimestampHwmFieldBuilder() {
      if (timestampHwmBuilder_ == null) {
        timestampHwmBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTimestampHwm(),
                getParentForChildren(),
                isClean());
        timestampHwm_ = null;
      }
      return timestampHwmBuilder_;
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

    private java.lang.Object observationIdHwm_ = "";
    /**
     * <code>string observation_id_hwm = 3 [json_name = "observationIdHwm"];</code>
     * @return The observationIdHwm.
     */
    public java.lang.String getObservationIdHwm() {
      java.lang.Object ref = observationIdHwm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        observationIdHwm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string observation_id_hwm = 3 [json_name = "observationIdHwm"];</code>
     * @return The bytes for observationIdHwm.
     */
    public com.google.protobuf.ByteString
        getObservationIdHwmBytes() {
      java.lang.Object ref = observationIdHwm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        observationIdHwm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string observation_id_hwm = 3 [json_name = "observationIdHwm"];</code>
     * @param value The observationIdHwm to set.
     * @return This builder for chaining.
     */
    public Builder setObservationIdHwm(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      observationIdHwm_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string observation_id_hwm = 3 [json_name = "observationIdHwm"];</code>
     * @return This builder for chaining.
     */
    public Builder clearObservationIdHwm() {
      observationIdHwm_ = getDefaultInstance().getObservationIdHwm();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string observation_id_hwm = 3 [json_name = "observationIdHwm"];</code>
     * @param value The bytes for observationIdHwm to set.
     * @return This builder for chaining.
     */
    public Builder setObservationIdHwmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      observationIdHwm_ = value;
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


    // @@protoc_insertion_point(builder_scope:chalk.engine.v2.GetFeatureValuesPageToken)
  }

  // @@protoc_insertion_point(class_scope:chalk.engine.v2.GetFeatureValuesPageToken)
  private static final ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken();
  }

  public static ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetFeatureValuesPageToken>
      PARSER = new com.google.protobuf.AbstractParser<GetFeatureValuesPageToken>() {
    @java.lang.Override
    public GetFeatureValuesPageToken parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetFeatureValuesPageToken> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetFeatureValuesPageToken> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v2.GetFeatureValuesPageToken getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

