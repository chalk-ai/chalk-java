// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/environment.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface DockerBuildConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.DockerBuildConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string builder = 1 [json_name = "builder"];</code>
   * @return The builder.
   */
  java.lang.String getBuilder();
  /**
   * <code>string builder = 1 [json_name = "builder"];</code>
   * @return The bytes for builder.
   */
  com.google.protobuf.ByteString
      getBuilderBytes();

  /**
   * <code>string push_registry_type = 2 [json_name = "pushRegistryType"];</code>
   * @return The pushRegistryType.
   */
  java.lang.String getPushRegistryType();
  /**
   * <code>string push_registry_type = 2 [json_name = "pushRegistryType"];</code>
   * @return The bytes for pushRegistryType.
   */
  com.google.protobuf.ByteString
      getPushRegistryTypeBytes();

  /**
   * <code>string push_registry_tag_prefix = 3 [json_name = "pushRegistryTagPrefix"];</code>
   * @return The pushRegistryTagPrefix.
   */
  java.lang.String getPushRegistryTagPrefix();
  /**
   * <code>string push_registry_tag_prefix = 3 [json_name = "pushRegistryTagPrefix"];</code>
   * @return The bytes for pushRegistryTagPrefix.
   */
  com.google.protobuf.ByteString
      getPushRegistryTagPrefixBytes();

  /**
   * <code>string registry_credentials_secret_id = 4 [json_name = "registryCredentialsSecretId"];</code>
   * @return The registryCredentialsSecretId.
   */
  java.lang.String getRegistryCredentialsSecretId();
  /**
   * <code>string registry_credentials_secret_id = 4 [json_name = "registryCredentialsSecretId"];</code>
   * @return The bytes for registryCredentialsSecretId.
   */
  com.google.protobuf.ByteString
      getRegistryCredentialsSecretIdBytes();

  /**
   * <code>string notification_topic = 5 [json_name = "notificationTopic"];</code>
   * @return The notificationTopic.
   */
  java.lang.String getNotificationTopic();
  /**
   * <code>string notification_topic = 5 [json_name = "notificationTopic"];</code>
   * @return The bytes for notificationTopic.
   */
  com.google.protobuf.ByteString
      getNotificationTopicBytes();
}
