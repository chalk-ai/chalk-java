package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/manager.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ManagerServiceGrpc {

  private ManagerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.ManagerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsRequest,
      ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsResponse> getGetClusterEnvironmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClusterEnvironments",
      requestType = ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsRequest,
      ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsResponse> getGetClusterEnvironmentsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsRequest, ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsResponse> getGetClusterEnvironmentsMethod;
    if ((getGetClusterEnvironmentsMethod = ManagerServiceGrpc.getGetClusterEnvironmentsMethod) == null) {
      synchronized (ManagerServiceGrpc.class) {
        if ((getGetClusterEnvironmentsMethod = ManagerServiceGrpc.getGetClusterEnvironmentsMethod) == null) {
          ManagerServiceGrpc.getGetClusterEnvironmentsMethod = getGetClusterEnvironmentsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsRequest, ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClusterEnvironments"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManagerServiceMethodDescriptorSupplier("GetClusterEnvironments"))
              .build();
        }
      }
    }
    return getGetClusterEnvironmentsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ManagerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagerServiceStub>() {
        @java.lang.Override
        public ManagerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagerServiceStub(channel, callOptions);
        }
      };
    return ManagerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ManagerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagerServiceBlockingStub>() {
        @java.lang.Override
        public ManagerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagerServiceBlockingStub(channel, callOptions);
        }
      };
    return ManagerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ManagerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagerServiceFutureStub>() {
        @java.lang.Override
        public ManagerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagerServiceFutureStub(channel, callOptions);
        }
      };
    return ManagerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * If any checks fail, this request fails.
     * </pre>
     */
    default void getClusterEnvironments(ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClusterEnvironmentsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ManagerService.
   */
  public static abstract class ManagerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ManagerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ManagerService.
   */
  public static final class ManagerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ManagerServiceStub> {
    private ManagerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * If any checks fail, this request fails.
     * </pre>
     */
    public void getClusterEnvironments(ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClusterEnvironmentsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ManagerService.
   */
  public static final class ManagerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ManagerServiceBlockingStub> {
    private ManagerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * If any checks fail, this request fails.
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsResponse getClusterEnvironments(ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClusterEnvironmentsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ManagerService.
   */
  public static final class ManagerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ManagerServiceFutureStub> {
    private ManagerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * If any checks fail, this request fails.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsResponse> getClusterEnvironments(
        ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClusterEnvironmentsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CLUSTER_ENVIRONMENTS = 0;

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
        case METHODID_GET_CLUSTER_ENVIRONMENTS:
          serviceImpl.getClusterEnvironments((ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsResponse>) responseObserver);
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
          getGetClusterEnvironmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsRequest,
              ai.chalk.protos.chalk.server.v1.GetClusterEnvironmentsResponse>(
                service, METHODID_GET_CLUSTER_ENVIRONMENTS)))
        .build();
  }

  private static abstract class ManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ManagerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.ManagerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ManagerService");
    }
  }

  private static final class ManagerServiceFileDescriptorSupplier
      extends ManagerServiceBaseDescriptorSupplier {
    ManagerServiceFileDescriptorSupplier() {}
  }

  private static final class ManagerServiceMethodDescriptorSupplier
      extends ManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ManagerServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ManagerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ManagerServiceFileDescriptorSupplier())
              .addMethod(getGetClusterEnvironmentsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
