package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/prompt.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PromptServiceGrpc {

  private PromptServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.PromptService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListNamedPromptsRequest,
      ai.chalk.protos.chalk.server.v1.ListNamedPromptsResponse> getListNamedPromptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNamedPrompts",
      requestType = ai.chalk.protos.chalk.server.v1.ListNamedPromptsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.ListNamedPromptsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListNamedPromptsRequest,
      ai.chalk.protos.chalk.server.v1.ListNamedPromptsResponse> getListNamedPromptsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListNamedPromptsRequest, ai.chalk.protos.chalk.server.v1.ListNamedPromptsResponse> getListNamedPromptsMethod;
    if ((getListNamedPromptsMethod = PromptServiceGrpc.getListNamedPromptsMethod) == null) {
      synchronized (PromptServiceGrpc.class) {
        if ((getListNamedPromptsMethod = PromptServiceGrpc.getListNamedPromptsMethod) == null) {
          PromptServiceGrpc.getListNamedPromptsMethod = getListNamedPromptsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.ListNamedPromptsRequest, ai.chalk.protos.chalk.server.v1.ListNamedPromptsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNamedPrompts"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListNamedPromptsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListNamedPromptsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PromptServiceMethodDescriptorSupplier("ListNamedPrompts"))
              .build();
        }
      }
    }
    return getListNamedPromptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetNamedPromptRequest,
      ai.chalk.protos.chalk.server.v1.GetNamedPromptResponse> getGetNamedPromptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNamedPrompt",
      requestType = ai.chalk.protos.chalk.server.v1.GetNamedPromptRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetNamedPromptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetNamedPromptRequest,
      ai.chalk.protos.chalk.server.v1.GetNamedPromptResponse> getGetNamedPromptMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetNamedPromptRequest, ai.chalk.protos.chalk.server.v1.GetNamedPromptResponse> getGetNamedPromptMethod;
    if ((getGetNamedPromptMethod = PromptServiceGrpc.getGetNamedPromptMethod) == null) {
      synchronized (PromptServiceGrpc.class) {
        if ((getGetNamedPromptMethod = PromptServiceGrpc.getGetNamedPromptMethod) == null) {
          PromptServiceGrpc.getGetNamedPromptMethod = getGetNamedPromptMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetNamedPromptRequest, ai.chalk.protos.chalk.server.v1.GetNamedPromptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNamedPrompt"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetNamedPromptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetNamedPromptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PromptServiceMethodDescriptorSupplier("GetNamedPrompt"))
              .build();
        }
      }
    }
    return getGetNamedPromptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateNamedPromptRequest,
      ai.chalk.protos.chalk.server.v1.CreateNamedPromptResponse> getCreateNamedPromptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNamedPrompt",
      requestType = ai.chalk.protos.chalk.server.v1.CreateNamedPromptRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.CreateNamedPromptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateNamedPromptRequest,
      ai.chalk.protos.chalk.server.v1.CreateNamedPromptResponse> getCreateNamedPromptMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateNamedPromptRequest, ai.chalk.protos.chalk.server.v1.CreateNamedPromptResponse> getCreateNamedPromptMethod;
    if ((getCreateNamedPromptMethod = PromptServiceGrpc.getCreateNamedPromptMethod) == null) {
      synchronized (PromptServiceGrpc.class) {
        if ((getCreateNamedPromptMethod = PromptServiceGrpc.getCreateNamedPromptMethod) == null) {
          PromptServiceGrpc.getCreateNamedPromptMethod = getCreateNamedPromptMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.CreateNamedPromptRequest, ai.chalk.protos.chalk.server.v1.CreateNamedPromptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNamedPrompt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateNamedPromptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateNamedPromptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PromptServiceMethodDescriptorSupplier("CreateNamedPrompt"))
              .build();
        }
      }
    }
    return getCreateNamedPromptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateNamedPromptRequest,
      ai.chalk.protos.chalk.server.v1.UpdateNamedPromptResponse> getUpdateNamedPromptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNamedPrompt",
      requestType = ai.chalk.protos.chalk.server.v1.UpdateNamedPromptRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.UpdateNamedPromptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateNamedPromptRequest,
      ai.chalk.protos.chalk.server.v1.UpdateNamedPromptResponse> getUpdateNamedPromptMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateNamedPromptRequest, ai.chalk.protos.chalk.server.v1.UpdateNamedPromptResponse> getUpdateNamedPromptMethod;
    if ((getUpdateNamedPromptMethod = PromptServiceGrpc.getUpdateNamedPromptMethod) == null) {
      synchronized (PromptServiceGrpc.class) {
        if ((getUpdateNamedPromptMethod = PromptServiceGrpc.getUpdateNamedPromptMethod) == null) {
          PromptServiceGrpc.getUpdateNamedPromptMethod = getUpdateNamedPromptMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.UpdateNamedPromptRequest, ai.chalk.protos.chalk.server.v1.UpdateNamedPromptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNamedPrompt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdateNamedPromptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdateNamedPromptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PromptServiceMethodDescriptorSupplier("UpdateNamedPrompt"))
              .build();
        }
      }
    }
    return getUpdateNamedPromptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListPromptVariantsRequest,
      ai.chalk.protos.chalk.server.v1.ListPromptVariantsResponse> getListPromptVariantsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPromptVariants",
      requestType = ai.chalk.protos.chalk.server.v1.ListPromptVariantsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.ListPromptVariantsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListPromptVariantsRequest,
      ai.chalk.protos.chalk.server.v1.ListPromptVariantsResponse> getListPromptVariantsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListPromptVariantsRequest, ai.chalk.protos.chalk.server.v1.ListPromptVariantsResponse> getListPromptVariantsMethod;
    if ((getListPromptVariantsMethod = PromptServiceGrpc.getListPromptVariantsMethod) == null) {
      synchronized (PromptServiceGrpc.class) {
        if ((getListPromptVariantsMethod = PromptServiceGrpc.getListPromptVariantsMethod) == null) {
          PromptServiceGrpc.getListPromptVariantsMethod = getListPromptVariantsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.ListPromptVariantsRequest, ai.chalk.protos.chalk.server.v1.ListPromptVariantsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPromptVariants"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListPromptVariantsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListPromptVariantsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PromptServiceMethodDescriptorSupplier("ListPromptVariants"))
              .build();
        }
      }
    }
    return getListPromptVariantsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest,
      ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsResponse> getListPromptEvaluationRunsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPromptEvaluationRuns",
      requestType = ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest,
      ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsResponse> getListPromptEvaluationRunsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest, ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsResponse> getListPromptEvaluationRunsMethod;
    if ((getListPromptEvaluationRunsMethod = PromptServiceGrpc.getListPromptEvaluationRunsMethod) == null) {
      synchronized (PromptServiceGrpc.class) {
        if ((getListPromptEvaluationRunsMethod = PromptServiceGrpc.getListPromptEvaluationRunsMethod) == null) {
          PromptServiceGrpc.getListPromptEvaluationRunsMethod = getListPromptEvaluationRunsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest, ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPromptEvaluationRuns"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PromptServiceMethodDescriptorSupplier("ListPromptEvaluationRuns"))
              .build();
        }
      }
    }
    return getListPromptEvaluationRunsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunRequest,
      ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunResponse> getGetPromptEvaluationRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPromptEvaluationRun",
      requestType = ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunRequest,
      ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunResponse> getGetPromptEvaluationRunMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunRequest, ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunResponse> getGetPromptEvaluationRunMethod;
    if ((getGetPromptEvaluationRunMethod = PromptServiceGrpc.getGetPromptEvaluationRunMethod) == null) {
      synchronized (PromptServiceGrpc.class) {
        if ((getGetPromptEvaluationRunMethod = PromptServiceGrpc.getGetPromptEvaluationRunMethod) == null) {
          PromptServiceGrpc.getGetPromptEvaluationRunMethod = getGetPromptEvaluationRunMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunRequest, ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPromptEvaluationRun"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PromptServiceMethodDescriptorSupplier("GetPromptEvaluationRun"))
              .build();
        }
      }
    }
    return getGetPromptEvaluationRunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunRequest,
      ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunResponse> getCreatePromptEvaluationRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePromptEvaluationRun",
      requestType = ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunRequest,
      ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunResponse> getCreatePromptEvaluationRunMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunRequest, ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunResponse> getCreatePromptEvaluationRunMethod;
    if ((getCreatePromptEvaluationRunMethod = PromptServiceGrpc.getCreatePromptEvaluationRunMethod) == null) {
      synchronized (PromptServiceGrpc.class) {
        if ((getCreatePromptEvaluationRunMethod = PromptServiceGrpc.getCreatePromptEvaluationRunMethod) == null) {
          PromptServiceGrpc.getCreatePromptEvaluationRunMethod = getCreatePromptEvaluationRunMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunRequest, ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePromptEvaluationRun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PromptServiceMethodDescriptorSupplier("CreatePromptEvaluationRun"))
              .build();
        }
      }
    }
    return getCreatePromptEvaluationRunMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PromptServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PromptServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PromptServiceStub>() {
        @java.lang.Override
        public PromptServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PromptServiceStub(channel, callOptions);
        }
      };
    return PromptServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PromptServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PromptServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PromptServiceBlockingStub>() {
        @java.lang.Override
        public PromptServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PromptServiceBlockingStub(channel, callOptions);
        }
      };
    return PromptServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PromptServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PromptServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PromptServiceFutureStub>() {
        @java.lang.Override
        public PromptServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PromptServiceFutureStub(channel, callOptions);
        }
      };
    return PromptServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Return a list of named prompts
     * </pre>
     */
    default void listNamedPrompts(ai.chalk.protos.chalk.server.v1.ListNamedPromptsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListNamedPromptsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNamedPromptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Return a single named prompt with the latest prompt variant
     * </pre>
     */
    default void getNamedPrompt(ai.chalk.protos.chalk.server.v1.GetNamedPromptRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetNamedPromptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNamedPromptMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new named prompt and its corresponding prompt variant
     * </pre>
     */
    default void createNamedPrompt(ai.chalk.protos.chalk.server.v1.CreateNamedPromptRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateNamedPromptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNamedPromptMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify a named prompt; may create a new prompt variant if variant settings changed
     * </pre>
     */
    default void updateNamedPrompt(ai.chalk.protos.chalk.server.v1.UpdateNamedPromptRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateNamedPromptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNamedPromptMethod(), responseObserver);
    }

    /**
     * <pre>
     * Return a list of prompt variants
     * </pre>
     */
    default void listPromptVariants(ai.chalk.protos.chalk.server.v1.ListPromptVariantsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListPromptVariantsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPromptVariantsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Return a list of prompt evaluation runs
     * </pre>
     */
    default void listPromptEvaluationRuns(ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPromptEvaluationRunsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Return a prompt evaluation run and its prompt variants
     * </pre>
     */
    default void getPromptEvaluationRun(ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPromptEvaluationRunMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start a new prompt evaluation run
     * </pre>
     */
    default void createPromptEvaluationRun(ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePromptEvaluationRunMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PromptService.
   */
  public static abstract class PromptServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PromptServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PromptService.
   */
  public static final class PromptServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PromptServiceStub> {
    private PromptServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PromptServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PromptServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Return a list of named prompts
     * </pre>
     */
    public void listNamedPrompts(ai.chalk.protos.chalk.server.v1.ListNamedPromptsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListNamedPromptsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNamedPromptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return a single named prompt with the latest prompt variant
     * </pre>
     */
    public void getNamedPrompt(ai.chalk.protos.chalk.server.v1.GetNamedPromptRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetNamedPromptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNamedPromptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new named prompt and its corresponding prompt variant
     * </pre>
     */
    public void createNamedPrompt(ai.chalk.protos.chalk.server.v1.CreateNamedPromptRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateNamedPromptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNamedPromptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify a named prompt; may create a new prompt variant if variant settings changed
     * </pre>
     */
    public void updateNamedPrompt(ai.chalk.protos.chalk.server.v1.UpdateNamedPromptRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateNamedPromptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNamedPromptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return a list of prompt variants
     * </pre>
     */
    public void listPromptVariants(ai.chalk.protos.chalk.server.v1.ListPromptVariantsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListPromptVariantsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPromptVariantsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return a list of prompt evaluation runs
     * </pre>
     */
    public void listPromptEvaluationRuns(ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPromptEvaluationRunsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return a prompt evaluation run and its prompt variants
     * </pre>
     */
    public void getPromptEvaluationRun(ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPromptEvaluationRunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start a new prompt evaluation run
     * </pre>
     */
    public void createPromptEvaluationRun(ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePromptEvaluationRunMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PromptService.
   */
  public static final class PromptServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PromptServiceBlockingStub> {
    private PromptServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PromptServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PromptServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Return a list of named prompts
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.ListNamedPromptsResponse listNamedPrompts(ai.chalk.protos.chalk.server.v1.ListNamedPromptsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNamedPromptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return a single named prompt with the latest prompt variant
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.GetNamedPromptResponse getNamedPrompt(ai.chalk.protos.chalk.server.v1.GetNamedPromptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNamedPromptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new named prompt and its corresponding prompt variant
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.CreateNamedPromptResponse createNamedPrompt(ai.chalk.protos.chalk.server.v1.CreateNamedPromptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNamedPromptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify a named prompt; may create a new prompt variant if variant settings changed
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.UpdateNamedPromptResponse updateNamedPrompt(ai.chalk.protos.chalk.server.v1.UpdateNamedPromptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNamedPromptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return a list of prompt variants
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.ListPromptVariantsResponse listPromptVariants(ai.chalk.protos.chalk.server.v1.ListPromptVariantsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPromptVariantsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return a list of prompt evaluation runs
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsResponse listPromptEvaluationRuns(ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPromptEvaluationRunsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return a prompt evaluation run and its prompt variants
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunResponse getPromptEvaluationRun(ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPromptEvaluationRunMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start a new prompt evaluation run
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunResponse createPromptEvaluationRun(ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePromptEvaluationRunMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PromptService.
   */
  public static final class PromptServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PromptServiceFutureStub> {
    private PromptServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PromptServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PromptServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Return a list of named prompts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.ListNamedPromptsResponse> listNamedPrompts(
        ai.chalk.protos.chalk.server.v1.ListNamedPromptsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNamedPromptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return a single named prompt with the latest prompt variant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetNamedPromptResponse> getNamedPrompt(
        ai.chalk.protos.chalk.server.v1.GetNamedPromptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNamedPromptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new named prompt and its corresponding prompt variant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.CreateNamedPromptResponse> createNamedPrompt(
        ai.chalk.protos.chalk.server.v1.CreateNamedPromptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNamedPromptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify a named prompt; may create a new prompt variant if variant settings changed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.UpdateNamedPromptResponse> updateNamedPrompt(
        ai.chalk.protos.chalk.server.v1.UpdateNamedPromptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNamedPromptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return a list of prompt variants
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.ListPromptVariantsResponse> listPromptVariants(
        ai.chalk.protos.chalk.server.v1.ListPromptVariantsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPromptVariantsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return a list of prompt evaluation runs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsResponse> listPromptEvaluationRuns(
        ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPromptEvaluationRunsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return a prompt evaluation run and its prompt variants
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunResponse> getPromptEvaluationRun(
        ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPromptEvaluationRunMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start a new prompt evaluation run
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunResponse> createPromptEvaluationRun(
        ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePromptEvaluationRunMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_NAMED_PROMPTS = 0;
  private static final int METHODID_GET_NAMED_PROMPT = 1;
  private static final int METHODID_CREATE_NAMED_PROMPT = 2;
  private static final int METHODID_UPDATE_NAMED_PROMPT = 3;
  private static final int METHODID_LIST_PROMPT_VARIANTS = 4;
  private static final int METHODID_LIST_PROMPT_EVALUATION_RUNS = 5;
  private static final int METHODID_GET_PROMPT_EVALUATION_RUN = 6;
  private static final int METHODID_CREATE_PROMPT_EVALUATION_RUN = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_NAMED_PROMPTS:
          serviceImpl.listNamedPrompts((ai.chalk.protos.chalk.server.v1.ListNamedPromptsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListNamedPromptsResponse>) responseObserver);
          break;
        case METHODID_GET_NAMED_PROMPT:
          serviceImpl.getNamedPrompt((ai.chalk.protos.chalk.server.v1.GetNamedPromptRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetNamedPromptResponse>) responseObserver);
          break;
        case METHODID_CREATE_NAMED_PROMPT:
          serviceImpl.createNamedPrompt((ai.chalk.protos.chalk.server.v1.CreateNamedPromptRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateNamedPromptResponse>) responseObserver);
          break;
        case METHODID_UPDATE_NAMED_PROMPT:
          serviceImpl.updateNamedPrompt((ai.chalk.protos.chalk.server.v1.UpdateNamedPromptRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateNamedPromptResponse>) responseObserver);
          break;
        case METHODID_LIST_PROMPT_VARIANTS:
          serviceImpl.listPromptVariants((ai.chalk.protos.chalk.server.v1.ListPromptVariantsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListPromptVariantsResponse>) responseObserver);
          break;
        case METHODID_LIST_PROMPT_EVALUATION_RUNS:
          serviceImpl.listPromptEvaluationRuns((ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsResponse>) responseObserver);
          break;
        case METHODID_GET_PROMPT_EVALUATION_RUN:
          serviceImpl.getPromptEvaluationRun((ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunResponse>) responseObserver);
          break;
        case METHODID_CREATE_PROMPT_EVALUATION_RUN:
          serviceImpl.createPromptEvaluationRun((ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getListNamedPromptsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.ListNamedPromptsRequest,
              ai.chalk.protos.chalk.server.v1.ListNamedPromptsResponse>(
                service, METHODID_LIST_NAMED_PROMPTS)))
        .addMethod(
          getGetNamedPromptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetNamedPromptRequest,
              ai.chalk.protos.chalk.server.v1.GetNamedPromptResponse>(
                service, METHODID_GET_NAMED_PROMPT)))
        .addMethod(
          getCreateNamedPromptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.CreateNamedPromptRequest,
              ai.chalk.protos.chalk.server.v1.CreateNamedPromptResponse>(
                service, METHODID_CREATE_NAMED_PROMPT)))
        .addMethod(
          getUpdateNamedPromptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.UpdateNamedPromptRequest,
              ai.chalk.protos.chalk.server.v1.UpdateNamedPromptResponse>(
                service, METHODID_UPDATE_NAMED_PROMPT)))
        .addMethod(
          getListPromptVariantsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.ListPromptVariantsRequest,
              ai.chalk.protos.chalk.server.v1.ListPromptVariantsResponse>(
                service, METHODID_LIST_PROMPT_VARIANTS)))
        .addMethod(
          getListPromptEvaluationRunsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsRequest,
              ai.chalk.protos.chalk.server.v1.ListPromptEvaluationRunsResponse>(
                service, METHODID_LIST_PROMPT_EVALUATION_RUNS)))
        .addMethod(
          getGetPromptEvaluationRunMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunRequest,
              ai.chalk.protos.chalk.server.v1.GetPromptEvaluationRunResponse>(
                service, METHODID_GET_PROMPT_EVALUATION_RUN)))
        .addMethod(
          getCreatePromptEvaluationRunMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunRequest,
              ai.chalk.protos.chalk.server.v1.CreatePromptEvaluationRunResponse>(
                service, METHODID_CREATE_PROMPT_EVALUATION_RUN)))
        .build();
  }

  private static abstract class PromptServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PromptServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.PromptProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PromptService");
    }
  }

  private static final class PromptServiceFileDescriptorSupplier
      extends PromptServiceBaseDescriptorSupplier {
    PromptServiceFileDescriptorSupplier() {}
  }

  private static final class PromptServiceMethodDescriptorSupplier
      extends PromptServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PromptServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PromptServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PromptServiceFileDescriptorSupplier())
              .addMethod(getListNamedPromptsMethod())
              .addMethod(getGetNamedPromptMethod())
              .addMethod(getCreateNamedPromptMethod())
              .addMethod(getUpdateNamedPromptMethod())
              .addMethod(getListPromptVariantsMethod())
              .addMethod(getListPromptEvaluationRunsMethod())
              .addMethod(getGetPromptEvaluationRunMethod())
              .addMethod(getCreatePromptEvaluationRunMethod())
              .build();
        }
      }
    }
    return result;
  }
}
