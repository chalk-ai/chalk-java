// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/flag.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface FeatureFlagValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.FeatureFlagValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string flag = 1 [json_name = "flag"];</code>
   * @return The flag.
   */
  java.lang.String getFlag();
  /**
   * <code>string flag = 1 [json_name = "flag"];</code>
   * @return The bytes for flag.
   */
  com.google.protobuf.ByteString
      getFlagBytes();

  /**
   * <code>bool value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  boolean getValue();
}
