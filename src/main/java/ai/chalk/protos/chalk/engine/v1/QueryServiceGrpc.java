package ai.chalk.protos.chalk.engine.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
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

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherRequest,
      ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherResponse> getOnlineQueryFeatherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnlineQueryFeather",
      requestType = ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherRequest.class,
      responseType = ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherRequest,
      ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherResponse> getOnlineQueryFeatherMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherRequest, ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherResponse> getOnlineQueryFeatherMethod;
    if ((getOnlineQueryFeatherMethod = QueryServiceGrpc.getOnlineQueryFeatherMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getOnlineQueryFeatherMethod = QueryServiceGrpc.getOnlineQueryFeatherMethod) == null) {
          QueryServiceGrpc.getOnlineQueryFeatherMethod = getOnlineQueryFeatherMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherRequest, ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnlineQueryFeather"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("OnlineQueryFeather"))
              .build();
        }
      }
    }
    return getOnlineQueryFeatherMethod;
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
    default void onlineQueryFeather(ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnlineQueryFeatherMethod(), responseObserver);
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
    public void onlineQueryFeather(ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnlineQueryFeatherMethod(), getCallOptions()), request, responseObserver);
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
    public ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherResponse onlineQueryFeather(ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnlineQueryFeatherMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherResponse> onlineQueryFeather(
        ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnlineQueryFeatherMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_ONLINE_QUERY = 1;
  private static final int METHODID_ONLINE_QUERY_FEATHER = 2;

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
        case METHODID_ONLINE_QUERY_FEATHER:
          serviceImpl.onlineQueryFeather((ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherResponse>) responseObserver);
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
          getOnlineQueryFeatherMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherRequest,
              ai.chalk.protos.chalk.common.v1.OnlineQueryFeatherResponse>(
                service, METHODID_ONLINE_QUERY_FEATHER)))
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
              .addMethod(getOnlineQueryFeatherMethod())
              .build();
        }
      }
    }
    return result;
  }
}
