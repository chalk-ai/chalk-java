// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/chalk_error.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.common.v1;

public interface ChalkErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.ChalkError)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.common.v1.ErrorCode code = 1 [json_name = "code"];</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <code>.chalk.common.v1.ErrorCode code = 1 [json_name = "code"];</code>
   * @return The code.
   */
  ai.chalk.protos.chalk.common.v1.ErrorCode getCode();

  /**
   * <code>.chalk.common.v1.ErrorCodeCategory category = 2 [json_name = "category"];</code>
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   * <code>.chalk.common.v1.ErrorCodeCategory category = 2 [json_name = "category"];</code>
   * @return The category.
   */
  ai.chalk.protos.chalk.common.v1.ErrorCodeCategory getCategory();

  /**
   * <pre>
   * A readable description of the error message.
   * </pre>
   *
   * <code>string message = 3 [json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * A readable description of the error message.
   * </pre>
   *
   * <code>string message = 3 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * A human-readable hint that can be used to identify the entity that this error is associated with.
   * </pre>
   *
   * <code>optional string display_primary_key = 101 [json_name = "displayPrimaryKey"];</code>
   * @return Whether the displayPrimaryKey field is set.
   */
  boolean hasDisplayPrimaryKey();
  /**
   * <pre>
   * A human-readable hint that can be used to identify the entity that this error is associated with.
   * </pre>
   *
   * <code>optional string display_primary_key = 101 [json_name = "displayPrimaryKey"];</code>
   * @return The displayPrimaryKey.
   */
  java.lang.String getDisplayPrimaryKey();
  /**
   * <pre>
   * A human-readable hint that can be used to identify the entity that this error is associated with.
   * </pre>
   *
   * <code>optional string display_primary_key = 101 [json_name = "displayPrimaryKey"];</code>
   * @return The bytes for displayPrimaryKey.
   */
  com.google.protobuf.ByteString
      getDisplayPrimaryKeyBytes();

  /**
   * <pre>
   * If provided, can be used to add additional context to 'display_primary_key'.
   * </pre>
   *
   * <code>optional string display_primary_key_fqn = 102 [json_name = "displayPrimaryKeyFqn"];</code>
   * @return Whether the displayPrimaryKeyFqn field is set.
   */
  boolean hasDisplayPrimaryKeyFqn();
  /**
   * <pre>
   * If provided, can be used to add additional context to 'display_primary_key'.
   * </pre>
   *
   * <code>optional string display_primary_key_fqn = 102 [json_name = "displayPrimaryKeyFqn"];</code>
   * @return The displayPrimaryKeyFqn.
   */
  java.lang.String getDisplayPrimaryKeyFqn();
  /**
   * <pre>
   * If provided, can be used to add additional context to 'display_primary_key'.
   * </pre>
   *
   * <code>optional string display_primary_key_fqn = 102 [json_name = "displayPrimaryKeyFqn"];</code>
   * @return The bytes for displayPrimaryKeyFqn.
   */
  com.google.protobuf.ByteString
      getDisplayPrimaryKeyFqnBytes();

  /**
   * <pre>
   * The exception that caused the failure, if applicable.
   * </pre>
   *
   * <code>optional .chalk.common.v1.ChalkException exception = 103 [json_name = "exception"];</code>
   * @return Whether the exception field is set.
   */
  boolean hasException();
  /**
   * <pre>
   * The exception that caused the failure, if applicable.
   * </pre>
   *
   * <code>optional .chalk.common.v1.ChalkException exception = 103 [json_name = "exception"];</code>
   * @return The exception.
   */
  ai.chalk.protos.chalk.common.v1.ChalkException getException();
  /**
   * <pre>
   * The exception that caused the failure, if applicable.
   * </pre>
   *
   * <code>optional .chalk.common.v1.ChalkException exception = 103 [json_name = "exception"];</code>
   */
  ai.chalk.protos.chalk.common.v1.ChalkExceptionOrBuilder getExceptionOrBuilder();

  /**
   * <pre>
   * The fully qualified name of the failing feature, e.g. `user.identity.has_voip_phone`.
   * </pre>
   *
   * <code>optional string feature = 104 [json_name = "feature"];</code>
   * @return Whether the feature field is set.
   */
  boolean hasFeature();
  /**
   * <pre>
   * The fully qualified name of the failing feature, e.g. `user.identity.has_voip_phone`.
   * </pre>
   *
   * <code>optional string feature = 104 [json_name = "feature"];</code>
   * @return The feature.
   */
  java.lang.String getFeature();
  /**
   * <pre>
   * The fully qualified name of the failing feature, e.g. `user.identity.has_voip_phone`.
   * </pre>
   *
   * <code>optional string feature = 104 [json_name = "feature"];</code>
   * @return The bytes for feature.
   */
  com.google.protobuf.ByteString
      getFeatureBytes();

  /**
   * <pre>
   * The fully qualified name of the failing resolver, e.g. `my.project.get_fraud_score`.
   * </pre>
   *
   * <code>optional string resolver = 105 [json_name = "resolver"];</code>
   * @return Whether the resolver field is set.
   */
  boolean hasResolver();
  /**
   * <pre>
   * The fully qualified name of the failing resolver, e.g. `my.project.get_fraud_score`.
   * </pre>
   *
   * <code>optional string resolver = 105 [json_name = "resolver"];</code>
   * @return The resolver.
   */
  java.lang.String getResolver();
  /**
   * <pre>
   * The fully qualified name of the failing resolver, e.g. `my.project.get_fraud_score`.
   * </pre>
   *
   * <code>optional string resolver = 105 [json_name = "resolver"];</code>
   * @return The bytes for resolver.
   */
  com.google.protobuf.ByteString
      getResolverBytes();
}
