// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/datasets.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface DatasetMetaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.DatasetMeta)
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
   * <code>optional string dataset_name = 3 [json_name = "datasetName"];</code>
   * @return Whether the datasetName field is set.
   */
  boolean hasDatasetName();
  /**
   * <code>optional string dataset_name = 3 [json_name = "datasetName"];</code>
   * @return The datasetName.
   */
  java.lang.String getDatasetName();
  /**
   * <code>optional string dataset_name = 3 [json_name = "datasetName"];</code>
   * @return The bytes for datasetName.
   */
  com.google.protobuf.ByteString
      getDatasetNameBytes();

  /**
   * <code>.google.protobuf.Timestamp created_at = 5 [json_name = "createdAt"];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 5 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 5 [json_name = "createdAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>optional .chalk.server.v1.DatasetRevisionMeta most_recent_revision = 7 [json_name = "mostRecentRevision"];</code>
   * @return Whether the mostRecentRevision field is set.
   */
  boolean hasMostRecentRevision();
  /**
   * <code>optional .chalk.server.v1.DatasetRevisionMeta most_recent_revision = 7 [json_name = "mostRecentRevision"];</code>
   * @return The mostRecentRevision.
   */
  ai.chalk.protos.chalk.server.v1.DatasetRevisionMeta getMostRecentRevision();
  /**
   * <code>optional .chalk.server.v1.DatasetRevisionMeta most_recent_revision = 7 [json_name = "mostRecentRevision"];</code>
   */
  ai.chalk.protos.chalk.server.v1.DatasetRevisionMetaOrBuilder getMostRecentRevisionOrBuilder();
}
