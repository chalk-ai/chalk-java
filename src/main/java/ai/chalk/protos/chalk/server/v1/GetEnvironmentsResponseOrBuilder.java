// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

public interface GetEnvironmentsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetEnvironmentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.server.v1.Environment environments = 2 [json_name = "environments"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.Environment> 
      getEnvironmentsList();
  /**
   * <code>repeated .chalk.server.v1.Environment environments = 2 [json_name = "environments"];</code>
   */
  ai.chalk.protos.chalk.server.v1.Environment getEnvironments(int index);
  /**
   * <code>repeated .chalk.server.v1.Environment environments = 2 [json_name = "environments"];</code>
   */
  int getEnvironmentsCount();
  /**
   * <code>repeated .chalk.server.v1.Environment environments = 2 [json_name = "environments"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.EnvironmentOrBuilder> 
      getEnvironmentsOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.Environment environments = 2 [json_name = "environments"];</code>
   */
  ai.chalk.protos.chalk.server.v1.EnvironmentOrBuilder getEnvironmentsOrBuilder(
      int index);
}
