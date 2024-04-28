package ai.chalk.protos.chalk.engine.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: chalk/engine/v1/plan_server.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PlanServiceGrpc {

  private PlanServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.engine.v1.PlanService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.engine.v1.GetPlanRequest,
      ai.chalk.protos.chalk.engine.v1.GetPlanResponse> getGetPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlan",
      requestType = ai.chalk.protos.chalk.engine.v1.GetPlanRequest.class,
      responseType = ai.chalk.protos.chalk.engine.v1.GetPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.engine.v1.GetPlanRequest,
      ai.chalk.protos.chalk.engine.v1.GetPlanResponse> getGetPlanMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.engine.v1.GetPlanRequest, ai.chalk.protos.chalk.engine.v1.GetPlanResponse> getGetPlanMethod;
    if ((getGetPlanMethod = PlanServiceGrpc.getGetPlanMethod) == null) {
      synchronized (PlanServiceGrpc.class) {
        if ((getGetPlanMethod = PlanServiceGrpc.getGetPlanMethod) == null) {
          PlanServiceGrpc.getGetPlanMethod = getGetPlanMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.engine.v1.GetPlanRequest, ai.chalk.protos.chalk.engine.v1.GetPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.engine.v1.GetPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.engine.v1.GetPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlanServiceMethodDescriptorSupplier("GetPlan"))
              .build();
        }
      }
    }
    return getGetPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.engine.v1.ExecuteQueryRequest,
      ai.chalk.protos.chalk.engine.v1.ExecuteQueryResponse> getExecuteQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteQuery",
      requestType = ai.chalk.protos.chalk.engine.v1.ExecuteQueryRequest.class,
      responseType = ai.chalk.protos.chalk.engine.v1.ExecuteQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.engine.v1.ExecuteQueryRequest,
      ai.chalk.protos.chalk.engine.v1.ExecuteQueryResponse> getExecuteQueryMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.engine.v1.ExecuteQueryRequest, ai.chalk.protos.chalk.engine.v1.ExecuteQueryResponse> getExecuteQueryMethod;
    if ((getExecuteQueryMethod = PlanServiceGrpc.getExecuteQueryMethod) == null) {
      synchronized (PlanServiceGrpc.class) {
        if ((getExecuteQueryMethod = PlanServiceGrpc.getExecuteQueryMethod) == null) {
          PlanServiceGrpc.getExecuteQueryMethod = getExecuteQueryMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.engine.v1.ExecuteQueryRequest, ai.chalk.protos.chalk.engine.v1.ExecuteQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.engine.v1.ExecuteQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.engine.v1.ExecuteQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlanServiceMethodDescriptorSupplier("ExecuteQuery"))
              .build();
        }
      }
    }
    return getExecuteQueryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlanServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlanServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlanServiceStub>() {
        @java.lang.Override
        public PlanServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlanServiceStub(channel, callOptions);
        }
      };
    return PlanServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlanServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlanServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlanServiceBlockingStub>() {
        @java.lang.Override
        public PlanServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlanServiceBlockingStub(channel, callOptions);
        }
      };
    return PlanServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlanServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlanServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlanServiceFutureStub>() {
        @java.lang.Override
        public PlanServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlanServiceFutureStub(channel, callOptions);
        }
      };
    return PlanServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getPlan(ai.chalk.protos.chalk.engine.v1.GetPlanRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.engine.v1.GetPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fall-back for executing queries on the python engine
     * </pre>
     */
    default void executeQuery(ai.chalk.protos.chalk.engine.v1.ExecuteQueryRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.engine.v1.ExecuteQueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteQueryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PlanService.
   */
  public static abstract class PlanServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PlanServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PlanService.
   */
  public static final class PlanServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PlanServiceStub> {
    private PlanServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlanServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlanServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPlan(ai.chalk.protos.chalk.engine.v1.GetPlanRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.engine.v1.GetPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fall-back for executing queries on the python engine
     * </pre>
     */
    public void executeQuery(ai.chalk.protos.chalk.engine.v1.ExecuteQueryRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.engine.v1.ExecuteQueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteQueryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PlanService.
   */
  public static final class PlanServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PlanServiceBlockingStub> {
    private PlanServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlanServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlanServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.engine.v1.GetPlanResponse getPlan(ai.chalk.protos.chalk.engine.v1.GetPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fall-back for executing queries on the python engine
     * </pre>
     */
    public ai.chalk.protos.chalk.engine.v1.ExecuteQueryResponse executeQuery(ai.chalk.protos.chalk.engine.v1.ExecuteQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteQueryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PlanService.
   */
  public static final class PlanServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PlanServiceFutureStub> {
    private PlanServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlanServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlanServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.engine.v1.GetPlanResponse> getPlan(
        ai.chalk.protos.chalk.engine.v1.GetPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fall-back for executing queries on the python engine
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.engine.v1.ExecuteQueryResponse> executeQuery(
        ai.chalk.protos.chalk.engine.v1.ExecuteQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteQueryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PLAN = 0;
  private static final int METHODID_EXECUTE_QUERY = 1;

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
        case METHODID_GET_PLAN:
          serviceImpl.getPlan((ai.chalk.protos.chalk.engine.v1.GetPlanRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.engine.v1.GetPlanResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_QUERY:
          serviceImpl.executeQuery((ai.chalk.protos.chalk.engine.v1.ExecuteQueryRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.engine.v1.ExecuteQueryResponse>) responseObserver);
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
          getGetPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.engine.v1.GetPlanRequest,
              ai.chalk.protos.chalk.engine.v1.GetPlanResponse>(
                service, METHODID_GET_PLAN)))
        .addMethod(
          getExecuteQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.engine.v1.ExecuteQueryRequest,
              ai.chalk.protos.chalk.engine.v1.ExecuteQueryResponse>(
                service, METHODID_EXECUTE_QUERY)))
        .build();
  }

  private static abstract class PlanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlanServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.engine.v1.PlanServerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PlanService");
    }
  }

  private static final class PlanServiceFileDescriptorSupplier
      extends PlanServiceBaseDescriptorSupplier {
    PlanServiceFileDescriptorSupplier() {}
  }

  private static final class PlanServiceMethodDescriptorSupplier
      extends PlanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PlanServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PlanServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlanServiceFileDescriptorSupplier())
              .addMethod(getGetPlanMethod())
              .addMethod(getExecuteQueryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
