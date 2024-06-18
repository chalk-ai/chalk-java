// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.expression.v1;

/**
 * Protobuf type {@code chalk.expression.v1.ScalarUDFExprNode}
 */
public final class ScalarUDFExprNode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.expression.v1.ScalarUDFExprNode)
    ScalarUDFExprNodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScalarUDFExprNode.newBuilder() to construct.
  private ScalarUDFExprNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScalarUDFExprNode() {
    funName_ = "";
    args_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScalarUDFExprNode();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_ScalarUDFExprNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_ScalarUDFExprNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode.class, ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode.Builder.class);
  }

  public static final int FUN_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object funName_ = "";
  /**
   * <code>string fun_name = 1 [json_name = "funName"];</code>
   * @return The funName.
   */
  @java.lang.Override
  public java.lang.String getFunName() {
    java.lang.Object ref = funName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      funName_ = s;
      return s;
    }
  }
  /**
   * <code>string fun_name = 1 [json_name = "funName"];</code>
   * @return The bytes for funName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFunNameBytes() {
    java.lang.Object ref = funName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      funName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARGS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode> args_;
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode> getArgsList() {
    return args_;
  }
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> 
      getArgsOrBuilderList() {
    return args_;
  }
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
   */
  @java.lang.Override
  public int getArgsCount() {
    return args_.size();
  }
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.LogicalExprNode getArgs(int index) {
    return args_.get(index);
  }
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getArgsOrBuilder(
      int index) {
    return args_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(funName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, funName_);
    }
    for (int i = 0; i < args_.size(); i++) {
      output.writeMessage(2, args_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(funName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, funName_);
    }
    for (int i = 0; i < args_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, args_.get(i));
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
    if (!(obj instanceof ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode other = (ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode) obj;

    if (!getFunName()
        .equals(other.getFunName())) return false;
    if (!getArgsList()
        .equals(other.getArgsList())) return false;
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
    hash = (37 * hash) + FUN_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFunName().hashCode();
    if (getArgsCount() > 0) {
      hash = (37 * hash) + ARGS_FIELD_NUMBER;
      hash = (53 * hash) + getArgsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode prototype) {
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
   * Protobuf type {@code chalk.expression.v1.ScalarUDFExprNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.expression.v1.ScalarUDFExprNode)
      ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_ScalarUDFExprNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_ScalarUDFExprNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode.class, ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode.newBuilder()
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
      funName_ = "";
      if (argsBuilder_ == null) {
        args_ = java.util.Collections.emptyList();
      } else {
        args_ = null;
        argsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_ScalarUDFExprNode_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode build() {
      ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode buildPartial() {
      ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode result = new ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode result) {
      if (argsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          args_ = java.util.Collections.unmodifiableList(args_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.args_ = args_;
      } else {
        result.args_ = argsBuilder_.build();
      }
    }

    private void buildPartial0(ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.funName_ = funName_;
      }
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
      if (other instanceof ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode) {
        return mergeFrom((ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode other) {
      if (other == ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode.getDefaultInstance()) return this;
      if (!other.getFunName().isEmpty()) {
        funName_ = other.funName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (argsBuilder_ == null) {
        if (!other.args_.isEmpty()) {
          if (args_.isEmpty()) {
            args_ = other.args_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureArgsIsMutable();
            args_.addAll(other.args_);
          }
          onChanged();
        }
      } else {
        if (!other.args_.isEmpty()) {
          if (argsBuilder_.isEmpty()) {
            argsBuilder_.dispose();
            argsBuilder_ = null;
            args_ = other.args_;
            bitField0_ = (bitField0_ & ~0x00000002);
            argsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getArgsFieldBuilder() : null;
          } else {
            argsBuilder_.addAllMessages(other.args_);
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
              funName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              ai.chalk.protos.chalk.expression.v1.LogicalExprNode m =
                  input.readMessage(
                      ai.chalk.protos.chalk.expression.v1.LogicalExprNode.parser(),
                      extensionRegistry);
              if (argsBuilder_ == null) {
                ensureArgsIsMutable();
                args_.add(m);
              } else {
                argsBuilder_.addMessage(m);
              }
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

    private java.lang.Object funName_ = "";
    /**
     * <code>string fun_name = 1 [json_name = "funName"];</code>
     * @return The funName.
     */
    public java.lang.String getFunName() {
      java.lang.Object ref = funName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        funName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fun_name = 1 [json_name = "funName"];</code>
     * @return The bytes for funName.
     */
    public com.google.protobuf.ByteString
        getFunNameBytes() {
      java.lang.Object ref = funName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        funName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fun_name = 1 [json_name = "funName"];</code>
     * @param value The funName to set.
     * @return This builder for chaining.
     */
    public Builder setFunName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      funName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string fun_name = 1 [json_name = "funName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFunName() {
      funName_ = getDefaultInstance().getFunName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string fun_name = 1 [json_name = "funName"];</code>
     * @param value The bytes for funName to set.
     * @return This builder for chaining.
     */
    public Builder setFunNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      funName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode> args_ =
      java.util.Collections.emptyList();
    private void ensureArgsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        args_ = new java.util.ArrayList<ai.chalk.protos.chalk.expression.v1.LogicalExprNode>(args_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.chalk.protos.chalk.expression.v1.LogicalExprNode, ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder, ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> argsBuilder_;

    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode> getArgsList() {
      if (argsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(args_);
      } else {
        return argsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public int getArgsCount() {
      if (argsBuilder_ == null) {
        return args_.size();
      } else {
        return argsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.LogicalExprNode getArgs(int index) {
      if (argsBuilder_ == null) {
        return args_.get(index);
      } else {
        return argsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public Builder setArgs(
        int index, ai.chalk.protos.chalk.expression.v1.LogicalExprNode value) {
      if (argsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgsIsMutable();
        args_.set(index, value);
        onChanged();
      } else {
        argsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public Builder setArgs(
        int index, ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder builderForValue) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.set(index, builderForValue.build());
        onChanged();
      } else {
        argsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public Builder addArgs(ai.chalk.protos.chalk.expression.v1.LogicalExprNode value) {
      if (argsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgsIsMutable();
        args_.add(value);
        onChanged();
      } else {
        argsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public Builder addArgs(
        int index, ai.chalk.protos.chalk.expression.v1.LogicalExprNode value) {
      if (argsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgsIsMutable();
        args_.add(index, value);
        onChanged();
      } else {
        argsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public Builder addArgs(
        ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder builderForValue) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.add(builderForValue.build());
        onChanged();
      } else {
        argsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public Builder addArgs(
        int index, ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder builderForValue) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.add(index, builderForValue.build());
        onChanged();
      } else {
        argsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public Builder addAllArgs(
        java.lang.Iterable<? extends ai.chalk.protos.chalk.expression.v1.LogicalExprNode> values) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, args_);
        onChanged();
      } else {
        argsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public Builder clearArgs() {
      if (argsBuilder_ == null) {
        args_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        argsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public Builder removeArgs(int index) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.remove(index);
        onChanged();
      } else {
        argsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder getArgsBuilder(
        int index) {
      return getArgsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getArgsOrBuilder(
        int index) {
      if (argsBuilder_ == null) {
        return args_.get(index);  } else {
        return argsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public java.util.List<? extends ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> 
         getArgsOrBuilderList() {
      if (argsBuilder_ != null) {
        return argsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(args_);
      }
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder addArgsBuilder() {
      return getArgsFieldBuilder().addBuilder(
          ai.chalk.protos.chalk.expression.v1.LogicalExprNode.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder addArgsBuilder(
        int index) {
      return getArgsFieldBuilder().addBuilder(
          index, ai.chalk.protos.chalk.expression.v1.LogicalExprNode.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder> 
         getArgsBuilderList() {
      return getArgsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.chalk.protos.chalk.expression.v1.LogicalExprNode, ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder, ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> 
        getArgsFieldBuilder() {
      if (argsBuilder_ == null) {
        argsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ai.chalk.protos.chalk.expression.v1.LogicalExprNode, ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder, ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder>(
                args_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        args_ = null;
      }
      return argsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.expression.v1.ScalarUDFExprNode)
  }

  // @@protoc_insertion_point(class_scope:chalk.expression.v1.ScalarUDFExprNode)
  private static final ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode();
  }

  public static ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScalarUDFExprNode>
      PARSER = new com.google.protobuf.AbstractParser<ScalarUDFExprNode>() {
    @java.lang.Override
    public ScalarUDFExprNode parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScalarUDFExprNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScalarUDFExprNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.ScalarUDFExprNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

