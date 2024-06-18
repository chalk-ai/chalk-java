// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/chart.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.server.v1;

public interface ChartOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.Chart)
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
   * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.Series> 
      getSeriesList();
  /**
   * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
   */
  ai.chalk.protos.chalk.server.v1.Series getSeries(int index);
  /**
   * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
   */
  int getSeriesCount();
  /**
   * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.SeriesOrBuilder> 
      getSeriesOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
   */
  ai.chalk.protos.chalk.server.v1.SeriesOrBuilder getSeriesOrBuilder(
      int index);

  /**
   * <code>repeated int64 x_timestamp_ms = 4 [json_name = "xTimestampMs"];</code>
   * @return A list containing the xTimestampMs.
   */
  java.util.List<java.lang.Long> getXTimestampMsList();
  /**
   * <code>repeated int64 x_timestamp_ms = 4 [json_name = "xTimestampMs"];</code>
   * @return The count of xTimestampMs.
   */
  int getXTimestampMsCount();
  /**
   * <code>repeated int64 x_timestamp_ms = 4 [json_name = "xTimestampMs"];</code>
   * @param index The index of the element to return.
   * @return The xTimestampMs at the given index.
   */
  long getXTimestampMs(int index);
}
