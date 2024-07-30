// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/auth/v1/agent.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.auth.v1;

public interface AgentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.auth.v1.Agent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.auth.v1.UserAgent user_agent = 1 [json_name = "userAgent"];</code>
   * @return Whether the userAgent field is set.
   */
  boolean hasUserAgent();
  /**
   * <code>.chalk.auth.v1.UserAgent user_agent = 1 [json_name = "userAgent"];</code>
   * @return The userAgent.
   */
  ai.chalk.protos.chalk.auth.v1.UserAgent getUserAgent();
  /**
   * <code>.chalk.auth.v1.UserAgent user_agent = 1 [json_name = "userAgent"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.UserAgentOrBuilder getUserAgentOrBuilder();

  /**
   * <code>.chalk.auth.v1.ServiceTokenAgent service_token_agent = 2 [json_name = "serviceTokenAgent"];</code>
   * @return Whether the serviceTokenAgent field is set.
   */
  boolean hasServiceTokenAgent();
  /**
   * <code>.chalk.auth.v1.ServiceTokenAgent service_token_agent = 2 [json_name = "serviceTokenAgent"];</code>
   * @return The serviceTokenAgent.
   */
  ai.chalk.protos.chalk.auth.v1.ServiceTokenAgent getServiceTokenAgent();
  /**
   * <code>.chalk.auth.v1.ServiceTokenAgent service_token_agent = 2 [json_name = "serviceTokenAgent"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.ServiceTokenAgentOrBuilder getServiceTokenAgentOrBuilder();

  /**
   * <code>.chalk.auth.v1.EngineAgent engine_agent = 3 [json_name = "engineAgent"];</code>
   * @return Whether the engineAgent field is set.
   */
  boolean hasEngineAgent();
  /**
   * <code>.chalk.auth.v1.EngineAgent engine_agent = 3 [json_name = "engineAgent"];</code>
   * @return The engineAgent.
   */
  ai.chalk.protos.chalk.auth.v1.EngineAgent getEngineAgent();
  /**
   * <code>.chalk.auth.v1.EngineAgent engine_agent = 3 [json_name = "engineAgent"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.EngineAgentOrBuilder getEngineAgentOrBuilder();

  /**
   * <code>.chalk.auth.v1.TenantAgent tenant_agent = 4 [json_name = "tenantAgent"];</code>
   * @return Whether the tenantAgent field is set.
   */
  boolean hasTenantAgent();
  /**
   * <code>.chalk.auth.v1.TenantAgent tenant_agent = 4 [json_name = "tenantAgent"];</code>
   * @return The tenantAgent.
   */
  ai.chalk.protos.chalk.auth.v1.TenantAgent getTenantAgent();
  /**
   * <code>.chalk.auth.v1.TenantAgent tenant_agent = 4 [json_name = "tenantAgent"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.TenantAgentOrBuilder getTenantAgentOrBuilder();

  /**
   * <code>.chalk.auth.v1.MetadataServiceAgent metadata_service_agent = 5 [json_name = "metadataServiceAgent"];</code>
   * @return Whether the metadataServiceAgent field is set.
   */
  boolean hasMetadataServiceAgent();
  /**
   * <code>.chalk.auth.v1.MetadataServiceAgent metadata_service_agent = 5 [json_name = "metadataServiceAgent"];</code>
   * @return The metadataServiceAgent.
   */
  ai.chalk.protos.chalk.auth.v1.MetadataServiceAgent getMetadataServiceAgent();
  /**
   * <code>.chalk.auth.v1.MetadataServiceAgent metadata_service_agent = 5 [json_name = "metadataServiceAgent"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.MetadataServiceAgentOrBuilder getMetadataServiceAgentOrBuilder();

  ai.chalk.protos.chalk.auth.v1.Agent.AgentCase getAgentCase();
}
