// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v1/plan.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.engine.v1;

/**
 * Protobuf type {@code chalk.engine.v1.TableKey}
 */
public final class TableKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.engine.v1.TableKey)
    TableKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TableKey.newBuilder() to construct.
  private TableKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TableKey() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TableKey();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_TableKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_TableKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.engine.v1.TableKey.class, ai.chalk.protos.chalk.engine.v1.TableKey.Builder.class);
  }

  private int keyCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object key_;
  public enum KeyCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    HAS_MANY(1),
    DATA_FRAME(2),
    KEY_NOT_SET(0);
    private final int value;
    private KeyCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static KeyCase valueOf(int value) {
      return forNumber(value);
    }

    public static KeyCase forNumber(int value) {
      switch (value) {
        case 1: return HAS_MANY;
        case 2: return DATA_FRAME;
        case 0: return KEY_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public KeyCase
  getKeyCase() {
    return KeyCase.forNumber(
        keyCase_);
  }

  public static final int HAS_MANY_FIELD_NUMBER = 1;
  /**
   * <code>.chalk.engine.v1.HasManyFeatureKey has_many = 1 [json_name = "hasMany"];</code>
   * @return Whether the hasMany field is set.
   */
  @java.lang.Override
  public boolean hasHasMany() {
    return keyCase_ == 1;
  }
  /**
   * <code>.chalk.engine.v1.HasManyFeatureKey has_many = 1 [json_name = "hasMany"];</code>
   * @return The hasMany.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey getHasMany() {
    if (keyCase_ == 1) {
       return (ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey) key_;
    }
    return ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey.getDefaultInstance();
  }
  /**
   * <code>.chalk.engine.v1.HasManyFeatureKey has_many = 1 [json_name = "hasMany"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.HasManyFeatureKeyOrBuilder getHasManyOrBuilder() {
    if (keyCase_ == 1) {
       return (ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey) key_;
    }
    return ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey.getDefaultInstance();
  }

  public static final int DATA_FRAME_FIELD_NUMBER = 2;
  /**
   * <code>.chalk.engine.v1.DataFrameFeatureKey data_frame = 2 [json_name = "dataFrame"];</code>
   * @return Whether the dataFrame field is set.
   */
  @java.lang.Override
  public boolean hasDataFrame() {
    return keyCase_ == 2;
  }
  /**
   * <code>.chalk.engine.v1.DataFrameFeatureKey data_frame = 2 [json_name = "dataFrame"];</code>
   * @return The dataFrame.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey getDataFrame() {
    if (keyCase_ == 2) {
       return (ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey) key_;
    }
    return ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.getDefaultInstance();
  }
  /**
   * <code>.chalk.engine.v1.DataFrameFeatureKey data_frame = 2 [json_name = "dataFrame"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKeyOrBuilder getDataFrameOrBuilder() {
    if (keyCase_ == 2) {
       return (ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey) key_;
    }
    return ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.getDefaultInstance();
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
    if (keyCase_ == 1) {
      output.writeMessage(1, (ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey) key_);
    }
    if (keyCase_ == 2) {
      output.writeMessage(2, (ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey) key_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (keyCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey) key_);
    }
    if (keyCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey) key_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.engine.v1.TableKey)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.engine.v1.TableKey other = (ai.chalk.protos.chalk.engine.v1.TableKey) obj;

    if (!getKeyCase().equals(other.getKeyCase())) return false;
    switch (keyCase_) {
      case 1:
        if (!getHasMany()
            .equals(other.getHasMany())) return false;
        break;
      case 2:
        if (!getDataFrame()
            .equals(other.getDataFrame())) return false;
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
    switch (keyCase_) {
      case 1:
        hash = (37 * hash) + HAS_MANY_FIELD_NUMBER;
        hash = (53 * hash) + getHasMany().hashCode();
        break;
      case 2:
        hash = (37 * hash) + DATA_FRAME_FIELD_NUMBER;
        hash = (53 * hash) + getDataFrame().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.engine.v1.TableKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.TableKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.TableKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.TableKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.TableKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.TableKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.TableKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.engine.v1.TableKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.engine.v1.TableKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.engine.v1.TableKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.TableKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.engine.v1.TableKey parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.engine.v1.TableKey prototype) {
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
   * Protobuf type {@code chalk.engine.v1.TableKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.engine.v1.TableKey)
      ai.chalk.protos.chalk.engine.v1.TableKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_TableKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_TableKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.engine.v1.TableKey.class, ai.chalk.protos.chalk.engine.v1.TableKey.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.engine.v1.TableKey.newBuilder()
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
      if (hasManyBuilder_ != null) {
        hasManyBuilder_.clear();
      }
      if (dataFrameBuilder_ != null) {
        dataFrameBuilder_.clear();
      }
      keyCase_ = 0;
      key_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_TableKey_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.TableKey getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.engine.v1.TableKey.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.TableKey build() {
      ai.chalk.protos.chalk.engine.v1.TableKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.TableKey buildPartial() {
      ai.chalk.protos.chalk.engine.v1.TableKey result = new ai.chalk.protos.chalk.engine.v1.TableKey(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.engine.v1.TableKey result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(ai.chalk.protos.chalk.engine.v1.TableKey result) {
      result.keyCase_ = keyCase_;
      result.key_ = this.key_;
      if (keyCase_ == 1 &&
          hasManyBuilder_ != null) {
        result.key_ = hasManyBuilder_.build();
      }
      if (keyCase_ == 2 &&
          dataFrameBuilder_ != null) {
        result.key_ = dataFrameBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.engine.v1.TableKey) {
        return mergeFrom((ai.chalk.protos.chalk.engine.v1.TableKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.engine.v1.TableKey other) {
      if (other == ai.chalk.protos.chalk.engine.v1.TableKey.getDefaultInstance()) return this;
      switch (other.getKeyCase()) {
        case HAS_MANY: {
          mergeHasMany(other.getHasMany());
          break;
        }
        case DATA_FRAME: {
          mergeDataFrame(other.getDataFrame());
          break;
        }
        case KEY_NOT_SET: {
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
            case 10: {
              input.readMessage(
                  getHasManyFieldBuilder().getBuilder(),
                  extensionRegistry);
              keyCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDataFrameFieldBuilder().getBuilder(),
                  extensionRegistry);
              keyCase_ = 2;
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
    private int keyCase_ = 0;
    private java.lang.Object key_;
    public KeyCase
        getKeyCase() {
      return KeyCase.forNumber(
          keyCase_);
    }

    public Builder clearKey() {
      keyCase_ = 0;
      key_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey, ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey.Builder, ai.chalk.protos.chalk.engine.v1.HasManyFeatureKeyOrBuilder> hasManyBuilder_;
    /**
     * <code>.chalk.engine.v1.HasManyFeatureKey has_many = 1 [json_name = "hasMany"];</code>
     * @return Whether the hasMany field is set.
     */
    @java.lang.Override
    public boolean hasHasMany() {
      return keyCase_ == 1;
    }
    /**
     * <code>.chalk.engine.v1.HasManyFeatureKey has_many = 1 [json_name = "hasMany"];</code>
     * @return The hasMany.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey getHasMany() {
      if (hasManyBuilder_ == null) {
        if (keyCase_ == 1) {
          return (ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey) key_;
        }
        return ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey.getDefaultInstance();
      } else {
        if (keyCase_ == 1) {
          return hasManyBuilder_.getMessage();
        }
        return ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.engine.v1.HasManyFeatureKey has_many = 1 [json_name = "hasMany"];</code>
     */
    public Builder setHasMany(ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey value) {
      if (hasManyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        key_ = value;
        onChanged();
      } else {
        hasManyBuilder_.setMessage(value);
      }
      keyCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.engine.v1.HasManyFeatureKey has_many = 1 [json_name = "hasMany"];</code>
     */
    public Builder setHasMany(
        ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey.Builder builderForValue) {
      if (hasManyBuilder_ == null) {
        key_ = builderForValue.build();
        onChanged();
      } else {
        hasManyBuilder_.setMessage(builderForValue.build());
      }
      keyCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.engine.v1.HasManyFeatureKey has_many = 1 [json_name = "hasMany"];</code>
     */
    public Builder mergeHasMany(ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey value) {
      if (hasManyBuilder_ == null) {
        if (keyCase_ == 1 &&
            key_ != ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey.getDefaultInstance()) {
          key_ = ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey.newBuilder((ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey) key_)
              .mergeFrom(value).buildPartial();
        } else {
          key_ = value;
        }
        onChanged();
      } else {
        if (keyCase_ == 1) {
          hasManyBuilder_.mergeFrom(value);
        } else {
          hasManyBuilder_.setMessage(value);
        }
      }
      keyCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.engine.v1.HasManyFeatureKey has_many = 1 [json_name = "hasMany"];</code>
     */
    public Builder clearHasMany() {
      if (hasManyBuilder_ == null) {
        if (keyCase_ == 1) {
          keyCase_ = 0;
          key_ = null;
          onChanged();
        }
      } else {
        if (keyCase_ == 1) {
          keyCase_ = 0;
          key_ = null;
        }
        hasManyBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.chalk.engine.v1.HasManyFeatureKey has_many = 1 [json_name = "hasMany"];</code>
     */
    public ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey.Builder getHasManyBuilder() {
      return getHasManyFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.engine.v1.HasManyFeatureKey has_many = 1 [json_name = "hasMany"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.HasManyFeatureKeyOrBuilder getHasManyOrBuilder() {
      if ((keyCase_ == 1) && (hasManyBuilder_ != null)) {
        return hasManyBuilder_.getMessageOrBuilder();
      } else {
        if (keyCase_ == 1) {
          return (ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey) key_;
        }
        return ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.engine.v1.HasManyFeatureKey has_many = 1 [json_name = "hasMany"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey, ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey.Builder, ai.chalk.protos.chalk.engine.v1.HasManyFeatureKeyOrBuilder> 
        getHasManyFieldBuilder() {
      if (hasManyBuilder_ == null) {
        if (!(keyCase_ == 1)) {
          key_ = ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey.getDefaultInstance();
        }
        hasManyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey, ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey.Builder, ai.chalk.protos.chalk.engine.v1.HasManyFeatureKeyOrBuilder>(
                (ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey) key_,
                getParentForChildren(),
                isClean());
        key_ = null;
      }
      keyCase_ = 1;
      onChanged();
      return hasManyBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey, ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.Builder, ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKeyOrBuilder> dataFrameBuilder_;
    /**
     * <code>.chalk.engine.v1.DataFrameFeatureKey data_frame = 2 [json_name = "dataFrame"];</code>
     * @return Whether the dataFrame field is set.
     */
    @java.lang.Override
    public boolean hasDataFrame() {
      return keyCase_ == 2;
    }
    /**
     * <code>.chalk.engine.v1.DataFrameFeatureKey data_frame = 2 [json_name = "dataFrame"];</code>
     * @return The dataFrame.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey getDataFrame() {
      if (dataFrameBuilder_ == null) {
        if (keyCase_ == 2) {
          return (ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey) key_;
        }
        return ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.getDefaultInstance();
      } else {
        if (keyCase_ == 2) {
          return dataFrameBuilder_.getMessage();
        }
        return ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.engine.v1.DataFrameFeatureKey data_frame = 2 [json_name = "dataFrame"];</code>
     */
    public Builder setDataFrame(ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey value) {
      if (dataFrameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        key_ = value;
        onChanged();
      } else {
        dataFrameBuilder_.setMessage(value);
      }
      keyCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.engine.v1.DataFrameFeatureKey data_frame = 2 [json_name = "dataFrame"];</code>
     */
    public Builder setDataFrame(
        ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.Builder builderForValue) {
      if (dataFrameBuilder_ == null) {
        key_ = builderForValue.build();
        onChanged();
      } else {
        dataFrameBuilder_.setMessage(builderForValue.build());
      }
      keyCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.engine.v1.DataFrameFeatureKey data_frame = 2 [json_name = "dataFrame"];</code>
     */
    public Builder mergeDataFrame(ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey value) {
      if (dataFrameBuilder_ == null) {
        if (keyCase_ == 2 &&
            key_ != ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.getDefaultInstance()) {
          key_ = ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.newBuilder((ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey) key_)
              .mergeFrom(value).buildPartial();
        } else {
          key_ = value;
        }
        onChanged();
      } else {
        if (keyCase_ == 2) {
          dataFrameBuilder_.mergeFrom(value);
        } else {
          dataFrameBuilder_.setMessage(value);
        }
      }
      keyCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.engine.v1.DataFrameFeatureKey data_frame = 2 [json_name = "dataFrame"];</code>
     */
    public Builder clearDataFrame() {
      if (dataFrameBuilder_ == null) {
        if (keyCase_ == 2) {
          keyCase_ = 0;
          key_ = null;
          onChanged();
        }
      } else {
        if (keyCase_ == 2) {
          keyCase_ = 0;
          key_ = null;
        }
        dataFrameBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.chalk.engine.v1.DataFrameFeatureKey data_frame = 2 [json_name = "dataFrame"];</code>
     */
    public ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.Builder getDataFrameBuilder() {
      return getDataFrameFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.engine.v1.DataFrameFeatureKey data_frame = 2 [json_name = "dataFrame"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKeyOrBuilder getDataFrameOrBuilder() {
      if ((keyCase_ == 2) && (dataFrameBuilder_ != null)) {
        return dataFrameBuilder_.getMessageOrBuilder();
      } else {
        if (keyCase_ == 2) {
          return (ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey) key_;
        }
        return ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.engine.v1.DataFrameFeatureKey data_frame = 2 [json_name = "dataFrame"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey, ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.Builder, ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKeyOrBuilder> 
        getDataFrameFieldBuilder() {
      if (dataFrameBuilder_ == null) {
        if (!(keyCase_ == 2)) {
          key_ = ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.getDefaultInstance();
        }
        dataFrameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey, ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.Builder, ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKeyOrBuilder>(
                (ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey) key_,
                getParentForChildren(),
                isClean());
        key_ = null;
      }
      keyCase_ = 2;
      onChanged();
      return dataFrameBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.engine.v1.TableKey)
  }

  // @@protoc_insertion_point(class_scope:chalk.engine.v1.TableKey)
  private static final ai.chalk.protos.chalk.engine.v1.TableKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.engine.v1.TableKey();
  }

  public static ai.chalk.protos.chalk.engine.v1.TableKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TableKey>
      PARSER = new com.google.protobuf.AbstractParser<TableKey>() {
    @java.lang.Override
    public TableKey parsePartialFrom(
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

  public static com.google.protobuf.Parser<TableKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TableKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.TableKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

