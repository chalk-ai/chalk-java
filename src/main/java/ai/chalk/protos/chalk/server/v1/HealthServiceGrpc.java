package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/status.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HealthServiceGrpc {

  private HealthServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.HealthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CheckHealthRequest,
      ai.chalk.protos.chalk.server.v1.CheckHealthResponse> getCheckHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckHealth",
      requestType = ai.chalk.protos.chalk.server.v1.CheckHealthRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.CheckHealthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CheckHealthRequest,
      ai.chalk.protos.chalk.server.v1.CheckHealthResponse> getCheckHealthMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CheckHealthRequest, ai.chalk.protos.chalk.server.v1.CheckHealthResponse> getCheckHealthMethod;
    if ((getCheckHealthMethod = HealthServiceGrpc.getCheckHealthMethod) == null) {
      synchronized (HealthServiceGrpc.class) {
        if ((getCheckHealthMethod = HealthServiceGrpc.getCheckHealthMethod) == null) {
          HealthServiceGrpc.getCheckHealthMethod = getCheckHealthMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.CheckHealthRequest, ai.chalk.protos.chalk.server.v1.CheckHealthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckHealth"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CheckHealthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CheckHealthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HealthServiceMethodDescriptorSupplier("CheckHealth"))
              .build();
        }
      }
    }
    return getCheckHealthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetHealthRequest,
      ai.chalk.protos.chalk.server.v1.GetHealthResponse> getGetHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHealth",
      requestType = ai.chalk.protos.chalk.server.v1.GetHealthRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetHealthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetHealthRequest,
      ai.chalk.protos.chalk.server.v1.GetHealthResponse> getGetHealthMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetHealthRequest, ai.chalk.protos.chalk.server.v1.GetHealthResponse> getGetHealthMethod;
    if ((getGetHealthMethod = HealthServiceGrpc.getGetHealthMethod) == null) {
      synchronized (HealthServiceGrpc.class) {
        if ((getGetHealthMethod = HealthServiceGrpc.getGetHealthMethod) == null) {
          HealthServiceGrpc.getGetHealthMethod = getGetHealthMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetHealthRequest, ai.chalk.protos.chalk.server.v1.GetHealthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHealth"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetHealthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetHealthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HealthServiceMethodDescriptorSupplier("GetHealth"))
              .build();
        }
      }
    }
    return getGetHealthMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HealthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthServiceStub>() {
        @java.lang.Override
        public HealthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthServiceStub(channel, callOptions);
        }
      };
    return HealthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HealthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthServiceBlockingStub>() {
        @java.lang.Override
        public HealthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthServiceBlockingStub(channel, callOptions);
        }
      };
    return HealthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HealthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthServiceFutureStub>() {
        @java.lang.Override
        public HealthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthServiceFutureStub(channel, callOptions);
        }
      };
    return HealthServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * If any checks fail, this request fails.
     * </pre>
     */
    default void checkHealth(ai.chalk.protos.chalk.server.v1.CheckHealthRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CheckHealthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckHealthMethod(), responseObserver);
    }

    /**
     * <pre>
     * Return the actual health check values.
     * </pre>
     */
    default void getHealth(ai.chalk.protos.chalk.server.v1.GetHealthRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetHealthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHealthMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HealthService.
   */
  public static abstract class HealthServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HealthServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HealthService.
   */
  public static final class HealthServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HealthServiceStub> {
    private HealthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * If any checks fail, this request fails.
     * </pre>
     */
    public void checkHealth(ai.chalk.protos.chalk.server.v1.CheckHealthRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CheckHealthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckHealthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return the actual health check values.
     * </pre>
     */
    public void getHealth(ai.chalk.protos.chalk.server.v1.GetHealthRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetHealthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHealthMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HealthService.
   */
  public static final class HealthServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HealthServiceBlockingStub> {
    private HealthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * If any checks fail, this request fails.
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.CheckHealthResponse checkHealth(ai.chalk.protos.chalk.server.v1.CheckHealthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckHealthMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return the actual health check values.
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.GetHealthResponse getHealth(ai.chalk.protos.chalk.server.v1.GetHealthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHealthMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HealthService.
   */
  public static final class HealthServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HealthServiceFutureStub> {
    private HealthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * If any checks fail, this request fails.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.CheckHealthResponse> checkHealth(
        ai.chalk.protos.chalk.server.v1.CheckHealthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckHealthMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return the actual health check values.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetHealthResponse> getHealth(
        ai.chalk.protos.chalk.server.v1.GetHealthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHealthMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_HEALTH = 0;
  private static final int METHODID_GET_HEALTH = 1;

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
        case METHODID_CHECK_HEALTH:
          serviceImpl.checkHealth((ai.chalk.protos.chalk.server.v1.CheckHealthRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CheckHealthResponse>) responseObserver);
          break;
        case METHODID_GET_HEALTH:
          serviceImpl.getHealth((ai.chalk.protos.chalk.server.v1.GetHealthRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetHealthResponse>) responseObserver);
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
          getCheckHealthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.CheckHealthRequest,
              ai.chalk.protos.chalk.server.v1.CheckHealthResponse>(
                service, METHODID_CHECK_HEALTH)))
        .addMethod(
          getGetHealthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetHealthRequest,
              ai.chalk.protos.chalk.server.v1.GetHealthResponse>(
                service, METHODID_GET_HEALTH)))
        .build();
  }

  private static abstract class HealthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HealthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.StatusProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HealthService");
    }
  }

  private static final class HealthServiceFileDescriptorSupplier
      extends HealthServiceBaseDescriptorSupplier {
    HealthServiceFileDescriptorSupplier() {}
  }

  private static final class HealthServiceMethodDescriptorSupplier
      extends HealthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HealthServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HealthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HealthServiceFileDescriptorSupplier())
              .addMethod(getCheckHealthMethod())
              .addMethod(getGetHealthMethod())
              .build();
        }
      }
    }
    return result;
  }
}
