// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.server.v1;

public interface ListServiceTokensResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.ListServiceTokensResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.auth.v1.DisplayServiceTokenAgent agents = 1 [json_name = "agents"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.auth.v1.DisplayServiceTokenAgent> 
      getAgentsList();
  /**
   * <code>repeated .chalk.auth.v1.DisplayServiceTokenAgent agents = 1 [json_name = "agents"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.DisplayServiceTokenAgent getAgents(int index);
  /**
   * <code>repeated .chalk.auth.v1.DisplayServiceTokenAgent agents = 1 [json_name = "agents"];</code>
   */
  int getAgentsCount();
  /**
   * <code>repeated .chalk.auth.v1.DisplayServiceTokenAgent agents = 1 [json_name = "agents"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.auth.v1.DisplayServiceTokenAgentOrBuilder> 
      getAgentsOrBuilderList();
  /**
   * <code>repeated .chalk.auth.v1.DisplayServiceTokenAgent agents = 1 [json_name = "agents"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.DisplayServiceTokenAgentOrBuilder getAgentsOrBuilder(
      int index);
}
