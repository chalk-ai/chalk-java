// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/timeserieschart.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface TimeSeriesV2OrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.TimeSeriesV2)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.server.v1.PointV2 points = 1 [json_name = "points"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.PointV2> 
      getPointsList();
  /**
   * <code>repeated .chalk.server.v1.PointV2 points = 1 [json_name = "points"];</code>
   */
  ai.chalk.protos.chalk.server.v1.PointV2 getPoints(int index);
  /**
   * <code>repeated .chalk.server.v1.PointV2 points = 1 [json_name = "points"];</code>
   */
  int getPointsCount();
  /**
   * <code>repeated .chalk.server.v1.PointV2 points = 1 [json_name = "points"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.PointV2OrBuilder> 
      getPointsOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.PointV2 points = 1 [json_name = "points"];</code>
   */
  ai.chalk.protos.chalk.server.v1.PointV2OrBuilder getPointsOrBuilder(
      int index);

  /**
   * <code>string label = 2 [json_name = "label"];</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <code>string label = 2 [json_name = "label"];</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>string units = 3 [json_name = "units"];</code>
   * @return The units.
   */
  java.lang.String getUnits();
  /**
   * <code>string units = 3 [json_name = "units"];</code>
   * @return The bytes for units.
   */
  com.google.protobuf.ByteString
      getUnitsBytes();
}