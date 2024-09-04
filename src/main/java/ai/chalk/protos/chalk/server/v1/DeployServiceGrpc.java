package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/deploy.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DeployServiceGrpc {

  private DeployServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.DeployService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeployBranchRequest,
      ai.chalk.protos.chalk.server.v1.DeployBranchResponse> getDeployBranchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeployBranch",
      requestType = ai.chalk.protos.chalk.server.v1.DeployBranchRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.DeployBranchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeployBranchRequest,
      ai.chalk.protos.chalk.server.v1.DeployBranchResponse> getDeployBranchMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeployBranchRequest, ai.chalk.protos.chalk.server.v1.DeployBranchResponse> getDeployBranchMethod;
    if ((getDeployBranchMethod = DeployServiceGrpc.getDeployBranchMethod) == null) {
      synchronized (DeployServiceGrpc.class) {
        if ((getDeployBranchMethod = DeployServiceGrpc.getDeployBranchMethod) == null) {
          DeployServiceGrpc.getDeployBranchMethod = getDeployBranchMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.DeployBranchRequest, ai.chalk.protos.chalk.server.v1.DeployBranchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeployBranch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.DeployBranchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.DeployBranchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeployServiceMethodDescriptorSupplier("DeployBranch"))
              .build();
        }
      }
    }
    return getDeployBranchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.GetDeploymentResponse> getGetDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeployment",
      requestType = ai.chalk.protos.chalk.server.v1.GetDeploymentRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetDeploymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.GetDeploymentResponse> getGetDeploymentMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDeploymentRequest, ai.chalk.protos.chalk.server.v1.GetDeploymentResponse> getGetDeploymentMethod;
    if ((getGetDeploymentMethod = DeployServiceGrpc.getGetDeploymentMethod) == null) {
      synchronized (DeployServiceGrpc.class) {
        if ((getGetDeploymentMethod = DeployServiceGrpc.getGetDeploymentMethod) == null) {
          DeployServiceGrpc.getGetDeploymentMethod = getGetDeploymentMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetDeploymentRequest, ai.chalk.protos.chalk.server.v1.GetDeploymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDeployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetDeploymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeployServiceMethodDescriptorSupplier("GetDeployment"))
              .build();
        }
      }
    }
    return getGetDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListDeploymentsRequest,
      ai.chalk.protos.chalk.server.v1.ListDeploymentsResponse> getListDeploymentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDeployments",
      requestType = ai.chalk.protos.chalk.server.v1.ListDeploymentsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.ListDeploymentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListDeploymentsRequest,
      ai.chalk.protos.chalk.server.v1.ListDeploymentsResponse> getListDeploymentsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListDeploymentsRequest, ai.chalk.protos.chalk.server.v1.ListDeploymentsResponse> getListDeploymentsMethod;
    if ((getListDeploymentsMethod = DeployServiceGrpc.getListDeploymentsMethod) == null) {
      synchronized (DeployServiceGrpc.class) {
        if ((getListDeploymentsMethod = DeployServiceGrpc.getListDeploymentsMethod) == null) {
          DeployServiceGrpc.getListDeploymentsMethod = getListDeploymentsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.ListDeploymentsRequest, ai.chalk.protos.chalk.server.v1.ListDeploymentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDeployments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListDeploymentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListDeploymentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeployServiceMethodDescriptorSupplier("ListDeployments"))
              .build();
        }
      }
    }
    return getListDeploymentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.SuspendDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.SuspendDeploymentResponse> getSuspendDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuspendDeployment",
      requestType = ai.chalk.protos.chalk.server.v1.SuspendDeploymentRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.SuspendDeploymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.SuspendDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.SuspendDeploymentResponse> getSuspendDeploymentMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.SuspendDeploymentRequest, ai.chalk.protos.chalk.server.v1.SuspendDeploymentResponse> getSuspendDeploymentMethod;
    if ((getSuspendDeploymentMethod = DeployServiceGrpc.getSuspendDeploymentMethod) == null) {
      synchronized (DeployServiceGrpc.class) {
        if ((getSuspendDeploymentMethod = DeployServiceGrpc.getSuspendDeploymentMethod) == null) {
          DeployServiceGrpc.getSuspendDeploymentMethod = getSuspendDeploymentMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.SuspendDeploymentRequest, ai.chalk.protos.chalk.server.v1.SuspendDeploymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuspendDeployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.SuspendDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.SuspendDeploymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeployServiceMethodDescriptorSupplier("SuspendDeployment"))
              .build();
        }
      }
    }
    return getSuspendDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ScaleDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.ScaleDeploymentResponse> getScaleDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScaleDeployment",
      requestType = ai.chalk.protos.chalk.server.v1.ScaleDeploymentRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.ScaleDeploymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ScaleDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.ScaleDeploymentResponse> getScaleDeploymentMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ScaleDeploymentRequest, ai.chalk.protos.chalk.server.v1.ScaleDeploymentResponse> getScaleDeploymentMethod;
    if ((getScaleDeploymentMethod = DeployServiceGrpc.getScaleDeploymentMethod) == null) {
      synchronized (DeployServiceGrpc.class) {
        if ((getScaleDeploymentMethod = DeployServiceGrpc.getScaleDeploymentMethod) == null) {
          DeployServiceGrpc.getScaleDeploymentMethod = getScaleDeploymentMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.ScaleDeploymentRequest, ai.chalk.protos.chalk.server.v1.ScaleDeploymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScaleDeployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ScaleDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ScaleDeploymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeployServiceMethodDescriptorSupplier("ScaleDeployment"))
              .build();
        }
      }
    }
    return getScaleDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.TagDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.TagDeploymentResponse> getTagDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TagDeployment",
      requestType = ai.chalk.protos.chalk.server.v1.TagDeploymentRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.TagDeploymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.TagDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.TagDeploymentResponse> getTagDeploymentMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.TagDeploymentRequest, ai.chalk.protos.chalk.server.v1.TagDeploymentResponse> getTagDeploymentMethod;
    if ((getTagDeploymentMethod = DeployServiceGrpc.getTagDeploymentMethod) == null) {
      synchronized (DeployServiceGrpc.class) {
        if ((getTagDeploymentMethod = DeployServiceGrpc.getTagDeploymentMethod) == null) {
          DeployServiceGrpc.getTagDeploymentMethod = getTagDeploymentMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.TagDeploymentRequest, ai.chalk.protos.chalk.server.v1.TagDeploymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TagDeployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.TagDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.TagDeploymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeployServiceMethodDescriptorSupplier("TagDeployment"))
              .build();
        }
      }
    }
    return getTagDeploymentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeployServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeployServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeployServiceStub>() {
        @java.lang.Override
        public DeployServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeployServiceStub(channel, callOptions);
        }
      };
    return DeployServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeployServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeployServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeployServiceBlockingStub>() {
        @java.lang.Override
        public DeployServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeployServiceBlockingStub(channel, callOptions);
        }
      };
    return DeployServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeployServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeployServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeployServiceFutureStub>() {
        @java.lang.Override
        public DeployServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeployServiceFutureStub(channel, callOptions);
        }
      };
    return DeployServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void deployBranch(ai.chalk.protos.chalk.server.v1.DeployBranchRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeployBranchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeployBranchMethod(), responseObserver);
    }

    /**
     */
    default void getDeployment(ai.chalk.protos.chalk.server.v1.GetDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDeploymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeploymentMethod(), responseObserver);
    }

    /**
     */
    default void listDeployments(ai.chalk.protos.chalk.server.v1.ListDeploymentsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListDeploymentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDeploymentsMethod(), responseObserver);
    }

    /**
     */
    default void suspendDeployment(ai.chalk.protos.chalk.server.v1.SuspendDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.SuspendDeploymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuspendDeploymentMethod(), responseObserver);
    }

    /**
     */
    default void scaleDeployment(ai.chalk.protos.chalk.server.v1.ScaleDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ScaleDeploymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScaleDeploymentMethod(), responseObserver);
    }

    /**
     */
    default void tagDeployment(ai.chalk.protos.chalk.server.v1.TagDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.TagDeploymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTagDeploymentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DeployService.
   */
  public static abstract class DeployServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DeployServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DeployService.
   */
  public static final class DeployServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DeployServiceStub> {
    private DeployServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeployServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeployServiceStub(channel, callOptions);
    }

    /**
     */
    public void deployBranch(ai.chalk.protos.chalk.server.v1.DeployBranchRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeployBranchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeployBranchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDeployment(ai.chalk.protos.chalk.server.v1.GetDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDeploymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeploymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDeployments(ai.chalk.protos.chalk.server.v1.ListDeploymentsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListDeploymentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDeploymentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void suspendDeployment(ai.chalk.protos.chalk.server.v1.SuspendDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.SuspendDeploymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuspendDeploymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scaleDeployment(ai.chalk.protos.chalk.server.v1.ScaleDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ScaleDeploymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScaleDeploymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tagDeployment(ai.chalk.protos.chalk.server.v1.TagDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.TagDeploymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTagDeploymentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DeployService.
   */
  public static final class DeployServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DeployServiceBlockingStub> {
    private DeployServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeployServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeployServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.DeployBranchResponse deployBranch(ai.chalk.protos.chalk.server.v1.DeployBranchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeployBranchMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetDeploymentResponse getDeployment(ai.chalk.protos.chalk.server.v1.GetDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeploymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.ListDeploymentsResponse listDeployments(ai.chalk.protos.chalk.server.v1.ListDeploymentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDeploymentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.SuspendDeploymentResponse suspendDeployment(ai.chalk.protos.chalk.server.v1.SuspendDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuspendDeploymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.ScaleDeploymentResponse scaleDeployment(ai.chalk.protos.chalk.server.v1.ScaleDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScaleDeploymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.TagDeploymentResponse tagDeployment(ai.chalk.protos.chalk.server.v1.TagDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTagDeploymentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DeployService.
   */
  public static final class DeployServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DeployServiceFutureStub> {
    private DeployServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeployServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeployServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.DeployBranchResponse> deployBranch(
        ai.chalk.protos.chalk.server.v1.DeployBranchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeployBranchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetDeploymentResponse> getDeployment(
        ai.chalk.protos.chalk.server.v1.GetDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeploymentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.ListDeploymentsResponse> listDeployments(
        ai.chalk.protos.chalk.server.v1.ListDeploymentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDeploymentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.SuspendDeploymentResponse> suspendDeployment(
        ai.chalk.protos.chalk.server.v1.SuspendDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuspendDeploymentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.ScaleDeploymentResponse> scaleDeployment(
        ai.chalk.protos.chalk.server.v1.ScaleDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScaleDeploymentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.TagDeploymentResponse> tagDeployment(
        ai.chalk.protos.chalk.server.v1.TagDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTagDeploymentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEPLOY_BRANCH = 0;
  private static final int METHODID_GET_DEPLOYMENT = 1;
  private static final int METHODID_LIST_DEPLOYMENTS = 2;
  private static final int METHODID_SUSPEND_DEPLOYMENT = 3;
  private static final int METHODID_SCALE_DEPLOYMENT = 4;
  private static final int METHODID_TAG_DEPLOYMENT = 5;

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
        case METHODID_DEPLOY_BRANCH:
          serviceImpl.deployBranch((ai.chalk.protos.chalk.server.v1.DeployBranchRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeployBranchResponse>) responseObserver);
          break;
        case METHODID_GET_DEPLOYMENT:
          serviceImpl.getDeployment((ai.chalk.protos.chalk.server.v1.GetDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDeploymentResponse>) responseObserver);
          break;
        case METHODID_LIST_DEPLOYMENTS:
          serviceImpl.listDeployments((ai.chalk.protos.chalk.server.v1.ListDeploymentsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListDeploymentsResponse>) responseObserver);
          break;
        case METHODID_SUSPEND_DEPLOYMENT:
          serviceImpl.suspendDeployment((ai.chalk.protos.chalk.server.v1.SuspendDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.SuspendDeploymentResponse>) responseObserver);
          break;
        case METHODID_SCALE_DEPLOYMENT:
          serviceImpl.scaleDeployment((ai.chalk.protos.chalk.server.v1.ScaleDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ScaleDeploymentResponse>) responseObserver);
          break;
        case METHODID_TAG_DEPLOYMENT:
          serviceImpl.tagDeployment((ai.chalk.protos.chalk.server.v1.TagDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.TagDeploymentResponse>) responseObserver);
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
          getDeployBranchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.DeployBranchRequest,
              ai.chalk.protos.chalk.server.v1.DeployBranchResponse>(
                service, METHODID_DEPLOY_BRANCH)))
        .addMethod(
          getGetDeploymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetDeploymentRequest,
              ai.chalk.protos.chalk.server.v1.GetDeploymentResponse>(
                service, METHODID_GET_DEPLOYMENT)))
        .addMethod(
          getListDeploymentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.ListDeploymentsRequest,
              ai.chalk.protos.chalk.server.v1.ListDeploymentsResponse>(
                service, METHODID_LIST_DEPLOYMENTS)))
        .addMethod(
          getSuspendDeploymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.SuspendDeploymentRequest,
              ai.chalk.protos.chalk.server.v1.SuspendDeploymentResponse>(
                service, METHODID_SUSPEND_DEPLOYMENT)))
        .addMethod(
          getScaleDeploymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.ScaleDeploymentRequest,
              ai.chalk.protos.chalk.server.v1.ScaleDeploymentResponse>(
                service, METHODID_SCALE_DEPLOYMENT)))
        .addMethod(
          getTagDeploymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.TagDeploymentRequest,
              ai.chalk.protos.chalk.server.v1.TagDeploymentResponse>(
                service, METHODID_TAG_DEPLOYMENT)))
        .build();
  }

  private static abstract class DeployServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeployServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.DeployProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeployService");
    }
  }

  private static final class DeployServiceFileDescriptorSupplier
      extends DeployServiceBaseDescriptorSupplier {
    DeployServiceFileDescriptorSupplier() {}
  }

  private static final class DeployServiceMethodDescriptorSupplier
      extends DeployServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DeployServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DeployServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeployServiceFileDescriptorSupplier())
              .addMethod(getDeployBranchMethod())
              .addMethod(getGetDeploymentMethod())
              .addMethod(getListDeploymentsMethod())
              .addMethod(getSuspendDeploymentMethod())
              .addMethod(getScaleDeploymentMethod())
              .addMethod(getTagDeploymentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
