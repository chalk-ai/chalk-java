// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/arrow/v1/arrow.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.arrow.v1;

public interface ScalarTime64ValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.arrow.v1.ScalarTime64Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 time64_microsecond_value = 1 [json_name = "time64MicrosecondValue"];</code>
   * @return Whether the time64MicrosecondValue field is set.
   */
  boolean hasTime64MicrosecondValue();
  /**
   * <code>int64 time64_microsecond_value = 1 [json_name = "time64MicrosecondValue"];</code>
   * @return The time64MicrosecondValue.
   */
  long getTime64MicrosecondValue();

  /**
   * <code>int64 time64_nanosecond_value = 2 [json_name = "time64NanosecondValue"];</code>
   * @return Whether the time64NanosecondValue field is set.
   */
  boolean hasTime64NanosecondValue();
  /**
   * <code>int64 time64_nanosecond_value = 2 [json_name = "time64NanosecondValue"];</code>
   * @return The time64NanosecondValue.
   */
  long getTime64NanosecondValue();

  ai.chalk.protos.chalk.arrow.v1.ScalarTime64Value.ValueCase getValueCase();
}
