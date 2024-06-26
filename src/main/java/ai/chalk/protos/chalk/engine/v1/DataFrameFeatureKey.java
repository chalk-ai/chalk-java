// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v1/plan.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.engine.v1;

/**
 * Protobuf type {@code chalk.engine.v1.DataFrameFeatureKey}
 */
public final class DataFrameFeatureKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.engine.v1.DataFrameFeatureKey)
    DataFrameFeatureKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DataFrameFeatureKey.newBuilder() to construct.
  private DataFrameFeatureKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DataFrameFeatureKey() {
    rootNamespace_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DataFrameFeatureKey();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_DataFrameFeatureKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_DataFrameFeatureKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.class, ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.Builder.class);
  }

  private int bitField0_;
  public static final int ROOT_NAMESPACE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rootNamespace_ = "";
  /**
   * <code>string root_namespace = 1 [json_name = "rootNamespace"];</code>
   * @return The rootNamespace.
   */
  @java.lang.Override
  public java.lang.String getRootNamespace() {
    java.lang.Object ref = rootNamespace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rootNamespace_ = s;
      return s;
    }
  }
  /**
   * <code>string root_namespace = 1 [json_name = "rootNamespace"];</code>
   * @return The bytes for rootNamespace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRootNamespaceBytes() {
    java.lang.Object ref = rootNamespace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rootNamespace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DF_FIELD_NUMBER = 2;
  private ai.chalk.protos.chalk.engine.v1.DataFrame df_;
  /**
   * <code>.chalk.engine.v1.DataFrame df = 2 [json_name = "df"];</code>
   * @return Whether the df field is set.
   */
  @java.lang.Override
  public boolean hasDf() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.engine.v1.DataFrame df = 2 [json_name = "df"];</code>
   * @return The df.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.DataFrame getDf() {
    return df_ == null ? ai.chalk.protos.chalk.engine.v1.DataFrame.getDefaultInstance() : df_;
  }
  /**
   * <code>.chalk.engine.v1.DataFrame df = 2 [json_name = "df"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.DataFrameOrBuilder getDfOrBuilder() {
    return df_ == null ? ai.chalk.protos.chalk.engine.v1.DataFrame.getDefaultInstance() : df_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rootNamespace_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rootNamespace_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getDf());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rootNamespace_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rootNamespace_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDf());
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
    if (!(obj instanceof ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey other = (ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey) obj;

    if (!getRootNamespace()
        .equals(other.getRootNamespace())) return false;
    if (hasDf() != other.hasDf()) return false;
    if (hasDf()) {
      if (!getDf()
          .equals(other.getDf())) return false;
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
    hash = (37 * hash) + ROOT_NAMESPACE_FIELD_NUMBER;
    hash = (53 * hash) + getRootNamespace().hashCode();
    if (hasDf()) {
      hash = (37 * hash) + DF_FIELD_NUMBER;
      hash = (53 * hash) + getDf().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey prototype) {
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
   * Protobuf type {@code chalk.engine.v1.DataFrameFeatureKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.engine.v1.DataFrameFeatureKey)
      ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_DataFrameFeatureKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_DataFrameFeatureKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.class, ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.newBuilder()
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
        getDfFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      rootNamespace_ = "";
      df_ = null;
      if (dfBuilder_ != null) {
        dfBuilder_.dispose();
        dfBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_DataFrameFeatureKey_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey build() {
      ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey buildPartial() {
      ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey result = new ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rootNamespace_ = rootNamespace_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.df_ = dfBuilder_ == null
            ? df_
            : dfBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey) {
        return mergeFrom((ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey other) {
      if (other == ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey.getDefaultInstance()) return this;
      if (!other.getRootNamespace().isEmpty()) {
        rootNamespace_ = other.rootNamespace_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDf()) {
        mergeDf(other.getDf());
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
              rootNamespace_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDfFieldBuilder().getBuilder(),
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

    private java.lang.Object rootNamespace_ = "";
    /**
     * <code>string root_namespace = 1 [json_name = "rootNamespace"];</code>
     * @return The rootNamespace.
     */
    public java.lang.String getRootNamespace() {
      java.lang.Object ref = rootNamespace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rootNamespace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string root_namespace = 1 [json_name = "rootNamespace"];</code>
     * @return The bytes for rootNamespace.
     */
    public com.google.protobuf.ByteString
        getRootNamespaceBytes() {
      java.lang.Object ref = rootNamespace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rootNamespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string root_namespace = 1 [json_name = "rootNamespace"];</code>
     * @param value The rootNamespace to set.
     * @return This builder for chaining.
     */
    public Builder setRootNamespace(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rootNamespace_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string root_namespace = 1 [json_name = "rootNamespace"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRootNamespace() {
      rootNamespace_ = getDefaultInstance().getRootNamespace();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string root_namespace = 1 [json_name = "rootNamespace"];</code>
     * @param value The bytes for rootNamespace to set.
     * @return This builder for chaining.
     */
    public Builder setRootNamespaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rootNamespace_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private ai.chalk.protos.chalk.engine.v1.DataFrame df_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.engine.v1.DataFrame, ai.chalk.protos.chalk.engine.v1.DataFrame.Builder, ai.chalk.protos.chalk.engine.v1.DataFrameOrBuilder> dfBuilder_;
    /**
     * <code>.chalk.engine.v1.DataFrame df = 2 [json_name = "df"];</code>
     * @return Whether the df field is set.
     */
    public boolean hasDf() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.chalk.engine.v1.DataFrame df = 2 [json_name = "df"];</code>
     * @return The df.
     */
    public ai.chalk.protos.chalk.engine.v1.DataFrame getDf() {
      if (dfBuilder_ == null) {
        return df_ == null ? ai.chalk.protos.chalk.engine.v1.DataFrame.getDefaultInstance() : df_;
      } else {
        return dfBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.engine.v1.DataFrame df = 2 [json_name = "df"];</code>
     */
    public Builder setDf(ai.chalk.protos.chalk.engine.v1.DataFrame value) {
      if (dfBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        df_ = value;
      } else {
        dfBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.engine.v1.DataFrame df = 2 [json_name = "df"];</code>
     */
    public Builder setDf(
        ai.chalk.protos.chalk.engine.v1.DataFrame.Builder builderForValue) {
      if (dfBuilder_ == null) {
        df_ = builderForValue.build();
      } else {
        dfBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.engine.v1.DataFrame df = 2 [json_name = "df"];</code>
     */
    public Builder mergeDf(ai.chalk.protos.chalk.engine.v1.DataFrame value) {
      if (dfBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          df_ != null &&
          df_ != ai.chalk.protos.chalk.engine.v1.DataFrame.getDefaultInstance()) {
          getDfBuilder().mergeFrom(value);
        } else {
          df_ = value;
        }
      } else {
        dfBuilder_.mergeFrom(value);
      }
      if (df_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.engine.v1.DataFrame df = 2 [json_name = "df"];</code>
     */
    public Builder clearDf() {
      bitField0_ = (bitField0_ & ~0x00000002);
      df_ = null;
      if (dfBuilder_ != null) {
        dfBuilder_.dispose();
        dfBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.engine.v1.DataFrame df = 2 [json_name = "df"];</code>
     */
    public ai.chalk.protos.chalk.engine.v1.DataFrame.Builder getDfBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDfFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.engine.v1.DataFrame df = 2 [json_name = "df"];</code>
     */
    public ai.chalk.protos.chalk.engine.v1.DataFrameOrBuilder getDfOrBuilder() {
      if (dfBuilder_ != null) {
        return dfBuilder_.getMessageOrBuilder();
      } else {
        return df_ == null ?
            ai.chalk.protos.chalk.engine.v1.DataFrame.getDefaultInstance() : df_;
      }
    }
    /**
     * <code>.chalk.engine.v1.DataFrame df = 2 [json_name = "df"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.engine.v1.DataFrame, ai.chalk.protos.chalk.engine.v1.DataFrame.Builder, ai.chalk.protos.chalk.engine.v1.DataFrameOrBuilder> 
        getDfFieldBuilder() {
      if (dfBuilder_ == null) {
        dfBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.engine.v1.DataFrame, ai.chalk.protos.chalk.engine.v1.DataFrame.Builder, ai.chalk.protos.chalk.engine.v1.DataFrameOrBuilder>(
                getDf(),
                getParentForChildren(),
                isClean());
        df_ = null;
      }
      return dfBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.engine.v1.DataFrameFeatureKey)
  }

  // @@protoc_insertion_point(class_scope:chalk.engine.v1.DataFrameFeatureKey)
  private static final ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey();
  }

  public static ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataFrameFeatureKey>
      PARSER = new com.google.protobuf.AbstractParser<DataFrameFeatureKey>() {
    @java.lang.Override
    public DataFrameFeatureKey parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataFrameFeatureKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataFrameFeatureKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

