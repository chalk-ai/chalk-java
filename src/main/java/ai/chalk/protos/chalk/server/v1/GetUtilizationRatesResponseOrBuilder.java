// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/billing.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

public interface GetUtilizationRatesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetUtilizationRatesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.usage.v1.MachineRate> 
      getRatesList();
  /**
   * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
   */
  ai.chalk.protos.chalk.usage.v1.MachineRate getRates(int index);
  /**
   * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
   */
  int getRatesCount();
  /**
   * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.usage.v1.MachineRateOrBuilder> 
      getRatesOrBuilderList();
  /**
   * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
   */
  ai.chalk.protos.chalk.usage.v1.MachineRateOrBuilder getRatesOrBuilder(
      int index);
}