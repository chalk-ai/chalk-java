package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/builder.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClusterBuilderServiceGrpc {

  private ClusterBuilderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.ClusterBuilderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsRequest,
      ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsResponse> getCreateKafkaTopicsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateKafkaTopics",
      requestType = ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsRequest,
      ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsResponse> getCreateKafkaTopicsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsRequest, ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsResponse> getCreateKafkaTopicsMethod;
    if ((getCreateKafkaTopicsMethod = ClusterBuilderServiceGrpc.getCreateKafkaTopicsMethod) == null) {
      synchronized (ClusterBuilderServiceGrpc.class) {
        if ((getCreateKafkaTopicsMethod = ClusterBuilderServiceGrpc.getCreateKafkaTopicsMethod) == null) {
          ClusterBuilderServiceGrpc.getCreateKafkaTopicsMethod = getCreateKafkaTopicsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsRequest, ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateKafkaTopics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterBuilderServiceMethodDescriptorSupplier("CreateKafkaTopics"))
              .build();
        }
      }
    }
    return getCreateKafkaTopicsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetKafkaTopicsRequest,
      ai.chalk.protos.chalk.server.v1.GetKafkaTopicsResponse> getGetKafkaTopicsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKafkaTopics",
      requestType = ai.chalk.protos.chalk.server.v1.GetKafkaTopicsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetKafkaTopicsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetKafkaTopicsRequest,
      ai.chalk.protos.chalk.server.v1.GetKafkaTopicsResponse> getGetKafkaTopicsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetKafkaTopicsRequest, ai.chalk.protos.chalk.server.v1.GetKafkaTopicsResponse> getGetKafkaTopicsMethod;
    if ((getGetKafkaTopicsMethod = ClusterBuilderServiceGrpc.getGetKafkaTopicsMethod) == null) {
      synchronized (ClusterBuilderServiceGrpc.class) {
        if ((getGetKafkaTopicsMethod = ClusterBuilderServiceGrpc.getGetKafkaTopicsMethod) == null) {
          ClusterBuilderServiceGrpc.getGetKafkaTopicsMethod = getGetKafkaTopicsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetKafkaTopicsRequest, ai.chalk.protos.chalk.server.v1.GetKafkaTopicsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKafkaTopics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetKafkaTopicsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetKafkaTopicsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterBuilderServiceMethodDescriptorSupplier("GetKafkaTopics"))
              .build();
        }
      }
    }
    return getGetKafkaTopicsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClusterBuilderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterBuilderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterBuilderServiceStub>() {
        @java.lang.Override
        public ClusterBuilderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterBuilderServiceStub(channel, callOptions);
        }
      };
    return ClusterBuilderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClusterBuilderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterBuilderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterBuilderServiceBlockingStub>() {
        @java.lang.Override
        public ClusterBuilderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterBuilderServiceBlockingStub(channel, callOptions);
        }
      };
    return ClusterBuilderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClusterBuilderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterBuilderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterBuilderServiceFutureStub>() {
        @java.lang.Override
        public ClusterBuilderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterBuilderServiceFutureStub(channel, callOptions);
        }
      };
    return ClusterBuilderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createKafkaTopics(ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateKafkaTopicsMethod(), responseObserver);
    }

    /**
     */
    default void getKafkaTopics(ai.chalk.protos.chalk.server.v1.GetKafkaTopicsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetKafkaTopicsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetKafkaTopicsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClusterBuilderService.
   */
  public static abstract class ClusterBuilderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClusterBuilderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClusterBuilderService.
   */
  public static final class ClusterBuilderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ClusterBuilderServiceStub> {
    private ClusterBuilderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterBuilderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterBuilderServiceStub(channel, callOptions);
    }

    /**
     */
    public void createKafkaTopics(ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateKafkaTopicsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getKafkaTopics(ai.chalk.protos.chalk.server.v1.GetKafkaTopicsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetKafkaTopicsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetKafkaTopicsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClusterBuilderService.
   */
  public static final class ClusterBuilderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClusterBuilderServiceBlockingStub> {
    private ClusterBuilderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterBuilderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterBuilderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsResponse createKafkaTopics(ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateKafkaTopicsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetKafkaTopicsResponse getKafkaTopics(ai.chalk.protos.chalk.server.v1.GetKafkaTopicsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetKafkaTopicsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClusterBuilderService.
   */
  public static final class ClusterBuilderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClusterBuilderServiceFutureStub> {
    private ClusterBuilderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterBuilderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterBuilderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsResponse> createKafkaTopics(
        ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateKafkaTopicsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetKafkaTopicsResponse> getKafkaTopics(
        ai.chalk.protos.chalk.server.v1.GetKafkaTopicsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetKafkaTopicsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_KAFKA_TOPICS = 0;
  private static final int METHODID_GET_KAFKA_TOPICS = 1;

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
        case METHODID_CREATE_KAFKA_TOPICS:
          serviceImpl.createKafkaTopics((ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsResponse>) responseObserver);
          break;
        case METHODID_GET_KAFKA_TOPICS:
          serviceImpl.getKafkaTopics((ai.chalk.protos.chalk.server.v1.GetKafkaTopicsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetKafkaTopicsResponse>) responseObserver);
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
          getCreateKafkaTopicsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsRequest,
              ai.chalk.protos.chalk.server.v1.CreateKafkaTopicsResponse>(
                service, METHODID_CREATE_KAFKA_TOPICS)))
        .addMethod(
          getGetKafkaTopicsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetKafkaTopicsRequest,
              ai.chalk.protos.chalk.server.v1.GetKafkaTopicsResponse>(
                service, METHODID_GET_KAFKA_TOPICS)))
        .build();
  }

  private static abstract class ClusterBuilderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClusterBuilderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.BuilderProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClusterBuilderService");
    }
  }

  private static final class ClusterBuilderServiceFileDescriptorSupplier
      extends ClusterBuilderServiceBaseDescriptorSupplier {
    ClusterBuilderServiceFileDescriptorSupplier() {}
  }

  private static final class ClusterBuilderServiceMethodDescriptorSupplier
      extends ClusterBuilderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ClusterBuilderServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ClusterBuilderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClusterBuilderServiceFileDescriptorSupplier())
              .addMethod(getCreateKafkaTopicsMethod())
              .addMethod(getGetKafkaTopicsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
