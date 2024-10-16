// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface GetTeamPermissionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetTeamPermissionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.server.v1.RoleDescription roles = 1 [json_name = "roles"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.RoleDescription> 
      getRolesList();
  /**
   * <code>repeated .chalk.server.v1.RoleDescription roles = 1 [json_name = "roles"];</code>
   */
  ai.chalk.protos.chalk.server.v1.RoleDescription getRoles(int index);
  /**
   * <code>repeated .chalk.server.v1.RoleDescription roles = 1 [json_name = "roles"];</code>
   */
  int getRolesCount();
  /**
   * <code>repeated .chalk.server.v1.RoleDescription roles = 1 [json_name = "roles"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.RoleDescriptionOrBuilder> 
      getRolesOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.RoleDescription roles = 1 [json_name = "roles"];</code>
   */
  ai.chalk.protos.chalk.server.v1.RoleDescriptionOrBuilder getRolesOrBuilder(
      int index);

  /**
   * <code>repeated .chalk.server.v1.ScimGroup scim_groups = 2 [json_name = "scimGroups"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.ScimGroup> 
      getScimGroupsList();
  /**
   * <code>repeated .chalk.server.v1.ScimGroup scim_groups = 2 [json_name = "scimGroups"];</code>
   */
  ai.chalk.protos.chalk.server.v1.ScimGroup getScimGroups(int index);
  /**
   * <code>repeated .chalk.server.v1.ScimGroup scim_groups = 2 [json_name = "scimGroups"];</code>
   */
  int getScimGroupsCount();
  /**
   * <code>repeated .chalk.server.v1.ScimGroup scim_groups = 2 [json_name = "scimGroups"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.ScimGroupOrBuilder> 
      getScimGroupsOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.ScimGroup scim_groups = 2 [json_name = "scimGroups"];</code>
   */
  ai.chalk.protos.chalk.server.v1.ScimGroupOrBuilder getScimGroupsOrBuilder(
      int index);

  /**
   * <code>repeated .chalk.server.v1.EnvironmentPermissions environment_permissions = 3 [json_name = "environmentPermissions"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.EnvironmentPermissions> 
      getEnvironmentPermissionsList();
  /**
   * <code>repeated .chalk.server.v1.EnvironmentPermissions environment_permissions = 3 [json_name = "environmentPermissions"];</code>
   */
  ai.chalk.protos.chalk.server.v1.EnvironmentPermissions getEnvironmentPermissions(int index);
  /**
   * <code>repeated .chalk.server.v1.EnvironmentPermissions environment_permissions = 3 [json_name = "environmentPermissions"];</code>
   */
  int getEnvironmentPermissionsCount();
  /**
   * <code>repeated .chalk.server.v1.EnvironmentPermissions environment_permissions = 3 [json_name = "environmentPermissions"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.EnvironmentPermissionsOrBuilder> 
      getEnvironmentPermissionsOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.EnvironmentPermissions environment_permissions = 3 [json_name = "environmentPermissions"];</code>
   */
  ai.chalk.protos.chalk.server.v1.EnvironmentPermissionsOrBuilder getEnvironmentPermissionsOrBuilder(
      int index);

  /**
   * <code>repeated .chalk.server.v1.User team_members = 4 [json_name = "teamMembers"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.User> 
      getTeamMembersList();
  /**
   * <code>repeated .chalk.server.v1.User team_members = 4 [json_name = "teamMembers"];</code>
   */
  ai.chalk.protos.chalk.server.v1.User getTeamMembers(int index);
  /**
   * <code>repeated .chalk.server.v1.User team_members = 4 [json_name = "teamMembers"];</code>
   */
  int getTeamMembersCount();
  /**
   * <code>repeated .chalk.server.v1.User team_members = 4 [json_name = "teamMembers"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.UserOrBuilder> 
      getTeamMembersOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.User team_members = 4 [json_name = "teamMembers"];</code>
   */
  ai.chalk.protos.chalk.server.v1.UserOrBuilder getTeamMembersOrBuilder(
      int index);
}