// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/chart/v1/densetimeserieschart.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.chart.v1;

public interface GroupTagOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.chart.v1.GroupTag)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string group_key = 1 [json_name = "groupKey"];</code>
   * @return The groupKey.
   */
  java.lang.String getGroupKey();
  /**
   * <code>string group_key = 1 [json_name = "groupKey"];</code>
   * @return The bytes for groupKey.
   */
  com.google.protobuf.ByteString
      getGroupKeyBytes();

  /**
   * <code>.chalk.arrow.v1.ScalarValue value = 2 [json_name = "value"];</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.chalk.arrow.v1.ScalarValue value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  ai.chalk.protos.chalk.arrow.v1.ScalarValue getValue();
  /**
   * <code>.chalk.arrow.v1.ScalarValue value = 2 [json_name = "value"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ScalarValueOrBuilder getValueOrBuilder();
}
