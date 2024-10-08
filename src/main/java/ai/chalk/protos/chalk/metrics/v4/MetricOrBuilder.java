// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/metrics/v4/metrics.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.metrics.v4;

public interface MetricOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.metrics.v4.Metric)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * optional because we may not have an id when we're doing the initial publish
   * </pre>
   *
   * <code>optional int64 id = 1 [json_name = "id"];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * optional because we may not have an id when we're doing the initial publish
   * </pre>
   *
   * <code>optional int64 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string environment_id = 2 [json_name = "environmentId"];</code>
   * @return The environmentId.
   */
  java.lang.String getEnvironmentId();
  /**
   * <code>string environment_id = 2 [json_name = "environmentId"];</code>
   * @return The bytes for environmentId.
   */
  com.google.protobuf.ByteString
      getEnvironmentIdBytes();

  /**
   * <code>.chalk.metrics.v4.MetricNamespace namespace = 3 [json_name = "namespace"];</code>
   * @return The enum numeric value on the wire for namespace.
   */
  int getNamespaceValue();
  /**
   * <code>.chalk.metrics.v4.MetricNamespace namespace = 3 [json_name = "namespace"];</code>
   * @return The namespace.
   */
  ai.chalk.protos.chalk.metrics.v4.MetricNamespace getNamespace();

  /**
   * <code>string source = 4 [json_name = "source"];</code>
   * @return The source.
   */
  java.lang.String getSource();
  /**
   * <code>string source = 4 [json_name = "source"];</code>
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <code>.chalk.metrics.v4.MetricName name = 5 [json_name = "name"];</code>
   * @return The enum numeric value on the wire for name.
   */
  int getNameValue();
  /**
   * <code>.chalk.metrics.v4.MetricName name = 5 [json_name = "name"];</code>
   * @return The name.
   */
  ai.chalk.protos.chalk.metrics.v4.MetricName getName();

  /**
   * <code>.chalk.metrics.v4.MetricType type = 6 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.chalk.metrics.v4.MetricType type = 6 [json_name = "type"];</code>
   * @return The type.
   */
  ai.chalk.protos.chalk.metrics.v4.MetricType getType();

  /**
   * <code>string sketch = 10 [json_name = "sketch"];</code>
   * @return Whether the sketch field is set.
   */
  boolean hasSketch();
  /**
   * <code>string sketch = 10 [json_name = "sketch"];</code>
   * @return The sketch.
   */
  java.lang.String getSketch();
  /**
   * <code>string sketch = 10 [json_name = "sketch"];</code>
   * @return The bytes for sketch.
   */
  com.google.protobuf.ByteString
      getSketchBytes();

  /**
   * <code>double numeric = 11 [json_name = "numeric"];</code>
   * @return Whether the numeric field is set.
   */
  boolean hasNumeric();
  /**
   * <code>double numeric = 11 [json_name = "numeric"];</code>
   * @return The numeric.
   */
  double getNumeric();

  /**
   * <code>optional .chalk.metrics.v4.MetricStatistics statistics = 12 [json_name = "statistics"];</code>
   * @return Whether the statistics field is set.
   */
  boolean hasStatistics();
  /**
   * <code>optional .chalk.metrics.v4.MetricStatistics statistics = 12 [json_name = "statistics"];</code>
   * @return The statistics.
   */
  ai.chalk.protos.chalk.metrics.v4.MetricStatistics getStatistics();
  /**
   * <code>optional .chalk.metrics.v4.MetricStatistics statistics = 12 [json_name = "statistics"];</code>
   */
  ai.chalk.protos.chalk.metrics.v4.MetricStatisticsOrBuilder getStatisticsOrBuilder();

  /**
   * <code>optional .google.protobuf.Timestamp observed_at = 20 [json_name = "observedAt"];</code>
   * @return Whether the observedAt field is set.
   */
  boolean hasObservedAt();
  /**
   * <code>optional .google.protobuf.Timestamp observed_at = 20 [json_name = "observedAt"];</code>
   * @return The observedAt.
   */
  com.google.protobuf.Timestamp getObservedAt();
  /**
   * <code>optional .google.protobuf.Timestamp observed_at = 20 [json_name = "observedAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getObservedAtOrBuilder();

  /**
   * <code>map&lt;string, string&gt; additional_tags = 30 [json_name = "additionalTags"];</code>
   */
  int getAdditionalTagsCount();
  /**
   * <code>map&lt;string, string&gt; additional_tags = 30 [json_name = "additionalTags"];</code>
   */
  boolean containsAdditionalTags(
      java.lang.String key);
  /**
   * Use {@link #getAdditionalTagsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAdditionalTags();
  /**
   * <code>map&lt;string, string&gt; additional_tags = 30 [json_name = "additionalTags"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAdditionalTagsMap();
  /**
   * <code>map&lt;string, string&gt; additional_tags = 30 [json_name = "additionalTags"];</code>
   */
  /* nullable */
java.lang.String getAdditionalTagsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; additional_tags = 30 [json_name = "additionalTags"];</code>
   */
  java.lang.String getAdditionalTagsOrThrow(
      java.lang.String key);

  ai.chalk.protos.chalk.metrics.v4.Metric.ValueCase getValueCase();
}