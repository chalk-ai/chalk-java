// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/arrow/v1/arrow.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.arrow.v1;

public interface SchemaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.arrow.v1.Schema)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.arrow.v1.Field columns = 1 [json_name = "columns"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.arrow.v1.Field> 
      getColumnsList();
  /**
   * <code>repeated .chalk.arrow.v1.Field columns = 1 [json_name = "columns"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.Field getColumns(int index);
  /**
   * <code>repeated .chalk.arrow.v1.Field columns = 1 [json_name = "columns"];</code>
   */
  int getColumnsCount();
  /**
   * <code>repeated .chalk.arrow.v1.Field columns = 1 [json_name = "columns"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder> 
      getColumnsOrBuilderList();
  /**
   * <code>repeated .chalk.arrow.v1.Field columns = 1 [json_name = "columns"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder getColumnsOrBuilder(
      int index);

  /**
   * <code>map&lt;string, string&gt; metadata = 2 [json_name = "metadata"];</code>
   */
  int getMetadataCount();
  /**
   * <code>map&lt;string, string&gt; metadata = 2 [json_name = "metadata"];</code>
   */
  boolean containsMetadata(
      java.lang.String key);
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMetadata();
  /**
   * <code>map&lt;string, string&gt; metadata = 2 [json_name = "metadata"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <code>map&lt;string, string&gt; metadata = 2 [json_name = "metadata"];</code>
   */
  /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; metadata = 2 [json_name = "metadata"];</code>
   */
  java.lang.String getMetadataOrThrow(
      java.lang.String key);
}
