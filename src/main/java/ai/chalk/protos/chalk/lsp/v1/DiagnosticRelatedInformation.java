// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/lsp/v1/lsp.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.lsp.v1;

/**
 * Protobuf type {@code chalk.lsp.v1.DiagnosticRelatedInformation}
 */
public final class DiagnosticRelatedInformation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.lsp.v1.DiagnosticRelatedInformation)
    DiagnosticRelatedInformationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DiagnosticRelatedInformation.newBuilder() to construct.
  private DiagnosticRelatedInformation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DiagnosticRelatedInformation() {
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DiagnosticRelatedInformation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.lsp.v1.LspProto.internal_static_chalk_lsp_v1_DiagnosticRelatedInformation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.lsp.v1.LspProto.internal_static_chalk_lsp_v1_DiagnosticRelatedInformation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation.class, ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation.Builder.class);
  }

  private int bitField0_;
  public static final int LOCATION_FIELD_NUMBER = 1;
  private ai.chalk.protos.chalk.lsp.v1.Location location_;
  /**
   * <code>.chalk.lsp.v1.Location location = 1 [json_name = "location"];</code>
   * @return Whether the location field is set.
   */
  @java.lang.Override
  public boolean hasLocation() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.lsp.v1.Location location = 1 [json_name = "location"];</code>
   * @return The location.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.lsp.v1.Location getLocation() {
    return location_ == null ? ai.chalk.protos.chalk.lsp.v1.Location.getDefaultInstance() : location_;
  }
  /**
   * <code>.chalk.lsp.v1.Location location = 1 [json_name = "location"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.lsp.v1.LocationOrBuilder getLocationOrBuilder() {
    return location_ == null ? ai.chalk.protos.chalk.lsp.v1.Location.getDefaultInstance() : location_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getLocation());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
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
        .computeMessageSize(1, getLocation());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation other = (ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation) obj;

    if (hasLocation() != other.hasLocation()) return false;
    if (hasLocation()) {
      if (!getLocation()
          .equals(other.getLocation())) return false;
    }
    if (!getMessage()
        .equals(other.getMessage())) return false;
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
    if (hasLocation()) {
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocation().hashCode();
    }
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation prototype) {
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
   * Protobuf type {@code chalk.lsp.v1.DiagnosticRelatedInformation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.lsp.v1.DiagnosticRelatedInformation)
      ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.lsp.v1.LspProto.internal_static_chalk_lsp_v1_DiagnosticRelatedInformation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.lsp.v1.LspProto.internal_static_chalk_lsp_v1_DiagnosticRelatedInformation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation.class, ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation.newBuilder()
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
        getLocationFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      location_ = null;
      if (locationBuilder_ != null) {
        locationBuilder_.dispose();
        locationBuilder_ = null;
      }
      message_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.lsp.v1.LspProto.internal_static_chalk_lsp_v1_DiagnosticRelatedInformation_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation build() {
      ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation buildPartial() {
      ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation result = new ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.location_ = locationBuilder_ == null
            ? location_
            : locationBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.message_ = message_;
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
      if (other instanceof ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation) {
        return mergeFrom((ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation other) {
      if (other == ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation.getDefaultInstance()) return this;
      if (other.hasLocation()) {
        mergeLocation(other.getLocation());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
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
              input.readMessage(
                  getLocationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              message_ = input.readStringRequireUtf8();
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

    private ai.chalk.protos.chalk.lsp.v1.Location location_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.lsp.v1.Location, ai.chalk.protos.chalk.lsp.v1.Location.Builder, ai.chalk.protos.chalk.lsp.v1.LocationOrBuilder> locationBuilder_;
    /**
     * <code>.chalk.lsp.v1.Location location = 1 [json_name = "location"];</code>
     * @return Whether the location field is set.
     */
    public boolean hasLocation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.chalk.lsp.v1.Location location = 1 [json_name = "location"];</code>
     * @return The location.
     */
    public ai.chalk.protos.chalk.lsp.v1.Location getLocation() {
      if (locationBuilder_ == null) {
        return location_ == null ? ai.chalk.protos.chalk.lsp.v1.Location.getDefaultInstance() : location_;
      } else {
        return locationBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.lsp.v1.Location location = 1 [json_name = "location"];</code>
     */
    public Builder setLocation(ai.chalk.protos.chalk.lsp.v1.Location value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        location_ = value;
      } else {
        locationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.lsp.v1.Location location = 1 [json_name = "location"];</code>
     */
    public Builder setLocation(
        ai.chalk.protos.chalk.lsp.v1.Location.Builder builderForValue) {
      if (locationBuilder_ == null) {
        location_ = builderForValue.build();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.lsp.v1.Location location = 1 [json_name = "location"];</code>
     */
    public Builder mergeLocation(ai.chalk.protos.chalk.lsp.v1.Location value) {
      if (locationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          location_ != null &&
          location_ != ai.chalk.protos.chalk.lsp.v1.Location.getDefaultInstance()) {
          getLocationBuilder().mergeFrom(value);
        } else {
          location_ = value;
        }
      } else {
        locationBuilder_.mergeFrom(value);
      }
      if (location_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.lsp.v1.Location location = 1 [json_name = "location"];</code>
     */
    public Builder clearLocation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      location_ = null;
      if (locationBuilder_ != null) {
        locationBuilder_.dispose();
        locationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.lsp.v1.Location location = 1 [json_name = "location"];</code>
     */
    public ai.chalk.protos.chalk.lsp.v1.Location.Builder getLocationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLocationFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.lsp.v1.Location location = 1 [json_name = "location"];</code>
     */
    public ai.chalk.protos.chalk.lsp.v1.LocationOrBuilder getLocationOrBuilder() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        return location_ == null ?
            ai.chalk.protos.chalk.lsp.v1.Location.getDefaultInstance() : location_;
      }
    }
    /**
     * <code>.chalk.lsp.v1.Location location = 1 [json_name = "location"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.lsp.v1.Location, ai.chalk.protos.chalk.lsp.v1.Location.Builder, ai.chalk.protos.chalk.lsp.v1.LocationOrBuilder> 
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.lsp.v1.Location, ai.chalk.protos.chalk.lsp.v1.Location.Builder, ai.chalk.protos.chalk.lsp.v1.LocationOrBuilder>(
                getLocation(),
                getParentForChildren(),
                isClean());
        location_ = null;
      }
      return locationBuilder_;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2 [json_name = "message"];</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2 [json_name = "message"];</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2 [json_name = "message"];</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2 [json_name = "message"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2 [json_name = "message"];</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:chalk.lsp.v1.DiagnosticRelatedInformation)
  }

  // @@protoc_insertion_point(class_scope:chalk.lsp.v1.DiagnosticRelatedInformation)
  private static final ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation();
  }

  public static ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiagnosticRelatedInformation>
      PARSER = new com.google.protobuf.AbstractParser<DiagnosticRelatedInformation>() {
    @java.lang.Override
    public DiagnosticRelatedInformation parsePartialFrom(
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

  public static com.google.protobuf.Parser<DiagnosticRelatedInformation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiagnosticRelatedInformation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.lsp.v1.DiagnosticRelatedInformation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

