// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface UpdateScimGroupSettingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.UpdateScimGroupSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string query_tags = 1 [json_name = "queryTags"];</code>
   * @return A list containing the queryTags.
   */
  java.util.List<java.lang.String>
      getQueryTagsList();
  /**
   * <code>repeated string query_tags = 1 [json_name = "queryTags"];</code>
   * @return The count of queryTags.
   */
  int getQueryTagsCount();
  /**
   * <code>repeated string query_tags = 1 [json_name = "queryTags"];</code>
   * @param index The index of the element to return.
   * @return The queryTags at the given index.
   */
  java.lang.String getQueryTags(int index);
  /**
   * <code>repeated string query_tags = 1 [json_name = "queryTags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the queryTags at the given index.
   */
  com.google.protobuf.ByteString
      getQueryTagsBytes(int index);

  /**
   * <code>string group = 2 [json_name = "group"];</code>
   * @return The group.
   */
  java.lang.String getGroup();
  /**
   * <code>string group = 2 [json_name = "group"];</code>
   * @return The bytes for group.
   */
  com.google.protobuf.ByteString
      getGroupBytes();
}