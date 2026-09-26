package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/datasets.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DatasetMetadataServiceGrpc {

  private DatasetMetadataServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.DatasetMetadataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListDatasetsRequest,
      ai.chalk.protos.chalk.server.v1.ListDatasetsResponse> getListDatasetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDatasets",
      requestType = ai.chalk.protos.chalk.server.v1.ListDatasetsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.ListDatasetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListDatasetsRequest,
      ai.chalk.protos.chalk.server.v1.ListDatasetsResponse> getListDatasetsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListDatasetsRequest, ai.chalk.protos.chalk.server.v1.ListDatasetsResponse> getListDatasetsMethod;
    if ((getListDatasetsMethod = DatasetMetadataServiceGrpc.getListDatasetsMethod) == null) {
      synchronized (DatasetMetadataServiceGrpc.class) {
        if ((getListDatasetsMethod = DatasetMetadataServiceGrpc.getListDatasetsMethod) == null) {
          DatasetMetadataServiceGrpc.getListDatasetsMethod = getListDatasetsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.ListDatasetsRequest, ai.chalk.protos.chalk.server.v1.ListDatasetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDatasets"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListDatasetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListDatasetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetMetadataServiceMethodDescriptorSupplier("ListDatasets"))
              .build();
        }
      }
    }
    return getListDatasetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDatasetRequest,
      ai.chalk.protos.chalk.server.v1.GetDatasetResponse> getGetDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDataset",
      requestType = ai.chalk.protos.chalk.server.v1.GetDatasetRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDatasetRequest,
      ai.chalk.protos.chalk.server.v1.GetDatasetResponse> getGetDatasetMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDatasetRequest, ai.chalk.protos.chalk.server.v1.GetDatasetResponse> getGetDatasetMethod;
    if ((getGetDatasetMethod = DatasetMetadataServiceGrpc.getGetDatasetMethod) == null) {
      synchronized (DatasetMetadataServiceGrpc.class) {
        if ((getGetDatasetMethod = DatasetMetadataServiceGrpc.getGetDatasetMethod) == null) {
          DatasetMetadataServiceGrpc.getGetDatasetMethod = getGetDatasetMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetDatasetRequest, ai.chalk.protos.chalk.server.v1.GetDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDataset"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetMetadataServiceMethodDescriptorSupplier("GetDataset"))
              .build();
        }
      }
    }
    return getGetDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsRequest,
      ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsResponse> getListDatasetRevisionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDatasetRevisions",
      requestType = ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsRequest,
      ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsResponse> getListDatasetRevisionsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsRequest, ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsResponse> getListDatasetRevisionsMethod;
    if ((getListDatasetRevisionsMethod = DatasetMetadataServiceGrpc.getListDatasetRevisionsMethod) == null) {
      synchronized (DatasetMetadataServiceGrpc.class) {
        if ((getListDatasetRevisionsMethod = DatasetMetadataServiceGrpc.getListDatasetRevisionsMethod) == null) {
          DatasetMetadataServiceGrpc.getListDatasetRevisionsMethod = getListDatasetRevisionsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsRequest, ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDatasetRevisions"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetMetadataServiceMethodDescriptorSupplier("ListDatasetRevisions"))
              .build();
        }
      }
    }
    return getListDatasetRevisionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDatasetRevisionRequest,
      ai.chalk.protos.chalk.server.v1.GetDatasetRevisionResponse> getGetDatasetRevisionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDatasetRevision",
      requestType = ai.chalk.protos.chalk.server.v1.GetDatasetRevisionRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetDatasetRevisionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDatasetRevisionRequest,
      ai.chalk.protos.chalk.server.v1.GetDatasetRevisionResponse> getGetDatasetRevisionMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDatasetRevisionRequest, ai.chalk.protos.chalk.server.v1.GetDatasetRevisionResponse> getGetDatasetRevisionMethod;
    if ((getGetDatasetRevisionMethod = DatasetMetadataServiceGrpc.getGetDatasetRevisionMethod) == null) {
      synchronized (DatasetMetadataServiceGrpc.class) {
        if ((getGetDatasetRevisionMethod = DatasetMetadataServiceGrpc.getGetDatasetRevisionMethod) == null) {
          DatasetMetadataServiceGrpc.getGetDatasetRevisionMethod = getGetDatasetRevisionMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetDatasetRevisionRequest, ai.chalk.protos.chalk.server.v1.GetDatasetRevisionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDatasetRevision"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetDatasetRevisionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetDatasetRevisionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetMetadataServiceMethodDescriptorSupplier("GetDatasetRevision"))
              .build();
        }
      }
    }
    return getGetDatasetRevisionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatasetMetadataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatasetMetadataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatasetMetadataServiceStub>() {
        @java.lang.Override
        public DatasetMetadataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatasetMetadataServiceStub(channel, callOptions);
        }
      };
    return DatasetMetadataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatasetMetadataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatasetMetadataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatasetMetadataServiceBlockingStub>() {
        @java.lang.Override
        public DatasetMetadataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatasetMetadataServiceBlockingStub(channel, callOptions);
        }
      };
    return DatasetMetadataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatasetMetadataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatasetMetadataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatasetMetadataServiceFutureStub>() {
        @java.lang.Override
        public DatasetMetadataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatasetMetadataServiceFutureStub(channel, callOptions);
        }
      };
    return DatasetMetadataServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void listDatasets(ai.chalk.protos.chalk.server.v1.ListDatasetsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListDatasetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDatasetsMethod(), responseObserver);
    }

    /**
     */
    default void getDataset(ai.chalk.protos.chalk.server.v1.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDatasetMethod(), responseObserver);
    }

    /**
     */
    default void listDatasetRevisions(ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDatasetRevisionsMethod(), responseObserver);
    }

    /**
     */
    default void getDatasetRevision(ai.chalk.protos.chalk.server.v1.GetDatasetRevisionRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDatasetRevisionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDatasetRevisionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DatasetMetadataService.
   */
  public static abstract class DatasetMetadataServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DatasetMetadataServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DatasetMetadataService.
   */
  public static final class DatasetMetadataServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DatasetMetadataServiceStub> {
    private DatasetMetadataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetMetadataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatasetMetadataServiceStub(channel, callOptions);
    }

    /**
     */
    public void listDatasets(ai.chalk.protos.chalk.server.v1.ListDatasetsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListDatasetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDatasetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDataset(ai.chalk.protos.chalk.server.v1.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDatasetRevisions(ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDatasetRevisionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDatasetRevision(ai.chalk.protos.chalk.server.v1.GetDatasetRevisionRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDatasetRevisionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDatasetRevisionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DatasetMetadataService.
   */
  public static final class DatasetMetadataServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DatasetMetadataServiceBlockingStub> {
    private DatasetMetadataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetMetadataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatasetMetadataServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.ListDatasetsResponse listDatasets(ai.chalk.protos.chalk.server.v1.ListDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDatasetsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetDatasetResponse getDataset(ai.chalk.protos.chalk.server.v1.GetDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatasetMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsResponse listDatasetRevisions(ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDatasetRevisionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetDatasetRevisionResponse getDatasetRevision(ai.chalk.protos.chalk.server.v1.GetDatasetRevisionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatasetRevisionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DatasetMetadataService.
   */
  public static final class DatasetMetadataServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DatasetMetadataServiceFutureStub> {
    private DatasetMetadataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetMetadataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatasetMetadataServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.ListDatasetsResponse> listDatasets(
        ai.chalk.protos.chalk.server.v1.ListDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDatasetsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetDatasetResponse> getDataset(
        ai.chalk.protos.chalk.server.v1.GetDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDatasetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsResponse> listDatasetRevisions(
        ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDatasetRevisionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetDatasetRevisionResponse> getDatasetRevision(
        ai.chalk.protos.chalk.server.v1.GetDatasetRevisionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDatasetRevisionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_DATASETS = 0;
  private static final int METHODID_GET_DATASET = 1;
  private static final int METHODID_LIST_DATASET_REVISIONS = 2;
  private static final int METHODID_GET_DATASET_REVISION = 3;

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
        case METHODID_LIST_DATASETS:
          serviceImpl.listDatasets((ai.chalk.protos.chalk.server.v1.ListDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListDatasetsResponse>) responseObserver);
          break;
        case METHODID_GET_DATASET:
          serviceImpl.getDataset((ai.chalk.protos.chalk.server.v1.GetDatasetRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDatasetResponse>) responseObserver);
          break;
        case METHODID_LIST_DATASET_REVISIONS:
          serviceImpl.listDatasetRevisions((ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsResponse>) responseObserver);
          break;
        case METHODID_GET_DATASET_REVISION:
          serviceImpl.getDatasetRevision((ai.chalk.protos.chalk.server.v1.GetDatasetRevisionRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDatasetRevisionResponse>) responseObserver);
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
          getListDatasetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.ListDatasetsRequest,
              ai.chalk.protos.chalk.server.v1.ListDatasetsResponse>(
                service, METHODID_LIST_DATASETS)))
        .addMethod(
          getGetDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetDatasetRequest,
              ai.chalk.protos.chalk.server.v1.GetDatasetResponse>(
                service, METHODID_GET_DATASET)))
        .addMethod(
          getListDatasetRevisionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsRequest,
              ai.chalk.protos.chalk.server.v1.ListDatasetRevisionsResponse>(
                service, METHODID_LIST_DATASET_REVISIONS)))
        .addMethod(
          getGetDatasetRevisionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetDatasetRevisionRequest,
              ai.chalk.protos.chalk.server.v1.GetDatasetRevisionResponse>(
                service, METHODID_GET_DATASET_REVISION)))
        .build();
  }

  private static abstract class DatasetMetadataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DatasetMetadataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.DatasetsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DatasetMetadataService");
    }
  }

  private static final class DatasetMetadataServiceFileDescriptorSupplier
      extends DatasetMetadataServiceBaseDescriptorSupplier {
    DatasetMetadataServiceFileDescriptorSupplier() {}
  }

  private static final class DatasetMetadataServiceMethodDescriptorSupplier
      extends DatasetMetadataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DatasetMetadataServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DatasetMetadataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DatasetMetadataServiceFileDescriptorSupplier())
              .addMethod(getListDatasetsMethod())
              .addMethod(getGetDatasetMethod())
              .addMethod(getListDatasetRevisionsMethod())
              .addMethod(getGetDatasetRevisionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
