// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen_bq_schema/bq_field.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.gen_bq_schema;

/**
 * <pre>
 * Message containing options related to BigQuery schema generation
 * and management via Protobuf.
 * </pre>
 *
 * Protobuf type {@code gen_bq_schema.BigQueryFieldOptions}
 */
public final class BigQueryFieldOptions extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:gen_bq_schema.BigQueryFieldOptions)
    BigQueryFieldOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      BigQueryFieldOptions.class.getName());
  }
  // Use BigQueryFieldOptions.newBuilder() to construct.
  private BigQueryFieldOptions(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private BigQueryFieldOptions() {
    typeOverride_ = "";
    description_ = "";
    name_ = "";
    policyTags_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.gen_bq_schema.BqFieldProto.internal_static_gen_bq_schema_BigQueryFieldOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.gen_bq_schema.BqFieldProto.internal_static_gen_bq_schema_BigQueryFieldOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions.class, ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions.Builder.class);
  }

  public static final int REQUIRE_FIELD_NUMBER = 1;
  private boolean require_ = false;
  /**
   * <pre>
   * Flag to specify that a field should be marked as 'REQUIRED' when
   * used to generate schema for BigQuery.
   * </pre>
   *
   * <code>bool require = 1 [json_name = "require"];</code>
   * @return The require.
   */
  @java.lang.Override
  public boolean getRequire() {
    return require_;
  }

  public static final int TYPE_OVERRIDE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object typeOverride_ = "";
  /**
   * <pre>
   * Optionally override whatever type is resolved by the schema
   * generator. This is useful, for example, to store epoch timestamps
   * with the underlying 'TIMESTAMP' type, when normally, they would
   * be structured as 'INTEGER' fields.
   * </pre>
   *
   * <code>string type_override = 2 [json_name = "typeOverride"];</code>
   * @return The typeOverride.
   */
  @java.lang.Override
  public java.lang.String getTypeOverride() {
    java.lang.Object ref = typeOverride_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      typeOverride_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optionally override whatever type is resolved by the schema
   * generator. This is useful, for example, to store epoch timestamps
   * with the underlying 'TIMESTAMP' type, when normally, they would
   * be structured as 'INTEGER' fields.
   * </pre>
   *
   * <code>string type_override = 2 [json_name = "typeOverride"];</code>
   * @return The bytes for typeOverride.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeOverrideBytes() {
    java.lang.Object ref = typeOverride_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      typeOverride_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IGNORE_FIELD_NUMBER = 3;
  private boolean ignore_ = false;
  /**
   * <pre>
   * Optionally omit a field from BigQuery schema.
   * </pre>
   *
   * <code>bool ignore = 3 [json_name = "ignore"];</code>
   * @return The ignore.
   */
  @java.lang.Override
  public boolean getIgnore() {
    return ignore_;
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <pre>
   * Set the description for a field in BigQuery schema.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Set the description for a field in BigQuery schema.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Customize the name of the field in the BigQuery schema.
   * </pre>
   *
   * <code>string name = 5 [json_name = "name"];</code>
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
   * <pre>
   * Customize the name of the field in the BigQuery schema.
   * </pre>
   *
   * <code>string name = 5 [json_name = "name"];</code>
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

  public static final int POLICY_TAGS_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object policyTags_ = "";
  /**
   * <pre>
   * Optionally add PolicyTag for a field in BigQuery schema.
   * </pre>
   *
   * <code>string policy_tags = 6 [json_name = "policyTags"];</code>
   * @return The policyTags.
   */
  @java.lang.Override
  public java.lang.String getPolicyTags() {
    java.lang.Object ref = policyTags_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      policyTags_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optionally add PolicyTag for a field in BigQuery schema.
   * </pre>
   *
   * <code>string policy_tags = 6 [json_name = "policyTags"];</code>
   * @return The bytes for policyTags.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPolicyTagsBytes() {
    java.lang.Object ref = policyTags_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      policyTags_ = b;
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
    if (require_ != false) {
      output.writeBool(1, require_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(typeOverride_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, typeOverride_);
    }
    if (ignore_ != false) {
      output.writeBool(3, ignore_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, description_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 5, name_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(policyTags_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 6, policyTags_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (require_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, require_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(typeOverride_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, typeOverride_);
    }
    if (ignore_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, ignore_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, description_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(5, name_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(policyTags_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(6, policyTags_);
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
    if (!(obj instanceof ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions)) {
      return super.equals(obj);
    }
    ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions other = (ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions) obj;

    if (getRequire()
        != other.getRequire()) return false;
    if (!getTypeOverride()
        .equals(other.getTypeOverride())) return false;
    if (getIgnore()
        != other.getIgnore()) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getPolicyTags()
        .equals(other.getPolicyTags())) return false;
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
    hash = (37 * hash) + REQUIRE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRequire());
    hash = (37 * hash) + TYPE_OVERRIDE_FIELD_NUMBER;
    hash = (53 * hash) + getTypeOverride().hashCode();
    hash = (37 * hash) + IGNORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIgnore());
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + POLICY_TAGS_FIELD_NUMBER;
    hash = (53 * hash) + getPolicyTags().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions prototype) {
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
   * <pre>
   * Message containing options related to BigQuery schema generation
   * and management via Protobuf.
   * </pre>
   *
   * Protobuf type {@code gen_bq_schema.BigQueryFieldOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gen_bq_schema.BigQueryFieldOptions)
      ai.chalk.protos.gen_bq_schema.BigQueryFieldOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.gen_bq_schema.BqFieldProto.internal_static_gen_bq_schema_BigQueryFieldOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.gen_bq_schema.BqFieldProto.internal_static_gen_bq_schema_BigQueryFieldOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions.class, ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions.Builder.class);
    }

    // Construct using ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions.newBuilder()
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
      require_ = false;
      typeOverride_ = "";
      ignore_ = false;
      description_ = "";
      name_ = "";
      policyTags_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.gen_bq_schema.BqFieldProto.internal_static_gen_bq_schema_BigQueryFieldOptions_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions getDefaultInstanceForType() {
      return ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions build() {
      ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions buildPartial() {
      ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions result = new ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.require_ = require_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.typeOverride_ = typeOverride_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.ignore_ = ignore_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.policyTags_ = policyTags_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions) {
        return mergeFrom((ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions other) {
      if (other == ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions.getDefaultInstance()) return this;
      if (other.getRequire() != false) {
        setRequire(other.getRequire());
      }
      if (!other.getTypeOverride().isEmpty()) {
        typeOverride_ = other.typeOverride_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getIgnore() != false) {
        setIgnore(other.getIgnore());
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (!other.getPolicyTags().isEmpty()) {
        policyTags_ = other.policyTags_;
        bitField0_ |= 0x00000020;
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
            case 8: {
              require_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              typeOverride_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              ignore_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              policyTags_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
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

    private boolean require_ ;
    /**
     * <pre>
     * Flag to specify that a field should be marked as 'REQUIRED' when
     * used to generate schema for BigQuery.
     * </pre>
     *
     * <code>bool require = 1 [json_name = "require"];</code>
     * @return The require.
     */
    @java.lang.Override
    public boolean getRequire() {
      return require_;
    }
    /**
     * <pre>
     * Flag to specify that a field should be marked as 'REQUIRED' when
     * used to generate schema for BigQuery.
     * </pre>
     *
     * <code>bool require = 1 [json_name = "require"];</code>
     * @param value The require to set.
     * @return This builder for chaining.
     */
    public Builder setRequire(boolean value) {

      require_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Flag to specify that a field should be marked as 'REQUIRED' when
     * used to generate schema for BigQuery.
     * </pre>
     *
     * <code>bool require = 1 [json_name = "require"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRequire() {
      bitField0_ = (bitField0_ & ~0x00000001);
      require_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object typeOverride_ = "";
    /**
     * <pre>
     * Optionally override whatever type is resolved by the schema
     * generator. This is useful, for example, to store epoch timestamps
     * with the underlying 'TIMESTAMP' type, when normally, they would
     * be structured as 'INTEGER' fields.
     * </pre>
     *
     * <code>string type_override = 2 [json_name = "typeOverride"];</code>
     * @return The typeOverride.
     */
    public java.lang.String getTypeOverride() {
      java.lang.Object ref = typeOverride_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        typeOverride_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optionally override whatever type is resolved by the schema
     * generator. This is useful, for example, to store epoch timestamps
     * with the underlying 'TIMESTAMP' type, when normally, they would
     * be structured as 'INTEGER' fields.
     * </pre>
     *
     * <code>string type_override = 2 [json_name = "typeOverride"];</code>
     * @return The bytes for typeOverride.
     */
    public com.google.protobuf.ByteString
        getTypeOverrideBytes() {
      java.lang.Object ref = typeOverride_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        typeOverride_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optionally override whatever type is resolved by the schema
     * generator. This is useful, for example, to store epoch timestamps
     * with the underlying 'TIMESTAMP' type, when normally, they would
     * be structured as 'INTEGER' fields.
     * </pre>
     *
     * <code>string type_override = 2 [json_name = "typeOverride"];</code>
     * @param value The typeOverride to set.
     * @return This builder for chaining.
     */
    public Builder setTypeOverride(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      typeOverride_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optionally override whatever type is resolved by the schema
     * generator. This is useful, for example, to store epoch timestamps
     * with the underlying 'TIMESTAMP' type, when normally, they would
     * be structured as 'INTEGER' fields.
     * </pre>
     *
     * <code>string type_override = 2 [json_name = "typeOverride"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTypeOverride() {
      typeOverride_ = getDefaultInstance().getTypeOverride();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optionally override whatever type is resolved by the schema
     * generator. This is useful, for example, to store epoch timestamps
     * with the underlying 'TIMESTAMP' type, when normally, they would
     * be structured as 'INTEGER' fields.
     * </pre>
     *
     * <code>string type_override = 2 [json_name = "typeOverride"];</code>
     * @param value The bytes for typeOverride to set.
     * @return This builder for chaining.
     */
    public Builder setTypeOverrideBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      typeOverride_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean ignore_ ;
    /**
     * <pre>
     * Optionally omit a field from BigQuery schema.
     * </pre>
     *
     * <code>bool ignore = 3 [json_name = "ignore"];</code>
     * @return The ignore.
     */
    @java.lang.Override
    public boolean getIgnore() {
      return ignore_;
    }
    /**
     * <pre>
     * Optionally omit a field from BigQuery schema.
     * </pre>
     *
     * <code>bool ignore = 3 [json_name = "ignore"];</code>
     * @param value The ignore to set.
     * @return This builder for chaining.
     */
    public Builder setIgnore(boolean value) {

      ignore_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optionally omit a field from BigQuery schema.
     * </pre>
     *
     * <code>bool ignore = 3 [json_name = "ignore"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIgnore() {
      bitField0_ = (bitField0_ & ~0x00000004);
      ignore_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * Set the description for a field in BigQuery schema.
     * </pre>
     *
     * <code>string description = 4 [json_name = "description"];</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Set the description for a field in BigQuery schema.
     * </pre>
     *
     * <code>string description = 4 [json_name = "description"];</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Set the description for a field in BigQuery schema.
     * </pre>
     *
     * <code>string description = 4 [json_name = "description"];</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Set the description for a field in BigQuery schema.
     * </pre>
     *
     * <code>string description = 4 [json_name = "description"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Set the description for a field in BigQuery schema.
     * </pre>
     *
     * <code>string description = 4 [json_name = "description"];</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Customize the name of the field in the BigQuery schema.
     * </pre>
     *
     * <code>string name = 5 [json_name = "name"];</code>
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
     * <pre>
     * Customize the name of the field in the BigQuery schema.
     * </pre>
     *
     * <code>string name = 5 [json_name = "name"];</code>
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
     * <pre>
     * Customize the name of the field in the BigQuery schema.
     * </pre>
     *
     * <code>string name = 5 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Customize the name of the field in the BigQuery schema.
     * </pre>
     *
     * <code>string name = 5 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Customize the name of the field in the BigQuery schema.
     * </pre>
     *
     * <code>string name = 5 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private java.lang.Object policyTags_ = "";
    /**
     * <pre>
     * Optionally add PolicyTag for a field in BigQuery schema.
     * </pre>
     *
     * <code>string policy_tags = 6 [json_name = "policyTags"];</code>
     * @return The policyTags.
     */
    public java.lang.String getPolicyTags() {
      java.lang.Object ref = policyTags_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        policyTags_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optionally add PolicyTag for a field in BigQuery schema.
     * </pre>
     *
     * <code>string policy_tags = 6 [json_name = "policyTags"];</code>
     * @return The bytes for policyTags.
     */
    public com.google.protobuf.ByteString
        getPolicyTagsBytes() {
      java.lang.Object ref = policyTags_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        policyTags_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optionally add PolicyTag for a field in BigQuery schema.
     * </pre>
     *
     * <code>string policy_tags = 6 [json_name = "policyTags"];</code>
     * @param value The policyTags to set.
     * @return This builder for chaining.
     */
    public Builder setPolicyTags(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      policyTags_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optionally add PolicyTag for a field in BigQuery schema.
     * </pre>
     *
     * <code>string policy_tags = 6 [json_name = "policyTags"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPolicyTags() {
      policyTags_ = getDefaultInstance().getPolicyTags();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optionally add PolicyTag for a field in BigQuery schema.
     * </pre>
     *
     * <code>string policy_tags = 6 [json_name = "policyTags"];</code>
     * @param value The bytes for policyTags to set.
     * @return This builder for chaining.
     */
    public Builder setPolicyTagsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      policyTags_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:gen_bq_schema.BigQueryFieldOptions)
  }

  // @@protoc_insertion_point(class_scope:gen_bq_schema.BigQueryFieldOptions)
  private static final ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions();
  }

  public static ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BigQueryFieldOptions>
      PARSER = new com.google.protobuf.AbstractParser<BigQueryFieldOptions>() {
    @java.lang.Override
    public BigQueryFieldOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<BigQueryFieldOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BigQueryFieldOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

