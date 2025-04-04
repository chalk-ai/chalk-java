// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface CreateServiceTokenRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.CreateServiceTokenRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated .chalk.auth.v1.Permission permissions = 2 [json_name = "permissions"];</code>
   * @return A list containing the permissions.
   */
  java.util.List<ai.chalk.protos.chalk.auth.v1.Permission> getPermissionsList();
  /**
   * <code>repeated .chalk.auth.v1.Permission permissions = 2 [json_name = "permissions"];</code>
   * @return The count of permissions.
   */
  int getPermissionsCount();
  /**
   * <code>repeated .chalk.auth.v1.Permission permissions = 2 [json_name = "permissions"];</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  ai.chalk.protos.chalk.auth.v1.Permission getPermissions(int index);
  /**
   * <code>repeated .chalk.auth.v1.Permission permissions = 2 [json_name = "permissions"];</code>
   * @return A list containing the enum numeric values on the wire for permissions.
   */
  java.util.List<java.lang.Integer>
  getPermissionsValueList();
  /**
   * <code>repeated .chalk.auth.v1.Permission permissions = 2 [json_name = "permissions"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of permissions at the given index.
   */
  int getPermissionsValue(int index);

  /**
   * <code>repeated string custom_claims = 3 [json_name = "customClaims", deprecated = true];</code>
   * @deprecated chalk.server.v1.CreateServiceTokenRequest.custom_claims is deprecated.
   *     See chalk/server/v1/team.proto;l=121
   * @return A list containing the customClaims.
   */
  @java.lang.Deprecated java.util.List<java.lang.String>
      getCustomClaimsList();
  /**
   * <code>repeated string custom_claims = 3 [json_name = "customClaims", deprecated = true];</code>
   * @deprecated chalk.server.v1.CreateServiceTokenRequest.custom_claims is deprecated.
   *     See chalk/server/v1/team.proto;l=121
   * @return The count of customClaims.
   */
  @java.lang.Deprecated int getCustomClaimsCount();
  /**
   * <code>repeated string custom_claims = 3 [json_name = "customClaims", deprecated = true];</code>
   * @deprecated chalk.server.v1.CreateServiceTokenRequest.custom_claims is deprecated.
   *     See chalk/server/v1/team.proto;l=121
   * @param index The index of the element to return.
   * @return The customClaims at the given index.
   */
  @java.lang.Deprecated java.lang.String getCustomClaims(int index);
  /**
   * <code>repeated string custom_claims = 3 [json_name = "customClaims", deprecated = true];</code>
   * @deprecated chalk.server.v1.CreateServiceTokenRequest.custom_claims is deprecated.
   *     See chalk/server/v1/team.proto;l=121
   * @param index The index of the value to return.
   * @return The bytes of the customClaims at the given index.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getCustomClaimsBytes(int index);

  /**
   * <code>repeated .chalk.auth.v1.CustomClaim customer_claims = 4 [json_name = "customerClaims"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.auth.v1.CustomClaim> 
      getCustomerClaimsList();
  /**
   * <code>repeated .chalk.auth.v1.CustomClaim customer_claims = 4 [json_name = "customerClaims"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.CustomClaim getCustomerClaims(int index);
  /**
   * <code>repeated .chalk.auth.v1.CustomClaim customer_claims = 4 [json_name = "customerClaims"];</code>
   */
  int getCustomerClaimsCount();
  /**
   * <code>repeated .chalk.auth.v1.CustomClaim customer_claims = 4 [json_name = "customerClaims"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.auth.v1.CustomClaimOrBuilder> 
      getCustomerClaimsOrBuilderList();
  /**
   * <code>repeated .chalk.auth.v1.CustomClaim customer_claims = 4 [json_name = "customerClaims"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.CustomClaimOrBuilder getCustomerClaimsOrBuilder(
      int index);

  /**
   * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; feature_tag_to_permission = 5 [json_name = "featureTagToPermission"];</code>
   */
  int getFeatureTagToPermissionCount();
  /**
   * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; feature_tag_to_permission = 5 [json_name = "featureTagToPermission"];</code>
   */
  boolean containsFeatureTagToPermission(
      java.lang.String key);
  /**
   * Use {@link #getFeatureTagToPermissionMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, ai.chalk.protos.chalk.auth.v1.FeaturePermission>
  getFeatureTagToPermission();
  /**
   * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; feature_tag_to_permission = 5 [json_name = "featureTagToPermission"];</code>
   */
  java.util.Map<java.lang.String, ai.chalk.protos.chalk.auth.v1.FeaturePermission>
  getFeatureTagToPermissionMap();
  /**
   * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; feature_tag_to_permission = 5 [json_name = "featureTagToPermission"];</code>
   */
  /* nullable */
ai.chalk.protos.chalk.auth.v1.FeaturePermission getFeatureTagToPermissionOrDefault(
      java.lang.String key,
      /* nullable */
ai.chalk.protos.chalk.auth.v1.FeaturePermission         defaultValue);
  /**
   * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; feature_tag_to_permission = 5 [json_name = "featureTagToPermission"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.FeaturePermission getFeatureTagToPermissionOrThrow(
      java.lang.String key);
  /**
   * Use {@link #getFeatureTagToPermissionValueMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer>
  getFeatureTagToPermissionValue();
  /**
   * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; feature_tag_to_permission = 5 [json_name = "featureTagToPermission"];</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer>
  getFeatureTagToPermissionValueMap();
  /**
   * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; feature_tag_to_permission = 5 [json_name = "featureTagToPermission"];</code>
   */
  int getFeatureTagToPermissionValueOrDefault(
      java.lang.String key,
      int defaultValue);
  /**
   * <code>map&lt;string, .chalk.auth.v1.FeaturePermission&gt; feature_tag_to_permission = 5 [json_name = "featureTagToPermission"];</code>
   */
  int getFeatureTagToPermissionValueOrThrow(
      java.lang.String key);
}
