package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/scheduled_query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ScheduledQueryServiceGrpc {

  private ScheduledQueryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.ScheduledQueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunRequest,
      ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunResponse> getGetScheduledQueryRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScheduledQueryRun",
      requestType = ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunRequest,
      ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunResponse> getGetScheduledQueryRunMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunRequest, ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunResponse> getGetScheduledQueryRunMethod;
    if ((getGetScheduledQueryRunMethod = ScheduledQueryServiceGrpc.getGetScheduledQueryRunMethod) == null) {
      synchronized (ScheduledQueryServiceGrpc.class) {
        if ((getGetScheduledQueryRunMethod = ScheduledQueryServiceGrpc.getGetScheduledQueryRunMethod) == null) {
          ScheduledQueryServiceGrpc.getGetScheduledQueryRunMethod = getGetScheduledQueryRunMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunRequest, ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetScheduledQueryRun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScheduledQueryServiceMethodDescriptorSupplier("GetScheduledQueryRun"))
              .build();
        }
      }
    }
    return getGetScheduledQueryRunMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScheduledQueryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScheduledQueryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScheduledQueryServiceStub>() {
        @java.lang.Override
        public ScheduledQueryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScheduledQueryServiceStub(channel, callOptions);
        }
      };
    return ScheduledQueryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScheduledQueryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScheduledQueryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScheduledQueryServiceBlockingStub>() {
        @java.lang.Override
        public ScheduledQueryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScheduledQueryServiceBlockingStub(channel, callOptions);
        }
      };
    return ScheduledQueryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScheduledQueryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScheduledQueryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScheduledQueryServiceFutureStub>() {
        @java.lang.Override
        public ScheduledQueryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScheduledQueryServiceFutureStub(channel, callOptions);
        }
      };
    return ScheduledQueryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getScheduledQueryRun(ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetScheduledQueryRunMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ScheduledQueryService.
   */
  public static abstract class ScheduledQueryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ScheduledQueryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ScheduledQueryService.
   */
  public static final class ScheduledQueryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ScheduledQueryServiceStub> {
    private ScheduledQueryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScheduledQueryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScheduledQueryServiceStub(channel, callOptions);
    }

    /**
     */
    public void getScheduledQueryRun(ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetScheduledQueryRunMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ScheduledQueryService.
   */
  public static final class ScheduledQueryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ScheduledQueryServiceBlockingStub> {
    private ScheduledQueryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScheduledQueryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScheduledQueryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunResponse getScheduledQueryRun(ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetScheduledQueryRunMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ScheduledQueryService.
   */
  public static final class ScheduledQueryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ScheduledQueryServiceFutureStub> {
    private ScheduledQueryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScheduledQueryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScheduledQueryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunResponse> getScheduledQueryRun(
        ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetScheduledQueryRunMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SCHEDULED_QUERY_RUN = 0;

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
        case METHODID_GET_SCHEDULED_QUERY_RUN:
          serviceImpl.getScheduledQueryRun((ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunResponse>) responseObserver);
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
          getGetScheduledQueryRunMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunRequest,
              ai.chalk.protos.chalk.server.v1.GetScheduledQueryRunResponse>(
                service, METHODID_GET_SCHEDULED_QUERY_RUN)))
        .build();
  }

  private static abstract class ScheduledQueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ScheduledQueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.ScheduledQueryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ScheduledQueryService");
    }
  }

  private static final class ScheduledQueryServiceFileDescriptorSupplier
      extends ScheduledQueryServiceBaseDescriptorSupplier {
    ScheduledQueryServiceFileDescriptorSupplier() {}
  }

  private static final class ScheduledQueryServiceMethodDescriptorSupplier
      extends ScheduledQueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ScheduledQueryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ScheduledQueryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScheduledQueryServiceFileDescriptorSupplier())
              .addMethod(getGetScheduledQueryRunMethod())
              .build();
        }
      }
    }
    return result;
  }
}
