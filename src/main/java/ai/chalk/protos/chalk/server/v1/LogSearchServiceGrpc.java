package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/log.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LogSearchServiceGrpc {

  private LogSearchServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.LogSearchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.SearchLogEntriesRequest,
      ai.chalk.protos.chalk.server.v1.SearchLogEntriesResponse> getSearchLogEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchLogEntries",
      requestType = ai.chalk.protos.chalk.server.v1.SearchLogEntriesRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.SearchLogEntriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.SearchLogEntriesRequest,
      ai.chalk.protos.chalk.server.v1.SearchLogEntriesResponse> getSearchLogEntriesMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.SearchLogEntriesRequest, ai.chalk.protos.chalk.server.v1.SearchLogEntriesResponse> getSearchLogEntriesMethod;
    if ((getSearchLogEntriesMethod = LogSearchServiceGrpc.getSearchLogEntriesMethod) == null) {
      synchronized (LogSearchServiceGrpc.class) {
        if ((getSearchLogEntriesMethod = LogSearchServiceGrpc.getSearchLogEntriesMethod) == null) {
          LogSearchServiceGrpc.getSearchLogEntriesMethod = getSearchLogEntriesMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.SearchLogEntriesRequest, ai.chalk.protos.chalk.server.v1.SearchLogEntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchLogEntries"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.SearchLogEntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.SearchLogEntriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogSearchServiceMethodDescriptorSupplier("SearchLogEntries"))
              .build();
        }
      }
    }
    return getSearchLogEntriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogSearchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogSearchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogSearchServiceStub>() {
        @java.lang.Override
        public LogSearchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogSearchServiceStub(channel, callOptions);
        }
      };
    return LogSearchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogSearchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogSearchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogSearchServiceBlockingStub>() {
        @java.lang.Override
        public LogSearchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogSearchServiceBlockingStub(channel, callOptions);
        }
      };
    return LogSearchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogSearchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogSearchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogSearchServiceFutureStub>() {
        @java.lang.Override
        public LogSearchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogSearchServiceFutureStub(channel, callOptions);
        }
      };
    return LogSearchServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void searchLogEntries(ai.chalk.protos.chalk.server.v1.SearchLogEntriesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.SearchLogEntriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchLogEntriesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LogSearchService.
   */
  public static abstract class LogSearchServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LogSearchServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LogSearchService.
   */
  public static final class LogSearchServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LogSearchServiceStub> {
    private LogSearchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogSearchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogSearchServiceStub(channel, callOptions);
    }

    /**
     */
    public void searchLogEntries(ai.chalk.protos.chalk.server.v1.SearchLogEntriesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.SearchLogEntriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchLogEntriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LogSearchService.
   */
  public static final class LogSearchServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LogSearchServiceBlockingStub> {
    private LogSearchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogSearchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogSearchServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.SearchLogEntriesResponse searchLogEntries(ai.chalk.protos.chalk.server.v1.SearchLogEntriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchLogEntriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LogSearchService.
   */
  public static final class LogSearchServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LogSearchServiceFutureStub> {
    private LogSearchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogSearchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogSearchServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.SearchLogEntriesResponse> searchLogEntries(
        ai.chalk.protos.chalk.server.v1.SearchLogEntriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchLogEntriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_LOG_ENTRIES = 0;

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
        case METHODID_SEARCH_LOG_ENTRIES:
          serviceImpl.searchLogEntries((ai.chalk.protos.chalk.server.v1.SearchLogEntriesRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.SearchLogEntriesResponse>) responseObserver);
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
          getSearchLogEntriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.SearchLogEntriesRequest,
              ai.chalk.protos.chalk.server.v1.SearchLogEntriesResponse>(
                service, METHODID_SEARCH_LOG_ENTRIES)))
        .build();
  }

  private static abstract class LogSearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogSearchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.LogProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogSearchService");
    }
  }

  private static final class LogSearchServiceFileDescriptorSupplier
      extends LogSearchServiceBaseDescriptorSupplier {
    LogSearchServiceFileDescriptorSupplier() {}
  }

  private static final class LogSearchServiceMethodDescriptorSupplier
      extends LogSearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LogSearchServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LogSearchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogSearchServiceFileDescriptorSupplier())
              .addMethod(getSearchLogEntriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
