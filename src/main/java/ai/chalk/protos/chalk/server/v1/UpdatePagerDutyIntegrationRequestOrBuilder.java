// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/monitoring.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.server.v1;

public interface UpdatePagerDutyIntegrationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.UpdatePagerDutyIntegrationRequest)
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
   * <code>optional bool default = 3 [json_name = "default"];</code>
   * @return Whether the default field is set.
   */
  boolean hasDefault();
  /**
   * <code>optional bool default = 3 [json_name = "default"];</code>
   * @return The default.
   */
  boolean getDefault();

  /**
   * <code>optional string token = 4 [json_name = "token"];</code>
   * @return Whether the token field is set.
   */
  boolean hasToken();
  /**
   * <code>optional string token = 4 [json_name = "token"];</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <code>optional string token = 4 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}
