// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/aggregate/v1/timeseries.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.aggregate.v1;

public final class TimeseriesProto {
  private TimeseriesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_aggregate_v1_AggregateTimeSeriesRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_aggregate_v1_AggregateTimeSeriesRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_aggregate_v1_AggregateTimeSeries_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_aggregate_v1_AggregateTimeSeries_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#chalk/aggregate/v1/timeseries.proto\022\022c" +
      "halk.aggregate.v1\032\036google/protobuf/durat" +
      "ion.proto\"\222\002\n\027AggregateTimeSeriesRule\022 \n" +
      "\013aggregation\030\001 \001(\tR\013aggregation\022B\n\017bucke" +
      "t_duration\030\002 \001(\0132\031.google.protobuf.Durat" +
      "ionR\016bucketDuration\022-\n\022dependent_feature" +
      "s\030\003 \003(\tR\021dependentFeatures\0227\n\tretention\030" +
      "\004 \001(\0132\031.google.protobuf.DurationR\tretent" +
      "ion\022)\n\020datetime_feature\030\005 \001(\tR\017datetimeF" +
      "eature\"\214\002\n\023AggregateTimeSeries\022\034\n\tnamesp" +
      "ace\030\001 \001(\tR\tnamespace\022!\n\014aggregate_on\030\002 \001" +
      "(\tR\013aggregateOn\022\031\n\010group_by\030\003 \003(\tR\007group" +
      "By\022A\n\005rules\030\005 \003(\0132+.chalk.aggregate.v1.A" +
      "ggregateTimeSeriesRuleR\005rules\022/\n\023filters" +
      "_description\030\006 \001(\tR\022filtersDescription\022%" +
      "\n\016bucket_feature\030\007 \001(\tR\rbucketFeatureB\271\001" +
      "\n\"ai.chalk.protos.chalk.aggregate.v1B\017Ti" +
      "meseriesProtoP\001Z\030aggregate/v1;aggregatev" +
      "1\242\002\003CAX\252\002\022Chalk.Aggregate.V1\312\002\022Chalk\\Agg" +
      "regate\\V1\342\002\036Chalk\\Aggregate\\V1\\GPBMetada" +
      "ta\352\002\024Chalk::Aggregate::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_chalk_aggregate_v1_AggregateTimeSeriesRule_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_aggregate_v1_AggregateTimeSeriesRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_aggregate_v1_AggregateTimeSeriesRule_descriptor,
        new java.lang.String[] { "Aggregation", "BucketDuration", "DependentFeatures", "Retention", "DatetimeFeature", });
    internal_static_chalk_aggregate_v1_AggregateTimeSeries_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_aggregate_v1_AggregateTimeSeries_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_aggregate_v1_AggregateTimeSeries_descriptor,
        new java.lang.String[] { "Namespace", "AggregateOn", "GroupBy", "Rules", "FiltersDescription", "BucketFeature", });
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}