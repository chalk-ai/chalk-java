// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/arrow/v1/arrow.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.arrow.v1;

public interface FieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.arrow.v1.Field)
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
   * <code>.chalk.arrow.v1.ArrowType arrow_type = 2 [json_name = "arrowType"];</code>
   * @return Whether the arrowType field is set.
   */
  boolean hasArrowType();
  /**
   * <code>.chalk.arrow.v1.ArrowType arrow_type = 2 [json_name = "arrowType"];</code>
   * @return The arrowType.
   */
  ai.chalk.protos.chalk.arrow.v1.ArrowType getArrowType();
  /**
   * <code>.chalk.arrow.v1.ArrowType arrow_type = 2 [json_name = "arrowType"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ArrowTypeOrBuilder getArrowTypeOrBuilder();

  /**
   * <code>bool nullable = 3 [json_name = "nullable"];</code>
   * @return The nullable.
   */
  boolean getNullable();

  /**
   * <code>repeated .chalk.arrow.v1.Field children = 4 [json_name = "children"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.arrow.v1.Field> 
      getChildrenList();
  /**
   * <code>repeated .chalk.arrow.v1.Field children = 4 [json_name = "children"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.Field getChildren(int index);
  /**
   * <code>repeated .chalk.arrow.v1.Field children = 4 [json_name = "children"];</code>
   */
  int getChildrenCount();
  /**
   * <code>repeated .chalk.arrow.v1.Field children = 4 [json_name = "children"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder> 
      getChildrenOrBuilderList();
  /**
   * <code>repeated .chalk.arrow.v1.Field children = 4 [json_name = "children"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder getChildrenOrBuilder(
      int index);

  /**
   * <code>map&lt;string, string&gt; metadata = 5 [json_name = "metadata"];</code>
   */
  int getMetadataCount();
  /**
   * <code>map&lt;string, string&gt; metadata = 5 [json_name = "metadata"];</code>
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
   * <code>map&lt;string, string&gt; metadata = 5 [json_name = "metadata"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <code>map&lt;string, string&gt; metadata = 5 [json_name = "metadata"];</code>
   */
  /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; metadata = 5 [json_name = "metadata"];</code>
   */
  java.lang.String getMetadataOrThrow(
      java.lang.String key);
}
