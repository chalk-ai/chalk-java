// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v2/query_values.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.engine.v2;

public final class QueryValuesProto {
  private QueryValuesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v2_OperationIdTableIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_engine_v2_OperationIdTableIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v2_TableNameTableIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_engine_v2_TableNameTableIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v2_GetQueryValuesPageToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_engine_v2_GetQueryValuesPageToken_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v2_GetQueryValuesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_engine_v2_GetQueryValuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v2_GetQueryValuesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_engine_v2_GetQueryValuesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"chalk/engine/v2/query_values.proto\022\017ch" +
      "alk.engine.v2\032\037chalk/common/v1/query_log" +
      ".proto\032\037google/protobuf/timestamp.proto\"" +
      "?\n\032OperationIdTableIdentifier\022!\n\014operati" +
      "on_id\030\001 \001(\tR\013operationId\"u\n\030TableNameTab" +
      "leIdentifier\022\035\n\ntable_name\030\001 \001(\tR\ttableN" +
      "ame\022:\n\007filters\030\002 \001(\0132 .chalk.common.v1.Q" +
      "ueryLogFiltersR\007filters\"\255\001\n\027GetQueryValu" +
      "esPageToken\022J\n\023query_timestamp_hwm\030\001 \001(\013" +
      "2\032.google.protobuf.TimestampR\021queryTimes" +
      "tampHwm\022(\n\020operation_id_hwm\030\002 \001(\tR\016opera" +
      "tionIdHwm\022\034\n\nrow_id_hwm\030\003 \001(\003R\010rowIdHwm\"" +
      "\326\004\n\025GetQueryValuesRequest\022e\n\027operation_i" +
      "d_identifier\030\001 \001(\0132+.chalk.engine.v2.Ope" +
      "rationIdTableIdentifierH\000R\025operationIdId" +
      "entifier\022_\n\025table_name_identifier\030\002 \001(\0132" +
      ").chalk.engine.v2.TableNameTableIdentifi" +
      "erH\000R\023tableNameIdentifier\022l\n%query_times" +
      "tamp_lower_bound_inclusive\030\003 \001(\0132\032.googl" +
      "e.protobuf.TimestampR!queryTimestampLowe" +
      "rBoundInclusive\022q\n%query_timestamp_upper" +
      "_bound_exclusive\030\004 \001(\0132\032.google.protobuf" +
      ".TimestampH\001R!queryTimestampUpperBoundEx" +
      "clusive\210\001\001\022\032\n\010features\030\005 \003(\tR\010features\022\033" +
      "\n\tpage_size\030\007 \001(\005R\010pageSize\022\035\n\npage_toke" +
      "n\030\010 \001(\tR\tpageTokenB\022\n\020table_identifierB(" +
      "\n&_query_timestamp_upper_bound_exclusive" +
      "\"g\n\026GetQueryValuesResponse\022&\n\017next_page_" +
      "token\030\001 \001(\tR\rnextPageToken\022\032\n\007parquet\030\002 " +
      "\001(\014H\000R\007parquetB\t\n\007payloadB\221\001\n\037ai.chalk.p" +
      "rotos.chalk.engine.v2B\020QueryValuesProtoP" +
      "\001\242\002\003CEX\252\002\017Chalk.Engine.V2\312\002\017Chalk\\Engine" +
      "\\V2\342\002\033Chalk\\Engine\\V2\\GPBMetadata\352\002\021Chal" +
      "k::Engine::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.common.v1.QueryLogProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_chalk_engine_v2_OperationIdTableIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_engine_v2_OperationIdTableIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_engine_v2_OperationIdTableIdentifier_descriptor,
        new java.lang.String[] { "OperationId", });
    internal_static_chalk_engine_v2_TableNameTableIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_engine_v2_TableNameTableIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_engine_v2_TableNameTableIdentifier_descriptor,
        new java.lang.String[] { "TableName", "Filters", });
    internal_static_chalk_engine_v2_GetQueryValuesPageToken_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chalk_engine_v2_GetQueryValuesPageToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_engine_v2_GetQueryValuesPageToken_descriptor,
        new java.lang.String[] { "QueryTimestampHwm", "OperationIdHwm", "RowIdHwm", });
    internal_static_chalk_engine_v2_GetQueryValuesRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chalk_engine_v2_GetQueryValuesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_engine_v2_GetQueryValuesRequest_descriptor,
        new java.lang.String[] { "OperationIdIdentifier", "TableNameIdentifier", "QueryTimestampLowerBoundInclusive", "QueryTimestampUpperBoundExclusive", "Features", "PageSize", "PageToken", "TableIdentifier", });
    internal_static_chalk_engine_v2_GetQueryValuesResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_chalk_engine_v2_GetQueryValuesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_engine_v2_GetQueryValuesResponse_descriptor,
        new java.lang.String[] { "NextPageToken", "Parquet", "Payload", });
    ai.chalk.protos.chalk.common.v1.QueryLogProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
