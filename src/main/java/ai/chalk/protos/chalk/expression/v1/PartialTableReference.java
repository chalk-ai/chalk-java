// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.expression.v1;

/**
 * Protobuf type {@code chalk.expression.v1.PartialTableReference}
 */
public final class PartialTableReference extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.expression.v1.PartialTableReference)
    PartialTableReferenceOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      PartialTableReference.class.getName());
  }
  // Use PartialTableReference.newBuilder() to construct.
  private PartialTableReference(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PartialTableReference() {
    schema_ = "";
    table_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_PartialTableReference_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_PartialTableReference_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.expression.v1.PartialTableReference.class, ai.chalk.protos.chalk.expression.v1.PartialTableReference.Builder.class);
  }

  public static final int SCHEMA_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object schema_ = "";
  /**
   * <code>string schema = 1 [json_name = "schema"];</code>
   * @return The schema.
   */
  @java.lang.Override
  public java.lang.String getSchema() {
    java.lang.Object ref = schema_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      schema_ = s;
      return s;
    }
  }
  /**
   * <code>string schema = 1 [json_name = "schema"];</code>
   * @return The bytes for schema.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSchemaBytes() {
    java.lang.Object ref = schema_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      schema_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TABLE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object table_ = "";
  /**
   * <code>string table = 2 [json_name = "table"];</code>
   * @return The table.
   */
  @java.lang.Override
  public java.lang.String getTable() {
    java.lang.Object ref = table_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      table_ = s;
      return s;
    }
  }
  /**
   * <code>string table = 2 [json_name = "table"];</code>
   * @return The bytes for table.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTableBytes() {
    java.lang.Object ref = table_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      table_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(schema_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, schema_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(table_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, table_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(schema_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, schema_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(table_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, table_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.expression.v1.PartialTableReference)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.expression.v1.PartialTableReference other = (ai.chalk.protos.chalk.expression.v1.PartialTableReference) obj;

    if (!getSchema()
        .equals(other.getSchema())) return false;
    if (!getTable()
        .equals(other.getTable())) return false;
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
    hash = (37 * hash) + SCHEMA_FIELD_NUMBER;
    hash = (53 * hash) + getSchema().hashCode();
    hash = (37 * hash) + TABLE_FIELD_NUMBER;
    hash = (53 * hash) + getTable().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.expression.v1.PartialTableReference parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.PartialTableReference parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.PartialTableReference parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.PartialTableReference parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.PartialTableReference parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.PartialTableReference parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.PartialTableReference parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.expression.v1.PartialTableReference parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.expression.v1.PartialTableReference parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.expression.v1.PartialTableReference parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.PartialTableReference parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.expression.v1.PartialTableReference parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.expression.v1.PartialTableReference prototype) {
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
   * Protobuf type {@code chalk.expression.v1.PartialTableReference}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.expression.v1.PartialTableReference)
      ai.chalk.protos.chalk.expression.v1.PartialTableReferenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_PartialTableReference_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_PartialTableReference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.expression.v1.PartialTableReference.class, ai.chalk.protos.chalk.expression.v1.PartialTableReference.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.expression.v1.PartialTableReference.newBuilder()
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
      schema_ = "";
      table_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_PartialTableReference_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.PartialTableReference getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.expression.v1.PartialTableReference.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.PartialTableReference build() {
      ai.chalk.protos.chalk.expression.v1.PartialTableReference result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.PartialTableReference buildPartial() {
      ai.chalk.protos.chalk.expression.v1.PartialTableReference result = new ai.chalk.protos.chalk.expression.v1.PartialTableReference(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.expression.v1.PartialTableReference result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.schema_ = schema_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.table_ = table_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.expression.v1.PartialTableReference) {
        return mergeFrom((ai.chalk.protos.chalk.expression.v1.PartialTableReference)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.expression.v1.PartialTableReference other) {
      if (other == ai.chalk.protos.chalk.expression.v1.PartialTableReference.getDefaultInstance()) return this;
      if (!other.getSchema().isEmpty()) {
        schema_ = other.schema_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTable().isEmpty()) {
        table_ = other.table_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              schema_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              table_ = input.readStringRequireUtf8();
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

    private java.lang.Object schema_ = "";
    /**
     * <code>string schema = 1 [json_name = "schema"];</code>
     * @return The schema.
     */
    public java.lang.String getSchema() {
      java.lang.Object ref = schema_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        schema_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string schema = 1 [json_name = "schema"];</code>
     * @return The bytes for schema.
     */
    public com.google.protobuf.ByteString
        getSchemaBytes() {
      java.lang.Object ref = schema_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        schema_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string schema = 1 [json_name = "schema"];</code>
     * @param value The schema to set.
     * @return This builder for chaining.
     */
    public Builder setSchema(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      schema_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string schema = 1 [json_name = "schema"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSchema() {
      schema_ = getDefaultInstance().getSchema();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string schema = 1 [json_name = "schema"];</code>
     * @param value The bytes for schema to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      schema_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object table_ = "";
    /**
     * <code>string table = 2 [json_name = "table"];</code>
     * @return The table.
     */
    public java.lang.String getTable() {
      java.lang.Object ref = table_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        table_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string table = 2 [json_name = "table"];</code>
     * @return The bytes for table.
     */
    public com.google.protobuf.ByteString
        getTableBytes() {
      java.lang.Object ref = table_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        table_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string table = 2 [json_name = "table"];</code>
     * @param value The table to set.
     * @return This builder for chaining.
     */
    public Builder setTable(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      table_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string table = 2 [json_name = "table"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTable() {
      table_ = getDefaultInstance().getTable();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string table = 2 [json_name = "table"];</code>
     * @param value The bytes for table to set.
     * @return This builder for chaining.
     */
    public Builder setTableBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      table_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:chalk.expression.v1.PartialTableReference)
  }

  // @@protoc_insertion_point(class_scope:chalk.expression.v1.PartialTableReference)
  private static final ai.chalk.protos.chalk.expression.v1.PartialTableReference DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.expression.v1.PartialTableReference();
  }

  public static ai.chalk.protos.chalk.expression.v1.PartialTableReference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartialTableReference>
      PARSER = new com.google.protobuf.AbstractParser<PartialTableReference>() {
    @java.lang.Override
    public PartialTableReference parsePartialFrom(
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

  public static com.google.protobuf.Parser<PartialTableReference> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartialTableReference> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.PartialTableReference getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
