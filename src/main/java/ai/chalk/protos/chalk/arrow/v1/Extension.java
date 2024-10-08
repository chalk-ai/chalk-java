// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/arrow/v1/arrow.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.arrow.v1;

/**
 * <pre>
 * Extension is used to
 * </pre>
 *
 * Protobuf type {@code chalk.arrow.v1.Extension}
 */
public final class Extension extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.arrow.v1.Extension)
    ExtensionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Extension.newBuilder() to construct.
  private Extension(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Extension() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Extension();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_Extension_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_Extension_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.arrow.v1.Extension.class, ai.chalk.protos.chalk.arrow.v1.Extension.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The name of the extension -- e.g. arrow.json. See
   * https://arrow.apache.org/docs/format/CanonicalExtensions.html
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
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
   * The name of the extension -- e.g. arrow.json. See
   * https://arrow.apache.org/docs/format/CanonicalExtensions.html
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
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

  public static final int STORAGE_TYPE_FIELD_NUMBER = 2;
  private ai.chalk.protos.chalk.arrow.v1.ArrowType storageType_;
  /**
   * <pre>
   * The underlying storage type for this extension type.
   * </pre>
   *
   * <code>.chalk.arrow.v1.ArrowType storage_type = 2 [json_name = "storageType"];</code>
   * @return Whether the storageType field is set.
   */
  @java.lang.Override
  public boolean hasStorageType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The underlying storage type for this extension type.
   * </pre>
   *
   * <code>.chalk.arrow.v1.ArrowType storage_type = 2 [json_name = "storageType"];</code>
   * @return The storageType.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.ArrowType getStorageType() {
    return storageType_ == null ? ai.chalk.protos.chalk.arrow.v1.ArrowType.getDefaultInstance() : storageType_;
  }
  /**
   * <pre>
   * The underlying storage type for this extension type.
   * </pre>
   *
   * <code>.chalk.arrow.v1.ArrowType storage_type = 2 [json_name = "storageType"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.ArrowTypeOrBuilder getStorageTypeOrBuilder() {
    return storageType_ == null ? ai.chalk.protos.chalk.arrow.v1.ArrowType.getDefaultInstance() : storageType_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getStorageType());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStorageType());
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
    if (!(obj instanceof ai.chalk.protos.chalk.arrow.v1.Extension)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.arrow.v1.Extension other = (ai.chalk.protos.chalk.arrow.v1.Extension) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasStorageType() != other.hasStorageType()) return false;
    if (hasStorageType()) {
      if (!getStorageType()
          .equals(other.getStorageType())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasStorageType()) {
      hash = (37 * hash) + STORAGE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getStorageType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.arrow.v1.Extension parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Extension parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Extension parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Extension parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Extension parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Extension parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Extension parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Extension parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.arrow.v1.Extension parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.arrow.v1.Extension parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Extension parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.arrow.v1.Extension parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.arrow.v1.Extension prototype) {
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
   * <pre>
   * Extension is used to
   * </pre>
   *
   * Protobuf type {@code chalk.arrow.v1.Extension}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.arrow.v1.Extension)
      ai.chalk.protos.chalk.arrow.v1.ExtensionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_Extension_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_Extension_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.arrow.v1.Extension.class, ai.chalk.protos.chalk.arrow.v1.Extension.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.arrow.v1.Extension.newBuilder()
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
        getStorageTypeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      storageType_ = null;
      if (storageTypeBuilder_ != null) {
        storageTypeBuilder_.dispose();
        storageTypeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.arrow.v1.ArrowProto.internal_static_chalk_arrow_v1_Extension_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.Extension getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.arrow.v1.Extension.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.Extension build() {
      ai.chalk.protos.chalk.arrow.v1.Extension result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.arrow.v1.Extension buildPartial() {
      ai.chalk.protos.chalk.arrow.v1.Extension result = new ai.chalk.protos.chalk.arrow.v1.Extension(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.arrow.v1.Extension result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.storageType_ = storageTypeBuilder_ == null
            ? storageType_
            : storageTypeBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.arrow.v1.Extension) {
        return mergeFrom((ai.chalk.protos.chalk.arrow.v1.Extension)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.arrow.v1.Extension other) {
      if (other == ai.chalk.protos.chalk.arrow.v1.Extension.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasStorageType()) {
        mergeStorageType(other.getStorageType());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getStorageTypeFieldBuilder().getBuilder(),
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The name of the extension -- e.g. arrow.json. See
     * https://arrow.apache.org/docs/format/CanonicalExtensions.html
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
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
     * The name of the extension -- e.g. arrow.json. See
     * https://arrow.apache.org/docs/format/CanonicalExtensions.html
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
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
     * The name of the extension -- e.g. arrow.json. See
     * https://arrow.apache.org/docs/format/CanonicalExtensions.html
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the extension -- e.g. arrow.json. See
     * https://arrow.apache.org/docs/format/CanonicalExtensions.html
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the extension -- e.g. arrow.json. See
     * https://arrow.apache.org/docs/format/CanonicalExtensions.html
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private ai.chalk.protos.chalk.arrow.v1.ArrowType storageType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.arrow.v1.ArrowType, ai.chalk.protos.chalk.arrow.v1.ArrowType.Builder, ai.chalk.protos.chalk.arrow.v1.ArrowTypeOrBuilder> storageTypeBuilder_;
    /**
     * <pre>
     * The underlying storage type for this extension type.
     * </pre>
     *
     * <code>.chalk.arrow.v1.ArrowType storage_type = 2 [json_name = "storageType"];</code>
     * @return Whether the storageType field is set.
     */
    public boolean hasStorageType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The underlying storage type for this extension type.
     * </pre>
     *
     * <code>.chalk.arrow.v1.ArrowType storage_type = 2 [json_name = "storageType"];</code>
     * @return The storageType.
     */
    public ai.chalk.protos.chalk.arrow.v1.ArrowType getStorageType() {
      if (storageTypeBuilder_ == null) {
        return storageType_ == null ? ai.chalk.protos.chalk.arrow.v1.ArrowType.getDefaultInstance() : storageType_;
      } else {
        return storageTypeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The underlying storage type for this extension type.
     * </pre>
     *
     * <code>.chalk.arrow.v1.ArrowType storage_type = 2 [json_name = "storageType"];</code>
     */
    public Builder setStorageType(ai.chalk.protos.chalk.arrow.v1.ArrowType value) {
      if (storageTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        storageType_ = value;
      } else {
        storageTypeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The underlying storage type for this extension type.
     * </pre>
     *
     * <code>.chalk.arrow.v1.ArrowType storage_type = 2 [json_name = "storageType"];</code>
     */
    public Builder setStorageType(
        ai.chalk.protos.chalk.arrow.v1.ArrowType.Builder builderForValue) {
      if (storageTypeBuilder_ == null) {
        storageType_ = builderForValue.build();
      } else {
        storageTypeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The underlying storage type for this extension type.
     * </pre>
     *
     * <code>.chalk.arrow.v1.ArrowType storage_type = 2 [json_name = "storageType"];</code>
     */
    public Builder mergeStorageType(ai.chalk.protos.chalk.arrow.v1.ArrowType value) {
      if (storageTypeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          storageType_ != null &&
          storageType_ != ai.chalk.protos.chalk.arrow.v1.ArrowType.getDefaultInstance()) {
          getStorageTypeBuilder().mergeFrom(value);
        } else {
          storageType_ = value;
        }
      } else {
        storageTypeBuilder_.mergeFrom(value);
      }
      if (storageType_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The underlying storage type for this extension type.
     * </pre>
     *
     * <code>.chalk.arrow.v1.ArrowType storage_type = 2 [json_name = "storageType"];</code>
     */
    public Builder clearStorageType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      storageType_ = null;
      if (storageTypeBuilder_ != null) {
        storageTypeBuilder_.dispose();
        storageTypeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The underlying storage type for this extension type.
     * </pre>
     *
     * <code>.chalk.arrow.v1.ArrowType storage_type = 2 [json_name = "storageType"];</code>
     */
    public ai.chalk.protos.chalk.arrow.v1.ArrowType.Builder getStorageTypeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStorageTypeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The underlying storage type for this extension type.
     * </pre>
     *
     * <code>.chalk.arrow.v1.ArrowType storage_type = 2 [json_name = "storageType"];</code>
     */
    public ai.chalk.protos.chalk.arrow.v1.ArrowTypeOrBuilder getStorageTypeOrBuilder() {
      if (storageTypeBuilder_ != null) {
        return storageTypeBuilder_.getMessageOrBuilder();
      } else {
        return storageType_ == null ?
            ai.chalk.protos.chalk.arrow.v1.ArrowType.getDefaultInstance() : storageType_;
      }
    }
    /**
     * <pre>
     * The underlying storage type for this extension type.
     * </pre>
     *
     * <code>.chalk.arrow.v1.ArrowType storage_type = 2 [json_name = "storageType"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.arrow.v1.ArrowType, ai.chalk.protos.chalk.arrow.v1.ArrowType.Builder, ai.chalk.protos.chalk.arrow.v1.ArrowTypeOrBuilder> 
        getStorageTypeFieldBuilder() {
      if (storageTypeBuilder_ == null) {
        storageTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.arrow.v1.ArrowType, ai.chalk.protos.chalk.arrow.v1.ArrowType.Builder, ai.chalk.protos.chalk.arrow.v1.ArrowTypeOrBuilder>(
                getStorageType(),
                getParentForChildren(),
                isClean());
        storageType_ = null;
      }
      return storageTypeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.arrow.v1.Extension)
  }

  // @@protoc_insertion_point(class_scope:chalk.arrow.v1.Extension)
  private static final ai.chalk.protos.chalk.arrow.v1.Extension DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.arrow.v1.Extension();
  }

  public static ai.chalk.protos.chalk.arrow.v1.Extension getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Extension>
      PARSER = new com.google.protobuf.AbstractParser<Extension>() {
    @java.lang.Override
    public Extension parsePartialFrom(
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

  public static com.google.protobuf.Parser<Extension> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Extension> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.arrow.v1.Extension getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

