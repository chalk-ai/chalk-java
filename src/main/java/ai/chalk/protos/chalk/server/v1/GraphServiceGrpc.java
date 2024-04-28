package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: chalk/server/v1/graph.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GraphServiceGrpc {

  private GraphServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.GraphService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetFeatureSQLRequest,
      ai.chalk.protos.chalk.server.v1.GetFeatureSQLResponse> getGetFeatureSQLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeatureSQL",
      requestType = ai.chalk.protos.chalk.server.v1.GetFeatureSQLRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetFeatureSQLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetFeatureSQLRequest,
      ai.chalk.protos.chalk.server.v1.GetFeatureSQLResponse> getGetFeatureSQLMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetFeatureSQLRequest, ai.chalk.protos.chalk.server.v1.GetFeatureSQLResponse> getGetFeatureSQLMethod;
    if ((getGetFeatureSQLMethod = GraphServiceGrpc.getGetFeatureSQLMethod) == null) {
      synchronized (GraphServiceGrpc.class) {
        if ((getGetFeatureSQLMethod = GraphServiceGrpc.getGetFeatureSQLMethod) == null) {
          GraphServiceGrpc.getGetFeatureSQLMethod = getGetFeatureSQLMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetFeatureSQLRequest, ai.chalk.protos.chalk.server.v1.GetFeatureSQLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeatureSQL"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetFeatureSQLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetFeatureSQLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GraphServiceMethodDescriptorSupplier("GetFeatureSQL"))
              .build();
        }
      }
    }
    return getGetFeatureSQLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataRequest,
      ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataResponse> getGetFeaturesMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeaturesMetadata",
      requestType = ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataRequest,
      ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataResponse> getGetFeaturesMetadataMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataRequest, ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataResponse> getGetFeaturesMetadataMethod;
    if ((getGetFeaturesMetadataMethod = GraphServiceGrpc.getGetFeaturesMetadataMethod) == null) {
      synchronized (GraphServiceGrpc.class) {
        if ((getGetFeaturesMetadataMethod = GraphServiceGrpc.getGetFeaturesMetadataMethod) == null) {
          GraphServiceGrpc.getGetFeaturesMetadataMethod = getGetFeaturesMetadataMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataRequest, ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeaturesMetadata"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GraphServiceMethodDescriptorSupplier("GetFeaturesMetadata"))
              .build();
        }
      }
    }
    return getGetFeaturesMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetGraphRequest,
      ai.chalk.protos.chalk.server.v1.GetGraphResponse> getGetGraphMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGraph",
      requestType = ai.chalk.protos.chalk.server.v1.GetGraphRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetGraphResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetGraphRequest,
      ai.chalk.protos.chalk.server.v1.GetGraphResponse> getGetGraphMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetGraphRequest, ai.chalk.protos.chalk.server.v1.GetGraphResponse> getGetGraphMethod;
    if ((getGetGraphMethod = GraphServiceGrpc.getGetGraphMethod) == null) {
      synchronized (GraphServiceGrpc.class) {
        if ((getGetGraphMethod = GraphServiceGrpc.getGetGraphMethod) == null) {
          GraphServiceGrpc.getGetGraphMethod = getGetGraphMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetGraphRequest, ai.chalk.protos.chalk.server.v1.GetGraphResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGraph"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetGraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetGraphResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GraphServiceMethodDescriptorSupplier("GetGraph"))
              .build();
        }
      }
    }
    return getGetGraphMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateGraphRequest,
      ai.chalk.protos.chalk.server.v1.UpdateGraphResponse> getUpdateGraphMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGraph",
      requestType = ai.chalk.protos.chalk.server.v1.UpdateGraphRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.UpdateGraphResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateGraphRequest,
      ai.chalk.protos.chalk.server.v1.UpdateGraphResponse> getUpdateGraphMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateGraphRequest, ai.chalk.protos.chalk.server.v1.UpdateGraphResponse> getUpdateGraphMethod;
    if ((getUpdateGraphMethod = GraphServiceGrpc.getUpdateGraphMethod) == null) {
      synchronized (GraphServiceGrpc.class) {
        if ((getUpdateGraphMethod = GraphServiceGrpc.getUpdateGraphMethod) == null) {
          GraphServiceGrpc.getUpdateGraphMethod = getUpdateGraphMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.UpdateGraphRequest, ai.chalk.protos.chalk.server.v1.UpdateGraphResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGraph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdateGraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdateGraphResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GraphServiceMethodDescriptorSupplier("UpdateGraph"))
              .build();
        }
      }
    }
    return getUpdateGraphMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GraphServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GraphServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GraphServiceStub>() {
        @java.lang.Override
        public GraphServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GraphServiceStub(channel, callOptions);
        }
      };
    return GraphServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GraphServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GraphServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GraphServiceBlockingStub>() {
        @java.lang.Override
        public GraphServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GraphServiceBlockingStub(channel, callOptions);
        }
      };
    return GraphServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GraphServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GraphServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GraphServiceFutureStub>() {
        @java.lang.Override
        public GraphServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GraphServiceFutureStub(channel, callOptions);
        }
      };
    return GraphServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetFeatureSQL returns the feature SQLs for a given deployment.
     * </pre>
     */
    default void getFeatureSQL(ai.chalk.protos.chalk.server.v1.GetFeatureSQLRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetFeatureSQLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFeatureSQLMethod(), responseObserver);
    }

    /**
     */
    default void getFeaturesMetadata(ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFeaturesMetadataMethod(), responseObserver);
    }

    /**
     */
    default void getGraph(ai.chalk.protos.chalk.server.v1.GetGraphRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetGraphResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGraphMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateGraph uploads the protobuf graph for a given deployment.
     * </pre>
     */
    default void updateGraph(ai.chalk.protos.chalk.server.v1.UpdateGraphRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateGraphResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGraphMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GraphService.
   */
  public static abstract class GraphServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GraphServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GraphService.
   */
  public static final class GraphServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GraphServiceStub> {
    private GraphServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GraphServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GraphServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetFeatureSQL returns the feature SQLs for a given deployment.
     * </pre>
     */
    public void getFeatureSQL(ai.chalk.protos.chalk.server.v1.GetFeatureSQLRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetFeatureSQLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFeatureSQLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFeaturesMetadata(ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFeaturesMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGraph(ai.chalk.protos.chalk.server.v1.GetGraphRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetGraphResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGraphMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateGraph uploads the protobuf graph for a given deployment.
     * </pre>
     */
    public void updateGraph(ai.chalk.protos.chalk.server.v1.UpdateGraphRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateGraphResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGraphMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GraphService.
   */
  public static final class GraphServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GraphServiceBlockingStub> {
    private GraphServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GraphServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GraphServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetFeatureSQL returns the feature SQLs for a given deployment.
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.GetFeatureSQLResponse getFeatureSQL(ai.chalk.protos.chalk.server.v1.GetFeatureSQLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFeatureSQLMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataResponse getFeaturesMetadata(ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFeaturesMetadataMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetGraphResponse getGraph(ai.chalk.protos.chalk.server.v1.GetGraphRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGraphMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateGraph uploads the protobuf graph for a given deployment.
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.UpdateGraphResponse updateGraph(ai.chalk.protos.chalk.server.v1.UpdateGraphRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGraphMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GraphService.
   */
  public static final class GraphServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GraphServiceFutureStub> {
    private GraphServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GraphServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GraphServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetFeatureSQL returns the feature SQLs for a given deployment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetFeatureSQLResponse> getFeatureSQL(
        ai.chalk.protos.chalk.server.v1.GetFeatureSQLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFeatureSQLMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataResponse> getFeaturesMetadata(
        ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFeaturesMetadataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetGraphResponse> getGraph(
        ai.chalk.protos.chalk.server.v1.GetGraphRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGraphMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateGraph uploads the protobuf graph for a given deployment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.UpdateGraphResponse> updateGraph(
        ai.chalk.protos.chalk.server.v1.UpdateGraphRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGraphMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEATURE_SQL = 0;
  private static final int METHODID_GET_FEATURES_METADATA = 1;
  private static final int METHODID_GET_GRAPH = 2;
  private static final int METHODID_UPDATE_GRAPH = 3;

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
        case METHODID_GET_FEATURE_SQL:
          serviceImpl.getFeatureSQL((ai.chalk.protos.chalk.server.v1.GetFeatureSQLRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetFeatureSQLResponse>) responseObserver);
          break;
        case METHODID_GET_FEATURES_METADATA:
          serviceImpl.getFeaturesMetadata((ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataResponse>) responseObserver);
          break;
        case METHODID_GET_GRAPH:
          serviceImpl.getGraph((ai.chalk.protos.chalk.server.v1.GetGraphRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetGraphResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GRAPH:
          serviceImpl.updateGraph((ai.chalk.protos.chalk.server.v1.UpdateGraphRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateGraphResponse>) responseObserver);
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
          getGetFeatureSQLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetFeatureSQLRequest,
              ai.chalk.protos.chalk.server.v1.GetFeatureSQLResponse>(
                service, METHODID_GET_FEATURE_SQL)))
        .addMethod(
          getGetFeaturesMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataRequest,
              ai.chalk.protos.chalk.server.v1.GetFeaturesMetadataResponse>(
                service, METHODID_GET_FEATURES_METADATA)))
        .addMethod(
          getGetGraphMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetGraphRequest,
              ai.chalk.protos.chalk.server.v1.GetGraphResponse>(
                service, METHODID_GET_GRAPH)))
        .addMethod(
          getUpdateGraphMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.UpdateGraphRequest,
              ai.chalk.protos.chalk.server.v1.UpdateGraphResponse>(
                service, METHODID_UPDATE_GRAPH)))
        .build();
  }

  private static abstract class GraphServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GraphServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.GraphProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GraphService");
    }
  }

  private static final class GraphServiceFileDescriptorSupplier
      extends GraphServiceBaseDescriptorSupplier {
    GraphServiceFileDescriptorSupplier() {}
  }

  private static final class GraphServiceMethodDescriptorSupplier
      extends GraphServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GraphServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GraphServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GraphServiceFileDescriptorSupplier())
              .addMethod(getGetFeatureSQLMethod())
              .addMethod(getGetFeaturesMetadataMethod())
              .addMethod(getGetGraphMethod())
              .addMethod(getUpdateGraphMethod())
              .build();
        }
      }
    }
    return result;
  }
}
