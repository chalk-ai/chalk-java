// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v1/plan.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.engine.v1;

public interface NodeImplOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.engine.v1.NodeImpl)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.engine.v1.UnknownNode unknown = 1 [json_name = "unknown"];</code>
   * @return Whether the unknown field is set.
   */
  boolean hasUnknown();
  /**
   * <code>.chalk.engine.v1.UnknownNode unknown = 1 [json_name = "unknown"];</code>
   * @return The unknown.
   */
  ai.chalk.protos.chalk.engine.v1.UnknownNode getUnknown();
  /**
   * <code>.chalk.engine.v1.UnknownNode unknown = 1 [json_name = "unknown"];</code>
   */
  ai.chalk.protos.chalk.engine.v1.UnknownNodeOrBuilder getUnknownOrBuilder();

  /**
   * <code>.chalk.engine.v1.GivensScan givens_scan = 2 [json_name = "givensScan"];</code>
   * @return Whether the givensScan field is set.
   */
  boolean hasGivensScan();
  /**
   * <code>.chalk.engine.v1.GivensScan givens_scan = 2 [json_name = "givensScan"];</code>
   * @return The givensScan.
   */
  ai.chalk.protos.chalk.engine.v1.GivensScan getGivensScan();
  /**
   * <code>.chalk.engine.v1.GivensScan givens_scan = 2 [json_name = "givensScan"];</code>
   */
  ai.chalk.protos.chalk.engine.v1.GivensScanOrBuilder getGivensScanOrBuilder();

  /**
   * <code>.chalk.engine.v1.Project project = 3 [json_name = "project"];</code>
   * @return Whether the project field is set.
   */
  boolean hasProject();
  /**
   * <code>.chalk.engine.v1.Project project = 3 [json_name = "project"];</code>
   * @return The project.
   */
  ai.chalk.protos.chalk.engine.v1.Project getProject();
  /**
   * <code>.chalk.engine.v1.Project project = 3 [json_name = "project"];</code>
   */
  ai.chalk.protos.chalk.engine.v1.ProjectOrBuilder getProjectOrBuilder();

  /**
   * <code>.chalk.engine.v1.ChalkProject chalk_project = 4 [json_name = "chalkProject"];</code>
   * @return Whether the chalkProject field is set.
   */
  boolean hasChalkProject();
  /**
   * <code>.chalk.engine.v1.ChalkProject chalk_project = 4 [json_name = "chalkProject"];</code>
   * @return The chalkProject.
   */
  ai.chalk.protos.chalk.engine.v1.ChalkProject getChalkProject();
  /**
   * <code>.chalk.engine.v1.ChalkProject chalk_project = 4 [json_name = "chalkProject"];</code>
   */
  ai.chalk.protos.chalk.engine.v1.ChalkProjectOrBuilder getChalkProjectOrBuilder();

  /**
   * <code>.chalk.engine.v1.DefaultInjector default_injector = 5 [json_name = "defaultInjector"];</code>
   * @return Whether the defaultInjector field is set.
   */
  boolean hasDefaultInjector();
  /**
   * <code>.chalk.engine.v1.DefaultInjector default_injector = 5 [json_name = "defaultInjector"];</code>
   * @return The defaultInjector.
   */
  ai.chalk.protos.chalk.engine.v1.DefaultInjector getDefaultInjector();
  /**
   * <code>.chalk.engine.v1.DefaultInjector default_injector = 5 [json_name = "defaultInjector"];</code>
   */
  ai.chalk.protos.chalk.engine.v1.DefaultInjectorOrBuilder getDefaultInjectorOrBuilder();

  ai.chalk.protos.chalk.engine.v1.NodeImpl.ImplCase getImplCase();
}
