// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/deploy.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface CreateBranchFromSourceDeploymentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.CreateBranchFromSourceDeploymentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string deployment_id = 1 [json_name = "deploymentId"];</code>
   * @return The deploymentId.
   */
  java.lang.String getDeploymentId();
  /**
   * <code>string deployment_id = 1 [json_name = "deploymentId"];</code>
   * @return The bytes for deploymentId.
   */
  com.google.protobuf.ByteString
      getDeploymentIdBytes();

  /**
   * <code>repeated .chalk.common.v1.ChalkError deployment_errors = 2 [json_name = "deploymentErrors"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.common.v1.ChalkError> 
      getDeploymentErrorsList();
  /**
   * <code>repeated .chalk.common.v1.ChalkError deployment_errors = 2 [json_name = "deploymentErrors"];</code>
   */
  ai.chalk.protos.chalk.common.v1.ChalkError getDeploymentErrors(int index);
  /**
   * <code>repeated .chalk.common.v1.ChalkError deployment_errors = 2 [json_name = "deploymentErrors"];</code>
   */
  int getDeploymentErrorsCount();
  /**
   * <code>repeated .chalk.common.v1.ChalkError deployment_errors = 2 [json_name = "deploymentErrors"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.common.v1.ChalkErrorOrBuilder> 
      getDeploymentErrorsOrBuilderList();
  /**
   * <code>repeated .chalk.common.v1.ChalkError deployment_errors = 2 [json_name = "deploymentErrors"];</code>
   */
  ai.chalk.protos.chalk.common.v1.ChalkErrorOrBuilder getDeploymentErrorsOrBuilder(
      int index);

  /**
   * <code>optional .chalk.artifacts.v1.Export export = 3 [json_name = "export"];</code>
   * @return Whether the export field is set.
   */
  boolean hasExport();
  /**
   * <code>optional .chalk.artifacts.v1.Export export = 3 [json_name = "export"];</code>
   * @return The export.
   */
  ai.chalk.protos.chalk.artifacts.v1.Export getExport();
  /**
   * <code>optional .chalk.artifacts.v1.Export export = 3 [json_name = "export"];</code>
   */
  ai.chalk.protos.chalk.artifacts.v1.ExportOrBuilder getExportOrBuilder();

  /**
   * <code>bool branch_already_exists = 4 [json_name = "branchAlreadyExists"];</code>
   * @return The branchAlreadyExists.
   */
  boolean getBranchAlreadyExists();
}
