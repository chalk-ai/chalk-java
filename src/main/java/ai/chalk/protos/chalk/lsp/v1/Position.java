// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/lsp/v1/lsp.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.lsp.v1;

/**
 * Protobuf type {@code chalk.lsp.v1.Position}
 */
public final class Position extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.lsp.v1.Position)
    PositionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Position.newBuilder() to construct.
  private Position(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Position() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Position();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.lsp.v1.LspProto.internal_static_chalk_lsp_v1_Position_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.lsp.v1.LspProto.internal_static_chalk_lsp_v1_Position_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.lsp.v1.Position.class, ai.chalk.protos.chalk.lsp.v1.Position.Builder.class);
  }

  private int bitField0_;
  public static final int LINE_FIELD_NUMBER = 1;
  private int line_ = 0;
  /**
   * <code>optional int32 line = 1 [json_name = "line"];</code>
   * @return Whether the line field is set.
   */
  @java.lang.Override
  public boolean hasLine() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 line = 1 [json_name = "line"];</code>
   * @return The line.
   */
  @java.lang.Override
  public int getLine() {
    return line_;
  }

  public static final int CHARACTER_FIELD_NUMBER = 2;
  private int character_ = 0;
  /**
   * <code>optional int32 character = 2 [json_name = "character"];</code>
   * @return Whether the character field is set.
   */
  @java.lang.Override
  public boolean hasCharacter() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 character = 2 [json_name = "character"];</code>
   * @return The character.
   */
  @java.lang.Override
  public int getCharacter() {
    return character_;
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
      output.writeInt32(1, line_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, character_);
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
        .computeInt32Size(1, line_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, character_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.lsp.v1.Position)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.lsp.v1.Position other = (ai.chalk.protos.chalk.lsp.v1.Position) obj;

    if (hasLine() != other.hasLine()) return false;
    if (hasLine()) {
      if (getLine()
          != other.getLine()) return false;
    }
    if (hasCharacter() != other.hasCharacter()) return false;
    if (hasCharacter()) {
      if (getCharacter()
          != other.getCharacter()) return false;
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
    if (hasLine()) {
      hash = (37 * hash) + LINE_FIELD_NUMBER;
      hash = (53 * hash) + getLine();
    }
    if (hasCharacter()) {
      hash = (37 * hash) + CHARACTER_FIELD_NUMBER;
      hash = (53 * hash) + getCharacter();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.lsp.v1.Position parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.lsp.v1.Position parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.lsp.v1.Position parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.lsp.v1.Position parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.lsp.v1.Position parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.lsp.v1.Position parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.lsp.v1.Position parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.lsp.v1.Position parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.lsp.v1.Position parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.lsp.v1.Position parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.lsp.v1.Position parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.lsp.v1.Position parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.lsp.v1.Position prototype) {
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
   * Protobuf type {@code chalk.lsp.v1.Position}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.lsp.v1.Position)
      ai.chalk.protos.chalk.lsp.v1.PositionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.lsp.v1.LspProto.internal_static_chalk_lsp_v1_Position_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.lsp.v1.LspProto.internal_static_chalk_lsp_v1_Position_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.lsp.v1.Position.class, ai.chalk.protos.chalk.lsp.v1.Position.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.lsp.v1.Position.newBuilder()
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
      line_ = 0;
      character_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.lsp.v1.LspProto.internal_static_chalk_lsp_v1_Position_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.lsp.v1.Position getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.lsp.v1.Position.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.lsp.v1.Position build() {
      ai.chalk.protos.chalk.lsp.v1.Position result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.lsp.v1.Position buildPartial() {
      ai.chalk.protos.chalk.lsp.v1.Position result = new ai.chalk.protos.chalk.lsp.v1.Position(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.lsp.v1.Position result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.line_ = line_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.character_ = character_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof ai.chalk.protos.chalk.lsp.v1.Position) {
        return mergeFrom((ai.chalk.protos.chalk.lsp.v1.Position)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.lsp.v1.Position other) {
      if (other == ai.chalk.protos.chalk.lsp.v1.Position.getDefaultInstance()) return this;
      if (other.hasLine()) {
        setLine(other.getLine());
      }
      if (other.hasCharacter()) {
        setCharacter(other.getCharacter());
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
              line_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              character_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private int line_ ;
    /**
     * <code>optional int32 line = 1 [json_name = "line"];</code>
     * @return Whether the line field is set.
     */
    @java.lang.Override
    public boolean hasLine() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 line = 1 [json_name = "line"];</code>
     * @return The line.
     */
    @java.lang.Override
    public int getLine() {
      return line_;
    }
    /**
     * <code>optional int32 line = 1 [json_name = "line"];</code>
     * @param value The line to set.
     * @return This builder for chaining.
     */
    public Builder setLine(int value) {

      line_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 line = 1 [json_name = "line"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLine() {
      bitField0_ = (bitField0_ & ~0x00000001);
      line_ = 0;
      onChanged();
      return this;
    }

    private int character_ ;
    /**
     * <code>optional int32 character = 2 [json_name = "character"];</code>
     * @return Whether the character field is set.
     */
    @java.lang.Override
    public boolean hasCharacter() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 character = 2 [json_name = "character"];</code>
     * @return The character.
     */
    @java.lang.Override
    public int getCharacter() {
      return character_;
    }
    /**
     * <code>optional int32 character = 2 [json_name = "character"];</code>
     * @param value The character to set.
     * @return This builder for chaining.
     */
    public Builder setCharacter(int value) {

      character_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 character = 2 [json_name = "character"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCharacter() {
      bitField0_ = (bitField0_ & ~0x00000002);
      character_ = 0;
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


    // @@protoc_insertion_point(builder_scope:chalk.lsp.v1.Position)
  }

  // @@protoc_insertion_point(class_scope:chalk.lsp.v1.Position)
  private static final ai.chalk.protos.chalk.lsp.v1.Position DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.lsp.v1.Position();
  }

  public static ai.chalk.protos.chalk.lsp.v1.Position getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Position>
      PARSER = new com.google.protobuf.AbstractParser<Position>() {
    @java.lang.Override
    public Position parsePartialFrom(
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

  public static com.google.protobuf.Parser<Position> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Position> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.lsp.v1.Position getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

