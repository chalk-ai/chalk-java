// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/aggregate/v1/backfill.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.aggregate.v1;

public interface AggregateBackfillUserParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.aggregate.v1.AggregateBackfillUserParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string features = 1 [json_name = "features"];</code>
   * @return A list containing the features.
   */
  java.util.List<java.lang.String>
      getFeaturesList();
  /**
   * <code>repeated string features = 1 [json_name = "features"];</code>
   * @return The count of features.
   */
  int getFeaturesCount();
  /**
   * <code>repeated string features = 1 [json_name = "features"];</code>
   * @param index The index of the element to return.
   * @return The features at the given index.
   */
  java.lang.String getFeatures(int index);
  /**
   * <code>repeated string features = 1 [json_name = "features"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the features at the given index.
   */
  com.google.protobuf.ByteString
      getFeaturesBytes(int index);

  /**
   * <code>optional string resolver = 2 [json_name = "resolver"];</code>
   * @return Whether the resolver field is set.
   */
  boolean hasResolver();
  /**
   * <code>optional string resolver = 2 [json_name = "resolver"];</code>
   * @return The resolver.
   */
  java.lang.String getResolver();
  /**
   * <code>optional string resolver = 2 [json_name = "resolver"];</code>
   * @return The bytes for resolver.
   */
  com.google.protobuf.ByteString
      getResolverBytes();

  /**
   * <code>optional string timestamp_column_name = 3 [json_name = "timestampColumnName", deprecated = true];</code>
   * @deprecated chalk.aggregate.v1.AggregateBackfillUserParams.timestamp_column_name is deprecated.
   *     See chalk/aggregate/v1/backfill.proto;l=21
   * @return Whether the timestampColumnName field is set.
   */
  @java.lang.Deprecated boolean hasTimestampColumnName();
  /**
   * <code>optional string timestamp_column_name = 3 [json_name = "timestampColumnName", deprecated = true];</code>
   * @deprecated chalk.aggregate.v1.AggregateBackfillUserParams.timestamp_column_name is deprecated.
   *     See chalk/aggregate/v1/backfill.proto;l=21
   * @return The timestampColumnName.
   */
  @java.lang.Deprecated java.lang.String getTimestampColumnName();
  /**
   * <code>optional string timestamp_column_name = 3 [json_name = "timestampColumnName", deprecated = true];</code>
   * @deprecated chalk.aggregate.v1.AggregateBackfillUserParams.timestamp_column_name is deprecated.
   *     See chalk/aggregate/v1/backfill.proto;l=21
   * @return The bytes for timestampColumnName.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getTimestampColumnNameBytes();

  /**
   * <code>optional .google.protobuf.Timestamp lower_bound = 4 [json_name = "lowerBound"];</code>
   * @return Whether the lowerBound field is set.
   */
  boolean hasLowerBound();
  /**
   * <code>optional .google.protobuf.Timestamp lower_bound = 4 [json_name = "lowerBound"];</code>
   * @return The lowerBound.
   */
  com.google.protobuf.Timestamp getLowerBound();
  /**
   * <code>optional .google.protobuf.Timestamp lower_bound = 4 [json_name = "lowerBound"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLowerBoundOrBuilder();

  /**
   * <code>optional .google.protobuf.Timestamp upper_bound = 5 [json_name = "upperBound"];</code>
   * @return Whether the upperBound field is set.
   */
  boolean hasUpperBound();
  /**
   * <code>optional .google.protobuf.Timestamp upper_bound = 5 [json_name = "upperBound"];</code>
   * @return The upperBound.
   */
  com.google.protobuf.Timestamp getUpperBound();
  /**
   * <code>optional .google.protobuf.Timestamp upper_bound = 5 [json_name = "upperBound"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpperBoundOrBuilder();

  /**
   * <code>bool exact = 6 [json_name = "exact"];</code>
   * @return The exact.
   */
  boolean getExact();
}
