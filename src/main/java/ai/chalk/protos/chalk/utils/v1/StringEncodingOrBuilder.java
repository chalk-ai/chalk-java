// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/utils/v1/encoding.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.utils.v1;

public interface StringEncodingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.utils.v1.StringEncoding)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;int32, string&gt; mapping = 1 [json_name = "mapping"];</code>
   */
  int getMappingCount();
  /**
   * <code>map&lt;int32, string&gt; mapping = 1 [json_name = "mapping"];</code>
   */
  boolean containsMapping(
      int key);
  /**
   * Use {@link #getMappingMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.String>
  getMapping();
  /**
   * <code>map&lt;int32, string&gt; mapping = 1 [json_name = "mapping"];</code>
   */
  java.util.Map<java.lang.Integer, java.lang.String>
  getMappingMap();
  /**
   * <code>map&lt;int32, string&gt; mapping = 1 [json_name = "mapping"];</code>
   */
  /* nullable */
java.lang.String getMappingOrDefault(
      int key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;int32, string&gt; mapping = 1 [json_name = "mapping"];</code>
   */
  java.lang.String getMappingOrThrow(
      int key);
}
