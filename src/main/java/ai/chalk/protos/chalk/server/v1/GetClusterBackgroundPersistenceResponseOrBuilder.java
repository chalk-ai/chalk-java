// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/builder.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface GetClusterBackgroundPersistenceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetClusterBackgroundPersistenceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.server.v1.BackgroundPersistence background_persistence = 1 [json_name = "backgroundPersistence"];</code>
   * @return Whether the backgroundPersistence field is set.
   */
  boolean hasBackgroundPersistence();
  /**
   * <code>.chalk.server.v1.BackgroundPersistence background_persistence = 1 [json_name = "backgroundPersistence"];</code>
   * @return The backgroundPersistence.
   */
  ai.chalk.protos.chalk.server.v1.BackgroundPersistence getBackgroundPersistence();
  /**
   * <code>.chalk.server.v1.BackgroundPersistence background_persistence = 1 [json_name = "backgroundPersistence"];</code>
   */
  ai.chalk.protos.chalk.server.v1.BackgroundPersistenceOrBuilder getBackgroundPersistenceOrBuilder();
}