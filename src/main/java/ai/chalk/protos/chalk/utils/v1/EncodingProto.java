// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/utils/v1/encoding.proto
// Protobuf Java Version: 4.26.1

package ai.chalk.protos.chalk.utils.v1;

public final class EncodingProto {
  private EncodingProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      EncodingProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(ai.chalk.protos.chalk.utils.v1.EncodingProto.encoding);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int ENCODING_FIELD_NUMBER = 80412;
  /**
   * <code>extend .google.protobuf.EnumOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.EnumOptions,
      ai.chalk.protos.chalk.utils.v1.StringEncoding> encoding = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        ai.chalk.protos.chalk.utils.v1.StringEncoding.class,
        ai.chalk.protos.chalk.utils.v1.StringEncoding.getDefaultInstance());
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_utils_v1_StringEncoding_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_utils_v1_StringEncoding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_utils_v1_StringEncoding_MappingEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_utils_v1_StringEncoding_MappingEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035chalk/utils/v1/encoding.proto\022\016chalk.u" +
      "tils.v1\032 google/protobuf/descriptor.prot" +
      "o\"\223\001\n\016StringEncoding\022E\n\007mapping\030\001 \003(\0132+." +
      "chalk.utils.v1.StringEncoding.MappingEnt" +
      "ryR\007mapping\032:\n\014MappingEntry\022\020\n\003key\030\001 \001(\005" +
      "R\003key\022\024\n\005value\030\002 \001(\tR\005value:\0028\001:]\n\010encod" +
      "ing\022\034.google.protobuf.EnumOptions\030\234\364\004 \001(" +
      "\0132\036.chalk.utils.v1.StringEncodingR\010encod" +
      "ing\210\001\001B\211\001\n\036ai.chalk.protos.chalk.utils.v" +
      "1B\rEncodingProtoP\001\242\002\003CUX\252\002\016Chalk.Utils.V" +
      "1\312\002\016Chalk\\Utils\\V1\342\002\032Chalk\\Utils\\V1\\GPBM" +
      "etadata\352\002\020Chalk::Utils::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_chalk_utils_v1_StringEncoding_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_utils_v1_StringEncoding_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_utils_v1_StringEncoding_descriptor,
        new java.lang.String[] { "Mapping", });
    internal_static_chalk_utils_v1_StringEncoding_MappingEntry_descriptor =
      internal_static_chalk_utils_v1_StringEncoding_descriptor.getNestedTypes().get(0);
    internal_static_chalk_utils_v1_StringEncoding_MappingEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_utils_v1_StringEncoding_MappingEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    encoding.internalInit(descriptor.getExtensions().get(0));
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
