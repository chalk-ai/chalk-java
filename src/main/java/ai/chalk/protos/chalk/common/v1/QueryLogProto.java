// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/query_log.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

public final class QueryLogProto {
  private QueryLogProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_VersionedQueryName_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_VersionedQueryName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_QueryLogFilters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_QueryLogFilters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_GetQueryLogEntriesPageToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_GetQueryLogEntriesPageToken_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_GetQueryLogEntriesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_GetQueryLogEntriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_QueryLogEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_QueryLogEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_GetQueryLogEntriesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_GetQueryLogEntriesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037chalk/common/v1/query_log.proto\022\017chalk" +
      ".common.v1\032$chalk/common/v1/operation_ki" +
      "nd.proto\032\"chalk/common/v1/query_status.p" +
      "roto\032\037google/protobuf/timestamp.proto\"}\n" +
      "\022VersionedQueryName\022\035\n\nquery_name\030\001 \001(\tR" +
      "\tqueryName\0221\n\022query_name_version\030\002 \001(\tH\000" +
      "R\020queryNameVersion\210\001\001B\025\n\023_query_name_ver" +
      "sion\"\357\003\n\017QueryLogFilters\022!\n\014operation_id" +
      "\030\001 \003(\tR\013operationId\022E\n\016operation_kind\030\002 " +
      "\003(\0162\036.chalk.common.v1.OperationKindR\rope" +
      "rationKind\022B\n\nquery_name\030\003 \003(\0132#.chalk.c" +
      "ommon.v1.VersionedQueryNameR\tqueryName\022\031" +
      "\n\010agent_id\030\005 \003(\tR\007agentId\022\037\n\013branch_name" +
      "\030\006 \003(\tR\nbranchName\022%\n\016correlation_id\030\007 \003" +
      "(\tR\rcorrelationId\022\031\n\010trace_id\030\010 \003(\tR\007tra" +
      "ceId\022\"\n\rquery_plan_id\030\t \003(\tR\013queryPlanId" +
      "\022#\n\rdeployment_id\030\n \003(\tR\014deploymentId\022?\n" +
      "\014query_status\030\013 \003(\0162\034.chalk.common.v1.Qu" +
      "eryStatusR\013queryStatus\022&\n\017meta_query_has" +
      "h\030\014 \003(\tR\rmetaQueryHash\"\223\001\n\033GetQueryLogEn" +
      "triesPageToken\022(\n\020operation_id_hwm\030\001 \001(\t" +
      "R\016operationIdHwm\022J\n\023query_timestamp_hwm\030" +
      "\002 \001(\0132\032.google.protobuf.TimestampR\021query" +
      "TimestampHwm\"\236\003\n\031GetQueryLogEntriesReque" +
      "st\022l\n%query_timestamp_lower_bound_inclus" +
      "ive\030\001 \001(\0132\032.google.protobuf.TimestampR!q" +
      "ueryTimestampLowerBoundInclusive\022q\n%quer" +
      "y_timestamp_upper_bound_exclusive\030\002 \001(\0132" +
      "\032.google.protobuf.TimestampH\000R!queryTime" +
      "stampUpperBoundExclusive\210\001\001\022:\n\007filters\030\003" +
      " \001(\0132 .chalk.common.v1.QueryLogFiltersR\007" +
      "filters\022\033\n\tpage_size\030\004 \001(\005R\010pageSize\022\035\n\n" +
      "page_token\030\005 \001(\tR\tpageTokenB(\n&_query_ti" +
      "mestamp_upper_bound_exclusive\"\243\006\n\rQueryL" +
      "ogEntry\022!\n\014operation_id\030\001 \001(\tR\013operation" +
      "Id\022%\n\016environment_id\030\002 \001(\tR\renvironmentI" +
      "d\022#\n\rdeployment_id\030\003 \001(\tR\014deploymentId\022E" +
      "\n\016operation_kind\030\004 \001(\0162\036.chalk.common.v1" +
      ".OperationKindR\roperationKind\022C\n\017query_t" +
      "imestamp\030\005 \001(\0132\032.google.protobuf.Timesta" +
      "mpR\016queryTimestamp\022L\n\024execution_started_" +
      "at\030\006 \001(\0132\032.google.protobuf.TimestampR\022ex" +
      "ecutionStartedAt\022N\n\025execution_finished_a" +
      "t\030\007 \001(\0132\032.google.protobuf.TimestampR\023exe" +
      "cutionFinishedAt\022?\n\014query_status\030\010 \001(\0162\034" +
      ".chalk.common.v1.QueryStatusR\013queryStatu" +
      "s\022\035\n\nquery_name\030\t \001(\tR\tqueryName\022,\n\022quer" +
      "y_name_version\030\n \001(\tR\020queryNameVersion\022\031" +
      "\n\010agent_id\030\013 \001(\tR\007agentId\022\037\n\013branch_name" +
      "\030\014 \001(\tR\nbranchName\022%\n\016correlation_id\030\r \001" +
      "(\tR\rcorrelationId\022\031\n\010trace_id\030\016 \001(\tR\007tra" +
      "ceId\022\"\n\rquery_plan_id\030\017 \001(\tR\013queryPlanId" +
      "\022!\n\014value_tables\030\020 \003(\tR\013valueTables\022&\n\017m" +
      "eta_query_hash\030\021 \001(\tR\rmetaQueryHash\"~\n\032G" +
      "etQueryLogEntriesResponse\0228\n\007entries\030\001 \003" +
      "(\0132\036.chalk.common.v1.QueryLogEntryR\007entr" +
      "ies\022&\n\017next_page_token\030\002 \001(\tR\rnextPageTo" +
      "kenB\216\001\n\037ai.chalk.protos.chalk.common.v1B" +
      "\rQueryLogProtoP\001\242\002\003CCX\252\002\017Chalk.Common.V1" +
      "\312\002\017Chalk\\Common\\V1\342\002\033Chalk\\Common\\V1\\GPB" +
      "Metadata\352\002\021Chalk::Common::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.common.v1.OperationKindProto.getDescriptor(),
          ai.chalk.protos.chalk.common.v1.QueryStatusProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_chalk_common_v1_VersionedQueryName_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_common_v1_VersionedQueryName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_VersionedQueryName_descriptor,
        new java.lang.String[] { "QueryName", "QueryNameVersion", });
    internal_static_chalk_common_v1_QueryLogFilters_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_common_v1_QueryLogFilters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_QueryLogFilters_descriptor,
        new java.lang.String[] { "OperationId", "OperationKind", "QueryName", "AgentId", "BranchName", "CorrelationId", "TraceId", "QueryPlanId", "DeploymentId", "QueryStatus", "MetaQueryHash", });
    internal_static_chalk_common_v1_GetQueryLogEntriesPageToken_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chalk_common_v1_GetQueryLogEntriesPageToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_GetQueryLogEntriesPageToken_descriptor,
        new java.lang.String[] { "OperationIdHwm", "QueryTimestampHwm", });
    internal_static_chalk_common_v1_GetQueryLogEntriesRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chalk_common_v1_GetQueryLogEntriesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_GetQueryLogEntriesRequest_descriptor,
        new java.lang.String[] { "QueryTimestampLowerBoundInclusive", "QueryTimestampUpperBoundExclusive", "Filters", "PageSize", "PageToken", });
    internal_static_chalk_common_v1_QueryLogEntry_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_chalk_common_v1_QueryLogEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_QueryLogEntry_descriptor,
        new java.lang.String[] { "OperationId", "EnvironmentId", "DeploymentId", "OperationKind", "QueryTimestamp", "ExecutionStartedAt", "ExecutionFinishedAt", "QueryStatus", "QueryName", "QueryNameVersion", "AgentId", "BranchName", "CorrelationId", "TraceId", "QueryPlanId", "ValueTables", "MetaQueryHash", });
    internal_static_chalk_common_v1_GetQueryLogEntriesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_chalk_common_v1_GetQueryLogEntriesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_GetQueryLogEntriesResponse_descriptor,
        new java.lang.String[] { "Entries", "NextPageToken", });
    ai.chalk.protos.chalk.common.v1.OperationKindProto.getDescriptor();
    ai.chalk.protos.chalk.common.v1.QueryStatusProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
