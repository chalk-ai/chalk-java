// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/arrow/v1/arrow.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.arrow.v1;

public interface MapOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.arrow.v1.Map)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.arrow.v1.Field key_field = 1 [json_name = "keyField"];</code>
   * @return Whether the keyField field is set.
   */
  boolean hasKeyField();
  /**
   * <code>.chalk.arrow.v1.Field key_field = 1 [json_name = "keyField"];</code>
   * @return The keyField.
   */
  ai.chalk.protos.chalk.arrow.v1.Field getKeyField();
  /**
   * <code>.chalk.arrow.v1.Field key_field = 1 [json_name = "keyField"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder getKeyFieldOrBuilder();

  /**
   * <code>.chalk.arrow.v1.Field item_field = 2 [json_name = "itemField"];</code>
   * @return Whether the itemField field is set.
   */
  boolean hasItemField();
  /**
   * <code>.chalk.arrow.v1.Field item_field = 2 [json_name = "itemField"];</code>
   * @return The itemField.
   */
  ai.chalk.protos.chalk.arrow.v1.Field getItemField();
  /**
   * <code>.chalk.arrow.v1.Field item_field = 2 [json_name = "itemField"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.FieldOrBuilder getItemFieldOrBuilder();

  /**
   * <code>bool keys_sorted = 3 [json_name = "keysSorted"];</code>
   * @return The keysSorted.
   */
  boolean getKeysSorted();
}
