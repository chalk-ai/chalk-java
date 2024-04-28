// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/arrow/v1/arrow.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.arrow.v1;

/**
 * Protobuf type {@code chalk.arrow.v1.ScalarTime32Value}
 */
public final class ScalarTime32Value extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.arrow.v1.ScalarTime32Value)
    ScalarTime32ValueOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ScalarTime32Value.class.getName());
  }
  // Use ScalarTime32Value.newBuilder() to construct.
  private ScalarTime32Value(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ScalarTime32Value() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_ScalarTime32Value_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_ScalarTime32Value_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value.class, ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value.Builder.class);
  }

  private int valueCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object value_;
  public enum ValueCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TIME32_SECOND_VALUE(1),
    TIME32_MILLISECOND_VALUE(2),
    VALUE_NOT_SET(0);
    private final int value;
    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 1: return TIME32_SECOND_VALUE;
        case 2: return TIME32_MILLISECOND_VALUE;
        case 0: return VALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase
  getValueCase() {
    return ValueCase.forNumber(
        valueCase_);
  }

  public static final int TIME32_SECOND_VALUE_FIELD_NUMBER = 1;
  /**
   * <code>int32 time32_second_value = 1 [json_name = "time32SecondValue"];</code>
   * @return Whether the time32SecondValue field is set.
   */
  @java.lang.Override
  public boolean hasTime32SecondValue() {
    return valueCase_ == 1;
  }
  /**
   * <code>int32 time32_second_value = 1 [json_name = "time32SecondValue"];</code>
   * @return The time32SecondValue.
   */
  @java.lang.Override
  public int getTime32SecondValue() {
    if (valueCase_ == 1) {
      return (java.lang.Integer) value_;
    }
    return 0;
  }

  public static final int TIME32_MILLISECOND_VALUE_FIELD_NUMBER = 2;
  /**
   * <code>int32 time32_millisecond_value = 2 [json_name = "time32MillisecondValue"];</code>
   * @return Whether the time32MillisecondValue field is set.
   */
  @java.lang.Override
  public boolean hasTime32MillisecondValue() {
    return valueCase_ == 2;
  }
  /**
   * <code>int32 time32_millisecond_value = 2 [json_name = "time32MillisecondValue"];</code>
   * @return The time32MillisecondValue.
   */
  @java.lang.Override
  public int getTime32MillisecondValue() {
    if (valueCase_ == 2) {
      return (java.lang.Integer) value_;
    }
    return 0;
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
    if (valueCase_ == 1) {
      output.writeInt32(
          1, (int)((java.lang.Integer) value_));
    }
    if (valueCase_ == 2) {
      output.writeInt32(
          2, (int)((java.lang.Integer) value_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valueCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            1, (int)((java.lang.Integer) value_));
    }
    if (valueCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            2, (int)((java.lang.Integer) value_));
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
    if (!(obj instanceof ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value other = (ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value) obj;

    if (!getValueCase().equals(other.getValueCase())) return false;
    switch (valueCase_) {
      case 1:
        if (getTime32SecondValue()
            != other.getTime32SecondValue()) return false;
        break;
      case 2:
        if (getTime32MillisecondValue()
            != other.getTime32MillisecondValue()) return false;
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
    switch (valueCase_) {
      case 1:
        hash = (37 * hash) + TIME32_SECOND_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getTime32SecondValue();
        break;
      case 2:
        hash = (37 * hash) + TIME32_MILLISECOND_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getTime32MillisecondValue();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code chalk.arrow.v1.ScalarTime32Value}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.arrow.v1.ScalarTime32Value)
      ai.chalk.protos.chalk.arrow.v1.ScalarTime32ValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_ScalarTime32Value_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_ScalarTime32Value_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value.class, ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      valueCase_ = 0;
      value_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_ScalarTime32Value_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value build() {
      ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value buildPartial() {
      ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value result = new ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value result) {
      result.valueCase_ = valueCase_;
      result.value_ = this.value_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value) {
        return mergeFrom((ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value other) {
      if (other == ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value.getDefaultInstance()) return this;
      switch (other.getValueCase()) {
        case TIME32_SECOND_VALUE: {
          setTime32SecondValue(other.getTime32SecondValue());
          break;
        }
        case TIME32_MILLISECOND_VALUE: {
          setTime32MillisecondValue(other.getTime32MillisecondValue());
          break;
        }
        case VALUE_NOT_SET: {
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
            case 8: {
              value_ = input.readInt32();
              valueCase_ = 1;
              break;
            } // case 8
            case 16: {
              value_ = input.readInt32();
              valueCase_ = 2;
              break;
            } // case 16
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
    private int valueCase_ = 0;
    private java.lang.Object value_;
    public ValueCase
        getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>int32 time32_second_value = 1 [json_name = "time32SecondValue"];</code>
     * @return Whether the time32SecondValue field is set.
     */
    public boolean hasTime32SecondValue() {
      return valueCase_ == 1;
    }
    /**
     * <code>int32 time32_second_value = 1 [json_name = "time32SecondValue"];</code>
     * @return The time32SecondValue.
     */
    public int getTime32SecondValue() {
      if (valueCase_ == 1) {
        return (java.lang.Integer) value_;
      }
      return 0;
    }
    /**
     * <code>int32 time32_second_value = 1 [json_name = "time32SecondValue"];</code>
     * @param value The time32SecondValue to set.
     * @return This builder for chaining.
     */
    public Builder setTime32SecondValue(int value) {

      valueCase_ = 1;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 time32_second_value = 1 [json_name = "time32SecondValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTime32SecondValue() {
      if (valueCase_ == 1) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>int32 time32_millisecond_value = 2 [json_name = "time32MillisecondValue"];</code>
     * @return Whether the time32MillisecondValue field is set.
     */
    public boolean hasTime32MillisecondValue() {
      return valueCase_ == 2;
    }
    /**
     * <code>int32 time32_millisecond_value = 2 [json_name = "time32MillisecondValue"];</code>
     * @return The time32MillisecondValue.
     */
    public int getTime32MillisecondValue() {
      if (valueCase_ == 2) {
        return (java.lang.Integer) value_;
      }
      return 0;
    }
    /**
     * <code>int32 time32_millisecond_value = 2 [json_name = "time32MillisecondValue"];</code>
     * @param value The time32MillisecondValue to set.
     * @return This builder for chaining.
     */
    public Builder setTime32MillisecondValue(int value) {

      valueCase_ = 2;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 time32_millisecond_value = 2 [json_name = "time32MillisecondValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTime32MillisecondValue() {
      if (valueCase_ == 2) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    // @@protoc_insertion_point(builder_scope:chalk.arrow.v1.ScalarTime32Value)
  }

  // @@protoc_insertion_point(class_scope:chalk.arrow.v1.ScalarTime32Value)
  private static final ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value();
  }

  public static ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScalarTime32Value>
      PARSER = new com.google.protobuf.AbstractParser<ScalarTime32Value>() {
    @java.lang.Override
    public ScalarTime32Value parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScalarTime32Value> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScalarTime32Value> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.ScalarTime32Value getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
