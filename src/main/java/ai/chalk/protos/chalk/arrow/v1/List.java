// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/arrow/v1/arrow.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.arrow.v1;

/**
 * Protobuf type {@code chalk.arrow.v1.List}
 */
public final class List extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.arrow.v1.List)
    ListOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      List.class.getName());
  }
  // Use List.newBuilder() to construct.
  private List(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private List() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_List_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_List_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.arrow.v1.List.class, ai.chalk.protos.chalk.arrow.v1.List.Builder.class);
  }

  private int bitField0_;
  public static final int FIELD_TYPE_FIELD_NUMBER = 1;
  private ai.chalk.protos.chalk.arrow.v1.Field fieldType_;
  /**
   * <code>.chalk.arrow.v1.Field field_type = 1 [json_name = "fieldType"];</code>
   * @return Whether the fieldType field is set.
   */
  @java.lang.Override
  public boolean hasFieldType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.arrow.v1.Field field_type = 1 [json_name = "fieldType"];</code>
   * @return The fieldType.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.Field getFieldType() {
    return fieldType_ == null ? ai.chalk.protos.chalk.arrow.v1.Field.getDefaultInstance() : fieldType_;
  }
  /**
   * <code>.chalk.arrow.v1.Field field_type = 1 [json_name = "fieldType"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder getFieldTypeOrBuilder() {
    return fieldType_ == null ? ai.chalk.protos.chalk.arrow.v1.Field.getDefaultInstance() : fieldType_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getFieldType());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFieldType());
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
    if (!(obj instanceof ai.chalk.protos.chalk.arrow.v1.List)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.arrow.v1.List other = (ai.chalk.protos.chalk.arrow.v1.List) obj;

    if (hasFieldType() != other.hasFieldType()) return false;
    if (hasFieldType()) {
      if (!getFieldType()
          .equals(other.getFieldType())) return false;
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
    if (hasFieldType()) {
      hash = (37 * hash) + FIELD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getFieldType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.arrow.v1.List parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.List parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.List parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.List parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.List parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.List parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.List parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.arrow.v1.List parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.arrow.v1.List parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.arrow.v1.List parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.List parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.arrow.v1.List parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.arrow.v1.List prototype) {
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
   * Protobuf type {@code chalk.arrow.v1.List}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.arrow.v1.List)
      ai.chalk.protos.chalk.arrow.v1.ListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_List_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_List_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.arrow.v1.List.class, ai.chalk.protos.chalk.arrow.v1.List.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.arrow.v1.List.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getFieldTypeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      fieldType_ = null;
      if (fieldTypeBuilder_ != null) {
        fieldTypeBuilder_.dispose();
        fieldTypeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_List_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.List getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.arrow.v1.List.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.List build() {
      ai.chalk.protos.chalk.arrow.v1.List result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.List buildPartial() {
      ai.chalk.protos.chalk.arrow.v1.List result = new ai.chalk.protos.chalk.arrow.v1.List(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.arrow.v1.List result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fieldType_ = fieldTypeBuilder_ == null
            ? fieldType_
            : fieldTypeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.arrow.v1.List) {
        return mergeFrom((ai.chalk.protos.chalk.arrow.v1.List)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.arrow.v1.List other) {
      if (other == ai.chalk.protos.chalk.arrow.v1.List.getDefaultInstance()) return this;
      if (other.hasFieldType()) {
        mergeFieldType(other.getFieldType());
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
                  getFieldTypeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private ai.chalk.protos.chalk.arrow.v1.Field fieldType_;
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.arrow.v1.Field, ai.chalk.protos.chalk.arrow.v1.Field.Builder, ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder> fieldTypeBuilder_;
    /**
     * <code>.chalk.arrow.v1.Field field_type = 1 [json_name = "fieldType"];</code>
     * @return Whether the fieldType field is set.
     */
    public boolean hasFieldType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.chalk.arrow.v1.Field field_type = 1 [json_name = "fieldType"];</code>
     * @return The fieldType.
     */
    public ai.chalk.protos.chalk.arrow.v1.Field getFieldType() {
      if (fieldTypeBuilder_ == null) {
        return fieldType_ == null ? ai.chalk.protos.chalk.arrow.v1.Field.getDefaultInstance() : fieldType_;
      } else {
        return fieldTypeBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.arrow.v1.Field field_type = 1 [json_name = "fieldType"];</code>
     */
    public Builder setFieldType(ai.chalk.protos.chalk.arrow.v1.Field value) {
      if (fieldTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fieldType_ = value;
      } else {
        fieldTypeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.arrow.v1.Field field_type = 1 [json_name = "fieldType"];</code>
     */
    public Builder setFieldType(
        ai.chalk.protos.chalk.arrow.v1.Field.Builder builderForValue) {
      if (fieldTypeBuilder_ == null) {
        fieldType_ = builderForValue.build();
      } else {
        fieldTypeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.arrow.v1.Field field_type = 1 [json_name = "fieldType"];</code>
     */
    public Builder mergeFieldType(ai.chalk.protos.chalk.arrow.v1.Field value) {
      if (fieldTypeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          fieldType_ != null &&
          fieldType_ != ai.chalk.protos.chalk.arrow.v1.Field.getDefaultInstance()) {
          getFieldTypeBuilder().mergeFrom(value);
        } else {
          fieldType_ = value;
        }
      } else {
        fieldTypeBuilder_.mergeFrom(value);
      }
      if (fieldType_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.arrow.v1.Field field_type = 1 [json_name = "fieldType"];</code>
     */
    public Builder clearFieldType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      fieldType_ = null;
      if (fieldTypeBuilder_ != null) {
        fieldTypeBuilder_.dispose();
        fieldTypeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.arrow.v1.Field field_type = 1 [json_name = "fieldType"];</code>
     */
    public ai.chalk.protos.chalk.arrow.v1.Field.Builder getFieldTypeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFieldTypeFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.arrow.v1.Field field_type = 1 [json_name = "fieldType"];</code>
     */
    public ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder getFieldTypeOrBuilder() {
      if (fieldTypeBuilder_ != null) {
        return fieldTypeBuilder_.getMessageOrBuilder();
      } else {
        return fieldType_ == null ?
            ai.chalk.protos.chalk.arrow.v1.Field.getDefaultInstance() : fieldType_;
      }
    }
    /**
     * <code>.chalk.arrow.v1.Field field_type = 1 [json_name = "fieldType"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.arrow.v1.Field, ai.chalk.protos.chalk.arrow.v1.Field.Builder, ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder> 
        getFieldTypeFieldBuilder() {
      if (fieldTypeBuilder_ == null) {
        fieldTypeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.chalk.protos.chalk.arrow.v1.Field, ai.chalk.protos.chalk.arrow.v1.Field.Builder, ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder>(
                getFieldType(),
                getParentForChildren(),
                isClean());
        fieldType_ = null;
      }
      return fieldTypeBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:chalk.arrow.v1.List)
  }

  // @@protoc_insertion_point(class_scope:chalk.arrow.v1.List)
  private static final ai.chalk.protos.chalk.arrow.v1.List DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.arrow.v1.List();
  }

  public static ai.chalk.protos.chalk.arrow.v1.List getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<List>
      PARSER = new com.google.protobuf.AbstractParser<List>() {
    @java.lang.Override
    public List parsePartialFrom(
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

  public static com.google.protobuf.Parser<List> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<List> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.List getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

