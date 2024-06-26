// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/auth.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface GetTokenRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetTokenRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string client_id = 1 [json_name = "clientId"];</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <code>string client_id = 1 [json_name = "clientId"];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>string client_secret = 2 [json_name = "clientSecret", (.chalk.utils.v1.sensitive) = true];</code>
   * @return The clientSecret.
   */
  java.lang.String getClientSecret();
  /**
   * <code>string client_secret = 2 [json_name = "clientSecret", (.chalk.utils.v1.sensitive) = true];</code>
   * @return The bytes for clientSecret.
   */
  com.google.protobuf.ByteString
      getClientSecretBytes();

  /**
   * <code>string grant_type = 3 [json_name = "grantType"];</code>
   * @return The grantType.
   */
  java.lang.String getGrantType();
  /**
   * <code>string grant_type = 3 [json_name = "grantType"];</code>
   * @return The bytes for grantType.
   */
  com.google.protobuf.ByteString
      getGrantTypeBytes();

  /**
   * <code>optional string scope = 4 [json_name = "scope"];</code>
   * @return Whether the scope field is set.
   */
  boolean hasScope();
  /**
   * <code>optional string scope = 4 [json_name = "scope"];</code>
   * @return The scope.
   */
  java.lang.String getScope();
  /**
   * <code>optional string scope = 4 [json_name = "scope"];</code>
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString
      getScopeBytes();
}
