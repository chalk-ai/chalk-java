// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.graph.v1;

public interface ResolverOutputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.graph.v1.ResolverOutput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.graph.v1.FeatureReference feature = 1 [json_name = "feature"];</code>
   * @return Whether the feature field is set.
   */
  boolean hasFeature();
  /**
   * <code>.chalk.graph.v1.FeatureReference feature = 1 [json_name = "feature"];</code>
   * @return The feature.
   */
  ai.chalk.protos.chalk.graph.v1.FeatureReference getFeature();
  /**
   * <code>.chalk.graph.v1.FeatureReference feature = 1 [json_name = "feature"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.FeatureReferenceOrBuilder getFeatureOrBuilder();

  /**
   * <code>.chalk.graph.v1.DataFrameType df = 2 [json_name = "df"];</code>
   * @return Whether the df field is set.
   */
  boolean hasDf();
  /**
   * <code>.chalk.graph.v1.DataFrameType df = 2 [json_name = "df"];</code>
   * @return The df.
   */
  ai.chalk.protos.chalk.graph.v1.DataFrameType getDf();
  /**
   * <code>.chalk.graph.v1.DataFrameType df = 2 [json_name = "df"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.DataFrameTypeOrBuilder getDfOrBuilder();

  ai.chalk.protos.chalk.graph.v1.ResolverOutput.AnnotationCase getAnnotationCase();
}
