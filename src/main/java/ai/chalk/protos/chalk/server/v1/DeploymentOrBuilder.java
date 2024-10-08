// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/deployment.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface DeploymentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.Deployment)
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
   * <code>string environment_id = 2 [json_name = "environmentId"];</code>
   * @return The environmentId.
   */
  java.lang.String getEnvironmentId();
  /**
   * <code>string environment_id = 2 [json_name = "environmentId"];</code>
   * @return The bytes for environmentId.
   */
  com.google.protobuf.ByteString
      getEnvironmentIdBytes();

  /**
   * <code>.chalk.server.v1.DeploymentStatus status = 3 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.chalk.server.v1.DeploymentStatus status = 3 [json_name = "status"];</code>
   * @return The status.
   */
  ai.chalk.protos.chalk.server.v1.DeploymentStatus getStatus();

  /**
   * <code>repeated string deployment_tags = 4 [json_name = "deploymentTags"];</code>
   * @return A list containing the deploymentTags.
   */
  java.util.List<java.lang.String>
      getDeploymentTagsList();
  /**
   * <code>repeated string deployment_tags = 4 [json_name = "deploymentTags"];</code>
   * @return The count of deploymentTags.
   */
  int getDeploymentTagsCount();
  /**
   * <code>repeated string deployment_tags = 4 [json_name = "deploymentTags"];</code>
   * @param index The index of the element to return.
   * @return The deploymentTags at the given index.
   */
  java.lang.String getDeploymentTags(int index);
  /**
   * <code>repeated string deployment_tags = 4 [json_name = "deploymentTags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the deploymentTags at the given index.
   */
  com.google.protobuf.ByteString
      getDeploymentTagsBytes(int index);

  /**
   * <pre>
   *  We know a bunch more things about the deployment. Deal with them when we're ready.
   *  string cloud_build_id = 4;
   *  string triggered_by = 5;
   *  google.protobuf.Timestamp status_changed_at = 6;
   * </pre>
   *
   * <code>optional string requirements_filepath = 7 [json_name = "requirementsFilepath"];</code>
   * @return Whether the requirementsFilepath field is set.
   */
  boolean hasRequirementsFilepath();
  /**
   * <pre>
   *  We know a bunch more things about the deployment. Deal with them when we're ready.
   *  string cloud_build_id = 4;
   *  string triggered_by = 5;
   *  google.protobuf.Timestamp status_changed_at = 6;
   * </pre>
   *
   * <code>optional string requirements_filepath = 7 [json_name = "requirementsFilepath"];</code>
   * @return The requirementsFilepath.
   */
  java.lang.String getRequirementsFilepath();
  /**
   * <pre>
   *  We know a bunch more things about the deployment. Deal with them when we're ready.
   *  string cloud_build_id = 4;
   *  string triggered_by = 5;
   *  google.protobuf.Timestamp status_changed_at = 6;
   * </pre>
   *
   * <code>optional string requirements_filepath = 7 [json_name = "requirementsFilepath"];</code>
   * @return The bytes for requirementsFilepath.
   */
  com.google.protobuf.ByteString
      getRequirementsFilepathBytes();

  /**
   * <code>optional string dockerfile_filepath = 8 [json_name = "dockerfileFilepath"];</code>
   * @return Whether the dockerfileFilepath field is set.
   */
  boolean hasDockerfileFilepath();
  /**
   * <code>optional string dockerfile_filepath = 8 [json_name = "dockerfileFilepath"];</code>
   * @return The dockerfileFilepath.
   */
  java.lang.String getDockerfileFilepath();
  /**
   * <code>optional string dockerfile_filepath = 8 [json_name = "dockerfileFilepath"];</code>
   * @return The bytes for dockerfileFilepath.
   */
  com.google.protobuf.ByteString
      getDockerfileFilepathBytes();

  /**
   * <code>optional string runtime = 9 [json_name = "runtime"];</code>
   * @return Whether the runtime field is set.
   */
  boolean hasRuntime();
  /**
   * <code>optional string runtime = 9 [json_name = "runtime"];</code>
   * @return The runtime.
   */
  java.lang.String getRuntime();
  /**
   * <code>optional string runtime = 9 [json_name = "runtime"];</code>
   * @return The bytes for runtime.
   */
  com.google.protobuf.ByteString
      getRuntimeBytes();

  /**
   * <pre>
   *  string chalkpy_version = 10;
   *  string raw_dependency_hash = 11;
   * </pre>
   *
   * <code>optional string final_dependency_hash = 12 [json_name = "finalDependencyHash"];</code>
   * @return Whether the finalDependencyHash field is set.
   */
  boolean hasFinalDependencyHash();
  /**
   * <pre>
   *  string chalkpy_version = 10;
   *  string raw_dependency_hash = 11;
   * </pre>
   *
   * <code>optional string final_dependency_hash = 12 [json_name = "finalDependencyHash"];</code>
   * @return The finalDependencyHash.
   */
  java.lang.String getFinalDependencyHash();
  /**
   * <pre>
   *  string chalkpy_version = 10;
   *  string raw_dependency_hash = 11;
   * </pre>
   *
   * <code>optional string final_dependency_hash = 12 [json_name = "finalDependencyHash"];</code>
   * @return The bytes for finalDependencyHash.
   */
  com.google.protobuf.ByteString
      getFinalDependencyHashBytes();

  /**
   * <code>optional bool is_preview_deployment = 13 [json_name = "isPreviewDeployment"];</code>
   * @return Whether the isPreviewDeployment field is set.
   */
  boolean hasIsPreviewDeployment();
  /**
   * <code>optional bool is_preview_deployment = 13 [json_name = "isPreviewDeployment"];</code>
   * @return The isPreviewDeployment.
   */
  boolean getIsPreviewDeployment();

  /**
   * <code>.google.protobuf.Timestamp created_at = 14 [json_name = "createdAt"];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 14 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 14 [json_name = "createdAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp updated_at = 15 [json_name = "updatedAt"];</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 15 [json_name = "updatedAt"];</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 15 [json_name = "updatedAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <code>string git_commit = 16 [json_name = "gitCommit"];</code>
   * @return The gitCommit.
   */
  java.lang.String getGitCommit();
  /**
   * <code>string git_commit = 16 [json_name = "gitCommit"];</code>
   * @return The bytes for gitCommit.
   */
  com.google.protobuf.ByteString
      getGitCommitBytes();

  /**
   * <pre>
   *  string git_pr = 17;
   *  string git_branch = 18;
   *  string git_author_email = 19;
   *  string branch = 20;
   *  string project_settings = 21;
   * </pre>
   *
   * <code>optional string requirements_files = 22 [json_name = "requirementsFiles"];</code>
   * @return Whether the requirementsFiles field is set.
   */
  boolean hasRequirementsFiles();
  /**
   * <pre>
   *  string git_pr = 17;
   *  string git_branch = 18;
   *  string git_author_email = 19;
   *  string branch = 20;
   *  string project_settings = 21;
   * </pre>
   *
   * <code>optional string requirements_files = 22 [json_name = "requirementsFiles"];</code>
   * @return The requirementsFiles.
   */
  java.lang.String getRequirementsFiles();
  /**
   * <pre>
   *  string git_pr = 17;
   *  string git_branch = 18;
   *  string git_author_email = 19;
   *  string branch = 20;
   *  string project_settings = 21;
   * </pre>
   *
   * <code>optional string requirements_files = 22 [json_name = "requirementsFiles"];</code>
   * @return The bytes for requirementsFiles.
   */
  com.google.protobuf.ByteString
      getRequirementsFilesBytes();

  /**
   * <pre>
   *  string git_tag = 23;
   * </pre>
   *
   * <code>string base_image_sha = 24 [json_name = "baseImageSha"];</code>
   * @return The baseImageSha.
   */
  java.lang.String getBaseImageSha();
  /**
   * <pre>
   *  string git_tag = 23;
   * </pre>
   *
   * <code>string base_image_sha = 24 [json_name = "baseImageSha"];</code>
   * @return The bytes for baseImageSha.
   */
  com.google.protobuf.ByteString
      getBaseImageShaBytes();
}
