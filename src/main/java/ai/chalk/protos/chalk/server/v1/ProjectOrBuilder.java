// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.server.v1;

public interface ProjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.Project)
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
   * <code>string team_id = 2 [json_name = "teamId"];</code>
   * @return The teamId.
   */
  java.lang.String getTeamId();
  /**
   * <code>string team_id = 2 [json_name = "teamId"];</code>
   * @return The bytes for teamId.
   */
  com.google.protobuf.ByteString
      getTeamIdBytes();

  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.Environment> 
      getEnvironmentsList();
  /**
   * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
   */
  ai.chalk.protos.chalk.server.v1.Environment getEnvironments(int index);
  /**
   * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
   */
  int getEnvironmentsCount();
  /**
   * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.EnvironmentOrBuilder> 
      getEnvironmentsOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
   */
  ai.chalk.protos.chalk.server.v1.EnvironmentOrBuilder getEnvironmentsOrBuilder(
      int index);
}
