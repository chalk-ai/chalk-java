// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/upload_features.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

public final class UploadFeaturesProto {
  private UploadFeaturesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_UploadFeaturesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_UploadFeaturesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_UploadFeaturesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_UploadFeaturesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%chalk/common/v1/upload_features.proto\022" +
      "\017chalk.common.v1\032!chalk/common/v1/chalk_" +
      "error.proto\":\n\025UploadFeaturesRequest\022!\n\014" +
      "inputs_table\030\001 \001(\014R\013inputsTable\"p\n\026Uploa" +
      "dFeaturesResponse\0223\n\006errors\030\001 \003(\0132\033.chal" +
      "k.common.v1.ChalkErrorR\006errors\022!\n\014operat" +
      "ion_id\030\002 \001(\tR\013operationIdB\224\001\n\037ai.chalk.p" +
      "rotos.chalk.common.v1B\023UploadFeaturesPro" +
      "toP\001\242\002\003CCX\252\002\017Chalk.Common.V1\312\002\017Chalk\\Com" +
      "mon\\V1\342\002\033Chalk\\Common\\V1\\GPBMetadata\352\002\021C" +
      "halk::Common::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.common.v1.ChalkErrorProto.getDescriptor(),
        });
    internal_static_chalk_common_v1_UploadFeaturesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_common_v1_UploadFeaturesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_UploadFeaturesRequest_descriptor,
        new java.lang.String[] { "InputsTable", });
    internal_static_chalk_common_v1_UploadFeaturesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_common_v1_UploadFeaturesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_UploadFeaturesResponse_descriptor,
        new java.lang.String[] { "Errors", "OperationId", });
    ai.chalk.protos.chalk.common.v1.ChalkErrorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
