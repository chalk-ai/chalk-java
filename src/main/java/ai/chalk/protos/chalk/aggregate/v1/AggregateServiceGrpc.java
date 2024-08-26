package ai.chalk.protos.chalk.aggregate.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/aggregate/v1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AggregateServiceGrpc {

  private AggregateServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.aggregate.v1.AggregateService";

  // Static method descriptors that strictly reflect the proto.
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
    if ((getPlanAggregateBackfillMethod = AggregateServiceGrpc.getPlanAggregateBackfillMethod) == null) {
      synchronized (AggregateServiceGrpc.class) {
        if ((getPlanAggregateBackfillMethod = AggregateServiceGrpc.getPlanAggregateBackfillMethod) == null) {
          AggregateServiceGrpc.getPlanAggregateBackfillMethod = getPlanAggregateBackfillMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest, ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlanAggregateBackfill"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AggregateServiceMethodDescriptorSupplier("PlanAggregateBackfill"))
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
    if ((getGetAggregatesMethod = AggregateServiceGrpc.getGetAggregatesMethod) == null) {
      synchronized (AggregateServiceGrpc.class) {
        if ((getGetAggregatesMethod = AggregateServiceGrpc.getGetAggregatesMethod) == null) {
          AggregateServiceGrpc.getGetAggregatesMethod = getGetAggregatesMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.aggregate.v1.GetAggregatesRequest, ai.chalk.protos.chalk.aggregate.v1.GetAggregatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAggregates"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.aggregate.v1.GetAggregatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.aggregate.v1.GetAggregatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AggregateServiceMethodDescriptorSupplier("GetAggregates"))
              .build();
        }
      }
    }
    return getGetAggregatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsRequest,
      ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse> getGetAggregateBackfillJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAggregateBackfillJobs",
      requestType = ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsRequest.class,
      responseType = ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsRequest,
      ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse> getGetAggregateBackfillJobsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsRequest, ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse> getGetAggregateBackfillJobsMethod;
    if ((getGetAggregateBackfillJobsMethod = AggregateServiceGrpc.getGetAggregateBackfillJobsMethod) == null) {
      synchronized (AggregateServiceGrpc.class) {
        if ((getGetAggregateBackfillJobsMethod = AggregateServiceGrpc.getGetAggregateBackfillJobsMethod) == null) {
          AggregateServiceGrpc.getGetAggregateBackfillJobsMethod = getGetAggregateBackfillJobsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsRequest, ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAggregateBackfillJobs"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AggregateServiceMethodDescriptorSupplier("GetAggregateBackfillJobs"))
              .build();
        }
      }
    }
    return getGetAggregateBackfillJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobRequest,
      ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobResponse> getGetAggregateBackfillJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAggregateBackfillJob",
      requestType = ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobRequest.class,
      responseType = ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobRequest,
      ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobResponse> getGetAggregateBackfillJobMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobRequest, ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobResponse> getGetAggregateBackfillJobMethod;
    if ((getGetAggregateBackfillJobMethod = AggregateServiceGrpc.getGetAggregateBackfillJobMethod) == null) {
      synchronized (AggregateServiceGrpc.class) {
        if ((getGetAggregateBackfillJobMethod = AggregateServiceGrpc.getGetAggregateBackfillJobMethod) == null) {
          AggregateServiceGrpc.getGetAggregateBackfillJobMethod = getGetAggregateBackfillJobMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobRequest, ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAggregateBackfillJob"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AggregateServiceMethodDescriptorSupplier("GetAggregateBackfillJob"))
              .build();
        }
      }
    }
    return getGetAggregateBackfillJobMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AggregateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AggregateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AggregateServiceStub>() {
        @java.lang.Override
        public AggregateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AggregateServiceStub(channel, callOptions);
        }
      };
    return AggregateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AggregateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AggregateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AggregateServiceBlockingStub>() {
        @java.lang.Override
        public AggregateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AggregateServiceBlockingStub(channel, callOptions);
        }
      };
    return AggregateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AggregateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AggregateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AggregateServiceFutureStub>() {
        @java.lang.Override
        public AggregateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AggregateServiceFutureStub(channel, callOptions);
        }
      };
    return AggregateServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

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

    /**
     */
    default void getAggregateBackfillJobs(ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAggregateBackfillJobsMethod(), responseObserver);
    }

    /**
     */
    default void getAggregateBackfillJob(ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAggregateBackfillJobMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AggregateService.
   */
  public static abstract class AggregateServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AggregateServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AggregateService.
   */
  public static final class AggregateServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AggregateServiceStub> {
    private AggregateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AggregateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AggregateServiceStub(channel, callOptions);
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

    /**
     */
    public void getAggregateBackfillJobs(ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAggregateBackfillJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAggregateBackfillJob(ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAggregateBackfillJobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AggregateService.
   */
  public static final class AggregateServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AggregateServiceBlockingStub> {
    private AggregateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AggregateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AggregateServiceBlockingStub(channel, callOptions);
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

    /**
     */
    public ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse getAggregateBackfillJobs(ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAggregateBackfillJobsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobResponse getAggregateBackfillJob(ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAggregateBackfillJobMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AggregateService.
   */
  public static final class AggregateServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AggregateServiceFutureStub> {
    private AggregateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AggregateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AggregateServiceFutureStub(channel, callOptions);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse> getAggregateBackfillJobs(
        ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAggregateBackfillJobsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobResponse> getAggregateBackfillJob(
        ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAggregateBackfillJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLAN_AGGREGATE_BACKFILL = 0;
  private static final int METHODID_GET_AGGREGATES = 1;
  private static final int METHODID_GET_AGGREGATE_BACKFILL_JOBS = 2;
  private static final int METHODID_GET_AGGREGATE_BACKFILL_JOB = 3;

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
        case METHODID_PLAN_AGGREGATE_BACKFILL:
          serviceImpl.planAggregateBackfill((ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillResponse>) responseObserver);
          break;
        case METHODID_GET_AGGREGATES:
          serviceImpl.getAggregates((ai.chalk.protos.chalk.aggregate.v1.GetAggregatesRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.aggregate.v1.GetAggregatesResponse>) responseObserver);
          break;
        case METHODID_GET_AGGREGATE_BACKFILL_JOBS:
          serviceImpl.getAggregateBackfillJobs((ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse>) responseObserver);
          break;
        case METHODID_GET_AGGREGATE_BACKFILL_JOB:
          serviceImpl.getAggregateBackfillJob((ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobResponse>) responseObserver);
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
        .addMethod(
          getGetAggregateBackfillJobsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsRequest,
              ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse>(
                service, METHODID_GET_AGGREGATE_BACKFILL_JOBS)))
        .addMethod(
          getGetAggregateBackfillJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobRequest,
              ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobResponse>(
                service, METHODID_GET_AGGREGATE_BACKFILL_JOB)))
        .build();
  }

  private static abstract class AggregateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AggregateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.aggregate.v1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AggregateService");
    }
  }

  private static final class AggregateServiceFileDescriptorSupplier
      extends AggregateServiceBaseDescriptorSupplier {
    AggregateServiceFileDescriptorSupplier() {}
  }

  private static final class AggregateServiceMethodDescriptorSupplier
      extends AggregateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AggregateServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AggregateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AggregateServiceFileDescriptorSupplier())
              .addMethod(getPlanAggregateBackfillMethod())
              .addMethod(getGetAggregatesMethod())
              .addMethod(getGetAggregateBackfillJobsMethod())
              .addMethod(getGetAggregateBackfillJobMethod())
              .build();
        }
      }
    }
    return result;
  }
}
