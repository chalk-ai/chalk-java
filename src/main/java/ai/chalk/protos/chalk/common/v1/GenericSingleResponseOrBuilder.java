// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/online_query.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

public interface GenericSingleResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.GenericSingleResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.common.v1.OnlineQueryResponse single_response = 1 [json_name = "singleResponse"];</code>
   * @return Whether the singleResponse field is set.
   */
  boolean hasSingleResponse();
  /**
   * <code>.chalk.common.v1.OnlineQueryResponse single_response = 1 [json_name = "singleResponse"];</code>
   * @return The singleResponse.
   */
  ai.chalk.protos.chalk.common.v1.OnlineQueryResponse getSingleResponse();
  /**
   * <code>.chalk.common.v1.OnlineQueryResponse single_response = 1 [json_name = "singleResponse"];</code>
   */
  ai.chalk.protos.chalk.common.v1.OnlineQueryResponseOrBuilder getSingleResponseOrBuilder();

  /**
   * <code>.chalk.common.v1.OnlineQueryBulkResponse bulk_response = 2 [json_name = "bulkResponse"];</code>
   * @return Whether the bulkResponse field is set.
   */
  boolean hasBulkResponse();
  /**
   * <code>.chalk.common.v1.OnlineQueryBulkResponse bulk_response = 2 [json_name = "bulkResponse"];</code>
   * @return The bulkResponse.
   */
  ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse getBulkResponse();
  /**
   * <code>.chalk.common.v1.OnlineQueryBulkResponse bulk_response = 2 [json_name = "bulkResponse"];</code>
   */
  ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponseOrBuilder getBulkResponseOrBuilder();

  ai.chalk.protos.chalk.common.v1.GenericSingleResponse.QueryCase getQueryCase();
}
