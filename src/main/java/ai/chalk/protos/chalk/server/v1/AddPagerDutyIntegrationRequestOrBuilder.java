// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/monitoring.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface AddPagerDutyIntegrationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.AddPagerDutyIntegrationRequest)
    com.google.protobuf.MessageOrBuilder {

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
   * <code>string token = 3 [json_name = "token"];</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <code>string token = 3 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}
