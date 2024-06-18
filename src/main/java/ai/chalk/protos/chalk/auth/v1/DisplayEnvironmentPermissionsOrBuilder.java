// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/auth/v1/displayagent.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.auth.v1;

public interface DisplayEnvironmentPermissionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.auth.v1.DisplayEnvironmentPermissions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string environment_id = 1 [json_name = "environmentId"];</code>
   * @return The environmentId.
   */
  java.lang.String getEnvironmentId();
  /**
   * <code>string environment_id = 1 [json_name = "environmentId"];</code>
   * @return The bytes for environmentId.
   */
  com.google.protobuf.ByteString
      getEnvironmentIdBytes();

  /**
   * <code>string environment_name = 2 [json_name = "environmentName"];</code>
   * @return The environmentName.
   */
  java.lang.String getEnvironmentName();
  /**
   * <code>string environment_name = 2 [json_name = "environmentName"];</code>
   * @return The bytes for environmentName.
   */
  com.google.protobuf.ByteString
      getEnvironmentNameBytes();

  /**
   * <code>string project_id = 3 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <code>string project_id = 3 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <code>string project_name = 4 [json_name = "projectName"];</code>
   * @return The projectName.
   */
  java.lang.String getProjectName();
  /**
   * <code>string project_name = 4 [json_name = "projectName"];</code>
   * @return The bytes for projectName.
   */
  com.google.protobuf.ByteString
      getProjectNameBytes();

  /**
   * <code>repeated .chalk.auth.v1.DisplayPermission permissions = 5 [json_name = "permissions"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.auth.v1.DisplayPermission> 
      getPermissionsList();
  /**
   * <code>repeated .chalk.auth.v1.DisplayPermission permissions = 5 [json_name = "permissions"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.DisplayPermission getPermissions(int index);
  /**
   * <code>repeated .chalk.auth.v1.DisplayPermission permissions = 5 [json_name = "permissions"];</code>
   */
  int getPermissionsCount();
  /**
   * <code>repeated .chalk.auth.v1.DisplayPermission permissions = 5 [json_name = "permissions"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.auth.v1.DisplayPermissionOrBuilder> 
      getPermissionsOrBuilderList();
  /**
   * <code>repeated .chalk.auth.v1.DisplayPermission permissions = 5 [json_name = "permissions"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.DisplayPermissionOrBuilder getPermissionsOrBuilder(
      int index);
}
