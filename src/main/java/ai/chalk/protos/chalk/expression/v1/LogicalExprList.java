// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.expression.v1;

/**
 * Protobuf type {@code chalk.expression.v1.LogicalExprList}
 */
public final class LogicalExprList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.expression.v1.LogicalExprList)
    LogicalExprListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogicalExprList.newBuilder() to construct.
  private LogicalExprList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogicalExprList() {
    expr_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LogicalExprList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_LogicalExprList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_LogicalExprList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.expression.v1.LogicalExprList.class, ai.chalk.protos.chalk.expression.v1.LogicalExprList.Builder.class);
  }

  public static final int EXPR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode> expr_;
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode> getExprList() {
    return expr_;
  }
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> 
      getExprOrBuilderList() {
    return expr_;
  }
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
   */
  @java.lang.Override
  public int getExprCount() {
    return expr_.size();
  }
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.LogicalExprNode getExpr(int index) {
    return expr_.get(index);
  }
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getExprOrBuilder(
      int index) {
    return expr_.get(index);
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
    for (int i = 0; i < expr_.size(); i++) {
      output.writeMessage(1, expr_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < expr_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, expr_.get(i));
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
    if (!(obj instanceof ai.chalk.protos.chalk.expression.v1.LogicalExprList)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.expression.v1.LogicalExprList other = (ai.chalk.protos.chalk.expression.v1.LogicalExprList) obj;

    if (!getExprList()
        .equals(other.getExprList())) return false;
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
    if (getExprCount() > 0) {
      hash = (37 * hash) + EXPR_FIELD_NUMBER;
      hash = (53 * hash) + getExprList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.expression.v1.LogicalExprList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.LogicalExprList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.LogicalExprList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.LogicalExprList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.LogicalExprList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.LogicalExprList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.LogicalExprList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.expression.v1.LogicalExprList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.expression.v1.LogicalExprList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.expression.v1.LogicalExprList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.LogicalExprList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.expression.v1.LogicalExprList parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.expression.v1.LogicalExprList prototype) {
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
   * Protobuf type {@code chalk.expression.v1.LogicalExprList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.expression.v1.LogicalExprList)
      ai.chalk.protos.chalk.expression.v1.LogicalExprListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_LogicalExprList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_LogicalExprList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.expression.v1.LogicalExprList.class, ai.chalk.protos.chalk.expression.v1.LogicalExprList.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.expression.v1.LogicalExprList.newBuilder()
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
      if (exprBuilder_ == null) {
        expr_ = java.util.Collections.emptyList();
      } else {
        expr_ = null;
        exprBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_LogicalExprList_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.LogicalExprList getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.expression.v1.LogicalExprList.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.LogicalExprList build() {
      ai.chalk.protos.chalk.expression.v1.LogicalExprList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.LogicalExprList buildPartial() {
      ai.chalk.protos.chalk.expression.v1.LogicalExprList result = new ai.chalk.protos.chalk.expression.v1.LogicalExprList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.chalk.protos.chalk.expression.v1.LogicalExprList result) {
      if (exprBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          expr_ = java.util.Collections.unmodifiableList(expr_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.expr_ = expr_;
      } else {
        result.expr_ = exprBuilder_.build();
      }
    }

    private void buildPartial0(ai.chalk.protos.chalk.expression.v1.LogicalExprList result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof ai.chalk.protos.chalk.expression.v1.LogicalExprList) {
        return mergeFrom((ai.chalk.protos.chalk.expression.v1.LogicalExprList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.expression.v1.LogicalExprList other) {
      if (other == ai.chalk.protos.chalk.expression.v1.LogicalExprList.getDefaultInstance()) return this;
      if (exprBuilder_ == null) {
        if (!other.expr_.isEmpty()) {
          if (expr_.isEmpty()) {
            expr_ = other.expr_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExprIsMutable();
            expr_.addAll(other.expr_);
          }
          onChanged();
        }
      } else {
        if (!other.expr_.isEmpty()) {
          if (exprBuilder_.isEmpty()) {
            exprBuilder_.dispose();
            exprBuilder_ = null;
            expr_ = other.expr_;
            bitField0_ = (bitField0_ & ~0x00000001);
            exprBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getExprFieldBuilder() : null;
          } else {
            exprBuilder_.addAllMessages(other.expr_);
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
              ai.chalk.protos.chalk.expression.v1.LogicalExprNode m =
                  input.readMessage(
                      ai.chalk.protos.chalk.expression.v1.LogicalExprNode.parser(),
                      extensionRegistry);
              if (exprBuilder_ == null) {
                ensureExprIsMutable();
                expr_.add(m);
              } else {
                exprBuilder_.addMessage(m);
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

    private java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode> expr_ =
      java.util.Collections.emptyList();
    private void ensureExprIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        expr_ = new java.util.ArrayList<ai.chalk.protos.chalk.expression.v1.LogicalExprNode>(expr_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.chalk.protos.chalk.expression.v1.LogicalExprNode, ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder, ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> exprBuilder_;

    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode> getExprList() {
      if (exprBuilder_ == null) {
        return java.util.Collections.unmodifiableList(expr_);
      } else {
        return exprBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public int getExprCount() {
      if (exprBuilder_ == null) {
        return expr_.size();
      } else {
        return exprBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.LogicalExprNode getExpr(int index) {
      if (exprBuilder_ == null) {
        return expr_.get(index);
      } else {
        return exprBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public Builder setExpr(
        int index, ai.chalk.protos.chalk.expression.v1.LogicalExprNode value) {
      if (exprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExprIsMutable();
        expr_.set(index, value);
        onChanged();
      } else {
        exprBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public Builder setExpr(
        int index, ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder builderForValue) {
      if (exprBuilder_ == null) {
        ensureExprIsMutable();
        expr_.set(index, builderForValue.build());
        onChanged();
      } else {
        exprBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public Builder addExpr(ai.chalk.protos.chalk.expression.v1.LogicalExprNode value) {
      if (exprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExprIsMutable();
        expr_.add(value);
        onChanged();
      } else {
        exprBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public Builder addExpr(
        int index, ai.chalk.protos.chalk.expression.v1.LogicalExprNode value) {
      if (exprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExprIsMutable();
        expr_.add(index, value);
        onChanged();
      } else {
        exprBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public Builder addExpr(
        ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder builderForValue) {
      if (exprBuilder_ == null) {
        ensureExprIsMutable();
        expr_.add(builderForValue.build());
        onChanged();
      } else {
        exprBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public Builder addExpr(
        int index, ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder builderForValue) {
      if (exprBuilder_ == null) {
        ensureExprIsMutable();
        expr_.add(index, builderForValue.build());
        onChanged();
      } else {
        exprBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public Builder addAllExpr(
        java.lang.Iterable<? extends ai.chalk.protos.chalk.expression.v1.LogicalExprNode> values) {
      if (exprBuilder_ == null) {
        ensureExprIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, expr_);
        onChanged();
      } else {
        exprBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public Builder clearExpr() {
      if (exprBuilder_ == null) {
        expr_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        exprBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public Builder removeExpr(int index) {
      if (exprBuilder_ == null) {
        ensureExprIsMutable();
        expr_.remove(index);
        onChanged();
      } else {
        exprBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder getExprBuilder(
        int index) {
      return getExprFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getExprOrBuilder(
        int index) {
      if (exprBuilder_ == null) {
        return expr_.get(index);  } else {
        return exprBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public java.util.List<? extends ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> 
         getExprOrBuilderList() {
      if (exprBuilder_ != null) {
        return exprBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(expr_);
      }
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder addExprBuilder() {
      return getExprFieldBuilder().addBuilder(
          ai.chalk.protos.chalk.expression.v1.LogicalExprNode.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder addExprBuilder(
        int index) {
      return getExprFieldBuilder().addBuilder(
          index, ai.chalk.protos.chalk.expression.v1.LogicalExprNode.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder> 
         getExprBuilderList() {
      return getExprFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.chalk.protos.chalk.expression.v1.LogicalExprNode, ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder, ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> 
        getExprFieldBuilder() {
      if (exprBuilder_ == null) {
        exprBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ai.chalk.protos.chalk.expression.v1.LogicalExprNode, ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder, ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder>(
                expr_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        expr_ = null;
      }
      return exprBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.expression.v1.LogicalExprList)
  }

  // @@protoc_insertion_point(class_scope:chalk.expression.v1.LogicalExprList)
  private static final ai.chalk.protos.chalk.expression.v1.LogicalExprList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.expression.v1.LogicalExprList();
  }

  public static ai.chalk.protos.chalk.expression.v1.LogicalExprList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogicalExprList>
      PARSER = new com.google.protobuf.AbstractParser<LogicalExprList>() {
    @java.lang.Override
    public LogicalExprList parsePartialFrom(
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

  public static com.google.protobuf.Parser<LogicalExprList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogicalExprList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.LogicalExprList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

