// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/arrow/v1/arrow.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.arrow.v1;

public interface ExtensionValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.arrow.v1.ExtensionValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.arrow.v1.Extension extension_type = 1 [json_name = "extensionType"];</code>
   * @return Whether the extensionType field is set.
   */
  boolean hasExtensionType();
  /**
   * <code>.chalk.arrow.v1.Extension extension_type = 1 [json_name = "extensionType"];</code>
   * @return The extensionType.
   */
  ai.chalk.protos.chalk.arrow.v1.Extension getExtensionType();
  /**
   * <code>.chalk.arrow.v1.Extension extension_type = 1 [json_name = "extensionType"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ExtensionOrBuilder getExtensionTypeOrBuilder();

  /**
   * <code>.chalk.arrow.v1.ScalarValue storage_value = 2 [json_name = "storageValue"];</code>
   * @return Whether the storageValue field is set.
   */
  boolean hasStorageValue();
  /**
   * <code>.chalk.arrow.v1.ScalarValue storage_value = 2 [json_name = "storageValue"];</code>
   * @return The storageValue.
   */
  ai.chalk.protos.chalk.arrow.v1.ScalarValue getStorageValue();
  /**
   * <code>.chalk.arrow.v1.ScalarValue storage_value = 2 [json_name = "storageValue"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ScalarValueOrBuilder getStorageValueOrBuilder();
}