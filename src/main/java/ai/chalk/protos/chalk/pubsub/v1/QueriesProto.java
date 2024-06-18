// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/pubsub/v1/queries.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.pubsub.v1;

public final class QueriesProto {
  private QueriesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_pubsub_v1_QueryMessagePubSub_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_pubsub_v1_QueryMessagePubSub_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_pubsub_v1_QueryMessagePubSub_QueryMetaEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_pubsub_v1_QueryMessagePubSub_QueryMetaEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035chalk/pubsub/v1/queries.proto\022\017chalk.p" +
      "ubsub.v1\032\034gen_bq_schema/bq_field.proto\032\034" +
      "gen_bq_schema/bq_table.proto\"\203\010\n\022QueryMe" +
      "ssagePubSub\022!\n\014operation_id\030\001 \001(\tR\013opera" +
      "tionId\022%\n\016environment_id\030\002 \001(\tR\renvironm" +
      "entId\022Q\n\nquery_meta\030\003 \003(\01322.chalk.pubsub" +
      ".v1.QueryMessagePubSub.QueryMetaEntryR\tq" +
      "ueryMeta\022\"\n\nquery_name\030\004 \001(\tH\000R\tqueryNam" +
      "e\210\001\001\0221\n\022query_name_version\030\005 \001(\tH\001R\020quer" +
      "yNameVersion\210\001\001\022*\n\016correlation_id\030\006 \001(\tH" +
      "\002R\rcorrelationId\210\001\001\022%\n\016input_features\030\007 " +
      "\003(\tR\rinputFeatures\022\'\n\017output_features\030\010 " +
      "\003(\tR\016outputFeatures\022(\n\020output_root_fqns\030" +
      "\t \003(\tR\016outputRootFqns\0223\n\025intermediate_fe" +
      "atures\030\n \003(\tR\024intermediateFeatures\022\034\n\tre" +
      "solvers\030\013 \003(\tR\tresolvers\022\'\n\rquery_plan_i" +
      "d\030\014 \001(\tH\003R\013queryPlanId\210\001\001\022-\n\ncreated_at\030" +
      "\r \001(\003B\016\352?\013\022\tTIMESTAMPR\tcreatedAt\022\"\n\nhas_" +
      "errors\030\016 \001(\010H\004R\thasErrors\210\001\001\022\036\n\010agent_id" +
      "\030\017 \001(\tH\005R\007agentId\210\001\001\022$\n\013branch_name\030\020 \001(" +
      "\tH\006R\nbranchName\210\001\001\022(\n\rdeployment_id\030\021 \001(" +
      "\tH\007R\014deploymentId\210\001\001\022+\n\017has_plan_stages\030" +
      "\022 \001(\010H\010R\rhasPlanStages\210\001\001\032<\n\016QueryMetaEn" +
      "try\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\tR\005va" +
      "lue:\0028\001:\014\352?\t\n\007queriesB\r\n\013_query_nameB\025\n\023" +
      "_query_name_versionB\021\n\017_correlation_idB\020" +
      "\n\016_query_plan_idB\r\n\013_has_errorsB\013\n\t_agen" +
      "t_idB\016\n\014_branch_nameB\020\n\016_deployment_idB\022" +
      "\n\020_has_plan_stagesB\241\001\n\037ai.chalk.protos.c" +
      "halk.pubsub.v1B\014QueriesProtoP\001Z\022pubsub/v" +
      "1;pubsubv1\242\002\003CPX\252\002\017Chalk.Pubsub.V1\312\002\017Cha" +
      "lk\\Pubsub\\V1\342\002\033Chalk\\Pubsub\\V1\\GPBMetada" +
      "ta\352\002\021Chalk::Pubsub::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.gen_bq_schema.BqFieldProto.getDescriptor(),
          ai.chalk.protos.gen_bq_schema.BqTableProto.getDescriptor(),
        });
    internal_static_chalk_pubsub_v1_QueryMessagePubSub_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_pubsub_v1_QueryMessagePubSub_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_pubsub_v1_QueryMessagePubSub_descriptor,
        new java.lang.String[] { "OperationId", "EnvironmentId", "QueryMeta", "QueryName", "QueryNameVersion", "CorrelationId", "InputFeatures", "OutputFeatures", "OutputRootFqns", "IntermediateFeatures", "Resolvers", "QueryPlanId", "CreatedAt", "HasErrors", "AgentId", "BranchName", "DeploymentId", "HasPlanStages", });
    internal_static_chalk_pubsub_v1_QueryMessagePubSub_QueryMetaEntry_descriptor =
      internal_static_chalk_pubsub_v1_QueryMessagePubSub_descriptor.getNestedTypes().get(0);
    internal_static_chalk_pubsub_v1_QueryMessagePubSub_QueryMetaEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_pubsub_v1_QueryMessagePubSub_QueryMetaEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(ai.chalk.protos.gen_bq_schema.BqFieldProto.bigquery);
    registry.add(ai.chalk.protos.gen_bq_schema.BqTableProto.bigqueryOpts);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    ai.chalk.protos.gen_bq_schema.BqFieldProto.getDescriptor();
    ai.chalk.protos.gen_bq_schema.BqTableProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
