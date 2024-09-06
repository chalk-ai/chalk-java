package ai.chalk.protos.chalk.engine.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/engine/v1/query_server.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryServiceGrpc {

  private QueryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.engine.v1.QueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.engine.v1.PingRequest,
      ai.chalk.protos.chalk.engine.v1.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = ai.chalk.protos.chalk.engine.v1.PingRequest.class,
      responseType = ai.chalk.protos.chalk.engine.v1.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.engine.v1.PingRequest,
      ai.chalk.protos.chalk.engine.v1.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.engine.v1.PingRequest, ai.chalk.protos.chalk.engine.v1.PingResponse> getPingMethod;
    if ((getPingMethod = QueryServiceGrpc.getPingMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getPingMethod = QueryServiceGrpc.getPingMethod) == null) {
          QueryServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.engine.v1.PingRequest, ai.chalk.protos.chalk.engine.v1.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.engine.v1.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.engine.v1.PingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.OnlineQueryRequest,
      ai.chalk.protos.chalk.common.v1.OnlineQueryResponse> getOnlineQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnlineQuery",
      requestType = ai.chalk.protos.chalk.common.v1.OnlineQueryRequest.class,
      responseType = ai.chalk.protos.chalk.common.v1.OnlineQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.OnlineQueryRequest,
      ai.chalk.protos.chalk.common.v1.OnlineQueryResponse> getOnlineQueryMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.OnlineQueryRequest, ai.chalk.protos.chalk.common.v1.OnlineQueryResponse> getOnlineQueryMethod;
    if ((getOnlineQueryMethod = QueryServiceGrpc.getOnlineQueryMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getOnlineQueryMethod = QueryServiceGrpc.getOnlineQueryMethod) == null) {
          QueryServiceGrpc.getOnlineQueryMethod = getOnlineQueryMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.common.v1.OnlineQueryRequest, ai.chalk.protos.chalk.common.v1.OnlineQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnlineQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.common.v1.OnlineQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.common.v1.OnlineQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("OnlineQuery"))
              .build();
        }
      }
    }
    return getOnlineQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.OnlineQueryBulkRequest,
      ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse> getOnlineQueryBulkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnlineQueryBulk",
      requestType = ai.chalk.protos.chalk.common.v1.OnlineQueryBulkRequest.class,
      responseType = ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.OnlineQueryBulkRequest,
      ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse> getOnlineQueryBulkMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.OnlineQueryBulkRequest, ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse> getOnlineQueryBulkMethod;
    if ((getOnlineQueryBulkMethod = QueryServiceGrpc.getOnlineQueryBulkMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getOnlineQueryBulkMethod = QueryServiceGrpc.getOnlineQueryBulkMethod) == null) {
          QueryServiceGrpc.getOnlineQueryBulkMethod = getOnlineQueryBulkMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.common.v1.OnlineQueryBulkRequest, ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnlineQueryBulk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.common.v1.OnlineQueryBulkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("OnlineQueryBulk"))
              .build();
        }
      }
    }
    return getOnlineQueryBulkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest,
      ai.chalk.protos.chalk.common.v1.OnlineQueryMultiResponse> getOnlineQueryMultiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnlineQueryMulti",
      requestType = ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest.class,
      responseType = ai.chalk.protos.chalk.common.v1.OnlineQueryMultiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest,
      ai.chalk.protos.chalk.common.v1.OnlineQueryMultiResponse> getOnlineQueryMultiMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest, ai.chalk.protos.chalk.common.v1.OnlineQueryMultiResponse> getOnlineQueryMultiMethod;
    if ((getOnlineQueryMultiMethod = QueryServiceGrpc.getOnlineQueryMultiMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getOnlineQueryMultiMethod = QueryServiceGrpc.getOnlineQueryMultiMethod) == null) {
          QueryServiceGrpc.getOnlineQueryMultiMethod = getOnlineQueryMultiMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest, ai.chalk.protos.chalk.common.v1.OnlineQueryMultiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnlineQueryMulti"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.common.v1.OnlineQueryMultiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("OnlineQueryMulti"))
              .build();
        }
      }
    }
    return getOnlineQueryMultiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkRequest,
      ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkResponse> getUploadFeaturesBulkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadFeaturesBulk",
      requestType = ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkRequest.class,
      responseType = ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkRequest,
      ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkResponse> getUploadFeaturesBulkMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkRequest, ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkResponse> getUploadFeaturesBulkMethod;
    if ((getUploadFeaturesBulkMethod = QueryServiceGrpc.getUploadFeaturesBulkMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getUploadFeaturesBulkMethod = QueryServiceGrpc.getUploadFeaturesBulkMethod) == null) {
          QueryServiceGrpc.getUploadFeaturesBulkMethod = getUploadFeaturesBulkMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkRequest, ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadFeaturesBulk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("UploadFeaturesBulk"))
              .build();
        }
      }
    }
    return getUploadFeaturesBulkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest,
      ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillResponse> getPlanAggregateBackfillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlanAggregateBackfill",
      requestType = ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest.class,
      responseType = ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest,
      ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillResponse> getPlanAggregateBackfillMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest, ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillResponse> getPlanAggregateBackfillMethod;
    if ((getPlanAggregateBackfillMethod = QueryServiceGrpc.getPlanAggregateBackfillMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getPlanAggregateBackfillMethod = QueryServiceGrpc.getPlanAggregateBackfillMethod) == null) {
          QueryServiceGrpc.getPlanAggregateBackfillMethod = getPlanAggregateBackfillMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest, ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlanAggregateBackfill"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("PlanAggregateBackfill"))
              .build();
        }
      }
    }
    return getPlanAggregateBackfillMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.aggregate.v1.GetAggregatesRequest,
      ai.chalk.protos.chalk.aggregate.v1.GetAggregatesResponse> getGetAggregatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAggregates",
      requestType = ai.chalk.protos.chalk.aggregate.v1.GetAggregatesRequest.class,
      responseType = ai.chalk.protos.chalk.aggregate.v1.GetAggregatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.aggregate.v1.GetAggregatesRequest,
      ai.chalk.protos.chalk.aggregate.v1.GetAggregatesResponse> getGetAggregatesMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.aggregate.v1.GetAggregatesRequest, ai.chalk.protos.chalk.aggregate.v1.GetAggregatesResponse> getGetAggregatesMethod;
    if ((getGetAggregatesMethod = QueryServiceGrpc.getGetAggregatesMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getGetAggregatesMethod = QueryServiceGrpc.getGetAggregatesMethod) == null) {
          QueryServiceGrpc.getGetAggregatesMethod = getGetAggregatesMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.aggregate.v1.GetAggregatesRequest, ai.chalk.protos.chalk.aggregate.v1.GetAggregatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAggregates"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.aggregate.v1.GetAggregatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.aggregate.v1.GetAggregatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("GetAggregates"))
              .build();
        }
      }
    }
    return getGetAggregatesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceStub>() {
        @java.lang.Override
        public QueryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceStub(channel, callOptions);
        }
      };
    return QueryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceBlockingStub>() {
        @java.lang.Override
        public QueryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceBlockingStub(channel, callOptions);
        }
      };
    return QueryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceFutureStub>() {
        @java.lang.Override
        public QueryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceFutureStub(channel, callOptions);
        }
      };
    return QueryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void ping(ai.chalk.protos.chalk.engine.v1.PingRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.engine.v1.PingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     */
    default void onlineQuery(ai.chalk.protos.chalk.common.v1.OnlineQueryRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.OnlineQueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnlineQueryMethod(), responseObserver);
    }

    /**
     */
    default void onlineQueryBulk(ai.chalk.protos.chalk.common.v1.OnlineQueryBulkRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnlineQueryBulkMethod(), responseObserver);
    }

    /**
     */
    default void onlineQueryMulti(ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.OnlineQueryMultiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnlineQueryMultiMethod(), responseObserver);
    }

    /**
     */
    default void uploadFeaturesBulk(ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadFeaturesBulkMethod(), responseObserver);
    }

    /**
     * <pre>
     * PlanAggregateBackfill determines the estimated resources needed to backfill
     * an aggregate.
     * This method is a duplicate of the PlanAggregateBackfill method
     * in the query_server.proto file. We should remove the query_server.proto method
     * and move that request to this service instead.
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * </pre>
     */
    default void planAggregateBackfill(ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlanAggregateBackfillMethod(), responseObserver);
    }

    /**
     * <pre>
     * This method is a duplicate of the PlanAggregateBackfill method
     * in the query_server.proto file. We should remove the query_server.proto method
     * and move that request to this service instead.
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * </pre>
     */
    default void getAggregates(ai.chalk.protos.chalk.aggregate.v1.GetAggregatesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.aggregate.v1.GetAggregatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAggregatesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QueryService.
   */
  public static abstract class QueryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QueryService.
   */
  public static final class QueryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<QueryServiceStub> {
    private QueryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceStub(channel, callOptions);
    }

    /**
     */
    public void ping(ai.chalk.protos.chalk.engine.v1.PingRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.engine.v1.PingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onlineQuery(ai.chalk.protos.chalk.common.v1.OnlineQueryRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.OnlineQueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnlineQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onlineQueryBulk(ai.chalk.protos.chalk.common.v1.OnlineQueryBulkRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnlineQueryBulkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onlineQueryMulti(ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.OnlineQueryMultiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnlineQueryMultiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uploadFeaturesBulk(ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadFeaturesBulkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PlanAggregateBackfill determines the estimated resources needed to backfill
     * an aggregate.
     * This method is a duplicate of the PlanAggregateBackfill method
     * in the query_server.proto file. We should remove the query_server.proto method
     * and move that request to this service instead.
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * </pre>
     */
    public void planAggregateBackfill(ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlanAggregateBackfillMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * This method is a duplicate of the PlanAggregateBackfill method
     * in the query_server.proto file. We should remove the query_server.proto method
     * and move that request to this service instead.
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * </pre>
     */
    public void getAggregates(ai.chalk.protos.chalk.aggregate.v1.GetAggregatesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.aggregate.v1.GetAggregatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAggregatesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QueryService.
   */
  public static final class QueryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryServiceBlockingStub> {
    private QueryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.engine.v1.PingResponse ping(ai.chalk.protos.chalk.engine.v1.PingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.common.v1.OnlineQueryResponse onlineQuery(ai.chalk.protos.chalk.common.v1.OnlineQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnlineQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse onlineQueryBulk(ai.chalk.protos.chalk.common.v1.OnlineQueryBulkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnlineQueryBulkMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.common.v1.OnlineQueryMultiResponse onlineQueryMulti(ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnlineQueryMultiMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkResponse uploadFeaturesBulk(ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadFeaturesBulkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PlanAggregateBackfill determines the estimated resources needed to backfill
     * an aggregate.
     * This method is a duplicate of the PlanAggregateBackfill method
     * in the query_server.proto file. We should remove the query_server.proto method
     * and move that request to this service instead.
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * </pre>
     */
    public ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillResponse planAggregateBackfill(ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlanAggregateBackfillMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * This method is a duplicate of the PlanAggregateBackfill method
     * in the query_server.proto file. We should remove the query_server.proto method
     * and move that request to this service instead.
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * </pre>
     */
    public ai.chalk.protos.chalk.aggregate.v1.GetAggregatesResponse getAggregates(ai.chalk.protos.chalk.aggregate.v1.GetAggregatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAggregatesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QueryService.
   */
  public static final class QueryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryServiceFutureStub> {
    private QueryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.engine.v1.PingResponse> ping(
        ai.chalk.protos.chalk.engine.v1.PingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.common.v1.OnlineQueryResponse> onlineQuery(
        ai.chalk.protos.chalk.common.v1.OnlineQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnlineQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse> onlineQueryBulk(
        ai.chalk.protos.chalk.common.v1.OnlineQueryBulkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnlineQueryBulkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.common.v1.OnlineQueryMultiResponse> onlineQueryMulti(
        ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnlineQueryMultiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkResponse> uploadFeaturesBulk(
        ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadFeaturesBulkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PlanAggregateBackfill determines the estimated resources needed to backfill
     * an aggregate.
     * This method is a duplicate of the PlanAggregateBackfill method
     * in the query_server.proto file. We should remove the query_server.proto method
     * and move that request to this service instead.
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillResponse> planAggregateBackfill(
        ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlanAggregateBackfillMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * This method is a duplicate of the PlanAggregateBackfill method
     * in the query_server.proto file. We should remove the query_server.proto method
     * and move that request to this service instead.
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.aggregate.v1.GetAggregatesResponse> getAggregates(
        ai.chalk.protos.chalk.aggregate.v1.GetAggregatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAggregatesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_ONLINE_QUERY = 1;
  private static final int METHODID_ONLINE_QUERY_BULK = 2;
  private static final int METHODID_ONLINE_QUERY_MULTI = 3;
  private static final int METHODID_UPLOAD_FEATURES_BULK = 4;
  private static final int METHODID_PLAN_AGGREGATE_BACKFILL = 5;
  private static final int METHODID_GET_AGGREGATES = 6;

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
        case METHODID_PING:
          serviceImpl.ping((ai.chalk.protos.chalk.engine.v1.PingRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.engine.v1.PingResponse>) responseObserver);
          break;
        case METHODID_ONLINE_QUERY:
          serviceImpl.onlineQuery((ai.chalk.protos.chalk.common.v1.OnlineQueryRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.OnlineQueryResponse>) responseObserver);
          break;
        case METHODID_ONLINE_QUERY_BULK:
          serviceImpl.onlineQueryBulk((ai.chalk.protos.chalk.common.v1.OnlineQueryBulkRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse>) responseObserver);
          break;
        case METHODID_ONLINE_QUERY_MULTI:
          serviceImpl.onlineQueryMulti((ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.OnlineQueryMultiResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_FEATURES_BULK:
          serviceImpl.uploadFeaturesBulk((ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkResponse>) responseObserver);
          break;
        case METHODID_PLAN_AGGREGATE_BACKFILL:
          serviceImpl.planAggregateBackfill((ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillResponse>) responseObserver);
          break;
        case METHODID_GET_AGGREGATES:
          serviceImpl.getAggregates((ai.chalk.protos.chalk.aggregate.v1.GetAggregatesRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.aggregate.v1.GetAggregatesResponse>) responseObserver);
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
          getPingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.engine.v1.PingRequest,
              ai.chalk.protos.chalk.engine.v1.PingResponse>(
                service, METHODID_PING)))
        .addMethod(
          getOnlineQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.common.v1.OnlineQueryRequest,
              ai.chalk.protos.chalk.common.v1.OnlineQueryResponse>(
                service, METHODID_ONLINE_QUERY)))
        .addMethod(
          getOnlineQueryBulkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.common.v1.OnlineQueryBulkRequest,
              ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse>(
                service, METHODID_ONLINE_QUERY_BULK)))
        .addMethod(
          getOnlineQueryMultiMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest,
              ai.chalk.protos.chalk.common.v1.OnlineQueryMultiResponse>(
                service, METHODID_ONLINE_QUERY_MULTI)))
        .addMethod(
          getUploadFeaturesBulkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkRequest,
              ai.chalk.protos.chalk.common.v1.UploadFeaturesBulkResponse>(
                service, METHODID_UPLOAD_FEATURES_BULK)))
        .addMethod(
          getPlanAggregateBackfillMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest,
              ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillResponse>(
                service, METHODID_PLAN_AGGREGATE_BACKFILL)))
        .addMethod(
          getGetAggregatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.aggregate.v1.GetAggregatesRequest,
              ai.chalk.protos.chalk.aggregate.v1.GetAggregatesResponse>(
                service, METHODID_GET_AGGREGATES)))
        .build();
  }

  private static abstract class QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.engine.v1.QueryServerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryService");
    }
  }

  private static final class QueryServiceFileDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier {
    QueryServiceFileDescriptorSupplier() {}
  }

  private static final class QueryServiceMethodDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    QueryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (QueryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryServiceFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getOnlineQueryMethod())
              .addMethod(getOnlineQueryBulkMethod())
              .addMethod(getOnlineQueryMultiMethod())
              .addMethod(getUploadFeaturesBulkMethod())
              .addMethod(getPlanAggregateBackfillMethod())
              .addMethod(getGetAggregatesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
