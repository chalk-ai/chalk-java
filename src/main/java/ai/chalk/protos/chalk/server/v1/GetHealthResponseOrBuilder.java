// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/status.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface GetHealthResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetHealthResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.server.v1.HealthCheck checks = 1 [json_name = "checks"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.HealthCheck> 
      getChecksList();
  /**
   * <code>repeated .chalk.server.v1.HealthCheck checks = 1 [json_name = "checks"];</code>
   */
  ai.chalk.protos.chalk.server.v1.HealthCheck getChecks(int index);
  /**
   * <code>repeated .chalk.server.v1.HealthCheck checks = 1 [json_name = "checks"];</code>
   */
  int getChecksCount();
  /**
   * <code>repeated .chalk.server.v1.HealthCheck checks = 1 [json_name = "checks"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.HealthCheckOrBuilder> 
      getChecksOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.HealthCheck checks = 1 [json_name = "checks"];</code>
   */
  ai.chalk.protos.chalk.server.v1.HealthCheckOrBuilder getChecksOrBuilder(
      int index);
}
