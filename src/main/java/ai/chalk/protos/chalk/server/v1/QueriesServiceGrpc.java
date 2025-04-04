package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/queries.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueriesServiceGrpc {

  private QueriesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.QueriesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryRequest,
      ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryResponse> getGetQueryPerformanceSummaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueryPerformanceSummary",
      requestType = ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryRequest,
      ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryResponse> getGetQueryPerformanceSummaryMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryRequest, ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryResponse> getGetQueryPerformanceSummaryMethod;
    if ((getGetQueryPerformanceSummaryMethod = QueriesServiceGrpc.getGetQueryPerformanceSummaryMethod) == null) {
      synchronized (QueriesServiceGrpc.class) {
        if ((getGetQueryPerformanceSummaryMethod = QueriesServiceGrpc.getGetQueryPerformanceSummaryMethod) == null) {
          QueriesServiceGrpc.getGetQueryPerformanceSummaryMethod = getGetQueryPerformanceSummaryMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryRequest, ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQueryPerformanceSummary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueriesServiceMethodDescriptorSupplier("GetQueryPerformanceSummary"))
              .build();
        }
      }
    }
    return getGetQueryPerformanceSummaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListQueryErrorsRequest,
      ai.chalk.protos.chalk.server.v1.ListQueryErrorsResponse> getListQueryErrorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListQueryErrors",
      requestType = ai.chalk.protos.chalk.server.v1.ListQueryErrorsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.ListQueryErrorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListQueryErrorsRequest,
      ai.chalk.protos.chalk.server.v1.ListQueryErrorsResponse> getListQueryErrorsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListQueryErrorsRequest, ai.chalk.protos.chalk.server.v1.ListQueryErrorsResponse> getListQueryErrorsMethod;
    if ((getListQueryErrorsMethod = QueriesServiceGrpc.getListQueryErrorsMethod) == null) {
      synchronized (QueriesServiceGrpc.class) {
        if ((getListQueryErrorsMethod = QueriesServiceGrpc.getListQueryErrorsMethod) == null) {
          QueriesServiceGrpc.getListQueryErrorsMethod = getListQueryErrorsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.ListQueryErrorsRequest, ai.chalk.protos.chalk.server.v1.ListQueryErrorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListQueryErrors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListQueryErrorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListQueryErrorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueriesServiceMethodDescriptorSupplier("ListQueryErrors"))
              .build();
        }
      }
    }
    return getListQueryErrorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartRequest,
      ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartResponse> getGetQueryErrorsChartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueryErrorsChart",
      requestType = ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartRequest,
      ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartResponse> getGetQueryErrorsChartMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartRequest, ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartResponse> getGetQueryErrorsChartMethod;
    if ((getGetQueryErrorsChartMethod = QueriesServiceGrpc.getGetQueryErrorsChartMethod) == null) {
      synchronized (QueriesServiceGrpc.class) {
        if ((getGetQueryErrorsChartMethod = QueriesServiceGrpc.getGetQueryErrorsChartMethod) == null) {
          QueriesServiceGrpc.getGetQueryErrorsChartMethod = getGetQueryErrorsChartMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartRequest, ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQueryErrorsChart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueriesServiceMethodDescriptorSupplier("GetQueryErrorsChart"))
              .build();
        }
      }
    }
    return getGetQueryErrorsChartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueriesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueriesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueriesServiceStub>() {
        @java.lang.Override
        public QueriesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueriesServiceStub(channel, callOptions);
        }
      };
    return QueriesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueriesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueriesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueriesServiceBlockingStub>() {
        @java.lang.Override
        public QueriesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueriesServiceBlockingStub(channel, callOptions);
        }
      };
    return QueriesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueriesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueriesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueriesServiceFutureStub>() {
        @java.lang.Override
        public QueriesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueriesServiceFutureStub(channel, callOptions);
        }
      };
    return QueriesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getQueryPerformanceSummary(ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueryPerformanceSummaryMethod(), responseObserver);
    }

    /**
     */
    default void listQueryErrors(ai.chalk.protos.chalk.server.v1.ListQueryErrorsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListQueryErrorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListQueryErrorsMethod(), responseObserver);
    }

    /**
     */
    default void getQueryErrorsChart(ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueryErrorsChartMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QueriesService.
   */
  public static abstract class QueriesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueriesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QueriesService.
   */
  public static final class QueriesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<QueriesServiceStub> {
    private QueriesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueriesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueriesServiceStub(channel, callOptions);
    }

    /**
     */
    public void getQueryPerformanceSummary(ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQueryPerformanceSummaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listQueryErrors(ai.chalk.protos.chalk.server.v1.ListQueryErrorsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListQueryErrorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListQueryErrorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQueryErrorsChart(ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQueryErrorsChartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QueriesService.
   */
  public static final class QueriesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueriesServiceBlockingStub> {
    private QueriesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueriesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueriesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryResponse getQueryPerformanceSummary(ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQueryPerformanceSummaryMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.ListQueryErrorsResponse listQueryErrors(ai.chalk.protos.chalk.server.v1.ListQueryErrorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListQueryErrorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartResponse getQueryErrorsChart(ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQueryErrorsChartMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QueriesService.
   */
  public static final class QueriesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueriesServiceFutureStub> {
    private QueriesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueriesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueriesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryResponse> getQueryPerformanceSummary(
        ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQueryPerformanceSummaryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.ListQueryErrorsResponse> listQueryErrors(
        ai.chalk.protos.chalk.server.v1.ListQueryErrorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListQueryErrorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartResponse> getQueryErrorsChart(
        ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQueryErrorsChartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_QUERY_PERFORMANCE_SUMMARY = 0;
  private static final int METHODID_LIST_QUERY_ERRORS = 1;
  private static final int METHODID_GET_QUERY_ERRORS_CHART = 2;

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
        case METHODID_GET_QUERY_PERFORMANCE_SUMMARY:
          serviceImpl.getQueryPerformanceSummary((ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryResponse>) responseObserver);
          break;
        case METHODID_LIST_QUERY_ERRORS:
          serviceImpl.listQueryErrors((ai.chalk.protos.chalk.server.v1.ListQueryErrorsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListQueryErrorsResponse>) responseObserver);
          break;
        case METHODID_GET_QUERY_ERRORS_CHART:
          serviceImpl.getQueryErrorsChart((ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartResponse>) responseObserver);
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
          getGetQueryPerformanceSummaryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryRequest,
              ai.chalk.protos.chalk.server.v1.GetQueryPerformanceSummaryResponse>(
                service, METHODID_GET_QUERY_PERFORMANCE_SUMMARY)))
        .addMethod(
          getListQueryErrorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.ListQueryErrorsRequest,
              ai.chalk.protos.chalk.server.v1.ListQueryErrorsResponse>(
                service, METHODID_LIST_QUERY_ERRORS)))
        .addMethod(
          getGetQueryErrorsChartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartRequest,
              ai.chalk.protos.chalk.server.v1.GetQueryErrorsChartResponse>(
                service, METHODID_GET_QUERY_ERRORS_CHART)))
        .build();
  }

  private static abstract class QueriesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueriesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.QueriesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueriesService");
    }
  }

  private static final class QueriesServiceFileDescriptorSupplier
      extends QueriesServiceBaseDescriptorSupplier {
    QueriesServiceFileDescriptorSupplier() {}
  }

  private static final class QueriesServiceMethodDescriptorSupplier
      extends QueriesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    QueriesServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (QueriesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueriesServiceFileDescriptorSupplier())
              .addMethod(getGetQueryPerformanceSummaryMethod())
              .addMethod(getListQueryErrorsMethod())
              .addMethod(getGetQueryErrorsChartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
