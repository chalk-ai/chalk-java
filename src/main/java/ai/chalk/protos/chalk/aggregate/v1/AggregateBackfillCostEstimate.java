// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/aggregate/v1/backfill.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.aggregate.v1;

/**
 * Protobuf type {@code chalk.aggregate.v1.AggregateBackfillCostEstimate}
 */
public final class AggregateBackfillCostEstimate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.aggregate.v1.AggregateBackfillCostEstimate)
    AggregateBackfillCostEstimateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AggregateBackfillCostEstimate.newBuilder() to construct.
  private AggregateBackfillCostEstimate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AggregateBackfillCostEstimate() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AggregateBackfillCostEstimate();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.aggregate.v1.BackfillProto.internal_static_chalk_aggregate_v1_AggregateBackfillCostEstimate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.aggregate.v1.BackfillProto.internal_static_chalk_aggregate_v1_AggregateBackfillCostEstimate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate.class, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate.Builder.class);
  }

  private int bitField0_;
  public static final int MAX_BUCKETS_FIELD_NUMBER = 1;
  private long maxBuckets_ = 0L;
  /**
   * <code>int64 max_buckets = 1 [json_name = "maxBuckets"];</code>
   * @return The maxBuckets.
   */
  @java.lang.Override
  public long getMaxBuckets() {
    return maxBuckets_;
  }

  public static final int EXPECTED_BUCKETS_FIELD_NUMBER = 2;
  private long expectedBuckets_ = 0L;
  /**
   * <code>int64 expected_buckets = 2 [json_name = "expectedBuckets"];</code>
   * @return The expectedBuckets.
   */
  @java.lang.Override
  public long getExpectedBuckets() {
    return expectedBuckets_;
  }

  public static final int EXPECTED_BYTES_FIELD_NUMBER = 3;
  private long expectedBytes_ = 0L;
  /**
   * <code>int64 expected_bytes = 3 [json_name = "expectedBytes"];</code>
   * @return The expectedBytes.
   */
  @java.lang.Override
  public long getExpectedBytes() {
    return expectedBytes_;
  }

  public static final int EXPECTED_STORAGE_COST_FIELD_NUMBER = 4;
  private double expectedStorageCost_ = 0D;
  /**
   * <code>double expected_storage_cost = 4 [json_name = "expectedStorageCost"];</code>
   * @return The expectedStorageCost.
   */
  @java.lang.Override
  public double getExpectedStorageCost() {
    return expectedStorageCost_;
  }

  public static final int EXPECTED_RUNTIME_FIELD_NUMBER = 5;
  private com.google.protobuf.Duration expectedRuntime_;
  /**
   * <code>.google.protobuf.Duration expected_runtime = 5 [json_name = "expectedRuntime"];</code>
   * @return Whether the expectedRuntime field is set.
   */
  @java.lang.Override
  public boolean hasExpectedRuntime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.Duration expected_runtime = 5 [json_name = "expectedRuntime"];</code>
   * @return The expectedRuntime.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getExpectedRuntime() {
    return expectedRuntime_ == null ? com.google.protobuf.Duration.getDefaultInstance() : expectedRuntime_;
  }
  /**
   * <code>.google.protobuf.Duration expected_runtime = 5 [json_name = "expectedRuntime"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getExpectedRuntimeOrBuilder() {
    return expectedRuntime_ == null ? com.google.protobuf.Duration.getDefaultInstance() : expectedRuntime_;
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
    if (maxBuckets_ != 0L) {
      output.writeInt64(1, maxBuckets_);
    }
    if (expectedBuckets_ != 0L) {
      output.writeInt64(2, expectedBuckets_);
    }
    if (expectedBytes_ != 0L) {
      output.writeInt64(3, expectedBytes_);
    }
    if (java.lang.Double.doubleToRawLongBits(expectedStorageCost_) != 0) {
      output.writeDouble(4, expectedStorageCost_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(5, getExpectedRuntime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxBuckets_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, maxBuckets_);
    }
    if (expectedBuckets_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, expectedBuckets_);
    }
    if (expectedBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, expectedBytes_);
    }
    if (java.lang.Double.doubleToRawLongBits(expectedStorageCost_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, expectedStorageCost_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getExpectedRuntime());
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
    if (!(obj instanceof ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate other = (ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate) obj;

    if (getMaxBuckets()
        != other.getMaxBuckets()) return false;
    if (getExpectedBuckets()
        != other.getExpectedBuckets()) return false;
    if (getExpectedBytes()
        != other.getExpectedBytes()) return false;
    if (java.lang.Double.doubleToLongBits(getExpectedStorageCost())
        != java.lang.Double.doubleToLongBits(
            other.getExpectedStorageCost())) return false;
    if (hasExpectedRuntime() != other.hasExpectedRuntime()) return false;
    if (hasExpectedRuntime()) {
      if (!getExpectedRuntime()
          .equals(other.getExpectedRuntime())) return false;
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
    hash = (37 * hash) + MAX_BUCKETS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxBuckets());
    hash = (37 * hash) + EXPECTED_BUCKETS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExpectedBuckets());
    hash = (37 * hash) + EXPECTED_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExpectedBytes());
    hash = (37 * hash) + EXPECTED_STORAGE_COST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getExpectedStorageCost()));
    if (hasExpectedRuntime()) {
      hash = (37 * hash) + EXPECTED_RUNTIME_FIELD_NUMBER;
      hash = (53 * hash) + getExpectedRuntime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate prototype) {
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
   * Protobuf type {@code chalk.aggregate.v1.AggregateBackfillCostEstimate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.aggregate.v1.AggregateBackfillCostEstimate)
      ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.aggregate.v1.BackfillProto.internal_static_chalk_aggregate_v1_AggregateBackfillCostEstimate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.aggregate.v1.BackfillProto.internal_static_chalk_aggregate_v1_AggregateBackfillCostEstimate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate.class, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate.newBuilder()
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
        getExpectedRuntimeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      maxBuckets_ = 0L;
      expectedBuckets_ = 0L;
      expectedBytes_ = 0L;
      expectedStorageCost_ = 0D;
      expectedRuntime_ = null;
      if (expectedRuntimeBuilder_ != null) {
        expectedRuntimeBuilder_.dispose();
        expectedRuntimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.aggregate.v1.BackfillProto.internal_static_chalk_aggregate_v1_AggregateBackfillCostEstimate_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate build() {
      ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate buildPartial() {
      ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate result = new ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maxBuckets_ = maxBuckets_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.expectedBuckets_ = expectedBuckets_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.expectedBytes_ = expectedBytes_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.expectedStorageCost_ = expectedStorageCost_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.expectedRuntime_ = expectedRuntimeBuilder_ == null
            ? expectedRuntime_
            : expectedRuntimeBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate) {
        return mergeFrom((ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate other) {
      if (other == ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate.getDefaultInstance()) return this;
      if (other.getMaxBuckets() != 0L) {
        setMaxBuckets(other.getMaxBuckets());
      }
      if (other.getExpectedBuckets() != 0L) {
        setExpectedBuckets(other.getExpectedBuckets());
      }
      if (other.getExpectedBytes() != 0L) {
        setExpectedBytes(other.getExpectedBytes());
      }
      if (other.getExpectedStorageCost() != 0D) {
        setExpectedStorageCost(other.getExpectedStorageCost());
      }
      if (other.hasExpectedRuntime()) {
        mergeExpectedRuntime(other.getExpectedRuntime());
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
            case 8: {
              maxBuckets_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              expectedBuckets_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              expectedBytes_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 33: {
              expectedStorageCost_ = input.readDouble();
              bitField0_ |= 0x00000008;
              break;
            } // case 33
            case 42: {
              input.readMessage(
                  getExpectedRuntimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private long maxBuckets_ ;
    /**
     * <code>int64 max_buckets = 1 [json_name = "maxBuckets"];</code>
     * @return The maxBuckets.
     */
    @java.lang.Override
    public long getMaxBuckets() {
      return maxBuckets_;
    }
    /**
     * <code>int64 max_buckets = 1 [json_name = "maxBuckets"];</code>
     * @param value The maxBuckets to set.
     * @return This builder for chaining.
     */
    public Builder setMaxBuckets(long value) {

      maxBuckets_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 max_buckets = 1 [json_name = "maxBuckets"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxBuckets() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maxBuckets_ = 0L;
      onChanged();
      return this;
    }

    private long expectedBuckets_ ;
    /**
     * <code>int64 expected_buckets = 2 [json_name = "expectedBuckets"];</code>
     * @return The expectedBuckets.
     */
    @java.lang.Override
    public long getExpectedBuckets() {
      return expectedBuckets_;
    }
    /**
     * <code>int64 expected_buckets = 2 [json_name = "expectedBuckets"];</code>
     * @param value The expectedBuckets to set.
     * @return This builder for chaining.
     */
    public Builder setExpectedBuckets(long value) {

      expectedBuckets_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 expected_buckets = 2 [json_name = "expectedBuckets"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExpectedBuckets() {
      bitField0_ = (bitField0_ & ~0x00000002);
      expectedBuckets_ = 0L;
      onChanged();
      return this;
    }

    private long expectedBytes_ ;
    /**
     * <code>int64 expected_bytes = 3 [json_name = "expectedBytes"];</code>
     * @return The expectedBytes.
     */
    @java.lang.Override
    public long getExpectedBytes() {
      return expectedBytes_;
    }
    /**
     * <code>int64 expected_bytes = 3 [json_name = "expectedBytes"];</code>
     * @param value The expectedBytes to set.
     * @return This builder for chaining.
     */
    public Builder setExpectedBytes(long value) {

      expectedBytes_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 expected_bytes = 3 [json_name = "expectedBytes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExpectedBytes() {
      bitField0_ = (bitField0_ & ~0x00000004);
      expectedBytes_ = 0L;
      onChanged();
      return this;
    }

    private double expectedStorageCost_ ;
    /**
     * <code>double expected_storage_cost = 4 [json_name = "expectedStorageCost"];</code>
     * @return The expectedStorageCost.
     */
    @java.lang.Override
    public double getExpectedStorageCost() {
      return expectedStorageCost_;
    }
    /**
     * <code>double expected_storage_cost = 4 [json_name = "expectedStorageCost"];</code>
     * @param value The expectedStorageCost to set.
     * @return This builder for chaining.
     */
    public Builder setExpectedStorageCost(double value) {

      expectedStorageCost_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>double expected_storage_cost = 4 [json_name = "expectedStorageCost"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExpectedStorageCost() {
      bitField0_ = (bitField0_ & ~0x00000008);
      expectedStorageCost_ = 0D;
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration expectedRuntime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> expectedRuntimeBuilder_;
    /**
     * <code>.google.protobuf.Duration expected_runtime = 5 [json_name = "expectedRuntime"];</code>
     * @return Whether the expectedRuntime field is set.
     */
    public boolean hasExpectedRuntime() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>.google.protobuf.Duration expected_runtime = 5 [json_name = "expectedRuntime"];</code>
     * @return The expectedRuntime.
     */
    public com.google.protobuf.Duration getExpectedRuntime() {
      if (expectedRuntimeBuilder_ == null) {
        return expectedRuntime_ == null ? com.google.protobuf.Duration.getDefaultInstance() : expectedRuntime_;
      } else {
        return expectedRuntimeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Duration expected_runtime = 5 [json_name = "expectedRuntime"];</code>
     */
    public Builder setExpectedRuntime(com.google.protobuf.Duration value) {
      if (expectedRuntimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expectedRuntime_ = value;
      } else {
        expectedRuntimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration expected_runtime = 5 [json_name = "expectedRuntime"];</code>
     */
    public Builder setExpectedRuntime(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (expectedRuntimeBuilder_ == null) {
        expectedRuntime_ = builderForValue.build();
      } else {
        expectedRuntimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration expected_runtime = 5 [json_name = "expectedRuntime"];</code>
     */
    public Builder mergeExpectedRuntime(com.google.protobuf.Duration value) {
      if (expectedRuntimeBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          expectedRuntime_ != null &&
          expectedRuntime_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getExpectedRuntimeBuilder().mergeFrom(value);
        } else {
          expectedRuntime_ = value;
        }
      } else {
        expectedRuntimeBuilder_.mergeFrom(value);
      }
      if (expectedRuntime_ != null) {
        bitField0_ |= 0x00000010;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Duration expected_runtime = 5 [json_name = "expectedRuntime"];</code>
     */
    public Builder clearExpectedRuntime() {
      bitField0_ = (bitField0_ & ~0x00000010);
      expectedRuntime_ = null;
      if (expectedRuntimeBuilder_ != null) {
        expectedRuntimeBuilder_.dispose();
        expectedRuntimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration expected_runtime = 5 [json_name = "expectedRuntime"];</code>
     */
    public com.google.protobuf.Duration.Builder getExpectedRuntimeBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getExpectedRuntimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Duration expected_runtime = 5 [json_name = "expectedRuntime"];</code>
     */
    public com.google.protobuf.DurationOrBuilder getExpectedRuntimeOrBuilder() {
      if (expectedRuntimeBuilder_ != null) {
        return expectedRuntimeBuilder_.getMessageOrBuilder();
      } else {
        return expectedRuntime_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : expectedRuntime_;
      }
    }
    /**
     * <code>.google.protobuf.Duration expected_runtime = 5 [json_name = "expectedRuntime"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getExpectedRuntimeFieldBuilder() {
      if (expectedRuntimeBuilder_ == null) {
        expectedRuntimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getExpectedRuntime(),
                getParentForChildren(),
                isClean());
        expectedRuntime_ = null;
      }
      return expectedRuntimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.aggregate.v1.AggregateBackfillCostEstimate)
  }

  // @@protoc_insertion_point(class_scope:chalk.aggregate.v1.AggregateBackfillCostEstimate)
  private static final ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate();
  }

  public static ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AggregateBackfillCostEstimate>
      PARSER = new com.google.protobuf.AbstractParser<AggregateBackfillCostEstimate>() {
    @java.lang.Override
    public AggregateBackfillCostEstimate parsePartialFrom(
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

  public static com.google.protobuf.Parser<AggregateBackfillCostEstimate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AggregateBackfillCostEstimate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
