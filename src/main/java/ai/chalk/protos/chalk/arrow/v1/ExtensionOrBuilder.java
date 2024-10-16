// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/arrow/v1/arrow.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.arrow.v1;

public interface ExtensionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.arrow.v1.Extension)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the extension -- e.g. arrow.json. See
   * https://arrow.apache.org/docs/format/CanonicalExtensions.html
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the extension -- e.g. arrow.json. See
   * https://arrow.apache.org/docs/format/CanonicalExtensions.html
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The underlying storage type for this extension type.
   * </pre>
   *
   * <code>.chalk.arrow.v1.ArrowType storage_type = 2 [json_name = "storageType"];</code>
   * @return Whether the storageType field is set.
   */
  boolean hasStorageType();
  /**
   * <pre>
   * The underlying storage type for this extension type.
   * </pre>
   *
   * <code>.chalk.arrow.v1.ArrowType storage_type = 2 [json_name = "storageType"];</code>
   * @return The storageType.
   */
  ai.chalk.protos.chalk.arrow.v1.ArrowType getStorageType();
  /**
   * <pre>
   * The underlying storage type for this extension type.
   * </pre>
   *
   * <code>.chalk.arrow.v1.ArrowType storage_type = 2 [json_name = "storageType"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ArrowTypeOrBuilder getStorageTypeOrBuilder();
}