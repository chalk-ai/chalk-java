// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/queries.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface GetQueryErrorsChartRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetQueryErrorsChartRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp start_timestamp_inclusive = 1 [json_name = "startTimestampInclusive"];</code>
   * @return Whether the startTimestampInclusive field is set.
   */
  boolean hasStartTimestampInclusive();
  /**
   * <code>.google.protobuf.Timestamp start_timestamp_inclusive = 1 [json_name = "startTimestampInclusive"];</code>
   * @return The startTimestampInclusive.
   */
  com.google.protobuf.Timestamp getStartTimestampInclusive();
  /**
   * <code>.google.protobuf.Timestamp start_timestamp_inclusive = 1 [json_name = "startTimestampInclusive"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimestampInclusiveOrBuilder();

  /**
   * <pre>
   * If not specified, assumes the current timestamp
   * To avoid awkward small window buckets at the end, specify this.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp end_timestamp_exclusive = 2 [json_name = "endTimestampExclusive"];</code>
   * @return Whether the endTimestampExclusive field is set.
   */
  boolean hasEndTimestampExclusive();
  /**
   * <pre>
   * If not specified, assumes the current timestamp
   * To avoid awkward small window buckets at the end, specify this.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp end_timestamp_exclusive = 2 [json_name = "endTimestampExclusive"];</code>
   * @return The endTimestampExclusive.
   */
  com.google.protobuf.Timestamp getEndTimestampExclusive();
  /**
   * <pre>
   * If not specified, assumes the current timestamp
   * To avoid awkward small window buckets at the end, specify this.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp end_timestamp_exclusive = 2 [json_name = "endTimestampExclusive"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimestampExclusiveOrBuilder();

  /**
   * <pre>
   * The size of each time bucket + how far apart time points are in the chart
   * Ideally a divisor of the total window between end and start ms
   * If not, the bucket start-aligned with end_timestamp_exclusive will be of size total_window % window_period
   * </pre>
   *
   * <code>.google.protobuf.Duration window_period = 3 [json_name = "windowPeriod"];</code>
   * @return Whether the windowPeriod field is set.
   */
  boolean hasWindowPeriod();
  /**
   * <pre>
   * The size of each time bucket + how far apart time points are in the chart
   * Ideally a divisor of the total window between end and start ms
   * If not, the bucket start-aligned with end_timestamp_exclusive will be of size total_window % window_period
   * </pre>
   *
   * <code>.google.protobuf.Duration window_period = 3 [json_name = "windowPeriod"];</code>
   * @return The windowPeriod.
   */
  com.google.protobuf.Duration getWindowPeriod();
  /**
   * <pre>
   * The size of each time bucket + how far apart time points are in the chart
   * Ideally a divisor of the total window between end and start ms
   * If not, the bucket start-aligned with end_timestamp_exclusive will be of size total_window % window_period
   * </pre>
   *
   * <code>.google.protobuf.Duration window_period = 3 [json_name = "windowPeriod"];</code>
   */
  com.google.protobuf.DurationOrBuilder getWindowPeriodOrBuilder();

  /**
   * <code>.chalk.server.v1.QueryErrorFilters filters = 4 [json_name = "filters"];</code>
   * @return Whether the filters field is set.
   */
  boolean hasFilters();
  /**
   * <code>.chalk.server.v1.QueryErrorFilters filters = 4 [json_name = "filters"];</code>
   * @return The filters.
   */
  ai.chalk.protos.chalk.server.v1.QueryErrorFilters getFilters();
  /**
   * <code>.chalk.server.v1.QueryErrorFilters filters = 4 [json_name = "filters"];</code>
   */
  ai.chalk.protos.chalk.server.v1.QueryErrorFiltersOrBuilder getFiltersOrBuilder();
}
