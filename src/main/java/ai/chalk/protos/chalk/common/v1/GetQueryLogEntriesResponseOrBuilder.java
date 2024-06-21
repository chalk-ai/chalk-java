// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/query_log.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

public interface GetQueryLogEntriesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.GetQueryLogEntriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.common.v1.QueryLogEntry entries = 1 [json_name = "entries"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.common.v1.QueryLogEntry> 
      getEntriesList();
  /**
   * <code>repeated .chalk.common.v1.QueryLogEntry entries = 1 [json_name = "entries"];</code>
   */
  ai.chalk.protos.chalk.common.v1.QueryLogEntry getEntries(int index);
  /**
   * <code>repeated .chalk.common.v1.QueryLogEntry entries = 1 [json_name = "entries"];</code>
   */
  int getEntriesCount();
  /**
   * <code>repeated .chalk.common.v1.QueryLogEntry entries = 1 [json_name = "entries"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.common.v1.QueryLogEntryOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <code>repeated .chalk.common.v1.QueryLogEntry entries = 1 [json_name = "entries"];</code>
   */
  ai.chalk.protos.chalk.common.v1.QueryLogEntryOrBuilder getEntriesOrBuilder(
      int index);

  /**
   * <pre>
   * If the next_page_token is non-empty, then there may be more rows, even if the entires is empty.
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * If the next_page_token is non-empty, then there may be more rows, even if the entires is empty.
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
