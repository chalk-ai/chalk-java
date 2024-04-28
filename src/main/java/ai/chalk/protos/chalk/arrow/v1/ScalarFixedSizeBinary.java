// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/arrow/v1/arrow.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.arrow.v1;

/**
 * Protobuf type {@code chalk.arrow.v1.ScalarFixedSizeBinary}
 */
public final class ScalarFixedSizeBinary extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.arrow.v1.ScalarFixedSizeBinary)
    ScalarFixedSizeBinaryOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ScalarFixedSizeBinary.class.getName());
  }
  // Use ScalarFixedSizeBinary.newBuilder() to construct.
  private ScalarFixedSizeBinary(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ScalarFixedSizeBinary() {
    values_ = com.google.protobuf.ByteString.EMPTY;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_ScalarFixedSizeBinary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_ScalarFixedSizeBinary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary.class, ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString values_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes values = 1 [json_name = "values"];</code>
   * @return The values.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getValues() {
    return values_;
  }

  public static final int LENGTH_FIELD_NUMBER = 2;
  private int length_ = 0;
  /**
   * <code>int32 length = 2 [json_name = "length"];</code>
   * @return The length.
   */
  @java.lang.Override
  public int getLength() {
    return length_;
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
    if (!values_.isEmpty()) {
      output.writeBytes(1, values_);
    }
    if (length_ != 0) {
      output.writeInt32(2, length_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!values_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, values_);
    }
    if (length_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, length_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary other = (ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary) obj;

    if (!getValues()
        .equals(other.getValues())) return false;
    if (getLength()
        != other.getLength()) return false;
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
    hash = (37 * hash) + VALUES_FIELD_NUMBER;
    hash = (53 * hash) + getValues().hashCode();
    hash = (37 * hash) + LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + getLength();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary prototype) {
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
   * Protobuf type {@code chalk.arrow.v1.ScalarFixedSizeBinary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.arrow.v1.ScalarFixedSizeBinary)
      ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_ScalarFixedSizeBinary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_ScalarFixedSizeBinary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary.class, ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary.newBuilder()
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
      values_ = com.google.protobuf.ByteString.EMPTY;
      length_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_ScalarFixedSizeBinary_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary build() {
      ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary buildPartial() {
      ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary result = new ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.values_ = values_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.length_ = length_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary) {
        return mergeFrom((ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary other) {
      if (other == ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary.getDefaultInstance()) return this;
      if (other.getValues() != com.google.protobuf.ByteString.EMPTY) {
        setValues(other.getValues());
      }
      if (other.getLength() != 0) {
        setLength(other.getLength());
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
              values_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              length_ = input.readInt32();
              bitField0_ |= 0x00000002;
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
    private int bitField0_;

    private com.google.protobuf.ByteString values_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes values = 1 [json_name = "values"];</code>
     * @return The values.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getValues() {
      return values_;
    }
    /**
     * <code>bytes values = 1 [json_name = "values"];</code>
     * @param value The values to set.
     * @return This builder for chaining.
     */
    public Builder setValues(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      values_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes values = 1 [json_name = "values"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValues() {
      bitField0_ = (bitField0_ & ~0x00000001);
      values_ = getDefaultInstance().getValues();
      onChanged();
      return this;
    }

    private int length_ ;
    /**
     * <code>int32 length = 2 [json_name = "length"];</code>
     * @return The length.
     */
    @java.lang.Override
    public int getLength() {
      return length_;
    }
    /**
     * <code>int32 length = 2 [json_name = "length"];</code>
     * @param value The length to set.
     * @return This builder for chaining.
     */
    public Builder setLength(int value) {

      length_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 length = 2 [json_name = "length"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLength() {
      bitField0_ = (bitField0_ & ~0x00000002);
      length_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:chalk.arrow.v1.ScalarFixedSizeBinary)
  }

  // @@protoc_insertion_point(class_scope:chalk.arrow.v1.ScalarFixedSizeBinary)
  private static final ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary();
  }

  public static ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScalarFixedSizeBinary>
      PARSER = new com.google.protobuf.AbstractParser<ScalarFixedSizeBinary>() {
    @java.lang.Override
    public ScalarFixedSizeBinary parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScalarFixedSizeBinary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScalarFixedSizeBinary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.ScalarFixedSizeBinary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

