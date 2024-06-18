// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.expression.v1;

/**
 * Protobuf type {@code chalk.expression.v1.SortExprNode}
 */
public final class SortExprNode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.expression.v1.SortExprNode)
    SortExprNodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SortExprNode.newBuilder() to construct.
  private SortExprNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SortExprNode() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SortExprNode();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_SortExprNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_SortExprNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.expression.v1.SortExprNode.class, ai.chalk.protos.chalk.expression.v1.SortExprNode.Builder.class);
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

  public static final int ASC_FIELD_NUMBER = 2;
  private boolean asc_ = false;
  /**
   * <code>bool asc = 2 [json_name = "asc"];</code>
   * @return The asc.
   */
  @java.lang.Override
  public boolean getAsc() {
    return asc_;
  }

  public static final int NULLS_FIRST_FIELD_NUMBER = 3;
  private boolean nullsFirst_ = false;
  /**
   * <code>bool nulls_first = 3 [json_name = "nullsFirst"];</code>
   * @return The nullsFirst.
   */
  @java.lang.Override
  public boolean getNullsFirst() {
    return nullsFirst_;
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
    if (asc_ != false) {
      output.writeBool(2, asc_);
    }
    if (nullsFirst_ != false) {
      output.writeBool(3, nullsFirst_);
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
    if (asc_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, asc_);
    }
    if (nullsFirst_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, nullsFirst_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.expression.v1.SortExprNode)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.expression.v1.SortExprNode other = (ai.chalk.protos.chalk.expression.v1.SortExprNode) obj;

    if (hasExpr() != other.hasExpr()) return false;
    if (hasExpr()) {
      if (!getExpr()
          .equals(other.getExpr())) return false;
    }
    if (getAsc()
        != other.getAsc()) return false;
    if (getNullsFirst()
        != other.getNullsFirst()) return false;
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
    hash = (37 * hash) + ASC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAsc());
    hash = (37 * hash) + NULLS_FIRST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNullsFirst());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.expression.v1.SortExprNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.SortExprNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.SortExprNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.SortExprNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.SortExprNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.expression.v1.SortExprNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.SortExprNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.expression.v1.SortExprNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.expression.v1.SortExprNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.expression.v1.SortExprNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.expression.v1.SortExprNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.expression.v1.SortExprNode parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.expression.v1.SortExprNode prototype) {
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
   * Protobuf type {@code chalk.expression.v1.SortExprNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.expression.v1.SortExprNode)
      ai.chalk.protos.chalk.expression.v1.SortExprNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_SortExprNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_SortExprNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.expression.v1.SortExprNode.class, ai.chalk.protos.chalk.expression.v1.SortExprNode.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.expression.v1.SortExprNode.newBuilder()
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
        getExprFieldBuilder();
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
      asc_ = false;
      nullsFirst_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.expression.v1.ExpressionProto.internal_static_chalk_expression_v1_SortExprNode_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.SortExprNode getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.expression.v1.SortExprNode.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.SortExprNode build() {
      ai.chalk.protos.chalk.expression.v1.SortExprNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.expression.v1.SortExprNode buildPartial() {
      ai.chalk.protos.chalk.expression.v1.SortExprNode result = new ai.chalk.protos.chalk.expression.v1.SortExprNode(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.expression.v1.SortExprNode result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.expr_ = exprBuilder_ == null
            ? expr_
            : exprBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.asc_ = asc_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.nullsFirst_ = nullsFirst_;
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
      if (other instanceof ai.chalk.protos.chalk.expression.v1.SortExprNode) {
        return mergeFrom((ai.chalk.protos.chalk.expression.v1.SortExprNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.expression.v1.SortExprNode other) {
      if (other == ai.chalk.protos.chalk.expression.v1.SortExprNode.getDefaultInstance()) return this;
      if (other.hasExpr()) {
        mergeExpr(other.getExpr());
      }
      if (other.getAsc() != false) {
        setAsc(other.getAsc());
      }
      if (other.getNullsFirst() != false) {
        setNullsFirst(other.getNullsFirst());
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
            case 16: {
              asc_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              nullsFirst_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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
    private com.google.protobuf.SingleFieldBuilderV3<
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
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.expression.v1.LogicalExprNode, ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder, ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> 
        getExprFieldBuilder() {
      if (exprBuilder_ == null) {
        exprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.expression.v1.LogicalExprNode, ai.chalk.protos.chalk.expression.v1.LogicalExprNode.Builder, ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder>(
                getExpr(),
                getParentForChildren(),
                isClean());
        expr_ = null;
      }
      return exprBuilder_;
    }

    private boolean asc_ ;
    /**
     * <code>bool asc = 2 [json_name = "asc"];</code>
     * @return The asc.
     */
    @java.lang.Override
    public boolean getAsc() {
      return asc_;
    }
    /**
     * <code>bool asc = 2 [json_name = "asc"];</code>
     * @param value The asc to set.
     * @return This builder for chaining.
     */
    public Builder setAsc(boolean value) {

      asc_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool asc = 2 [json_name = "asc"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAsc() {
      bitField0_ = (bitField0_ & ~0x00000002);
      asc_ = false;
      onChanged();
      return this;
    }

    private boolean nullsFirst_ ;
    /**
     * <code>bool nulls_first = 3 [json_name = "nullsFirst"];</code>
     * @return The nullsFirst.
     */
    @java.lang.Override
    public boolean getNullsFirst() {
      return nullsFirst_;
    }
    /**
     * <code>bool nulls_first = 3 [json_name = "nullsFirst"];</code>
     * @param value The nullsFirst to set.
     * @return This builder for chaining.
     */
    public Builder setNullsFirst(boolean value) {

      nullsFirst_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool nulls_first = 3 [json_name = "nullsFirst"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNullsFirst() {
      bitField0_ = (bitField0_ & ~0x00000004);
      nullsFirst_ = false;
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


    // @@protoc_insertion_point(builder_scope:chalk.expression.v1.SortExprNode)
  }

  // @@protoc_insertion_point(class_scope:chalk.expression.v1.SortExprNode)
  private static final ai.chalk.protos.chalk.expression.v1.SortExprNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.expression.v1.SortExprNode();
  }

  public static ai.chalk.protos.chalk.expression.v1.SortExprNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SortExprNode>
      PARSER = new com.google.protobuf.AbstractParser<SortExprNode>() {
    @java.lang.Override
    public SortExprNode parsePartialFrom(
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

  public static com.google.protobuf.Parser<SortExprNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SortExprNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.expression.v1.SortExprNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

