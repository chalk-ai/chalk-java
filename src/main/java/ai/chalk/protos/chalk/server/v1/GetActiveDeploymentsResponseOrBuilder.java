// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/deploy.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface GetActiveDeploymentsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetActiveDeploymentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.server.v1.Deployment deployments = 1 [json_name = "deployments"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.Deployment> 
      getDeploymentsList();
  /**
   * <code>repeated .chalk.server.v1.Deployment deployments = 1 [json_name = "deployments"];</code>
   */
  ai.chalk.protos.chalk.server.v1.Deployment getDeployments(int index);
  /**
   * <code>repeated .chalk.server.v1.Deployment deployments = 1 [json_name = "deployments"];</code>
   */
  int getDeploymentsCount();
  /**
   * <code>repeated .chalk.server.v1.Deployment deployments = 1 [json_name = "deployments"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.DeploymentOrBuilder> 
      getDeploymentsOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.Deployment deployments = 1 [json_name = "deployments"];</code>
   */
  ai.chalk.protos.chalk.server.v1.DeploymentOrBuilder getDeploymentsOrBuilder(
      int index);
}
