// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/metrics/v4/metrics.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.metrics.v4;

public final class MetricsProto {
  private MetricsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_metrics_v4_Metric_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_metrics_v4_Metric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_metrics_v4_Metric_AdditionalTagsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_metrics_v4_Metric_AdditionalTagsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_metrics_v4_MetricStatistics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_metrics_v4_MetricStatistics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036chalk/metrics/v4/metrics.proto\022\020chalk." +
      "metrics.v4\032\037google/protobuf/timestamp.pr" +
      "oto\"\213\005\n\006Metric\022\023\n\002id\030\001 \001(\003H\001R\002id\210\001\001\022%\n\016e" +
      "nvironment_id\030\002 \001(\tR\renvironmentId\022?\n\tna" +
      "mespace\030\003 \001(\0162!.chalk.metrics.v4.MetricN" +
      "amespaceR\tnamespace\022\026\n\006source\030\004 \001(\tR\006sou" +
      "rce\0220\n\004name\030\005 \001(\0162\034.chalk.metrics.v4.Met" +
      "ricNameR\004name\0220\n\004type\030\006 \001(\0162\034.chalk.metr" +
      "ics.v4.MetricTypeR\004type\022\030\n\006sketch\030\n \001(\tH" +
      "\000R\006sketch\022\032\n\007numeric\030\013 \001(\001H\000R\007numeric\022G\n" +
      "\nstatistics\030\014 \001(\0132\".chalk.metrics.v4.Met" +
      "ricStatisticsH\002R\nstatistics\210\001\001\022@\n\013observ" +
      "ed_at\030\024 \001(\0132\032.google.protobuf.TimestampH" +
      "\003R\nobservedAt\210\001\001\022U\n\017additional_tags\030\036 \003(" +
      "\0132,.chalk.metrics.v4.Metric.AdditionalTa" +
      "gsEntryR\016additionalTags\032A\n\023AdditionalTag" +
      "sEntry\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\tR" +
      "\005value:\0028\001B\007\n\005valueB\005\n\003_idB\r\n\013_statistic" +
      "sB\016\n\014_observed_at\"\370\001\n\020MetricStatistics\022\025" +
      "\n\003min\030\001 \001(\001H\000R\003min\210\001\001\022\025\n\003max\030\002 \001(\001H\001R\003ma" +
      "x\210\001\001\022\031\n\005count\030\003 \001(\004H\002R\005count\210\001\001\022\"\n\nnull_" +
      "count\030\004 \001(\004H\003R\tnullCount\210\001\001\022\027\n\004mean\030\005 \001(" +
      "\001H\004R\004mean\210\001\001\022\037\n\010variance\030\006 \001(\001H\005R\010varian" +
      "ce\210\001\001B\006\n\004_minB\006\n\004_maxB\010\n\006_countB\r\n\013_null" +
      "_countB\007\n\005_meanB\013\n\t_variance*~\n\nMetricTy" +
      "pe\022\033\n\027METRIC_TYPE_UNSPECIFIED\020\000\022\027\n\023METRI" +
      "C_TYPE_COUNTER\020\001\022\037\n\033METRIC_TYPE_UP_DOWN_" +
      "COUNTER\020\002\022\031\n\025METRIC_TYPE_HISTOGRAM\020\003*n\n\017" +
      "MetricNamespace\022 \n\034METRIC_NAMESPACE_UNSP" +
      "ECIFIED\020\000\022\034\n\030METRIC_NAMESPACE_FEATURE\020\001\022" +
      "\033\n\027METRIC_NAMESPACE_SYSTEM\020\002*\211\003\n\nMetricN" +
      "ame\022\033\n\027METRIC_NAME_UNSPECIFIED\020\000\022#\n\037METR" +
      "IC_NAME_DEFAULT_VALUES_USED\020\001\022\"\n\036METRIC_" +
      "NAME_GIVENS_VALUES_USED\020\002\022)\n%METRIC_NAME" +
      "_OFFLINE_STORE_VALUES_USED\020\003\022(\n$METRIC_N" +
      "AME_ONLINE_STORE_VALUES_USED\020\004\022$\n METRIC" +
      "_NAME_RESOLVER_VALUES_USED\020\005\022\032\n\026METRIC_N" +
      "AME_NULL_COUNT\020\006\022\036\n\032METRIC_NAME_NON_NULL" +
      "_COUNT\020\007\022\035\n\031METRIC_NAME_MISSING_COUNT\020\010\022" +
      "\032\n\026METRIC_NAME_ZERO_COUNT\020\t\022#\n\037METRIC_NA" +
      "ME_VALUES_DISTRIBUTION\020\nB\222\001\n ai.chalk.pr" +
      "otos.chalk.metrics.v4B\014MetricsProtoP\001\242\002\003" +
      "CMX\252\002\020Chalk.Metrics.V4\312\002\020Chalk\\Metrics\\V" +
      "4\342\002\034Chalk\\Metrics\\V4\\GPBMetadata\352\002\022Chalk" +
      "::Metrics::V4b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_chalk_metrics_v4_Metric_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_metrics_v4_Metric_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_metrics_v4_Metric_descriptor,
        new java.lang.String[] { "Id", "EnvironmentId", "Namespace", "Source", "Name", "Type", "Sketch", "Numeric", "Statistics", "ObservedAt", "AdditionalTags", "Value", });
    internal_static_chalk_metrics_v4_Metric_AdditionalTagsEntry_descriptor =
      internal_static_chalk_metrics_v4_Metric_descriptor.getNestedTypes().get(0);
    internal_static_chalk_metrics_v4_Metric_AdditionalTagsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_metrics_v4_Metric_AdditionalTagsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_chalk_metrics_v4_MetricStatistics_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_metrics_v4_MetricStatistics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_metrics_v4_MetricStatistics_descriptor,
        new java.lang.String[] { "Min", "Max", "Count", "NullCount", "Mean", "Variance", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}