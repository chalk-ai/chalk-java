// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/nodepools/v1/karpenter.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.nodepools.v1;

public interface KarpenterNodepoolTemplateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.nodepools.v1.KarpenterNodepoolTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.nodepools.v1.KarpenterNodepoolTemplateMetadata metadata = 1 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.chalk.nodepools.v1.KarpenterNodepoolTemplateMetadata metadata = 1 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolTemplateMetadata getMetadata();
  /**
   * <code>.chalk.nodepools.v1.KarpenterNodepoolTemplateMetadata metadata = 1 [json_name = "metadata"];</code>
   */
  ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolTemplateMetadataOrBuilder getMetadataOrBuilder();

  /**
   * <code>.chalk.nodepools.v1.KarpenterNodepoolTemplateSpec spec = 2 [json_name = "spec"];</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <code>.chalk.nodepools.v1.KarpenterNodepoolTemplateSpec spec = 2 [json_name = "spec"];</code>
   * @return The spec.
   */
  ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolTemplateSpec getSpec();
  /**
   * <code>.chalk.nodepools.v1.KarpenterNodepoolTemplateSpec spec = 2 [json_name = "spec"];</code>
   */
  ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolTemplateSpecOrBuilder getSpecOrBuilder();
}
