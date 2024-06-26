// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v1/plan.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.engine.v1;

/**
 * Protobuf type {@code chalk.engine.v1.Node}
 */
public final class Node extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.engine.v1.Node)
    NodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Node.newBuilder() to construct.
  private Node(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Node() {
    childrenIndices_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Node();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_Node_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_Node_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.engine.v1.Node.class, ai.chalk.protos.chalk.engine.v1.Node.Builder.class);
  }

  private int bitField0_;
  public static final int CHILDREN_INDICES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList childrenIndices_ =
      emptyIntList();
  /**
   * <pre>
   * Corresponds to indices in Plan.nodes
   * </pre>
   *
   * <code>repeated uint32 children_indices = 1 [json_name = "childrenIndices"];</code>
   * @return A list containing the childrenIndices.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getChildrenIndicesList() {
    return childrenIndices_;
  }
  /**
   * <pre>
   * Corresponds to indices in Plan.nodes
   * </pre>
   *
   * <code>repeated uint32 children_indices = 1 [json_name = "childrenIndices"];</code>
   * @return The count of childrenIndices.
   */
  public int getChildrenIndicesCount() {
    return childrenIndices_.size();
  }
  /**
   * <pre>
   * Corresponds to indices in Plan.nodes
   * </pre>
   *
   * <code>repeated uint32 children_indices = 1 [json_name = "childrenIndices"];</code>
   * @param index The index of the element to return.
   * @return The childrenIndices at the given index.
   */
  public int getChildrenIndices(int index) {
    return childrenIndices_.getInt(index);
  }
  private int childrenIndicesMemoizedSerializedSize = -1;

  public static final int IMPL_FIELD_NUMBER = 2;
  private ai.chalk.protos.chalk.engine.v1.NodeImpl impl_;
  /**
   * <code>.chalk.engine.v1.NodeImpl impl = 2 [json_name = "impl"];</code>
   * @return Whether the impl field is set.
   */
  @java.lang.Override
  public boolean hasImpl() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.engine.v1.NodeImpl impl = 2 [json_name = "impl"];</code>
   * @return The impl.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.NodeImpl getImpl() {
    return impl_ == null ? ai.chalk.protos.chalk.engine.v1.NodeImpl.getDefaultInstance() : impl_;
  }
  /**
   * <code>.chalk.engine.v1.NodeImpl impl = 2 [json_name = "impl"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.NodeImplOrBuilder getImplOrBuilder() {
    return impl_ == null ? ai.chalk.protos.chalk.engine.v1.NodeImpl.getDefaultInstance() : impl_;
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
    getSerializedSize();
    if (getChildrenIndicesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(childrenIndicesMemoizedSerializedSize);
    }
    for (int i = 0; i < childrenIndices_.size(); i++) {
      output.writeUInt32NoTag(childrenIndices_.getInt(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getImpl());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < childrenIndices_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(childrenIndices_.getInt(i));
      }
      size += dataSize;
      if (!getChildrenIndicesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      childrenIndicesMemoizedSerializedSize = dataSize;
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getImpl());
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
    if (!(obj instanceof ai.chalk.protos.chalk.engine.v1.Node)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.engine.v1.Node other = (ai.chalk.protos.chalk.engine.v1.Node) obj;

    if (!getChildrenIndicesList()
        .equals(other.getChildrenIndicesList())) return false;
    if (hasImpl() != other.hasImpl()) return false;
    if (hasImpl()) {
      if (!getImpl()
          .equals(other.getImpl())) return false;
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
    if (getChildrenIndicesCount() > 0) {
      hash = (37 * hash) + CHILDREN_INDICES_FIELD_NUMBER;
      hash = (53 * hash) + getChildrenIndicesList().hashCode();
    }
    if (hasImpl()) {
      hash = (37 * hash) + IMPL_FIELD_NUMBER;
      hash = (53 * hash) + getImpl().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.engine.v1.Node parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.Node parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.Node parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.Node parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.Node parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.Node parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.Node parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.engine.v1.Node parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.engine.v1.Node parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.engine.v1.Node parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.Node parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.engine.v1.Node parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.engine.v1.Node prototype) {
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
   * Protobuf type {@code chalk.engine.v1.Node}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.engine.v1.Node)
      ai.chalk.protos.chalk.engine.v1.NodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_Node_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_Node_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.engine.v1.Node.class, ai.chalk.protos.chalk.engine.v1.Node.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.engine.v1.Node.newBuilder()
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
        getImplFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      childrenIndices_ = emptyIntList();
      impl_ = null;
      if (implBuilder_ != null) {
        implBuilder_.dispose();
        implBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_Node_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.Node getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.engine.v1.Node.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.Node build() {
      ai.chalk.protos.chalk.engine.v1.Node result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.Node buildPartial() {
      ai.chalk.protos.chalk.engine.v1.Node result = new ai.chalk.protos.chalk.engine.v1.Node(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.engine.v1.Node result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        childrenIndices_.makeImmutable();
        result.childrenIndices_ = childrenIndices_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.impl_ = implBuilder_ == null
            ? impl_
            : implBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.engine.v1.Node) {
        return mergeFrom((ai.chalk.protos.chalk.engine.v1.Node)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.engine.v1.Node other) {
      if (other == ai.chalk.protos.chalk.engine.v1.Node.getDefaultInstance()) return this;
      if (!other.childrenIndices_.isEmpty()) {
        if (childrenIndices_.isEmpty()) {
          childrenIndices_ = other.childrenIndices_;
          childrenIndices_.makeImmutable();
          bitField0_ |= 0x00000001;
        } else {
          ensureChildrenIndicesIsMutable();
          childrenIndices_.addAll(other.childrenIndices_);
        }
        onChanged();
      }
      if (other.hasImpl()) {
        mergeImpl(other.getImpl());
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
              int v = input.readUInt32();
              ensureChildrenIndicesIsMutable();
              childrenIndices_.addInt(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureChildrenIndicesIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                childrenIndices_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getImplFieldBuilder().getBuilder(),
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

    private com.google.protobuf.Internal.IntList childrenIndices_ = emptyIntList();
    private void ensureChildrenIndicesIsMutable() {
      if (!childrenIndices_.isModifiable()) {
        childrenIndices_ = makeMutableCopy(childrenIndices_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * Corresponds to indices in Plan.nodes
     * </pre>
     *
     * <code>repeated uint32 children_indices = 1 [json_name = "childrenIndices"];</code>
     * @return A list containing the childrenIndices.
     */
    public java.util.List<java.lang.Integer>
        getChildrenIndicesList() {
      childrenIndices_.makeImmutable();
      return childrenIndices_;
    }
    /**
     * <pre>
     * Corresponds to indices in Plan.nodes
     * </pre>
     *
     * <code>repeated uint32 children_indices = 1 [json_name = "childrenIndices"];</code>
     * @return The count of childrenIndices.
     */
    public int getChildrenIndicesCount() {
      return childrenIndices_.size();
    }
    /**
     * <pre>
     * Corresponds to indices in Plan.nodes
     * </pre>
     *
     * <code>repeated uint32 children_indices = 1 [json_name = "childrenIndices"];</code>
     * @param index The index of the element to return.
     * @return The childrenIndices at the given index.
     */
    public int getChildrenIndices(int index) {
      return childrenIndices_.getInt(index);
    }
    /**
     * <pre>
     * Corresponds to indices in Plan.nodes
     * </pre>
     *
     * <code>repeated uint32 children_indices = 1 [json_name = "childrenIndices"];</code>
     * @param index The index to set the value at.
     * @param value The childrenIndices to set.
     * @return This builder for chaining.
     */
    public Builder setChildrenIndices(
        int index, int value) {

      ensureChildrenIndicesIsMutable();
      childrenIndices_.setInt(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Corresponds to indices in Plan.nodes
     * </pre>
     *
     * <code>repeated uint32 children_indices = 1 [json_name = "childrenIndices"];</code>
     * @param value The childrenIndices to add.
     * @return This builder for chaining.
     */
    public Builder addChildrenIndices(int value) {

      ensureChildrenIndicesIsMutable();
      childrenIndices_.addInt(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Corresponds to indices in Plan.nodes
     * </pre>
     *
     * <code>repeated uint32 children_indices = 1 [json_name = "childrenIndices"];</code>
     * @param values The childrenIndices to add.
     * @return This builder for chaining.
     */
    public Builder addAllChildrenIndices(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureChildrenIndicesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, childrenIndices_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Corresponds to indices in Plan.nodes
     * </pre>
     *
     * <code>repeated uint32 children_indices = 1 [json_name = "childrenIndices"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChildrenIndices() {
      childrenIndices_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private ai.chalk.protos.chalk.engine.v1.NodeImpl impl_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.engine.v1.NodeImpl, ai.chalk.protos.chalk.engine.v1.NodeImpl.Builder, ai.chalk.protos.chalk.engine.v1.NodeImplOrBuilder> implBuilder_;
    /**
     * <code>.chalk.engine.v1.NodeImpl impl = 2 [json_name = "impl"];</code>
     * @return Whether the impl field is set.
     */
    public boolean hasImpl() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.chalk.engine.v1.NodeImpl impl = 2 [json_name = "impl"];</code>
     * @return The impl.
     */
    public ai.chalk.protos.chalk.engine.v1.NodeImpl getImpl() {
      if (implBuilder_ == null) {
        return impl_ == null ? ai.chalk.protos.chalk.engine.v1.NodeImpl.getDefaultInstance() : impl_;
      } else {
        return implBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.engine.v1.NodeImpl impl = 2 [json_name = "impl"];</code>
     */
    public Builder setImpl(ai.chalk.protos.chalk.engine.v1.NodeImpl value) {
      if (implBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        impl_ = value;
      } else {
        implBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.engine.v1.NodeImpl impl = 2 [json_name = "impl"];</code>
     */
    public Builder setImpl(
        ai.chalk.protos.chalk.engine.v1.NodeImpl.Builder builderForValue) {
      if (implBuilder_ == null) {
        impl_ = builderForValue.build();
      } else {
        implBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.engine.v1.NodeImpl impl = 2 [json_name = "impl"];</code>
     */
    public Builder mergeImpl(ai.chalk.protos.chalk.engine.v1.NodeImpl value) {
      if (implBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          impl_ != null &&
          impl_ != ai.chalk.protos.chalk.engine.v1.NodeImpl.getDefaultInstance()) {
          getImplBuilder().mergeFrom(value);
        } else {
          impl_ = value;
        }
      } else {
        implBuilder_.mergeFrom(value);
      }
      if (impl_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.engine.v1.NodeImpl impl = 2 [json_name = "impl"];</code>
     */
    public Builder clearImpl() {
      bitField0_ = (bitField0_ & ~0x00000002);
      impl_ = null;
      if (implBuilder_ != null) {
        implBuilder_.dispose();
        implBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.engine.v1.NodeImpl impl = 2 [json_name = "impl"];</code>
     */
    public ai.chalk.protos.chalk.engine.v1.NodeImpl.Builder getImplBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getImplFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.engine.v1.NodeImpl impl = 2 [json_name = "impl"];</code>
     */
    public ai.chalk.protos.chalk.engine.v1.NodeImplOrBuilder getImplOrBuilder() {
      if (implBuilder_ != null) {
        return implBuilder_.getMessageOrBuilder();
      } else {
        return impl_ == null ?
            ai.chalk.protos.chalk.engine.v1.NodeImpl.getDefaultInstance() : impl_;
      }
    }
    /**
     * <code>.chalk.engine.v1.NodeImpl impl = 2 [json_name = "impl"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.engine.v1.NodeImpl, ai.chalk.protos.chalk.engine.v1.NodeImpl.Builder, ai.chalk.protos.chalk.engine.v1.NodeImplOrBuilder> 
        getImplFieldBuilder() {
      if (implBuilder_ == null) {
        implBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.engine.v1.NodeImpl, ai.chalk.protos.chalk.engine.v1.NodeImpl.Builder, ai.chalk.protos.chalk.engine.v1.NodeImplOrBuilder>(
                getImpl(),
                getParentForChildren(),
                isClean());
        impl_ = null;
      }
      return implBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.engine.v1.Node)
  }

  // @@protoc_insertion_point(class_scope:chalk.engine.v1.Node)
  private static final ai.chalk.protos.chalk.engine.v1.Node DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.engine.v1.Node();
  }

  public static ai.chalk.protos.chalk.engine.v1.Node getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Node>
      PARSER = new com.google.protobuf.AbstractParser<Node>() {
    @java.lang.Override
    public Node parsePartialFrom(
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

  public static com.google.protobuf.Parser<Node> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Node> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.Node getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

