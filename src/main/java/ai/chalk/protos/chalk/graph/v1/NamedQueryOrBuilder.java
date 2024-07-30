// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.graph.v1;

public interface NamedQueryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.graph.v1.NamedQuery)
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
   * <code>int64 version = 2 [json_name = "version"];</code>
   * @return The version.
   */
  long getVersion();

  /**
   * <code>repeated string input = 3 [json_name = "input"];</code>
   * @return A list containing the input.
   */
  java.util.List<java.lang.String>
      getInputList();
  /**
   * <code>repeated string input = 3 [json_name = "input"];</code>
   * @return The count of input.
   */
  int getInputCount();
  /**
   * <code>repeated string input = 3 [json_name = "input"];</code>
   * @param index The index of the element to return.
   * @return The input at the given index.
   */
  java.lang.String getInput(int index);
  /**
   * <code>repeated string input = 3 [json_name = "input"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the input at the given index.
   */
  com.google.protobuf.ByteString
      getInputBytes(int index);

  /**
   * <code>repeated string output = 4 [json_name = "output"];</code>
   * @return A list containing the output.
   */
  java.util.List<java.lang.String>
      getOutputList();
  /**
   * <code>repeated string output = 4 [json_name = "output"];</code>
   * @return The count of output.
   */
  int getOutputCount();
  /**
   * <code>repeated string output = 4 [json_name = "output"];</code>
   * @param index The index of the element to return.
   * @return The output at the given index.
   */
  java.lang.String getOutput(int index);
  /**
   * <code>repeated string output = 4 [json_name = "output"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the output at the given index.
   */
  com.google.protobuf.ByteString
      getOutputBytes(int index);

  /**
   * <code>repeated string tags = 5 [json_name = "tags"];</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <code>repeated string tags = 5 [json_name = "tags"];</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 5 [json_name = "tags"];</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <code>repeated string tags = 5 [json_name = "tags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <code>optional string description = 6 [json_name = "description"];</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>optional string description = 6 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 6 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>optional string owner = 7 [json_name = "owner"];</code>
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   * <code>optional string owner = 7 [json_name = "owner"];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>optional string owner = 7 [json_name = "owner"];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>map&lt;string, string&gt; meta = 8 [json_name = "meta"];</code>
   */
  int getMetaCount();
  /**
   * <code>map&lt;string, string&gt; meta = 8 [json_name = "meta"];</code>
   */
  boolean containsMeta(
      java.lang.String key);
  /**
   * Use {@link #getMetaMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMeta();
  /**
   * <code>map&lt;string, string&gt; meta = 8 [json_name = "meta"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetaMap();
  /**
   * <code>map&lt;string, string&gt; meta = 8 [json_name = "meta"];</code>
   */
  /* nullable */
java.lang.String getMetaOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; meta = 8 [json_name = "meta"];</code>
   */
  java.lang.String getMetaOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, .google.protobuf.Duration&gt; staleness = 9 [json_name = "staleness"];</code>
   */
  int getStalenessCount();
  /**
   * <code>map&lt;string, .google.protobuf.Duration&gt; staleness = 9 [json_name = "staleness"];</code>
   */
  boolean containsStaleness(
      java.lang.String key);
  /**
   * Use {@link #getStalenessMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Duration>
  getStaleness();
  /**
   * <code>map&lt;string, .google.protobuf.Duration&gt; staleness = 9 [json_name = "staleness"];</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Duration>
  getStalenessMap();
  /**
   * <code>map&lt;string, .google.protobuf.Duration&gt; staleness = 9 [json_name = "staleness"];</code>
   */
  /* nullable */
com.google.protobuf.Duration getStalenessOrDefault(
      java.lang.String key,
      /* nullable */
com.google.protobuf.Duration defaultValue);
  /**
   * <code>map&lt;string, .google.protobuf.Duration&gt; staleness = 9 [json_name = "staleness"];</code>
   */
  com.google.protobuf.Duration getStalenessOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, string&gt; planner_options = 10 [json_name = "plannerOptions"];</code>
   */
  int getPlannerOptionsCount();
  /**
   * <code>map&lt;string, string&gt; planner_options = 10 [json_name = "plannerOptions"];</code>
   */
  boolean containsPlannerOptions(
      java.lang.String key);
  /**
   * Use {@link #getPlannerOptionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getPlannerOptions();
  /**
   * <code>map&lt;string, string&gt; planner_options = 10 [json_name = "plannerOptions"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getPlannerOptionsMap();
  /**
   * <code>map&lt;string, string&gt; planner_options = 10 [json_name = "plannerOptions"];</code>
   */
  /* nullable */
java.lang.String getPlannerOptionsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; planner_options = 10 [json_name = "plannerOptions"];</code>
   */
  java.lang.String getPlannerOptionsOrThrow(
      java.lang.String key);

  /**
   * <code>string file_name = 11 [json_name = "fileName"];</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <code>string file_name = 11 [json_name = "fileName"];</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();
}