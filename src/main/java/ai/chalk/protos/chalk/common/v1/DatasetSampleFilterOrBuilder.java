// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/dataset_response.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

public interface DatasetSampleFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.DatasetSampleFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .google.protobuf.Timestamp lower_bound = 1 [json_name = "lowerBound"];</code>
   * @return Whether the lowerBound field is set.
   */
  boolean hasLowerBound();
  /**
   * <code>optional .google.protobuf.Timestamp lower_bound = 1 [json_name = "lowerBound"];</code>
   * @return The lowerBound.
   */
  com.google.protobuf.Timestamp getLowerBound();
  /**
   * <code>optional .google.protobuf.Timestamp lower_bound = 1 [json_name = "lowerBound"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLowerBoundOrBuilder();

  /**
   * <code>optional .google.protobuf.Timestamp upper_bound = 2 [json_name = "upperBound"];</code>
   * @return Whether the upperBound field is set.
   */
  boolean hasUpperBound();
  /**
   * <code>optional .google.protobuf.Timestamp upper_bound = 2 [json_name = "upperBound"];</code>
   * @return The upperBound.
   */
  com.google.protobuf.Timestamp getUpperBound();
  /**
   * <code>optional .google.protobuf.Timestamp upper_bound = 2 [json_name = "upperBound"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpperBoundOrBuilder();

  /**
   * <code>optional int32 max_samples = 3 [json_name = "maxSamples"];</code>
   * @return Whether the maxSamples field is set.
   */
  boolean hasMaxSamples();
  /**
   * <code>optional int32 max_samples = 3 [json_name = "maxSamples"];</code>
   * @return The maxSamples.
   */
  int getMaxSamples();
}
