// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.graph.v1;

/**
 * Protobuf type {@code chalk.graph.v1.FeatureValidation}
 */
public final class FeatureValidation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.graph.v1.FeatureValidation)
    FeatureValidationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeatureValidation.newBuilder() to construct.
  private FeatureValidation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeatureValidation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeatureValidation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_FeatureValidation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_FeatureValidation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.graph.v1.FeatureValidation.class, ai.chalk.protos.chalk.graph.v1.FeatureValidation.Builder.class);
  }

  private int validationCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object validation_;
  public enum ValidationCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    MIN(1),
    MAX(2),
    MIN_LENGTH(3),
    MAX_LENGTH(4),
    VALIDATION_NOT_SET(0);
    private final int value;
    private ValidationCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValidationCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValidationCase forNumber(int value) {
      switch (value) {
        case 1: return MIN;
        case 2: return MAX;
        case 3: return MIN_LENGTH;
        case 4: return MAX_LENGTH;
        case 0: return VALIDATION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValidationCase
  getValidationCase() {
    return ValidationCase.forNumber(
        validationCase_);
  }

  public static final int MIN_FIELD_NUMBER = 1;
  /**
   * <code>float min = 1 [json_name = "min"];</code>
   * @return Whether the min field is set.
   */
  @java.lang.Override
  public boolean hasMin() {
    return validationCase_ == 1;
  }
  /**
   * <code>float min = 1 [json_name = "min"];</code>
   * @return The min.
   */
  @java.lang.Override
  public float getMin() {
    if (validationCase_ == 1) {
      return (java.lang.Float) validation_;
    }
    return 0F;
  }

  public static final int MAX_FIELD_NUMBER = 2;
  /**
   * <code>float max = 2 [json_name = "max"];</code>
   * @return Whether the max field is set.
   */
  @java.lang.Override
  public boolean hasMax() {
    return validationCase_ == 2;
  }
  /**
   * <code>float max = 2 [json_name = "max"];</code>
   * @return The max.
   */
  @java.lang.Override
  public float getMax() {
    if (validationCase_ == 2) {
      return (java.lang.Float) validation_;
    }
    return 0F;
  }

  public static final int MIN_LENGTH_FIELD_NUMBER = 3;
  /**
   * <code>uint32 min_length = 3 [json_name = "minLength"];</code>
   * @return Whether the minLength field is set.
   */
  @java.lang.Override
  public boolean hasMinLength() {
    return validationCase_ == 3;
  }
  /**
   * <code>uint32 min_length = 3 [json_name = "minLength"];</code>
   * @return The minLength.
   */
  @java.lang.Override
  public int getMinLength() {
    if (validationCase_ == 3) {
      return (java.lang.Integer) validation_;
    }
    return 0;
  }

  public static final int MAX_LENGTH_FIELD_NUMBER = 4;
  /**
   * <code>uint32 max_length = 4 [json_name = "maxLength"];</code>
   * @return Whether the maxLength field is set.
   */
  @java.lang.Override
  public boolean hasMaxLength() {
    return validationCase_ == 4;
  }
  /**
   * <code>uint32 max_length = 4 [json_name = "maxLength"];</code>
   * @return The maxLength.
   */
  @java.lang.Override
  public int getMaxLength() {
    if (validationCase_ == 4) {
      return (java.lang.Integer) validation_;
    }
    return 0;
  }

  public static final int STRICT_FIELD_NUMBER = 5;
  private boolean strict_ = false;
  /**
   * <code>bool strict = 5 [json_name = "strict"];</code>
   * @return The strict.
   */
  @java.lang.Override
  public boolean getStrict() {
    return strict_;
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
    if (validationCase_ == 1) {
      output.writeFloat(
          1, (float)((java.lang.Float) validation_));
    }
    if (validationCase_ == 2) {
      output.writeFloat(
          2, (float)((java.lang.Float) validation_));
    }
    if (validationCase_ == 3) {
      output.writeUInt32(
          3, (int)((java.lang.Integer) validation_));
    }
    if (validationCase_ == 4) {
      output.writeUInt32(
          4, (int)((java.lang.Integer) validation_));
    }
    if (strict_ != false) {
      output.writeBool(5, strict_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (validationCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(
            1, (float)((java.lang.Float) validation_));
    }
    if (validationCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(
            2, (float)((java.lang.Float) validation_));
    }
    if (validationCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(
            3, (int)((java.lang.Integer) validation_));
    }
    if (validationCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(
            4, (int)((java.lang.Integer) validation_));
    }
    if (strict_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, strict_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.graph.v1.FeatureValidation)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.graph.v1.FeatureValidation other = (ai.chalk.protos.chalk.graph.v1.FeatureValidation) obj;

    if (getStrict()
        != other.getStrict()) return false;
    if (!getValidationCase().equals(other.getValidationCase())) return false;
    switch (validationCase_) {
      case 1:
        if (java.lang.Float.floatToIntBits(getMin())
            != java.lang.Float.floatToIntBits(
                other.getMin())) return false;
        break;
      case 2:
        if (java.lang.Float.floatToIntBits(getMax())
            != java.lang.Float.floatToIntBits(
                other.getMax())) return false;
        break;
      case 3:
        if (getMinLength()
            != other.getMinLength()) return false;
        break;
      case 4:
        if (getMaxLength()
            != other.getMaxLength()) return false;
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
    hash = (37 * hash) + STRICT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getStrict());
    switch (validationCase_) {
      case 1:
        hash = (37 * hash) + MIN_FIELD_NUMBER;
        hash = (53 * hash) + java.lang.Float.floatToIntBits(
            getMin());
        break;
      case 2:
        hash = (37 * hash) + MAX_FIELD_NUMBER;
        hash = (53 * hash) + java.lang.Float.floatToIntBits(
            getMax());
        break;
      case 3:
        hash = (37 * hash) + MIN_LENGTH_FIELD_NUMBER;
        hash = (53 * hash) + getMinLength();
        break;
      case 4:
        hash = (37 * hash) + MAX_LENGTH_FIELD_NUMBER;
        hash = (53 * hash) + getMaxLength();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.graph.v1.FeatureValidation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.FeatureValidation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.FeatureValidation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.FeatureValidation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.FeatureValidation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.FeatureValidation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.FeatureValidation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.graph.v1.FeatureValidation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.graph.v1.FeatureValidation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.graph.v1.FeatureValidation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.FeatureValidation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.graph.v1.FeatureValidation parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.graph.v1.FeatureValidation prototype) {
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
   * Protobuf type {@code chalk.graph.v1.FeatureValidation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.graph.v1.FeatureValidation)
      ai.chalk.protos.chalk.graph.v1.FeatureValidationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_FeatureValidation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_FeatureValidation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.graph.v1.FeatureValidation.class, ai.chalk.protos.chalk.graph.v1.FeatureValidation.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.graph.v1.FeatureValidation.newBuilder()
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
      strict_ = false;
      validationCase_ = 0;
      validation_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_FeatureValidation_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.FeatureValidation getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.graph.v1.FeatureValidation.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.FeatureValidation build() {
      ai.chalk.protos.chalk.graph.v1.FeatureValidation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.FeatureValidation buildPartial() {
      ai.chalk.protos.chalk.graph.v1.FeatureValidation result = new ai.chalk.protos.chalk.graph.v1.FeatureValidation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.graph.v1.FeatureValidation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.strict_ = strict_;
      }
    }

    private void buildPartialOneofs(ai.chalk.protos.chalk.graph.v1.FeatureValidation result) {
      result.validationCase_ = validationCase_;
      result.validation_ = this.validation_;
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
      if (other instanceof ai.chalk.protos.chalk.graph.v1.FeatureValidation) {
        return mergeFrom((ai.chalk.protos.chalk.graph.v1.FeatureValidation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.graph.v1.FeatureValidation other) {
      if (other == ai.chalk.protos.chalk.graph.v1.FeatureValidation.getDefaultInstance()) return this;
      if (other.getStrict() != false) {
        setStrict(other.getStrict());
      }
      switch (other.getValidationCase()) {
        case MIN: {
          setMin(other.getMin());
          break;
        }
        case MAX: {
          setMax(other.getMax());
          break;
        }
        case MIN_LENGTH: {
          setMinLength(other.getMinLength());
          break;
        }
        case MAX_LENGTH: {
          setMaxLength(other.getMaxLength());
          break;
        }
        case VALIDATION_NOT_SET: {
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
            case 13: {
              validation_ = input.readFloat();
              validationCase_ = 1;
              break;
            } // case 13
            case 21: {
              validation_ = input.readFloat();
              validationCase_ = 2;
              break;
            } // case 21
            case 24: {
              validation_ = input.readUInt32();
              validationCase_ = 3;
              break;
            } // case 24
            case 32: {
              validation_ = input.readUInt32();
              validationCase_ = 4;
              break;
            } // case 32
            case 40: {
              strict_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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
    private int validationCase_ = 0;
    private java.lang.Object validation_;
    public ValidationCase
        getValidationCase() {
      return ValidationCase.forNumber(
          validationCase_);
    }

    public Builder clearValidation() {
      validationCase_ = 0;
      validation_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>float min = 1 [json_name = "min"];</code>
     * @return Whether the min field is set.
     */
    public boolean hasMin() {
      return validationCase_ == 1;
    }
    /**
     * <code>float min = 1 [json_name = "min"];</code>
     * @return The min.
     */
    public float getMin() {
      if (validationCase_ == 1) {
        return (java.lang.Float) validation_;
      }
      return 0F;
    }
    /**
     * <code>float min = 1 [json_name = "min"];</code>
     * @param value The min to set.
     * @return This builder for chaining.
     */
    public Builder setMin(float value) {

      validationCase_ = 1;
      validation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float min = 1 [json_name = "min"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMin() {
      if (validationCase_ == 1) {
        validationCase_ = 0;
        validation_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>float max = 2 [json_name = "max"];</code>
     * @return Whether the max field is set.
     */
    public boolean hasMax() {
      return validationCase_ == 2;
    }
    /**
     * <code>float max = 2 [json_name = "max"];</code>
     * @return The max.
     */
    public float getMax() {
      if (validationCase_ == 2) {
        return (java.lang.Float) validation_;
      }
      return 0F;
    }
    /**
     * <code>float max = 2 [json_name = "max"];</code>
     * @param value The max to set.
     * @return This builder for chaining.
     */
    public Builder setMax(float value) {

      validationCase_ = 2;
      validation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float max = 2 [json_name = "max"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMax() {
      if (validationCase_ == 2) {
        validationCase_ = 0;
        validation_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>uint32 min_length = 3 [json_name = "minLength"];</code>
     * @return Whether the minLength field is set.
     */
    public boolean hasMinLength() {
      return validationCase_ == 3;
    }
    /**
     * <code>uint32 min_length = 3 [json_name = "minLength"];</code>
     * @return The minLength.
     */
    public int getMinLength() {
      if (validationCase_ == 3) {
        return (java.lang.Integer) validation_;
      }
      return 0;
    }
    /**
     * <code>uint32 min_length = 3 [json_name = "minLength"];</code>
     * @param value The minLength to set.
     * @return This builder for chaining.
     */
    public Builder setMinLength(int value) {

      validationCase_ = 3;
      validation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 min_length = 3 [json_name = "minLength"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMinLength() {
      if (validationCase_ == 3) {
        validationCase_ = 0;
        validation_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>uint32 max_length = 4 [json_name = "maxLength"];</code>
     * @return Whether the maxLength field is set.
     */
    public boolean hasMaxLength() {
      return validationCase_ == 4;
    }
    /**
     * <code>uint32 max_length = 4 [json_name = "maxLength"];</code>
     * @return The maxLength.
     */
    public int getMaxLength() {
      if (validationCase_ == 4) {
        return (java.lang.Integer) validation_;
      }
      return 0;
    }
    /**
     * <code>uint32 max_length = 4 [json_name = "maxLength"];</code>
     * @param value The maxLength to set.
     * @return This builder for chaining.
     */
    public Builder setMaxLength(int value) {

      validationCase_ = 4;
      validation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 max_length = 4 [json_name = "maxLength"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxLength() {
      if (validationCase_ == 4) {
        validationCase_ = 0;
        validation_ = null;
        onChanged();
      }
      return this;
    }

    private boolean strict_ ;
    /**
     * <code>bool strict = 5 [json_name = "strict"];</code>
     * @return The strict.
     */
    @java.lang.Override
    public boolean getStrict() {
      return strict_;
    }
    /**
     * <code>bool strict = 5 [json_name = "strict"];</code>
     * @param value The strict to set.
     * @return This builder for chaining.
     */
    public Builder setStrict(boolean value) {

      strict_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>bool strict = 5 [json_name = "strict"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStrict() {
      bitField0_ = (bitField0_ & ~0x00000010);
      strict_ = false;
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


    // @@protoc_insertion_point(builder_scope:chalk.graph.v1.FeatureValidation)
  }

  // @@protoc_insertion_point(class_scope:chalk.graph.v1.FeatureValidation)
  private static final ai.chalk.protos.chalk.graph.v1.FeatureValidation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.graph.v1.FeatureValidation();
  }

  public static ai.chalk.protos.chalk.graph.v1.FeatureValidation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeatureValidation>
      PARSER = new com.google.protobuf.AbstractParser<FeatureValidation>() {
    @java.lang.Override
    public FeatureValidation parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeatureValidation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeatureValidation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.FeatureValidation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

