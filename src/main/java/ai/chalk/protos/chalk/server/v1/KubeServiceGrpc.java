package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/kube.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class KubeServiceGrpc {

  private KubeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.KubeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpRequest,
      ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpResponse> getGetPodStackTraceDumpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPodStackTraceDump",
      requestType = ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpRequest,
      ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpResponse> getGetPodStackTraceDumpMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpRequest, ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpResponse> getGetPodStackTraceDumpMethod;
    if ((getGetPodStackTraceDumpMethod = KubeServiceGrpc.getGetPodStackTraceDumpMethod) == null) {
      synchronized (KubeServiceGrpc.class) {
        if ((getGetPodStackTraceDumpMethod = KubeServiceGrpc.getGetPodStackTraceDumpMethod) == null) {
          KubeServiceGrpc.getGetPodStackTraceDumpMethod = getGetPodStackTraceDumpMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpRequest, ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPodStackTraceDump"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KubeServiceMethodDescriptorSupplier("GetPodStackTraceDump"))
              .build();
        }
      }
    }
    return getGetPodStackTraceDumpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetKubernetesEventsRequest,
      ai.chalk.protos.chalk.server.v1.GetKubernetesEventsResponse> getGetKubernetesEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKubernetesEvents",
      requestType = ai.chalk.protos.chalk.server.v1.GetKubernetesEventsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetKubernetesEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetKubernetesEventsRequest,
      ai.chalk.protos.chalk.server.v1.GetKubernetesEventsResponse> getGetKubernetesEventsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetKubernetesEventsRequest, ai.chalk.protos.chalk.server.v1.GetKubernetesEventsResponse> getGetKubernetesEventsMethod;
    if ((getGetKubernetesEventsMethod = KubeServiceGrpc.getGetKubernetesEventsMethod) == null) {
      synchronized (KubeServiceGrpc.class) {
        if ((getGetKubernetesEventsMethod = KubeServiceGrpc.getGetKubernetesEventsMethod) == null) {
          KubeServiceGrpc.getGetKubernetesEventsMethod = getGetKubernetesEventsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetKubernetesEventsRequest, ai.chalk.protos.chalk.server.v1.GetKubernetesEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKubernetesEvents"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetKubernetesEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetKubernetesEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KubeServiceMethodDescriptorSupplier("GetKubernetesEvents"))
              .build();
        }
      }
    }
    return getGetKubernetesEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesRequest,
      ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesResponse> getGetKubernetesPersistentVolumesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKubernetesPersistentVolumes",
      requestType = ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesRequest,
      ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesResponse> getGetKubernetesPersistentVolumesMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesRequest, ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesResponse> getGetKubernetesPersistentVolumesMethod;
    if ((getGetKubernetesPersistentVolumesMethod = KubeServiceGrpc.getGetKubernetesPersistentVolumesMethod) == null) {
      synchronized (KubeServiceGrpc.class) {
        if ((getGetKubernetesPersistentVolumesMethod = KubeServiceGrpc.getGetKubernetesPersistentVolumesMethod) == null) {
          KubeServiceGrpc.getGetKubernetesPersistentVolumesMethod = getGetKubernetesPersistentVolumesMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesRequest, ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKubernetesPersistentVolumes"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KubeServiceMethodDescriptorSupplier("GetKubernetesPersistentVolumes"))
              .build();
        }
      }
    }
    return getGetKubernetesPersistentVolumesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KubeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KubeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KubeServiceStub>() {
        @java.lang.Override
        public KubeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KubeServiceStub(channel, callOptions);
        }
      };
    return KubeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KubeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KubeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KubeServiceBlockingStub>() {
        @java.lang.Override
        public KubeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KubeServiceBlockingStub(channel, callOptions);
        }
      };
    return KubeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KubeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KubeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KubeServiceFutureStub>() {
        @java.lang.Override
        public KubeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KubeServiceFutureStub(channel, callOptions);
        }
      };
    return KubeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetPodStackTraceDump gets the stack trace dump from a single process running in a pod
     * The process can be specified either by name or process ID
     * </pre>
     */
    default void getPodStackTraceDump(ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPodStackTraceDumpMethod(), responseObserver);
    }

    /**
     */
    default void getKubernetesEvents(ai.chalk.protos.chalk.server.v1.GetKubernetesEventsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetKubernetesEventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetKubernetesEventsMethod(), responseObserver);
    }

    /**
     */
    default void getKubernetesPersistentVolumes(ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetKubernetesPersistentVolumesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service KubeService.
   */
  public static abstract class KubeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return KubeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service KubeService.
   */
  public static final class KubeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<KubeServiceStub> {
    private KubeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KubeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KubeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetPodStackTraceDump gets the stack trace dump from a single process running in a pod
     * The process can be specified either by name or process ID
     * </pre>
     */
    public void getPodStackTraceDump(ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPodStackTraceDumpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getKubernetesEvents(ai.chalk.protos.chalk.server.v1.GetKubernetesEventsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetKubernetesEventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetKubernetesEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getKubernetesPersistentVolumes(ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetKubernetesPersistentVolumesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service KubeService.
   */
  public static final class KubeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<KubeServiceBlockingStub> {
    private KubeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KubeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KubeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetPodStackTraceDump gets the stack trace dump from a single process running in a pod
     * The process can be specified either by name or process ID
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpResponse getPodStackTraceDump(ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPodStackTraceDumpMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetKubernetesEventsResponse getKubernetesEvents(ai.chalk.protos.chalk.server.v1.GetKubernetesEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetKubernetesEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesResponse getKubernetesPersistentVolumes(ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetKubernetesPersistentVolumesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service KubeService.
   */
  public static final class KubeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<KubeServiceFutureStub> {
    private KubeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KubeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KubeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetPodStackTraceDump gets the stack trace dump from a single process running in a pod
     * The process can be specified either by name or process ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpResponse> getPodStackTraceDump(
        ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPodStackTraceDumpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetKubernetesEventsResponse> getKubernetesEvents(
        ai.chalk.protos.chalk.server.v1.GetKubernetesEventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetKubernetesEventsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesResponse> getKubernetesPersistentVolumes(
        ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetKubernetesPersistentVolumesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_POD_STACK_TRACE_DUMP = 0;
  private static final int METHODID_GET_KUBERNETES_EVENTS = 1;
  private static final int METHODID_GET_KUBERNETES_PERSISTENT_VOLUMES = 2;

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
        case METHODID_GET_POD_STACK_TRACE_DUMP:
          serviceImpl.getPodStackTraceDump((ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpResponse>) responseObserver);
          break;
        case METHODID_GET_KUBERNETES_EVENTS:
          serviceImpl.getKubernetesEvents((ai.chalk.protos.chalk.server.v1.GetKubernetesEventsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetKubernetesEventsResponse>) responseObserver);
          break;
        case METHODID_GET_KUBERNETES_PERSISTENT_VOLUMES:
          serviceImpl.getKubernetesPersistentVolumes((ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesResponse>) responseObserver);
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
          getGetPodStackTraceDumpMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpRequest,
              ai.chalk.protos.chalk.server.v1.GetPodStackTraceDumpResponse>(
                service, METHODID_GET_POD_STACK_TRACE_DUMP)))
        .addMethod(
          getGetKubernetesEventsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetKubernetesEventsRequest,
              ai.chalk.protos.chalk.server.v1.GetKubernetesEventsResponse>(
                service, METHODID_GET_KUBERNETES_EVENTS)))
        .addMethod(
          getGetKubernetesPersistentVolumesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesRequest,
              ai.chalk.protos.chalk.server.v1.GetKubernetesPersistentVolumesResponse>(
                service, METHODID_GET_KUBERNETES_PERSISTENT_VOLUMES)))
        .build();
  }

  private static abstract class KubeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KubeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.KubeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KubeService");
    }
  }

  private static final class KubeServiceFileDescriptorSupplier
      extends KubeServiceBaseDescriptorSupplier {
    KubeServiceFileDescriptorSupplier() {}
  }

  private static final class KubeServiceMethodDescriptorSupplier
      extends KubeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    KubeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (KubeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KubeServiceFileDescriptorSupplier())
              .addMethod(getGetPodStackTraceDumpMethod())
              .addMethod(getGetKubernetesEventsMethod())
              .addMethod(getGetKubernetesPersistentVolumesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
