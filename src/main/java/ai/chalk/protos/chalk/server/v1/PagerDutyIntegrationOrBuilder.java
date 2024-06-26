// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/monitoring.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface PagerDutyIntegrationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.PagerDutyIntegration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>bool default = 3 [json_name = "default"];</code>
   * @return The default.
   */
  boolean getDefault();

  /**
   * <code>string token = 4 [json_name = "token", (.chalk.utils.v1.sensitive) = true];</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <code>string token = 4 [json_name = "token", (.chalk.utils.v1.sensitive) = true];</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <code>string environment_id = 5 [json_name = "environmentId"];</code>
   * @return The environmentId.
   */
  java.lang.String getEnvironmentId();
  /**
   * <code>string environment_id = 5 [json_name = "environmentId"];</code>
   * @return The bytes for environmentId.
   */
  com.google.protobuf.ByteString
      getEnvironmentIdBytes();
}
