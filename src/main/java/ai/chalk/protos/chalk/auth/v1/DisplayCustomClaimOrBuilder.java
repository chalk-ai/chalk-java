// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/auth/v1/displayagent.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.auth.v1;

public interface DisplayCustomClaimOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.auth.v1.DisplayCustomClaim)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>repeated string values = 2 [json_name = "values"];</code>
   * @return A list containing the values.
   */
  java.util.List<java.lang.String>
      getValuesList();
  /**
   * <code>repeated string values = 2 [json_name = "values"];</code>
   * @return The count of values.
   */
  int getValuesCount();
  /**
   * <code>repeated string values = 2 [json_name = "values"];</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  java.lang.String getValues(int index);
  /**
   * <code>repeated string values = 2 [json_name = "values"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  com.google.protobuf.ByteString
      getValuesBytes(int index);
}
