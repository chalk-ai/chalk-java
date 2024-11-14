// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v2/feature_values.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.engine.v2;

public interface GetFeatureValuesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.engine.v2.GetFeatureValuesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string feature_fqn = 1 [json_name = "featureFqn"];</code>
   * @return The featureFqn.
   */
  java.lang.String getFeatureFqn();
  /**
   * <code>string feature_fqn = 1 [json_name = "featureFqn"];</code>
   * @return The bytes for featureFqn.
   */
  com.google.protobuf.ByteString
      getFeatureFqnBytes();

  /**
   * <pre>
   * Along which time dimension to query features by.
   * Time ranges can either be specified along inserted_at or observed_at
   * Optional. If unspecified, default to inserted_at
   * </pre>
   *
   * <code>.chalk.engine.v2.FeatureValuesTimestampType timestamp_type = 2 [json_name = "timestampType"];</code>
   * @return The enum numeric value on the wire for timestampType.
   */
  int getTimestampTypeValue();
  /**
   * <pre>
   * Along which time dimension to query features by.
   * Time ranges can either be specified along inserted_at or observed_at
   * Optional. If unspecified, default to inserted_at
   * </pre>
   *
   * <code>.chalk.engine.v2.FeatureValuesTimestampType timestamp_type = 2 [json_name = "timestampType"];</code>
   * @return The timestampType.
   */
  ai.chalk.protos.chalk.engine.v2.FeatureValuesTimestampType getTimestampType();

  /**
   * <code>.google.protobuf.Timestamp lower_bound_inclusive = 3 [json_name = "lowerBoundInclusive"];</code>
   * @return Whether the lowerBoundInclusive field is set.
   */
  boolean hasLowerBoundInclusive();
  /**
   * <code>.google.protobuf.Timestamp lower_bound_inclusive = 3 [json_name = "lowerBoundInclusive"];</code>
   * @return The lowerBoundInclusive.
   */
  com.google.protobuf.Timestamp getLowerBoundInclusive();
  /**
   * <code>.google.protobuf.Timestamp lower_bound_inclusive = 3 [json_name = "lowerBoundInclusive"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLowerBoundInclusiveOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp upper_bound_exclusive = 4 [json_name = "upperBoundExclusive"];</code>
   * @return Whether the upperBoundExclusive field is set.
   */
  boolean hasUpperBoundExclusive();
  /**
   * <code>.google.protobuf.Timestamp upper_bound_exclusive = 4 [json_name = "upperBoundExclusive"];</code>
   * @return The upperBoundExclusive.
   */
  com.google.protobuf.Timestamp getUpperBoundExclusive();
  /**
   * <code>.google.protobuf.Timestamp upper_bound_exclusive = 4 [json_name = "upperBoundExclusive"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpperBoundExclusiveOrBuilder();

  /**
   * <pre>
   * optional filters that can be specified to filter down feature rows returned
   * </pre>
   *
   * <code>.chalk.engine.v2.FeatureValueFilters filters = 5 [json_name = "filters"];</code>
   * @return Whether the filters field is set.
   */
  boolean hasFilters();
  /**
   * <pre>
   * optional filters that can be specified to filter down feature rows returned
   * </pre>
   *
   * <code>.chalk.engine.v2.FeatureValueFilters filters = 5 [json_name = "filters"];</code>
   * @return The filters.
   */
  ai.chalk.protos.chalk.engine.v2.FeatureValueFilters getFilters();
  /**
   * <pre>
   * optional filters that can be specified to filter down feature rows returned
   * </pre>
   *
   * <code>.chalk.engine.v2.FeatureValueFilters filters = 5 [json_name = "filters"];</code>
   */
  ai.chalk.protos.chalk.engine.v2.FeatureValueFiltersOrBuilder getFiltersOrBuilder();

  /**
   * <pre>
   * The (maximum) page size for results. If zero, then the server picks.
   * </pre>
   *
   * <code>int32 page_size = 6 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * When dealing with paginated responses, the next token can be provided to get the next page of responses
   * The query parameters above must be exactly the same when using a next token
   * This is opaque to the clients, but in practice, it is an encoding of the GetFeatureValuesPageToken
   * if unspecified, retrieve the zeroth page.
   * </pre>
   *
   * <code>string page_token = 7 [json_name = "pageToken"];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * When dealing with paginated responses, the next token can be provided to get the next page of responses
   * The query parameters above must be exactly the same when using a next token
   * This is opaque to the clients, but in practice, it is an encoding of the GetFeatureValuesPageToken
   * if unspecified, retrieve the zeroth page.
   * </pre>
   *
   * <code>string page_token = 7 [json_name = "pageToken"];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
