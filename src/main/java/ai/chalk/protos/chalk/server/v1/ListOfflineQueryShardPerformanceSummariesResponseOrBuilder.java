// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/performance_summary.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface ListOfflineQueryShardPerformanceSummariesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.ListOfflineQueryShardPerformanceSummariesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.server.v1.ShardPerformanceSummary performance_summaries = 1 [json_name = "performanceSummaries"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.ShardPerformanceSummary> 
      getPerformanceSummariesList();
  /**
   * <code>repeated .chalk.server.v1.ShardPerformanceSummary performance_summaries = 1 [json_name = "performanceSummaries"];</code>
   */
  ai.chalk.protos.chalk.server.v1.ShardPerformanceSummary getPerformanceSummaries(int index);
  /**
   * <code>repeated .chalk.server.v1.ShardPerformanceSummary performance_summaries = 1 [json_name = "performanceSummaries"];</code>
   */
  int getPerformanceSummariesCount();
  /**
   * <code>repeated .chalk.server.v1.ShardPerformanceSummary performance_summaries = 1 [json_name = "performanceSummaries"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.ShardPerformanceSummaryOrBuilder> 
      getPerformanceSummariesOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.ShardPerformanceSummary performance_summaries = 1 [json_name = "performanceSummaries"];</code>
   */
  ai.chalk.protos.chalk.server.v1.ShardPerformanceSummaryOrBuilder getPerformanceSummariesOrBuilder(
      int index);

  /**
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
