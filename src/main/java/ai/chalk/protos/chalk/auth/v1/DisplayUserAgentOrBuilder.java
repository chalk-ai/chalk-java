// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/auth/v1/displayagent.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.auth.v1;

public interface DisplayUserAgentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.auth.v1.DisplayUserAgent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string client_id = 1 [json_name = "clientId", deprecated = true];</code>
   * @deprecated chalk.auth.v1.DisplayUserAgent.client_id is deprecated.
   *     See chalk/auth/v1/displayagent.proto;l=24
   * @return The clientId.
   */
  @java.lang.Deprecated java.lang.String getClientId();
  /**
   * <code>string client_id = 1 [json_name = "clientId", deprecated = true];</code>
   * @deprecated chalk.auth.v1.DisplayUserAgent.client_id is deprecated.
   *     See chalk/auth/v1/displayagent.proto;l=24
   * @return The bytes for clientId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string team_id = 3 [json_name = "teamId"];</code>
   * @return The teamId.
   */
  java.lang.String getTeamId();
  /**
   * <code>string team_id = 3 [json_name = "teamId"];</code>
   * @return The bytes for teamId.
   */
  com.google.protobuf.ByteString
      getTeamIdBytes();

  /**
   * <code>repeated .chalk.auth.v1.DisplayEnvironmentPermissions permissions_by_environment = 4 [json_name = "permissionsByEnvironment"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.auth.v1.DisplayEnvironmentPermissions> 
      getPermissionsByEnvironmentList();
  /**
   * <code>repeated .chalk.auth.v1.DisplayEnvironmentPermissions permissions_by_environment = 4 [json_name = "permissionsByEnvironment"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.DisplayEnvironmentPermissions getPermissionsByEnvironment(int index);
  /**
   * <code>repeated .chalk.auth.v1.DisplayEnvironmentPermissions permissions_by_environment = 4 [json_name = "permissionsByEnvironment"];</code>
   */
  int getPermissionsByEnvironmentCount();
  /**
   * <code>repeated .chalk.auth.v1.DisplayEnvironmentPermissions permissions_by_environment = 4 [json_name = "permissionsByEnvironment"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.auth.v1.DisplayEnvironmentPermissionsOrBuilder> 
      getPermissionsByEnvironmentOrBuilderList();
  /**
   * <code>repeated .chalk.auth.v1.DisplayEnvironmentPermissions permissions_by_environment = 4 [json_name = "permissionsByEnvironment"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.DisplayEnvironmentPermissionsOrBuilder getPermissionsByEnvironmentOrBuilder(
      int index);

  /**
   * <code>bool impersonated = 5 [json_name = "impersonated"];</code>
   * @return The impersonated.
   */
  boolean getImpersonated();

  /**
   * <code>string name = 6 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 6 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string email = 7 [json_name = "email"];</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 7 [json_name = "email"];</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>string team_name = 8 [json_name = "teamName"];</code>
   * @return The teamName.
   */
  java.lang.String getTeamName();
  /**
   * <code>string team_name = 8 [json_name = "teamName"];</code>
   * @return The bytes for teamName.
   */
  com.google.protobuf.ByteString
      getTeamNameBytes();
}
