// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 4.26.1
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
   *     See chalk/server/v1/team.proto;l=92
   * @return A list containing the customClaims.
   */
  @java.lang.Deprecated java.util.List<java.lang.String>
      getCustomClaimsList();
  /**
   * <code>repeated string custom_claims = 3 [json_name = "customClaims", deprecated = true];</code>
   * @deprecated chalk.server.v1.CreateServiceTokenRequest.custom_claims is deprecated.
   *     See chalk/server/v1/team.proto;l=92
   * @return The count of customClaims.
   */
  @java.lang.Deprecated int getCustomClaimsCount();
  /**
   * <code>repeated string custom_claims = 3 [json_name = "customClaims", deprecated = true];</code>
   * @deprecated chalk.server.v1.CreateServiceTokenRequest.custom_claims is deprecated.
   *     See chalk/server/v1/team.proto;l=92
   * @param index The index of the element to return.
   * @return The customClaims at the given index.
   */
  @java.lang.Deprecated java.lang.String getCustomClaims(int index);
  /**
   * <code>repeated string custom_claims = 3 [json_name = "customClaims", deprecated = true];</code>
   * @deprecated chalk.server.v1.CreateServiceTokenRequest.custom_claims is deprecated.
   *     See chalk/server/v1/team.proto;l=92
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
}