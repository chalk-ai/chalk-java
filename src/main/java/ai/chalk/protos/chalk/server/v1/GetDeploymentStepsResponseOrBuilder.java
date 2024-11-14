// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/builder.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface GetDeploymentStepsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetDeploymentStepsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.server.v1.DeploymentBuildStep steps = 1 [json_name = "steps"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.DeploymentBuildStep> 
      getStepsList();
  /**
   * <code>repeated .chalk.server.v1.DeploymentBuildStep steps = 1 [json_name = "steps"];</code>
   */
  ai.chalk.protos.chalk.server.v1.DeploymentBuildStep getSteps(int index);
  /**
   * <code>repeated .chalk.server.v1.DeploymentBuildStep steps = 1 [json_name = "steps"];</code>
   */
  int getStepsCount();
  /**
   * <code>repeated .chalk.server.v1.DeploymentBuildStep steps = 1 [json_name = "steps"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.DeploymentBuildStepOrBuilder> 
      getStepsOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.DeploymentBuildStep steps = 1 [json_name = "steps"];</code>
   */
  ai.chalk.protos.chalk.server.v1.DeploymentBuildStepOrBuilder getStepsOrBuilder(
      int index);

  /**
   * <code>.chalk.server.v1.Deployment deployment = 2 [json_name = "deployment"];</code>
   * @return Whether the deployment field is set.
   */
  boolean hasDeployment();
  /**
   * <code>.chalk.server.v1.Deployment deployment = 2 [json_name = "deployment"];</code>
   * @return The deployment.
   */
  ai.chalk.protos.chalk.server.v1.Deployment getDeployment();
  /**
   * <code>.chalk.server.v1.Deployment deployment = 2 [json_name = "deployment"];</code>
   */
  ai.chalk.protos.chalk.server.v1.DeploymentOrBuilder getDeploymentOrBuilder();
}