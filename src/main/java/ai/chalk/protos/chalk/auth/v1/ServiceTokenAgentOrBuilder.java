// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/auth/v1/agent.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.auth.v1;

public interface ServiceTokenAgentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.auth.v1.ServiceTokenAgent)
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
   * <code>string environment = 4 [json_name = "environment"];</code>
   * @return The environment.
   */
  java.lang.String getEnvironment();
  /**
   * <code>string environment = 4 [json_name = "environment"];</code>
   * @return The bytes for environment.
   */
  com.google.protobuf.ByteString
      getEnvironmentBytes();

  /**
   * <code>repeated .chalk.auth.v1.Permission permissions = 5 [json_name = "permissions"];</code>
   * @return A list containing the permissions.
   */
  java.util.List<ai.chalk.protos.chalk.auth.v1.Permission> getPermissionsList();
  /**
   * <code>repeated .chalk.auth.v1.Permission permissions = 5 [json_name = "permissions"];</code>
   * @return The count of permissions.
   */
  int getPermissionsCount();
  /**
   * <code>repeated .chalk.auth.v1.Permission permissions = 5 [json_name = "permissions"];</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  ai.chalk.protos.chalk.auth.v1.Permission getPermissions(int index);
  /**
   * <code>repeated .chalk.auth.v1.Permission permissions = 5 [json_name = "permissions"];</code>
   * @return A list containing the enum numeric values on the wire for permissions.
   */
  java.util.List<java.lang.Integer>
  getPermissionsValueList();
  /**
   * <code>repeated .chalk.auth.v1.Permission permissions = 5 [json_name = "permissions"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of permissions at the given index.
   */
  int getPermissionsValue(int index);

  /**
   * <code>repeated string custom_claims = 6 [json_name = "customClaims", deprecated = true];</code>
   * @deprecated chalk.auth.v1.ServiceTokenAgent.custom_claims is deprecated.
   *     See chalk/auth/v1/agent.proto;l=33
   * @return A list containing the customClaims.
   */
  @java.lang.Deprecated java.util.List<java.lang.String>
      getCustomClaimsList();
  /**
   * <code>repeated string custom_claims = 6 [json_name = "customClaims", deprecated = true];</code>
   * @deprecated chalk.auth.v1.ServiceTokenAgent.custom_claims is deprecated.
   *     See chalk/auth/v1/agent.proto;l=33
   * @return The count of customClaims.
   */
  @java.lang.Deprecated int getCustomClaimsCount();
  /**
   * <code>repeated string custom_claims = 6 [json_name = "customClaims", deprecated = true];</code>
   * @deprecated chalk.auth.v1.ServiceTokenAgent.custom_claims is deprecated.
   *     See chalk/auth/v1/agent.proto;l=33
   * @param index The index of the element to return.
   * @return The customClaims at the given index.
   */
  @java.lang.Deprecated java.lang.String getCustomClaims(int index);
  /**
   * <code>repeated string custom_claims = 6 [json_name = "customClaims", deprecated = true];</code>
   * @deprecated chalk.auth.v1.ServiceTokenAgent.custom_claims is deprecated.
   *     See chalk/auth/v1/agent.proto;l=33
   * @param index The index of the value to return.
   * @return The bytes of the customClaims at the given index.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getCustomClaimsBytes(int index);

  /**
   * <code>repeated .chalk.auth.v1.CustomClaim customer_claims = 7 [json_name = "customerClaims"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.auth.v1.CustomClaim> 
      getCustomerClaimsList();
  /**
   * <code>repeated .chalk.auth.v1.CustomClaim customer_claims = 7 [json_name = "customerClaims"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.CustomClaim getCustomerClaims(int index);
  /**
   * <code>repeated .chalk.auth.v1.CustomClaim customer_claims = 7 [json_name = "customerClaims"];</code>
   */
  int getCustomerClaimsCount();
  /**
   * <code>repeated .chalk.auth.v1.CustomClaim customer_claims = 7 [json_name = "customerClaims"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.auth.v1.CustomClaimOrBuilder> 
      getCustomerClaimsOrBuilderList();
  /**
   * <code>repeated .chalk.auth.v1.CustomClaim customer_claims = 7 [json_name = "customerClaims"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.CustomClaimOrBuilder getCustomerClaimsOrBuilder(
      int index);

  /**
   * <code>.chalk.auth.v1.FeaturePermissions feature_permissions = 8 [json_name = "featurePermissions"];</code>
   * @return Whether the featurePermissions field is set.
   */
  boolean hasFeaturePermissions();
  /**
   * <code>.chalk.auth.v1.FeaturePermissions feature_permissions = 8 [json_name = "featurePermissions"];</code>
   * @return The featurePermissions.
   */
  ai.chalk.protos.chalk.auth.v1.FeaturePermissions getFeaturePermissions();
  /**
   * <code>.chalk.auth.v1.FeaturePermissions feature_permissions = 8 [json_name = "featurePermissions"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.FeaturePermissionsOrBuilder getFeaturePermissionsOrBuilder();
}
