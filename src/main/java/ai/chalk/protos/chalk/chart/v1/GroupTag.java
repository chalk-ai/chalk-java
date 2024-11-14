// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/chart/v1/densetimeserieschart.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.chart.v1;

/**
 * <pre>
 * If this series was created as part of a group-by(s)
 * This stores extra information about which ones and what value it pertains to
 * </pre>
 *
 * Protobuf type {@code chalk.chart.v1.GroupTag}
 */
public final class GroupTag extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.chart.v1.GroupTag)
    GroupTagOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GroupTag.newBuilder() to construct.
  private GroupTag(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GroupTag() {
    groupKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GroupTag();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.chart.v1.DensetimeserieschartProto.internal_static_chalk_chart_v1_GroupTag_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.chart.v1.DensetimeserieschartProto.internal_static_chalk_chart_v1_GroupTag_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.chart.v1.GroupTag.class, ai.chalk.protos.chalk.chart.v1.GroupTag.Builder.class);
  }

  private int bitField0_;
  public static final int GROUP_KEY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object groupKey_ = "";
  /**
   * <code>string group_key = 1 [json_name = "groupKey"];</code>
   * @return The groupKey.
   */
  @java.lang.Override
  public java.lang.String getGroupKey() {
    java.lang.Object ref = groupKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      groupKey_ = s;
      return s;
    }
  }
  /**
   * <code>string group_key = 1 [json_name = "groupKey"];</code>
   * @return The bytes for groupKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGroupKeyBytes() {
    java.lang.Object ref = groupKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      groupKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private ai.chalk.protos.chalk.arrow.v1.ScalarValue value_;
  /**
   * <code>.chalk.arrow.v1.ScalarValue value = 2 [json_name = "value"];</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.arrow.v1.ScalarValue value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.ScalarValue getValue() {
    return value_ == null ? ai.chalk.protos.chalk.arrow.v1.ScalarValue.getDefaultInstance() : value_;
  }
  /**
   * <code>.chalk.arrow.v1.ScalarValue value = 2 [json_name = "value"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.ScalarValueOrBuilder getValueOrBuilder() {
    return value_ == null ? ai.chalk.protos.chalk.arrow.v1.ScalarValue.getDefaultInstance() : value_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(groupKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupKey_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getValue());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(groupKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupKey_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValue());
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
    if (!(obj instanceof ai.chalk.protos.chalk.chart.v1.GroupTag)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.chart.v1.GroupTag other = (ai.chalk.protos.chalk.chart.v1.GroupTag) obj;

    if (!getGroupKey()
        .equals(other.getGroupKey())) return false;
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
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
    hash = (37 * hash) + GROUP_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getGroupKey().hashCode();
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.chart.v1.GroupTag parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.chart.v1.GroupTag parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.chart.v1.GroupTag parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.chart.v1.GroupTag parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.chart.v1.GroupTag parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.chart.v1.GroupTag parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.chart.v1.GroupTag parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.chart.v1.GroupTag parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.chart.v1.GroupTag parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.chart.v1.GroupTag parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.chart.v1.GroupTag parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.chart.v1.GroupTag parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.chart.v1.GroupTag prototype) {
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
   * If this series was created as part of a group-by(s)
   * This stores extra information about which ones and what value it pertains to
   * </pre>
   *
   * Protobuf type {@code chalk.chart.v1.GroupTag}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.chart.v1.GroupTag)
      ai.chalk.protos.chalk.chart.v1.GroupTagOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.chart.v1.DensetimeserieschartProto.internal_static_chalk_chart_v1_GroupTag_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.chart.v1.DensetimeserieschartProto.internal_static_chalk_chart_v1_GroupTag_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.chart.v1.GroupTag.class, ai.chalk.protos.chalk.chart.v1.GroupTag.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.chart.v1.GroupTag.newBuilder()
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
        getValueFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      groupKey_ = "";
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.chart.v1.DensetimeserieschartProto.internal_static_chalk_chart_v1_GroupTag_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.chart.v1.GroupTag getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.chart.v1.GroupTag.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.chart.v1.GroupTag build() {
      ai.chalk.protos.chalk.chart.v1.GroupTag result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.chart.v1.GroupTag buildPartial() {
      ai.chalk.protos.chalk.chart.v1.GroupTag result = new ai.chalk.protos.chalk.chart.v1.GroupTag(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.chart.v1.GroupTag result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.groupKey_ = groupKey_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = valueBuilder_ == null
            ? value_
            : valueBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.chart.v1.GroupTag) {
        return mergeFrom((ai.chalk.protos.chalk.chart.v1.GroupTag)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.chart.v1.GroupTag other) {
      if (other == ai.chalk.protos.chalk.chart.v1.GroupTag.getDefaultInstance()) return this;
      if (!other.getGroupKey().isEmpty()) {
        groupKey_ = other.groupKey_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
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
              groupKey_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getValueFieldBuilder().getBuilder(),
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

    private java.lang.Object groupKey_ = "";
    /**
     * <code>string group_key = 1 [json_name = "groupKey"];</code>
     * @return The groupKey.
     */
    public java.lang.String getGroupKey() {
      java.lang.Object ref = groupKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string group_key = 1 [json_name = "groupKey"];</code>
     * @return The bytes for groupKey.
     */
    public com.google.protobuf.ByteString
        getGroupKeyBytes() {
      java.lang.Object ref = groupKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string group_key = 1 [json_name = "groupKey"];</code>
     * @param value The groupKey to set.
     * @return This builder for chaining.
     */
    public Builder setGroupKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      groupKey_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string group_key = 1 [json_name = "groupKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupKey() {
      groupKey_ = getDefaultInstance().getGroupKey();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string group_key = 1 [json_name = "groupKey"];</code>
     * @param value The bytes for groupKey to set.
     * @return This builder for chaining.
     */
    public Builder setGroupKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      groupKey_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private ai.chalk.protos.chalk.arrow.v1.ScalarValue value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.arrow.v1.ScalarValue, ai.chalk.protos.chalk.arrow.v1.ScalarValue.Builder, ai.chalk.protos.chalk.arrow.v1.ScalarValueOrBuilder> valueBuilder_;
    /**
     * <code>.chalk.arrow.v1.ScalarValue value = 2 [json_name = "value"];</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.chalk.arrow.v1.ScalarValue value = 2 [json_name = "value"];</code>
     * @return The value.
     */
    public ai.chalk.protos.chalk.arrow.v1.ScalarValue getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? ai.chalk.protos.chalk.arrow.v1.ScalarValue.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.arrow.v1.ScalarValue value = 2 [json_name = "value"];</code>
     */
    public Builder setValue(ai.chalk.protos.chalk.arrow.v1.ScalarValue value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
      } else {
        valueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.arrow.v1.ScalarValue value = 2 [json_name = "value"];</code>
     */
    public Builder setValue(
        ai.chalk.protos.chalk.arrow.v1.ScalarValue.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.arrow.v1.ScalarValue value = 2 [json_name = "value"];</code>
     */
    public Builder mergeValue(ai.chalk.protos.chalk.arrow.v1.ScalarValue value) {
      if (valueBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          value_ != null &&
          value_ != ai.chalk.protos.chalk.arrow.v1.ScalarValue.getDefaultInstance()) {
          getValueBuilder().mergeFrom(value);
        } else {
          value_ = value;
        }
      } else {
        valueBuilder_.mergeFrom(value);
      }
      if (value_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.arrow.v1.ScalarValue value = 2 [json_name = "value"];</code>
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.arrow.v1.ScalarValue value = 2 [json_name = "value"];</code>
     */
    public ai.chalk.protos.chalk.arrow.v1.ScalarValue.Builder getValueBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.arrow.v1.ScalarValue value = 2 [json_name = "value"];</code>
     */
    public ai.chalk.protos.chalk.arrow.v1.ScalarValueOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            ai.chalk.protos.chalk.arrow.v1.ScalarValue.getDefaultInstance() : value_;
      }
    }
    /**
     * <code>.chalk.arrow.v1.ScalarValue value = 2 [json_name = "value"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.arrow.v1.ScalarValue, ai.chalk.protos.chalk.arrow.v1.ScalarValue.Builder, ai.chalk.protos.chalk.arrow.v1.ScalarValueOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.arrow.v1.ScalarValue, ai.chalk.protos.chalk.arrow.v1.ScalarValue.Builder, ai.chalk.protos.chalk.arrow.v1.ScalarValueOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.chart.v1.GroupTag)
  }

  // @@protoc_insertion_point(class_scope:chalk.chart.v1.GroupTag)
  private static final ai.chalk.protos.chalk.chart.v1.GroupTag DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.chart.v1.GroupTag();
  }

  public static ai.chalk.protos.chalk.chart.v1.GroupTag getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroupTag>
      PARSER = new com.google.protobuf.AbstractParser<GroupTag>() {
    @java.lang.Override
    public GroupTag parsePartialFrom(
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

  public static com.google.protobuf.Parser<GroupTag> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroupTag> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.chart.v1.GroupTag getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
