// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/nodepools/v1/karpenter.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.nodepools.v1;

/**
 * Protobuf type {@code chalk.nodepools.v1.KarpenterNodepoolStatus}
 */
public final class KarpenterNodepoolStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.nodepools.v1.KarpenterNodepoolStatus)
    KarpenterNodepoolStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KarpenterNodepoolStatus.newBuilder() to construct.
  private KarpenterNodepoolStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KarpenterNodepoolStatus() {
    conditions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KarpenterNodepoolStatus();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.nodepools.v1.KarpenterProto.internal_static_chalk_nodepools_v1_KarpenterNodepoolStatus_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetResources();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.nodepools.v1.KarpenterProto.internal_static_chalk_nodepools_v1_KarpenterNodepoolStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus.class, ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus.Builder.class);
  }

  public static final int RESOURCES_FIELD_NUMBER = 1;
  private static final class ResourcesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                ai.chalk.protos.chalk.nodepools.v1.KarpenterProto.internal_static_chalk_nodepools_v1_KarpenterNodepoolStatus_ResourcesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> resources_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetResources() {
    if (resources_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ResourcesDefaultEntryHolder.defaultEntry);
    }
    return resources_;
  }
  public int getResourcesCount() {
    return internalGetResources().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; resources = 1 [json_name = "resources"];</code>
   */
  @java.lang.Override
  public boolean containsResources(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetResources().getMap().containsKey(key);
  }
  /**
   * Use {@link #getResourcesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getResources() {
    return getResourcesMap();
  }
  /**
   * <code>map&lt;string, string&gt; resources = 1 [json_name = "resources"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getResourcesMap() {
    return internalGetResources().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; resources = 1 [json_name = "resources"];</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getResourcesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetResources().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; resources = 1 [json_name = "resources"];</code>
   */
  @java.lang.Override
  public java.lang.String getResourcesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetResources().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int CONDITIONS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition> conditions_;
  /**
   * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition> getConditionsList() {
    return conditions_;
  }
  /**
   * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolConditionOrBuilder> 
      getConditionsOrBuilderList() {
    return conditions_;
  }
  /**
   * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
   */
  @java.lang.Override
  public int getConditionsCount() {
    return conditions_.size();
  }
  /**
   * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition getConditions(int index) {
    return conditions_.get(index);
  }
  /**
   * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolConditionOrBuilder getConditionsOrBuilder(
      int index) {
    return conditions_.get(index);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetResources(),
        ResourcesDefaultEntryHolder.defaultEntry,
        1);
    for (int i = 0; i < conditions_.size(); i++) {
      output.writeMessage(2, conditions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetResources().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      resources__ = ResourcesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, resources__);
    }
    for (int i = 0; i < conditions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, conditions_.get(i));
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
    if (!(obj instanceof ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus other = (ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus) obj;

    if (!internalGetResources().equals(
        other.internalGetResources())) return false;
    if (!getConditionsList()
        .equals(other.getConditionsList())) return false;
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
    if (!internalGetResources().getMap().isEmpty()) {
      hash = (37 * hash) + RESOURCES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetResources().hashCode();
    }
    if (getConditionsCount() > 0) {
      hash = (37 * hash) + CONDITIONS_FIELD_NUMBER;
      hash = (53 * hash) + getConditionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus prototype) {
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
   * Protobuf type {@code chalk.nodepools.v1.KarpenterNodepoolStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.nodepools.v1.KarpenterNodepoolStatus)
      ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.nodepools.v1.KarpenterProto.internal_static_chalk_nodepools_v1_KarpenterNodepoolStatus_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetResources();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableResources();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.nodepools.v1.KarpenterProto.internal_static_chalk_nodepools_v1_KarpenterNodepoolStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus.class, ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus.newBuilder()
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
      internalGetMutableResources().clear();
      if (conditionsBuilder_ == null) {
        conditions_ = java.util.Collections.emptyList();
      } else {
        conditions_ = null;
        conditionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.nodepools.v1.KarpenterProto.internal_static_chalk_nodepools_v1_KarpenterNodepoolStatus_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus build() {
      ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus buildPartial() {
      ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus result = new ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus result) {
      if (conditionsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          conditions_ = java.util.Collections.unmodifiableList(conditions_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.conditions_ = conditions_;
      } else {
        result.conditions_ = conditionsBuilder_.build();
      }
    }

    private void buildPartial0(ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resources_ = internalGetResources();
        result.resources_.makeImmutable();
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
      if (other instanceof ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus) {
        return mergeFrom((ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus other) {
      if (other == ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus.getDefaultInstance()) return this;
      internalGetMutableResources().mergeFrom(
          other.internalGetResources());
      bitField0_ |= 0x00000001;
      if (conditionsBuilder_ == null) {
        if (!other.conditions_.isEmpty()) {
          if (conditions_.isEmpty()) {
            conditions_ = other.conditions_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureConditionsIsMutable();
            conditions_.addAll(other.conditions_);
          }
          onChanged();
        }
      } else {
        if (!other.conditions_.isEmpty()) {
          if (conditionsBuilder_.isEmpty()) {
            conditionsBuilder_.dispose();
            conditionsBuilder_ = null;
            conditions_ = other.conditions_;
            bitField0_ = (bitField0_ & ~0x00000002);
            conditionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getConditionsFieldBuilder() : null;
          } else {
            conditionsBuilder_.addAllMessages(other.conditions_);
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
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              resources__ = input.readMessage(
                  ResourcesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableResources().getMutableMap().put(
                  resources__.getKey(), resources__.getValue());
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition m =
                  input.readMessage(
                      ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition.parser(),
                      extensionRegistry);
              if (conditionsBuilder_ == null) {
                ensureConditionsIsMutable();
                conditions_.add(m);
              } else {
                conditionsBuilder_.addMessage(m);
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

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> resources_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetResources() {
      if (resources_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ResourcesDefaultEntryHolder.defaultEntry);
      }
      return resources_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableResources() {
      if (resources_ == null) {
        resources_ = com.google.protobuf.MapField.newMapField(
            ResourcesDefaultEntryHolder.defaultEntry);
      }
      if (!resources_.isMutable()) {
        resources_ = resources_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return resources_;
    }
    public int getResourcesCount() {
      return internalGetResources().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; resources = 1 [json_name = "resources"];</code>
     */
    @java.lang.Override
    public boolean containsResources(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetResources().getMap().containsKey(key);
    }
    /**
     * Use {@link #getResourcesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getResources() {
      return getResourcesMap();
    }
    /**
     * <code>map&lt;string, string&gt; resources = 1 [json_name = "resources"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getResourcesMap() {
      return internalGetResources().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; resources = 1 [json_name = "resources"];</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getResourcesOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetResources().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; resources = 1 [json_name = "resources"];</code>
     */
    @java.lang.Override
    public java.lang.String getResourcesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetResources().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearResources() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableResources().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; resources = 1 [json_name = "resources"];</code>
     */
    public Builder removeResources(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableResources().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableResources() {
      bitField0_ |= 0x00000001;
      return internalGetMutableResources().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; resources = 1 [json_name = "resources"];</code>
     */
    public Builder putResources(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableResources().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; resources = 1 [json_name = "resources"];</code>
     */
    public Builder putAllResources(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableResources().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private java.util.List<ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition> conditions_ =
      java.util.Collections.emptyList();
    private void ensureConditionsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        conditions_ = new java.util.ArrayList<ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition>(conditions_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition, ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition.Builder, ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolConditionOrBuilder> conditionsBuilder_;

    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition> getConditionsList() {
      if (conditionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(conditions_);
      } else {
        return conditionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public int getConditionsCount() {
      if (conditionsBuilder_ == null) {
        return conditions_.size();
      } else {
        return conditionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition getConditions(int index) {
      if (conditionsBuilder_ == null) {
        return conditions_.get(index);
      } else {
        return conditionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public Builder setConditions(
        int index, ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition value) {
      if (conditionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConditionsIsMutable();
        conditions_.set(index, value);
        onChanged();
      } else {
        conditionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public Builder setConditions(
        int index, ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition.Builder builderForValue) {
      if (conditionsBuilder_ == null) {
        ensureConditionsIsMutable();
        conditions_.set(index, builderForValue.build());
        onChanged();
      } else {
        conditionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public Builder addConditions(ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition value) {
      if (conditionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConditionsIsMutable();
        conditions_.add(value);
        onChanged();
      } else {
        conditionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public Builder addConditions(
        int index, ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition value) {
      if (conditionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConditionsIsMutable();
        conditions_.add(index, value);
        onChanged();
      } else {
        conditionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public Builder addConditions(
        ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition.Builder builderForValue) {
      if (conditionsBuilder_ == null) {
        ensureConditionsIsMutable();
        conditions_.add(builderForValue.build());
        onChanged();
      } else {
        conditionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public Builder addConditions(
        int index, ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition.Builder builderForValue) {
      if (conditionsBuilder_ == null) {
        ensureConditionsIsMutable();
        conditions_.add(index, builderForValue.build());
        onChanged();
      } else {
        conditionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public Builder addAllConditions(
        java.lang.Iterable<? extends ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition> values) {
      if (conditionsBuilder_ == null) {
        ensureConditionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, conditions_);
        onChanged();
      } else {
        conditionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public Builder clearConditions() {
      if (conditionsBuilder_ == null) {
        conditions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        conditionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public Builder removeConditions(int index) {
      if (conditionsBuilder_ == null) {
        ensureConditionsIsMutable();
        conditions_.remove(index);
        onChanged();
      } else {
        conditionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition.Builder getConditionsBuilder(
        int index) {
      return getConditionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolConditionOrBuilder getConditionsOrBuilder(
        int index) {
      if (conditionsBuilder_ == null) {
        return conditions_.get(index);  } else {
        return conditionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public java.util.List<? extends ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolConditionOrBuilder> 
         getConditionsOrBuilderList() {
      if (conditionsBuilder_ != null) {
        return conditionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(conditions_);
      }
    }
    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition.Builder addConditionsBuilder() {
      return getConditionsFieldBuilder().addBuilder(
          ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition.Builder addConditionsBuilder(
        int index) {
      return getConditionsFieldBuilder().addBuilder(
          index, ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition.Builder> 
         getConditionsBuilderList() {
      return getConditionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition, ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition.Builder, ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolConditionOrBuilder> 
        getConditionsFieldBuilder() {
      if (conditionsBuilder_ == null) {
        conditionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition, ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition.Builder, ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolConditionOrBuilder>(
                conditions_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        conditions_ = null;
      }
      return conditionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.nodepools.v1.KarpenterNodepoolStatus)
  }

  // @@protoc_insertion_point(class_scope:chalk.nodepools.v1.KarpenterNodepoolStatus)
  private static final ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus();
  }

  public static ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KarpenterNodepoolStatus>
      PARSER = new com.google.protobuf.AbstractParser<KarpenterNodepoolStatus>() {
    @java.lang.Override
    public KarpenterNodepoolStatus parsePartialFrom(
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

  public static com.google.protobuf.Parser<KarpenterNodepoolStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KarpenterNodepoolStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

