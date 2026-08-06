package ai.chalk.protos.chalk.sql.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/sql/v1/sql_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SqlServiceGrpc {

  private SqlServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.sql.v1.SqlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryRequest,
      ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryResponse> getExecuteSqlQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteSqlQuery",
      requestType = ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryRequest.class,
      responseType = ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryRequest,
      ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryResponse> getExecuteSqlQueryMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryRequest, ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryResponse> getExecuteSqlQueryMethod;
    if ((getExecuteSqlQueryMethod = SqlServiceGrpc.getExecuteSqlQueryMethod) == null) {
      synchronized (SqlServiceGrpc.class) {
        if ((getExecuteSqlQueryMethod = SqlServiceGrpc.getExecuteSqlQueryMethod) == null) {
          SqlServiceGrpc.getExecuteSqlQueryMethod = getExecuteSqlQueryMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryRequest, ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteSqlQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SqlServiceMethodDescriptorSupplier("ExecuteSqlQuery"))
              .build();
        }
      }
    }
    return getExecuteSqlQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.sql.v1.PlanSqlQueryRequest,
      ai.chalk.protos.chalk.sql.v1.PlanSqlQueryResponse> getPlanSqlQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlanSqlQuery",
      requestType = ai.chalk.protos.chalk.sql.v1.PlanSqlQueryRequest.class,
      responseType = ai.chalk.protos.chalk.sql.v1.PlanSqlQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.sql.v1.PlanSqlQueryRequest,
      ai.chalk.protos.chalk.sql.v1.PlanSqlQueryResponse> getPlanSqlQueryMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.sql.v1.PlanSqlQueryRequest, ai.chalk.protos.chalk.sql.v1.PlanSqlQueryResponse> getPlanSqlQueryMethod;
    if ((getPlanSqlQueryMethod = SqlServiceGrpc.getPlanSqlQueryMethod) == null) {
      synchronized (SqlServiceGrpc.class) {
        if ((getPlanSqlQueryMethod = SqlServiceGrpc.getPlanSqlQueryMethod) == null) {
          SqlServiceGrpc.getPlanSqlQueryMethod = getPlanSqlQueryMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.sql.v1.PlanSqlQueryRequest, ai.chalk.protos.chalk.sql.v1.PlanSqlQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlanSqlQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.sql.v1.PlanSqlQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.sql.v1.PlanSqlQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SqlServiceMethodDescriptorSupplier("PlanSqlQuery"))
              .build();
        }
      }
    }
    return getPlanSqlQueryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SqlServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SqlServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SqlServiceStub>() {
        @java.lang.Override
        public SqlServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SqlServiceStub(channel, callOptions);
        }
      };
    return SqlServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SqlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SqlServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SqlServiceBlockingStub>() {
        @java.lang.Override
        public SqlServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SqlServiceBlockingStub(channel, callOptions);
        }
      };
    return SqlServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SqlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SqlServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SqlServiceFutureStub>() {
        @java.lang.Override
        public SqlServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SqlServiceFutureStub(channel, callOptions);
        }
      };
    return SqlServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void executeSqlQuery(ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteSqlQueryMethod(), responseObserver);
    }

    /**
     */
    default void planSqlQuery(ai.chalk.protos.chalk.sql.v1.PlanSqlQueryRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.sql.v1.PlanSqlQueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlanSqlQueryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SqlService.
   */
  public static abstract class SqlServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SqlServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SqlService.
   */
  public static final class SqlServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SqlServiceStub> {
    private SqlServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SqlServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SqlServiceStub(channel, callOptions);
    }

    /**
     */
    public void executeSqlQuery(ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteSqlQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void planSqlQuery(ai.chalk.protos.chalk.sql.v1.PlanSqlQueryRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.sql.v1.PlanSqlQueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlanSqlQueryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SqlService.
   */
  public static final class SqlServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SqlServiceBlockingStub> {
    private SqlServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SqlServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SqlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryResponse executeSqlQuery(ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteSqlQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.sql.v1.PlanSqlQueryResponse planSqlQuery(ai.chalk.protos.chalk.sql.v1.PlanSqlQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlanSqlQueryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SqlService.
   */
  public static final class SqlServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SqlServiceFutureStub> {
    private SqlServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SqlServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SqlServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryResponse> executeSqlQuery(
        ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteSqlQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.sql.v1.PlanSqlQueryResponse> planSqlQuery(
        ai.chalk.protos.chalk.sql.v1.PlanSqlQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlanSqlQueryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXECUTE_SQL_QUERY = 0;
  private static final int METHODID_PLAN_SQL_QUERY = 1;

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
        case METHODID_EXECUTE_SQL_QUERY:
          serviceImpl.executeSqlQuery((ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryResponse>) responseObserver);
          break;
        case METHODID_PLAN_SQL_QUERY:
          serviceImpl.planSqlQuery((ai.chalk.protos.chalk.sql.v1.PlanSqlQueryRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.sql.v1.PlanSqlQueryResponse>) responseObserver);
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
          getExecuteSqlQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryRequest,
              ai.chalk.protos.chalk.sql.v1.ExecuteSqlQueryResponse>(
                service, METHODID_EXECUTE_SQL_QUERY)))
        .addMethod(
          getPlanSqlQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.sql.v1.PlanSqlQueryRequest,
              ai.chalk.protos.chalk.sql.v1.PlanSqlQueryResponse>(
                service, METHODID_PLAN_SQL_QUERY)))
        .build();
  }

  private static abstract class SqlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SqlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.sql.v1.SqlServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SqlService");
    }
  }

  private static final class SqlServiceFileDescriptorSupplier
      extends SqlServiceBaseDescriptorSupplier {
    SqlServiceFileDescriptorSupplier() {}
  }

  private static final class SqlServiceMethodDescriptorSupplier
      extends SqlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SqlServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SqlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SqlServiceFileDescriptorSupplier())
              .addMethod(getExecuteSqlQueryMethod())
              .addMethod(getPlanSqlQueryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
