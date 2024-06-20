package ai.chalk.protos.chalk.engine.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The agent service serves non-query related endpoints. None of the endpoints here should depend on the python graph (i.e. no arbitrary code execution) so
 * we need at most one of these per environment. Agents can load the proto graph if required.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/engine/v1/agent_server.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AgentServiceGrpc {

  private AgentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.engine.v1.AgentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesRequest,
      ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesResponse> getGetQueryLogEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueryLogEntries",
      requestType = ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesRequest.class,
      responseType = ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesRequest,
      ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesResponse> getGetQueryLogEntriesMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesRequest, ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesResponse> getGetQueryLogEntriesMethod;
    if ((getGetQueryLogEntriesMethod = AgentServiceGrpc.getGetQueryLogEntriesMethod) == null) {
      synchronized (AgentServiceGrpc.class) {
        if ((getGetQueryLogEntriesMethod = AgentServiceGrpc.getGetQueryLogEntriesMethod) == null) {
          AgentServiceGrpc.getGetQueryLogEntriesMethod = getGetQueryLogEntriesMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesRequest, ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQueryLogEntries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentServiceMethodDescriptorSupplier("GetQueryLogEntries"))
              .build();
        }
      }
    }
    return getGetQueryLogEntriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.GetQueryValuesRequest,
      ai.chalk.protos.chalk.common.v1.GetQueryValuesResponse> getGetQueryValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueryValues",
      requestType = ai.chalk.protos.chalk.common.v1.GetQueryValuesRequest.class,
      responseType = ai.chalk.protos.chalk.common.v1.GetQueryValuesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.GetQueryValuesRequest,
      ai.chalk.protos.chalk.common.v1.GetQueryValuesResponse> getGetQueryValuesMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.common.v1.GetQueryValuesRequest, ai.chalk.protos.chalk.common.v1.GetQueryValuesResponse> getGetQueryValuesMethod;
    if ((getGetQueryValuesMethod = AgentServiceGrpc.getGetQueryValuesMethod) == null) {
      synchronized (AgentServiceGrpc.class) {
        if ((getGetQueryValuesMethod = AgentServiceGrpc.getGetQueryValuesMethod) == null) {
          AgentServiceGrpc.getGetQueryValuesMethod = getGetQueryValuesMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.common.v1.GetQueryValuesRequest, ai.chalk.protos.chalk.common.v1.GetQueryValuesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQueryValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.common.v1.GetQueryValuesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.common.v1.GetQueryValuesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentServiceMethodDescriptorSupplier("GetQueryValues"))
              .build();
        }
      }
    }
    return getGetQueryValuesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentServiceStub>() {
        @java.lang.Override
        public AgentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentServiceStub(channel, callOptions);
        }
      };
    return AgentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentServiceBlockingStub>() {
        @java.lang.Override
        public AgentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentServiceBlockingStub(channel, callOptions);
        }
      };
    return AgentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentServiceFutureStub>() {
        @java.lang.Override
        public AgentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentServiceFutureStub(channel, callOptions);
        }
      };
    return AgentServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The agent service serves non-query related endpoints. None of the endpoints here should depend on the python graph (i.e. no arbitrary code execution) so
   * we need at most one of these per environment. Agents can load the proto graph if required.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getQueryLogEntries(ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueryLogEntriesMethod(), responseObserver);
    }

    /**
     */
    default void getQueryValues(ai.chalk.protos.chalk.common.v1.GetQueryValuesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.GetQueryValuesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueryValuesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AgentService.
   * <pre>
   * The agent service serves non-query related endpoints. None of the endpoints here should depend on the python graph (i.e. no arbitrary code execution) so
   * we need at most one of these per environment. Agents can load the proto graph if required.
   * </pre>
   */
  public static abstract class AgentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AgentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AgentService.
   * <pre>
   * The agent service serves non-query related endpoints. None of the endpoints here should depend on the python graph (i.e. no arbitrary code execution) so
   * we need at most one of these per environment. Agents can load the proto graph if required.
   * </pre>
   */
  public static final class AgentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AgentServiceStub> {
    private AgentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getQueryLogEntries(ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQueryLogEntriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQueryValues(ai.chalk.protos.chalk.common.v1.GetQueryValuesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.GetQueryValuesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQueryValuesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AgentService.
   * <pre>
   * The agent service serves non-query related endpoints. None of the endpoints here should depend on the python graph (i.e. no arbitrary code execution) so
   * we need at most one of these per environment. Agents can load the proto graph if required.
   * </pre>
   */
  public static final class AgentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AgentServiceBlockingStub> {
    private AgentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesResponse getQueryLogEntries(ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQueryLogEntriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.common.v1.GetQueryValuesResponse getQueryValues(ai.chalk.protos.chalk.common.v1.GetQueryValuesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQueryValuesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AgentService.
   * <pre>
   * The agent service serves non-query related endpoints. None of the endpoints here should depend on the python graph (i.e. no arbitrary code execution) so
   * we need at most one of these per environment. Agents can load the proto graph if required.
   * </pre>
   */
  public static final class AgentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AgentServiceFutureStub> {
    private AgentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesResponse> getQueryLogEntries(
        ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQueryLogEntriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.common.v1.GetQueryValuesResponse> getQueryValues(
        ai.chalk.protos.chalk.common.v1.GetQueryValuesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQueryValuesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_QUERY_LOG_ENTRIES = 0;
  private static final int METHODID_GET_QUERY_VALUES = 1;

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
        case METHODID_GET_QUERY_LOG_ENTRIES:
          serviceImpl.getQueryLogEntries((ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesResponse>) responseObserver);
          break;
        case METHODID_GET_QUERY_VALUES:
          serviceImpl.getQueryValues((ai.chalk.protos.chalk.common.v1.GetQueryValuesRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.common.v1.GetQueryValuesResponse>) responseObserver);
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
          getGetQueryLogEntriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesRequest,
              ai.chalk.protos.chalk.common.v1.GetQueryLogEntriesResponse>(
                service, METHODID_GET_QUERY_LOG_ENTRIES)))
        .addMethod(
          getGetQueryValuesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.common.v1.GetQueryValuesRequest,
              ai.chalk.protos.chalk.common.v1.GetQueryValuesResponse>(
                service, METHODID_GET_QUERY_VALUES)))
        .build();
  }

  private static abstract class AgentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.engine.v1.AgentServerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AgentService");
    }
  }

  private static final class AgentServiceFileDescriptorSupplier
      extends AgentServiceBaseDescriptorSupplier {
    AgentServiceFileDescriptorSupplier() {}
  }

  private static final class AgentServiceMethodDescriptorSupplier
      extends AgentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AgentServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AgentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgentServiceFileDescriptorSupplier())
              .addMethod(getGetQueryLogEntriesMethod())
              .addMethod(getGetQueryValuesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
