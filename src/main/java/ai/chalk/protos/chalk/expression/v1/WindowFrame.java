// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.expression.v1;

/**
 * Protobuf type {@code chalk.expression.v1.WindowFrame}
 */
public final class WindowFrame extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.expression.v1.WindowFrame)
    WindowFrameOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WindowFrame.newBuilder() to construct.
  private WindowFrame(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WindowFrame() {
    windowFrameUnits_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WindowFrame();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_WindowFrame_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_WindowFrame_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.expression.v1.WindowFrame.class, ai.chalk.protos.chalk.expression.v1.WindowFrame.Builder.class);
  }

  private int bitField0_;
  public static final int WINDOW_FRAME_UNITS_FIELD_NUMBER = 1;
  private int windowFrameUnits_ = 0;
  /**
   * <code>.chalk.expression.v1.WindowFrameUnits window_frame_units = 1 [json_name = "windowFrameUnits"];</code>
   * @return The enum numeric value on the wire for windowFrameUnits.
   */
  @java.lang.Override public int getWindowFrameUnitsValue() {
    return windowFrameUnits_;
  }
  /**
   * <code>.chalk.expression.v1.WindowFrameUnits window_frame_units = 1 [json_name = "windowFrameUnits"];</code>
   * @return The windowFrameUnits.
   */
  @java.lang.Override public ai.chalk.protos.chalk.expression.v1.WindowFrameUnits getWindowFrameUnits() {
    ai.chalk.protos.chalk.expression.v1.WindowFrameUnits result = ai.chalk.protos.chalk.expression.v1.WindowFrameUnits.forNumber(windowFrameUnits_);
    return result == null ? ai.chalk.protos.chalk.expression.v1.WindowFrameUnits.UNRECOGNIZED : result;
  }

  public static final int START_BOUND_FIELD_NUMBER = 2;
  private ai.chalk.protos.chalk.expression.v1.WindowFrameBound startBound_;
  /**
   * <code>.chalk.expression.v1.WindowFrameBound start_bound = 2 [json_name = "startBound"];</code>
   * @return Whether the startBound field is set.
   */
  @java.lang.Override
  public boolean hasStartBound() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.expression.v1.WindowFrameBound start_bound = 2 [json_name = "startBound"];</code>
   * @return The startBound.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.WindowFrameBound getStartBound() {
    return startBound_ == null ? ai.chalk.protos.chalk.expression.v1.WindowFrameBound.getDefaultInstance() : startBound_;
  }
  /**
   * <code>.chalk.expression.v1.WindowFrameBound start_bound = 2 [json_name = "startBound"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.WindowFrameBoundOrBuilder getStartBoundOrBuilder() {
    return startBound_ == null ? ai.chalk.protos.chalk.expression.v1.WindowFrameBound.getDefaultInstance() : startBound_;
  }

  public static final int BOUND_FIELD_NUMBER = 3;
  private ai.chalk.protos.chalk.expression.v1.WindowFrameBound bound_;
  /**
   * <code>optional .chalk.expression.v1.WindowFrameBound bound = 3 [json_name = "bound"];</code>
   * @return Whether the bound field is set.
   */
  @java.lang.Override
  public boolean hasBound() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .chalk.expression.v1.WindowFrameBound bound = 3 [json_name = "bound"];</code>
   * @return The bound.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.WindowFrameBound getBound() {
    return bound_ == null ? ai.chalk.protos.chalk.expression.v1.WindowFrameBound.getDefaultInstance() : bound_;
  }
  /**
   * <code>optional .chalk.expression.v1.WindowFrameBound bound = 3 [json_name = "bound"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.WindowFrameBoundOrBuilder getBoundOrBuilder() {
    return bound_ == null ? ai.chalk.protos.chalk.expression.v1.WindowFrameBound.getDefaultInstance() : bound_;
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
    if (windowFrameUnits_ != ai.chalk.protos.chalk.expression.v1.WindowFrameUnits.WINDOW_FRAME_UNITS_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, windowFrameUnits_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getStartBound());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getBound());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (windowFrameUnits_ != ai.chalk.protos.chalk.expression.v1.WindowFrameUnits.WINDOW_FRAME_UNITS_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, windowFrameUnits_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStartBound());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getBound());
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
    if (!(obj instanceof ai.chalk.protos.chalk.expression.v1.WindowFrame)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.expression.v1.WindowFrame other = (ai.chalk.protos.chalk.expression.v1.WindowFrame) obj;

    if (windowFrameUnits_ != other.windowFrameUnits_) return false;
    if (hasStartBound() != other.hasStartBound()) return false;
    if (hasStartBound()) {
      if (!getStartBound()
          .equals(other.getStartBound())) return false;
    }
    if (hasBound() != other.hasBound()) return false;
    if (hasBound()) {
      if (!getBound()
          .equals(other.getBound())) return false;
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
    hash = (37 * hash) + WINDOW_FRAME_UNITS_FIELD_NUMBER;
    hash = (53 * hash) + windowFrameUnits_;
    if (hasStartBound()) {
      hash = (37 * hash) + START_BOUND_FIELD_NUMBER;
      hash = (53 * hash) + getStartBound().hashCode();
    }
    if (hasBound()) {
      hash = (37 * hash) + BOUND_FIELD_NUMBER;
      hash = (53 * hash) + getBound().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.expression.v1.WindowFrame parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrame parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrame parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrame parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrame parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrame parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrame parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrame parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.expression.v1.WindowFrame parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.expression.v1.WindowFrame parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrame parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.expression.v1.WindowFrame parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.expression.v1.WindowFrame prototype) {
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
   * Protobuf type {@code chalk.expression.v1.WindowFrame}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.expression.v1.WindowFrame)
      ai.chalk.protos.chalk.expression.v1.WindowFrameOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_WindowFrame_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_WindowFrame_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.expression.v1.WindowFrame.class, ai.chalk.protos.chalk.expression.v1.WindowFrame.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.expression.v1.WindowFrame.newBuilder()
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
        getStartBoundFieldBuilder();
        getBoundFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      windowFrameUnits_ = 0;
      startBound_ = null;
      if (startBoundBuilder_ != null) {
        startBoundBuilder_.dispose();
        startBoundBuilder_ = null;
      }
      bound_ = null;
      if (boundBuilder_ != null) {
        boundBuilder_.dispose();
        boundBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_WindowFrame_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.WindowFrame getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.expression.v1.WindowFrame.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.WindowFrame build() {
      ai.chalk.protos.chalk.expression.v1.WindowFrame result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.WindowFrame buildPartial() {
      ai.chalk.protos.chalk.expression.v1.WindowFrame result = new ai.chalk.protos.chalk.expression.v1.WindowFrame(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.expression.v1.WindowFrame result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.windowFrameUnits_ = windowFrameUnits_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.startBound_ = startBoundBuilder_ == null
            ? startBound_
            : startBoundBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.bound_ = boundBuilder_ == null
            ? bound_
            : boundBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.expression.v1.WindowFrame) {
        return mergeFrom((ai.chalk.protos.chalk.expression.v1.WindowFrame)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.expression.v1.WindowFrame other) {
      if (other == ai.chalk.protos.chalk.expression.v1.WindowFrame.getDefaultInstance()) return this;
      if (other.windowFrameUnits_ != 0) {
        setWindowFrameUnitsValue(other.getWindowFrameUnitsValue());
      }
      if (other.hasStartBound()) {
        mergeStartBound(other.getStartBound());
      }
      if (other.hasBound()) {
        mergeBound(other.getBound());
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
              windowFrameUnits_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getStartBoundFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getBoundFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private int windowFrameUnits_ = 0;
    /**
     * <code>.chalk.expression.v1.WindowFrameUnits window_frame_units = 1 [json_name = "windowFrameUnits"];</code>
     * @return The enum numeric value on the wire for windowFrameUnits.
     */
    @java.lang.Override public int getWindowFrameUnitsValue() {
      return windowFrameUnits_;
    }
    /**
     * <code>.chalk.expression.v1.WindowFrameUnits window_frame_units = 1 [json_name = "windowFrameUnits"];</code>
     * @param value The enum numeric value on the wire for windowFrameUnits to set.
     * @return This builder for chaining.
     */
    public Builder setWindowFrameUnitsValue(int value) {
      windowFrameUnits_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.expression.v1.WindowFrameUnits window_frame_units = 1 [json_name = "windowFrameUnits"];</code>
     * @return The windowFrameUnits.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.WindowFrameUnits getWindowFrameUnits() {
      ai.chalk.protos.chalk.expression.v1.WindowFrameUnits result = ai.chalk.protos.chalk.expression.v1.WindowFrameUnits.forNumber(windowFrameUnits_);
      return result == null ? ai.chalk.protos.chalk.expression.v1.WindowFrameUnits.UNRECOGNIZED : result;
    }
    /**
     * <code>.chalk.expression.v1.WindowFrameUnits window_frame_units = 1 [json_name = "windowFrameUnits"];</code>
     * @param value The windowFrameUnits to set.
     * @return This builder for chaining.
     */
    public Builder setWindowFrameUnits(ai.chalk.protos.chalk.expression.v1.WindowFrameUnits value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      windowFrameUnits_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.expression.v1.WindowFrameUnits window_frame_units = 1 [json_name = "windowFrameUnits"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWindowFrameUnits() {
      bitField0_ = (bitField0_ & ~0x00000001);
      windowFrameUnits_ = 0;
      onChanged();
      return this;
    }

    private ai.chalk.protos.chalk.expression.v1.WindowFrameBound startBound_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.expression.v1.WindowFrameBound, ai.chalk.protos.chalk.expression.v1.WindowFrameBound.Builder, ai.chalk.protos.chalk.expression.v1.WindowFrameBoundOrBuilder> startBoundBuilder_;
    /**
     * <code>.chalk.expression.v1.WindowFrameBound start_bound = 2 [json_name = "startBound"];</code>
     * @return Whether the startBound field is set.
     */
    public boolean hasStartBound() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.chalk.expression.v1.WindowFrameBound start_bound = 2 [json_name = "startBound"];</code>
     * @return The startBound.
     */
    public ai.chalk.protos.chalk.expression.v1.WindowFrameBound getStartBound() {
      if (startBoundBuilder_ == null) {
        return startBound_ == null ? ai.chalk.protos.chalk.expression.v1.WindowFrameBound.getDefaultInstance() : startBound_;
      } else {
        return startBoundBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.expression.v1.WindowFrameBound start_bound = 2 [json_name = "startBound"];</code>
     */
    public Builder setStartBound(ai.chalk.protos.chalk.expression.v1.WindowFrameBound value) {
      if (startBoundBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startBound_ = value;
      } else {
        startBoundBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.expression.v1.WindowFrameBound start_bound = 2 [json_name = "startBound"];</code>
     */
    public Builder setStartBound(
        ai.chalk.protos.chalk.expression.v1.WindowFrameBound.Builder builderForValue) {
      if (startBoundBuilder_ == null) {
        startBound_ = builderForValue.build();
      } else {
        startBoundBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.expression.v1.WindowFrameBound start_bound = 2 [json_name = "startBound"];</code>
     */
    public Builder mergeStartBound(ai.chalk.protos.chalk.expression.v1.WindowFrameBound value) {
      if (startBoundBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          startBound_ != null &&
          startBound_ != ai.chalk.protos.chalk.expression.v1.WindowFrameBound.getDefaultInstance()) {
          getStartBoundBuilder().mergeFrom(value);
        } else {
          startBound_ = value;
        }
      } else {
        startBoundBuilder_.mergeFrom(value);
      }
      if (startBound_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.expression.v1.WindowFrameBound start_bound = 2 [json_name = "startBound"];</code>
     */
    public Builder clearStartBound() {
      bitField0_ = (bitField0_ & ~0x00000002);
      startBound_ = null;
      if (startBoundBuilder_ != null) {
        startBoundBuilder_.dispose();
        startBoundBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.expression.v1.WindowFrameBound start_bound = 2 [json_name = "startBound"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.WindowFrameBound.Builder getStartBoundBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStartBoundFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.expression.v1.WindowFrameBound start_bound = 2 [json_name = "startBound"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.WindowFrameBoundOrBuilder getStartBoundOrBuilder() {
      if (startBoundBuilder_ != null) {
        return startBoundBuilder_.getMessageOrBuilder();
      } else {
        return startBound_ == null ?
            ai.chalk.protos.chalk.expression.v1.WindowFrameBound.getDefaultInstance() : startBound_;
      }
    }
    /**
     * <code>.chalk.expression.v1.WindowFrameBound start_bound = 2 [json_name = "startBound"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.expression.v1.WindowFrameBound, ai.chalk.protos.chalk.expression.v1.WindowFrameBound.Builder, ai.chalk.protos.chalk.expression.v1.WindowFrameBoundOrBuilder> 
        getStartBoundFieldBuilder() {
      if (startBoundBuilder_ == null) {
        startBoundBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.expression.v1.WindowFrameBound, ai.chalk.protos.chalk.expression.v1.WindowFrameBound.Builder, ai.chalk.protos.chalk.expression.v1.WindowFrameBoundOrBuilder>(
                getStartBound(),
                getParentForChildren(),
                isClean());
        startBound_ = null;
      }
      return startBoundBuilder_;
    }

    private ai.chalk.protos.chalk.expression.v1.WindowFrameBound bound_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.expression.v1.WindowFrameBound, ai.chalk.protos.chalk.expression.v1.WindowFrameBound.Builder, ai.chalk.protos.chalk.expression.v1.WindowFrameBoundOrBuilder> boundBuilder_;
    /**
     * <code>optional .chalk.expression.v1.WindowFrameBound bound = 3 [json_name = "bound"];</code>
     * @return Whether the bound field is set.
     */
    public boolean hasBound() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .chalk.expression.v1.WindowFrameBound bound = 3 [json_name = "bound"];</code>
     * @return The bound.
     */
    public ai.chalk.protos.chalk.expression.v1.WindowFrameBound getBound() {
      if (boundBuilder_ == null) {
        return bound_ == null ? ai.chalk.protos.chalk.expression.v1.WindowFrameBound.getDefaultInstance() : bound_;
      } else {
        return boundBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .chalk.expression.v1.WindowFrameBound bound = 3 [json_name = "bound"];</code>
     */
    public Builder setBound(ai.chalk.protos.chalk.expression.v1.WindowFrameBound value) {
      if (boundBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bound_ = value;
      } else {
        boundBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .chalk.expression.v1.WindowFrameBound bound = 3 [json_name = "bound"];</code>
     */
    public Builder setBound(
        ai.chalk.protos.chalk.expression.v1.WindowFrameBound.Builder builderForValue) {
      if (boundBuilder_ == null) {
        bound_ = builderForValue.build();
      } else {
        boundBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .chalk.expression.v1.WindowFrameBound bound = 3 [json_name = "bound"];</code>
     */
    public Builder mergeBound(ai.chalk.protos.chalk.expression.v1.WindowFrameBound value) {
      if (boundBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          bound_ != null &&
          bound_ != ai.chalk.protos.chalk.expression.v1.WindowFrameBound.getDefaultInstance()) {
          getBoundBuilder().mergeFrom(value);
        } else {
          bound_ = value;
        }
      } else {
        boundBuilder_.mergeFrom(value);
      }
      if (bound_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional .chalk.expression.v1.WindowFrameBound bound = 3 [json_name = "bound"];</code>
     */
    public Builder clearBound() {
      bitField0_ = (bitField0_ & ~0x00000004);
      bound_ = null;
      if (boundBuilder_ != null) {
        boundBuilder_.dispose();
        boundBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .chalk.expression.v1.WindowFrameBound bound = 3 [json_name = "bound"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.WindowFrameBound.Builder getBoundBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getBoundFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .chalk.expression.v1.WindowFrameBound bound = 3 [json_name = "bound"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.WindowFrameBoundOrBuilder getBoundOrBuilder() {
      if (boundBuilder_ != null) {
        return boundBuilder_.getMessageOrBuilder();
      } else {
        return bound_ == null ?
            ai.chalk.protos.chalk.expression.v1.WindowFrameBound.getDefaultInstance() : bound_;
      }
    }
    /**
     * <code>optional .chalk.expression.v1.WindowFrameBound bound = 3 [json_name = "bound"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.expression.v1.WindowFrameBound, ai.chalk.protos.chalk.expression.v1.WindowFrameBound.Builder, ai.chalk.protos.chalk.expression.v1.WindowFrameBoundOrBuilder> 
        getBoundFieldBuilder() {
      if (boundBuilder_ == null) {
        boundBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.expression.v1.WindowFrameBound, ai.chalk.protos.chalk.expression.v1.WindowFrameBound.Builder, ai.chalk.protos.chalk.expression.v1.WindowFrameBoundOrBuilder>(
                getBound(),
                getParentForChildren(),
                isClean());
        bound_ = null;
      }
      return boundBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.expression.v1.WindowFrame)
  }

  // @@protoc_insertion_point(class_scope:chalk.expression.v1.WindowFrame)
  private static final ai.chalk.protos.chalk.expression.v1.WindowFrame DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.expression.v1.WindowFrame();
  }

  public static ai.chalk.protos.chalk.expression.v1.WindowFrame getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WindowFrame>
      PARSER = new com.google.protobuf.AbstractParser<WindowFrame>() {
    @java.lang.Override
    public WindowFrame parsePartialFrom(
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

  public static com.google.protobuf.Parser<WindowFrame> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WindowFrame> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.WindowFrame getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

