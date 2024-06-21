// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/query_values.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

public interface OperationIdTableIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.OperationIdTableIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If you want the results for a particular operation id, no need to look up the value tables separately.
   * The engine will do that for you
   * </pre>
   *
   * <code>string operation_id = 1 [json_name = "operationId"];</code>
   * @return The operationId.
   */
  java.lang.String getOperationId();
  /**
   * <pre>
   * If you want the results for a particular operation id, no need to look up the value tables separately.
   * The engine will do that for you
   * </pre>
   *
   * <code>string operation_id = 1 [json_name = "operationId"];</code>
   * @return The bytes for operationId.
   */
  com.google.protobuf.ByteString
      getOperationIdBytes();
}
