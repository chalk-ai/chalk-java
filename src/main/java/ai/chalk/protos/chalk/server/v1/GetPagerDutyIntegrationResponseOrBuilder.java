// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/monitoring.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface GetPagerDutyIntegrationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetPagerDutyIntegrationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.server.v1.PagerDutyIntegration integration = 1 [json_name = "integration"];</code>
   * @return Whether the integration field is set.
   */
  boolean hasIntegration();
  /**
   * <code>.chalk.server.v1.PagerDutyIntegration integration = 1 [json_name = "integration"];</code>
   * @return The integration.
   */
  ai.chalk.protos.chalk.server.v1.PagerDutyIntegration getIntegration();
  /**
   * <code>.chalk.server.v1.PagerDutyIntegration integration = 1 [json_name = "integration"];</code>
   */
  ai.chalk.protos.chalk.server.v1.PagerDutyIntegrationOrBuilder getIntegrationOrBuilder();
}
