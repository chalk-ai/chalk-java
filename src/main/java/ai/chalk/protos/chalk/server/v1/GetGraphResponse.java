// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/graph.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.GetGraphResponse}
 */
public final class GetGraphResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.GetGraphResponse)
    GetGraphResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      GetGraphResponse.class.getName());
  }
  // Use GetGraphResponse.newBuilder() to construct.
  private GetGraphResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetGraphResponse() {
    chalkpyVersion_ = "";
    tag_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.GraphProto.internal_static_chalk_server_v1_GetGraphResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.GraphProto.internal_static_chalk_server_v1_GetGraphResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.GetGraphResponse.class, ai.chalk.protos.chalk.server.v1.GetGraphResponse.Builder.class);
  }

  private int bitField0_;
  public static final int GRAPH_FIELD_NUMBER = 1;
  private ai.chalk.protos.chalk.graph.v1.Graph graph_;
  /**
   * <code>.chalk.graph.v1.Graph graph = 1 [json_name = "graph"];</code>
   * @return Whether the graph field is set.
   */
  @java.lang.Override
  public boolean hasGraph() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.graph.v1.Graph graph = 1 [json_name = "graph"];</code>
   * @return The graph.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.Graph getGraph() {
    return graph_ == null ? ai.chalk.protos.chalk.graph.v1.Graph.getDefaultInstance() : graph_;
  }
  /**
   * <code>.chalk.graph.v1.Graph graph = 1 [json_name = "graph"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.GraphOrBuilder getGraphOrBuilder() {
    return graph_ == null ? ai.chalk.protos.chalk.graph.v1.Graph.getDefaultInstance() : graph_;
  }

  public static final int CHALKPY_VERSION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object chalkpyVersion_ = "";
  /**
   * <code>string chalkpy_version = 2 [json_name = "chalkpyVersion"];</code>
   * @return The chalkpyVersion.
   */
  @java.lang.Override
  public java.lang.String getChalkpyVersion() {
    java.lang.Object ref = chalkpyVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      chalkpyVersion_ = s;
      return s;
    }
  }
  /**
   * <code>string chalkpy_version = 2 [json_name = "chalkpyVersion"];</code>
   * @return The bytes for chalkpyVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChalkpyVersionBytes() {
    java.lang.Object ref = chalkpyVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      chalkpyVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAG_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object tag_ = "";
  /**
   * <code>optional string tag = 3 [json_name = "tag"];</code>
   * @return Whether the tag field is set.
   */
  @java.lang.Override
  public boolean hasTag() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string tag = 3 [json_name = "tag"];</code>
   * @return The tag.
   */
  @java.lang.Override
  public java.lang.String getTag() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tag_ = s;
      return s;
    }
  }
  /**
   * <code>optional string tag = 3 [json_name = "tag"];</code>
   * @return The bytes for tag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTagBytes() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tag_ = b;
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
      output.writeMessage(1, getGraph());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(chalkpyVersion_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, chalkpyVersion_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, tag_);
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
        .computeMessageSize(1, getGraph());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(chalkpyVersion_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, chalkpyVersion_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, tag_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.GetGraphResponse)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.GetGraphResponse other = (ai.chalk.protos.chalk.server.v1.GetGraphResponse) obj;

    if (hasGraph() != other.hasGraph()) return false;
    if (hasGraph()) {
      if (!getGraph()
          .equals(other.getGraph())) return false;
    }
    if (!getChalkpyVersion()
        .equals(other.getChalkpyVersion())) return false;
    if (hasTag() != other.hasTag()) return false;
    if (hasTag()) {
      if (!getTag()
          .equals(other.getTag())) return false;
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
    if (hasGraph()) {
      hash = (37 * hash) + GRAPH_FIELD_NUMBER;
      hash = (53 * hash) + getGraph().hashCode();
    }
    hash = (37 * hash) + CHALKPY_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getChalkpyVersion().hashCode();
    if (hasTag()) {
      hash = (37 * hash) + TAG_FIELD_NUMBER;
      hash = (53 * hash) + getTag().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.GetGraphResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetGraphResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetGraphResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetGraphResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetGraphResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetGraphResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetGraphResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetGraphResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.GetGraphResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.GetGraphResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetGraphResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetGraphResponse parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.GetGraphResponse prototype) {
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
   * Protobuf type {@code chalk.server.v1.GetGraphResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.GetGraphResponse)
      ai.chalk.protos.chalk.server.v1.GetGraphResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.GraphProto.internal_static_chalk_server_v1_GetGraphResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.GraphProto.internal_static_chalk_server_v1_GetGraphResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.GetGraphResponse.class, ai.chalk.protos.chalk.server.v1.GetGraphResponse.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.GetGraphResponse.newBuilder()
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
        getGraphFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      graph_ = null;
      if (graphBuilder_ != null) {
        graphBuilder_.dispose();
        graphBuilder_ = null;
      }
      chalkpyVersion_ = "";
      tag_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.GraphProto.internal_static_chalk_server_v1_GetGraphResponse_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetGraphResponse getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.GetGraphResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetGraphResponse build() {
      ai.chalk.protos.chalk.server.v1.GetGraphResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetGraphResponse buildPartial() {
      ai.chalk.protos.chalk.server.v1.GetGraphResponse result = new ai.chalk.protos.chalk.server.v1.GetGraphResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.GetGraphResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.graph_ = graphBuilder_ == null
            ? graph_
            : graphBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.chalkpyVersion_ = chalkpyVersion_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.tag_ = tag_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.server.v1.GetGraphResponse) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.GetGraphResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.GetGraphResponse other) {
      if (other == ai.chalk.protos.chalk.server.v1.GetGraphResponse.getDefaultInstance()) return this;
      if (other.hasGraph()) {
        mergeGraph(other.getGraph());
      }
      if (!other.getChalkpyVersion().isEmpty()) {
        chalkpyVersion_ = other.chalkpyVersion_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasTag()) {
        tag_ = other.tag_;
        bitField0_ |= 0x00000004;
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
                  getGraphFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              chalkpyVersion_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              tag_ = input.readStringRequireUtf8();
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

    private ai.chalk.protos.chalk.graph.v1.Graph graph_;
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.graph.v1.Graph, ai.chalk.protos.chalk.graph.v1.Graph.Builder, ai.chalk.protos.chalk.graph.v1.GraphOrBuilder> graphBuilder_;
    /**
     * <code>.chalk.graph.v1.Graph graph = 1 [json_name = "graph"];</code>
     * @return Whether the graph field is set.
     */
    public boolean hasGraph() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.chalk.graph.v1.Graph graph = 1 [json_name = "graph"];</code>
     * @return The graph.
     */
    public ai.chalk.protos.chalk.graph.v1.Graph getGraph() {
      if (graphBuilder_ == null) {
        return graph_ == null ? ai.chalk.protos.chalk.graph.v1.Graph.getDefaultInstance() : graph_;
      } else {
        return graphBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.graph.v1.Graph graph = 1 [json_name = "graph"];</code>
     */
    public Builder setGraph(ai.chalk.protos.chalk.graph.v1.Graph value) {
      if (graphBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        graph_ = value;
      } else {
        graphBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.graph.v1.Graph graph = 1 [json_name = "graph"];</code>
     */
    public Builder setGraph(
        ai.chalk.protos.chalk.graph.v1.Graph.Builder builderForValue) {
      if (graphBuilder_ == null) {
        graph_ = builderForValue.build();
      } else {
        graphBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.graph.v1.Graph graph = 1 [json_name = "graph"];</code>
     */
    public Builder mergeGraph(ai.chalk.protos.chalk.graph.v1.Graph value) {
      if (graphBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          graph_ != null &&
          graph_ != ai.chalk.protos.chalk.graph.v1.Graph.getDefaultInstance()) {
          getGraphBuilder().mergeFrom(value);
        } else {
          graph_ = value;
        }
      } else {
        graphBuilder_.mergeFrom(value);
      }
      if (graph_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.graph.v1.Graph graph = 1 [json_name = "graph"];</code>
     */
    public Builder clearGraph() {
      bitField0_ = (bitField0_ & ~0x00000001);
      graph_ = null;
      if (graphBuilder_ != null) {
        graphBuilder_.dispose();
        graphBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.graph.v1.Graph graph = 1 [json_name = "graph"];</code>
     */
    public ai.chalk.protos.chalk.graph.v1.Graph.Builder getGraphBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGraphFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.graph.v1.Graph graph = 1 [json_name = "graph"];</code>
     */
    public ai.chalk.protos.chalk.graph.v1.GraphOrBuilder getGraphOrBuilder() {
      if (graphBuilder_ != null) {
        return graphBuilder_.getMessageOrBuilder();
      } else {
        return graph_ == null ?
            ai.chalk.protos.chalk.graph.v1.Graph.getDefaultInstance() : graph_;
      }
    }
    /**
     * <code>.chalk.graph.v1.Graph graph = 1 [json_name = "graph"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.graph.v1.Graph, ai.chalk.protos.chalk.graph.v1.Graph.Builder, ai.chalk.protos.chalk.graph.v1.GraphOrBuilder> 
        getGraphFieldBuilder() {
      if (graphBuilder_ == null) {
        graphBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.chalk.protos.chalk.graph.v1.Graph, ai.chalk.protos.chalk.graph.v1.Graph.Builder, ai.chalk.protos.chalk.graph.v1.GraphOrBuilder>(
                getGraph(),
                getParentForChildren(),
                isClean());
        graph_ = null;
      }
      return graphBuilder_;
    }

    private java.lang.Object chalkpyVersion_ = "";
    /**
     * <code>string chalkpy_version = 2 [json_name = "chalkpyVersion"];</code>
     * @return The chalkpyVersion.
     */
    public java.lang.String getChalkpyVersion() {
      java.lang.Object ref = chalkpyVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        chalkpyVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string chalkpy_version = 2 [json_name = "chalkpyVersion"];</code>
     * @return The bytes for chalkpyVersion.
     */
    public com.google.protobuf.ByteString
        getChalkpyVersionBytes() {
      java.lang.Object ref = chalkpyVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        chalkpyVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string chalkpy_version = 2 [json_name = "chalkpyVersion"];</code>
     * @param value The chalkpyVersion to set.
     * @return This builder for chaining.
     */
    public Builder setChalkpyVersion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      chalkpyVersion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string chalkpy_version = 2 [json_name = "chalkpyVersion"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChalkpyVersion() {
      chalkpyVersion_ = getDefaultInstance().getChalkpyVersion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string chalkpy_version = 2 [json_name = "chalkpyVersion"];</code>
     * @param value The bytes for chalkpyVersion to set.
     * @return This builder for chaining.
     */
    public Builder setChalkpyVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      chalkpyVersion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object tag_ = "";
    /**
     * <code>optional string tag = 3 [json_name = "tag"];</code>
     * @return Whether the tag field is set.
     */
    public boolean hasTag() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string tag = 3 [json_name = "tag"];</code>
     * @return The tag.
     */
    public java.lang.String getTag() {
      java.lang.Object ref = tag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string tag = 3 [json_name = "tag"];</code>
     * @return The bytes for tag.
     */
    public com.google.protobuf.ByteString
        getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string tag = 3 [json_name = "tag"];</code>
     * @param value The tag to set.
     * @return This builder for chaining.
     */
    public Builder setTag(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      tag_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional string tag = 3 [json_name = "tag"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTag() {
      tag_ = getDefaultInstance().getTag();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>optional string tag = 3 [json_name = "tag"];</code>
     * @param value The bytes for tag to set.
     * @return This builder for chaining.
     */
    public Builder setTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      tag_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:chalk.server.v1.GetGraphResponse)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.GetGraphResponse)
  private static final ai.chalk.protos.chalk.server.v1.GetGraphResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.GetGraphResponse();
  }

  public static ai.chalk.protos.chalk.server.v1.GetGraphResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetGraphResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetGraphResponse>() {
    @java.lang.Override
    public GetGraphResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetGraphResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetGraphResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.GetGraphResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

