// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/sources.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.graph.v1;

public interface KinesisSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.graph.v1.KinesisSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string stream_name = 2 [json_name = "streamName"];</code>
   * @return The streamName.
   */
  java.lang.String getStreamName();
  /**
   * <code>string stream_name = 2 [json_name = "streamName"];</code>
   * @return The bytes for streamName.
   */
  com.google.protobuf.ByteString
      getStreamNameBytes();

  /**
   * <code>string stream_arn = 3 [json_name = "streamArn"];</code>
   * @return The streamArn.
   */
  java.lang.String getStreamArn();
  /**
   * <code>string stream_arn = 3 [json_name = "streamArn"];</code>
   * @return The bytes for streamArn.
   */
  com.google.protobuf.ByteString
      getStreamArnBytes();

  /**
   * <code>string region_name = 4 [json_name = "regionName"];</code>
   * @return The regionName.
   */
  java.lang.String getRegionName();
  /**
   * <code>string region_name = 4 [json_name = "regionName"];</code>
   * @return The bytes for regionName.
   */
  com.google.protobuf.ByteString
      getRegionNameBytes();

  /**
   * <code>.google.protobuf.Duration late_arrival_deadline = 5 [json_name = "lateArrivalDeadline"];</code>
   * @return Whether the lateArrivalDeadline field is set.
   */
  boolean hasLateArrivalDeadline();
  /**
   * <code>.google.protobuf.Duration late_arrival_deadline = 5 [json_name = "lateArrivalDeadline"];</code>
   * @return The lateArrivalDeadline.
   */
  com.google.protobuf.Duration getLateArrivalDeadline();
  /**
   * <code>.google.protobuf.Duration late_arrival_deadline = 5 [json_name = "lateArrivalDeadline"];</code>
   */
  com.google.protobuf.DurationOrBuilder getLateArrivalDeadlineOrBuilder();

  /**
   * <code>string dead_letter_queue_stream_name = 6 [json_name = "deadLetterQueueStreamName"];</code>
   * @return The deadLetterQueueStreamName.
   */
  java.lang.String getDeadLetterQueueStreamName();
  /**
   * <code>string dead_letter_queue_stream_name = 6 [json_name = "deadLetterQueueStreamName"];</code>
   * @return The bytes for deadLetterQueueStreamName.
   */
  com.google.protobuf.ByteString
      getDeadLetterQueueStreamNameBytes();

  /**
   * <code>string aws_access_key_id = 7 [json_name = "awsAccessKeyId"];</code>
   * @return The awsAccessKeyId.
   */
  java.lang.String getAwsAccessKeyId();
  /**
   * <code>string aws_access_key_id = 7 [json_name = "awsAccessKeyId"];</code>
   * @return The bytes for awsAccessKeyId.
   */
  com.google.protobuf.ByteString
      getAwsAccessKeyIdBytes();

  /**
   * <code>string aws_secret_access_key = 8 [json_name = "awsSecretAccessKey"];</code>
   * @return The awsSecretAccessKey.
   */
  java.lang.String getAwsSecretAccessKey();
  /**
   * <code>string aws_secret_access_key = 8 [json_name = "awsSecretAccessKey"];</code>
   * @return The bytes for awsSecretAccessKey.
   */
  com.google.protobuf.ByteString
      getAwsSecretAccessKeyBytes();

  /**
   * <code>string aws_session_token = 9 [json_name = "awsSessionToken"];</code>
   * @return The awsSessionToken.
   */
  java.lang.String getAwsSessionToken();
  /**
   * <code>string aws_session_token = 9 [json_name = "awsSessionToken"];</code>
   * @return The bytes for awsSessionToken.
   */
  com.google.protobuf.ByteString
      getAwsSessionTokenBytes();

  /**
   * <code>string endpoint_url = 10 [json_name = "endpointUrl"];</code>
   * @return The endpointUrl.
   */
  java.lang.String getEndpointUrl();
  /**
   * <code>string endpoint_url = 10 [json_name = "endpointUrl"];</code>
   * @return The bytes for endpointUrl.
   */
  com.google.protobuf.ByteString
      getEndpointUrlBytes();

  /**
   * <code>string consumer_role_arn = 11 [json_name = "consumerRoleArn"];</code>
   * @return The consumerRoleArn.
   */
  java.lang.String getConsumerRoleArn();
  /**
   * <code>string consumer_role_arn = 11 [json_name = "consumerRoleArn"];</code>
   * @return The bytes for consumerRoleArn.
   */
  com.google.protobuf.ByteString
      getConsumerRoleArnBytes();
}
