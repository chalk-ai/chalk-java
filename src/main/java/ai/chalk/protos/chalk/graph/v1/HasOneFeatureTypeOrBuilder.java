// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.graph.v1;

public interface HasOneFeatureTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.graph.v1.HasOneFeatureType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string namespace = 2 [json_name = "namespace"];</code>
   * @return The namespace.
   */
  java.lang.String getNamespace();
  /**
   * <code>string namespace = 2 [json_name = "namespace"];</code>
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();

  /**
   * <code>string foreign_namespace = 3 [json_name = "foreignNamespace"];</code>
   * @return The foreignNamespace.
   */
  java.lang.String getForeignNamespace();
  /**
   * <code>string foreign_namespace = 3 [json_name = "foreignNamespace"];</code>
   * @return The bytes for foreignNamespace.
   */
  com.google.protobuf.ByteString
      getForeignNamespaceBytes();

  /**
   * <code>.chalk.expression.v1.LogicalExprNode join = 4 [json_name = "join"];</code>
   * @return Whether the join field is set.
   */
  boolean hasJoin();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode join = 4 [json_name = "join"];</code>
   * @return The join.
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getJoin();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode join = 4 [json_name = "join"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getJoinOrBuilder();

  /**
   * <code>bool is_nullable = 5 [json_name = "isNullable"];</code>
   * @return The isNullable.
   */
  boolean getIsNullable();

  /**
   * <code>bool is_autogenerated = 6 [json_name = "isAutogenerated"];</code>
   * @return The isAutogenerated.
   */
  boolean getIsAutogenerated();

  /**
   * <code>repeated string tags = 7 [json_name = "tags"];</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <code>repeated string tags = 7 [json_name = "tags"];</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 7 [json_name = "tags"];</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <code>repeated string tags = 7 [json_name = "tags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <code>optional string description = 8 [json_name = "description"];</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>optional string description = 8 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 8 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>optional string owner = 9 [json_name = "owner"];</code>
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   * <code>optional string owner = 9 [json_name = "owner"];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>optional string owner = 9 [json_name = "owner"];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>string attribute_name = 10 [json_name = "attributeName"];</code>
   * @return The attributeName.
   */
  java.lang.String getAttributeName();
  /**
   * <code>string attribute_name = 10 [json_name = "attributeName"];</code>
   * @return The bytes for attributeName.
   */
  com.google.protobuf.ByteString
      getAttributeNameBytes();
}
