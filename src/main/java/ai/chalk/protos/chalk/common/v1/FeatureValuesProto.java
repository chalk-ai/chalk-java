// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/feature_values.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

public final class FeatureValuesProto {
  private FeatureValuesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_GetFeatureValuesChartRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_GetFeatureValuesChartRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_GetFeatureValuesChartResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_GetFeatureValuesChartResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartV2Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartV2Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartV2Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartV2Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$chalk/common/v1/feature_values.proto\022\017" +
      "chalk.common.v1\032)chalk/chart/v1/densetim" +
      "eserieschart.proto\032\033chalk/common/v1/char" +
      "t.proto\032\036google/protobuf/duration.proto\032" +
      "\037google/protobuf/timestamp.proto\"\377\001\n\034Get" +
      "FeatureValuesChartRequest\022\020\n\003fqn\030\001 \001(\tR\003" +
      "fqn\022K\n\014aggregate_by\030\002 \003(\0162(.chalk.common" +
      ".v1.FeatureValueAggregationR\013aggregateBy" +
      "\022(\n\rwindow_period\030\003 \001(\tH\000R\014windowPeriod\210" +
      "\001\001\022\031\n\010start_ms\030\004 \001(\003R\007startMs\022\032\n\006end_ms\030" +
      "\005 \001(\003H\001R\005endMs\210\001\001:\002\030\001B\020\n\016_window_periodB" +
      "\t\n\007_end_ms\"Q\n\035GetFeatureValuesChartRespo" +
      "nse\022,\n\005chart\030\001 \001(\0132\026.chalk.common.v1.Cha" +
      "rtR\005chart:\002\030\001\"\257\003\n&GetFeatureValuesTimeSe" +
      "riesChartRequest\022\020\n\003fqn\030\001 \001(\tR\003fqn\022K\n\014ag" +
      "gregate_by\030\002 \003(\0162(.chalk.common.v1.Featu" +
      "reValueAggregationR\013aggregateBy\022C\n\rwindo" +
      "w_period\030\003 \001(\0132\031.google.protobuf.Duratio" +
      "nH\000R\014windowPeriod\210\001\001\022V\n\031start_timestamp_" +
      "inclusive\030\004 \001(\0132\032.google.protobuf.Timest" +
      "ampR\027startTimestampInclusive\022W\n\027end_time" +
      "stamp_exclusive\030\005 \001(\0132\032.google.protobuf." +
      "TimestampH\001R\025endTimestampExclusive\210\001\001:\002\030" +
      "\001B\020\n\016_window_periodB\032\n\030_end_timestamp_ex" +
      "clusive\"3\n\'GetFeatureValuesTimeSeriesCha" +
      "rtResponse:\002\030\001J\004\010\001\020\002\"\261\003\n(GetFeatureValue" +
      "sTimeSeriesChartV2Request\022\020\n\003fqn\030\001 \001(\tR\003" +
      "fqn\022K\n\014aggregate_by\030\002 \003(\0162(.chalk.common" +
      ".v1.FeatureValueAggregationR\013aggregateBy" +
      "\022C\n\rwindow_period\030\003 \001(\0132\031.google.protobu" +
      "f.DurationH\000R\014windowPeriod\210\001\001\022V\n\031start_t" +
      "imestamp_inclusive\030\004 \001(\0132\032.google.protob" +
      "uf.TimestampR\027startTimestampInclusive\022W\n" +
      "\027end_timestamp_exclusive\030\005 \001(\0132\032.google." +
      "protobuf.TimestampH\001R\025endTimestampExclus" +
      "ive\210\001\001:\002\030\001B\020\n\016_window_periodB\032\n\030_end_tim" +
      "estamp_exclusive\"k\n)GetFeatureValuesTime" +
      "SeriesChartV2Response\022:\n\005chart\030\001 \001(\0132$.c" +
      "halk.chart.v1.DenseTimeSeriesChartR\005char" +
      "t:\002\030\001*\252\004\n\027FeatureValueAggregation\022)\n%FEA" +
      "TURE_VALUE_AGGREGATION_UNSPECIFIED\020\000\022+\n\'" +
      "FEATURE_VALUE_AGGREGATION_UNIQUE_VALUES\020" +
      "\001\0220\n,FEATURE_VALUE_AGGREGATION_TOTAL_OBS" +
      "ERVATIONS\020\002\022-\n)FEATURE_VALUE_AGGREGATION" +
      "_NULL_PERCENTAGE\020\003\022\'\n#FEATURE_VALUE_AGGR" +
      "EGATION_MAX_VALUE\020\004\022\'\n#FEATURE_VALUE_AGG" +
      "REGATION_MIN_VALUE\020\005\022%\n!FEATURE_VALUE_AG" +
      "GREGATION_AVERAGE\020\006\022*\n&FEATURE_VALUE_AGG" +
      "REGATION_UNIQUE_PKEYS\020\007\022!\n\035FEATURE_VALUE" +
      "_AGGREGATION_P95\020\010\022!\n\035FEATURE_VALUE_AGGR" +
      "EGATION_P75\020\t\022!\n\035FEATURE_VALUE_AGGREGATI" +
      "ON_P50\020\n\022!\n\035FEATURE_VALUE_AGGREGATION_P2" +
      "5\020\013\022!\n\035FEATURE_VALUE_AGGREGATION_P05\020\014\032\002" +
      "\030\001B\223\001\n\037ai.chalk.protos.chalk.common.v1B\022" +
      "FeatureValuesProtoP\001\242\002\003CCX\252\002\017Chalk.Commo" +
      "n.V1\312\002\017Chalk\\Common\\V1\342\002\033Chalk\\Common\\V1" +
      "\\GPBMetadata\352\002\021Chalk::Common::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.chart.v1.DensetimeserieschartProto.getDescriptor(),
          ai.chalk.protos.chalk.common.v1.ChartProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_chalk_common_v1_GetFeatureValuesChartRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_common_v1_GetFeatureValuesChartRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_GetFeatureValuesChartRequest_descriptor,
        new java.lang.String[] { "Fqn", "AggregateBy", "WindowPeriod", "StartMs", "EndMs", });
    internal_static_chalk_common_v1_GetFeatureValuesChartResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_common_v1_GetFeatureValuesChartResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_GetFeatureValuesChartResponse_descriptor,
        new java.lang.String[] { "Chart", });
    internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartRequest_descriptor,
        new java.lang.String[] { "Fqn", "AggregateBy", "WindowPeriod", "StartTimestampInclusive", "EndTimestampExclusive", });
    internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartResponse_descriptor,
        new java.lang.String[] { });
    internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartV2Request_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartV2Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartV2Request_descriptor,
        new java.lang.String[] { "Fqn", "AggregateBy", "WindowPeriod", "StartTimestampInclusive", "EndTimestampExclusive", });
    internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartV2Response_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartV2Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartV2Response_descriptor,
        new java.lang.String[] { "Chart", });
    ai.chalk.protos.chalk.chart.v1.DensetimeserieschartProto.getDescriptor();
    ai.chalk.protos.chalk.common.v1.ChartProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
