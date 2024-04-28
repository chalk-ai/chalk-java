// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/graph.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

public interface FeatureMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.FeatureMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string fqn = 1 [json_name = "fqn"];</code>
   * @return The fqn.
   */
  java.lang.String getFqn();
  /**
   * <code>string fqn = 1 [json_name = "fqn"];</code>
   * @return The bytes for fqn.
   */
  com.google.protobuf.ByteString
      getFqnBytes();

  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string namespace = 3 [json_name = "namespace"];</code>
   * @return The namespace.
   */
  java.lang.String getNamespace();
  /**
   * <code>string namespace = 3 [json_name = "namespace"];</code>
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();

  /**
   * <code>optional string description = 4 [json_name = "description"];</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>optional string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>optional string owner = 5 [json_name = "owner"];</code>
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   * <code>optional string owner = 5 [json_name = "owner"];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>optional string owner = 5 [json_name = "owner"];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>repeated string tags = 6 [json_name = "tags"];</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <code>repeated string tags = 6 [json_name = "tags"];</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 6 [json_name = "tags"];</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <code>repeated string tags = 6 [json_name = "tags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <code>optional string max_staleness = 7 [json_name = "maxStaleness"];</code>
   * @return Whether the maxStaleness field is set.
   */
  boolean hasMaxStaleness();
  /**
   * <code>optional string max_staleness = 7 [json_name = "maxStaleness"];</code>
   * @return The maxStaleness.
   */
  java.lang.String getMaxStaleness();
  /**
   * <code>optional string max_staleness = 7 [json_name = "maxStaleness"];</code>
   * @return The bytes for maxStaleness.
   */
  com.google.protobuf.ByteString
      getMaxStalenessBytes();

  /**
   * <code>bool etl_offline_to_online = 8 [json_name = "etlOfflineToOnline"];</code>
   * @return The etlOfflineToOnline.
   */
  boolean getEtlOfflineToOnline();
}
