// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v1/bloom_filter.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.engine.v1;

/**
 * Protobuf type {@code chalk.engine.v1.BloomFilter}
 */
public final class BloomFilter extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.engine.v1.BloomFilter)
    BloomFilterOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      BloomFilter.class.getName());
  }
  // Use BloomFilter.newBuilder() to construct.
  private BloomFilter(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private BloomFilter() {
    environment_ = "";
    namespace_ = "";
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.engine.v1.BloomFilterProto.internal_static_chalk_engine_v1_BloomFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.engine.v1.BloomFilterProto.internal_static_chalk_engine_v1_BloomFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.engine.v1.BloomFilter.class, ai.chalk.protos.chalk.engine.v1.BloomFilter.Builder.class);
  }

  public static final int ENVIRONMENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object environment_ = "";
  /**
   * <code>string environment = 1 [json_name = "environment"];</code>
   * @return The environment.
   */
  @java.lang.Override
  public java.lang.String getEnvironment() {
    java.lang.Object ref = environment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      environment_ = s;
      return s;
    }
  }
  /**
   * <code>string environment = 1 [json_name = "environment"];</code>
   * @return The bytes for environment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEnvironmentBytes() {
    java.lang.Object ref = environment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      environment_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAMESPACE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object namespace_ = "";
  /**
   * <code>string namespace = 2 [json_name = "namespace"];</code>
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
   * <code>string namespace = 2 [json_name = "namespace"];</code>
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

  public static final int NUM_ENTRIES_FIELD_NUMBER = 3;
  private long numEntries_ = 0L;
  /**
   * <pre>
   * number of items actually inserted into this bloom filter
   * </pre>
   *
   * <code>uint64 num_entries = 3 [json_name = "numEntries"];</code>
   * @return The numEntries.
   */
  @java.lang.Override
  public long getNumEntries() {
    return numEntries_;
  }

  public static final int NUM_EXPECTED_ENTRIES_FIELD_NUMBER = 4;
  private long numExpectedEntries_ = 0L;
  /**
   * <pre>
   * Expected max number of entries, used to calculate size w.r.t error rate
   * </pre>
   *
   * <code>uint64 num_expected_entries = 4 [json_name = "numExpectedEntries"];</code>
   * @return The numExpectedEntries.
   */
  @java.lang.Override
  public long getNumExpectedEntries() {
    return numExpectedEntries_;
  }

  public static final int NUM_HASHES_FIELD_NUMBER = 5;
  private long numHashes_ = 0L;
  /**
   * <code>uint64 num_hashes = 5 [json_name = "numHashes"];</code>
   * @return The numHashes.
   */
  @java.lang.Override
  public long getNumHashes() {
    return numHashes_;
  }

  public static final int SIZE_BYTES_FIELD_NUMBER = 6;
  private long sizeBytes_ = 0L;
  /**
   * <code>uint64 size_bytes = 6 [json_name = "sizeBytes"];</code>
   * @return The sizeBytes.
   */
  @java.lang.Override
  public long getSizeBytes() {
    return sizeBytes_;
  }

  public static final int DATA_FIELD_NUMBER = 7;
  private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes data = 7 [json_name = "data"];</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(environment_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, environment_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(namespace_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, namespace_);
    }
    if (numEntries_ != 0L) {
      output.writeUInt64(3, numEntries_);
    }
    if (numExpectedEntries_ != 0L) {
      output.writeUInt64(4, numExpectedEntries_);
    }
    if (numHashes_ != 0L) {
      output.writeUInt64(5, numHashes_);
    }
    if (sizeBytes_ != 0L) {
      output.writeUInt64(6, sizeBytes_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(7, data_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(environment_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, environment_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(namespace_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, namespace_);
    }
    if (numEntries_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, numEntries_);
    }
    if (numExpectedEntries_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, numExpectedEntries_);
    }
    if (numHashes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, numHashes_);
    }
    if (sizeBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, sizeBytes_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(7, data_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.engine.v1.BloomFilter)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.engine.v1.BloomFilter other = (ai.chalk.protos.chalk.engine.v1.BloomFilter) obj;

    if (!getEnvironment()
        .equals(other.getEnvironment())) return false;
    if (!getNamespace()
        .equals(other.getNamespace())) return false;
    if (getNumEntries()
        != other.getNumEntries()) return false;
    if (getNumExpectedEntries()
        != other.getNumExpectedEntries()) return false;
    if (getNumHashes()
        != other.getNumHashes()) return false;
    if (getSizeBytes()
        != other.getSizeBytes()) return false;
    if (!getData()
        .equals(other.getData())) return false;
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
    hash = (37 * hash) + ENVIRONMENT_FIELD_NUMBER;
    hash = (53 * hash) + getEnvironment().hashCode();
    hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
    hash = (53 * hash) + getNamespace().hashCode();
    hash = (37 * hash) + NUM_ENTRIES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumEntries());
    hash = (37 * hash) + NUM_EXPECTED_ENTRIES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumExpectedEntries());
    hash = (37 * hash) + NUM_HASHES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumHashes());
    hash = (37 * hash) + SIZE_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSizeBytes());
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.engine.v1.BloomFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.BloomFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.BloomFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.BloomFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.BloomFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.BloomFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.BloomFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.engine.v1.BloomFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.engine.v1.BloomFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.engine.v1.BloomFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.BloomFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.engine.v1.BloomFilter parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.engine.v1.BloomFilter prototype) {
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
   * Protobuf type {@code chalk.engine.v1.BloomFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.engine.v1.BloomFilter)
      ai.chalk.protos.chalk.engine.v1.BloomFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.engine.v1.BloomFilterProto.internal_static_chalk_engine_v1_BloomFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.engine.v1.BloomFilterProto.internal_static_chalk_engine_v1_BloomFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.engine.v1.BloomFilter.class, ai.chalk.protos.chalk.engine.v1.BloomFilter.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.engine.v1.BloomFilter.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      environment_ = "";
      namespace_ = "";
      numEntries_ = 0L;
      numExpectedEntries_ = 0L;
      numHashes_ = 0L;
      sizeBytes_ = 0L;
      data_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.engine.v1.BloomFilterProto.internal_static_chalk_engine_v1_BloomFilter_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.BloomFilter getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.engine.v1.BloomFilter.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.BloomFilter build() {
      ai.chalk.protos.chalk.engine.v1.BloomFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.BloomFilter buildPartial() {
      ai.chalk.protos.chalk.engine.v1.BloomFilter result = new ai.chalk.protos.chalk.engine.v1.BloomFilter(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.engine.v1.BloomFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.environment_ = environment_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.namespace_ = namespace_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.numEntries_ = numEntries_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.numExpectedEntries_ = numExpectedEntries_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.numHashes_ = numHashes_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.sizeBytes_ = sizeBytes_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.data_ = data_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.engine.v1.BloomFilter) {
        return mergeFrom((ai.chalk.protos.chalk.engine.v1.BloomFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.engine.v1.BloomFilter other) {
      if (other == ai.chalk.protos.chalk.engine.v1.BloomFilter.getDefaultInstance()) return this;
      if (!other.getEnvironment().isEmpty()) {
        environment_ = other.environment_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getNamespace().isEmpty()) {
        namespace_ = other.namespace_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getNumEntries() != 0L) {
        setNumEntries(other.getNumEntries());
      }
      if (other.getNumExpectedEntries() != 0L) {
        setNumExpectedEntries(other.getNumExpectedEntries());
      }
      if (other.getNumHashes() != 0L) {
        setNumHashes(other.getNumHashes());
      }
      if (other.getSizeBytes() != 0L) {
        setSizeBytes(other.getSizeBytes());
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
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
              environment_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              namespace_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              numEntries_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              numExpectedEntries_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              numHashes_ = input.readUInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              sizeBytes_ = input.readUInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 58: {
              data_ = input.readBytes();
              bitField0_ |= 0x00000040;
              break;
            } // case 58
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

    private java.lang.Object environment_ = "";
    /**
     * <code>string environment = 1 [json_name = "environment"];</code>
     * @return The environment.
     */
    public java.lang.String getEnvironment() {
      java.lang.Object ref = environment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        environment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string environment = 1 [json_name = "environment"];</code>
     * @return The bytes for environment.
     */
    public com.google.protobuf.ByteString
        getEnvironmentBytes() {
      java.lang.Object ref = environment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        environment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string environment = 1 [json_name = "environment"];</code>
     * @param value The environment to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironment(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      environment_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string environment = 1 [json_name = "environment"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEnvironment() {
      environment_ = getDefaultInstance().getEnvironment();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string environment = 1 [json_name = "environment"];</code>
     * @param value The bytes for environment to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironmentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      environment_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object namespace_ = "";
    /**
     * <code>string namespace = 2 [json_name = "namespace"];</code>
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
     * <code>string namespace = 2 [json_name = "namespace"];</code>
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
     * <code>string namespace = 2 [json_name = "namespace"];</code>
     * @param value The namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespace(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      namespace_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string namespace = 2 [json_name = "namespace"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNamespace() {
      namespace_ = getDefaultInstance().getNamespace();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string namespace = 2 [json_name = "namespace"];</code>
     * @param value The bytes for namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      namespace_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long numEntries_ ;
    /**
     * <pre>
     * number of items actually inserted into this bloom filter
     * </pre>
     *
     * <code>uint64 num_entries = 3 [json_name = "numEntries"];</code>
     * @return The numEntries.
     */
    @java.lang.Override
    public long getNumEntries() {
      return numEntries_;
    }
    /**
     * <pre>
     * number of items actually inserted into this bloom filter
     * </pre>
     *
     * <code>uint64 num_entries = 3 [json_name = "numEntries"];</code>
     * @param value The numEntries to set.
     * @return This builder for chaining.
     */
    public Builder setNumEntries(long value) {

      numEntries_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * number of items actually inserted into this bloom filter
     * </pre>
     *
     * <code>uint64 num_entries = 3 [json_name = "numEntries"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNumEntries() {
      bitField0_ = (bitField0_ & ~0x00000004);
      numEntries_ = 0L;
      onChanged();
      return this;
    }

    private long numExpectedEntries_ ;
    /**
     * <pre>
     * Expected max number of entries, used to calculate size w.r.t error rate
     * </pre>
     *
     * <code>uint64 num_expected_entries = 4 [json_name = "numExpectedEntries"];</code>
     * @return The numExpectedEntries.
     */
    @java.lang.Override
    public long getNumExpectedEntries() {
      return numExpectedEntries_;
    }
    /**
     * <pre>
     * Expected max number of entries, used to calculate size w.r.t error rate
     * </pre>
     *
     * <code>uint64 num_expected_entries = 4 [json_name = "numExpectedEntries"];</code>
     * @param value The numExpectedEntries to set.
     * @return This builder for chaining.
     */
    public Builder setNumExpectedEntries(long value) {

      numExpectedEntries_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Expected max number of entries, used to calculate size w.r.t error rate
     * </pre>
     *
     * <code>uint64 num_expected_entries = 4 [json_name = "numExpectedEntries"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNumExpectedEntries() {
      bitField0_ = (bitField0_ & ~0x00000008);
      numExpectedEntries_ = 0L;
      onChanged();
      return this;
    }

    private long numHashes_ ;
    /**
     * <code>uint64 num_hashes = 5 [json_name = "numHashes"];</code>
     * @return The numHashes.
     */
    @java.lang.Override
    public long getNumHashes() {
      return numHashes_;
    }
    /**
     * <code>uint64 num_hashes = 5 [json_name = "numHashes"];</code>
     * @param value The numHashes to set.
     * @return This builder for chaining.
     */
    public Builder setNumHashes(long value) {

      numHashes_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 num_hashes = 5 [json_name = "numHashes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNumHashes() {
      bitField0_ = (bitField0_ & ~0x00000010);
      numHashes_ = 0L;
      onChanged();
      return this;
    }

    private long sizeBytes_ ;
    /**
     * <code>uint64 size_bytes = 6 [json_name = "sizeBytes"];</code>
     * @return The sizeBytes.
     */
    @java.lang.Override
    public long getSizeBytes() {
      return sizeBytes_;
    }
    /**
     * <code>uint64 size_bytes = 6 [json_name = "sizeBytes"];</code>
     * @param value The sizeBytes to set.
     * @return This builder for chaining.
     */
    public Builder setSizeBytes(long value) {

      sizeBytes_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 size_bytes = 6 [json_name = "sizeBytes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSizeBytes() {
      bitField0_ = (bitField0_ & ~0x00000020);
      sizeBytes_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes data = 7 [json_name = "data"];</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <code>bytes data = 7 [json_name = "data"];</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      data_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>bytes data = 7 [json_name = "data"];</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000040);
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:chalk.engine.v1.BloomFilter)
  }

  // @@protoc_insertion_point(class_scope:chalk.engine.v1.BloomFilter)
  private static final ai.chalk.protos.chalk.engine.v1.BloomFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.engine.v1.BloomFilter();
  }

  public static ai.chalk.protos.chalk.engine.v1.BloomFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BloomFilter>
      PARSER = new com.google.protobuf.AbstractParser<BloomFilter>() {
    @java.lang.Override
    public BloomFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<BloomFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BloomFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.BloomFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

