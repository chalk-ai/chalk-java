// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/datasets.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public final class DatasetsProto {
  private DatasetsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_DatasetRevisionMeta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_DatasetRevisionMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_DatasetMeta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_DatasetMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_ListDatasetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_ListDatasetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_ListDatasetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_ListDatasetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetDatasetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetDatasetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetDatasetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_ListDatasetRevisionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_ListDatasetRevisionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_ListDatasetRevisionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_ListDatasetRevisionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetDatasetRevisionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetDatasetRevisionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetDatasetRevisionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetDatasetRevisionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036chalk/server/v1/datasets.proto\022\017chalk." +
      "server.v1\032\037chalk/auth/v1/permissions.pro" +
      "to\032\034google/protobuf/struct.proto\032\037google" +
      "/protobuf/timestamp.proto\"\266\n\n\023DatasetRev" +
      "isionMeta\022\035\n\nnumeric_id\030\001 \001(\003R\tnumericId" +
      "\022(\n\020offline_query_id\030\002 \001(\tR\016offlineQuery" +
      "Id\022\035\n\ndataset_id\030\003 \001(\tR\tdatasetId\022\"\n\ngiv" +
      "ens_uri\030\004 \001(\tH\000R\tgivensUri\210\001\001\022V\n\016givens_" +
      "version\030\005 \001(\0162*.chalk.server.v1.OfflineQ" +
      "ueryGivensVersionH\001R\rgivensVersion\210\001\001\022\"\n" +
      "\noutput_uri\030\006 \001(\tH\002R\toutputUri\210\001\001\022K\n\016out" +
      "put_version\030\007 \001(\0162\037.chalk.server.v1.Data" +
      "setVersionH\003R\routputVersion\210\001\001\022$\n\013branch" +
      "_name\030\010 \001(\tH\004R\nbranchName\210\001\001\022\036\n\010num_rows" +
      "\030\t \001(\003H\005R\007numRows\210\001\001\0223\n\023physical_size_by" +
      "tes\030\n \001(\003H\006R\021physicalSizeBytes\210\001\001\022%\n\016out" +
      "put_columns\030\013 \003(\tR\routputColumns\022\037\n\013outp" +
      "ut_fqns\030\014 \003(\tR\noutputFqns\022\036\n\010agent_id\030\r " +
      "\001(\tH\007R\007agentId\210\001\001\022B\n\014completed_at\030\016 \001(\0132" +
      "\032.google.protobuf.TimestampH\010R\013completed" +
      "At\210\001\001\022\"\n\nnum_shards\030\017 \001(\003H\tR\tnumShards\210\001" +
      "\001\022(\n\rnum_computers\030\020 \001(\003H\nR\014numComputers" +
      "\210\001\001\0227\n\010metadata\030\021 \001(\0132\026.google.protobuf." +
      "ValueH\013R\010metadata\210\001\001\022C\n\006status\030\022 \001(\0162&.c" +
      "halk.server.v1.DatasetRevisionStatusH\014R\006" +
      "status\210\001\001\0223\n\023num_rows_calculated\030\023 \001(\003H\r" +
      "R\021numRowsCalculated\210\001\001\022H\n\036physical_size_" +
      "bytes_calculated\030\024 \001(\003H\016R\033physicalSizeBy" +
      "tesCalculated\210\001\001\022>\n\ncreated_at\030\025 \001(\0132\032.g" +
      "oogle.protobuf.TimestampH\017R\tcreatedAt\210\001\001" +
      "B\r\n\013_givens_uriB\021\n\017_givens_versionB\r\n\013_o" +
      "utput_uriB\021\n\017_output_versionB\016\n\014_branch_" +
      "nameB\013\n\t_num_rowsB\026\n\024_physical_size_byte" +
      "sB\013\n\t_agent_idB\017\n\r_completed_atB\r\n\013_num_" +
      "shardsB\020\n\016_num_computersB\013\n\t_metadataB\t\n" +
      "\007_statusB\026\n\024_num_rows_calculatedB!\n\037_phy" +
      "sical_size_bytes_calculatedB\r\n\013_created_" +
      "at\"\256\002\n\013DatasetMeta\022\016\n\002id\030\001 \001(\tR\002id\022%\n\016en" +
      "vironment_id\030\002 \001(\tR\renvironmentId\022&\n\014dat" +
      "aset_name\030\003 \001(\tH\000R\013datasetName\210\001\001\0229\n\ncre" +
      "ated_at\030\005 \001(\0132\032.google.protobuf.Timestam" +
      "pR\tcreatedAt\022[\n\024most_recent_revision\030\007 \001" +
      "(\0132$.chalk.server.v1.DatasetRevisionMeta" +
      "H\001R\022mostRecentRevision\210\001\001B\017\n\r_dataset_na" +
      "meB\027\n\025_most_recent_revision\"\212\001\n\023ListData" +
      "setsRequest\022\033\n\006cursor\030\001 \001(\tH\000R\006cursor\210\001\001" +
      "\022\031\n\005limit\030\002 \001(\005H\001R\005limit\210\001\001\022\033\n\006search\030\003 " +
      "\001(\tH\002R\006search\210\001\001B\t\n\007_cursorB\010\n\006_limitB\t\n" +
      "\007_search\"x\n\024ListDatasetsResponse\0228\n\010data" +
      "sets\030\001 \003(\0132\034.chalk.server.v1.DatasetMeta" +
      "R\010datasets\022\033\n\006cursor\030\002 \001(\tH\000R\006cursor\210\001\001B" +
      "\t\n\007_cursor\"#\n\021GetDatasetRequest\022\016\n\002id\030\001 " +
      "\001(\tR\002id\"L\n\022GetDatasetResponse\0226\n\007dataset" +
      "\030\001 \001(\0132\034.chalk.server.v1.DatasetMetaR\007da" +
      "taset\"\211\001\n\033ListDatasetRevisionsRequest\022\035\n" +
      "\ndataset_id\030\001 \001(\tR\tdatasetId\022\033\n\006cursor\030\002" +
      " \001(\tH\000R\006cursor\210\001\001\022\031\n\005limit\030\003 \001(\005H\001R\005limi" +
      "t\210\001\001B\t\n\007_cursorB\010\n\006_limit\"\212\001\n\034ListDatase" +
      "tRevisionsResponse\022B\n\trevisions\030\001 \003(\0132$." +
      "chalk.server.v1.DatasetRevisionMetaR\trev" +
      "isions\022\033\n\006cursor\030\002 \001(\tH\000R\006cursor\210\001\001B\t\n\007_" +
      "cursor\"+\n\031GetDatasetRevisionRequest\022\016\n\002i" +
      "d\030\001 \001(\tR\002id\"^\n\032GetDatasetRevisionRespons" +
      "e\022@\n\010revision\030\001 \001(\0132$.chalk.server.v1.Da" +
      "tasetRevisionMetaR\010revision*\237\002\n\025DatasetR" +
      "evisionStatus\022\'\n#DATASET_REVISION_STATUS" +
      "_UNSPECIFIED\020\000\022#\n\037DATASET_REVISION_STATU" +
      "S_UNKNOWN\020\001\022#\n\037DATASET_REVISION_STATUS_W" +
      "ORKING\020\002\022%\n!DATASET_REVISION_STATUS_COMP" +
      "LETED\020\003\022\"\n\036DATASET_REVISION_STATUS_FAILE" +
      "D\020\004\022$\n DATASET_REVISION_STATUS_CANCELED\020" +
      "\005\022\"\n\036DATASET_REVISION_STATUS_QUEUED\020\006*\351\002" +
      "\n\016DatasetVersion\022\037\n\033DATASET_VERSION_UNSP" +
      "ECIFIED\020\000\022\033\n\027DATASET_VERSION_UNKNOWN\020\001\022:" +
      "\n6DATASET_VERSION_BIGQUERY_JOB_WITH_B32_" +
      "ENCODED_COLNAMES\020\002\022\"\n\036DATASET_VERSION_DA" +
      "TASET_WRITER\020\003\022=\n9DATASET_VERSION_BIGQUE" +
      "RY_JOB_WITH_B32_ENCODED_COLNAMES_V2\020\004\022.\n" +
      "*DATASET_VERSION_COMPUTE_RESOLVER_OUTPUT" +
      "_V1\020\005\022!\n\035DATASET_VERSION_NATIVE_DTYPES\020\006" +
      "\022\'\n#DATASET_VERSION_NATIVE_COLUMN_NAMES\020" +
      "\007*\255\002\n\031OfflineQueryGivensVersion\022,\n(OFFLI" +
      "NE_QUERY_GIVENS_VERSION_UNSPECIFIED\020\000\022(\n" +
      "$OFFLINE_QUERY_GIVENS_VERSION_UNKNOWN\020\001\022" +
      ">\n:OFFLINE_QUERY_GIVENS_VERSION_NATIVE_T" +
      "S_FEATURE_FOR_ROOT_NS\020\002\0223\n/OFFLINE_QUERY" +
      "_GIVENS_VERSION_SINGLE_TS_COL_NAME\020\003\022C\n?" +
      "OFFLINE_QUERY_GIVENS_VERSION_SINGLE_TS_C" +
      "OL_NAME_WITH_URI_PREFIX\020\0042\320\003\n\026DatasetMet" +
      "adataService\022c\n\014ListDatasets\022$.chalk.ser" +
      "ver.v1.ListDatasetsRequest\032%.chalk.serve" +
      "r.v1.ListDatasetsResponse\"\006\220\002\001\200}\004\022]\n\nGet" +
      "Dataset\022\".chalk.server.v1.GetDatasetRequ" +
      "est\032#.chalk.server.v1.GetDatasetResponse" +
      "\"\006\220\002\001\200}\004\022{\n\024ListDatasetRevisions\022,.chalk" +
      ".server.v1.ListDatasetRevisionsRequest\032-" +
      ".chalk.server.v1.ListDatasetRevisionsRes" +
      "ponse\"\006\220\002\001\200}\004\022u\n\022GetDatasetRevision\022*.ch" +
      "alk.server.v1.GetDatasetRevisionRequest\032" +
      "+.chalk.server.v1.GetDatasetRevisionResp" +
      "onse\"\006\220\002\001\200}\004B\242\001\n\037ai.chalk.protos.chalk.s" +
      "erver.v1B\rDatasetsProtoP\001Z\022server/v1;ser" +
      "verv1\242\002\003CSX\252\002\017Chalk.Server.V1\312\002\017Chalk\\Se" +
      "rver\\V1\342\002\033Chalk\\Server\\V1\\GPBMetadata\352\002\021" +
      "Chalk::Server::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_chalk_server_v1_DatasetRevisionMeta_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_server_v1_DatasetRevisionMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_DatasetRevisionMeta_descriptor,
        new java.lang.String[] { "NumericId", "OfflineQueryId", "DatasetId", "GivensUri", "GivensVersion", "OutputUri", "OutputVersion", "BranchName", "NumRows", "PhysicalSizeBytes", "OutputColumns", "OutputFqns", "AgentId", "CompletedAt", "NumShards", "NumComputers", "Metadata", "Status", "NumRowsCalculated", "PhysicalSizeBytesCalculated", "CreatedAt", });
    internal_static_chalk_server_v1_DatasetMeta_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_server_v1_DatasetMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_DatasetMeta_descriptor,
        new java.lang.String[] { "Id", "EnvironmentId", "DatasetName", "CreatedAt", "MostRecentRevision", });
    internal_static_chalk_server_v1_ListDatasetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chalk_server_v1_ListDatasetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_ListDatasetsRequest_descriptor,
        new java.lang.String[] { "Cursor", "Limit", "Search", });
    internal_static_chalk_server_v1_ListDatasetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chalk_server_v1_ListDatasetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_ListDatasetsResponse_descriptor,
        new java.lang.String[] { "Datasets", "Cursor", });
    internal_static_chalk_server_v1_GetDatasetRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_chalk_server_v1_GetDatasetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetDatasetRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_chalk_server_v1_GetDatasetResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_chalk_server_v1_GetDatasetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetDatasetResponse_descriptor,
        new java.lang.String[] { "Dataset", });
    internal_static_chalk_server_v1_ListDatasetRevisionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_chalk_server_v1_ListDatasetRevisionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_ListDatasetRevisionsRequest_descriptor,
        new java.lang.String[] { "DatasetId", "Cursor", "Limit", });
    internal_static_chalk_server_v1_ListDatasetRevisionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_chalk_server_v1_ListDatasetRevisionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_ListDatasetRevisionsResponse_descriptor,
        new java.lang.String[] { "Revisions", "Cursor", });
    internal_static_chalk_server_v1_GetDatasetRevisionRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_chalk_server_v1_GetDatasetRevisionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetDatasetRevisionRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_chalk_server_v1_GetDatasetRevisionResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_chalk_server_v1_GetDatasetRevisionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetDatasetRevisionResponse_descriptor,
        new java.lang.String[] { "Revision", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(ai.chalk.protos.chalk.auth.v1.PermissionsProto.permission);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
