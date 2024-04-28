// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/arrow/v1/arrow.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.arrow.v1;

/**
 * Protobuf type {@code chalk.arrow.v1.Struct}
 */
public final class Struct extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.arrow.v1.Struct)
    StructOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      Struct.class.getName());
  }
  // Use Struct.newBuilder() to construct.
  private Struct(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Struct() {
    subFieldTypes_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_Struct_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_Struct_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.arrow.v1.Struct.class, ai.chalk.protos.chalk.arrow.v1.Struct.Builder.class);
  }

  public static final int SUB_FIELD_TYPES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<ai.chalk.protos.chalk.arrow.v1.Field> subFieldTypes_;
  /**
   * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.chalk.protos.chalk.arrow.v1.Field> getSubFieldTypesList() {
    return subFieldTypes_;
  }
  /**
   * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder> 
      getSubFieldTypesOrBuilderList() {
    return subFieldTypes_;
  }
  /**
   * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
   */
  @java.lang.Override
  public int getSubFieldTypesCount() {
    return subFieldTypes_.size();
  }
  /**
   * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.Field getSubFieldTypes(int index) {
    return subFieldTypes_.get(index);
  }
  /**
   * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder getSubFieldTypesOrBuilder(
      int index) {
    return subFieldTypes_.get(index);
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
    for (int i = 0; i < subFieldTypes_.size(); i++) {
      output.writeMessage(1, subFieldTypes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < subFieldTypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, subFieldTypes_.get(i));
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
    if (!(obj instanceof ai.chalk.protos.chalk.arrow.v1.Struct)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.arrow.v1.Struct other = (ai.chalk.protos.chalk.arrow.v1.Struct) obj;

    if (!getSubFieldTypesList()
        .equals(other.getSubFieldTypesList())) return false;
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
    if (getSubFieldTypesCount() > 0) {
      hash = (37 * hash) + SUB_FIELD_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getSubFieldTypesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.arrow.v1.Struct parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Struct parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Struct parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Struct parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Struct parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Struct parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Struct parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Struct parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.arrow.v1.Struct parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.arrow.v1.Struct parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Struct parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Struct parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.arrow.v1.Struct prototype) {
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
   * Protobuf type {@code chalk.arrow.v1.Struct}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.arrow.v1.Struct)
      ai.chalk.protos.chalk.arrow.v1.StructOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_Struct_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_Struct_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.arrow.v1.Struct.class, ai.chalk.protos.chalk.arrow.v1.Struct.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.arrow.v1.Struct.newBuilder()
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
      if (subFieldTypesBuilder_ == null) {
        subFieldTypes_ = java.util.Collections.emptyList();
      } else {
        subFieldTypes_ = null;
        subFieldTypesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_Struct_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.Struct getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.arrow.v1.Struct.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.Struct build() {
      ai.chalk.protos.chalk.arrow.v1.Struct result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.Struct buildPartial() {
      ai.chalk.protos.chalk.arrow.v1.Struct result = new ai.chalk.protos.chalk.arrow.v1.Struct(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.chalk.protos.chalk.arrow.v1.Struct result) {
      if (subFieldTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          subFieldTypes_ = java.util.Collections.unmodifiableList(subFieldTypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.subFieldTypes_ = subFieldTypes_;
      } else {
        result.subFieldTypes_ = subFieldTypesBuilder_.build();
      }
    }

    private void buildPartial0(ai.chalk.protos.chalk.arrow.v1.Struct result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.arrow.v1.Struct) {
        return mergeFrom((ai.chalk.protos.chalk.arrow.v1.Struct)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.arrow.v1.Struct other) {
      if (other == ai.chalk.protos.chalk.arrow.v1.Struct.getDefaultInstance()) return this;
      if (subFieldTypesBuilder_ == null) {
        if (!other.subFieldTypes_.isEmpty()) {
          if (subFieldTypes_.isEmpty()) {
            subFieldTypes_ = other.subFieldTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSubFieldTypesIsMutable();
            subFieldTypes_.addAll(other.subFieldTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.subFieldTypes_.isEmpty()) {
          if (subFieldTypesBuilder_.isEmpty()) {
            subFieldTypesBuilder_.dispose();
            subFieldTypesBuilder_ = null;
            subFieldTypes_ = other.subFieldTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            subFieldTypesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getSubFieldTypesFieldBuilder() : null;
          } else {
            subFieldTypesBuilder_.addAllMessages(other.subFieldTypes_);
          }
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
              ai.chalk.protos.chalk.arrow.v1.Field m =
                  input.readMessage(
                      ai.chalk.protos.chalk.arrow.v1.Field.parser(),
                      extensionRegistry);
              if (subFieldTypesBuilder_ == null) {
                ensureSubFieldTypesIsMutable();
                subFieldTypes_.add(m);
              } else {
                subFieldTypesBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<ai.chalk.protos.chalk.arrow.v1.Field> subFieldTypes_ =
      java.util.Collections.emptyList();
    private void ensureSubFieldTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        subFieldTypes_ = new java.util.ArrayList<ai.chalk.protos.chalk.arrow.v1.Field>(subFieldTypes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        ai.chalk.protos.chalk.arrow.v1.Field, ai.chalk.protos.chalk.arrow.v1.Field.Builder, ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder> subFieldTypesBuilder_;

    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.arrow.v1.Field> getSubFieldTypesList() {
      if (subFieldTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(subFieldTypes_);
      } else {
        return subFieldTypesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public int getSubFieldTypesCount() {
      if (subFieldTypesBuilder_ == null) {
        return subFieldTypes_.size();
      } else {
        return subFieldTypesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public ai.chalk.protos.chalk.arrow.v1.Field getSubFieldTypes(int index) {
      if (subFieldTypesBuilder_ == null) {
        return subFieldTypes_.get(index);
      } else {
        return subFieldTypesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public Builder setSubFieldTypes(
        int index, ai.chalk.protos.chalk.arrow.v1.Field value) {
      if (subFieldTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubFieldTypesIsMutable();
        subFieldTypes_.set(index, value);
        onChanged();
      } else {
        subFieldTypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public Builder setSubFieldTypes(
        int index, ai.chalk.protos.chalk.arrow.v1.Field.Builder builderForValue) {
      if (subFieldTypesBuilder_ == null) {
        ensureSubFieldTypesIsMutable();
        subFieldTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        subFieldTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public Builder addSubFieldTypes(ai.chalk.protos.chalk.arrow.v1.Field value) {
      if (subFieldTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubFieldTypesIsMutable();
        subFieldTypes_.add(value);
        onChanged();
      } else {
        subFieldTypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public Builder addSubFieldTypes(
        int index, ai.chalk.protos.chalk.arrow.v1.Field value) {
      if (subFieldTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubFieldTypesIsMutable();
        subFieldTypes_.add(index, value);
        onChanged();
      } else {
        subFieldTypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public Builder addSubFieldTypes(
        ai.chalk.protos.chalk.arrow.v1.Field.Builder builderForValue) {
      if (subFieldTypesBuilder_ == null) {
        ensureSubFieldTypesIsMutable();
        subFieldTypes_.add(builderForValue.build());
        onChanged();
      } else {
        subFieldTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public Builder addSubFieldTypes(
        int index, ai.chalk.protos.chalk.arrow.v1.Field.Builder builderForValue) {
      if (subFieldTypesBuilder_ == null) {
        ensureSubFieldTypesIsMutable();
        subFieldTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        subFieldTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public Builder addAllSubFieldTypes(
        java.lang.Iterable<? extends ai.chalk.protos.chalk.arrow.v1.Field> values) {
      if (subFieldTypesBuilder_ == null) {
        ensureSubFieldTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, subFieldTypes_);
        onChanged();
      } else {
        subFieldTypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public Builder clearSubFieldTypes() {
      if (subFieldTypesBuilder_ == null) {
        subFieldTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        subFieldTypesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public Builder removeSubFieldTypes(int index) {
      if (subFieldTypesBuilder_ == null) {
        ensureSubFieldTypesIsMutable();
        subFieldTypes_.remove(index);
        onChanged();
      } else {
        subFieldTypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public ai.chalk.protos.chalk.arrow.v1.Field.Builder getSubFieldTypesBuilder(
        int index) {
      return getSubFieldTypesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder getSubFieldTypesOrBuilder(
        int index) {
      if (subFieldTypesBuilder_ == null) {
        return subFieldTypes_.get(index);  } else {
        return subFieldTypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public java.util.List<? extends ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder> 
         getSubFieldTypesOrBuilderList() {
      if (subFieldTypesBuilder_ != null) {
        return subFieldTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(subFieldTypes_);
      }
    }
    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public ai.chalk.protos.chalk.arrow.v1.Field.Builder addSubFieldTypesBuilder() {
      return getSubFieldTypesFieldBuilder().addBuilder(
          ai.chalk.protos.chalk.arrow.v1.Field.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public ai.chalk.protos.chalk.arrow.v1.Field.Builder addSubFieldTypesBuilder(
        int index) {
      return getSubFieldTypesFieldBuilder().addBuilder(
          index, ai.chalk.protos.chalk.arrow.v1.Field.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.arrow.v1.Field sub_field_types = 1 [json_name = "subFieldTypes"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.arrow.v1.Field.Builder> 
         getSubFieldTypesBuilderList() {
      return getSubFieldTypesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        ai.chalk.protos.chalk.arrow.v1.Field, ai.chalk.protos.chalk.arrow.v1.Field.Builder, ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder> 
        getSubFieldTypesFieldBuilder() {
      if (subFieldTypesBuilder_ == null) {
        subFieldTypesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            ai.chalk.protos.chalk.arrow.v1.Field, ai.chalk.protos.chalk.arrow.v1.Field.Builder, ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder>(
                subFieldTypes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        subFieldTypes_ = null;
      }
      return subFieldTypesBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:chalk.arrow.v1.Struct)
  }

  // @@protoc_insertion_point(class_scope:chalk.arrow.v1.Struct)
  private static final ai.chalk.protos.chalk.arrow.v1.Struct DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.arrow.v1.Struct();
  }

  public static ai.chalk.protos.chalk.arrow.v1.Struct getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Struct>
      PARSER = new com.google.protobuf.AbstractParser<Struct>() {
    @java.lang.Override
    public Struct parsePartialFrom(
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

  public static com.google.protobuf.Parser<Struct> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Struct> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.Struct getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
