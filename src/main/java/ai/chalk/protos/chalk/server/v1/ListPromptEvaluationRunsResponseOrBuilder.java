// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/prompt.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface ListPromptEvaluationRunsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.ListPromptEvaluationRunsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.server.v1.PromptEvaluationRun evaluation_runs = 1 [json_name = "evaluationRuns"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.PromptEvaluationRun> 
      getEvaluationRunsList();
  /**
   * <code>repeated .chalk.server.v1.PromptEvaluationRun evaluation_runs = 1 [json_name = "evaluationRuns"];</code>
   */
  ai.chalk.protos.chalk.server.v1.PromptEvaluationRun getEvaluationRuns(int index);
  /**
   * <code>repeated .chalk.server.v1.PromptEvaluationRun evaluation_runs = 1 [json_name = "evaluationRuns"];</code>
   */
  int getEvaluationRunsCount();
  /**
   * <code>repeated .chalk.server.v1.PromptEvaluationRun evaluation_runs = 1 [json_name = "evaluationRuns"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.PromptEvaluationRunOrBuilder> 
      getEvaluationRunsOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.PromptEvaluationRun evaluation_runs = 1 [json_name = "evaluationRuns"];</code>
   */
  ai.chalk.protos.chalk.server.v1.PromptEvaluationRunOrBuilder getEvaluationRunsOrBuilder(
      int index);

  /**
   * <code>optional string next_cursor = 2 [json_name = "nextCursor"];</code>
   * @return Whether the nextCursor field is set.
   */
  boolean hasNextCursor();
  /**
   * <code>optional string next_cursor = 2 [json_name = "nextCursor"];</code>
   * @return The nextCursor.
   */
  java.lang.String getNextCursor();
  /**
   * <code>optional string next_cursor = 2 [json_name = "nextCursor"];</code>
   * @return The bytes for nextCursor.
   */
  com.google.protobuf.ByteString
      getNextCursorBytes();
}
