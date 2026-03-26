package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/chart.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ChartsServiceGrpc {

  private ChartsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.ChartsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListChartsRequest,
      ai.chalk.protos.chalk.server.v1.ListChartsResponse> getListChartsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCharts",
      requestType = ai.chalk.protos.chalk.server.v1.ListChartsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.ListChartsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListChartsRequest,
      ai.chalk.protos.chalk.server.v1.ListChartsResponse> getListChartsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListChartsRequest, ai.chalk.protos.chalk.server.v1.ListChartsResponse> getListChartsMethod;
    if ((getListChartsMethod = ChartsServiceGrpc.getListChartsMethod) == null) {
      synchronized (ChartsServiceGrpc.class) {
        if ((getListChartsMethod = ChartsServiceGrpc.getListChartsMethod) == null) {
          ChartsServiceGrpc.getListChartsMethod = getListChartsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.ListChartsRequest, ai.chalk.protos.chalk.server.v1.ListChartsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCharts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListChartsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListChartsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ChartsServiceMethodDescriptorSupplier("ListCharts"))
              .build();
        }
      }
    }
    return getListChartsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChartsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChartsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChartsServiceStub>() {
        @java.lang.Override
        public ChartsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChartsServiceStub(channel, callOptions);
        }
      };
    return ChartsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChartsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChartsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChartsServiceBlockingStub>() {
        @java.lang.Override
        public ChartsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChartsServiceBlockingStub(channel, callOptions);
        }
      };
    return ChartsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChartsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChartsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChartsServiceFutureStub>() {
        @java.lang.Override
        public ChartsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChartsServiceFutureStub(channel, callOptions);
        }
      };
    return ChartsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void listCharts(ai.chalk.protos.chalk.server.v1.ListChartsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListChartsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListChartsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ChartsService.
   */
  public static abstract class ChartsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ChartsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ChartsService.
   */
  public static final class ChartsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ChartsServiceStub> {
    private ChartsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChartsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChartsServiceStub(channel, callOptions);
    }

    /**
     */
    public void listCharts(ai.chalk.protos.chalk.server.v1.ListChartsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListChartsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListChartsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ChartsService.
   */
  public static final class ChartsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ChartsServiceBlockingStub> {
    private ChartsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChartsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChartsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.ListChartsResponse listCharts(ai.chalk.protos.chalk.server.v1.ListChartsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListChartsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ChartsService.
   */
  public static final class ChartsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ChartsServiceFutureStub> {
    private ChartsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChartsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChartsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.ListChartsResponse> listCharts(
        ai.chalk.protos.chalk.server.v1.ListChartsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListChartsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_CHARTS = 0;

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
        case METHODID_LIST_CHARTS:
          serviceImpl.listCharts((ai.chalk.protos.chalk.server.v1.ListChartsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListChartsResponse>) responseObserver);
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
          getListChartsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.ListChartsRequest,
              ai.chalk.protos.chalk.server.v1.ListChartsResponse>(
                service, METHODID_LIST_CHARTS)))
        .build();
  }

  private static abstract class ChartsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChartsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.ChartProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChartsService");
    }
  }

  private static final class ChartsServiceFileDescriptorSupplier
      extends ChartsServiceBaseDescriptorSupplier {
    ChartsServiceFileDescriptorSupplier() {}
  }

  private static final class ChartsServiceMethodDescriptorSupplier
      extends ChartsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ChartsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ChartsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChartsServiceFileDescriptorSupplier())
              .addMethod(getListChartsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
