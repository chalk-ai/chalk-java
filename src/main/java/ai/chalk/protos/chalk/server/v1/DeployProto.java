// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/deploy.proto

// Protobuf Java Version: 3.25.1
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
    internal_static_chalk_server_v1_CreateBranchFromSourceDeploymentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_CreateBranchFromSourceDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_CreateBranchFromSourceDeploymentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_CreateBranchFromSourceDeploymentResponse_fieldAccessorTable;
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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_ListDeploymentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_ListDeploymentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_ListDeploymentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_ListDeploymentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_SuspendDeploymentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_SuspendDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_SuspendDeploymentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_SuspendDeploymentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_ScaleDeploymentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_ScaleDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_ScaleDeploymentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_ScaleDeploymentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_TagDeploymentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_TagDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_TagDeploymentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_TagDeploymentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetActiveDeploymentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetActiveDeploymentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetActiveDeploymentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetActiveDeploymentsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034chalk/server/v1/deploy.proto\022\017chalk.se" +
      "rver.v1\032\037chalk/artifacts/v1/export.proto" +
      "\032\031chalk/auth/v1/audit.proto\032\037chalk/auth/" +
      "v1/permissions.proto\032!chalk/common/v1/ch" +
      "alk_error.proto\032\032chalk/graph/v1/graph.pr" +
      "oto\032 chalk/server/v1/deployment.proto\032\033g" +
      "oogle/protobuf/empty.proto\"\227\001\n\023DeployBra" +
      "nchRequest\022\037\n\013branch_name\030\001 \001(\tR\nbranchN" +
      "ame\022!\n\014reset_branch\030\002 \001(\010R\013resetBranch\022\030" +
      "\n\007archive\030\003 \001(\014R\007archive\022\"\n\ris_hot_deplo" +
      "y\030\004 \001(\010R\013isHotDeploy\"\211\002\n\024DeployBranchRes" +
      "ponse\022#\n\rdeployment_id\030\001 \001(\tR\014deployment" +
      "Id\0224\n\005graph\030\002 \001(\0132\025.chalk.graph.v1.Graph" +
      "B\002\030\001H\000R\005graph\210\001\001\022H\n\021deployment_errors\030\003 " +
      "\003(\0132\033.chalk.common.v1.ChalkErrorR\020deploy" +
      "mentErrors\0227\n\006export\030\004 \001(\0132\032.chalk.artif" +
      "acts.v1.ExportH\001R\006export\210\001\001B\010\n\006_graphB\t\n" +
      "\007_export\"\222\002\n\'CreateBranchFromSourceDeplo" +
      "ymentRequest\022\037\n\013branch_name\030\001 \001(\tR\nbranc" +
      "hName\022.\n\022source_branch_name\030\002 \001(\tH\000R\020sou" +
      "rceBranchName\0222\n\024source_deployment_id\030\003 " +
      "\001(\tH\000R\022sourceDeploymentId\022X\n\033current_mai" +
      "nline_deployment\030\004 \001(\0132\026.google.protobuf" +
      ".EmptyH\000R\031currentMainlineDeploymentB\010\n\006s" +
      "ource\"\221\002\n(CreateBranchFromSourceDeployme" +
      "ntResponse\022#\n\rdeployment_id\030\001 \001(\tR\014deplo" +
      "ymentId\022H\n\021deployment_errors\030\002 \003(\0132\033.cha" +
      "lk.common.v1.ChalkErrorR\020deploymentError" +
      "s\0227\n\006export\030\003 \001(\0132\032.chalk.artifacts.v1.E" +
      "xportH\000R\006export\210\001\001\0222\n\025branch_already_exi" +
      "sts\030\004 \001(\010R\023branchAlreadyExistsB\t\n\007_expor" +
      "t\";\n\024GetDeploymentRequest\022#\n\rdeployment_" +
      "id\030\001 \001(\tR\014deploymentId\"T\n\025GetDeploymentR" +
      "esponse\022;\n\ndeployment\030\001 \001(\0132\033.chalk.serv" +
      "er.v1.DeploymentR\ndeployment\"\332\001\n\026ListDep" +
      "loymentsRequest\022\033\n\006cursor\030\001 \001(\tH\000R\006curso" +
      "r\210\001\001\022\031\n\005limit\030\002 \001(\005H\001R\005limit\210\001\001\022*\n\016inclu" +
      "de_branch\030\003 \001(\010H\002R\rincludeBranch\210\001\001\022$\n\013b" +
      "ranch_name\030\004 \001(\tH\003R\nbranchName\210\001\001B\t\n\007_cu" +
      "rsorB\010\n\006_limitB\021\n\017_include_branchB\016\n\014_br" +
      "anch_name\"\200\001\n\027ListDeploymentsResponse\022=\n" +
      "\013deployments\030\001 \003(\0132\033.chalk.server.v1.Dep" +
      "loymentR\013deployments\022\033\n\006cursor\030\002 \001(\tH\000R\006" +
      "cursor\210\001\001B\t\n\007_cursor\"?\n\030SuspendDeploymen" +
      "tRequest\022#\n\rdeployment_id\030\001 \001(\tR\014deploym" +
      "entId\"X\n\031SuspendDeploymentResponse\022;\n\nde" +
      "ployment\030\001 \001(\0132\033.chalk.server.v1.Deploym" +
      "entR\ndeployment\"v\n\026ScaleDeploymentReques" +
      "t\022#\n\rdeployment_id\030\001 \001(\tR\014deploymentId\0227" +
      "\n\006sizing\030\002 \001(\0132\037.chalk.server.v1.Instanc" +
      "eSizingR\006sizing\"V\n\027ScaleDeploymentRespon" +
      "se\022;\n\ndeployment\030\001 \001(\0132\033.chalk.server.v1" +
      ".DeploymentR\ndeployment\"M\n\024TagDeployment" +
      "Request\022#\n\rdeployment_id\030\001 \001(\tR\014deployme" +
      "ntId\022\020\n\003tag\030\002 \001(\tR\003tag\"\252\001\n\025TagDeployment" +
      "Response\022;\n\ndeployment\030\001 \001(\0132\033.chalk.ser" +
      "ver.v1.DeploymentR\ndeployment\0229\n\026untagge" +
      "d_deployment_id\030\002 \001(\tH\000R\024untaggedDeploym" +
      "entId\210\001\001B\031\n\027_untagged_deployment_id\"\035\n\033G" +
      "etActiveDeploymentsRequest\"]\n\034GetActiveD" +
      "eploymentsResponse\022=\n\013deployments\030\001 \003(\0132" +
      "\033.chalk.server.v1.DeploymentR\013deployment" +
      "s2\255\007\n\rDeployService\022`\n\014DeployBranch\022$.ch" +
      "alk.server.v1.DeployBranchRequest\032%.chal" +
      "k.server.v1.DeployBranchResponse\"\003\200}\r\022\234\001" +
      "\n CreateBranchFromSourceDeployment\0228.cha" +
      "lk.server.v1.CreateBranchFromSourceDeplo" +
      "ymentRequest\0329.chalk.server.v1.CreateBra" +
      "nchFromSourceDeploymentResponse\"\003\200}\r\022c\n\r" +
      "GetDeployment\022%.chalk.server.v1.GetDeplo" +
      "ymentRequest\032&.chalk.server.v1.GetDeploy" +
      "mentResponse\"\003\200}\013\022i\n\017ListDeployments\022\'.c" +
      "halk.server.v1.ListDeploymentsRequest\032(." +
      "chalk.server.v1.ListDeploymentsResponse\"" +
      "\003\200}\013\022x\n\024GetActiveDeployments\022,.chalk.ser" +
      "ver.v1.GetActiveDeploymentsRequest\032-.cha" +
      "lk.server.v1.GetActiveDeploymentsRespons" +
      "e\"\003\200}\002\022u\n\021SuspendDeployment\022).chalk.serv" +
      "er.v1.SuspendDeploymentRequest\032*.chalk.s" +
      "erver.v1.SuspendDeploymentResponse\"\t\200}\014\212" +
      "\323\016\002\010\002\022o\n\017ScaleDeployment\022\'.chalk.server." +
      "v1.ScaleDeploymentRequest\032(.chalk.server" +
      ".v1.ScaleDeploymentResponse\"\t\200}\014\212\323\016\002\010\002\022i" +
      "\n\rTagDeployment\022%.chalk.server.v1.TagDep" +
      "loymentRequest\032&.chalk.server.v1.TagDepl" +
      "oymentResponse\"\t\200}\014\212\323\016\002\010\002B\240\001\n\037ai.chalk.p" +
      "rotos.chalk.server.v1B\013DeployProtoP\001Z\022se" +
      "rver/v1;serverv1\242\002\003CSX\252\002\017Chalk.Server.V1" +
      "\312\002\017Chalk\\Server\\V1\342\002\033Chalk\\Server\\V1\\GPB" +
      "Metadata\352\002\021Chalk::Server::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.artifacts.v1.ExportProto.getDescriptor(),
          ai.chalk.protos.chalk.auth.v1.AuditProto.getDescriptor(),
          ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor(),
          ai.chalk.protos.chalk.common.v1.ChalkErrorProto.getDescriptor(),
          ai.chalk.protos.chalk.graph.v1.GraphProto.getDescriptor(),
          ai.chalk.protos.chalk.server.v1.DeploymentProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
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
        new java.lang.String[] { "DeploymentId", "Graph", "DeploymentErrors", "Export", });
    internal_static_chalk_server_v1_CreateBranchFromSourceDeploymentRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chalk_server_v1_CreateBranchFromSourceDeploymentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_CreateBranchFromSourceDeploymentRequest_descriptor,
        new java.lang.String[] { "BranchName", "SourceBranchName", "SourceDeploymentId", "CurrentMainlineDeployment", "Source", });
    internal_static_chalk_server_v1_CreateBranchFromSourceDeploymentResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chalk_server_v1_CreateBranchFromSourceDeploymentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_CreateBranchFromSourceDeploymentResponse_descriptor,
        new java.lang.String[] { "DeploymentId", "DeploymentErrors", "Export", "BranchAlreadyExists", });
    internal_static_chalk_server_v1_GetDeploymentRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_chalk_server_v1_GetDeploymentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetDeploymentRequest_descriptor,
        new java.lang.String[] { "DeploymentId", });
    internal_static_chalk_server_v1_GetDeploymentResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_chalk_server_v1_GetDeploymentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetDeploymentResponse_descriptor,
        new java.lang.String[] { "Deployment", });
    internal_static_chalk_server_v1_ListDeploymentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_chalk_server_v1_ListDeploymentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_ListDeploymentsRequest_descriptor,
        new java.lang.String[] { "Cursor", "Limit", "IncludeBranch", "BranchName", });
    internal_static_chalk_server_v1_ListDeploymentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_chalk_server_v1_ListDeploymentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_ListDeploymentsResponse_descriptor,
        new java.lang.String[] { "Deployments", "Cursor", });
    internal_static_chalk_server_v1_SuspendDeploymentRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_chalk_server_v1_SuspendDeploymentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_SuspendDeploymentRequest_descriptor,
        new java.lang.String[] { "DeploymentId", });
    internal_static_chalk_server_v1_SuspendDeploymentResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_chalk_server_v1_SuspendDeploymentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_SuspendDeploymentResponse_descriptor,
        new java.lang.String[] { "Deployment", });
    internal_static_chalk_server_v1_ScaleDeploymentRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_chalk_server_v1_ScaleDeploymentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_ScaleDeploymentRequest_descriptor,
        new java.lang.String[] { "DeploymentId", "Sizing", });
    internal_static_chalk_server_v1_ScaleDeploymentResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_chalk_server_v1_ScaleDeploymentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_ScaleDeploymentResponse_descriptor,
        new java.lang.String[] { "Deployment", });
    internal_static_chalk_server_v1_TagDeploymentRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_chalk_server_v1_TagDeploymentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_TagDeploymentRequest_descriptor,
        new java.lang.String[] { "DeploymentId", "Tag", });
    internal_static_chalk_server_v1_TagDeploymentResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_chalk_server_v1_TagDeploymentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_TagDeploymentResponse_descriptor,
        new java.lang.String[] { "Deployment", "UntaggedDeploymentId", });
    internal_static_chalk_server_v1_GetActiveDeploymentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_chalk_server_v1_GetActiveDeploymentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetActiveDeploymentsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_chalk_server_v1_GetActiveDeploymentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_chalk_server_v1_GetActiveDeploymentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetActiveDeploymentsResponse_descriptor,
        new java.lang.String[] { "Deployments", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(ai.chalk.protos.chalk.auth.v1.AuditProto.audit);
    registry.add(ai.chalk.protos.chalk.auth.v1.PermissionsProto.permission);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    ai.chalk.protos.chalk.artifacts.v1.ExportProto.getDescriptor();
    ai.chalk.protos.chalk.auth.v1.AuditProto.getDescriptor();
    ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor();
    ai.chalk.protos.chalk.common.v1.ChalkErrorProto.getDescriptor();
    ai.chalk.protos.chalk.graph.v1.GraphProto.getDescriptor();
    ai.chalk.protos.chalk.server.v1.DeploymentProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
