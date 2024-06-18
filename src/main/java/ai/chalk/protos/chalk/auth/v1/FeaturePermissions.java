// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/auth/v1/featurepermission.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.auth.v1;

/**
 * Protobuf type {@code chalk.auth.v1.FeaturePermissions}
 */
public final class FeaturePermissions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.auth.v1.FeaturePermissions)
    FeaturePermissionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeaturePermissions.newBuilder() to construct.
  private FeaturePermissions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeaturePermissions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeaturePermissions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.auth.v1.FeaturepermissionProto.internal_static_chalk_auth_v1_FeaturePermissions_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetTags();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.auth.v1.FeaturepermissionProto.internal_static_chalk_auth_v1_FeaturePermissions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.auth.v1.FeaturePermissions.class, ai.chalk.protos.chalk.auth.v1.FeaturePermissions.Builder.class);
  }

  public static final int TAGS_FIELD_NUMBER = 1;
  private static final class TagsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Integer> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Integer>newDefaultInstance(
                ai.chalk.protos.chalk.auth.v1.FeaturepermissionProto.internal_static_chalk_auth_v1_FeaturePermissions_TagsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.ENUM,
                ai.chalk.protos.chalk.auth.v1.FeaturePermission.FEATURE_PERMISSION_UNSPECIFIED.getNumber());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Integer> tags_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
  internalGetTags() {
    if (tags_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          TagsDefaultEntryHolder.defaultEntry);
    }
    return tags_;
  }
  private static final
  com.google.protobuf.Internal.MapAdapter.Converter<
      java.lang.Integer, ai.chalk.protos.chalk.auth.v1.FeaturePermission> tagsValueConverter =
          com.google.protobuf.Internal.MapAdapter.newEnumConverter(
              ai.chalk.protos.chalk.auth.v1.FeaturePermission.internalGetValueMap(),
              ai.chalk.protos.chalk.auth.v1.FeaturePermission.UNRECOGNIZED);
  private static final java.util.Map<java.lang.String, ai.chalk.protos.chalk.auth.v1.FeaturePermission>
  internalGetAdaptedTagsMap(
      java.util.Map<java.lang.String, java.lang.Integer> map) {
    return new com.google.protobuf.Internal.MapAdapter<
        java.lang.String, ai.chalk.protos.chalk.auth.v1.FeaturePermission, java.lang.Integer>(
            map, tagsValueConverter);
  }
  public int getTagsCount() {
    return internalGetTags().getMap().size();
  }
  /**
   * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
   */
  @java.lang.Override
  public boolean containsTags(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetTags().getMap().containsKey(key);
  }
  /**
   * Use {@link #getTagsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, ai.chalk.protos.chalk.auth.v1.FeaturePermission>
  getTags() {
    return getTagsMap();
  }
  /**
   * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, ai.chalk.protos.chalk.auth.v1.FeaturePermission>
  getTagsMap() {
    return internalGetAdaptedTagsMap(
        internalGetTags().getMap());}
  /**
   * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
   */
  @java.lang.Override
  public /* nullable */
