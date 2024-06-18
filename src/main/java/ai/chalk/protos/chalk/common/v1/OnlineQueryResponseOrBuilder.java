// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/online_query.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

public interface OnlineQueryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.OnlineQueryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.common.v1.OnlineQueryResult data = 1 [json_name = "data"];</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <code>.chalk.common.v1.OnlineQueryResult data = 1 [json_name = "data"];</code>
   * @return The data.
   */
  ai.chalk.protos.chalk.common.v1.OnlineQueryResult getData();
  /**
   * <code>.chalk.common.v1.OnlineQueryResult data = 1 [json_name = "data"];</code>
   */
  ai.chalk.protos.chalk.common.v1.OnlineQueryResultOrBuilder getDataOrBuilder();

  /**
   * <code>repeated .chalk.common.v1.ChalkError errors = 2 [json_name = "errors"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.common.v1.ChalkError> 
      getErrorsList();
  /**
   * <code>repeated .chalk.common.v1.ChalkError errors = 2 [json_name = "errors"];</code>
   */
  ai.chalk.protos.chalk.common.v1.ChalkError getErrors(int index);
  /**
   * <code>repeated .chalk.common.v1.ChalkError errors = 2 [json_name = "errors"];</code>
   */
  int getErrorsCount();
  /**
   * <code>repeated .chalk.common.v1.ChalkError errors = 2 [json_name = "errors"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.common.v1.ChalkErrorOrBuilder> 
      getErrorsOrBuilderList();
  /**
   * <code>repeated .chalk.common.v1.ChalkError errors = 2 [json_name = "errors"];</code>
   */
  ai.chalk.protos.chalk.common.v1.ChalkErrorOrBuilder getErrorsOrBuilder(
      int index);

  /**
   * <code>.chalk.common.v1.OnlineQueryMetadata response_meta = 3 [json_name = "responseMeta"];</code>
   * @return Whether the responseMeta field is set.
   */
  boolean hasResponseMeta();
  /**
   * <code>.chalk.common.v1.OnlineQueryMetadata response_meta = 3 [json_name = "responseMeta"];</code>
   * @return The responseMeta.
   */
  ai.chalk.protos.chalk.common.v1.OnlineQueryMetadata getResponseMeta();
  /**
   * <code>.chalk.common.v1.OnlineQueryMetadata response_meta = 3 [json_name = "responseMeta"];</code>
   */
  ai.chalk.protos.chalk.common.v1.OnlineQueryMetadataOrBuilder getResponseMetaOrBuilder();
}
