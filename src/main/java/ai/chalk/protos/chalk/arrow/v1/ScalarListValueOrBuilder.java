// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/arrow/v1/arrow.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.arrow.v1;

public interface ScalarListValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.arrow.v1.ScalarListValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes arrow_data = 1 [json_name = "arrowData"];</code>
   * @return The arrowData.
   */
  com.google.protobuf.ByteString getArrowData();

  /**
   * <code>.chalk.arrow.v1.Schema schema = 2 [json_name = "schema"];</code>
   * @return Whether the schema field is set.
   */
  boolean hasSchema();
  /**
   * <code>.chalk.arrow.v1.Schema schema = 2 [json_name = "schema"];</code>
   * @return The schema.
   */
  ai.chalk.protos.chalk.arrow.v1.Schema getSchema();
  /**
   * <code>.chalk.arrow.v1.Schema schema = 2 [json_name = "schema"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.SchemaOrBuilder getSchemaOrBuilder();
}
