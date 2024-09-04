// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/aggregate/v1/backfill.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.aggregate.v1;

/**
 * Protobuf type {@code chalk.aggregate.v1.AggregateBackfillWithCostEstimate}
 */
public final class AggregateBackfillWithCostEstimate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.aggregate.v1.AggregateBackfillWithCostEstimate)
    AggregateBackfillWithCostEstimateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AggregateBackfillWithCostEstimate.newBuilder() to construct.
  private AggregateBackfillWithCostEstimate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AggregateBackfillWithCostEstimate() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AggregateBackfillWithCostEstimate();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.aggregate.v1.BackfillProto.internal_static_chalk_aggregate_v1_AggregateBackfillWithCostEstimate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.aggregate.v1.BackfillProto.internal_static_chalk_aggregate_v1_AggregateBackfillWithCostEstimate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate.class, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate.Builder.class);
  }

  private int bitField0_;
  public static final int BACKFILL_FIELD_NUMBER = 1;
  private ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill backfill_;
  /**
   * <code>.chalk.aggregate.v1.AggregateBackfill backfill = 1 [json_name = "backfill"];</code>
   * @return Whether the backfill field is set.
   */
  @java.lang.Override
  public boolean hasBackfill() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.aggregate.v1.AggregateBackfill backfill = 1 [json_name = "backfill"];</code>
   * @return The backfill.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill getBackfill() {
    return backfill_ == null ? ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill.getDefaultInstance() : backfill_;
  }
  /**
   * <code>.chalk.aggregate.v1.AggregateBackfill backfill = 1 [json_name = "backfill"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillOrBuilder getBackfillOrBuilder() {
    return backfill_ == null ? ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill.getDefaultInstance() : backfill_;
  }

  public static final int ESTIMATE_FIELD_NUMBER = 2;
  private ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate estimate_;
  /**
   * <code>.chalk.aggregate.v1.AggregateBackfillCostEstimate estimate = 2 [json_name = "estimate"];</code>
   * @return Whether the estimate field is set.
   */
  @java.lang.Override
  public boolean hasEstimate() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.chalk.aggregate.v1.AggregateBackfillCostEstimate estimate = 2 [json_name = "estimate"];</code>
   * @return The estimate.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate getEstimate() {
    return estimate_ == null ? ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate.getDefaultInstance() : estimate_;
  }
  /**
   * <code>.chalk.aggregate.v1.AggregateBackfillCostEstimate estimate = 2 [json_name = "estimate"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimateOrBuilder getEstimateOrBuilder() {
    return estimate_ == null ? ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate.getDefaultInstance() : estimate_;
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
      output.writeMessage(1, getBackfill());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getEstimate());
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
        .computeMessageSize(1, getBackfill());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEstimate());
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
    if (!(obj instanceof ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate other = (ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate) obj;

    if (hasBackfill() != other.hasBackfill()) return false;
    if (hasBackfill()) {
      if (!getBackfill()
          .equals(other.getBackfill())) return false;
    }
    if (hasEstimate() != other.hasEstimate()) return false;
    if (hasEstimate()) {
      if (!getEstimate()
          .equals(other.getEstimate())) return false;
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
    if (hasBackfill()) {
      hash = (37 * hash) + BACKFILL_FIELD_NUMBER;
      hash = (53 * hash) + getBackfill().hashCode();
    }
    if (hasEstimate()) {
      hash = (37 * hash) + ESTIMATE_FIELD_NUMBER;
      hash = (53 * hash) + getEstimate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate prototype) {
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
   * Protobuf type {@code chalk.aggregate.v1.AggregateBackfillWithCostEstimate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.aggregate.v1.AggregateBackfillWithCostEstimate)
      ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.aggregate.v1.BackfillProto.internal_static_chalk_aggregate_v1_AggregateBackfillWithCostEstimate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.aggregate.v1.BackfillProto.internal_static_chalk_aggregate_v1_AggregateBackfillWithCostEstimate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate.class, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate.newBuilder()
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
        getBackfillFieldBuilder();
        getEstimateFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      backfill_ = null;
      if (backfillBuilder_ != null) {
        backfillBuilder_.dispose();
        backfillBuilder_ = null;
      }
      estimate_ = null;
      if (estimateBuilder_ != null) {
        estimateBuilder_.dispose();
        estimateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.aggregate.v1.BackfillProto.internal_static_chalk_aggregate_v1_AggregateBackfillWithCostEstimate_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate build() {
      ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate buildPartial() {
      ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate result = new ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.backfill_ = backfillBuilder_ == null
            ? backfill_
            : backfillBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.estimate_ = estimateBuilder_ == null
            ? estimate_
            : estimateBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate) {
        return mergeFrom((ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate other) {
      if (other == ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate.getDefaultInstance()) return this;
      if (other.hasBackfill()) {
        mergeBackfill(other.getBackfill());
      }
      if (other.hasEstimate()) {
        mergeEstimate(other.getEstimate());
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
                  getBackfillFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getEstimateFieldBuilder().getBuilder(),
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

    private ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill backfill_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill.Builder, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillOrBuilder> backfillBuilder_;
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfill backfill = 1 [json_name = "backfill"];</code>
     * @return Whether the backfill field is set.
     */
    public boolean hasBackfill() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfill backfill = 1 [json_name = "backfill"];</code>
     * @return The backfill.
     */
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill getBackfill() {
      if (backfillBuilder_ == null) {
        return backfill_ == null ? ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill.getDefaultInstance() : backfill_;
      } else {
        return backfillBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfill backfill = 1 [json_name = "backfill"];</code>
     */
    public Builder setBackfill(ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill value) {
      if (backfillBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        backfill_ = value;
      } else {
        backfillBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfill backfill = 1 [json_name = "backfill"];</code>
     */
    public Builder setBackfill(
        ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill.Builder builderForValue) {
      if (backfillBuilder_ == null) {
        backfill_ = builderForValue.build();
      } else {
        backfillBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfill backfill = 1 [json_name = "backfill"];</code>
     */
    public Builder mergeBackfill(ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill value) {
      if (backfillBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          backfill_ != null &&
          backfill_ != ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill.getDefaultInstance()) {
          getBackfillBuilder().mergeFrom(value);
        } else {
          backfill_ = value;
        }
      } else {
        backfillBuilder_.mergeFrom(value);
      }
      if (backfill_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfill backfill = 1 [json_name = "backfill"];</code>
     */
    public Builder clearBackfill() {
      bitField0_ = (bitField0_ & ~0x00000001);
      backfill_ = null;
      if (backfillBuilder_ != null) {
        backfillBuilder_.dispose();
        backfillBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfill backfill = 1 [json_name = "backfill"];</code>
     */
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill.Builder getBackfillBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBackfillFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfill backfill = 1 [json_name = "backfill"];</code>
     */
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillOrBuilder getBackfillOrBuilder() {
      if (backfillBuilder_ != null) {
        return backfillBuilder_.getMessageOrBuilder();
      } else {
        return backfill_ == null ?
            ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill.getDefaultInstance() : backfill_;
      }
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfill backfill = 1 [json_name = "backfill"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill.Builder, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillOrBuilder> 
        getBackfillFieldBuilder() {
      if (backfillBuilder_ == null) {
        backfillBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill.Builder, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillOrBuilder>(
                getBackfill(),
                getParentForChildren(),
                isClean());
        backfill_ = null;
      }
      return backfillBuilder_;
    }

    private ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate estimate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate.Builder, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimateOrBuilder> estimateBuilder_;
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillCostEstimate estimate = 2 [json_name = "estimate"];</code>
     * @return Whether the estimate field is set.
     */
    public boolean hasEstimate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillCostEstimate estimate = 2 [json_name = "estimate"];</code>
     * @return The estimate.
     */
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate getEstimate() {
      if (estimateBuilder_ == null) {
        return estimate_ == null ? ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate.getDefaultInstance() : estimate_;
      } else {
        return estimateBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillCostEstimate estimate = 2 [json_name = "estimate"];</code>
     */
    public Builder setEstimate(ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate value) {
      if (estimateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        estimate_ = value;
      } else {
        estimateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillCostEstimate estimate = 2 [json_name = "estimate"];</code>
     */
    public Builder setEstimate(
        ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate.Builder builderForValue) {
      if (estimateBuilder_ == null) {
        estimate_ = builderForValue.build();
      } else {
        estimateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillCostEstimate estimate = 2 [json_name = "estimate"];</code>
     */
    public Builder mergeEstimate(ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate value) {
      if (estimateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          estimate_ != null &&
          estimate_ != ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate.getDefaultInstance()) {
          getEstimateBuilder().mergeFrom(value);
        } else {
          estimate_ = value;
        }
      } else {
        estimateBuilder_.mergeFrom(value);
      }
      if (estimate_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillCostEstimate estimate = 2 [json_name = "estimate"];</code>
     */
    public Builder clearEstimate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      estimate_ = null;
      if (estimateBuilder_ != null) {
        estimateBuilder_.dispose();
        estimateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillCostEstimate estimate = 2 [json_name = "estimate"];</code>
     */
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate.Builder getEstimateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEstimateFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillCostEstimate estimate = 2 [json_name = "estimate"];</code>
     */
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimateOrBuilder getEstimateOrBuilder() {
      if (estimateBuilder_ != null) {
        return estimateBuilder_.getMessageOrBuilder();
      } else {
        return estimate_ == null ?
            ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate.getDefaultInstance() : estimate_;
      }
    }
    /**
     * <code>.chalk.aggregate.v1.AggregateBackfillCostEstimate estimate = 2 [json_name = "estimate"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate.Builder, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimateOrBuilder> 
        getEstimateFieldBuilder() {
      if (estimateBuilder_ == null) {
        estimateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate.Builder, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimateOrBuilder>(
                getEstimate(),
                getParentForChildren(),
                isClean());
        estimate_ = null;
      }
      return estimateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.aggregate.v1.AggregateBackfillWithCostEstimate)
  }

  // @@protoc_insertion_point(class_scope:chalk.aggregate.v1.AggregateBackfillWithCostEstimate)
  private static final ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate();
  }

  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AggregateBackfillWithCostEstimate>
      PARSER = new com.google.protobuf.AbstractParser<AggregateBackfillWithCostEstimate>() {
    @java.lang.Override
    public AggregateBackfillWithCostEstimate parsePartialFrom(
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

  public static com.google.protobuf.Parser<AggregateBackfillWithCostEstimate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AggregateBackfillWithCostEstimate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

