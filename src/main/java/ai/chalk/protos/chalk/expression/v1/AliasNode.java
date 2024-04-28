// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.expression.v1;

/**
 * Protobuf type {@code chalk.expression.v1.AliasNode}
 */
public final class AliasNode extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.expression.v1.AliasNode)
    AliasNodeOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      AliasNode.class.getName());
  }
  // Use AliasNode.newBuilder() to construct.
  private AliasNode(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AliasNode() {
    alias_ = "";
    relation_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_AliasNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_AliasNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.expression.v1.AliasNode.class, ai.chalk.protos.chalk.expression.v1.AliasNode.Builder.class);
  }

  private int bitField0_;
  public static final int EXPR_FIELD_NUMBER = 1;
  private ai.chalk.protos.chalk.expression.v1.LogicalExprNode expr_;
  /**
   * <code>.chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
   * @return Whether the expr field is set.
   */
  @java.lang.Override
  public boolean hasExpr() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
   * @return The expr.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.LogicalExprNode getExpr() {
    return expr_ == null ? ai.chalk.protos.chalk.expression.v1.LogicalExprNode.getDefaultInstance() : expr_;
  }
  /**
   * <code>.chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getExprOrBuilder() {
    return expr_ == null ? ai.chalk.protos.chalk.expression.v1.LogicalExprNode.getDefaultInstance() : expr_;
  }

  public static final int ALIAS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object alias_ = "";
  /**
   * <code>string alias = 2 [json_name = "alias"];</code>
   * @return The alias.
   */
  @java.lang.Override
  public java.lang.String getAlias() {
    java.lang.Object ref = alias_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alias_ = s;
      return s;
    }
  }
  /**
   * <code>string alias = 2 [json_name = "alias"];</code>
   * @return The bytes for alias.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAliasBytes() {
    java.lang.Object ref = alias_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alias_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RELATION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<ai.chalk.protos.chalk.expression.v1.OwnedTableReference> relation_;
  /**
   * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.chalk.protos.chalk.expression.v1.OwnedTableReference> getRelationList() {
    return relation_;
  }
  /**
   * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.chalk.protos.chalk.expression.v1.OwnedTableReferenceOrBuilder> 
      getRelationOrBuilderList() {
    return relation_;
  }
  /**
   * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
   */
  @java.lang.Override
  public int getRelationCount() {
    return relation_.size();
  }
  /**
   * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.OwnedTableReference getRelation(int index) {
    return relation_.get(index);
  }
  /**
   * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.OwnedTableReferenceOrBuilder getRelationOrBuilder(
      int index) {
    return relation_.get(index);
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
      output.writeMessage(1, getExpr());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(alias_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, alias_);
    }
    for (int i = 0; i < relation_.size(); i++) {
      output.writeMessage(3, relation_.get(i));
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
        .computeMessageSize(1, getExpr());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(alias_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, alias_);
    }
    for (int i = 0; i < relation_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, relation_.get(i));
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
    if (!(obj instanceof ai.chalk.protos.chalk.expression.v1.AliasNode)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.expression.v1.AliasNode other = (ai.chalk.protos.chalk.expression.v1.AliasNode) obj;

    if (hasExpr() != other.hasExpr()) return false;
    if (hasExpr()) {
      if (!getExpr()
          .equals(other.getExpr())) return false;
    }
    if (!getAlias()
        .equals(other.getAlias())) return false;
    if (!getRelationList()
        .equals(other.getRelationList())) return false;
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
    if (hasExpr()) {
      hash = (37 * hash) + EXPR_FIELD_NUMBER;
      hash = (53 * hash) + getExpr().hashCode();
    }
    hash = (37 * hash) + ALIAS_FIELD_NUMBER;
    hash = (53 * hash) + getAlias().hashCode();
    if (getRelationCount() > 0) {
      hash = (37 * hash) + RELATION_FIELD_NUMBER;
      hash = (53 * hash) + getRelationList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.expression.v1.AliasNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.AliasNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.AliasNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.AliasNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.AliasNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.AliasNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.AliasNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.expression.v1.AliasNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.expression.v1.AliasNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.expression.v1.AliasNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.AliasNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.expression.v1.AliasNode parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.expression.v1.AliasNode prototype) {
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
   * Protobuf type {@code chalk.expression.v1.AliasNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.expression.v1.AliasNode)
      ai.chalk.protos.chalk.expression.v1.AliasNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_AliasNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_AliasNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.expression.v1.AliasNode.class, ai.chalk.protos.chalk.expression.v1.AliasNode.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.expression.v1.AliasNode.newBuilder()
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
        getExprFieldBuilder();
        getRelationFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      expr_ = null;
      if (exprBuilder_ != null) {
        exprBuilder_.dispose();
        exprBuilder_ = null;
      }
      alias_ = "";
      if (relationBuilder_ == null) {
        relation_ = java.util.Collections.emptyList();
      } else {
        relation_ = null;
        relationBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_AliasNode_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.AliasNode getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.expression.v1.AliasNode.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.AliasNode build() {
      ai.chalk.protos.chalk.expression.v1.AliasNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.AliasNode buildPartial() {
      ai.chalk.protos.chalk.expression.v1.AliasNode result = new ai.chalk.protos.chalk.expression.v1.AliasNode(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.chalk.protos.chalk.expression.v1.AliasNode result) {
      if (relationBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          relation_ = java.util.Collections.unmodifiableList(relation_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.relation_ = relation_;
      } else {
        result.relation_ = relationBuilder_.build();
      }
    }

    private void buildPartial0(ai.chalk.protos.chalk.expression.v1.AliasNode result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.expr_ = exprBuilder_ == null
            ? expr_
            : exprBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.alias_ = alias_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.expression.v1.AliasNode) {
        return mergeFrom((ai.chalk.protos.chalk.expression.v1.AliasNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.expression.v1.AliasNode other) {
      if (other == ai.chalk.protos.chalk.expression.v1.AliasNode.getDefaultInstance()) return this;
      if (other.hasExpr()) {
        mergeExpr(other.getExpr());
      }
      if (!other.getAlias().isEmpty()) {
        alias_ = other.alias_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (relationBuilder_ == null) {
        if (!other.relation_.isEmpty()) {
          if (relation_.isEmpty()) {
            relation_ = other.relation_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureRelationIsMutable();
            relation_.addAll(other.relation_);
          }
          onChanged();
        }
      } else {
        if (!other.relation_.isEmpty()) {
          if (relationBuilder_.isEmpty()) {
            relationBuilder_.dispose();
            relationBuilder_ = null;
            relation_ = other.relation_;
            bitField0_ = (bitField0_ & ~0x00000004);
            relationBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getRelationFieldBuilder() : null;
          } else {
            relationBuilder_.addAllMessages(other.relation_);
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
              input.readMessage(
                  getExprFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              alias_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              ai.chalk.protos.chalk.expression.v1.OwnedTableReference m =
                  input.readMessage(
                      ai.chalk.protos.chalk.expression.v1.OwnedTableReference.parser(),
                      extensionRegistry);
              if (relationBuilder_ == null) {
                ensureRelationIsMutable();
                relation_.add(m);
              } else {
                relationBuilder_.addMessage(m);
              }
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
    private int bitField0_;

    private ai.chalk.protos.chalk.expression.v1.LogicalExprNode expr_;
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.expression.v1.LogicalExprNode, ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder, ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> exprBuilder_;
    /**
     * <code>.chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     * @return Whether the expr field is set.
     */
    public boolean hasExpr() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     * @return The expr.
     */
    public ai.chalk.protos.chalk.expression.v1.LogicalExprNode getExpr() {
      if (exprBuilder_ == null) {
        return expr_ == null ? ai.chalk.protos.chalk.expression.v1.LogicalExprNode.getDefaultInstance() : expr_;
      } else {
        return exprBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public Builder setExpr(ai.chalk.protos.chalk.expression.v1.LogicalExprNode value) {
      if (exprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expr_ = value;
      } else {
        exprBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public Builder setExpr(
        ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder builderForValue) {
      if (exprBuilder_ == null) {
        expr_ = builderForValue.build();
      } else {
        exprBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public Builder mergeExpr(ai.chalk.protos.chalk.expression.v1.LogicalExprNode value) {
      if (exprBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          expr_ != null &&
          expr_ != ai.chalk.protos.chalk.expression.v1.LogicalExprNode.getDefaultInstance()) {
          getExprBuilder().mergeFrom(value);
        } else {
          expr_ = value;
        }
      } else {
        exprBuilder_.mergeFrom(value);
      }
      if (expr_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public Builder clearExpr() {
      bitField0_ = (bitField0_ & ~0x00000001);
      expr_ = null;
      if (exprBuilder_ != null) {
        exprBuilder_.dispose();
        exprBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder getExprBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getExprFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getExprOrBuilder() {
      if (exprBuilder_ != null) {
        return exprBuilder_.getMessageOrBuilder();
      } else {
        return expr_ == null ?
            ai.chalk.protos.chalk.expression.v1.LogicalExprNode.getDefaultInstance() : expr_;
      }
    }
    /**
     * <code>.chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.expression.v1.LogicalExprNode, ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder, ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> 
        getExprFieldBuilder() {
      if (exprBuilder_ == null) {
        exprBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.chalk.protos.chalk.expression.v1.LogicalExprNode, ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder, ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder>(
                getExpr(),
                getParentForChildren(),
                isClean());
        expr_ = null;
      }
      return exprBuilder_;
    }

    private java.lang.Object alias_ = "";
    /**
     * <code>string alias = 2 [json_name = "alias"];</code>
     * @return The alias.
     */
    public java.lang.String getAlias() {
      java.lang.Object ref = alias_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alias_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string alias = 2 [json_name = "alias"];</code>
     * @return The bytes for alias.
     */
    public com.google.protobuf.ByteString
        getAliasBytes() {
      java.lang.Object ref = alias_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alias_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string alias = 2 [json_name = "alias"];</code>
     * @param value The alias to set.
     * @return This builder for chaining.
     */
    public Builder setAlias(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      alias_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string alias = 2 [json_name = "alias"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAlias() {
      alias_ = getDefaultInstance().getAlias();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string alias = 2 [json_name = "alias"];</code>
     * @param value The bytes for alias to set.
     * @return This builder for chaining.
     */
    public Builder setAliasBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      alias_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.util.List<ai.chalk.protos.chalk.expression.v1.OwnedTableReference> relation_ =
      java.util.Collections.emptyList();
    private void ensureRelationIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        relation_ = new java.util.ArrayList<ai.chalk.protos.chalk.expression.v1.OwnedTableReference>(relation_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        ai.chalk.protos.chalk.expression.v1.OwnedTableReference, ai.chalk.protos.chalk.expression.v1.OwnedTableReference.Builder, ai.chalk.protos.chalk.expression.v1.OwnedTableReferenceOrBuilder> relationBuilder_;

    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.expression.v1.OwnedTableReference> getRelationList() {
      if (relationBuilder_ == null) {
        return java.util.Collections.unmodifiableList(relation_);
      } else {
        return relationBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public int getRelationCount() {
      if (relationBuilder_ == null) {
        return relation_.size();
      } else {
        return relationBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.OwnedTableReference getRelation(int index) {
      if (relationBuilder_ == null) {
        return relation_.get(index);
      } else {
        return relationBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public Builder setRelation(
        int index, ai.chalk.protos.chalk.expression.v1.OwnedTableReference value) {
      if (relationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelationIsMutable();
        relation_.set(index, value);
        onChanged();
      } else {
        relationBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public Builder setRelation(
        int index, ai.chalk.protos.chalk.expression.v1.OwnedTableReference.Builder builderForValue) {
      if (relationBuilder_ == null) {
        ensureRelationIsMutable();
        relation_.set(index, builderForValue.build());
        onChanged();
      } else {
        relationBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public Builder addRelation(ai.chalk.protos.chalk.expression.v1.OwnedTableReference value) {
      if (relationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelationIsMutable();
        relation_.add(value);
        onChanged();
      } else {
        relationBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public Builder addRelation(
        int index, ai.chalk.protos.chalk.expression.v1.OwnedTableReference value) {
      if (relationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelationIsMutable();
        relation_.add(index, value);
        onChanged();
      } else {
        relationBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public Builder addRelation(
        ai.chalk.protos.chalk.expression.v1.OwnedTableReference.Builder builderForValue) {
      if (relationBuilder_ == null) {
        ensureRelationIsMutable();
        relation_.add(builderForValue.build());
        onChanged();
      } else {
        relationBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public Builder addRelation(
        int index, ai.chalk.protos.chalk.expression.v1.OwnedTableReference.Builder builderForValue) {
      if (relationBuilder_ == null) {
        ensureRelationIsMutable();
        relation_.add(index, builderForValue.build());
        onChanged();
      } else {
        relationBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public Builder addAllRelation(
        java.lang.Iterable<? extends ai.chalk.protos.chalk.expression.v1.OwnedTableReference> values) {
      if (relationBuilder_ == null) {
        ensureRelationIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, relation_);
        onChanged();
      } else {
        relationBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public Builder clearRelation() {
      if (relationBuilder_ == null) {
        relation_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        relationBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public Builder removeRelation(int index) {
      if (relationBuilder_ == null) {
        ensureRelationIsMutable();
        relation_.remove(index);
        onChanged();
      } else {
        relationBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.OwnedTableReference.Builder getRelationBuilder(
        int index) {
      return getRelationFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.OwnedTableReferenceOrBuilder getRelationOrBuilder(
        int index) {
      if (relationBuilder_ == null) {
        return relation_.get(index);  } else {
        return relationBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public java.util.List<? extends ai.chalk.protos.chalk.expression.v1.OwnedTableReferenceOrBuilder> 
         getRelationOrBuilderList() {
      if (relationBuilder_ != null) {
        return relationBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(relation_);
      }
    }
    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.OwnedTableReference.Builder addRelationBuilder() {
      return getRelationFieldBuilder().addBuilder(
          ai.chalk.protos.chalk.expression.v1.OwnedTableReference.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public ai.chalk.protos.chalk.expression.v1.OwnedTableReference.Builder addRelationBuilder(
        int index) {
      return getRelationFieldBuilder().addBuilder(
          index, ai.chalk.protos.chalk.expression.v1.OwnedTableReference.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.expression.v1.OwnedTableReference.Builder> 
         getRelationBuilderList() {
      return getRelationFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        ai.chalk.protos.chalk.expression.v1.OwnedTableReference, ai.chalk.protos.chalk.expression.v1.OwnedTableReference.Builder, ai.chalk.protos.chalk.expression.v1.OwnedTableReferenceOrBuilder> 
        getRelationFieldBuilder() {
      if (relationBuilder_ == null) {
        relationBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            ai.chalk.protos.chalk.expression.v1.OwnedTableReference, ai.chalk.protos.chalk.expression.v1.OwnedTableReference.Builder, ai.chalk.protos.chalk.expression.v1.OwnedTableReferenceOrBuilder>(
                relation_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        relation_ = null;
      }
      return relationBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:chalk.expression.v1.AliasNode)
  }

  // @@protoc_insertion_point(class_scope:chalk.expression.v1.AliasNode)
  private static final ai.chalk.protos.chalk.expression.v1.AliasNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.expression.v1.AliasNode();
  }

  public static ai.chalk.protos.chalk.expression.v1.AliasNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AliasNode>
      PARSER = new com.google.protobuf.AbstractParser<AliasNode>() {
    @java.lang.Override
    public AliasNode parsePartialFrom(
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

  public static com.google.protobuf.Parser<AliasNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AliasNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.AliasNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

