package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/builder.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BuilderServiceGrpc {

  private BuilderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.BuilderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse> getActivateDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateDeployment",
      requestType = ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse> getActivateDeploymentMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest, ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse> getActivateDeploymentMethod;
    if ((getActivateDeploymentMethod = BuilderServiceGrpc.getActivateDeploymentMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getActivateDeploymentMethod = BuilderServiceGrpc.getActivateDeploymentMethod) == null) {
          BuilderServiceGrpc.getActivateDeploymentMethod = getActivateDeploymentMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest, ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActivateDeployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("ActivateDeployment"))
              .build();
        }
      }
    }
    return getActivateDeploymentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BuilderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BuilderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BuilderServiceStub>() {
        @java.lang.Override
        public BuilderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BuilderServiceStub(channel, callOptions);
        }
      };
    return BuilderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BuilderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BuilderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BuilderServiceBlockingStub>() {
        @java.lang.Override
        public BuilderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BuilderServiceBlockingStub(channel, callOptions);
        }
      };
    return BuilderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BuilderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BuilderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BuilderServiceFutureStub>() {
        @java.lang.Override
        public BuilderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BuilderServiceFutureStub(channel, callOptions);
        }
      };
    return BuilderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Takes an existing (past) deployment and promotes the k8s resources / other things associated with it.
     * Useful for debugging in local development where the auto activation doesn't work b/c no pubsub.
     * </pre>
     */
    default void activateDeployment(ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateDeploymentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BuilderService.
   */
  public static abstract class BuilderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BuilderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BuilderService.
   */
  public static final class BuilderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BuilderServiceStub> {
    private BuilderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuilderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BuilderServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Takes an existing (past) deployment and promotes the k8s resources / other things associated with it.
     * Useful for debugging in local development where the auto activation doesn't work b/c no pubsub.
     * </pre>
     */
    public void activateDeployment(ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateDeploymentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BuilderService.
   */
  public static final class BuilderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BuilderServiceBlockingStub> {
    private BuilderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuilderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BuilderServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Takes an existing (past) deployment and promotes the k8s resources / other things associated with it.
     * Useful for debugging in local development where the auto activation doesn't work b/c no pubsub.
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse activateDeployment(ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateDeploymentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BuilderService.
   */
  public static final class BuilderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BuilderServiceFutureStub> {
    private BuilderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuilderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BuilderServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Takes an existing (past) deployment and promotes the k8s resources / other things associated with it.
     * Useful for debugging in local development where the auto activation doesn't work b/c no pubsub.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse> activateDeployment(
        ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateDeploymentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE_DEPLOYMENT = 0;

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
        case METHODID_ACTIVATE_DEPLOYMENT:
          serviceImpl.activateDeployment((ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse>) responseObserver);
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
          getActivateDeploymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest,
              ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse>(
                service, METHODID_ACTIVATE_DEPLOYMENT)))
        .build();
  }

  private static abstract class BuilderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BuilderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.BuilderProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BuilderService");
    }
  }

  private static final class BuilderServiceFileDescriptorSupplier
      extends BuilderServiceBaseDescriptorSupplier {
    BuilderServiceFileDescriptorSupplier() {}
  }

  private static final class BuilderServiceMethodDescriptorSupplier
      extends BuilderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BuilderServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BuilderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BuilderServiceFileDescriptorSupplier())
              .addMethod(getActivateDeploymentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
