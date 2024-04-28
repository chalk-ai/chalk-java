// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/billing.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

public interface GetUsageChartRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetUsageChartRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 start_ms = 1 [json_name = "startMs"];</code>
   * @return Whether the startMs field is set.
   */
  boolean hasStartMs();
  /**
   * <code>optional int64 start_ms = 1 [json_name = "startMs"];</code>
   * @return The startMs.
   */
  long getStartMs();

  /**
   * <code>optional int64 end_ms = 2 [json_name = "endMs"];</code>
   * @return Whether the endMs field is set.
   */
  boolean hasEndMs();
  /**
   * <code>optional int64 end_ms = 2 [json_name = "endMs"];</code>
   * @return The endMs.
   */
  long getEndMs();

  /**
   * <code>optional .chalk.server.v1.UsageChartPeriod period = 3 [json_name = "period"];</code>
   * @return Whether the period field is set.
   */
  boolean hasPeriod();
  /**
   * <code>optional .chalk.server.v1.UsageChartPeriod period = 3 [json_name = "period"];</code>
   * @return The enum numeric value on the wire for period.
   */
  int getPeriodValue();
  /**
   * <code>optional .chalk.server.v1.UsageChartPeriod period = 3 [json_name = "period"];</code>
   * @return The period.
   */
  ai.chalk.protos.chalk.server.v1.UsageChartPeriod getPeriod();

  /**
   * <code>optional .chalk.server.v1.UsageChartGrouping grouping = 4 [json_name = "grouping"];</code>
   * @return Whether the grouping field is set.
   */
  boolean hasGrouping();
  /**
   * <code>optional .chalk.server.v1.UsageChartGrouping grouping = 4 [json_name = "grouping"];</code>
   * @return The enum numeric value on the wire for grouping.
   */
  int getGroupingValue();
  /**
   * <code>optional .chalk.server.v1.UsageChartGrouping grouping = 4 [json_name = "grouping"];</code>
   * @return The grouping.
   */
  ai.chalk.protos.chalk.server.v1.UsageChartGrouping getGrouping();
}