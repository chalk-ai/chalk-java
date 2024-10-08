// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/timeserieschart.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface TimeSeriesChartV2OrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.TimeSeriesChartV2)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>repeated .chalk.server.v1.TimeSeriesV2 series = 2 [json_name = "series"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.TimeSeriesV2> 
      getSeriesList();
  /**
   * <code>repeated .chalk.server.v1.TimeSeriesV2 series = 2 [json_name = "series"];</code>
   */
  ai.chalk.protos.chalk.server.v1.TimeSeriesV2 getSeries(int index);
  /**
   * <code>repeated .chalk.server.v1.TimeSeriesV2 series = 2 [json_name = "series"];</code>
   */
  int getSeriesCount();
  /**
   * <code>repeated .chalk.server.v1.TimeSeriesV2 series = 2 [json_name = "series"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.TimeSeriesV2OrBuilder> 
      getSeriesOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.TimeSeriesV2 series = 2 [json_name = "series"];</code>
   */
  ai.chalk.protos.chalk.server.v1.TimeSeriesV2OrBuilder getSeriesOrBuilder(
      int index);

  /**
   * <code>repeated .google.protobuf.Timestamp x_series = 3 [json_name = "xSeries"];</code>
   */
  java.util.List<com.google.protobuf.Timestamp> 
      getXSeriesList();
  /**
   * <code>repeated .google.protobuf.Timestamp x_series = 3 [json_name = "xSeries"];</code>
   */
  com.google.protobuf.Timestamp getXSeries(int index);
  /**
   * <code>repeated .google.protobuf.Timestamp x_series = 3 [json_name = "xSeries"];</code>
   */
  int getXSeriesCount();
  /**
   * <code>repeated .google.protobuf.Timestamp x_series = 3 [json_name = "xSeries"];</code>
   */
  java.util.List<? extends com.google.protobuf.TimestampOrBuilder> 
      getXSeriesOrBuilderList();
  /**
   * <code>repeated .google.protobuf.Timestamp x_series = 3 [json_name = "xSeries"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getXSeriesOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Duration window_period = 4 [json_name = "windowPeriod"];</code>
   * @return Whether the windowPeriod field is set.
   */
  boolean hasWindowPeriod();
  /**
   * <code>.google.protobuf.Duration window_period = 4 [json_name = "windowPeriod"];</code>
   * @return The windowPeriod.
   */
  com.google.protobuf.Duration getWindowPeriod();
  /**
   * <code>.google.protobuf.Duration window_period = 4 [json_name = "windowPeriod"];</code>
   */
  com.google.protobuf.DurationOrBuilder getWindowPeriodOrBuilder();
}
