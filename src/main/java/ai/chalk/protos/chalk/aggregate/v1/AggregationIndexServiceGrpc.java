package ai.chalk.protos.chalk.aggregate.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/aggregate/v1/aggregation_index.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AggregationIndexServiceGrpc {

  private AggregationIndexServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.aggregate.v1.AggregationIndexService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexRequest,
      ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexResponse> getGetDeploymentAggregationIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeploymentAggregationIndex",
      requestType = ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexRequest.class,
      responseType = ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexRequest,
      ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexResponse> getGetDeploymentAggregationIndexMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexRequest, ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexResponse> getGetDeploymentAggregationIndexMethod;
    if ((getGetDeploymentAggregationIndexMethod = AggregationIndexServiceGrpc.getGetDeploymentAggregationIndexMethod) == null) {
      synchronized (AggregationIndexServiceGrpc.class) {
        if ((getGetDeploymentAggregationIndexMethod = AggregationIndexServiceGrpc.getGetDeploymentAggregationIndexMethod) == null) {
          AggregationIndexServiceGrpc.getGetDeploymentAggregationIndexMethod = getGetDeploymentAggregationIndexMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexRequest, ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDeploymentAggregationIndex"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AggregationIndexServiceMethodDescriptorSupplier("GetDeploymentAggregationIndex"))
              .build();
        }
      }
    }
    return getGetDeploymentAggregationIndexMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AggregationIndexServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AggregationIndexServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AggregationIndexServiceStub>() {
        @java.lang.Override
        public AggregationIndexServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AggregationIndexServiceStub(channel, callOptions);
        }
      };
    return AggregationIndexServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AggregationIndexServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AggregationIndexServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AggregationIndexServiceBlockingStub>() {
        @java.lang.Override
        public AggregationIndexServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AggregationIndexServiceBlockingStub(channel, callOptions);
        }
      };
    return AggregationIndexServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AggregationIndexServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AggregationIndexServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AggregationIndexServiceFutureStub>() {
        @java.lang.Override
        public AggregationIndexServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AggregationIndexServiceFutureStub(channel, callOptions);
        }
      };
    return AggregationIndexServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getDeploymentAggregationIndex(ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeploymentAggregationIndexMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AggregationIndexService.
   */
  public static abstract class AggregationIndexServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AggregationIndexServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AggregationIndexService.
   */
  public static final class AggregationIndexServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AggregationIndexServiceStub> {
    private AggregationIndexServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AggregationIndexServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AggregationIndexServiceStub(channel, callOptions);
    }

    /**
     */
    public void getDeploymentAggregationIndex(ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeploymentAggregationIndexMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AggregationIndexService.
   */
  public static final class AggregationIndexServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AggregationIndexServiceBlockingStub> {
    private AggregationIndexServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AggregationIndexServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AggregationIndexServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexResponse getDeploymentAggregationIndex(ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeploymentAggregationIndexMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AggregationIndexService.
   */
  public static final class AggregationIndexServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AggregationIndexServiceFutureStub> {
    private AggregationIndexServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AggregationIndexServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AggregationIndexServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexResponse> getDeploymentAggregationIndex(
        ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeploymentAggregationIndexMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DEPLOYMENT_AGGREGATION_INDEX = 0;

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
        case METHODID_GET_DEPLOYMENT_AGGREGATION_INDEX:
          serviceImpl.getDeploymentAggregationIndex((ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexResponse>) responseObserver);
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
          getGetDeploymentAggregationIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexRequest,
              ai.chalk.protos.chalk.aggregate.v1.GetDeploymentAggregationIndexResponse>(
                service, METHODID_GET_DEPLOYMENT_AGGREGATION_INDEX)))
        .build();
  }

  private static abstract class AggregationIndexServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AggregationIndexServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.aggregate.v1.AggregationIndexProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AggregationIndexService");
    }
  }

  private static final class AggregationIndexServiceFileDescriptorSupplier
      extends AggregationIndexServiceBaseDescriptorSupplier {
    AggregationIndexServiceFileDescriptorSupplier() {}
  }

  private static final class AggregationIndexServiceMethodDescriptorSupplier
      extends AggregationIndexServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AggregationIndexServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AggregationIndexServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AggregationIndexServiceFileDescriptorSupplier())
              .addMethod(getGetDeploymentAggregationIndexMethod())
              .build();
        }
      }
    }
    return result;
  }
}
