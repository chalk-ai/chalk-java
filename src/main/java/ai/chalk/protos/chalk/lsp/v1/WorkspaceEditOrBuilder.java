// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/lsp/v1/lsp.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.lsp.v1;

public interface WorkspaceEditOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.lsp.v1.WorkspaceEdit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.lsp.v1.TextDocumentEdit document_changes = 1 [json_name = "documentChanges"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.lsp.v1.TextDocumentEdit> 
      getDocumentChangesList();
  /**
   * <code>repeated .chalk.lsp.v1.TextDocumentEdit document_changes = 1 [json_name = "documentChanges"];</code>
   */
  ai.chalk.protos.chalk.lsp.v1.TextDocumentEdit getDocumentChanges(int index);
  /**
   * <code>repeated .chalk.lsp.v1.TextDocumentEdit document_changes = 1 [json_name = "documentChanges"];</code>
   */
  int getDocumentChangesCount();
  /**
   * <code>repeated .chalk.lsp.v1.TextDocumentEdit document_changes = 1 [json_name = "documentChanges"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.lsp.v1.TextDocumentEditOrBuilder> 
      getDocumentChangesOrBuilderList();
  /**
   * <code>repeated .chalk.lsp.v1.TextDocumentEdit document_changes = 1 [json_name = "documentChanges"];</code>
   */
  ai.chalk.protos.chalk.lsp.v1.TextDocumentEditOrBuilder getDocumentChangesOrBuilder(
      int index);
}
