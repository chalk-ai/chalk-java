// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.expression.v1;

public interface PlaceholderNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.expression.v1.PlaceholderNode)
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
   * <code>.chalk.arrow.v1.ArrowType data_type = 2 [json_name = "dataType"];</code>
   * @return Whether the dataType field is set.
   */
  boolean hasDataType();
  /**
   * <code>.chalk.arrow.v1.ArrowType data_type = 2 [json_name = "dataType"];</code>
   * @return The dataType.
   */
  ai.chalk.protos.chalk.arrow.v1.ArrowType getDataType();
  /**
   * <code>.chalk.arrow.v1.ArrowType data_type = 2 [json_name = "dataType"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ArrowTypeOrBuilder getDataTypeOrBuilder();
}
