// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/upload_features.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

public interface UploadFeaturesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.UploadFeaturesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.common.v1.ChalkError errors = 1 [json_name = "errors"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.common.v1.ChalkError> 
      getErrorsList();
  /**
   * <code>repeated .chalk.common.v1.ChalkError errors = 1 [json_name = "errors"];</code>
   */
  ai.chalk.protos.chalk.common.v1.ChalkError getErrors(int index);
  /**
   * <code>repeated .chalk.common.v1.ChalkError errors = 1 [json_name = "errors"];</code>
   */
  int getErrorsCount();
  /**
   * <code>repeated .chalk.common.v1.ChalkError errors = 1 [json_name = "errors"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.common.v1.ChalkErrorOrBuilder> 
      getErrorsOrBuilderList();
  /**
   * <code>repeated .chalk.common.v1.ChalkError errors = 1 [json_name = "errors"];</code>
   */
  ai.chalk.protos.chalk.common.v1.ChalkErrorOrBuilder getErrorsOrBuilder(
      int index);

  /**
   * <code>string operation_id = 2 [json_name = "operationId"];</code>
   * @return The operationId.
   */
  java.lang.String getOperationId();
  /**
   * <code>string operation_id = 2 [json_name = "operationId"];</code>
   * @return The bytes for operationId.
   */
  com.google.protobuf.ByteString
      getOperationIdBytes();
}