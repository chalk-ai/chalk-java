// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/graph.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public final class GraphProto {
  private GraphProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_FeatureSQL_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_FeatureSQL_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetFeatureSQLResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetFeatureSQLResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetFeatureSQLRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetFeatureSQLRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_FeatureMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_FeatureMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetFeaturesMetadataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetFeaturesMetadataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetFeaturesMetadataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetFeaturesMetadataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_UpdateGraphRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_UpdateGraphRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_UpdateGraphResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_UpdateGraphResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetGraphRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetGraphRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetGraphResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetGraphResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033chalk/server/v1/graph.proto\022\017chalk.ser" +
      "ver.v1\032\037chalk/auth/v1/permissions.proto\032" +
      "\032chalk/graph/v1/graph.proto\"\330\004\n\nFeatureS" +
      "QL\022\016\n\002id\030\001 \001(\003R\002id\022%\n\016environment_id\030\002 \001" +
      "(\tR\renvironmentId\022(\n\rdeployment_id\030\003 \001(\t" +
      "H\000R\014deploymentId\210\001\001\022\020\n\003fqn\030\004 \001(\tR\003fqn\022\022\n" +
      "\004name\030\005 \001(\tR\004name\022\034\n\tnamespace\030\006 \001(\tR\tna" +
      "mespace\022(\n\rmax_staleness\030\007 \001(\tH\001R\014maxSta" +
      "leness\210\001\001\0221\n\025etl_offline_to_online\030\010 \001(\010" +
      "R\022etlOfflineToOnline\022%\n\013description\030\t \001(" +
      "\tH\002R\013description\210\001\001\022\031\n\005owner\030\n \001(\tH\003R\005ow" +
      "ner\210\001\001\022\022\n\004tags\030\013 \003(\tR\004tags\022\033\n\tkind_enum\030" +
      "\014 \001(\tR\010kindEnum\022\022\n\004kind\030\r \001(\tR\004kind\022\033\n\tw" +
      "as_reset\030\016 \001(\010R\010wasReset\022.\n\020internal_ver" +
      "sion\030\017 \001(\003H\004R\017internalVersion\210\001\001\022!\n\014is_s" +
      "ingleton\030\020 \001(\010R\013isSingletonB\020\n\016_deployme" +
      "nt_idB\020\n\016_max_stalenessB\016\n\014_descriptionB" +
      "\010\n\006_ownerB\023\n\021_internal_version\"P\n\025GetFea" +
      "tureSQLResponse\0227\n\010features\030\001 \003(\0132\033.chal" +
      "k.server.v1.FeatureSQLR\010features\";\n\024GetF" +
      "eatureSQLRequest\022#\n\rdeployment_id\030\001 \001(\tR" +
      "\014deploymentId\"\264\002\n\017FeatureMetadata\022\020\n\003fqn" +
      "\030\001 \001(\tR\003fqn\022\022\n\004name\030\002 \001(\tR\004name\022\034\n\tnames" +
      "pace\030\003 \001(\tR\tnamespace\022%\n\013description\030\004 \001" +
      "(\tH\000R\013description\210\001\001\022\031\n\005owner\030\005 \001(\tH\001R\005o" +
      "wner\210\001\001\022\022\n\004tags\030\006 \003(\tR\004tags\022(\n\rmax_stale" +
      "ness\030\007 \001(\tH\002R\014maxStaleness\210\001\001\0221\n\025etl_off" +
      "line_to_online\030\010 \001(\010R\022etlOfflineToOnline" +
      "B\016\n\014_descriptionB\010\n\006_ownerB\020\n\016_max_stale" +
      "ness\"\247\001\n\033GetFeaturesMetadataResponse\022<\n\010" +
      "features\030\001 \003(\0132 .chalk.server.v1.Feature" +
      "MetadataR\010features\022%\n\016environment_id\030\002 \001" +
      "(\tR\renvironmentId\022#\n\rdeployment_id\030\003 \001(\t" +
      "R\014deploymentId\"\034\n\032GetFeaturesMetadataReq" +
      "uest\"\256\001\n\022UpdateGraphRequest\022#\n\rdeploymen" +
      "t_id\030\001 \001(\tR\014deploymentId\022+\n\005graph\030\002 \001(\0132" +
      "\025.chalk.graph.v1.GraphR\005graph\022\'\n\017chalkpy" +
      "_version\030\003 \001(\tR\016chalkpyVersion\022\025\n\003tag\030\004 " +
      "\001(\tH\000R\003tag\210\001\001B\006\n\004_tag\"\025\n\023UpdateGraphResp" +
      "onse\"6\n\017GetGraphRequest\022#\n\rdeployment_id" +
      "\030\001 \001(\tR\014deploymentId\"\207\001\n\020GetGraphRespons" +
      "e\022+\n\005graph\030\001 \001(\0132\025.chalk.graph.v1.GraphR" +
      "\005graph\022\'\n\017chalkpy_version\030\002 \001(\tR\016chalkpy" +
      "Version\022\025\n\003tag\030\003 \001(\tH\000R\003tag\210\001\001B\006\n\004_tag2\250" +
      "\003\n\014GraphService\022f\n\rGetFeatureSQL\022%.chalk" +
      ".server.v1.GetFeatureSQLRequest\032&.chalk." +
      "server.v1.GetFeatureSQLResponse\"\006\220\002\001\200}\013\022" +
      "x\n\023GetFeaturesMetadata\022+.chalk.server.v1" +
      ".GetFeaturesMetadataRequest\032,.chalk.serv" +
      "er.v1.GetFeaturesMetadataResponse\"\006\220\002\001\200}" +
      "\013\022W\n\010GetGraph\022 .chalk.server.v1.GetGraph" +
      "Request\032!.chalk.server.v1.GetGraphRespon" +
      "se\"\006\220\002\001\200}\013\022]\n\013UpdateGraph\022#.chalk.server" +
      ".v1.UpdateGraphRequest\032$.chalk.server.v1" +
      ".UpdateGraphResponse\"\003\200}\013B\237\001\n\037ai.chalk.p" +
      "rotos.chalk.server.v1B\nGraphProtoP\001Z\022ser" +
      "ver/v1;serverv1\242\002\003CSX\252\002\017Chalk.Server.V1\312" +
      "\002\017Chalk\\Server\\V1\342\002\033Chalk\\Server\\V1\\GPBM" +
      "etadata\352\002\021Chalk::Server::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor(),
          ai.chalk.protos.chalk.graph.v1.GraphProto.getDescriptor(),
        });
    internal_static_chalk_server_v1_FeatureSQL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_server_v1_FeatureSQL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_FeatureSQL_descriptor,
        new java.lang.String[] { "Id", "EnvironmentId", "DeploymentId", "Fqn", "Name", "Namespace", "MaxStaleness", "EtlOfflineToOnline", "Description", "Owner", "Tags", "KindEnum", "Kind", "WasReset", "InternalVersion", "IsSingleton", });
    internal_static_chalk_server_v1_GetFeatureSQLResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_server_v1_GetFeatureSQLResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetFeatureSQLResponse_descriptor,
        new java.lang.String[] { "Features", });
    internal_static_chalk_server_v1_GetFeatureSQLRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chalk_server_v1_GetFeatureSQLRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetFeatureSQLRequest_descriptor,
        new java.lang.String[] { "DeploymentId", });
    internal_static_chalk_server_v1_FeatureMetadata_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chalk_server_v1_FeatureMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_FeatureMetadata_descriptor,
        new java.lang.String[] { "Fqn", "Name", "Namespace", "Description", "Owner", "Tags", "MaxStaleness", "EtlOfflineToOnline", });
    internal_static_chalk_server_v1_GetFeaturesMetadataResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_chalk_server_v1_GetFeaturesMetadataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetFeaturesMetadataResponse_descriptor,
        new java.lang.String[] { "Features", "EnvironmentId", "DeploymentId", });
    internal_static_chalk_server_v1_GetFeaturesMetadataRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_chalk_server_v1_GetFeaturesMetadataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetFeaturesMetadataRequest_descriptor,
        new java.lang.String[] { });
    internal_static_chalk_server_v1_UpdateGraphRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_chalk_server_v1_UpdateGraphRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_UpdateGraphRequest_descriptor,
        new java.lang.String[] { "DeploymentId", "Graph", "ChalkpyVersion", "Tag", });
    internal_static_chalk_server_v1_UpdateGraphResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_chalk_server_v1_UpdateGraphResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_UpdateGraphResponse_descriptor,
        new java.lang.String[] { });
    internal_static_chalk_server_v1_GetGraphRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_chalk_server_v1_GetGraphRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetGraphRequest_descriptor,
        new java.lang.String[] { "DeploymentId", });
    internal_static_chalk_server_v1_GetGraphResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_chalk_server_v1_GetGraphResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetGraphResponse_descriptor,
        new java.lang.String[] { "Graph", "ChalkpyVersion", "Tag", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(ai.chalk.protos.chalk.auth.v1.PermissionsProto.permission);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor();
    ai.chalk.protos.chalk.graph.v1.GraphProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
