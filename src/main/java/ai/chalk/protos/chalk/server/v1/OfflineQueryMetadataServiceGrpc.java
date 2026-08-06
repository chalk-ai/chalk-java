package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/offline_queries.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OfflineQueryMetadataServiceGrpc {

  private OfflineQueryMetadataServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.OfflineQueryMetadataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListOfflineQueriesRequest,
      ai.chalk.protos.chalk.server.v1.ListOfflineQueriesResponse> getListOfflineQueriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOfflineQueries",
      requestType = ai.chalk.protos.chalk.server.v1.ListOfflineQueriesRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.ListOfflineQueriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListOfflineQueriesRequest,
      ai.chalk.protos.chalk.server.v1.ListOfflineQueriesResponse> getListOfflineQueriesMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListOfflineQueriesRequest, ai.chalk.protos.chalk.server.v1.ListOfflineQueriesResponse> getListOfflineQueriesMethod;
    if ((getListOfflineQueriesMethod = OfflineQueryMetadataServiceGrpc.getListOfflineQueriesMethod) == null) {
      synchronized (OfflineQueryMetadataServiceGrpc.class) {
        if ((getListOfflineQueriesMethod = OfflineQueryMetadataServiceGrpc.getListOfflineQueriesMethod) == null) {
          OfflineQueryMetadataServiceGrpc.getListOfflineQueriesMethod = getListOfflineQueriesMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.ListOfflineQueriesRequest, ai.chalk.protos.chalk.server.v1.ListOfflineQueriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOfflineQueries"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListOfflineQueriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListOfflineQueriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OfflineQueryMetadataServiceMethodDescriptorSupplier("ListOfflineQueries"))
              .build();
        }
      }
    }
    return getListOfflineQueriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetOfflineQueryRequest,
      ai.chalk.protos.chalk.server.v1.GetOfflineQueryResponse> getGetOfflineQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOfflineQuery",
      requestType = ai.chalk.protos.chalk.server.v1.GetOfflineQueryRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetOfflineQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetOfflineQueryRequest,
      ai.chalk.protos.chalk.server.v1.GetOfflineQueryResponse> getGetOfflineQueryMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetOfflineQueryRequest, ai.chalk.protos.chalk.server.v1.GetOfflineQueryResponse> getGetOfflineQueryMethod;
    if ((getGetOfflineQueryMethod = OfflineQueryMetadataServiceGrpc.getGetOfflineQueryMethod) == null) {
      synchronized (OfflineQueryMetadataServiceGrpc.class) {
        if ((getGetOfflineQueryMethod = OfflineQueryMetadataServiceGrpc.getGetOfflineQueryMethod) == null) {
          OfflineQueryMetadataServiceGrpc.getGetOfflineQueryMethod = getGetOfflineQueryMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetOfflineQueryRequest, ai.chalk.protos.chalk.server.v1.GetOfflineQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOfflineQuery"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetOfflineQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetOfflineQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OfflineQueryMetadataServiceMethodDescriptorSupplier("GetOfflineQuery"))
              .build();
        }
      }
    }
    return getGetOfflineQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesRequest,
      ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesResponse> getListOfflineQueryShardPerformanceSummariesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOfflineQueryShardPerformanceSummaries",
      requestType = ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesRequest,
      ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesResponse> getListOfflineQueryShardPerformanceSummariesMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesRequest, ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesResponse> getListOfflineQueryShardPerformanceSummariesMethod;
    if ((getListOfflineQueryShardPerformanceSummariesMethod = OfflineQueryMetadataServiceGrpc.getListOfflineQueryShardPerformanceSummariesMethod) == null) {
      synchronized (OfflineQueryMetadataServiceGrpc.class) {
        if ((getListOfflineQueryShardPerformanceSummariesMethod = OfflineQueryMetadataServiceGrpc.getListOfflineQueryShardPerformanceSummariesMethod) == null) {
          OfflineQueryMetadataServiceGrpc.getListOfflineQueryShardPerformanceSummariesMethod = getListOfflineQueryShardPerformanceSummariesMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesRequest, ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOfflineQueryShardPerformanceSummaries"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OfflineQueryMetadataServiceMethodDescriptorSupplier("ListOfflineQueryShardPerformanceSummaries"))
              .build();
        }
      }
    }
    return getListOfflineQueryShardPerformanceSummariesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OfflineQueryMetadataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OfflineQueryMetadataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OfflineQueryMetadataServiceStub>() {
        @java.lang.Override
        public OfflineQueryMetadataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OfflineQueryMetadataServiceStub(channel, callOptions);
        }
      };
    return OfflineQueryMetadataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OfflineQueryMetadataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OfflineQueryMetadataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OfflineQueryMetadataServiceBlockingStub>() {
        @java.lang.Override
        public OfflineQueryMetadataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OfflineQueryMetadataServiceBlockingStub(channel, callOptions);
        }
      };
    return OfflineQueryMetadataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OfflineQueryMetadataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OfflineQueryMetadataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OfflineQueryMetadataServiceFutureStub>() {
        @java.lang.Override
        public OfflineQueryMetadataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OfflineQueryMetadataServiceFutureStub(channel, callOptions);
        }
      };
    return OfflineQueryMetadataServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void listOfflineQueries(ai.chalk.protos.chalk.server.v1.ListOfflineQueriesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListOfflineQueriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOfflineQueriesMethod(), responseObserver);
    }

    /**
     */
    default void getOfflineQuery(ai.chalk.protos.chalk.server.v1.GetOfflineQueryRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetOfflineQueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOfflineQueryMethod(), responseObserver);
    }

    /**
     */
    default void listOfflineQueryShardPerformanceSummaries(ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOfflineQueryShardPerformanceSummariesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OfflineQueryMetadataService.
   */
  public static abstract class OfflineQueryMetadataServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OfflineQueryMetadataServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OfflineQueryMetadataService.
   */
  public static final class OfflineQueryMetadataServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OfflineQueryMetadataServiceStub> {
    private OfflineQueryMetadataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OfflineQueryMetadataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OfflineQueryMetadataServiceStub(channel, callOptions);
    }

    /**
     */
    public void listOfflineQueries(ai.chalk.protos.chalk.server.v1.ListOfflineQueriesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListOfflineQueriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOfflineQueriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOfflineQuery(ai.chalk.protos.chalk.server.v1.GetOfflineQueryRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetOfflineQueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOfflineQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOfflineQueryShardPerformanceSummaries(ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOfflineQueryShardPerformanceSummariesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OfflineQueryMetadataService.
   */
  public static final class OfflineQueryMetadataServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OfflineQueryMetadataServiceBlockingStub> {
    private OfflineQueryMetadataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OfflineQueryMetadataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OfflineQueryMetadataServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.ListOfflineQueriesResponse listOfflineQueries(ai.chalk.protos.chalk.server.v1.ListOfflineQueriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOfflineQueriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetOfflineQueryResponse getOfflineQuery(ai.chalk.protos.chalk.server.v1.GetOfflineQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOfflineQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesResponse listOfflineQueryShardPerformanceSummaries(ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOfflineQueryShardPerformanceSummariesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OfflineQueryMetadataService.
   */
  public static final class OfflineQueryMetadataServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OfflineQueryMetadataServiceFutureStub> {
    private OfflineQueryMetadataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OfflineQueryMetadataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OfflineQueryMetadataServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.ListOfflineQueriesResponse> listOfflineQueries(
        ai.chalk.protos.chalk.server.v1.ListOfflineQueriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOfflineQueriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetOfflineQueryResponse> getOfflineQuery(
        ai.chalk.protos.chalk.server.v1.GetOfflineQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOfflineQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesResponse> listOfflineQueryShardPerformanceSummaries(
        ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOfflineQueryShardPerformanceSummariesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_OFFLINE_QUERIES = 0;
  private static final int METHODID_GET_OFFLINE_QUERY = 1;
  private static final int METHODID_LIST_OFFLINE_QUERY_SHARD_PERFORMANCE_SUMMARIES = 2;

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
        case METHODID_LIST_OFFLINE_QUERIES:
          serviceImpl.listOfflineQueries((ai.chalk.protos.chalk.server.v1.ListOfflineQueriesRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListOfflineQueriesResponse>) responseObserver);
          break;
        case METHODID_GET_OFFLINE_QUERY:
          serviceImpl.getOfflineQuery((ai.chalk.protos.chalk.server.v1.GetOfflineQueryRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetOfflineQueryResponse>) responseObserver);
          break;
        case METHODID_LIST_OFFLINE_QUERY_SHARD_PERFORMANCE_SUMMARIES:
          serviceImpl.listOfflineQueryShardPerformanceSummaries((ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesResponse>) responseObserver);
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
          getListOfflineQueriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.ListOfflineQueriesRequest,
              ai.chalk.protos.chalk.server.v1.ListOfflineQueriesResponse>(
                service, METHODID_LIST_OFFLINE_QUERIES)))
        .addMethod(
          getGetOfflineQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetOfflineQueryRequest,
              ai.chalk.protos.chalk.server.v1.GetOfflineQueryResponse>(
                service, METHODID_GET_OFFLINE_QUERY)))
        .addMethod(
          getListOfflineQueryShardPerformanceSummariesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesRequest,
              ai.chalk.protos.chalk.server.v1.ListOfflineQueryShardPerformanceSummariesResponse>(
                service, METHODID_LIST_OFFLINE_QUERY_SHARD_PERFORMANCE_SUMMARIES)))
        .build();
  }

  private static abstract class OfflineQueryMetadataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OfflineQueryMetadataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.OfflineQueriesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OfflineQueryMetadataService");
    }
  }

  private static final class OfflineQueryMetadataServiceFileDescriptorSupplier
      extends OfflineQueryMetadataServiceBaseDescriptorSupplier {
    OfflineQueryMetadataServiceFileDescriptorSupplier() {}
  }

  private static final class OfflineQueryMetadataServiceMethodDescriptorSupplier
      extends OfflineQueryMetadataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OfflineQueryMetadataServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OfflineQueryMetadataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OfflineQueryMetadataServiceFileDescriptorSupplier())
              .addMethod(getListOfflineQueriesMethod())
              .addMethod(getGetOfflineQueryMethod())
              .addMethod(getListOfflineQueryShardPerformanceSummariesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
