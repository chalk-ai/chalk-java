// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/arrow/v1/arrow.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.arrow.v1;

/**
 * Protobuf type {@code chalk.arrow.v1.Decimal}
 */
public final class Decimal extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.arrow.v1.Decimal)
    DecimalOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      Decimal.class.getName());
  }
  // Use Decimal.newBuilder() to construct.
  private Decimal(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Decimal() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_Decimal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_Decimal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.arrow.v1.Decimal.class, ai.chalk.protos.chalk.arrow.v1.Decimal.Builder.class);
  }

  public static final int PRECISION_FIELD_NUMBER = 1;
  private int precision_ = 0;
  /**
   * <code>int32 precision = 1 [json_name = "precision"];</code>
   * @return The precision.
   */
  @java.lang.Override
  public int getPrecision() {
    return precision_;
  }

  public static final int SCALE_FIELD_NUMBER = 2;
  private int scale_ = 0;
  /**
   * <code>int32 scale = 2 [json_name = "scale"];</code>
   * @return The scale.
   */
  @java.lang.Override
  public int getScale() {
    return scale_;
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
    if (precision_ != 0) {
      output.writeInt32(1, precision_);
    }
    if (scale_ != 0) {
      output.writeInt32(2, scale_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (precision_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, precision_);
    }
    if (scale_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, scale_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.arrow.v1.Decimal)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.arrow.v1.Decimal other = (ai.chalk.protos.chalk.arrow.v1.Decimal) obj;

    if (getPrecision()
        != other.getPrecision()) return false;
    if (getScale()
        != other.getScale()) return false;
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
    hash = (37 * hash) + PRECISION_FIELD_NUMBER;
    hash = (53 * hash) + getPrecision();
    hash = (37 * hash) + SCALE_FIELD_NUMBER;
    hash = (53 * hash) + getScale();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.arrow.v1.Decimal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Decimal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Decimal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Decimal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Decimal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Decimal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Decimal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Decimal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.arrow.v1.Decimal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.arrow.v1.Decimal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Decimal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Decimal parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.arrow.v1.Decimal prototype) {
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
   * Protobuf type {@code chalk.arrow.v1.Decimal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.arrow.v1.Decimal)
      ai.chalk.protos.chalk.arrow.v1.DecimalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_Decimal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_Decimal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.arrow.v1.Decimal.class, ai.chalk.protos.chalk.arrow.v1.Decimal.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.arrow.v1.Decimal.newBuilder()
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
      precision_ = 0;
      scale_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_Decimal_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.Decimal getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.arrow.v1.Decimal.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.Decimal build() {
      ai.chalk.protos.chalk.arrow.v1.Decimal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.Decimal buildPartial() {
      ai.chalk.protos.chalk.arrow.v1.Decimal result = new ai.chalk.protos.chalk.arrow.v1.Decimal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.arrow.v1.Decimal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.precision_ = precision_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.scale_ = scale_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.arrow.v1.Decimal) {
        return mergeFrom((ai.chalk.protos.chalk.arrow.v1.Decimal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.arrow.v1.Decimal other) {
      if (other == ai.chalk.protos.chalk.arrow.v1.Decimal.getDefaultInstance()) return this;
      if (other.getPrecision() != 0) {
        setPrecision(other.getPrecision());
      }
      if (other.getScale() != 0) {
        setScale(other.getScale());
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
              precision_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              scale_ = input.readInt32();
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

    private int precision_ ;
    /**
     * <code>int32 precision = 1 [json_name = "precision"];</code>
     * @return The precision.
     */
    @java.lang.Override
    public int getPrecision() {
      return precision_;
    }
    /**
     * <code>int32 precision = 1 [json_name = "precision"];</code>
     * @param value The precision to set.
     * @return This builder for chaining.
     */
    public Builder setPrecision(int value) {

      precision_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 precision = 1 [json_name = "precision"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPrecision() {
      bitField0_ = (bitField0_ & ~0x00000001);
      precision_ = 0;
      onChanged();
      return this;
    }

    private int scale_ ;
    /**
     * <code>int32 scale = 2 [json_name = "scale"];</code>
     * @return The scale.
     */
    @java.lang.Override
    public int getScale() {
      return scale_;
    }
    /**
     * <code>int32 scale = 2 [json_name = "scale"];</code>
     * @param value The scale to set.
     * @return This builder for chaining.
     */
    public Builder setScale(int value) {

      scale_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 scale = 2 [json_name = "scale"];</code>
     * @return This builder for chaining.
     */
    public Builder clearScale() {
      bitField0_ = (bitField0_ & ~0x00000002);
      scale_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:chalk.arrow.v1.Decimal)
  }

  // @@protoc_insertion_point(class_scope:chalk.arrow.v1.Decimal)
  private static final ai.chalk.protos.chalk.arrow.v1.Decimal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.arrow.v1.Decimal();
  }

  public static ai.chalk.protos.chalk.arrow.v1.Decimal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Decimal>
      PARSER = new com.google.protobuf.AbstractParser<Decimal>() {
    @java.lang.Override
    public Decimal parsePartialFrom(
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

  public static com.google.protobuf.Parser<Decimal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Decimal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.Decimal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
