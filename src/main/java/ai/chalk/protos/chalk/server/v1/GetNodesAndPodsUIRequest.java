// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/billing.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.GetNodesAndPodsUIRequest}
 */
public final class GetNodesAndPodsUIRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.GetNodesAndPodsUIRequest)
    GetNodesAndPodsUIRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetNodesAndPodsUIRequest.newBuilder() to construct.
  private GetNodesAndPodsUIRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetNodesAndPodsUIRequest() {
    namespace_ = "";
    podLabelSelector_ = "";
    environmentId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetNodesAndPodsUIRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.BillingProto.internal_static_chalk_server_v1_GetNodesAndPodsUIRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.BillingProto.internal_static_chalk_server_v1_GetNodesAndPodsUIRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest.class, ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAMESPACE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object namespace_ = "";
  /**
   * <code>optional string namespace = 1 [json_name = "namespace"];</code>
   * @return Whether the namespace field is set.
   */
  @java.lang.Override
  public boolean hasNamespace() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string namespace = 1 [json_name = "namespace"];</code>
   * @return The namespace.
   */
  @java.lang.Override
  public java.lang.String getNamespace() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namespace_ = s;
      return s;
    }
  }
  /**
   * <code>optional string namespace = 1 [json_name = "namespace"];</code>
   * @return The bytes for namespace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNamespaceBytes() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      namespace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POD_LABEL_SELECTOR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object podLabelSelector_ = "";
  /**
   * <code>optional string pod_label_selector = 2 [json_name = "podLabelSelector"];</code>
   * @return Whether the podLabelSelector field is set.
   */
  @java.lang.Override
  public boolean hasPodLabelSelector() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string pod_label_selector = 2 [json_name = "podLabelSelector"];</code>
   * @return The podLabelSelector.
   */
  @java.lang.Override
  public java.lang.String getPodLabelSelector() {
    java.lang.Object ref = podLabelSelector_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      podLabelSelector_ = s;
      return s;
    }
  }
  /**
   * <code>optional string pod_label_selector = 2 [json_name = "podLabelSelector"];</code>
   * @return The bytes for podLabelSelector.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPodLabelSelectorBytes() {
    java.lang.Object ref = podLabelSelector_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      podLabelSelector_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENVIRONMENT_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object environmentId_ = "";
  /**
   * <code>optional string environment_id = 3 [json_name = "environmentId"];</code>
   * @return Whether the environmentId field is set.
   */
  @java.lang.Override
  public boolean hasEnvironmentId() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional string environment_id = 3 [json_name = "environmentId"];</code>
   * @return The environmentId.
   */
  @java.lang.Override
  public java.lang.String getEnvironmentId() {
    java.lang.Object ref = environmentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      environmentId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string environment_id = 3 [json_name = "environmentId"];</code>
   * @return The bytes for environmentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEnvironmentIdBytes() {
    java.lang.Object ref = environmentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      environmentId_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, namespace_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, podLabelSelector_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, environmentId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, namespace_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, podLabelSelector_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, environmentId_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest other = (ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest) obj;

    if (hasNamespace() != other.hasNamespace()) return false;
    if (hasNamespace()) {
      if (!getNamespace()
          .equals(other.getNamespace())) return false;
    }
    if (hasPodLabelSelector() != other.hasPodLabelSelector()) return false;
    if (hasPodLabelSelector()) {
      if (!getPodLabelSelector()
          .equals(other.getPodLabelSelector())) return false;
    }
    if (hasEnvironmentId() != other.hasEnvironmentId()) return false;
    if (hasEnvironmentId()) {
      if (!getEnvironmentId()
          .equals(other.getEnvironmentId())) return false;
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
    if (hasNamespace()) {
      hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
      hash = (53 * hash) + getNamespace().hashCode();
    }
    if (hasPodLabelSelector()) {
      hash = (37 * hash) + POD_LABEL_SELECTOR_FIELD_NUMBER;
      hash = (53 * hash) + getPodLabelSelector().hashCode();
    }
    if (hasEnvironmentId()) {
      hash = (37 * hash) + ENVIRONMENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEnvironmentId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest prototype) {
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
   * Protobuf type {@code chalk.server.v1.GetNodesAndPodsUIRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.GetNodesAndPodsUIRequest)
      ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.BillingProto.internal_static_chalk_server_v1_GetNodesAndPodsUIRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.BillingProto.internal_static_chalk_server_v1_GetNodesAndPodsUIRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest.class, ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest.newBuilder()
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
      namespace_ = "";
      podLabelSelector_ = "";
      environmentId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.BillingProto.internal_static_chalk_server_v1_GetNodesAndPodsUIRequest_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest build() {
      ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest buildPartial() {
      ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest result = new ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.namespace_ = namespace_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.podLabelSelector_ = podLabelSelector_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.environmentId_ = environmentId_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest other) {
      if (other == ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest.getDefaultInstance()) return this;
      if (other.hasNamespace()) {
        namespace_ = other.namespace_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPodLabelSelector()) {
        podLabelSelector_ = other.podLabelSelector_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasEnvironmentId()) {
        environmentId_ = other.environmentId_;
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
              namespace_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              podLabelSelector_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              environmentId_ = input.readStringRequireUtf8();
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

    private java.lang.Object namespace_ = "";
    /**
     * <code>optional string namespace = 1 [json_name = "namespace"];</code>
     * @return Whether the namespace field is set.
     */
    public boolean hasNamespace() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string namespace = 1 [json_name = "namespace"];</code>
     * @return The namespace.
     */
    public java.lang.String getNamespace() {
      java.lang.Object ref = namespace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namespace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string namespace = 1 [json_name = "namespace"];</code>
     * @return The bytes for namespace.
     */
    public com.google.protobuf.ByteString
        getNamespaceBytes() {
      java.lang.Object ref = namespace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        namespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string namespace = 1 [json_name = "namespace"];</code>
     * @param value The namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespace(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      namespace_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional string namespace = 1 [json_name = "namespace"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNamespace() {
      namespace_ = getDefaultInstance().getNamespace();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>optional string namespace = 1 [json_name = "namespace"];</code>
     * @param value The bytes for namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      namespace_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object podLabelSelector_ = "";
    /**
     * <code>optional string pod_label_selector = 2 [json_name = "podLabelSelector"];</code>
     * @return Whether the podLabelSelector field is set.
     */
    public boolean hasPodLabelSelector() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string pod_label_selector = 2 [json_name = "podLabelSelector"];</code>
     * @return The podLabelSelector.
     */
    public java.lang.String getPodLabelSelector() {
      java.lang.Object ref = podLabelSelector_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        podLabelSelector_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string pod_label_selector = 2 [json_name = "podLabelSelector"];</code>
     * @return The bytes for podLabelSelector.
     */
    public com.google.protobuf.ByteString
        getPodLabelSelectorBytes() {
      java.lang.Object ref = podLabelSelector_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        podLabelSelector_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string pod_label_selector = 2 [json_name = "podLabelSelector"];</code>
     * @param value The podLabelSelector to set.
     * @return This builder for chaining.
     */
    public Builder setPodLabelSelector(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      podLabelSelector_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional string pod_label_selector = 2 [json_name = "podLabelSelector"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPodLabelSelector() {
      podLabelSelector_ = getDefaultInstance().getPodLabelSelector();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>optional string pod_label_selector = 2 [json_name = "podLabelSelector"];</code>
     * @param value The bytes for podLabelSelector to set.
     * @return This builder for chaining.
     */
    public Builder setPodLabelSelectorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      podLabelSelector_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object environmentId_ = "";
    /**
     * <code>optional string environment_id = 3 [json_name = "environmentId"];</code>
     * @return Whether the environmentId field is set.
     */
    public boolean hasEnvironmentId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string environment_id = 3 [json_name = "environmentId"];</code>
     * @return The environmentId.
     */
    public java.lang.String getEnvironmentId() {
      java.lang.Object ref = environmentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        environmentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string environment_id = 3 [json_name = "environmentId"];</code>
     * @return The bytes for environmentId.
     */
    public com.google.protobuf.ByteString
        getEnvironmentIdBytes() {
      java.lang.Object ref = environmentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        environmentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string environment_id = 3 [json_name = "environmentId"];</code>
     * @param value The environmentId to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironmentId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      environmentId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional string environment_id = 3 [json_name = "environmentId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEnvironmentId() {
      environmentId_ = getDefaultInstance().getEnvironmentId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>optional string environment_id = 3 [json_name = "environmentId"];</code>
     * @param value The bytes for environmentId to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironmentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      environmentId_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:chalk.server.v1.GetNodesAndPodsUIRequest)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.GetNodesAndPodsUIRequest)
  private static final ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest();
  }

  public static ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetNodesAndPodsUIRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetNodesAndPodsUIRequest>() {
    @java.lang.Override
    public GetNodesAndPodsUIRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetNodesAndPodsUIRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetNodesAndPodsUIRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

