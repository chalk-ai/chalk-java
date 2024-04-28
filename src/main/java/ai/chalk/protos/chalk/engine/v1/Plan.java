// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v1/plan.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.engine.v1;

/**
 * Protobuf type {@code chalk.engine.v1.Plan}
 */
public final class Plan extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.engine.v1.Plan)
    PlanOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      Plan.class.getName());
  }
  // Use Plan.newBuilder() to construct.
  private Plan(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Plan() {
    nodes_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_Plan_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_Plan_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.engine.v1.Plan.class, ai.chalk.protos.chalk.engine.v1.Plan.Builder.class);
  }

  private int bitField0_;
  public static final int NODES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<ai.chalk.protos.chalk.engine.v1.Node> nodes_;
  /**
   * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.chalk.protos.chalk.engine.v1.Node> getNodesList() {
    return nodes_;
  }
  /**
   * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.chalk.protos.chalk.engine.v1.NodeOrBuilder> 
      getNodesOrBuilderList() {
    return nodes_;
  }
  /**
   * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
   */
  @java.lang.Override
  public int getNodesCount() {
    return nodes_.size();
  }
  /**
   * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.Node getNodes(int index) {
    return nodes_.get(index);
  }
  /**
   * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.NodeOrBuilder getNodesOrBuilder(
      int index) {
    return nodes_.get(index);
  }

  public static final int ROOT_NODE_IDX_FIELD_NUMBER = 2;
  private int rootNodeIdx_ = 0;
  /**
   * <code>uint32 root_node_idx = 2 [json_name = "rootNodeIdx"];</code>
   * @return The rootNodeIdx.
   */
  @java.lang.Override
  public int getRootNodeIdx() {
    return rootNodeIdx_;
  }

  public static final int PYARROW_SCHEMA_FIELD_NUMBER = 3;
  private ai.chalk.protos.chalk.engine.v1.PyArrowSchema pyarrowSchema_;
  /**
   * <code>.chalk.engine.v1.PyArrowSchema pyarrow_schema = 3 [json_name = "pyarrowSchema"];</code>
   * @return Whether the pyarrowSchema field is set.
   */
  @java.lang.Override
  public boolean hasPyarrowSchema() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.engine.v1.PyArrowSchema pyarrow_schema = 3 [json_name = "pyarrowSchema"];</code>
   * @return The pyarrowSchema.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.PyArrowSchema getPyarrowSchema() {
    return pyarrowSchema_ == null ? ai.chalk.protos.chalk.engine.v1.PyArrowSchema.getDefaultInstance() : pyarrowSchema_;
  }
  /**
   * <code>.chalk.engine.v1.PyArrowSchema pyarrow_schema = 3 [json_name = "pyarrowSchema"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.PyArrowSchemaOrBuilder getPyarrowSchemaOrBuilder() {
    return pyarrowSchema_ == null ? ai.chalk.protos.chalk.engine.v1.PyArrowSchema.getDefaultInstance() : pyarrowSchema_;
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
    for (int i = 0; i < nodes_.size(); i++) {
      output.writeMessage(1, nodes_.get(i));
    }
    if (rootNodeIdx_ != 0) {
      output.writeUInt32(2, rootNodeIdx_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getPyarrowSchema());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < nodes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, nodes_.get(i));
    }
    if (rootNodeIdx_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, rootNodeIdx_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPyarrowSchema());
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
    if (!(obj instanceof ai.chalk.protos.chalk.engine.v1.Plan)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.engine.v1.Plan other = (ai.chalk.protos.chalk.engine.v1.Plan) obj;

    if (!getNodesList()
        .equals(other.getNodesList())) return false;
    if (getRootNodeIdx()
        != other.getRootNodeIdx()) return false;
    if (hasPyarrowSchema() != other.hasPyarrowSchema()) return false;
    if (hasPyarrowSchema()) {
      if (!getPyarrowSchema()
          .equals(other.getPyarrowSchema())) return false;
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
    if (getNodesCount() > 0) {
      hash = (37 * hash) + NODES_FIELD_NUMBER;
      hash = (53 * hash) + getNodesList().hashCode();
    }
    hash = (37 * hash) + ROOT_NODE_IDX_FIELD_NUMBER;
    hash = (53 * hash) + getRootNodeIdx();
    if (hasPyarrowSchema()) {
      hash = (37 * hash) + PYARROW_SCHEMA_FIELD_NUMBER;
      hash = (53 * hash) + getPyarrowSchema().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.engine.v1.Plan parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.Plan parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.Plan parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.Plan parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.Plan parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.Plan parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.Plan parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.engine.v1.Plan parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.engine.v1.Plan parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.engine.v1.Plan parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.Plan parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.engine.v1.Plan parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.engine.v1.Plan prototype) {
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
   * Protobuf type {@code chalk.engine.v1.Plan}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.engine.v1.Plan)
      ai.chalk.protos.chalk.engine.v1.PlanOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_Plan_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_Plan_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.engine.v1.Plan.class, ai.chalk.protos.chalk.engine.v1.Plan.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.engine.v1.Plan.newBuilder()
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
        getNodesFieldBuilder();
        getPyarrowSchemaFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (nodesBuilder_ == null) {
        nodes_ = java.util.Collections.emptyList();
      } else {
        nodes_ = null;
        nodesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      rootNodeIdx_ = 0;
      pyarrowSchema_ = null;
      if (pyarrowSchemaBuilder_ != null) {
        pyarrowSchemaBuilder_.dispose();
        pyarrowSchemaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_Plan_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.Plan getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.engine.v1.Plan.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.Plan build() {
      ai.chalk.protos.chalk.engine.v1.Plan result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.Plan buildPartial() {
      ai.chalk.protos.chalk.engine.v1.Plan result = new ai.chalk.protos.chalk.engine.v1.Plan(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.chalk.protos.chalk.engine.v1.Plan result) {
      if (nodesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nodes_ = java.util.Collections.unmodifiableList(nodes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nodes_ = nodes_;
      } else {
        result.nodes_ = nodesBuilder_.build();
      }
    }

    private void buildPartial0(ai.chalk.protos.chalk.engine.v1.Plan result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rootNodeIdx_ = rootNodeIdx_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pyarrowSchema_ = pyarrowSchemaBuilder_ == null
            ? pyarrowSchema_
            : pyarrowSchemaBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.engine.v1.Plan) {
        return mergeFrom((ai.chalk.protos.chalk.engine.v1.Plan)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.engine.v1.Plan other) {
      if (other == ai.chalk.protos.chalk.engine.v1.Plan.getDefaultInstance()) return this;
      if (nodesBuilder_ == null) {
        if (!other.nodes_.isEmpty()) {
          if (nodes_.isEmpty()) {
            nodes_ = other.nodes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNodesIsMutable();
            nodes_.addAll(other.nodes_);
          }
          onChanged();
        }
      } else {
        if (!other.nodes_.isEmpty()) {
          if (nodesBuilder_.isEmpty()) {
            nodesBuilder_.dispose();
            nodesBuilder_ = null;
            nodes_ = other.nodes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nodesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getNodesFieldBuilder() : null;
          } else {
            nodesBuilder_.addAllMessages(other.nodes_);
          }
        }
      }
      if (other.getRootNodeIdx() != 0) {
        setRootNodeIdx(other.getRootNodeIdx());
      }
      if (other.hasPyarrowSchema()) {
        mergePyarrowSchema(other.getPyarrowSchema());
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
              ai.chalk.protos.chalk.engine.v1.Node m =
                  input.readMessage(
                      ai.chalk.protos.chalk.engine.v1.Node.parser(),
                      extensionRegistry);
              if (nodesBuilder_ == null) {
                ensureNodesIsMutable();
                nodes_.add(m);
              } else {
                nodesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 16: {
              rootNodeIdx_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getPyarrowSchemaFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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

    private java.util.List<ai.chalk.protos.chalk.engine.v1.Node> nodes_ =
      java.util.Collections.emptyList();
    private void ensureNodesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nodes_ = new java.util.ArrayList<ai.chalk.protos.chalk.engine.v1.Node>(nodes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        ai.chalk.protos.chalk.engine.v1.Node, ai.chalk.protos.chalk.engine.v1.Node.Builder, ai.chalk.protos.chalk.engine.v1.NodeOrBuilder> nodesBuilder_;

    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.engine.v1.Node> getNodesList() {
      if (nodesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nodes_);
      } else {
        return nodesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public int getNodesCount() {
      if (nodesBuilder_ == null) {
        return nodes_.size();
      } else {
        return nodesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public ai.chalk.protos.chalk.engine.v1.Node getNodes(int index) {
      if (nodesBuilder_ == null) {
        return nodes_.get(index);
      } else {
        return nodesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public Builder setNodes(
        int index, ai.chalk.protos.chalk.engine.v1.Node value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.set(index, value);
        onChanged();
      } else {
        nodesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public Builder setNodes(
        int index, ai.chalk.protos.chalk.engine.v1.Node.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.set(index, builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public Builder addNodes(ai.chalk.protos.chalk.engine.v1.Node value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.add(value);
        onChanged();
      } else {
        nodesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public Builder addNodes(
        int index, ai.chalk.protos.chalk.engine.v1.Node value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.add(index, value);
        onChanged();
      } else {
        nodesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public Builder addNodes(
        ai.chalk.protos.chalk.engine.v1.Node.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.add(builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public Builder addNodes(
        int index, ai.chalk.protos.chalk.engine.v1.Node.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.add(index, builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public Builder addAllNodes(
        java.lang.Iterable<? extends ai.chalk.protos.chalk.engine.v1.Node> values) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nodes_);
        onChanged();
      } else {
        nodesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public Builder clearNodes() {
      if (nodesBuilder_ == null) {
        nodes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nodesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public Builder removeNodes(int index) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.remove(index);
        onChanged();
      } else {
        nodesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public ai.chalk.protos.chalk.engine.v1.Node.Builder getNodesBuilder(
        int index) {
      return getNodesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public ai.chalk.protos.chalk.engine.v1.NodeOrBuilder getNodesOrBuilder(
        int index) {
      if (nodesBuilder_ == null) {
        return nodes_.get(index);  } else {
        return nodesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public java.util.List<? extends ai.chalk.protos.chalk.engine.v1.NodeOrBuilder> 
         getNodesOrBuilderList() {
      if (nodesBuilder_ != null) {
        return nodesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nodes_);
      }
    }
    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public ai.chalk.protos.chalk.engine.v1.Node.Builder addNodesBuilder() {
      return getNodesFieldBuilder().addBuilder(
          ai.chalk.protos.chalk.engine.v1.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public ai.chalk.protos.chalk.engine.v1.Node.Builder addNodesBuilder(
        int index) {
      return getNodesFieldBuilder().addBuilder(
          index, ai.chalk.protos.chalk.engine.v1.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.engine.v1.Node.Builder> 
         getNodesBuilderList() {
      return getNodesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        ai.chalk.protos.chalk.engine.v1.Node, ai.chalk.protos.chalk.engine.v1.Node.Builder, ai.chalk.protos.chalk.engine.v1.NodeOrBuilder> 
        getNodesFieldBuilder() {
      if (nodesBuilder_ == null) {
        nodesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            ai.chalk.protos.chalk.engine.v1.Node, ai.chalk.protos.chalk.engine.v1.Node.Builder, ai.chalk.protos.chalk.engine.v1.NodeOrBuilder>(
                nodes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        nodes_ = null;
      }
      return nodesBuilder_;
    }

    private int rootNodeIdx_ ;
    /**
     * <code>uint32 root_node_idx = 2 [json_name = "rootNodeIdx"];</code>
     * @return The rootNodeIdx.
     */
    @java.lang.Override
    public int getRootNodeIdx() {
      return rootNodeIdx_;
    }
    /**
     * <code>uint32 root_node_idx = 2 [json_name = "rootNodeIdx"];</code>
     * @param value The rootNodeIdx to set.
     * @return This builder for chaining.
     */
    public Builder setRootNodeIdx(int value) {

      rootNodeIdx_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 root_node_idx = 2 [json_name = "rootNodeIdx"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRootNodeIdx() {
      bitField0_ = (bitField0_ & ~0x00000002);
      rootNodeIdx_ = 0;
      onChanged();
      return this;
    }

    private ai.chalk.protos.chalk.engine.v1.PyArrowSchema pyarrowSchema_;
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.engine.v1.PyArrowSchema, ai.chalk.protos.chalk.engine.v1.PyArrowSchema.Builder, ai.chalk.protos.chalk.engine.v1.PyArrowSchemaOrBuilder> pyarrowSchemaBuilder_;
    /**
     * <code>.chalk.engine.v1.PyArrowSchema pyarrow_schema = 3 [json_name = "pyarrowSchema"];</code>
     * @return Whether the pyarrowSchema field is set.
     */
    public boolean hasPyarrowSchema() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.chalk.engine.v1.PyArrowSchema pyarrow_schema = 3 [json_name = "pyarrowSchema"];</code>
     * @return The pyarrowSchema.
     */
    public ai.chalk.protos.chalk.engine.v1.PyArrowSchema getPyarrowSchema() {
      if (pyarrowSchemaBuilder_ == null) {
        return pyarrowSchema_ == null ? ai.chalk.protos.chalk.engine.v1.PyArrowSchema.getDefaultInstance() : pyarrowSchema_;
      } else {
        return pyarrowSchemaBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.engine.v1.PyArrowSchema pyarrow_schema = 3 [json_name = "pyarrowSchema"];</code>
     */
    public Builder setPyarrowSchema(ai.chalk.protos.chalk.engine.v1.PyArrowSchema value) {
      if (pyarrowSchemaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pyarrowSchema_ = value;
      } else {
        pyarrowSchemaBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.engine.v1.PyArrowSchema pyarrow_schema = 3 [json_name = "pyarrowSchema"];</code>
     */
    public Builder setPyarrowSchema(
        ai.chalk.protos.chalk.engine.v1.PyArrowSchema.Builder builderForValue) {
      if (pyarrowSchemaBuilder_ == null) {
        pyarrowSchema_ = builderForValue.build();
      } else {
        pyarrowSchemaBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.engine.v1.PyArrowSchema pyarrow_schema = 3 [json_name = "pyarrowSchema"];</code>
     */
    public Builder mergePyarrowSchema(ai.chalk.protos.chalk.engine.v1.PyArrowSchema value) {
      if (pyarrowSchemaBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          pyarrowSchema_ != null &&
          pyarrowSchema_ != ai.chalk.protos.chalk.engine.v1.PyArrowSchema.getDefaultInstance()) {
          getPyarrowSchemaBuilder().mergeFrom(value);
        } else {
          pyarrowSchema_ = value;
        }
      } else {
        pyarrowSchemaBuilder_.mergeFrom(value);
      }
      if (pyarrowSchema_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.engine.v1.PyArrowSchema pyarrow_schema = 3 [json_name = "pyarrowSchema"];</code>
     */
    public Builder clearPyarrowSchema() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pyarrowSchema_ = null;
      if (pyarrowSchemaBuilder_ != null) {
        pyarrowSchemaBuilder_.dispose();
        pyarrowSchemaBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.engine.v1.PyArrowSchema pyarrow_schema = 3 [json_name = "pyarrowSchema"];</code>
     */
    public ai.chalk.protos.chalk.engine.v1.PyArrowSchema.Builder getPyarrowSchemaBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPyarrowSchemaFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.engine.v1.PyArrowSchema pyarrow_schema = 3 [json_name = "pyarrowSchema"];</code>
     */
    public ai.chalk.protos.chalk.engine.v1.PyArrowSchemaOrBuilder getPyarrowSchemaOrBuilder() {
      if (pyarrowSchemaBuilder_ != null) {
        return pyarrowSchemaBuilder_.getMessageOrBuilder();
      } else {
        return pyarrowSchema_ == null ?
            ai.chalk.protos.chalk.engine.v1.PyArrowSchema.getDefaultInstance() : pyarrowSchema_;
      }
    }
    /**
     * <code>.chalk.engine.v1.PyArrowSchema pyarrow_schema = 3 [json_name = "pyarrowSchema"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.engine.v1.PyArrowSchema, ai.chalk.protos.chalk.engine.v1.PyArrowSchema.Builder, ai.chalk.protos.chalk.engine.v1.PyArrowSchemaOrBuilder> 
        getPyarrowSchemaFieldBuilder() {
      if (pyarrowSchemaBuilder_ == null) {
        pyarrowSchemaBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.chalk.protos.chalk.engine.v1.PyArrowSchema, ai.chalk.protos.chalk.engine.v1.PyArrowSchema.Builder, ai.chalk.protos.chalk.engine.v1.PyArrowSchemaOrBuilder>(
                getPyarrowSchema(),
                getParentForChildren(),
                isClean());
        pyarrowSchema_ = null;
      }
      return pyarrowSchemaBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:chalk.engine.v1.Plan)
  }

  // @@protoc_insertion_point(class_scope:chalk.engine.v1.Plan)
  private static final ai.chalk.protos.chalk.engine.v1.Plan DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.engine.v1.Plan();
  }

  public static ai.chalk.protos.chalk.engine.v1.Plan getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Plan>
      PARSER = new com.google.protobuf.AbstractParser<Plan>() {
    @java.lang.Override
    public Plan parsePartialFrom(
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

  public static com.google.protobuf.Parser<Plan> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Plan> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.Plan getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

