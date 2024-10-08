// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/feature_values.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

public interface GetFeatureValuesTimeSeriesChartV2RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.GetFeatureValuesTimeSeriesChartV2Request)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string fqn = 1 [json_name = "fqn"];</code>
   * @return The fqn.
   */
  java.lang.String getFqn();
  /**
   * <code>string fqn = 1 [json_name = "fqn"];</code>
   * @return The bytes for fqn.
   */
  com.google.protobuf.ByteString
      getFqnBytes();

  /**
   * <code>repeated .chalk.common.v1.FeatureValueAggregation aggregate_by = 2 [json_name = "aggregateBy"];</code>
   * @return A list containing the aggregateBy.
   */
  java.util.List<ai.chalk.protos.chalk.common.v1.FeatureValueAggregation> getAggregateByList();
  /**
   * <code>repeated .chalk.common.v1.FeatureValueAggregation aggregate_by = 2 [json_name = "aggregateBy"];</code>
   * @return The count of aggregateBy.
   */
  int getAggregateByCount();
  /**
   * <code>repeated .chalk.common.v1.FeatureValueAggregation aggregate_by = 2 [json_name = "aggregateBy"];</code>
   * @param index The index of the element to return.
   * @return The aggregateBy at the given index.
   */
  ai.chalk.protos.chalk.common.v1.FeatureValueAggregation getAggregateBy(int index);
  /**
   * <code>repeated .chalk.common.v1.FeatureValueAggregation aggregate_by = 2 [json_name = "aggregateBy"];</code>
   * @return A list containing the enum numeric values on the wire for aggregateBy.
   */
  java.util.List<java.lang.Integer>
  getAggregateByValueList();
  /**
   * <code>repeated .chalk.common.v1.FeatureValueAggregation aggregate_by = 2 [json_name = "aggregateBy"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of aggregateBy at the given index.
   */
  int getAggregateByValue(int index);

  /**
   * <pre>
   * The size of each time bucket + how far apart time points are in the chart
   * Ideally a divisor of the total window between end and start ms
   * If not, the bucket aligned with end_timestamp_exclusive will be of size total_window % window_period
   * For JSON format, this is a string `${duration_in_seconds}s`
   * </pre>
   *
   * <code>optional .google.protobuf.Duration window_period = 3 [json_name = "windowPeriod"];</code>
   * @return Whether the windowPeriod field is set.
   */
  boolean hasWindowPeriod();
  /**
   * <pre>
   * The size of each time bucket + how far apart time points are in the chart
   * Ideally a divisor of the total window between end and start ms
   * If not, the bucket aligned with end_timestamp_exclusive will be of size total_window % window_period
   * For JSON format, this is a string `${duration_in_seconds}s`
   * </pre>
   *
   * <code>optional .google.protobuf.Duration window_period = 3 [json_name = "windowPeriod"];</code>
   * @return The windowPeriod.
   */
  com.google.protobuf.Duration getWindowPeriod();
  /**
   * <pre>
   * The size of each time bucket + how far apart time points are in the chart
   * Ideally a divisor of the total window between end and start ms
   * If not, the bucket aligned with end_timestamp_exclusive will be of size total_window % window_period
   * For JSON format, this is a string `${duration_in_seconds}s`
   * </pre>
   *
   * <code>optional .google.protobuf.Duration window_period = 3 [json_name = "windowPeriod"];</code>
   */
  com.google.protobuf.DurationOrBuilder getWindowPeriodOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp start_timestamp_inclusive = 4 [json_name = "startTimestampInclusive"];</code>
   * @return Whether the startTimestampInclusive field is set.
   */
  boolean hasStartTimestampInclusive();
  /**
   * <code>.google.protobuf.Timestamp start_timestamp_inclusive = 4 [json_name = "startTimestampInclusive"];</code>
   * @return The startTimestampInclusive.
   */
  com.google.protobuf.Timestamp getStartTimestampInclusive();
  /**
   * <code>.google.protobuf.Timestamp start_timestamp_inclusive = 4 [json_name = "startTimestampInclusive"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimestampInclusiveOrBuilder();

  /**
   * <pre>
   * If not provided, will assume current time is the ending time
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp end_timestamp_exclusive = 5 [json_name = "endTimestampExclusive"];</code>
   * @return Whether the endTimestampExclusive field is set.
   */
  boolean hasEndTimestampExclusive();
  /**
   * <pre>
   * If not provided, will assume current time is the ending time
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp end_timestamp_exclusive = 5 [json_name = "endTimestampExclusive"];</code>
   * @return The endTimestampExclusive.
   */
  com.google.protobuf.Timestamp getEndTimestampExclusive();
  /**
   * <pre>
   * If not provided, will assume current time is the ending time
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp end_timestamp_exclusive = 5 [json_name = "endTimestampExclusive"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimestampExclusiveOrBuilder();
}
