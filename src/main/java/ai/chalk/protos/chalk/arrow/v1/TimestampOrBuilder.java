// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/arrow/v1/arrow.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.arrow.v1;

public interface TimestampOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.arrow.v1.Timestamp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.arrow.v1.TimeUnit time_unit = 1 [json_name = "timeUnit"];</code>
   * @return The enum numeric value on the wire for timeUnit.
   */
  int getTimeUnitValue();
  /**
   * <code>.chalk.arrow.v1.TimeUnit time_unit = 1 [json_name = "timeUnit"];</code>
   * @return The timeUnit.
   */
  ai.chalk.protos.chalk.arrow.v1.TimeUnit getTimeUnit();

  /**
   * <code>string timezone = 2 [json_name = "timezone"];</code>
   * @return The timezone.
   */
  java.lang.String getTimezone();
  /**
   * <code>string timezone = 2 [json_name = "timezone"];</code>
   * @return The bytes for timezone.
   */
  com.google.protobuf.ByteString
      getTimezoneBytes();
}
