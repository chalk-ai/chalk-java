// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.graph.v1;

/**
 * Protobuf type {@code chalk.graph.v1.FunctionGlobalCapturedStruct}
 */
public final class FunctionGlobalCapturedStruct extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.graph.v1.FunctionGlobalCapturedStruct)
    FunctionGlobalCapturedStructOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FunctionGlobalCapturedStruct.newBuilder() to construct.
  private FunctionGlobalCapturedStruct(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FunctionGlobalCapturedStruct() {
    module_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FunctionGlobalCapturedStruct();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_FunctionGlobalCapturedStruct_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_FunctionGlobalCapturedStruct_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct.class, ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct.Builder.class);
  }

  private int bitField0_;
  public static final int MODULE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object module_ = "";
  /**
   * <code>string module = 1 [json_name = "module"];</code>
   * @return The module.
   */
  @java.lang.Override
  public java.lang.String getModule() {
    java.lang.Object ref = module_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      module_ = s;
      return s;
    }
  }
  /**
   * <code>string module = 1 [json_name = "module"];</code>
   * @return The bytes for module.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModuleBytes() {
    java.lang.Object ref = module_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      module_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PA_DTYPE_FIELD_NUMBER = 3;
  private ai.chalk.protos.chalk.arrow.v1.ArrowType paDtype_;
  /**
   * <code>.chalk.arrow.v1.ArrowType pa_dtype = 3 [json_name = "paDtype"];</code>
   * @return Whether the paDtype field is set.
   */
  @java.lang.Override
  public boolean hasPaDtype() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.arrow.v1.ArrowType pa_dtype = 3 [json_name = "paDtype"];</code>
   * @return The paDtype.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.ArrowType getPaDtype() {
    return paDtype_ == null ? ai.chalk.protos.chalk.arrow.v1.ArrowType.getDefaultInstance() : paDtype_;
  }
  /**
   * <code>.chalk.arrow.v1.ArrowType pa_dtype = 3 [json_name = "paDtype"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.ArrowTypeOrBuilder getPaDtypeOrBuilder() {
    return paDtype_ == null ? ai.chalk.protos.chalk.arrow.v1.ArrowType.getDefaultInstance() : paDtype_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(module_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, module_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getPaDtype());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(module_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, module_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPaDtype());
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
    if (!(obj instanceof ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct other = (ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct) obj;

    if (!getModule()
        .equals(other.getModule())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (hasPaDtype() != other.hasPaDtype()) return false;
    if (hasPaDtype()) {
      if (!getPaDtype()
          .equals(other.getPaDtype())) return false;
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
    hash = (37 * hash) + MODULE_FIELD_NUMBER;
    hash = (53 * hash) + getModule().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasPaDtype()) {
      hash = (37 * hash) + PA_DTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getPaDtype().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct prototype) {
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
   * Protobuf type {@code chalk.graph.v1.FunctionGlobalCapturedStruct}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.graph.v1.FunctionGlobalCapturedStruct)
      ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStructOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_FunctionGlobalCapturedStruct_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_FunctionGlobalCapturedStruct_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct.class, ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct.newBuilder()
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
        getPaDtypeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      module_ = "";
      name_ = "";
      paDtype_ = null;
      if (paDtypeBuilder_ != null) {
        paDtypeBuilder_.dispose();
        paDtypeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_FunctionGlobalCapturedStruct_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct build() {
      ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct buildPartial() {
      ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct result = new ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.module_ = module_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.paDtype_ = paDtypeBuilder_ == null
            ? paDtype_
            : paDtypeBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct) {
        return mergeFrom((ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct other) {
      if (other == ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct.getDefaultInstance()) return this;
      if (!other.getModule().isEmpty()) {
        module_ = other.module_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasPaDtype()) {
        mergePaDtype(other.getPaDtype());
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
              module_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getPaDtypeFieldBuilder().getBuilder(),
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

    private java.lang.Object module_ = "";
    /**
     * <code>string module = 1 [json_name = "module"];</code>
     * @return The module.
     */
    public java.lang.String getModule() {
      java.lang.Object ref = module_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        module_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string module = 1 [json_name = "module"];</code>
     * @return The bytes for module.
     */
    public com.google.protobuf.ByteString
        getModuleBytes() {
      java.lang.Object ref = module_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        module_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string module = 1 [json_name = "module"];</code>
     * @param value The module to set.
     * @return This builder for chaining.
     */
    public Builder setModule(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      module_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string module = 1 [json_name = "module"];</code>
     * @return This builder for chaining.
     */
    public Builder clearModule() {
      module_ = getDefaultInstance().getModule();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string module = 1 [json_name = "module"];</code>
     * @param value The bytes for module to set.
     * @return This builder for chaining.
     */
    public Builder setModuleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      module_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private ai.chalk.protos.chalk.arrow.v1.ArrowType paDtype_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.arrow.v1.ArrowType, ai.chalk.protos.chalk.arrow.v1.ArrowType.Builder, ai.chalk.protos.chalk.arrow.v1.ArrowTypeOrBuilder> paDtypeBuilder_;
    /**
     * <code>.chalk.arrow.v1.ArrowType pa_dtype = 3 [json_name = "paDtype"];</code>
     * @return Whether the paDtype field is set.
     */
    public boolean hasPaDtype() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.chalk.arrow.v1.ArrowType pa_dtype = 3 [json_name = "paDtype"];</code>
     * @return The paDtype.
     */
    public ai.chalk.protos.chalk.arrow.v1.ArrowType getPaDtype() {
      if (paDtypeBuilder_ == null) {
        return paDtype_ == null ? ai.chalk.protos.chalk.arrow.v1.ArrowType.getDefaultInstance() : paDtype_;
      } else {
        return paDtypeBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.arrow.v1.ArrowType pa_dtype = 3 [json_name = "paDtype"];</code>
     */
    public Builder setPaDtype(ai.chalk.protos.chalk.arrow.v1.ArrowType value) {
      if (paDtypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        paDtype_ = value;
      } else {
        paDtypeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.arrow.v1.ArrowType pa_dtype = 3 [json_name = "paDtype"];</code>
     */
    public Builder setPaDtype(
        ai.chalk.protos.chalk.arrow.v1.ArrowType.Builder builderForValue) {
      if (paDtypeBuilder_ == null) {
        paDtype_ = builderForValue.build();
      } else {
        paDtypeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.arrow.v1.ArrowType pa_dtype = 3 [json_name = "paDtype"];</code>
     */
    public Builder mergePaDtype(ai.chalk.protos.chalk.arrow.v1.ArrowType value) {
      if (paDtypeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          paDtype_ != null &&
          paDtype_ != ai.chalk.protos.chalk.arrow.v1.ArrowType.getDefaultInstance()) {
          getPaDtypeBuilder().mergeFrom(value);
        } else {
          paDtype_ = value;
        }
      } else {
        paDtypeBuilder_.mergeFrom(value);
      }
      if (paDtype_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.arrow.v1.ArrowType pa_dtype = 3 [json_name = "paDtype"];</code>
     */
    public Builder clearPaDtype() {
      bitField0_ = (bitField0_ & ~0x00000004);
      paDtype_ = null;
      if (paDtypeBuilder_ != null) {
        paDtypeBuilder_.dispose();
        paDtypeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.arrow.v1.ArrowType pa_dtype = 3 [json_name = "paDtype"];</code>
     */
    public ai.chalk.protos.chalk.arrow.v1.ArrowType.Builder getPaDtypeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPaDtypeFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.arrow.v1.ArrowType pa_dtype = 3 [json_name = "paDtype"];</code>
     */
    public ai.chalk.protos.chalk.arrow.v1.ArrowTypeOrBuilder getPaDtypeOrBuilder() {
      if (paDtypeBuilder_ != null) {
        return paDtypeBuilder_.getMessageOrBuilder();
      } else {
        return paDtype_ == null ?
            ai.chalk.protos.chalk.arrow.v1.ArrowType.getDefaultInstance() : paDtype_;
      }
    }
    /**
     * <code>.chalk.arrow.v1.ArrowType pa_dtype = 3 [json_name = "paDtype"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.arrow.v1.ArrowType, ai.chalk.protos.chalk.arrow.v1.ArrowType.Builder, ai.chalk.protos.chalk.arrow.v1.ArrowTypeOrBuilder> 
        getPaDtypeFieldBuilder() {
      if (paDtypeBuilder_ == null) {
        paDtypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.arrow.v1.ArrowType, ai.chalk.protos.chalk.arrow.v1.ArrowType.Builder, ai.chalk.protos.chalk.arrow.v1.ArrowTypeOrBuilder>(
                getPaDtype(),
                getParentForChildren(),
                isClean());
        paDtype_ = null;
      }
      return paDtypeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.graph.v1.FunctionGlobalCapturedStruct)
  }

  // @@protoc_insertion_point(class_scope:chalk.graph.v1.FunctionGlobalCapturedStruct)
  private static final ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct();
  }

  public static ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FunctionGlobalCapturedStruct>
      PARSER = new com.google.protobuf.AbstractParser<FunctionGlobalCapturedStruct>() {
    @java.lang.Override
    public FunctionGlobalCapturedStruct parsePartialFrom(
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

  public static com.google.protobuf.Parser<FunctionGlobalCapturedStruct> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FunctionGlobalCapturedStruct> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.FunctionGlobalCapturedStruct getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

