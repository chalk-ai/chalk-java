// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/online_query.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

public interface OutputExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.OutputExpr)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string feature_fqn = 1 [json_name = "featureFqn"];</code>
   * @return Whether the featureFqn field is set.
   */
  boolean hasFeatureFqn();
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

  ai.chalk.protos.chalk.common.v1.OutputExpr.ExprCase getExprCase();
}
