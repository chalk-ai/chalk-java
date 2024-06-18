// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 3.25.1
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

  /**
   * <code>repeated .chalk.auth.v1.Permission available_service_token_permissions = 3 [json_name = "availableServiceTokenPermissions"];</code>
   * @return A list containing the availableServiceTokenPermissions.
   */
  java.util.List<ai.chalk.protos.chalk.auth.v1.Permission> getAvailableServiceTokenPermissionsList();
  /**
   * <code>repeated .chalk.auth.v1.Permission available_service_token_permissions = 3 [json_name = "availableServiceTokenPermissions"];</code>
   * @return The count of availableServiceTokenPermissions.
   */
  int getAvailableServiceTokenPermissionsCount();
  /**
   * <code>repeated .chalk.auth.v1.Permission available_service_token_permissions = 3 [json_name = "availableServiceTokenPermissions"];</code>
   * @param index The index of the element to return.
   * @return The availableServiceTokenPermissions at the given index.
   */
  ai.chalk.protos.chalk.auth.v1.Permission getAvailableServiceTokenPermissions(int index);
  /**
   * <code>repeated .chalk.auth.v1.Permission available_service_token_permissions = 3 [json_name = "availableServiceTokenPermissions"];</code>
   * @return A list containing the enum numeric values on the wire for availableServiceTokenPermissions.
   */
  java.util.List<java.lang.Integer>
  getAvailableServiceTokenPermissionsValueList();
  /**
   * <code>repeated .chalk.auth.v1.Permission available_service_token_permissions = 3 [json_name = "availableServiceTokenPermissions"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of availableServiceTokenPermissions at the given index.
   */
  int getAvailableServiceTokenPermissionsValue(int index);
}
