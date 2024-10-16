// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/lsp/v1/lsp.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.lsp.v1;

public interface CodeActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.lsp.v1.CodeAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>repeated .chalk.lsp.v1.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.lsp.v1.Diagnostic> 
      getDiagnosticsList();
  /**
   * <code>repeated .chalk.lsp.v1.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  ai.chalk.protos.chalk.lsp.v1.Diagnostic getDiagnostics(int index);
  /**
   * <code>repeated .chalk.lsp.v1.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  int getDiagnosticsCount();
  /**
   * <code>repeated .chalk.lsp.v1.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.lsp.v1.DiagnosticOrBuilder> 
      getDiagnosticsOrBuilderList();
  /**
   * <code>repeated .chalk.lsp.v1.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  ai.chalk.protos.chalk.lsp.v1.DiagnosticOrBuilder getDiagnosticsOrBuilder(
      int index);

  /**
   * <code>.chalk.lsp.v1.WorkspaceEdit edit = 3 [json_name = "edit"];</code>
   * @return Whether the edit field is set.
   */
  boolean hasEdit();
  /**
   * <code>.chalk.lsp.v1.WorkspaceEdit edit = 3 [json_name = "edit"];</code>
   * @return The edit.
   */
  ai.chalk.protos.chalk.lsp.v1.WorkspaceEdit getEdit();
  /**
   * <code>.chalk.lsp.v1.WorkspaceEdit edit = 3 [json_name = "edit"];</code>
   */
  ai.chalk.protos.chalk.lsp.v1.WorkspaceEditOrBuilder getEditOrBuilder();
}