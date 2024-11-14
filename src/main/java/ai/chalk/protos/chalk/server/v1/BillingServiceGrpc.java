package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/billing.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BillingServiceGrpc {

  private BillingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.BillingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest,
      ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIResponse> getGetNodesAndPodsUIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNodesAndPodsUI",
      requestType = ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest,
      ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIResponse> getGetNodesAndPodsUIMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest, ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIResponse> getGetNodesAndPodsUIMethod;
    if ((getGetNodesAndPodsUIMethod = BillingServiceGrpc.getGetNodesAndPodsUIMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetNodesAndPodsUIMethod = BillingServiceGrpc.getGetNodesAndPodsUIMethod) == null) {
          BillingServiceGrpc.getGetNodesAndPodsUIMethod = getGetNodesAndPodsUIMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest, ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNodesAndPodsUI"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetNodesAndPodsUI"))
              .build();
        }
      }
    }
    return getGetNodesAndPodsUIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetNodesAndPodsRequest,
      ai.chalk.protos.chalk.server.v1.GetNodesAndPodsResponse> getGetNodesAndPodsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNodesAndPods",
      requestType = ai.chalk.protos.chalk.server.v1.GetNodesAndPodsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetNodesAndPodsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetNodesAndPodsRequest,
      ai.chalk.protos.chalk.server.v1.GetNodesAndPodsResponse> getGetNodesAndPodsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetNodesAndPodsRequest, ai.chalk.protos.chalk.server.v1.GetNodesAndPodsResponse> getGetNodesAndPodsMethod;
    if ((getGetNodesAndPodsMethod = BillingServiceGrpc.getGetNodesAndPodsMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetNodesAndPodsMethod = BillingServiceGrpc.getGetNodesAndPodsMethod) == null) {
          BillingServiceGrpc.getGetNodesAndPodsMethod = getGetNodesAndPodsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetNodesAndPodsRequest, ai.chalk.protos.chalk.server.v1.GetNodesAndPodsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNodesAndPods"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetNodesAndPodsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetNodesAndPodsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetNodesAndPods"))
              .build();
        }
      }
    }
    return getGetNodesAndPodsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetUsageChartRequest,
      ai.chalk.protos.chalk.server.v1.GetUsageChartResponse> getGetUsageChartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsageChart",
      requestType = ai.chalk.protos.chalk.server.v1.GetUsageChartRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetUsageChartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetUsageChartRequest,
      ai.chalk.protos.chalk.server.v1.GetUsageChartResponse> getGetUsageChartMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetUsageChartRequest, ai.chalk.protos.chalk.server.v1.GetUsageChartResponse> getGetUsageChartMethod;
    if ((getGetUsageChartMethod = BillingServiceGrpc.getGetUsageChartMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetUsageChartMethod = BillingServiceGrpc.getGetUsageChartMethod) == null) {
          BillingServiceGrpc.getGetUsageChartMethod = getGetUsageChartMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetUsageChartRequest, ai.chalk.protos.chalk.server.v1.GetUsageChartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUsageChart"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetUsageChartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetUsageChartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetUsageChart"))
              .build();
        }
      }
    }
    return getGetUsageChartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetUtilizationRatesRequest,
      ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse> getGetUtilizationRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUtilizationRates",
      requestType = ai.chalk.protos.chalk.server.v1.GetUtilizationRatesRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetUtilizationRatesRequest,
      ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse> getGetUtilizationRatesMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetUtilizationRatesRequest, ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse> getGetUtilizationRatesMethod;
    if ((getGetUtilizationRatesMethod = BillingServiceGrpc.getGetUtilizationRatesMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetUtilizationRatesMethod = BillingServiceGrpc.getGetUtilizationRatesMethod) == null) {
          BillingServiceGrpc.getGetUtilizationRatesMethod = getGetUtilizationRatesMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetUtilizationRatesRequest, ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUtilizationRates"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetUtilizationRatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetUtilizationRates"))
              .build();
        }
      }
    }
    return getGetUtilizationRatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetPodRequestChartsRequest,
      ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse> getGetPodRequestChartsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPodRequestCharts",
      requestType = ai.chalk.protos.chalk.server.v1.GetPodRequestChartsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetPodRequestChartsRequest,
      ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse> getGetPodRequestChartsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetPodRequestChartsRequest, ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse> getGetPodRequestChartsMethod;
    if ((getGetPodRequestChartsMethod = BillingServiceGrpc.getGetPodRequestChartsMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetPodRequestChartsMethod = BillingServiceGrpc.getGetPodRequestChartsMethod) == null) {
          BillingServiceGrpc.getGetPodRequestChartsMethod = getGetPodRequestChartsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetPodRequestChartsRequest, ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPodRequestCharts"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetPodRequestChartsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetPodRequestCharts"))
              .build();
        }
      }
    }
    return getGetPodRequestChartsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BillingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingServiceStub>() {
        @java.lang.Override
        public BillingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingServiceStub(channel, callOptions);
        }
      };
    return BillingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BillingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingServiceBlockingStub>() {
        @java.lang.Override
        public BillingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingServiceBlockingStub(channel, callOptions);
        }
      };
    return BillingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BillingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingServiceFutureStub>() {
        @java.lang.Override
        public BillingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingServiceFutureStub(channel, callOptions);
        }
      };
    return BillingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetNodesAndPodsUI returns the nodes and pods for the team by default,
     * not just a single environment. To limit the scope, add filters to
     * the request object.
     * Use this endpoint going forward; GetNodesAndPods should be deprecated because
     * it reuses PubSub types that are dangerous to update and are not intended for UI use.
     * </pre>
     */
    default void getNodesAndPodsUI(ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNodesAndPodsUIMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetNodesAndPods returns the nodes and pods for the team by default,
     * not just a single environment. To limit the scope, add filters to
     * the request object.
     * </pre>
     */
    default void getNodesAndPods(ai.chalk.protos.chalk.server.v1.GetNodesAndPodsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetNodesAndPodsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNodesAndPodsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUsageChart shows the Chalk credit usage between a provided start and
     * end period. The usage can be grouped by UsageChartPeriod for daily or
     * monthly usage, and by UsageChartGrouping for instance type or cluster usage.
     * </pre>
     */
    default void getUsageChart(ai.chalk.protos.chalk.server.v1.GetUsageChartRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetUsageChartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUsageChartMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUtilizationRates returns the current utilization rates for all
     * instance types.
     * </pre>
     */
    default void getUtilizationRates(ai.chalk.protos.chalk.server.v1.GetUtilizationRatesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUtilizationRatesMethod(), responseObserver);
    }

    /**
     */
    default void getPodRequestCharts(ai.chalk.protos.chalk.server.v1.GetPodRequestChartsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPodRequestChartsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BillingService.
   */
  public static abstract class BillingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BillingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BillingService.
   */
  public static final class BillingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BillingServiceStub> {
    private BillingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetNodesAndPodsUI returns the nodes and pods for the team by default,
     * not just a single environment. To limit the scope, add filters to
     * the request object.
     * Use this endpoint going forward; GetNodesAndPods should be deprecated because
     * it reuses PubSub types that are dangerous to update and are not intended for UI use.
     * </pre>
     */
    public void getNodesAndPodsUI(ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNodesAndPodsUIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetNodesAndPods returns the nodes and pods for the team by default,
     * not just a single environment. To limit the scope, add filters to
     * the request object.
     * </pre>
     */
    public void getNodesAndPods(ai.chalk.protos.chalk.server.v1.GetNodesAndPodsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetNodesAndPodsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNodesAndPodsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUsageChart shows the Chalk credit usage between a provided start and
     * end period. The usage can be grouped by UsageChartPeriod for daily or
     * monthly usage, and by UsageChartGrouping for instance type or cluster usage.
     * </pre>
     */
    public void getUsageChart(ai.chalk.protos.chalk.server.v1.GetUsageChartRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetUsageChartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUsageChartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUtilizationRates returns the current utilization rates for all
     * instance types.
     * </pre>
     */
    public void getUtilizationRates(ai.chalk.protos.chalk.server.v1.GetUtilizationRatesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUtilizationRatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPodRequestCharts(ai.chalk.protos.chalk.server.v1.GetPodRequestChartsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPodRequestChartsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BillingService.
   */
  public static final class BillingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BillingServiceBlockingStub> {
    private BillingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetNodesAndPodsUI returns the nodes and pods for the team by default,
     * not just a single environment. To limit the scope, add filters to
     * the request object.
     * Use this endpoint going forward; GetNodesAndPods should be deprecated because
     * it reuses PubSub types that are dangerous to update and are not intended for UI use.
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIResponse getNodesAndPodsUI(ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNodesAndPodsUIMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetNodesAndPods returns the nodes and pods for the team by default,
     * not just a single environment. To limit the scope, add filters to
     * the request object.
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.GetNodesAndPodsResponse getNodesAndPods(ai.chalk.protos.chalk.server.v1.GetNodesAndPodsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNodesAndPodsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUsageChart shows the Chalk credit usage between a provided start and
     * end period. The usage can be grouped by UsageChartPeriod for daily or
     * monthly usage, and by UsageChartGrouping for instance type or cluster usage.
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.GetUsageChartResponse getUsageChart(ai.chalk.protos.chalk.server.v1.GetUsageChartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUsageChartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUtilizationRates returns the current utilization rates for all
     * instance types.
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse getUtilizationRates(ai.chalk.protos.chalk.server.v1.GetUtilizationRatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUtilizationRatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse getPodRequestCharts(ai.chalk.protos.chalk.server.v1.GetPodRequestChartsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPodRequestChartsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BillingService.
   */
  public static final class BillingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BillingServiceFutureStub> {
    private BillingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetNodesAndPodsUI returns the nodes and pods for the team by default,
     * not just a single environment. To limit the scope, add filters to
     * the request object.
     * Use this endpoint going forward; GetNodesAndPods should be deprecated because
     * it reuses PubSub types that are dangerous to update and are not intended for UI use.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIResponse> getNodesAndPodsUI(
        ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNodesAndPodsUIMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetNodesAndPods returns the nodes and pods for the team by default,
     * not just a single environment. To limit the scope, add filters to
     * the request object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetNodesAndPodsResponse> getNodesAndPods(
        ai.chalk.protos.chalk.server.v1.GetNodesAndPodsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNodesAndPodsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUsageChart shows the Chalk credit usage between a provided start and
     * end period. The usage can be grouped by UsageChartPeriod for daily or
     * monthly usage, and by UsageChartGrouping for instance type or cluster usage.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetUsageChartResponse> getUsageChart(
        ai.chalk.protos.chalk.server.v1.GetUsageChartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUsageChartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUtilizationRates returns the current utilization rates for all
     * instance types.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse> getUtilizationRates(
        ai.chalk.protos.chalk.server.v1.GetUtilizationRatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUtilizationRatesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse> getPodRequestCharts(
        ai.chalk.protos.chalk.server.v1.GetPodRequestChartsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPodRequestChartsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NODES_AND_PODS_UI = 0;
  private static final int METHODID_GET_NODES_AND_PODS = 1;
  private static final int METHODID_GET_USAGE_CHART = 2;
  private static final int METHODID_GET_UTILIZATION_RATES = 3;
  private static final int METHODID_GET_POD_REQUEST_CHARTS = 4;

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
        case METHODID_GET_NODES_AND_PODS_UI:
          serviceImpl.getNodesAndPodsUI((ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIResponse>) responseObserver);
          break;
        case METHODID_GET_NODES_AND_PODS:
          serviceImpl.getNodesAndPods((ai.chalk.protos.chalk.server.v1.GetNodesAndPodsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetNodesAndPodsResponse>) responseObserver);
          break;
        case METHODID_GET_USAGE_CHART:
          serviceImpl.getUsageChart((ai.chalk.protos.chalk.server.v1.GetUsageChartRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetUsageChartResponse>) responseObserver);
          break;
        case METHODID_GET_UTILIZATION_RATES:
          serviceImpl.getUtilizationRates((ai.chalk.protos.chalk.server.v1.GetUtilizationRatesRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse>) responseObserver);
          break;
        case METHODID_GET_POD_REQUEST_CHARTS:
          serviceImpl.getPodRequestCharts((ai.chalk.protos.chalk.server.v1.GetPodRequestChartsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse>) responseObserver);
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
          getGetNodesAndPodsUIMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIRequest,
              ai.chalk.protos.chalk.server.v1.GetNodesAndPodsUIResponse>(
                service, METHODID_GET_NODES_AND_PODS_UI)))
        .addMethod(
          getGetNodesAndPodsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetNodesAndPodsRequest,
              ai.chalk.protos.chalk.server.v1.GetNodesAndPodsResponse>(
                service, METHODID_GET_NODES_AND_PODS)))
        .addMethod(
          getGetUsageChartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetUsageChartRequest,
              ai.chalk.protos.chalk.server.v1.GetUsageChartResponse>(
                service, METHODID_GET_USAGE_CHART)))
        .addMethod(
          getGetUtilizationRatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetUtilizationRatesRequest,
              ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse>(
                service, METHODID_GET_UTILIZATION_RATES)))
        .addMethod(
          getGetPodRequestChartsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetPodRequestChartsRequest,
              ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse>(
                service, METHODID_GET_POD_REQUEST_CHARTS)))
        .build();
  }

  private static abstract class BillingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BillingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.BillingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BillingService");
    }
  }

  private static final class BillingServiceFileDescriptorSupplier
      extends BillingServiceBaseDescriptorSupplier {
    BillingServiceFileDescriptorSupplier() {}
  }

  private static final class BillingServiceMethodDescriptorSupplier
      extends BillingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BillingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BillingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BillingServiceFileDescriptorSupplier())
              .addMethod(getGetNodesAndPodsUIMethod())
              .addMethod(getGetNodesAndPodsMethod())
              .addMethod(getGetUsageChartMethod())
              .addMethod(getGetUtilizationRatesMethod())
              .addMethod(getGetPodRequestChartsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
