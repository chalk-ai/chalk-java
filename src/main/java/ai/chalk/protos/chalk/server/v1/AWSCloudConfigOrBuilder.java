// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/environment.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface AWSCloudConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.AWSCloudConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string account_id = 1 [json_name = "accountId"];</code>
   * @return The accountId.
   */
  java.lang.String getAccountId();
  /**
   * <code>string account_id = 1 [json_name = "accountId"];</code>
   * @return The bytes for accountId.
   */
  com.google.protobuf.ByteString
      getAccountIdBytes();

  /**
   * <code>string management_role_arn = 2 [json_name = "managementRoleArn"];</code>
   * @return The managementRoleArn.
   */
  java.lang.String getManagementRoleArn();
  /**
   * <code>string management_role_arn = 2 [json_name = "managementRoleArn"];</code>
   * @return The bytes for managementRoleArn.
   */
  com.google.protobuf.ByteString
      getManagementRoleArnBytes();

  /**
   * <code>string region = 3 [json_name = "region"];</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <code>string region = 3 [json_name = "region"];</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <code>optional string external_id = 4 [json_name = "externalId"];</code>
   * @return Whether the externalId field is set.
   */
  boolean hasExternalId();
  /**
   * <code>optional string external_id = 4 [json_name = "externalId"];</code>
   * @return The externalId.
   */
  java.lang.String getExternalId();
  /**
   * <code>optional string external_id = 4 [json_name = "externalId"];</code>
   * @return The bytes for externalId.
   */
  com.google.protobuf.ByteString
      getExternalIdBytes();

  /**
   * <code>.chalk.server.v1.AWSCloudWatchConfig cloud_watch_config = 5 [json_name = "cloudWatchConfig"];</code>
   * @return Whether the cloudWatchConfig field is set.
   */
  boolean hasCloudWatchConfig();
  /**
   * <code>.chalk.server.v1.AWSCloudWatchConfig cloud_watch_config = 5 [json_name = "cloudWatchConfig"];</code>
   * @return The cloudWatchConfig.
   */
  ai.chalk.protos.chalk.server.v1.AWSCloudWatchConfig getCloudWatchConfig();
  /**
   * <code>.chalk.server.v1.AWSCloudWatchConfig cloud_watch_config = 5 [json_name = "cloudWatchConfig"];</code>
   */
  ai.chalk.protos.chalk.server.v1.AWSCloudWatchConfigOrBuilder getCloudWatchConfigOrBuilder();

  /**
   * <code>.chalk.server.v1.AWSSecretManagerConfig secret_manager_config = 6 [json_name = "secretManagerConfig"];</code>
   * @return Whether the secretManagerConfig field is set.
   */
  boolean hasSecretManagerConfig();
  /**
   * <code>.chalk.server.v1.AWSSecretManagerConfig secret_manager_config = 6 [json_name = "secretManagerConfig"];</code>
   * @return The secretManagerConfig.
   */
  ai.chalk.protos.chalk.server.v1.AWSSecretManagerConfig getSecretManagerConfig();
  /**
   * <code>.chalk.server.v1.AWSSecretManagerConfig secret_manager_config = 6 [json_name = "secretManagerConfig"];</code>
   */
  ai.chalk.protos.chalk.server.v1.AWSSecretManagerConfigOrBuilder getSecretManagerConfigOrBuilder();

  /**
   * <code>.chalk.server.v1.GCPWorkloadIdentity workload_identity = 7 [json_name = "workloadIdentity"];</code>
   * @return Whether the workloadIdentity field is set.
   */
  boolean hasWorkloadIdentity();
  /**
   * <code>.chalk.server.v1.GCPWorkloadIdentity workload_identity = 7 [json_name = "workloadIdentity"];</code>
   * @return The workloadIdentity.
   */
  ai.chalk.protos.chalk.server.v1.GCPWorkloadIdentity getWorkloadIdentity();
  /**
   * <code>.chalk.server.v1.GCPWorkloadIdentity workload_identity = 7 [json_name = "workloadIdentity"];</code>
   */
  ai.chalk.protos.chalk.server.v1.GCPWorkloadIdentityOrBuilder getWorkloadIdentityOrBuilder();

  /**
   * <code>.chalk.server.v1.DockerBuildConfig docker_build_config = 8 [json_name = "dockerBuildConfig"];</code>
   * @return Whether the dockerBuildConfig field is set.
   */
  boolean hasDockerBuildConfig();
  /**
   * <code>.chalk.server.v1.DockerBuildConfig docker_build_config = 8 [json_name = "dockerBuildConfig"];</code>
   * @return The dockerBuildConfig.
   */
  ai.chalk.protos.chalk.server.v1.DockerBuildConfig getDockerBuildConfig();
  /**
   * <code>.chalk.server.v1.DockerBuildConfig docker_build_config = 8 [json_name = "dockerBuildConfig"];</code>
   */
  ai.chalk.protos.chalk.server.v1.DockerBuildConfigOrBuilder getDockerBuildConfigOrBuilder();

  /**
   * <code>.chalk.server.v1.ElasticsearchLogConfig elasticsearch_log_config = 9 [json_name = "elasticsearchLogConfig"];</code>
   * @return Whether the elasticsearchLogConfig field is set.
   */
  boolean hasElasticsearchLogConfig();
  /**
   * <code>.chalk.server.v1.ElasticsearchLogConfig elasticsearch_log_config = 9 [json_name = "elasticsearchLogConfig"];</code>
   * @return The elasticsearchLogConfig.
   */
  ai.chalk.protos.chalk.server.v1.ElasticsearchLogConfig getElasticsearchLogConfig();
  /**
   * <code>.chalk.server.v1.ElasticsearchLogConfig elasticsearch_log_config = 9 [json_name = "elasticsearchLogConfig"];</code>
   */
  ai.chalk.protos.chalk.server.v1.ElasticsearchLogConfigOrBuilder getElasticsearchLogConfigOrBuilder();
}
