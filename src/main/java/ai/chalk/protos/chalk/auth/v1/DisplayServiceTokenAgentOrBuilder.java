// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/auth/v1/displayagent.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.auth.v1;

public interface DisplayServiceTokenAgentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.auth.v1.DisplayServiceTokenAgent)
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
   * <code>string client_id = 2 [json_name = "clientId"];</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <code>string client_id = 2 [json_name = "clientId"];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

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
   * <code>string project_id = 4 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <code>string project_id = 4 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <code>string environment_id = 5 [json_name = "environmentId"];</code>
   * @return The environmentId.
   */
  java.lang.String getEnvironmentId();
  /**
   * <code>string environment_id = 5 [json_name = "environmentId"];</code>
   * @return The bytes for environmentId.
   */
  com.google.protobuf.ByteString
      getEnvironmentIdBytes();

  /**
   * <code>repeated .chalk.auth.v1.DisplayPermission permissions = 6 [json_name = "permissions"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.auth.v1.DisplayPermission> 
      getPermissionsList();
  /**
   * <code>repeated .chalk.auth.v1.DisplayPermission permissions = 6 [json_name = "permissions"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.DisplayPermission getPermissions(int index);
  /**
   * <code>repeated .chalk.auth.v1.DisplayPermission permissions = 6 [json_name = "permissions"];</code>
   */
  int getPermissionsCount();
  /**
   * <code>repeated .chalk.auth.v1.DisplayPermission permissions = 6 [json_name = "permissions"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.auth.v1.DisplayPermissionOrBuilder> 
      getPermissionsOrBuilderList();
  /**
   * <code>repeated .chalk.auth.v1.DisplayPermission permissions = 6 [json_name = "permissions"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.DisplayPermissionOrBuilder getPermissionsOrBuilder(
      int index);

  /**
   * <code>string name = 7 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 7 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

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

  /**
   * <code>string project_name = 9 [json_name = "projectName"];</code>
   * @return The projectName.
   */
  java.lang.String getProjectName();
  /**
   * <code>string project_name = 9 [json_name = "projectName"];</code>
   * @return The bytes for projectName.
   */
  com.google.protobuf.ByteString
      getProjectNameBytes();

  /**
   * <code>string environment_name = 10 [json_name = "environmentName"];</code>
   * @return The environmentName.
   */
  java.lang.String getEnvironmentName();
  /**
   * <code>string environment_name = 10 [json_name = "environmentName"];</code>
   * @return The bytes for environmentName.
   */
  com.google.protobuf.ByteString
      getEnvironmentNameBytes();

  /**
   * <code>repeated .chalk.auth.v1.DisplayCustomClaim customer_claims = 11 [json_name = "customerClaims"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.auth.v1.DisplayCustomClaim> 
      getCustomerClaimsList();
  /**
   * <code>repeated .chalk.auth.v1.DisplayCustomClaim customer_claims = 11 [json_name = "customerClaims"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.DisplayCustomClaim getCustomerClaims(int index);
  /**
   * <code>repeated .chalk.auth.v1.DisplayCustomClaim customer_claims = 11 [json_name = "customerClaims"];</code>
   */
  int getCustomerClaimsCount();
  /**
   * <code>repeated .chalk.auth.v1.DisplayCustomClaim customer_claims = 11 [json_name = "customerClaims"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.auth.v1.DisplayCustomClaimOrBuilder> 
      getCustomerClaimsOrBuilderList();
  /**
   * <code>repeated .chalk.auth.v1.DisplayCustomClaim customer_claims = 11 [json_name = "customerClaims"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.DisplayCustomClaimOrBuilder getCustomerClaimsOrBuilder(
      int index);

  /**
   * <code>.chalk.auth.v1.FeaturePermissions feature_permissions = 12 [json_name = "featurePermissions"];</code>
   * @return Whether the featurePermissions field is set.
   */
  boolean hasFeaturePermissions();
  /**
   * <code>.chalk.auth.v1.FeaturePermissions feature_permissions = 12 [json_name = "featurePermissions"];</code>
   * @return The featurePermissions.
   */
  ai.chalk.protos.chalk.auth.v1.FeaturePermissions getFeaturePermissions();
  /**
   * <code>.chalk.auth.v1.FeaturePermissions feature_permissions = 12 [json_name = "featurePermissions"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.FeaturePermissionsOrBuilder getFeaturePermissionsOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp created_at = 13 [json_name = "createdAt"];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 13 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 13 [json_name = "createdAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();
}
