// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.graph.v1;

/**
 * Protobuf type {@code chalk.graph.v1.StreamResolverParam}
 */
public final class StreamResolverParam extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.graph.v1.StreamResolverParam)
    StreamResolverParamOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      StreamResolverParam.class.getName());
  }
  // Use StreamResolverParam.newBuilder() to construct.
  private StreamResolverParam(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private StreamResolverParam() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_StreamResolverParam_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_StreamResolverParam_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.graph.v1.StreamResolverParam.class, ai.chalk.protos.chalk.graph.v1.StreamResolverParam.Builder.class);
  }

  private int typeCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    MESSAGE(1),
    MESSAGE_WINDOW(2),
    STATE(3),
    TYPE_NOT_SET(0);
    private final int value;
    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 1: return MESSAGE;
        case 2: return MESSAGE_WINDOW;
        case 3: return STATE;
        case 0: return TYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase
  getTypeCase() {
    return TypeCase.forNumber(
        typeCase_);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  /**
   * <code>.chalk.graph.v1.StreamResolverParamMessage message = 1 [json_name = "message"];</code>
   * @return Whether the message field is set.
   */
  @java.lang.Override
  public boolean hasMessage() {
    return typeCase_ == 1;
  }
  /**
   * <code>.chalk.graph.v1.StreamResolverParamMessage message = 1 [json_name = "message"];</code>
   * @return The message.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage getMessage() {
    if (typeCase_ == 1) {
       return (ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage) type_;
    }
    return ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage.getDefaultInstance();
  }
  /**
   * <code>.chalk.graph.v1.StreamResolverParamMessage message = 1 [json_name = "message"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageOrBuilder getMessageOrBuilder() {
    if (typeCase_ == 1) {
       return (ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage) type_;
    }
    return ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage.getDefaultInstance();
  }

  public static final int MESSAGE_WINDOW_FIELD_NUMBER = 2;
  /**
   * <code>.chalk.graph.v1.StreamResolverParamMessageWindow message_window = 2 [json_name = "messageWindow"];</code>
   * @return Whether the messageWindow field is set.
   */
  @java.lang.Override
  public boolean hasMessageWindow() {
    return typeCase_ == 2;
  }
  /**
   * <code>.chalk.graph.v1.StreamResolverParamMessageWindow message_window = 2 [json_name = "messageWindow"];</code>
   * @return The messageWindow.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow getMessageWindow() {
    if (typeCase_ == 2) {
       return (ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow) type_;
    }
    return ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow.getDefaultInstance();
  }
  /**
   * <code>.chalk.graph.v1.StreamResolverParamMessageWindow message_window = 2 [json_name = "messageWindow"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindowOrBuilder getMessageWindowOrBuilder() {
    if (typeCase_ == 2) {
       return (ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow) type_;
    }
    return ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow.getDefaultInstance();
  }

  public static final int STATE_FIELD_NUMBER = 3;
  /**
   * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
   * @return Whether the state field is set.
   */
  @java.lang.Override
  public boolean hasState() {
    return typeCase_ == 3;
  }
  /**
   * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
   * @return The state.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.ResolverState getState() {
    if (typeCase_ == 3) {
       return (ai.chalk.protos.chalk.graph.v1.ResolverState) type_;
    }
    return ai.chalk.protos.chalk.graph.v1.ResolverState.getDefaultInstance();
  }
  /**
   * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.ResolverStateOrBuilder getStateOrBuilder() {
    if (typeCase_ == 3) {
       return (ai.chalk.protos.chalk.graph.v1.ResolverState) type_;
    }
    return ai.chalk.protos.chalk.graph.v1.ResolverState.getDefaultInstance();
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
    if (typeCase_ == 1) {
      output.writeMessage(1, (ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage) type_);
    }
    if (typeCase_ == 2) {
      output.writeMessage(2, (ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow) type_);
    }
    if (typeCase_ == 3) {
      output.writeMessage(3, (ai.chalk.protos.chalk.graph.v1.ResolverState) type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (typeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage) type_);
    }
    if (typeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow) type_);
    }
    if (typeCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (ai.chalk.protos.chalk.graph.v1.ResolverState) type_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.graph.v1.StreamResolverParam)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.graph.v1.StreamResolverParam other = (ai.chalk.protos.chalk.graph.v1.StreamResolverParam) obj;

    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 1:
        if (!getMessage()
            .equals(other.getMessage())) return false;
        break;
      case 2:
        if (!getMessageWindow()
            .equals(other.getMessageWindow())) return false;
        break;
      case 3:
        if (!getState()
            .equals(other.getState())) return false;
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
    switch (typeCase_) {
      case 1:
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
        break;
      case 2:
        hash = (37 * hash) + MESSAGE_WINDOW_FIELD_NUMBER;
        hash = (53 * hash) + getMessageWindow().hashCode();
        break;
      case 3:
        hash = (37 * hash) + STATE_FIELD_NUMBER;
        hash = (53 * hash) + getState().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.graph.v1.StreamResolverParam parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamResolverParam parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamResolverParam parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamResolverParam parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamResolverParam parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamResolverParam parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamResolverParam parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamResolverParam parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.graph.v1.StreamResolverParam parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.graph.v1.StreamResolverParam parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamResolverParam parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamResolverParam parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.graph.v1.StreamResolverParam prototype) {
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
   * Protobuf type {@code chalk.graph.v1.StreamResolverParam}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.graph.v1.StreamResolverParam)
      ai.chalk.protos.chalk.graph.v1.StreamResolverParamOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_StreamResolverParam_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_StreamResolverParam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.graph.v1.StreamResolverParam.class, ai.chalk.protos.chalk.graph.v1.StreamResolverParam.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.graph.v1.StreamResolverParam.newBuilder()
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
      if (messageBuilder_ != null) {
        messageBuilder_.clear();
      }
      if (messageWindowBuilder_ != null) {
        messageWindowBuilder_.clear();
      }
      if (stateBuilder_ != null) {
        stateBuilder_.clear();
      }
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_StreamResolverParam_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.StreamResolverParam getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.graph.v1.StreamResolverParam.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.StreamResolverParam build() {
      ai.chalk.protos.chalk.graph.v1.StreamResolverParam result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.StreamResolverParam buildPartial() {
      ai.chalk.protos.chalk.graph.v1.StreamResolverParam result = new ai.chalk.protos.chalk.graph.v1.StreamResolverParam(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.graph.v1.StreamResolverParam result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(ai.chalk.protos.chalk.graph.v1.StreamResolverParam result) {
      result.typeCase_ = typeCase_;
      result.type_ = this.type_;
      if (typeCase_ == 1 &&
          messageBuilder_ != null) {
        result.type_ = messageBuilder_.build();
      }
      if (typeCase_ == 2 &&
          messageWindowBuilder_ != null) {
        result.type_ = messageWindowBuilder_.build();
      }
      if (typeCase_ == 3 &&
          stateBuilder_ != null) {
        result.type_ = stateBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.graph.v1.StreamResolverParam) {
        return mergeFrom((ai.chalk.protos.chalk.graph.v1.StreamResolverParam)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.graph.v1.StreamResolverParam other) {
      if (other == ai.chalk.protos.chalk.graph.v1.StreamResolverParam.getDefaultInstance()) return this;
      switch (other.getTypeCase()) {
        case MESSAGE: {
          mergeMessage(other.getMessage());
          break;
        }
        case MESSAGE_WINDOW: {
          mergeMessageWindow(other.getMessageWindow());
          break;
        }
        case STATE: {
          mergeState(other.getState());
          break;
        }
        case TYPE_NOT_SET: {
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
                  getMessageFieldBuilder().getBuilder(),
                  extensionRegistry);
              typeCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMessageWindowFieldBuilder().getBuilder(),
                  extensionRegistry);
              typeCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getStateFieldBuilder().getBuilder(),
                  extensionRegistry);
              typeCase_ = 3;
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
    private int typeCase_ = 0;
    private java.lang.Object type_;
    public TypeCase
        getTypeCase() {
      return TypeCase.forNumber(
          typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage, ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage.Builder, ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageOrBuilder> messageBuilder_;
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessage message = 1 [json_name = "message"];</code>
     * @return Whether the message field is set.
     */
    @java.lang.Override
    public boolean hasMessage() {
      return typeCase_ == 1;
    }
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessage message = 1 [json_name = "message"];</code>
     * @return The message.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage getMessage() {
      if (messageBuilder_ == null) {
        if (typeCase_ == 1) {
          return (ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage) type_;
        }
        return ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage.getDefaultInstance();
      } else {
        if (typeCase_ == 1) {
          return messageBuilder_.getMessage();
        }
        return ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessage message = 1 [json_name = "message"];</code>
     */
    public Builder setMessage(ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        messageBuilder_.setMessage(value);
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessage message = 1 [json_name = "message"];</code>
     */
    public Builder setMessage(
        ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage.Builder builderForValue) {
      if (messageBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessage message = 1 [json_name = "message"];</code>
     */
    public Builder mergeMessage(ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage value) {
      if (messageBuilder_ == null) {
        if (typeCase_ == 1 &&
            type_ != ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage.getDefaultInstance()) {
          type_ = ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage.newBuilder((ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 1) {
          messageBuilder_.mergeFrom(value);
        } else {
          messageBuilder_.setMessage(value);
        }
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessage message = 1 [json_name = "message"];</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
        }
        messageBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessage message = 1 [json_name = "message"];</code>
     */
    public ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage.Builder getMessageBuilder() {
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessage message = 1 [json_name = "message"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageOrBuilder getMessageOrBuilder() {
      if ((typeCase_ == 1) && (messageBuilder_ != null)) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 1) {
          return (ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage) type_;
        }
        return ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessage message = 1 [json_name = "message"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage, ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage.Builder, ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        if (!(typeCase_ == 1)) {
          type_ = ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage.getDefaultInstance();
        }
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage, ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage.Builder, ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageOrBuilder>(
                (ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessage) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 1;
      onChanged();
      return messageBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow, ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow.Builder, ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindowOrBuilder> messageWindowBuilder_;
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessageWindow message_window = 2 [json_name = "messageWindow"];</code>
     * @return Whether the messageWindow field is set.
     */
    @java.lang.Override
    public boolean hasMessageWindow() {
      return typeCase_ == 2;
    }
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessageWindow message_window = 2 [json_name = "messageWindow"];</code>
     * @return The messageWindow.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow getMessageWindow() {
      if (messageWindowBuilder_ == null) {
        if (typeCase_ == 2) {
          return (ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow) type_;
        }
        return ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow.getDefaultInstance();
      } else {
        if (typeCase_ == 2) {
          return messageWindowBuilder_.getMessage();
        }
        return ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessageWindow message_window = 2 [json_name = "messageWindow"];</code>
     */
    public Builder setMessageWindow(ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow value) {
      if (messageWindowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        messageWindowBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessageWindow message_window = 2 [json_name = "messageWindow"];</code>
     */
    public Builder setMessageWindow(
        ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow.Builder builderForValue) {
      if (messageWindowBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        messageWindowBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessageWindow message_window = 2 [json_name = "messageWindow"];</code>
     */
    public Builder mergeMessageWindow(ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow value) {
      if (messageWindowBuilder_ == null) {
        if (typeCase_ == 2 &&
            type_ != ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow.getDefaultInstance()) {
          type_ = ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow.newBuilder((ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 2) {
          messageWindowBuilder_.mergeFrom(value);
        } else {
          messageWindowBuilder_.setMessage(value);
        }
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessageWindow message_window = 2 [json_name = "messageWindow"];</code>
     */
    public Builder clearMessageWindow() {
      if (messageWindowBuilder_ == null) {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
        }
        messageWindowBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessageWindow message_window = 2 [json_name = "messageWindow"];</code>
     */
    public ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow.Builder getMessageWindowBuilder() {
      return getMessageWindowFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessageWindow message_window = 2 [json_name = "messageWindow"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindowOrBuilder getMessageWindowOrBuilder() {
      if ((typeCase_ == 2) && (messageWindowBuilder_ != null)) {
        return messageWindowBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 2) {
          return (ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow) type_;
        }
        return ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.StreamResolverParamMessageWindow message_window = 2 [json_name = "messageWindow"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow, ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow.Builder, ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindowOrBuilder> 
        getMessageWindowFieldBuilder() {
      if (messageWindowBuilder_ == null) {
        if (!(typeCase_ == 2)) {
          type_ = ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow.getDefaultInstance();
        }
        messageWindowBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow, ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow.Builder, ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindowOrBuilder>(
                (ai.chalk.protos.chalk.graph.v1.StreamResolverParamMessageWindow) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 2;
      onChanged();
      return messageWindowBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.graph.v1.ResolverState, ai.chalk.protos.chalk.graph.v1.ResolverState.Builder, ai.chalk.protos.chalk.graph.v1.ResolverStateOrBuilder> stateBuilder_;
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     * @return Whether the state field is set.
     */
    @java.lang.Override
    public boolean hasState() {
      return typeCase_ == 3;
    }
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     * @return The state.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.ResolverState getState() {
      if (stateBuilder_ == null) {
        if (typeCase_ == 3) {
          return (ai.chalk.protos.chalk.graph.v1.ResolverState) type_;
        }
        return ai.chalk.protos.chalk.graph.v1.ResolverState.getDefaultInstance();
      } else {
        if (typeCase_ == 3) {
          return stateBuilder_.getMessage();
        }
        return ai.chalk.protos.chalk.graph.v1.ResolverState.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     */
    public Builder setState(ai.chalk.protos.chalk.graph.v1.ResolverState value) {
      if (stateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        stateBuilder_.setMessage(value);
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     */
    public Builder setState(
        ai.chalk.protos.chalk.graph.v1.ResolverState.Builder builderForValue) {
      if (stateBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        stateBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     */
    public Builder mergeState(ai.chalk.protos.chalk.graph.v1.ResolverState value) {
      if (stateBuilder_ == null) {
        if (typeCase_ == 3 &&
            type_ != ai.chalk.protos.chalk.graph.v1.ResolverState.getDefaultInstance()) {
          type_ = ai.chalk.protos.chalk.graph.v1.ResolverState.newBuilder((ai.chalk.protos.chalk.graph.v1.ResolverState) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 3) {
          stateBuilder_.mergeFrom(value);
        } else {
          stateBuilder_.setMessage(value);
        }
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     */
    public Builder clearState() {
      if (stateBuilder_ == null) {
        if (typeCase_ == 3) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 3) {
          typeCase_ = 0;
          type_ = null;
        }
        stateBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     */
    public ai.chalk.protos.chalk.graph.v1.ResolverState.Builder getStateBuilder() {
      return getStateFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.ResolverStateOrBuilder getStateOrBuilder() {
      if ((typeCase_ == 3) && (stateBuilder_ != null)) {
        return stateBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 3) {
          return (ai.chalk.protos.chalk.graph.v1.ResolverState) type_;
        }
        return ai.chalk.protos.chalk.graph.v1.ResolverState.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.graph.v1.ResolverState, ai.chalk.protos.chalk.graph.v1.ResolverState.Builder, ai.chalk.protos.chalk.graph.v1.ResolverStateOrBuilder> 
        getStateFieldBuilder() {
      if (stateBuilder_ == null) {
        if (!(typeCase_ == 3)) {
          type_ = ai.chalk.protos.chalk.graph.v1.ResolverState.getDefaultInstance();
        }
        stateBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.chalk.protos.chalk.graph.v1.ResolverState, ai.chalk.protos.chalk.graph.v1.ResolverState.Builder, ai.chalk.protos.chalk.graph.v1.ResolverStateOrBuilder>(
                (ai.chalk.protos.chalk.graph.v1.ResolverState) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 3;
      onChanged();
      return stateBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:chalk.graph.v1.StreamResolverParam)
  }

  // @@protoc_insertion_point(class_scope:chalk.graph.v1.StreamResolverParam)
  private static final ai.chalk.protos.chalk.graph.v1.StreamResolverParam DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.graph.v1.StreamResolverParam();
  }

  public static ai.chalk.protos.chalk.graph.v1.StreamResolverParam getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamResolverParam>
      PARSER = new com.google.protobuf.AbstractParser<StreamResolverParam>() {
    @java.lang.Override
    public StreamResolverParam parsePartialFrom(
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

  public static com.google.protobuf.Parser<StreamResolverParam> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamResolverParam> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.StreamResolverParam getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
