// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/environment.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface GCPCloudConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GCPCloudConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string project_id = 1 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <code>string project_id = 1 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <code>string region = 2 [json_name = "region"];</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <code>string region = 2 [json_name = "region"];</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <code>optional string management_service_account = 3 [json_name = "managementServiceAccount"];</code>
   * @return Whether the managementServiceAccount field is set.
   */
  boolean hasManagementServiceAccount();
  /**
   * <code>optional string management_service_account = 3 [json_name = "managementServiceAccount"];</code>
   * @return The managementServiceAccount.
   */
  java.lang.String getManagementServiceAccount();
  /**
   * <code>optional string management_service_account = 3 [json_name = "managementServiceAccount"];</code>
   * @return The bytes for managementServiceAccount.
   */
  com.google.protobuf.ByteString
      getManagementServiceAccountBytes();

  /**
   * <code>.chalk.server.v1.DockerBuildConfig docker_build_config = 4 [json_name = "dockerBuildConfig"];</code>
   * @return Whether the dockerBuildConfig field is set.
   */
  boolean hasDockerBuildConfig();
  /**
   * <code>.chalk.server.v1.DockerBuildConfig docker_build_config = 4 [json_name = "dockerBuildConfig"];</code>
   * @return The dockerBuildConfig.
   */
  ai.chalk.protos.chalk.server.v1.DockerBuildConfig getDockerBuildConfig();
  /**
   * <code>.chalk.server.v1.DockerBuildConfig docker_build_config = 4 [json_name = "dockerBuildConfig"];</code>
   */
  ai.chalk.protos.chalk.server.v1.DockerBuildConfigOrBuilder getDockerBuildConfigOrBuilder();
}
