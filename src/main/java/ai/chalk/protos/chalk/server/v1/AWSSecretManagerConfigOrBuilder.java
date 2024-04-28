// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/environment.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

public interface AWSSecretManagerConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.AWSSecretManagerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string secret_kms_arn = 1 [json_name = "secretKmsArn"];</code>
   * @return Whether the secretKmsArn field is set.
   */
  boolean hasSecretKmsArn();
  /**
   * <code>optional string secret_kms_arn = 1 [json_name = "secretKmsArn"];</code>
   * @return The secretKmsArn.
   */
  java.lang.String getSecretKmsArn();
  /**
   * <code>optional string secret_kms_arn = 1 [json_name = "secretKmsArn"];</code>
   * @return The bytes for secretKmsArn.
   */
  com.google.protobuf.ByteString
      getSecretKmsArnBytes();

  /**
   * <code>map&lt;string, string&gt; secret_tags = 2 [json_name = "secretTags"];</code>
   */
  int getSecretTagsCount();
  /**
   * <code>map&lt;string, string&gt; secret_tags = 2 [json_name = "secretTags"];</code>
   */
  boolean containsSecretTags(
      java.lang.String key);
  /**
   * Use {@link #getSecretTagsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getSecretTags();
  /**
   * <code>map&lt;string, string&gt; secret_tags = 2 [json_name = "secretTags"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getSecretTagsMap();
  /**
   * <code>map&lt;string, string&gt; secret_tags = 2 [json_name = "secretTags"];</code>
   */
  /* nullable */
java.lang.String getSecretTagsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; secret_tags = 2 [json_name = "secretTags"];</code>
   */
  java.lang.String getSecretTagsOrThrow(
      java.lang.String key);

  /**
   * <code>optional string secret_prefix = 3 [json_name = "secretPrefix"];</code>
   * @return Whether the secretPrefix field is set.
   */
  boolean hasSecretPrefix();
  /**
   * <code>optional string secret_prefix = 3 [json_name = "secretPrefix"];</code>
   * @return The secretPrefix.
   */
  java.lang.String getSecretPrefix();
  /**
   * <code>optional string secret_prefix = 3 [json_name = "secretPrefix"];</code>
   * @return The bytes for secretPrefix.
   */
  com.google.protobuf.ByteString
      getSecretPrefixBytes();
}
