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
    internal_static_chalk_metrics_v4_MetricBatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_metrics_v4_MetricBatch_fieldAccessorTable;
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
      "oto\"A\n\013MetricBatch\0222\n\007metrics\030\001 \003(\0132\030.ch" +
      "alk.metrics.v4.MetricR\007metrics\"\213\005\n\006Metri" +
      "c\022\023\n\002id\030\001 \001(\003H\001R\002id\210\001\001\022%\n\016environment_id" +
      "\030\002 \001(\tR\renvironmentId\022?\n\tnamespace\030\003 \001(\016" +
      "2!.chalk.metrics.v4.MetricNamespaceR\tnam" +
      "espace\022\026\n\006source\030\004 \001(\tR\006source\0220\n\004name\030\005" +
      " \001(\0162\034.chalk.metrics.v4.MetricNameR\004name" +
      "\0220\n\004type\030\006 \001(\0162\034.chalk.metrics.v4.Metric" +
      "TypeR\004type\022\030\n\006sketch\030\n \001(\tH\000R\006sketch\022\032\n\007" +
      "numeric\030\013 \001(\001H\000R\007numeric\022G\n\nstatistics\030\014" +
      " \001(\0132\".chalk.metrics.v4.MetricStatistics" +
      "H\002R\nstatistics\210\001\001\022@\n\013observed_at\030\024 \001(\0132\032" +
      ".google.protobuf.TimestampH\003R\nobservedAt" +
      "\210\001\001\022U\n\017additional_tags\030\036 \003(\0132,.chalk.met" +
      "rics.v4.Metric.AdditionalTagsEntryR\016addi" +
      "tionalTags\032A\n\023AdditionalTagsEntry\022\020\n\003key" +
      "\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\tR\005value:\0028\001B\007\n" +
      "\005valueB\005\n\003_idB\r\n\013_statisticsB\016\n\014_observe" +
      "d_at\"\370\001\n\020MetricStatistics\022\025\n\003min\030\001 \001(\001H\000" +
      "R\003min\210\001\001\022\025\n\003max\030\002 \001(\001H\001R\003max\210\001\001\022\031\n\005count" +
      "\030\003 \001(\004H\002R\005count\210\001\001\022\"\n\nnull_count\030\004 \001(\004H\003" +
      "R\tnullCount\210\001\001\022\027\n\004mean\030\005 \001(\001H\004R\004mean\210\001\001\022" +
      "\037\n\010variance\030\006 \001(\001H\005R\010variance\210\001\001B\006\n\004_min" +
      "B\006\n\004_maxB\010\n\006_countB\r\n\013_null_countB\007\n\005_me" +
      "anB\013\n\t_variance*~\n\nMetricType\022\033\n\027METRIC_" +
      "TYPE_UNSPECIFIED\020\000\022\027\n\023METRIC_TYPE_COUNTE" +
      "R\020\001\022\037\n\033METRIC_TYPE_UP_DOWN_COUNTER\020\002\022\031\n\025" +
      "METRIC_TYPE_HISTOGRAM\020\003*n\n\017MetricNamespa" +
      "ce\022 \n\034METRIC_NAMESPACE_UNSPECIFIED\020\000\022\034\n\030" +
      "METRIC_NAMESPACE_FEATURE\020\001\022\033\n\027METRIC_NAM" +
      "ESPACE_SYSTEM\020\002*\211\003\n\nMetricName\022\033\n\027METRIC" +
      "_NAME_UNSPECIFIED\020\000\022#\n\037METRIC_NAME_DEFAU" +
      "LT_VALUES_USED\020\001\022\"\n\036METRIC_NAME_GIVENS_V" +
      "ALUES_USED\020\002\022)\n%METRIC_NAME_OFFLINE_STOR" +
      "E_VALUES_USED\020\003\022(\n$METRIC_NAME_ONLINE_ST" +
      "ORE_VALUES_USED\020\004\022$\n METRIC_NAME_RESOLVE" +
      "R_VALUES_USED\020\005\022\032\n\026METRIC_NAME_NULL_COUN" +
      "T\020\006\022\036\n\032METRIC_NAME_NON_NULL_COUNT\020\007\022\035\n\031M" +
      "ETRIC_NAME_MISSING_COUNT\020\010\022\032\n\026METRIC_NAM" +
      "E_ZERO_COUNT\020\t\022#\n\037METRIC_NAME_VALUES_DIS" +
      "TRIBUTION\020\nB\222\001\n ai.chalk.protos.chalk.me" +
      "trics.v4B\014MetricsProtoP\001\242\002\003CMX\252\002\020Chalk.M" +
      "etrics.V4\312\002\020Chalk\\Metrics\\V4\342\002\034Chalk\\Met" +
      "rics\\V4\\GPBMetadata\352\002\022Chalk::Metrics::V4" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_chalk_metrics_v4_MetricBatch_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_metrics_v4_MetricBatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_metrics_v4_MetricBatch_descriptor,
        new java.lang.String[] { "Metrics", });
    internal_static_chalk_metrics_v4_Metric_descriptor =
      getDescriptor().getMessageTypes().get(1);
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
      getDescriptor().getMessageTypes().get(2);
    internal_static_chalk_metrics_v4_MetricStatistics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_metrics_v4_MetricStatistics_descriptor,
        new java.lang.String[] { "Min", "Max", "Count", "NullCount", "Mean", "Variance", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
