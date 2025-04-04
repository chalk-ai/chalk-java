// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/builder.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface BackgroundPersistenceDeploymentSpecsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.BackgroundPersistenceDeploymentSpecs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.server.v1.BackgroundPersistenceCommonSpecs common_persistence_specs = 1 [json_name = "commonPersistenceSpecs"];</code>
   * @return Whether the commonPersistenceSpecs field is set.
   */
  boolean hasCommonPersistenceSpecs();
  /**
   * <code>.chalk.server.v1.BackgroundPersistenceCommonSpecs common_persistence_specs = 1 [json_name = "commonPersistenceSpecs"];</code>
   * @return The commonPersistenceSpecs.
   */
  ai.chalk.protos.chalk.server.v1.BackgroundPersistenceCommonSpecs getCommonPersistenceSpecs();
  /**
   * <code>.chalk.server.v1.BackgroundPersistenceCommonSpecs common_persistence_specs = 1 [json_name = "commonPersistenceSpecs"];</code>
   */
  ai.chalk.protos.chalk.server.v1.BackgroundPersistenceCommonSpecsOrBuilder getCommonPersistenceSpecsOrBuilder();

  /**
   * <code>string api_server_host = 2 [json_name = "apiServerHost"];</code>
   * @return The apiServerHost.
   */
  java.lang.String getApiServerHost();
  /**
   * <code>string api_server_host = 2 [json_name = "apiServerHost"];</code>
   * @return The bytes for apiServerHost.
   */
  com.google.protobuf.ByteString
      getApiServerHostBytes();

  /**
   * <code>string kafka_sasl_secret = 3 [json_name = "kafkaSaslSecret"];</code>
   * @return The kafkaSaslSecret.
   */
  java.lang.String getKafkaSaslSecret();
  /**
   * <code>string kafka_sasl_secret = 3 [json_name = "kafkaSaslSecret"];</code>
   * @return The bytes for kafkaSaslSecret.
   */
  com.google.protobuf.ByteString
      getKafkaSaslSecretBytes();

  /**
   * <code>string metadata_provider = 4 [json_name = "metadataProvider"];</code>
   * @return The metadataProvider.
   */
  java.lang.String getMetadataProvider();
  /**
   * <code>string metadata_provider = 4 [json_name = "metadataProvider"];</code>
   * @return The bytes for metadataProvider.
   */
  com.google.protobuf.ByteString
      getMetadataProviderBytes();

  /**
   * <code>string kafka_bootstrap_servers = 5 [json_name = "kafkaBootstrapServers"];</code>
   * @return The kafkaBootstrapServers.
   */
  java.lang.String getKafkaBootstrapServers();
  /**
   * <code>string kafka_bootstrap_servers = 5 [json_name = "kafkaBootstrapServers"];</code>
   * @return The bytes for kafkaBootstrapServers.
   */
  com.google.protobuf.ByteString
      getKafkaBootstrapServersBytes();

  /**
   * <code>string kafka_security_protocol = 6 [json_name = "kafkaSecurityProtocol"];</code>
   * @return The kafkaSecurityProtocol.
   */
  java.lang.String getKafkaSecurityProtocol();
  /**
   * <code>string kafka_security_protocol = 6 [json_name = "kafkaSecurityProtocol"];</code>
   * @return The bytes for kafkaSecurityProtocol.
   */
  com.google.protobuf.ByteString
      getKafkaSecurityProtocolBytes();

  /**
   * <code>string kafka_sasl_mechanism = 7 [json_name = "kafkaSaslMechanism"];</code>
   * @return The kafkaSaslMechanism.
   */
  java.lang.String getKafkaSaslMechanism();
  /**
   * <code>string kafka_sasl_mechanism = 7 [json_name = "kafkaSaslMechanism"];</code>
   * @return The bytes for kafkaSaslMechanism.
   */
  com.google.protobuf.ByteString
      getKafkaSaslMechanismBytes();

  /**
   * <code>string redis_is_clustered = 8 [json_name = "redisIsClustered"];</code>
   * @return The redisIsClustered.
   */
  java.lang.String getRedisIsClustered();
  /**
   * <code>string redis_is_clustered = 8 [json_name = "redisIsClustered"];</code>
   * @return The bytes for redisIsClustered.
   */
  com.google.protobuf.ByteString
      getRedisIsClusteredBytes();

  /**
   * <code>string snowflake_storage_integration_name = 9 [json_name = "snowflakeStorageIntegrationName"];</code>
   * @return The snowflakeStorageIntegrationName.
   */
  java.lang.String getSnowflakeStorageIntegrationName();
  /**
   * <code>string snowflake_storage_integration_name = 9 [json_name = "snowflakeStorageIntegrationName"];</code>
   * @return The bytes for snowflakeStorageIntegrationName.
   */
  com.google.protobuf.ByteString
      getSnowflakeStorageIntegrationNameBytes();

  /**
   * <code>bool redis_lightning_supports_has_many = 10 [json_name = "redisLightningSupportsHasMany"];</code>
   * @return The redisLightningSupportsHasMany.
   */
  boolean getRedisLightningSupportsHasMany();

  /**
   * <code>bool insecure = 11 [json_name = "insecure"];</code>
   * @return The insecure.
   */
  boolean getInsecure();

  /**
   * <code>repeated .chalk.server.v1.BackgroundPersistenceWriterSpecs writers = 12 [json_name = "writers"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.BackgroundPersistenceWriterSpecs> 
      getWritersList();
  /**
   * <code>repeated .chalk.server.v1.BackgroundPersistenceWriterSpecs writers = 12 [json_name = "writers"];</code>
   */
  ai.chalk.protos.chalk.server.v1.BackgroundPersistenceWriterSpecs getWriters(int index);
  /**
   * <code>repeated .chalk.server.v1.BackgroundPersistenceWriterSpecs writers = 12 [json_name = "writers"];</code>
   */
  int getWritersCount();
  /**
   * <code>repeated .chalk.server.v1.BackgroundPersistenceWriterSpecs writers = 12 [json_name = "writers"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.BackgroundPersistenceWriterSpecsOrBuilder> 
      getWritersOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.BackgroundPersistenceWriterSpecs writers = 12 [json_name = "writers"];</code>
   */
  ai.chalk.protos.chalk.server.v1.BackgroundPersistenceWriterSpecsOrBuilder getWritersOrBuilder(
      int index);
}
