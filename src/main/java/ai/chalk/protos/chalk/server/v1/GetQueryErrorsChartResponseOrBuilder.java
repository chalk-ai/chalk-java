// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/queries.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface GetQueryErrorsChartResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetQueryErrorsChartResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.chart.v1.DenseTimeSeriesChart chart = 1 [json_name = "chart"];</code>
   * @return Whether the chart field is set.
   */
  boolean hasChart();
  /**
   * <code>.chalk.chart.v1.DenseTimeSeriesChart chart = 1 [json_name = "chart"];</code>
   * @return The chart.
   */
  ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart getChart();
  /**
   * <code>.chalk.chart.v1.DenseTimeSeriesChart chart = 1 [json_name = "chart"];</code>
   */
  ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChartOrBuilder getChartOrBuilder();
}
