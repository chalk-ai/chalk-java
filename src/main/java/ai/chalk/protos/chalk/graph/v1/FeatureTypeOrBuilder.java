// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.graph.v1;

public interface FeatureTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.graph.v1.FeatureType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.graph.v1.ScalarFeatureType scalar = 1 [json_name = "scalar"];</code>
   * @return Whether the scalar field is set.
   */
  boolean hasScalar();
  /**
   * <code>.chalk.graph.v1.ScalarFeatureType scalar = 1 [json_name = "scalar"];</code>
   * @return The scalar.
   */
  ai.chalk.protos.chalk.graph.v1.ScalarFeatureType getScalar();
  /**
   * <code>.chalk.graph.v1.ScalarFeatureType scalar = 1 [json_name = "scalar"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.ScalarFeatureTypeOrBuilder getScalarOrBuilder();

  /**
   * <code>.chalk.graph.v1.HasOneFeatureType has_one = 2 [json_name = "hasOne"];</code>
   * @return Whether the hasOne field is set.
   */
  boolean hasHasOne();
  /**
   * <code>.chalk.graph.v1.HasOneFeatureType has_one = 2 [json_name = "hasOne"];</code>
   * @return The hasOne.
   */
  ai.chalk.protos.chalk.graph.v1.HasOneFeatureType getHasOne();
  /**
   * <code>.chalk.graph.v1.HasOneFeatureType has_one = 2 [json_name = "hasOne"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.HasOneFeatureTypeOrBuilder getHasOneOrBuilder();

  /**
   * <code>.chalk.graph.v1.HasManyFeatureType has_many = 3 [json_name = "hasMany"];</code>
   * @return Whether the hasMany field is set.
   */
  boolean hasHasMany();
  /**
   * <code>.chalk.graph.v1.HasManyFeatureType has_many = 3 [json_name = "hasMany"];</code>
   * @return The hasMany.
   */
  ai.chalk.protos.chalk.graph.v1.HasManyFeatureType getHasMany();
  /**
   * <code>.chalk.graph.v1.HasManyFeatureType has_many = 3 [json_name = "hasMany"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.HasManyFeatureTypeOrBuilder getHasManyOrBuilder();

  /**
   * <code>.chalk.graph.v1.FeatureTimeFeatureType feature_time = 4 [json_name = "featureTime"];</code>
   * @return Whether the featureTime field is set.
   */
  boolean hasFeatureTime();
  /**
   * <code>.chalk.graph.v1.FeatureTimeFeatureType feature_time = 4 [json_name = "featureTime"];</code>
   * @return The featureTime.
   */
  ai.chalk.protos.chalk.graph.v1.FeatureTimeFeatureType getFeatureTime();
  /**
   * <code>.chalk.graph.v1.FeatureTimeFeatureType feature_time = 4 [json_name = "featureTime"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.FeatureTimeFeatureTypeOrBuilder getFeatureTimeOrBuilder();

  /**
   * <code>.chalk.graph.v1.WindowedFeatureType windowed = 5 [json_name = "windowed"];</code>
   * @return Whether the windowed field is set.
   */
  boolean hasWindowed();
  /**
   * <code>.chalk.graph.v1.WindowedFeatureType windowed = 5 [json_name = "windowed"];</code>
   * @return The windowed.
   */
  ai.chalk.protos.chalk.graph.v1.WindowedFeatureType getWindowed();
  /**
   * <code>.chalk.graph.v1.WindowedFeatureType windowed = 5 [json_name = "windowed"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.WindowedFeatureTypeOrBuilder getWindowedOrBuilder();

  ai.chalk.protos.chalk.graph.v1.FeatureType.TypeCase getTypeCase();
}
