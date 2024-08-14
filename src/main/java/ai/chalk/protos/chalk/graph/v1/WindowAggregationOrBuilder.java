// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.graph.v1;

public interface WindowAggregationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.graph.v1.WindowAggregation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string namespace = 1 [json_name = "namespace"];</code>
   * @return The namespace.
   */
  java.lang.String getNamespace();
  /**
   * <code>string namespace = 1 [json_name = "namespace"];</code>
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();

  /**
   * <code>repeated .chalk.graph.v1.FeatureReference group_by = 2 [json_name = "groupBy"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.graph.v1.FeatureReference> 
      getGroupByList();
  /**
   * <code>repeated .chalk.graph.v1.FeatureReference group_by = 2 [json_name = "groupBy"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.FeatureReference getGroupBy(int index);
  /**
   * <code>repeated .chalk.graph.v1.FeatureReference group_by = 2 [json_name = "groupBy"];</code>
   */
  int getGroupByCount();
  /**
   * <code>repeated .chalk.graph.v1.FeatureReference group_by = 2 [json_name = "groupBy"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.graph.v1.FeatureReferenceOrBuilder> 
      getGroupByOrBuilderList();
  /**
   * <code>repeated .chalk.graph.v1.FeatureReference group_by = 2 [json_name = "groupBy"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.FeatureReferenceOrBuilder getGroupByOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Duration bucket_duration = 3 [json_name = "bucketDuration"];</code>
   * @return Whether the bucketDuration field is set.
   */
  boolean hasBucketDuration();
  /**
   * <code>.google.protobuf.Duration bucket_duration = 3 [json_name = "bucketDuration"];</code>
   * @return The bucketDuration.
   */
  com.google.protobuf.Duration getBucketDuration();
  /**
   * <code>.google.protobuf.Duration bucket_duration = 3 [json_name = "bucketDuration"];</code>
   */
  com.google.protobuf.DurationOrBuilder getBucketDurationOrBuilder();

  /**
   * <code>string aggregation = 4 [json_name = "aggregation"];</code>
   * @return The aggregation.
   */
  java.lang.String getAggregation();
  /**
   * <code>string aggregation = 4 [json_name = "aggregation"];</code>
   * @return The bytes for aggregation.
   */
  com.google.protobuf.ByteString
      getAggregationBytes();

  /**
   * <code>optional .chalk.graph.v1.FeatureReference aggregate_on = 5 [json_name = "aggregateOn"];</code>
   * @return Whether the aggregateOn field is set.
   */
  boolean hasAggregateOn();
  /**
   * <code>optional .chalk.graph.v1.FeatureReference aggregate_on = 5 [json_name = "aggregateOn"];</code>
   * @return The aggregateOn.
   */
  ai.chalk.protos.chalk.graph.v1.FeatureReference getAggregateOn();
  /**
   * <code>optional .chalk.graph.v1.FeatureReference aggregate_on = 5 [json_name = "aggregateOn"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.FeatureReferenceOrBuilder getAggregateOnOrBuilder();

  /**
   * <code>.chalk.arrow.v1.ArrowType arrow_type = 6 [json_name = "arrowType"];</code>
   * @return Whether the arrowType field is set.
   */
  boolean hasArrowType();
  /**
   * <code>.chalk.arrow.v1.ArrowType arrow_type = 6 [json_name = "arrowType"];</code>
   * @return The arrowType.
   */
  ai.chalk.protos.chalk.arrow.v1.ArrowType getArrowType();
  /**
   * <code>.chalk.arrow.v1.ArrowType arrow_type = 6 [json_name = "arrowType"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ArrowTypeOrBuilder getArrowTypeOrBuilder();
}
