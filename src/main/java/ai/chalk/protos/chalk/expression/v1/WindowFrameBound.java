// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.expression.v1;

/**
 * Protobuf type {@code chalk.expression.v1.WindowFrameBound}
 */
public final class WindowFrameBound extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.expression.v1.WindowFrameBound)
    WindowFrameBoundOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WindowFrameBound.newBuilder() to construct.
  private WindowFrameBound(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WindowFrameBound() {
    windowFrameBoundType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WindowFrameBound();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_WindowFrameBound_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_WindowFrameBound_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.expression.v1.WindowFrameBound.class, ai.chalk.protos.chalk.expression.v1.WindowFrameBound.Builder.class);
  }

  private int bitField0_;
  public static final int WINDOW_FRAME_BOUND_TYPE_FIELD_NUMBER = 1;
  private int windowFrameBoundType_ = 0;
  /**
   * <code>.chalk.expression.v1.WindowFrameBoundType window_frame_bound_type = 1 [json_name = "windowFrameBoundType"];</code>
   * @return The enum numeric value on the wire for windowFrameBoundType.
   */
  @java.lang.Override public int getWindowFrameBoundTypeValue() {
    return windowFrameBoundType_;
  }
  /**
   * <code>.chalk.expression.v1.WindowFrameBoundType window_frame_bound_type = 1 [json_name = "windowFrameBoundType"];</code>
   * @return The windowFrameBoundType.
   */
  @java.lang.Override public ai.chalk.protos.chalk.expression.v1.WindowFrameBoundType getWindowFrameBoundType() {
    ai.chalk.protos.chalk.expression.v1.WindowFrameBoundType result = ai.chalk.protos.chalk.expression.v1.WindowFrameBoundType.forNumber(windowFrameBoundType_);
    return result == null ? ai.chalk.protos.chalk.expression.v1.WindowFrameBoundType.UNRECOGNIZED : result;
  }

  public static final int BOUND_VALUE_FIELD_NUMBER = 2;
  private ai.chalk.protos.chalk.arrow.v1.ScalarValue boundValue_;
  /**
   * <code>.chalk.arrow.v1.ScalarValue bound_value = 2 [json_name = "boundValue"];</code>
   * @return Whether the boundValue field is set.
   */
  @java.lang.Override
  public boolean hasBoundValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.arrow.v1.ScalarValue bound_value = 2 [json_name = "boundValue"];</code>
   * @return The boundValue.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.ScalarValue getBoundValue() {
    return boundValue_ == null ? ai.chalk.protos.chalk.arrow.v1.ScalarValue.getDefaultInstance() : boundValue_;
  }
  /**
   * <code>.chalk.arrow.v1.ScalarValue bound_value = 2 [json_name = "boundValue"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.ScalarValueOrBuilder getBoundValueOrBuilder() {
    return boundValue_ == null ? ai.chalk.protos.chalk.arrow.v1.ScalarValue.getDefaultInstance() : boundValue_;
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
    if (windowFrameBoundType_ != ai.chalk.protos.chalk.expression.v1.WindowFrameBoundType.WINDOW_FRAME_BOUND_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, windowFrameBoundType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getBoundValue());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (windowFrameBoundType_ != ai.chalk.protos.chalk.expression.v1.WindowFrameBoundType.WINDOW_FRAME_BOUND_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, windowFrameBoundType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBoundValue());
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
    if (!(obj instanceof ai.chalk.protos.chalk.expression.v1.WindowFrameBound)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.expression.v1.WindowFrameBound other = (ai.chalk.protos.chalk.expression.v1.WindowFrameBound) obj;

    if (windowFrameBoundType_ != other.windowFrameBoundType_) return false;
    if (hasBoundValue() != other.hasBoundValue()) return false;
    if (hasBoundValue()) {
      if (!getBoundValue()
          .equals(other.getBoundValue())) return false;
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
    hash = (37 * hash) + WINDOW_FRAME_BOUND_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + windowFrameBoundType_;
    if (hasBoundValue()) {
      hash = (37 * hash) + BOUND_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getBoundValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.expression.v1.WindowFrameBound parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrameBound parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrameBound parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrameBound parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrameBound parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrameBound parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrameBound parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrameBound parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.expression.v1.WindowFrameBound parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.expression.v1.WindowFrameBound parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrameBound parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrameBound parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.expression.v1.WindowFrameBound prototype) {
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
   * Protobuf type {@code chalk.expression.v1.WindowFrameBound}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.expression.v1.WindowFrameBound)
      ai.chalk.protos.chalk.expression.v1.WindowFrameBoundOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_WindowFrameBound_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_WindowFrameBound_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.expression.v1.WindowFrameBound.class, ai.chalk.protos.chalk.expression.v1.WindowFrameBound.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.expression.v1.WindowFrameBound.newBuilder()
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
        getBoundValueFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      windowFrameBoundType_ = 0;
      boundValue_ = null;
      if (boundValueBuilder_ != null) {
        boundValueBuilder_.dispose();
        boundValueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_WindowFrameBound_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.WindowFrameBound getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.expression.v1.WindowFrameBound.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.WindowFrameBound build() {
      ai.chalk.protos.chalk.expression.v1.WindowFrameBound result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.WindowFrameBound buildPartial() {
      ai.chalk.protos.chalk.expression.v1.WindowFrameBound result = new ai.chalk.protos.chalk.expression.v1.WindowFrameBound(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.expression.v1.WindowFrameBound result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.windowFrameBoundType_ = windowFrameBoundType_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.boundValue_ = boundValueBuilder_ == null
            ? boundValue_
            : boundValueBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.expression.v1.WindowFrameBound) {
        return mergeFrom((ai.chalk.protos.chalk.expression.v1.WindowFrameBound)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.expression.v1.WindowFrameBound other) {
      if (other == ai.chalk.protos.chalk.expression.v1.WindowFrameBound.getDefaultInstance()) return this;
      if (other.windowFrameBoundType_ != 0) {
        setWindowFrameBoundTypeValue(other.getWindowFrameBoundTypeValue());
      }
      if (other.hasBoundValue()) {
        mergeBoundValue(other.getBoundValue());
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
              windowFrameBoundType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getBoundValueFieldBuilder().getBuilder(),
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

    private int windowFrameBoundType_ = 0;
    /**
     * <code>.chalk.expression.v1.WindowFrameBoundType window_frame_bound_type = 1 [json_name = "windowFrameBoundType"];</code>
     * @return The enum numeric value on the wire for windowFrameBoundType.
     */
    @java.lang.Override public int getWindowFrameBoundTypeValue() {
      return windowFrameBoundType_;
    }
    /**
     * <code>.chalk.expression.v1.WindowFrameBoundType window_frame_bound_type = 1 [json_name = "windowFrameBoundType"];</code>
     * @param value The enum numeric value on the wire for windowFrameBoundType to set.
     * @return This builder for chaining.
     */
    public Builder setWindowFrameBoundTypeValue(int value) {
      windowFrameBoundType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.expression.v1.WindowFrameBoundType window_frame_bound_type = 1 [json_name = "windowFrameBoundType"];</code>
     * @return The windowFrameBoundType.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.WindowFrameBoundType getWindowFrameBoundType() {
      ai.chalk.protos.chalk.expression.v1.WindowFrameBoundType result = ai.chalk.protos.chalk.expression.v1.WindowFrameBoundType.forNumber(windowFrameBoundType_);
      return result == null ? ai.chalk.protos.chalk.expression.v1.WindowFrameBoundType.UNRECOGNIZED : result;
    }
    /**
     * <code>.chalk.expression.v1.WindowFrameBoundType window_frame_bound_type = 1 [json_name = "windowFrameBoundType"];</code>
     * @param value The windowFrameBoundType to set.
     * @return This builder for chaining.
     */
    public Builder setWindowFrameBoundType(ai.chalk.protos.chalk.expression.v1.WindowFrameBoundType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      windowFrameBoundType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.expression.v1.WindowFrameBoundType window_frame_bound_type = 1 [json_name = "windowFrameBoundType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWindowFrameBoundType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      windowFrameBoundType_ = 0;
      onChanged();
      return this;
    }

    private ai.chalk.protos.chalk.arrow.v1.ScalarValue boundValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.arrow.v1.ScalarValue, ai.chalk.protos.chalk.arrow.v1.ScalarValue.Builder, ai.chalk.protos.chalk.arrow.v1.ScalarValueOrBuilder> boundValueBuilder_;
    /**
     * <code>.chalk.arrow.v1.ScalarValue bound_value = 2 [json_name = "boundValue"];</code>
     * @return Whether the boundValue field is set.
     */
    public boolean hasBoundValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.chalk.arrow.v1.ScalarValue bound_value = 2 [json_name = "boundValue"];</code>
     * @return The boundValue.
     */
    public ai.chalk.protos.chalk.arrow.v1.ScalarValue getBoundValue() {
      if (boundValueBuilder_ == null) {
        return boundValue_ == null ? ai.chalk.protos.chalk.arrow.v1.ScalarValue.getDefaultInstance() : boundValue_;
      } else {
        return boundValueBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.arrow.v1.ScalarValue bound_value = 2 [json_name = "boundValue"];</code>
     */
    public Builder setBoundValue(ai.chalk.protos.chalk.arrow.v1.ScalarValue value) {
      if (boundValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        boundValue_ = value;
      } else {
        boundValueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.arrow.v1.ScalarValue bound_value = 2 [json_name = "boundValue"];</code>
     */
    public Builder setBoundValue(
        ai.chalk.protos.chalk.arrow.v1.ScalarValue.Builder builderForValue) {
      if (boundValueBuilder_ == null) {
        boundValue_ = builderForValue.build();
      } else {
        boundValueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.arrow.v1.ScalarValue bound_value = 2 [json_name = "boundValue"];</code>
     */
    public Builder mergeBoundValue(ai.chalk.protos.chalk.arrow.v1.ScalarValue value) {
      if (boundValueBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          boundValue_ != null &&
          boundValue_ != ai.chalk.protos.chalk.arrow.v1.ScalarValue.getDefaultInstance()) {
          getBoundValueBuilder().mergeFrom(value);
        } else {
          boundValue_ = value;
        }
      } else {
        boundValueBuilder_.mergeFrom(value);
      }
      if (boundValue_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.arrow.v1.ScalarValue bound_value = 2 [json_name = "boundValue"];</code>
     */
    public Builder clearBoundValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      boundValue_ = null;
      if (boundValueBuilder_ != null) {
        boundValueBuilder_.dispose();
        boundValueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.arrow.v1.ScalarValue bound_value = 2 [json_name = "boundValue"];</code>
     */
    public ai.chalk.protos.chalk.arrow.v1.ScalarValue.Builder getBoundValueBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getBoundValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.arrow.v1.ScalarValue bound_value = 2 [json_name = "boundValue"];</code>
     */
    public ai.chalk.protos.chalk.arrow.v1.ScalarValueOrBuilder getBoundValueOrBuilder() {
      if (boundValueBuilder_ != null) {
        return boundValueBuilder_.getMessageOrBuilder();
      } else {
        return boundValue_ == null ?
            ai.chalk.protos.chalk.arrow.v1.ScalarValue.getDefaultInstance() : boundValue_;
      }
    }
    /**
     * <code>.chalk.arrow.v1.ScalarValue bound_value = 2 [json_name = "boundValue"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.arrow.v1.ScalarValue, ai.chalk.protos.chalk.arrow.v1.ScalarValue.Builder, ai.chalk.protos.chalk.arrow.v1.ScalarValueOrBuilder> 
        getBoundValueFieldBuilder() {
      if (boundValueBuilder_ == null) {
        boundValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.arrow.v1.ScalarValue, ai.chalk.protos.chalk.arrow.v1.ScalarValue.Builder, ai.chalk.protos.chalk.arrow.v1.ScalarValueOrBuilder>(
                getBoundValue(),
                getParentForChildren(),
                isClean());
        boundValue_ = null;
      }
      return boundValueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.expression.v1.WindowFrameBound)
  }

  // @@protoc_insertion_point(class_scope:chalk.expression.v1.WindowFrameBound)
  private static final ai.chalk.protos.chalk.expression.v1.WindowFrameBound DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.expression.v1.WindowFrameBound();
  }

  public static ai.chalk.protos.chalk.expression.v1.WindowFrameBound getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WindowFrameBound>
      PARSER = new com.google.protobuf.AbstractParser<WindowFrameBound>() {
    @java.lang.Override
    public WindowFrameBound parsePartialFrom(
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

  public static com.google.protobuf.Parser<WindowFrameBound> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WindowFrameBound> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.WindowFrameBound getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

