// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/usage/v1/rate.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.usage.v1;

public interface MachineRateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.usage.v1.MachineRate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string machine_type = 1 [json_name = "machineType"];</code>
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   * <code>string machine_type = 1 [json_name = "machineType"];</code>
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString
      getMachineTypeBytes();

  /**
   * <code>double cpus = 2 [json_name = "cpus"];</code>
   * @return The cpus.
   */
  double getCpus();

  /**
   * <code>double memory_gb = 3 [json_name = "memoryGb"];</code>
   * @return The memoryGb.
   */
  double getMemoryGb();

  /**
   * <code>double credits_per_hour = 4 [json_name = "creditsPerHour"];</code>
   * @return The creditsPerHour.
   */
  double getCreditsPerHour();

  /**
   * <code>.chalk.usage.v1.BillingCloud cloud = 5 [json_name = "cloud"];</code>
   * @return The enum numeric value on the wire for cloud.
   */
  int getCloudValue();
  /**
   * <code>.chalk.usage.v1.BillingCloud cloud = 5 [json_name = "cloud"];</code>
   * @return The cloud.
   */
  ai.chalk.protos.chalk.usage.v1.BillingCloud getCloud();

  /**
   * <code>string machine_family = 6 [json_name = "machineFamily"];</code>
   * @return The machineFamily.
   */
  java.lang.String getMachineFamily();
  /**
   * <code>string machine_family = 6 [json_name = "machineFamily"];</code>
   * @return The bytes for machineFamily.
   */
  com.google.protobuf.ByteString
      getMachineFamilyBytes();
}
