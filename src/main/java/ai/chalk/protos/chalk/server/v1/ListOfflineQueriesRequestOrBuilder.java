// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/offline_queries.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface ListOfflineQueriesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.ListOfflineQueriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string cursor = 1 [json_name = "cursor"];</code>
   * @return Whether the cursor field is set.
   */
  boolean hasCursor();
  /**
   * <code>optional string cursor = 1 [json_name = "cursor"];</code>
   * @return The cursor.
   */
  java.lang.String getCursor();
  /**
   * <code>optional string cursor = 1 [json_name = "cursor"];</code>
   * @return The bytes for cursor.
   */
  com.google.protobuf.ByteString
      getCursorBytes();

  /**
   * <code>optional int32 limit = 2 [json_name = "limit"];</code>
   * @return Whether the limit field is set.
   */
  boolean hasLimit();
  /**
   * <code>optional int32 limit = 2 [json_name = "limit"];</code>
   * @return The limit.
   */
  int getLimit();

  /**
   * <code>optional string start_date = 3 [json_name = "startDate"];</code>
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   * <code>optional string start_date = 3 [json_name = "startDate"];</code>
   * @return The startDate.
   */
  java.lang.String getStartDate();
  /**
   * <code>optional string start_date = 3 [json_name = "startDate"];</code>
   * @return The bytes for startDate.
   */
  com.google.protobuf.ByteString
      getStartDateBytes();

  /**
   * <code>optional string end_date = 4 [json_name = "endDate"];</code>
   * @return Whether the endDate field is set.
   */
  boolean hasEndDate();
  /**
   * <code>optional string end_date = 4 [json_name = "endDate"];</code>
   * @return The endDate.
   */
  java.lang.String getEndDate();
  /**
   * <code>optional string end_date = 4 [json_name = "endDate"];</code>
   * @return The bytes for endDate.
   */
  com.google.protobuf.ByteString
      getEndDateBytes();

  /**
   * <code>optional string id_filter = 5 [json_name = "idFilter"];</code>
   * @return Whether the idFilter field is set.
   */
  boolean hasIdFilter();
  /**
   * <code>optional string id_filter = 5 [json_name = "idFilter"];</code>
   * @return The idFilter.
   */
  java.lang.String getIdFilter();
  /**
   * <code>optional string id_filter = 5 [json_name = "idFilter"];</code>
   * @return The bytes for idFilter.
   */
  com.google.protobuf.ByteString
      getIdFilterBytes();

  /**
   * <code>optional string agent_id_filter = 6 [json_name = "agentIdFilter"];</code>
   * @return Whether the agentIdFilter field is set.
   */
  boolean hasAgentIdFilter();
  /**
   * <code>optional string agent_id_filter = 6 [json_name = "agentIdFilter"];</code>
   * @return The agentIdFilter.
   */
  java.lang.String getAgentIdFilter();
  /**
   * <code>optional string agent_id_filter = 6 [json_name = "agentIdFilter"];</code>
   * @return The bytes for agentIdFilter.
   */
  com.google.protobuf.ByteString
      getAgentIdFilterBytes();

  /**
   * <code>optional string branch_filter = 7 [json_name = "branchFilter"];</code>
   * @return Whether the branchFilter field is set.
   */
  boolean hasBranchFilter();
  /**
   * <code>optional string branch_filter = 7 [json_name = "branchFilter"];</code>
   * @return The branchFilter.
   */
  java.lang.String getBranchFilter();
  /**
   * <code>optional string branch_filter = 7 [json_name = "branchFilter"];</code>
   * @return The bytes for branchFilter.
   */
  com.google.protobuf.ByteString
      getBranchFilterBytes();

  /**
   * <code>optional .chalk.server.v1.OfflineQueryKind kind_filter = 8 [json_name = "kindFilter"];</code>
   * @return Whether the kindFilter field is set.
   */
  boolean hasKindFilter();
  /**
   * <code>optional .chalk.server.v1.OfflineQueryKind kind_filter = 8 [json_name = "kindFilter"];</code>
   * @return The enum numeric value on the wire for kindFilter.
   */
  int getKindFilterValue();
  /**
   * <code>optional .chalk.server.v1.OfflineQueryKind kind_filter = 8 [json_name = "kindFilter"];</code>
   * @return The kindFilter.
   */
  ai.chalk.protos.chalk.server.v1.OfflineQueryKind getKindFilter();

  /**
   * <code>optional .chalk.server.v1.OfflineQueryStatus status_filter = 9 [json_name = "statusFilter"];</code>
   * @return Whether the statusFilter field is set.
   */
  boolean hasStatusFilter();
  /**
   * <code>optional .chalk.server.v1.OfflineQueryStatus status_filter = 9 [json_name = "statusFilter"];</code>
   * @return The enum numeric value on the wire for statusFilter.
   */
  int getStatusFilterValue();
  /**
   * <code>optional .chalk.server.v1.OfflineQueryStatus status_filter = 9 [json_name = "statusFilter"];</code>
   * @return The statusFilter.
   */
  ai.chalk.protos.chalk.server.v1.OfflineQueryStatus getStatusFilter();

  /**
   * <code>optional string aggregation_backfill_id_filter = 10 [json_name = "aggregationBackfillIdFilter"];</code>
   * @return Whether the aggregationBackfillIdFilter field is set.
   */
  boolean hasAggregationBackfillIdFilter();
  /**
   * <code>optional string aggregation_backfill_id_filter = 10 [json_name = "aggregationBackfillIdFilter"];</code>
   * @return The aggregationBackfillIdFilter.
   */
  java.lang.String getAggregationBackfillIdFilter();
  /**
   * <code>optional string aggregation_backfill_id_filter = 10 [json_name = "aggregationBackfillIdFilter"];</code>
   * @return The bytes for aggregationBackfillIdFilter.
   */
  com.google.protobuf.ByteString
      getAggregationBackfillIdFilterBytes();

  /**
   * <code>optional string evaluation_run_id_filter = 11 [json_name = "evaluationRunIdFilter"];</code>
   * @return Whether the evaluationRunIdFilter field is set.
   */
  boolean hasEvaluationRunIdFilter();
  /**
   * <code>optional string evaluation_run_id_filter = 11 [json_name = "evaluationRunIdFilter"];</code>
   * @return The evaluationRunIdFilter.
   */
  java.lang.String getEvaluationRunIdFilter();
  /**
   * <code>optional string evaluation_run_id_filter = 11 [json_name = "evaluationRunIdFilter"];</code>
   * @return The bytes for evaluationRunIdFilter.
   */
  com.google.protobuf.ByteString
      getEvaluationRunIdFilterBytes();
}
