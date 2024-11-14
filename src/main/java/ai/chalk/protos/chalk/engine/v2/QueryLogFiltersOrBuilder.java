// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v2/query_log.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.engine.v2;

public interface QueryLogFiltersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.engine.v2.QueryLogFilters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All of these fields are optional. If any are specified, they will be AND'd together in a where clause
   * Any len-zero options will be ignored. If multiple options are specified for a given key, they will be OR'd together
   * i.e. works similarly to how you filter products on Amazon -- (size 8 or size 9) AND (color == blue OR color == "red")
   * </pre>
   *
   * <code>repeated string operation_id = 1 [json_name = "operationId"];</code>
   * @return A list containing the operationId.
   */
  java.util.List<java.lang.String>
      getOperationIdList();
  /**
   * <pre>
   * All of these fields are optional. If any are specified, they will be AND'd together in a where clause
   * Any len-zero options will be ignored. If multiple options are specified for a given key, they will be OR'd together
   * i.e. works similarly to how you filter products on Amazon -- (size 8 or size 9) AND (color == blue OR color == "red")
   * </pre>
   *
   * <code>repeated string operation_id = 1 [json_name = "operationId"];</code>
   * @return The count of operationId.
   */
  int getOperationIdCount();
  /**
   * <pre>
   * All of these fields are optional. If any are specified, they will be AND'd together in a where clause
   * Any len-zero options will be ignored. If multiple options are specified for a given key, they will be OR'd together
   * i.e. works similarly to how you filter products on Amazon -- (size 8 or size 9) AND (color == blue OR color == "red")
   * </pre>
   *
   * <code>repeated string operation_id = 1 [json_name = "operationId"];</code>
   * @param index The index of the element to return.
   * @return The operationId at the given index.
   */
  java.lang.String getOperationId(int index);
  /**
   * <pre>
   * All of these fields are optional. If any are specified, they will be AND'd together in a where clause
   * Any len-zero options will be ignored. If multiple options are specified for a given key, they will be OR'd together
   * i.e. works similarly to how you filter products on Amazon -- (size 8 or size 9) AND (color == blue OR color == "red")
   * </pre>
   *
   * <code>repeated string operation_id = 1 [json_name = "operationId"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the operationId at the given index.
   */
  com.google.protobuf.ByteString
      getOperationIdBytes(int index);

  /**
   * <code>repeated .chalk.common.v1.OperationKind operation_kind = 2 [json_name = "operationKind"];</code>
   * @return A list containing the operationKind.
   */
  java.util.List<ai.chalk.protos.chalk.common.v1.OperationKind> getOperationKindList();
  /**
   * <code>repeated .chalk.common.v1.OperationKind operation_kind = 2 [json_name = "operationKind"];</code>
   * @return The count of operationKind.
   */
  int getOperationKindCount();
  /**
   * <code>repeated .chalk.common.v1.OperationKind operation_kind = 2 [json_name = "operationKind"];</code>
   * @param index The index of the element to return.
   * @return The operationKind at the given index.
   */
  ai.chalk.protos.chalk.common.v1.OperationKind getOperationKind(int index);
  /**
   * <code>repeated .chalk.common.v1.OperationKind operation_kind = 2 [json_name = "operationKind"];</code>
   * @return A list containing the enum numeric values on the wire for operationKind.
   */
  java.util.List<java.lang.Integer>
  getOperationKindValueList();
  /**
   * <code>repeated .chalk.common.v1.OperationKind operation_kind = 2 [json_name = "operationKind"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of operationKind at the given index.
   */
  int getOperationKindValue(int index);

  /**
   * <code>repeated .chalk.engine.v2.VersionedQueryName query_name = 3 [json_name = "queryName"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.engine.v2.VersionedQueryName> 
      getQueryNameList();
  /**
   * <code>repeated .chalk.engine.v2.VersionedQueryName query_name = 3 [json_name = "queryName"];</code>
   */
  ai.chalk.protos.chalk.engine.v2.VersionedQueryName getQueryName(int index);
  /**
   * <code>repeated .chalk.engine.v2.VersionedQueryName query_name = 3 [json_name = "queryName"];</code>
   */
  int getQueryNameCount();
  /**
   * <code>repeated .chalk.engine.v2.VersionedQueryName query_name = 3 [json_name = "queryName"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.engine.v2.VersionedQueryNameOrBuilder> 
      getQueryNameOrBuilderList();
  /**
   * <code>repeated .chalk.engine.v2.VersionedQueryName query_name = 3 [json_name = "queryName"];</code>
   */
  ai.chalk.protos.chalk.engine.v2.VersionedQueryNameOrBuilder getQueryNameOrBuilder(
      int index);

  /**
   * <code>repeated string agent_id = 5 [json_name = "agentId"];</code>
   * @return A list containing the agentId.
   */
  java.util.List<java.lang.String>
      getAgentIdList();
  /**
   * <code>repeated string agent_id = 5 [json_name = "agentId"];</code>
   * @return The count of agentId.
   */
  int getAgentIdCount();
  /**
   * <code>repeated string agent_id = 5 [json_name = "agentId"];</code>
   * @param index The index of the element to return.
   * @return The agentId at the given index.
   */
  java.lang.String getAgentId(int index);
  /**
   * <code>repeated string agent_id = 5 [json_name = "agentId"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the agentId at the given index.
   */
  com.google.protobuf.ByteString
      getAgentIdBytes(int index);

  /**
   * <code>repeated string branch_name = 6 [json_name = "branchName"];</code>
   * @return A list containing the branchName.
   */
  java.util.List<java.lang.String>
      getBranchNameList();
  /**
   * <code>repeated string branch_name = 6 [json_name = "branchName"];</code>
   * @return The count of branchName.
   */
  int getBranchNameCount();
  /**
   * <code>repeated string branch_name = 6 [json_name = "branchName"];</code>
   * @param index The index of the element to return.
   * @return The branchName at the given index.
   */
  java.lang.String getBranchName(int index);
  /**
   * <code>repeated string branch_name = 6 [json_name = "branchName"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the branchName at the given index.
   */
  com.google.protobuf.ByteString
      getBranchNameBytes(int index);

  /**
   * <code>repeated string correlation_id = 7 [json_name = "correlationId"];</code>
   * @return A list containing the correlationId.
   */
  java.util.List<java.lang.String>
      getCorrelationIdList();
  /**
   * <code>repeated string correlation_id = 7 [json_name = "correlationId"];</code>
   * @return The count of correlationId.
   */
  int getCorrelationIdCount();
  /**
   * <code>repeated string correlation_id = 7 [json_name = "correlationId"];</code>
   * @param index The index of the element to return.
   * @return The correlationId at the given index.
   */
  java.lang.String getCorrelationId(int index);
  /**
   * <code>repeated string correlation_id = 7 [json_name = "correlationId"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the correlationId at the given index.
   */
  com.google.protobuf.ByteString
      getCorrelationIdBytes(int index);

  /**
   * <code>repeated string trace_id = 8 [json_name = "traceId"];</code>
   * @return A list containing the traceId.
   */
  java.util.List<java.lang.String>
      getTraceIdList();
  /**
   * <code>repeated string trace_id = 8 [json_name = "traceId"];</code>
   * @return The count of traceId.
   */
  int getTraceIdCount();
  /**
   * <code>repeated string trace_id = 8 [json_name = "traceId"];</code>
   * @param index The index of the element to return.
   * @return The traceId at the given index.
   */
  java.lang.String getTraceId(int index);
  /**
   * <code>repeated string trace_id = 8 [json_name = "traceId"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the traceId at the given index.
   */
  com.google.protobuf.ByteString
      getTraceIdBytes(int index);

  /**
   * <code>repeated string query_plan_id = 9 [json_name = "queryPlanId"];</code>
   * @return A list containing the queryPlanId.
   */
  java.util.List<java.lang.String>
      getQueryPlanIdList();
  /**
   * <code>repeated string query_plan_id = 9 [json_name = "queryPlanId"];</code>
   * @return The count of queryPlanId.
   */
  int getQueryPlanIdCount();
  /**
   * <code>repeated string query_plan_id = 9 [json_name = "queryPlanId"];</code>
   * @param index The index of the element to return.
   * @return The queryPlanId at the given index.
   */
  java.lang.String getQueryPlanId(int index);
  /**
   * <code>repeated string query_plan_id = 9 [json_name = "queryPlanId"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the queryPlanId at the given index.
   */
  com.google.protobuf.ByteString
      getQueryPlanIdBytes(int index);

  /**
   * <code>repeated string deployment_id = 10 [json_name = "deploymentId"];</code>
   * @return A list containing the deploymentId.
   */
  java.util.List<java.lang.String>
      getDeploymentIdList();
  /**
   * <code>repeated string deployment_id = 10 [json_name = "deploymentId"];</code>
   * @return The count of deploymentId.
   */
  int getDeploymentIdCount();
  /**
   * <code>repeated string deployment_id = 10 [json_name = "deploymentId"];</code>
   * @param index The index of the element to return.
   * @return The deploymentId at the given index.
   */
  java.lang.String getDeploymentId(int index);
  /**
   * <code>repeated string deployment_id = 10 [json_name = "deploymentId"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the deploymentId at the given index.
   */
  com.google.protobuf.ByteString
      getDeploymentIdBytes(int index);

  /**
   * <code>repeated .chalk.common.v1.QueryStatus query_status = 11 [json_name = "queryStatus"];</code>
   * @return A list containing the queryStatus.
   */
  java.util.List<ai.chalk.protos.chalk.common.v1.QueryStatus> getQueryStatusList();
  /**
   * <code>repeated .chalk.common.v1.QueryStatus query_status = 11 [json_name = "queryStatus"];</code>
   * @return The count of queryStatus.
   */
  int getQueryStatusCount();
  /**
   * <code>repeated .chalk.common.v1.QueryStatus query_status = 11 [json_name = "queryStatus"];</code>
   * @param index The index of the element to return.
   * @return The queryStatus at the given index.
   */
  ai.chalk.protos.chalk.common.v1.QueryStatus getQueryStatus(int index);
  /**
   * <code>repeated .chalk.common.v1.QueryStatus query_status = 11 [json_name = "queryStatus"];</code>
   * @return A list containing the enum numeric values on the wire for queryStatus.
   */
  java.util.List<java.lang.Integer>
  getQueryStatusValueList();
  /**
   * <code>repeated .chalk.common.v1.QueryStatus query_status = 11 [json_name = "queryStatus"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of queryStatus at the given index.
   */
  int getQueryStatusValue(int index);

  /**
   * <code>repeated string meta_query_hash = 12 [json_name = "metaQueryHash"];</code>
   * @return A list containing the metaQueryHash.
   */
  java.util.List<java.lang.String>
      getMetaQueryHashList();
  /**
   * <code>repeated string meta_query_hash = 12 [json_name = "metaQueryHash"];</code>
   * @return The count of metaQueryHash.
   */
  int getMetaQueryHashCount();
  /**
   * <code>repeated string meta_query_hash = 12 [json_name = "metaQueryHash"];</code>
   * @param index The index of the element to return.
   * @return The metaQueryHash at the given index.
   */
  java.lang.String getMetaQueryHash(int index);
  /**
   * <code>repeated string meta_query_hash = 12 [json_name = "metaQueryHash"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the metaQueryHash at the given index.
   */
  com.google.protobuf.ByteString
      getMetaQueryHashBytes(int index);
}