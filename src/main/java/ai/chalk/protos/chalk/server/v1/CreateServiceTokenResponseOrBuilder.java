// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

public interface CreateServiceTokenResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.CreateServiceTokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.auth.v1.ServiceTokenAgent agent = 1 [json_name = "agent"];</code>
   * @return Whether the agent field is set.
   */
  boolean hasAgent();
  /**
   * <code>.chalk.auth.v1.ServiceTokenAgent agent = 1 [json_name = "agent"];</code>
   * @return The agent.
   */
  ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent getAgent();
  /**
   * <code>.chalk.auth.v1.ServiceTokenAgent agent = 1 [json_name = "agent"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.ServiceTokenAgentOrBuilder getAgentOrBuilder();

  /**
   * <code>string client_secret = 2 [json_name = "clientSecret"];</code>
   * @return The clientSecret.
   */
  java.lang.String getClientSecret();
  /**
   * <code>string client_secret = 2 [json_name = "clientSecret"];</code>
   * @return The bytes for clientSecret.
   */
  com.google.protobuf.ByteString
      getClientSecretBytes();
}
