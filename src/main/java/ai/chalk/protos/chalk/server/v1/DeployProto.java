// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/deploy.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.server.v1;

public final class DeployProto {
  private DeployProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_DeployBranchRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_DeployBranchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_DeployBranchResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_DeployBranchResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetDeploymentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetDeploymentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetDeploymentResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034chalk/server/v1/deploy.proto\022\017chalk.se" +
      "rver.v1\032\037chalk/auth/v1/permissions.proto" +
      "\032 chalk/server/v1/deployment.proto\"\227\001\n\023D" +
      "eployBranchRequest\022\037\n\013branch_name\030\001 \001(\tR" +
      "\nbranchName\022!\n\014reset_branch\030\002 \001(\010R\013reset" +
      "Branch\022\030\n\007archive\030\003 \001(\014R\007archive\022\"\n\ris_h" +
      "ot_deploy\030\004 \001(\010R\013isHotDeploy\";\n\024DeployBr" +
      "anchResponse\022#\n\rdeployment_id\030\001 \001(\tR\014dep" +
      "loymentId\";\n\024GetDeploymentRequest\022#\n\rdep" +
      "loyment_id\030\001 \001(\tR\014deploymentId\"T\n\025GetDep" +
      "loymentResponse\022;\n\ndeployment\030\001 \001(\0132\033.ch" +
      "alk.server.v1.DeploymentR\ndeployment2\326\001\n" +
      "\rDeployService\022`\n\014DeployBranch\022$.chalk.s" +
      "erver.v1.DeployBranchRequest\032%.chalk.ser" +
      "ver.v1.DeployBranchResponse\"\003\200}\r\022c\n\rGetD" +
      "eployment\022%.chalk.server.v1.GetDeploymen" +
      "tRequest\032&.chalk.server.v1.GetDeployment" +
      "Response\"\003\200}\013B\240\001\n\037ai.chalk.protos.chalk." +
      "server.v1B\013DeployProtoP\001Z\022server/v1;serv" +
      "erv1\242\002\003CSX\252\002\017Chalk.Server.V1\312\002\017Chalk\\Ser" +
      "ver\\V1\342\002\033Chalk\\Server\\V1\\GPBMetadata\352\002\021C" +
      "halk::Server::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor(),
          ai.chalk.protos.chalk.server.v1.DeploymentProto.getDescriptor(),
        });
    internal_static_chalk_server_v1_DeployBranchRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_server_v1_DeployBranchRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_DeployBranchRequest_descriptor,
        new java.lang.String[] { "BranchName", "ResetBranch", "Archive", "IsHotDeploy", });
    internal_static_chalk_server_v1_DeployBranchResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_server_v1_DeployBranchResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_DeployBranchResponse_descriptor,
        new java.lang.String[] { "DeploymentId", });
    internal_static_chalk_server_v1_GetDeploymentRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chalk_server_v1_GetDeploymentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetDeploymentRequest_descriptor,
        new java.lang.String[] { "DeploymentId", });
    internal_static_chalk_server_v1_GetDeploymentResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chalk_server_v1_GetDeploymentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetDeploymentResponse_descriptor,
        new java.lang.String[] { "Deployment", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(ai.chalk.protos.chalk.auth.v1.PermissionsProto.permission);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor();
    ai.chalk.protos.chalk.server.v1.DeploymentProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
