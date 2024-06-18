// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/online_query.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.common.v1;

public interface OnlineQueryMultiResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.OnlineQueryMultiResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.common.v1.GenericSingleResponse responses = 1 [json_name = "responses"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.common.v1.GenericSingleResponse> 
      getResponsesList();
  /**
   * <code>repeated .chalk.common.v1.GenericSingleResponse responses = 1 [json_name = "responses"];</code>
   */
  ai.chalk.protos.chalk.common.v1.GenericSingleResponse getResponses(int index);
  /**
   * <code>repeated .chalk.common.v1.GenericSingleResponse responses = 1 [json_name = "responses"];</code>
   */
  int getResponsesCount();
  /**
   * <code>repeated .chalk.common.v1.GenericSingleResponse responses = 1 [json_name = "responses"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.common.v1.GenericSingleResponseOrBuilder> 
      getResponsesOrBuilderList();
  /**
   * <code>repeated .chalk.common.v1.GenericSingleResponse responses = 1 [json_name = "responses"];</code>
   */
  ai.chalk.protos.chalk.common.v1.GenericSingleResponseOrBuilder getResponsesOrBuilder(
      int index);

  /**
   * <pre>
   * Internal errors not tied to a specific request. Most errors should be stored in the individual response objects.
   * </pre>
   *
   * <code>repeated .chalk.common.v1.ChalkError errors = 2 [json_name = "errors"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.common.v1.ChalkError> 
      getErrorsList();
  /**
   * <pre>
   * Internal errors not tied to a specific request. Most errors should be stored in the individual response objects.
   * </pre>
   *
   * <code>repeated .chalk.common.v1.ChalkError errors = 2 [json_name = "errors"];</code>
   */
  ai.chalk.protos.chalk.common.v1.ChalkError getErrors(int index);
  /**
   * <pre>
   * Internal errors not tied to a specific request. Most errors should be stored in the individual response objects.
   * </pre>
   *
   * <code>repeated .chalk.common.v1.ChalkError errors = 2 [json_name = "errors"];</code>
   */
  int getErrorsCount();
  /**
   * <pre>
   * Internal errors not tied to a specific request. Most errors should be stored in the individual response objects.
   * </pre>
   *
   * <code>repeated .chalk.common.v1.ChalkError errors = 2 [json_name = "errors"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.common.v1.ChalkErrorOrBuilder> 
      getErrorsOrBuilderList();
  /**
   * <pre>
   * Internal errors not tied to a specific request. Most errors should be stored in the individual response objects.
   * </pre>
   *
   * <code>repeated .chalk.common.v1.ChalkError errors = 2 [json_name = "errors"];</code>
   */
  ai.chalk.protos.chalk.common.v1.ChalkErrorOrBuilder getErrorsOrBuilder(
      int index);
}