ai.chalk.protos.chalk.auth.v1.FeaturePermission getTagsOrDefault(
      java.lang.String key,
      /* nullable */
ai.chalk.protos.chalk.auth.v1.FeaturePermission defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetTags().getMap();
    return map.containsKey(key)
           ? tagsValueConverter.doForward(map.get(key))
           : defaultValue;
  }
  /**
   * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.auth.v1.FeaturePermission getTagsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetTags().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return tagsValueConverter.doForward(map.get(key));
  }
  /**
   * Use {@link #getTagsValueMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Integer>
  getTagsValue() {
    return getTagsValueMap();
  }
  /**
   * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.Integer>
  getTagsValueMap() {
    return internalGetTags().getMap();
  }
  /**
   * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
   */
  @java.lang.Override
  public int getTagsValueOrDefault(
      java.lang.String key,
      int defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetTags().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
   */
  @java.lang.Override
  public int getTagsValueOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetTags().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
        internalGetTags(),
        TagsDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry
         : internalGetTags().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Integer>
      tags__ = TagsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, tags__);
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
    if (!(obj instanceof ai.chalk.protos.chalk.auth.v1.FeaturePermissions)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.auth.v1.FeaturePermissions other = (ai.chalk.protos.chalk.auth.v1.FeaturePermissions) obj;

    if (!internalGetTags().equals(
        other.internalGetTags())) return false;
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
    if (!internalGetTags().getMap().isEmpty()) {
      hash = (37 * hash) + TAGS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetTags().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.auth.v1.FeaturePermissions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.auth.v1.FeaturePermissions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.auth.v1.FeaturePermissions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.auth.v1.FeaturePermissions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.auth.v1.FeaturePermissions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.auth.v1.FeaturePermissions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.auth.v1.FeaturePermissions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.auth.v1.FeaturePermissions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.auth.v1.FeaturePermissions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.auth.v1.FeaturePermissions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.auth.v1.FeaturePermissions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.auth.v1.FeaturePermissions parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.auth.v1.FeaturePermissions prototype) {
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
   * Protobuf type {@code chalk.auth.v1.FeaturePermissions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.auth.v1.FeaturePermissions)
      ai.chalk.protos.chalk.auth.v1.FeaturePermissionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.auth.v1.FeaturepermissionProto.internal_static_chalk_auth_v1_FeaturePermissions_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetTags();
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
          return internalGetMutableTags();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.auth.v1.FeaturepermissionProto.internal_static_chalk_auth_v1_FeaturePermissions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.auth.v1.FeaturePermissions.class, ai.chalk.protos.chalk.auth.v1.FeaturePermissions.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.auth.v1.FeaturePermissions.newBuilder()
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
      internalGetMutableTags().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.auth.v1.FeaturepermissionProto.internal_static_chalk_auth_v1_FeaturePermissions_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.auth.v1.FeaturePermissions getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.auth.v1.FeaturePermissions.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.auth.v1.FeaturePermissions build() {
      ai.chalk.protos.chalk.auth.v1.FeaturePermissions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.auth.v1.FeaturePermissions buildPartial() {
      ai.chalk.protos.chalk.auth.v1.FeaturePermissions result = new ai.chalk.protos.chalk.auth.v1.FeaturePermissions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.auth.v1.FeaturePermissions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tags_ = internalGetTags();
        result.tags_.makeImmutable();
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
      if (other instanceof ai.chalk.protos.chalk.auth.v1.FeaturePermissions) {
        return mergeFrom((ai.chalk.protos.chalk.auth.v1.FeaturePermissions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.auth.v1.FeaturePermissions other) {
      if (other == ai.chalk.protos.chalk.auth.v1.FeaturePermissions.getDefaultInstance()) return this;
      internalGetMutableTags().mergeFrom(
          other.internalGetTags());
      bitField0_ |= 0x00000001;
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
              com.google.protobuf.MapEntry<java.lang.String, java.lang.Integer>
              tags__ = input.readMessage(
                  TagsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableTags().getMutableMap().put(
                  tags__.getKey(), tags__.getValue());
              bitField0_ |= 0x00000001;
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

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Integer> tags_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
        internalGetTags() {
      if (tags_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            TagsDefaultEntryHolder.defaultEntry);
      }
      return tags_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
        internalGetMutableTags() {
      if (tags_ == null) {
        tags_ = com.google.protobuf.MapField.newMapField(
            TagsDefaultEntryHolder.defaultEntry);
      }
      if (!tags_.isMutable()) {
        tags_ = tags_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return tags_;
    }
    public int getTagsCount() {
      return internalGetTags().getMap().size();
    }
    /**
     * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
     */
    @java.lang.Override
    public boolean containsTags(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetTags().getMap().containsKey(key);
    }
    /**
     * Use {@link #getTagsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, ai.chalk.protos.chalk.auth.v1.FeaturePermission>
    getTags() {
      return getTagsMap();
    }
    /**
     * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, ai.chalk.protos.chalk.auth.v1.FeaturePermission>
    getTagsMap() {
      return internalGetAdaptedTagsMap(
          internalGetTags().getMap());}
    /**
     * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
     */
    @java.lang.Override
    public /* nullable */
ai.chalk.protos.chalk.auth.v1.FeaturePermission getTagsOrDefault(
        java.lang.String key,
        /* nullable */
ai.chalk.protos.chalk.auth.v1.FeaturePermission defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetTags().getMap();
      return map.containsKey(key)
             ? tagsValueConverter.doForward(map.get(key))
             : defaultValue;
    }
    /**
     * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.auth.v1.FeaturePermission getTagsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetTags().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return tagsValueConverter.doForward(map.get(key));
    }
    /**
     * Use {@link #getTagsValueMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Integer>
    getTagsValue() {
      return getTagsValueMap();
    }
    /**
     * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.Integer>
    getTagsValueMap() {
      return internalGetTags().getMap();
    }
    /**
     * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
     */
    @java.lang.Override
    public int getTagsValueOrDefault(
        java.lang.String key,
        int defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetTags().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
     */
    @java.lang.Override
    public int getTagsValueOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetTags().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearTags() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableTags().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
     */
    public Builder removeTags(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableTags().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, ai.chalk.protos.chalk.auth.v1.FeaturePermission>
        getMutableTags() {
      bitField0_ |= 0x00000001;
      return internalGetAdaptedTagsMap(
           internalGetMutableTags().getMutableMap());
    }
    /**
     * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
     */
    public Builder putTags(
        java.lang.String key,
        ai.chalk.protos.chalk.auth.v1.FeaturePermission value) {
      if (key == null) { throw new NullPointerException("map key"); }

      internalGetMutableTags().getMutableMap()
          .put(key, tagsValueConverter.doBackward(value));
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
     */
    public Builder putAllTags(
        java.util.Map<java.lang.String, ai.chalk.protos.chalk.auth.v1.FeaturePermission> values) {
      internalGetAdaptedTagsMap(
          internalGetMutableTags().getMutableMap())
              .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Integer>
    getMutableTagsValue() {
      bitField0_ |= 0x00000001;
      return internalGetMutableTags().getMutableMap();
    }
    /**
     * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
     */
    public Builder putTagsValue(
        java.lang.String key,
        int value) {
      if (key == null) { throw new NullPointerException("map key"); }

      internalGetMutableTags().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; tags = 1 [json_name = "tags"];</code>
     */
    public Builder putAllTagsValue(
        java.util.Map<java.lang.String, java.lang.Integer> values) {
      internalGetMutableTags().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:chalk.auth.v1.FeaturePermissions)
  }

  // @@protoc_insertion_point(class_scope:chalk.auth.v1.FeaturePermissions)
  private static final ai.chalk.protos.chalk.auth.v1.FeaturePermissions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.auth.v1.FeaturePermissions();
  }

  public static ai.chalk.protos.chalk.auth.v1.FeaturePermissions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeaturePermissions>
      PARSER = new com.google.protobuf.AbstractParser<FeaturePermissions>() {
    @java.lang.Override
    public FeaturePermissions parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeaturePermissions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeaturePermissions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.auth.v1.FeaturePermissions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

