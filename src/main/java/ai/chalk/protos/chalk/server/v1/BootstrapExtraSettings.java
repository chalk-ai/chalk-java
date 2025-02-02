// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/bootstrap.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.BootstrapExtraSettings}
 */
public final class BootstrapExtraSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.BootstrapExtraSettings)
    BootstrapExtraSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BootstrapExtraSettings.newBuilder() to construct.
  private BootstrapExtraSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BootstrapExtraSettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BootstrapExtraSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.BootstrapProto.internal_static_chalk_server_v1_BootstrapExtraSettings_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetGlobal();
      case 2:
        return internalGetEnvironments();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.BootstrapProto.internal_static_chalk_server_v1_BootstrapExtraSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings.class, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings.Builder.class);
  }

  public static final int GLOBAL_FIELD_NUMBER = 1;
  private static final class GlobalDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Boolean> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Boolean>newDefaultInstance(
                ai.chalk.protos.chalk.server.v1.BootstrapProto.internal_static_chalk_server_v1_BootstrapExtraSettings_GlobalEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.BOOL,
                false);
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Boolean> global_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Boolean>
  internalGetGlobal() {
    if (global_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          GlobalDefaultEntryHolder.defaultEntry);
    }
    return global_;
  }
  public int getGlobalCount() {
    return internalGetGlobal().getMap().size();
  }
  /**
   * <code>map&lt;string, bool&gt; global = 1 [json_name = "global"];</code>
   */
  @java.lang.Override
  public boolean containsGlobal(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetGlobal().getMap().containsKey(key);
  }
  /**
   * Use {@link #getGlobalMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Boolean> getGlobal() {
    return getGlobalMap();
  }
  /**
   * <code>map&lt;string, bool&gt; global = 1 [json_name = "global"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.Boolean> getGlobalMap() {
    return internalGetGlobal().getMap();
  }
  /**
   * <code>map&lt;string, bool&gt; global = 1 [json_name = "global"];</code>
   */
  @java.lang.Override
  public boolean getGlobalOrDefault(
      java.lang.String key,
      boolean defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Boolean> map =
        internalGetGlobal().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, bool&gt; global = 1 [json_name = "global"];</code>
   */
  @java.lang.Override
  public boolean getGlobalOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Boolean> map =
        internalGetGlobal().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int ENVIRONMENTS_FIELD_NUMBER = 2;
  private static final class EnvironmentsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment>newDefaultInstance(
                ai.chalk.protos.chalk.server.v1.BootstrapProto.internal_static_chalk_server_v1_BootstrapExtraSettings_EnvironmentsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment> environments_;
  private com.google.protobuf.MapField<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment>
  internalGetEnvironments() {
    if (environments_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          EnvironmentsDefaultEntryHolder.defaultEntry);
    }
    return environments_;
  }
  public int getEnvironmentsCount() {
    return internalGetEnvironments().getMap().size();
  }
  /**
   * <code>map&lt;string, .chalk.server.v1.BootstrapExtraSettingsEnvironment&gt; environments = 2 [json_name = "environments"];</code>
   */
  @java.lang.Override
  public boolean containsEnvironments(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetEnvironments().getMap().containsKey(key);
  }
  /**
   * Use {@link #getEnvironmentsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment> getEnvironments() {
    return getEnvironmentsMap();
  }
  /**
   * <code>map&lt;string, .chalk.server.v1.BootstrapExtraSettingsEnvironment&gt; environments = 2 [json_name = "environments"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment> getEnvironmentsMap() {
    return internalGetEnvironments().getMap();
  }
  /**
   * <code>map&lt;string, .chalk.server.v1.BootstrapExtraSettingsEnvironment&gt; environments = 2 [json_name = "environments"];</code>
   */
  @java.lang.Override
  public /* nullable */
ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment getEnvironmentsOrDefault(
      java.lang.String key,
      /* nullable */
ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment> map =
        internalGetEnvironments().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .chalk.server.v1.BootstrapExtraSettingsEnvironment&gt; environments = 2 [json_name = "environments"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment getEnvironmentsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment> map =
        internalGetEnvironments().getMap();
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
        internalGetGlobal(),
        GlobalDefaultEntryHolder.defaultEntry,
        1);
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetEnvironments(),
        EnvironmentsDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.Boolean> entry
         : internalGetGlobal().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Boolean>
      global__ = GlobalDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, global__);
    }
    for (java.util.Map.Entry<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment> entry
         : internalGetEnvironments().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment>
      environments__ = EnvironmentsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, environments__);
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings other = (ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings) obj;

    if (!internalGetGlobal().equals(
        other.internalGetGlobal())) return false;
    if (!internalGetEnvironments().equals(
        other.internalGetEnvironments())) return false;
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
    if (!internalGetGlobal().getMap().isEmpty()) {
      hash = (37 * hash) + GLOBAL_FIELD_NUMBER;
      hash = (53 * hash) + internalGetGlobal().hashCode();
    }
    if (!internalGetEnvironments().getMap().isEmpty()) {
      hash = (37 * hash) + ENVIRONMENTS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetEnvironments().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings prototype) {
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
   * Protobuf type {@code chalk.server.v1.BootstrapExtraSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.BootstrapExtraSettings)
      ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.BootstrapProto.internal_static_chalk_server_v1_BootstrapExtraSettings_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetGlobal();
        case 2:
          return internalGetEnvironments();
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
          return internalGetMutableGlobal();
        case 2:
          return internalGetMutableEnvironments();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.BootstrapProto.internal_static_chalk_server_v1_BootstrapExtraSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings.class, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings.newBuilder()
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
      internalGetMutableGlobal().clear();
      internalGetMutableEnvironments().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.BootstrapProto.internal_static_chalk_server_v1_BootstrapExtraSettings_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings build() {
      ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings buildPartial() {
      ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings result = new ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.global_ = internalGetGlobal();
        result.global_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.environments_ = internalGetEnvironments().build(EnvironmentsDefaultEntryHolder.defaultEntry);
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
      if (other instanceof ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings other) {
      if (other == ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings.getDefaultInstance()) return this;
      internalGetMutableGlobal().mergeFrom(
          other.internalGetGlobal());
      bitField0_ |= 0x00000001;
      internalGetMutableEnvironments().mergeFrom(
          other.internalGetEnvironments());
      bitField0_ |= 0x00000002;
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
              com.google.protobuf.MapEntry<java.lang.String, java.lang.Boolean>
              global__ = input.readMessage(
                  GlobalDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableGlobal().getMutableMap().put(
                  global__.getKey(), global__.getValue());
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment>
              environments__ = input.readMessage(
                  EnvironmentsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableEnvironments().ensureBuilderMap().put(
                  environments__.getKey(), environments__.getValue());
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

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Boolean> global_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Boolean>
        internalGetGlobal() {
      if (global_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            GlobalDefaultEntryHolder.defaultEntry);
      }
      return global_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Boolean>
        internalGetMutableGlobal() {
      if (global_ == null) {
        global_ = com.google.protobuf.MapField.newMapField(
            GlobalDefaultEntryHolder.defaultEntry);
      }
      if (!global_.isMutable()) {
        global_ = global_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return global_;
    }
    public int getGlobalCount() {
      return internalGetGlobal().getMap().size();
    }
    /**
     * <code>map&lt;string, bool&gt; global = 1 [json_name = "global"];</code>
     */
    @java.lang.Override
    public boolean containsGlobal(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetGlobal().getMap().containsKey(key);
    }
    /**
     * Use {@link #getGlobalMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Boolean> getGlobal() {
      return getGlobalMap();
    }
    /**
     * <code>map&lt;string, bool&gt; global = 1 [json_name = "global"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.Boolean> getGlobalMap() {
      return internalGetGlobal().getMap();
    }
    /**
     * <code>map&lt;string, bool&gt; global = 1 [json_name = "global"];</code>
     */
    @java.lang.Override
    public boolean getGlobalOrDefault(
        java.lang.String key,
        boolean defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Boolean> map =
          internalGetGlobal().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, bool&gt; global = 1 [json_name = "global"];</code>
     */
    @java.lang.Override
    public boolean getGlobalOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Boolean> map =
          internalGetGlobal().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearGlobal() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableGlobal().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, bool&gt; global = 1 [json_name = "global"];</code>
     */
    public Builder removeGlobal(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableGlobal().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Boolean>
        getMutableGlobal() {
      bitField0_ |= 0x00000001;
      return internalGetMutableGlobal().getMutableMap();
    }
    /**
     * <code>map&lt;string, bool&gt; global = 1 [json_name = "global"];</code>
     */
    public Builder putGlobal(
        java.lang.String key,
        boolean value) {
      if (key == null) { throw new NullPointerException("map key"); }

      internalGetMutableGlobal().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;string, bool&gt; global = 1 [json_name = "global"];</code>
     */
    public Builder putAllGlobal(
        java.util.Map<java.lang.String, java.lang.Boolean> values) {
      internalGetMutableGlobal().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private static final class EnvironmentsConverter implements com.google.protobuf.MapFieldBuilder.Converter<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironmentOrBuilder, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment> {
      @java.lang.Override
      public ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment build(ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironmentOrBuilder val) {
        if (val instanceof ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment) { return (ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment) val; }
        return ((ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment.Builder) val).build();
      }

      @java.lang.Override
      public com.google.protobuf.MapEntry<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment> defaultEntry() {
        return EnvironmentsDefaultEntryHolder.defaultEntry;
      }
    };
    private static final EnvironmentsConverter environmentsConverter = new EnvironmentsConverter();

    private com.google.protobuf.MapFieldBuilder<
        java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironmentOrBuilder, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment.Builder> environments_;
    private com.google.protobuf.MapFieldBuilder<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironmentOrBuilder, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment.Builder>
        internalGetEnvironments() {
      if (environments_ == null) {
        return new com.google.protobuf.MapFieldBuilder<>(environmentsConverter);
      }
      return environments_;
    }
    private com.google.protobuf.MapFieldBuilder<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironmentOrBuilder, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment.Builder>
        internalGetMutableEnvironments() {
      if (environments_ == null) {
        environments_ = new com.google.protobuf.MapFieldBuilder<>(environmentsConverter);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return environments_;
    }
    public int getEnvironmentsCount() {
      return internalGetEnvironments().ensureBuilderMap().size();
    }
    /**
     * <code>map&lt;string, .chalk.server.v1.BootstrapExtraSettingsEnvironment&gt; environments = 2 [json_name = "environments"];</code>
     */
    @java.lang.Override
    public boolean containsEnvironments(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetEnvironments().ensureBuilderMap().containsKey(key);
    }
    /**
     * Use {@link #getEnvironmentsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment> getEnvironments() {
      return getEnvironmentsMap();
    }
    /**
     * <code>map&lt;string, .chalk.server.v1.BootstrapExtraSettingsEnvironment&gt; environments = 2 [json_name = "environments"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment> getEnvironmentsMap() {
      return internalGetEnvironments().getImmutableMap();
    }
    /**
     * <code>map&lt;string, .chalk.server.v1.BootstrapExtraSettingsEnvironment&gt; environments = 2 [json_name = "environments"];</code>
     */
    @java.lang.Override
    public /* nullable */
ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment getEnvironmentsOrDefault(
        java.lang.String key,
        /* nullable */
ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironmentOrBuilder> map = internalGetMutableEnvironments().ensureBuilderMap();
      return map.containsKey(key) ? environmentsConverter.build(map.get(key)) : defaultValue;
    }
    /**
     * <code>map&lt;string, .chalk.server.v1.BootstrapExtraSettingsEnvironment&gt; environments = 2 [json_name = "environments"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment getEnvironmentsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironmentOrBuilder> map = internalGetMutableEnvironments().ensureBuilderMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return environmentsConverter.build(map.get(key));
    }
    public Builder clearEnvironments() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableEnvironments().clear();
      return this;
    }
    /**
     * <code>map&lt;string, .chalk.server.v1.BootstrapExtraSettingsEnvironment&gt; environments = 2 [json_name = "environments"];</code>
     */
    public Builder removeEnvironments(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableEnvironments().ensureBuilderMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment>
        getMutableEnvironments() {
      bitField0_ |= 0x00000002;
      return internalGetMutableEnvironments().ensureMessageMap();
    }
    /**
     * <code>map&lt;string, .chalk.server.v1.BootstrapExtraSettingsEnvironment&gt; environments = 2 [json_name = "environments"];</code>
     */
    public Builder putEnvironments(
        java.lang.String key,
        ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableEnvironments().ensureBuilderMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>map&lt;string, .chalk.server.v1.BootstrapExtraSettingsEnvironment&gt; environments = 2 [json_name = "environments"];</code>
     */
    public Builder putAllEnvironments(
        java.util.Map<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment> values) {
      for (java.util.Map.Entry<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment> e : values.entrySet()) {
        if (e.getKey() == null || e.getValue() == null) {
          throw new NullPointerException();
        }
      }
      internalGetMutableEnvironments().ensureBuilderMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>map&lt;string, .chalk.server.v1.BootstrapExtraSettingsEnvironment&gt; environments = 2 [json_name = "environments"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment.Builder putEnvironmentsBuilderIfAbsent(
        java.lang.String key) {
      java.util.Map<java.lang.String, ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironmentOrBuilder> builderMap = internalGetMutableEnvironments().ensureBuilderMap();
      ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironmentOrBuilder entry = builderMap.get(key);
      if (entry == null) {
        entry = ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment.newBuilder();
        builderMap.put(key, entry);
      }
      if (entry instanceof ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment) {
        entry = ((ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment) entry).toBuilder();
        builderMap.put(key, entry);
      }
      return (ai.chalk.protos.chalk.server.v1.BootstrapExtraSettingsEnvironment.Builder) entry;
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


    // @@protoc_insertion_point(builder_scope:chalk.server.v1.BootstrapExtraSettings)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.BootstrapExtraSettings)
  private static final ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings();
  }

  public static ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BootstrapExtraSettings>
      PARSER = new com.google.protobuf.AbstractParser<BootstrapExtraSettings>() {
    @java.lang.Override
    public BootstrapExtraSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<BootstrapExtraSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BootstrapExtraSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.BootstrapExtraSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

