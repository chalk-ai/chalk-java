// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/deployment.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.server.v1;

public final class DeploymentProto {
  private DeploymentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_Deployment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_Deployment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n chalk/server/v1/deployment.proto\022\017chal" +
      "k.server.v1\"~\n\nDeployment\022\016\n\002id\030\001 \001(\tR\002i" +
      "d\022%\n\016environment_id\030\002 \001(\tR\renvironmentId" +
      "\0229\n\006status\030\003 \001(\0162!.chalk.server.v1.Deplo" +
      "ymentStatusR\006status*\275\003\n\020DeploymentStatus" +
      "\022!\n\035DEPLOYMENT_STATUS_UNSPECIFIED\020\000\022\035\n\031D" +
      "EPLOYMENT_STATUS_UNKNOWN\020\001\022\035\n\031DEPLOYMENT" +
      "_STATUS_PENDING\020\002\022\034\n\030DEPLOYMENT_STATUS_Q" +
      "UEUED\020\003\022\035\n\031DEPLOYMENT_STATUS_WORKING\020\004\022\035" +
      "\n\031DEPLOYMENT_STATUS_SUCCESS\020\005\022\035\n\031DEPLOYM" +
      "ENT_STATUS_FAILURE\020\006\022$\n DEPLOYMENT_STATU" +
      "S_INTERNAL_ERROR\020\007\022\035\n\031DEPLOYMENT_STATUS_" +
      "TIMEOUT\020\010\022\037\n\033DEPLOYMENT_STATUS_CANCELLED" +
      "\020\t\022\035\n\031DEPLOYMENT_STATUS_EXPIRED\020\n\022!\n\035DEP" +
      "LOYMENT_STATUS_BOOT_ERRORS\020\013\022%\n!DEPLOYME" +
      "NT_STATUS_AWAITING_SOURCE\020\014B\244\001\n\037ai.chalk" +
      ".protos.chalk.server.v1B\017DeploymentProto" +
      "P\001Z\022server/v1;serverv1\242\002\003CSX\252\002\017Chalk.Ser" +
      "ver.V1\312\002\017Chalk\\Server\\V1\342\002\033Chalk\\Server\\" +
      "V1\\GPBMetadata\352\002\021Chalk::Server::V1b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_chalk_server_v1_Deployment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_server_v1_Deployment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_Deployment_descriptor,
        new java.lang.String[] { "Id", "EnvironmentId", "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
