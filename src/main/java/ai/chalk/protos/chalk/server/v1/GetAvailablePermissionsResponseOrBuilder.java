// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

public interface GetAvailablePermissionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetAvailablePermissionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.server.v1.PermissionDescription permissions = 1 [json_name = "permissions"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.PermissionDescription> 
      getPermissionsList();
  /**
   * <code>repeated .chalk.server.v1.PermissionDescription permissions = 1 [json_name = "permissions"];</code>
   */
  ai.chalk.protos.chalk.server.v1.PermissionDescription getPermissions(int index);
  /**
   * <code>repeated .chalk.server.v1.PermissionDescription permissions = 1 [json_name = "permissions"];</code>
   */
  int getPermissionsCount();
  /**
   * <code>repeated .chalk.server.v1.PermissionDescription permissions = 1 [json_name = "permissions"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.PermissionDescriptionOrBuilder> 
      getPermissionsOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.PermissionDescription permissions = 1 [json_name = "permissions"];</code>
   */
  ai.chalk.protos.chalk.server.v1.PermissionDescriptionOrBuilder getPermissionsOrBuilder(
      int index);

  /**
   * <code>repeated .chalk.server.v1.RoleDescription roles = 2 [json_name = "roles"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.RoleDescription> 
      getRolesList();
  /**
   * <code>repeated .chalk.server.v1.RoleDescription roles = 2 [json_name = "roles"];</code>
   */
  ai.chalk.protos.chalk.server.v1.RoleDescription getRoles(int index);
  /**
   * <code>repeated .chalk.server.v1.RoleDescription roles = 2 [json_name = "roles"];</code>
   */
  int getRolesCount();
  /**
   * <code>repeated .chalk.server.v1.RoleDescription roles = 2 [json_name = "roles"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.RoleDescriptionOrBuilder> 
      getRolesOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.RoleDescription roles = 2 [json_name = "roles"];</code>
   */
  ai.chalk.protos.chalk.server.v1.RoleDescriptionOrBuilder getRolesOrBuilder(
      int index);
}
