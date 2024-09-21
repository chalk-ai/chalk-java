// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/chart.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

/**
 * Protobuf type {@code chalk.common.v1.Series}
 */
public final class Series extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.common.v1.Series)
    SeriesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Series.newBuilder() to construct.
  private Series(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Series() {
    points_ = emptyDoubleList();
    label_ = "";
    units_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Series();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.common.v1.ChartProto.internal_static_chalk_common_v1_Series_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.common.v1.ChartProto.internal_static_chalk_common_v1_Series_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.common.v1.Series.class, ai.chalk.protos.chalk.common.v1.Series.Builder.class);
  }

  public static final int POINTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.DoubleList points_ =
      emptyDoubleList();
  /**
   * <code>repeated double points = 1 [json_name = "points"];</code>
   * @return A list containing the points.
   */
  @java.lang.Override
  public java.util.List<java.lang.Double>
      getPointsList() {
    return points_;
  }
  /**
   * <code>repeated double points = 1 [json_name = "points"];</code>
   * @return The count of points.
   */
  public int getPointsCount() {
    return points_.size();
  }
  /**
   * <code>repeated double points = 1 [json_name = "points"];</code>
   * @param index The index of the element to return.
   * @return The points at the given index.
   */
  public double getPoints(int index) {
    return points_.getDouble(index);
  }
  private int pointsMemoizedSerializedSize = -1;

  public static final int LABEL_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object label_ = "";
  /**
   * <code>string label = 2 [json_name = "label"];</code>
   * @return The label.
   */
  @java.lang.Override
  public java.lang.String getLabel() {
    java.lang.Object ref = label_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      label_ = s;
      return s;
    }
  }
  /**
   * <code>string label = 2 [json_name = "label"];</code>
   * @return The bytes for label.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLabelBytes() {
    java.lang.Object ref = label_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      label_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UNITS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object units_ = "";
  /**
   * <code>string units = 3 [json_name = "units"];</code>
   * @return The units.
   */
  @java.lang.Override
  public java.lang.String getUnits() {
    java.lang.Object ref = units_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      units_ = s;
      return s;
    }
  }
  /**
   * <code>string units = 3 [json_name = "units"];</code>
   * @return The bytes for units.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUnitsBytes() {
    java.lang.Object ref = units_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      units_ = b;
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
    getSerializedSize();
    if (getPointsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(pointsMemoizedSerializedSize);
    }
    for (int i = 0; i < points_.size(); i++) {
      output.writeDoubleNoTag(points_.getDouble(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(label_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, label_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(units_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, units_);
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
      dataSize = 8 * getPointsList().size();
      size += dataSize;
      if (!getPointsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      pointsMemoizedSerializedSize = dataSize;
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(label_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, label_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(units_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, units_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.common.v1.Series)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.common.v1.Series other = (ai.chalk.protos.chalk.common.v1.Series) obj;

    if (!getPointsList()
        .equals(other.getPointsList())) return false;
    if (!getLabel()
        .equals(other.getLabel())) return false;
    if (!getUnits()
        .equals(other.getUnits())) return false;
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
    if (getPointsCount() > 0) {
      hash = (37 * hash) + POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getPointsList().hashCode();
    }
    hash = (37 * hash) + LABEL_FIELD_NUMBER;
    hash = (53 * hash) + getLabel().hashCode();
    hash = (37 * hash) + UNITS_FIELD_NUMBER;
    hash = (53 * hash) + getUnits().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.common.v1.Series parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.Series parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.Series parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.Series parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.Series parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.Series parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.Series parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.Series parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.common.v1.Series parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.common.v1.Series parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.Series parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.Series parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.common.v1.Series prototype) {
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
   * Protobuf type {@code chalk.common.v1.Series}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.common.v1.Series)
      ai.chalk.protos.chalk.common.v1.SeriesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.common.v1.ChartProto.internal_static_chalk_common_v1_Series_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.common.v1.ChartProto.internal_static_chalk_common_v1_Series_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.common.v1.Series.class, ai.chalk.protos.chalk.common.v1.Series.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.common.v1.Series.newBuilder()
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
      points_ = emptyDoubleList();
      label_ = "";
      units_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.common.v1.ChartProto.internal_static_chalk_common_v1_Series_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.Series getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.common.v1.Series.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.Series build() {
      ai.chalk.protos.chalk.common.v1.Series result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.Series buildPartial() {
      ai.chalk.protos.chalk.common.v1.Series result = new ai.chalk.protos.chalk.common.v1.Series(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.common.v1.Series result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        points_.makeImmutable();
        result.points_ = points_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.label_ = label_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.units_ = units_;
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
      if (other instanceof ai.chalk.protos.chalk.common.v1.Series) {
        return mergeFrom((ai.chalk.protos.chalk.common.v1.Series)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.common.v1.Series other) {
      if (other == ai.chalk.protos.chalk.common.v1.Series.getDefaultInstance()) return this;
      if (!other.points_.isEmpty()) {
        if (points_.isEmpty()) {
          points_ = other.points_;
          points_.makeImmutable();
          bitField0_ |= 0x00000001;
        } else {
          ensurePointsIsMutable();
          points_.addAll(other.points_);
        }
        onChanged();
      }
      if (!other.getLabel().isEmpty()) {
        label_ = other.label_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getUnits().isEmpty()) {
        units_ = other.units_;
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
            case 9: {
              double v = input.readDouble();
              ensurePointsIsMutable();
              points_.addDouble(v);
              break;
            } // case 9
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              int alloc = length > 4096 ? 4096 : length;
              ensurePointsIsMutable(alloc / 8);
              while (input.getBytesUntilLimit() > 0) {
                points_.addDouble(input.readDouble());
              }
              input.popLimit(limit);
              break;
            } // case 10
            case 18: {
              label_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              units_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.Internal.DoubleList points_ = emptyDoubleList();
    private void ensurePointsIsMutable() {
      if (!points_.isModifiable()) {
        points_ = makeMutableCopy(points_);
      }
      bitField0_ |= 0x00000001;
    }
    private void ensurePointsIsMutable(int capacity) {
      if (!points_.isModifiable()) {
        points_ = makeMutableCopy(points_, capacity);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated double points = 1 [json_name = "points"];</code>
     * @return A list containing the points.
     */
    public java.util.List<java.lang.Double>
        getPointsList() {
      points_.makeImmutable();
      return points_;
    }
    /**
     * <code>repeated double points = 1 [json_name = "points"];</code>
     * @return The count of points.
     */
    public int getPointsCount() {
      return points_.size();
    }
    /**
     * <code>repeated double points = 1 [json_name = "points"];</code>
     * @param index The index of the element to return.
     * @return The points at the given index.
     */
    public double getPoints(int index) {
      return points_.getDouble(index);
    }
    /**
     * <code>repeated double points = 1 [json_name = "points"];</code>
     * @param index The index to set the value at.
     * @param value The points to set.
     * @return This builder for chaining.
     */
    public Builder setPoints(
        int index, double value) {

      ensurePointsIsMutable();
      points_.setDouble(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated double points = 1 [json_name = "points"];</code>
     * @param value The points to add.
     * @return This builder for chaining.
     */
    public Builder addPoints(double value) {

      ensurePointsIsMutable();
      points_.addDouble(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated double points = 1 [json_name = "points"];</code>
     * @param values The points to add.
     * @return This builder for chaining.
     */
    public Builder addAllPoints(
        java.lang.Iterable<? extends java.lang.Double> values) {
      ensurePointsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, points_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated double points = 1 [json_name = "points"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoints() {
      points_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.lang.Object label_ = "";
    /**
     * <code>string label = 2 [json_name = "label"];</code>
     * @return The label.
     */
    public java.lang.String getLabel() {
      java.lang.Object ref = label_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        label_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string label = 2 [json_name = "label"];</code>
     * @return The bytes for label.
     */
    public com.google.protobuf.ByteString
        getLabelBytes() {
      java.lang.Object ref = label_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        label_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string label = 2 [json_name = "label"];</code>
     * @param value The label to set.
     * @return This builder for chaining.
     */
    public Builder setLabel(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      label_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string label = 2 [json_name = "label"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLabel() {
      label_ = getDefaultInstance().getLabel();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string label = 2 [json_name = "label"];</code>
     * @param value The bytes for label to set.
     * @return This builder for chaining.
     */
    public Builder setLabelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      label_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object units_ = "";
    /**
     * <code>string units = 3 [json_name = "units"];</code>
     * @return The units.
     */
    public java.lang.String getUnits() {
      java.lang.Object ref = units_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        units_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string units = 3 [json_name = "units"];</code>
     * @return The bytes for units.
     */
    public com.google.protobuf.ByteString
        getUnitsBytes() {
      java.lang.Object ref = units_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        units_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string units = 3 [json_name = "units"];</code>
     * @param value The units to set.
     * @return This builder for chaining.
     */
    public Builder setUnits(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      units_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string units = 3 [json_name = "units"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUnits() {
      units_ = getDefaultInstance().getUnits();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string units = 3 [json_name = "units"];</code>
     * @param value The bytes for units to set.
     * @return This builder for chaining.
     */
    public Builder setUnitsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      units_ = value;
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


    // @@protoc_insertion_point(builder_scope:chalk.common.v1.Series)
  }

  // @@protoc_insertion_point(class_scope:chalk.common.v1.Series)
  private static final ai.chalk.protos.chalk.common.v1.Series DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.common.v1.Series();
  }

  public static ai.chalk.protos.chalk.common.v1.Series getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Series>
      PARSER = new com.google.protobuf.AbstractParser<Series>() {
    @java.lang.Override
    public Series parsePartialFrom(
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

  public static com.google.protobuf.Parser<Series> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Series> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.Series getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

