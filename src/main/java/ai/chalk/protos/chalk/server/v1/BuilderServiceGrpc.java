package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/builder.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BuilderServiceGrpc {

  private BuilderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.BuilderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetSearchConfigRequest,
      ai.chalk.protos.chalk.server.v1.GetSearchConfigResponse> getGetSearchConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSearchConfig",
      requestType = ai.chalk.protos.chalk.server.v1.GetSearchConfigRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetSearchConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetSearchConfigRequest,
      ai.chalk.protos.chalk.server.v1.GetSearchConfigResponse> getGetSearchConfigMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetSearchConfigRequest, ai.chalk.protos.chalk.server.v1.GetSearchConfigResponse> getGetSearchConfigMethod;
    if ((getGetSearchConfigMethod = BuilderServiceGrpc.getGetSearchConfigMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getGetSearchConfigMethod = BuilderServiceGrpc.getGetSearchConfigMethod) == null) {
          BuilderServiceGrpc.getGetSearchConfigMethod = getGetSearchConfigMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetSearchConfigRequest, ai.chalk.protos.chalk.server.v1.GetSearchConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSearchConfig"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetSearchConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetSearchConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("GetSearchConfig"))
              .build();
        }
      }
    }
    return getGetSearchConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse> getActivateDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateDeployment",
      requestType = ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse> getActivateDeploymentMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest, ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse> getActivateDeploymentMethod;
    if ((getActivateDeploymentMethod = BuilderServiceGrpc.getActivateDeploymentMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getActivateDeploymentMethod = BuilderServiceGrpc.getActivateDeploymentMethod) == null) {
          BuilderServiceGrpc.getActivateDeploymentMethod = getActivateDeploymentMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest, ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActivateDeployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("ActivateDeployment"))
              .build();
        }
      }
    }
    return getActivateDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.IndexDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.IndexDeploymentResponse> getIndexDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IndexDeployment",
      requestType = ai.chalk.protos.chalk.server.v1.IndexDeploymentRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.IndexDeploymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.IndexDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.IndexDeploymentResponse> getIndexDeploymentMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.IndexDeploymentRequest, ai.chalk.protos.chalk.server.v1.IndexDeploymentResponse> getIndexDeploymentMethod;
    if ((getIndexDeploymentMethod = BuilderServiceGrpc.getIndexDeploymentMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getIndexDeploymentMethod = BuilderServiceGrpc.getIndexDeploymentMethod) == null) {
          BuilderServiceGrpc.getIndexDeploymentMethod = getIndexDeploymentMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.IndexDeploymentRequest, ai.chalk.protos.chalk.server.v1.IndexDeploymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IndexDeployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.IndexDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.IndexDeploymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("IndexDeployment"))
              .build();
        }
      }
    }
    return getIndexDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeployKubeComponentsRequest,
      ai.chalk.protos.chalk.server.v1.DeployKubeComponentsResponse> getDeployKubeComponentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeployKubeComponents",
      requestType = ai.chalk.protos.chalk.server.v1.DeployKubeComponentsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.DeployKubeComponentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeployKubeComponentsRequest,
      ai.chalk.protos.chalk.server.v1.DeployKubeComponentsResponse> getDeployKubeComponentsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeployKubeComponentsRequest, ai.chalk.protos.chalk.server.v1.DeployKubeComponentsResponse> getDeployKubeComponentsMethod;
    if ((getDeployKubeComponentsMethod = BuilderServiceGrpc.getDeployKubeComponentsMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getDeployKubeComponentsMethod = BuilderServiceGrpc.getDeployKubeComponentsMethod) == null) {
          BuilderServiceGrpc.getDeployKubeComponentsMethod = getDeployKubeComponentsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.DeployKubeComponentsRequest, ai.chalk.protos.chalk.server.v1.DeployKubeComponentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeployKubeComponents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.DeployKubeComponentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.DeployKubeComponentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("DeployKubeComponents"))
              .build();
        }
      }
    }
    return getDeployKubeComponentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.RebuildDeploymentResponse> getRebuildDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RebuildDeployment",
      requestType = ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.RebuildDeploymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.RebuildDeploymentResponse> getRebuildDeploymentMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest, ai.chalk.protos.chalk.server.v1.RebuildDeploymentResponse> getRebuildDeploymentMethod;
    if ((getRebuildDeploymentMethod = BuilderServiceGrpc.getRebuildDeploymentMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getRebuildDeploymentMethod = BuilderServiceGrpc.getRebuildDeploymentMethod) == null) {
          BuilderServiceGrpc.getRebuildDeploymentMethod = getRebuildDeploymentMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest, ai.chalk.protos.chalk.server.v1.RebuildDeploymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RebuildDeployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.RebuildDeploymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("RebuildDeployment"))
              .build();
        }
      }
    }
    return getRebuildDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.RedeployDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.RedeployDeploymentResponse> getRedeployDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RedeployDeployment",
      requestType = ai.chalk.protos.chalk.server.v1.RedeployDeploymentRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.RedeployDeploymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.RedeployDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.RedeployDeploymentResponse> getRedeployDeploymentMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.RedeployDeploymentRequest, ai.chalk.protos.chalk.server.v1.RedeployDeploymentResponse> getRedeployDeploymentMethod;
    if ((getRedeployDeploymentMethod = BuilderServiceGrpc.getRedeployDeploymentMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getRedeployDeploymentMethod = BuilderServiceGrpc.getRedeployDeploymentMethod) == null) {
          BuilderServiceGrpc.getRedeployDeploymentMethod = getRedeployDeploymentMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.RedeployDeploymentRequest, ai.chalk.protos.chalk.server.v1.RedeployDeploymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RedeployDeployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.RedeployDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.RedeployDeploymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("RedeployDeployment"))
              .build();
        }
      }
    }
    return getRedeployDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UploadSourceRequest,
      ai.chalk.protos.chalk.server.v1.UploadSourceResponse> getUploadSourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadSource",
      requestType = ai.chalk.protos.chalk.server.v1.UploadSourceRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.UploadSourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UploadSourceRequest,
      ai.chalk.protos.chalk.server.v1.UploadSourceResponse> getUploadSourceMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UploadSourceRequest, ai.chalk.protos.chalk.server.v1.UploadSourceResponse> getUploadSourceMethod;
    if ((getUploadSourceMethod = BuilderServiceGrpc.getUploadSourceMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getUploadSourceMethod = BuilderServiceGrpc.getUploadSourceMethod) == null) {
          BuilderServiceGrpc.getUploadSourceMethod = getUploadSourceMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.UploadSourceRequest, ai.chalk.protos.chalk.server.v1.UploadSourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UploadSourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UploadSourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("UploadSource"))
              .build();
        }
      }
    }
    return getUploadSourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.LintSourceRequest,
      ai.chalk.protos.chalk.server.v1.LintSourceResponse> getLintSourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LintSource",
      requestType = ai.chalk.protos.chalk.server.v1.LintSourceRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.LintSourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.LintSourceRequest,
      ai.chalk.protos.chalk.server.v1.LintSourceResponse> getLintSourceMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.LintSourceRequest, ai.chalk.protos.chalk.server.v1.LintSourceResponse> getLintSourceMethod;
    if ((getLintSourceMethod = BuilderServiceGrpc.getLintSourceMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getLintSourceMethod = BuilderServiceGrpc.getLintSourceMethod) == null) {
          BuilderServiceGrpc.getLintSourceMethod = getLintSourceMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.LintSourceRequest, ai.chalk.protos.chalk.server.v1.LintSourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LintSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.LintSourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.LintSourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("LintSource"))
              .build();
        }
      }
    }
    return getLintSourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDeploymentStepsRequest,
      ai.chalk.protos.chalk.server.v1.GetDeploymentStepsResponse> getGetDeploymentStepsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeploymentSteps",
      requestType = ai.chalk.protos.chalk.server.v1.GetDeploymentStepsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetDeploymentStepsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDeploymentStepsRequest,
      ai.chalk.protos.chalk.server.v1.GetDeploymentStepsResponse> getGetDeploymentStepsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDeploymentStepsRequest, ai.chalk.protos.chalk.server.v1.GetDeploymentStepsResponse> getGetDeploymentStepsMethod;
    if ((getGetDeploymentStepsMethod = BuilderServiceGrpc.getGetDeploymentStepsMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getGetDeploymentStepsMethod = BuilderServiceGrpc.getGetDeploymentStepsMethod) == null) {
          BuilderServiceGrpc.getGetDeploymentStepsMethod = getGetDeploymentStepsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetDeploymentStepsRequest, ai.chalk.protos.chalk.server.v1.GetDeploymentStepsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDeploymentSteps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetDeploymentStepsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetDeploymentStepsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("GetDeploymentSteps"))
              .build();
        }
      }
    }
    return getGetDeploymentStepsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDeploymentLogsRequest,
      ai.chalk.protos.chalk.server.v1.GetDeploymentLogsResponse> getGetDeploymentLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeploymentLogs",
      requestType = ai.chalk.protos.chalk.server.v1.GetDeploymentLogsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetDeploymentLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDeploymentLogsRequest,
      ai.chalk.protos.chalk.server.v1.GetDeploymentLogsResponse> getGetDeploymentLogsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDeploymentLogsRequest, ai.chalk.protos.chalk.server.v1.GetDeploymentLogsResponse> getGetDeploymentLogsMethod;
    if ((getGetDeploymentLogsMethod = BuilderServiceGrpc.getGetDeploymentLogsMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getGetDeploymentLogsMethod = BuilderServiceGrpc.getGetDeploymentLogsMethod) == null) {
          BuilderServiceGrpc.getGetDeploymentLogsMethod = getGetDeploymentLogsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetDeploymentLogsRequest, ai.chalk.protos.chalk.server.v1.GetDeploymentLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDeploymentLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetDeploymentLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetDeploymentLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("GetDeploymentLogs"))
              .build();
        }
      }
    }
    return getGetDeploymentLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBRequest,
      ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBResponse> getGetClusterTimescaleDBMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClusterTimescaleDB",
      requestType = ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBRequest,
      ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBResponse> getGetClusterTimescaleDBMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBRequest, ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBResponse> getGetClusterTimescaleDBMethod;
    if ((getGetClusterTimescaleDBMethod = BuilderServiceGrpc.getGetClusterTimescaleDBMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getGetClusterTimescaleDBMethod = BuilderServiceGrpc.getGetClusterTimescaleDBMethod) == null) {
          BuilderServiceGrpc.getGetClusterTimescaleDBMethod = getGetClusterTimescaleDBMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBRequest, ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClusterTimescaleDB"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("GetClusterTimescaleDB"))
              .build();
        }
      }
    }
    return getGetClusterTimescaleDBMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetClusterGatewayRequest,
      ai.chalk.protos.chalk.server.v1.GetClusterGatewayResponse> getGetClusterGatewayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClusterGateway",
      requestType = ai.chalk.protos.chalk.server.v1.GetClusterGatewayRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetClusterGatewayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetClusterGatewayRequest,
      ai.chalk.protos.chalk.server.v1.GetClusterGatewayResponse> getGetClusterGatewayMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetClusterGatewayRequest, ai.chalk.protos.chalk.server.v1.GetClusterGatewayResponse> getGetClusterGatewayMethod;
    if ((getGetClusterGatewayMethod = BuilderServiceGrpc.getGetClusterGatewayMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getGetClusterGatewayMethod = BuilderServiceGrpc.getGetClusterGatewayMethod) == null) {
          BuilderServiceGrpc.getGetClusterGatewayMethod = getGetClusterGatewayMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetClusterGatewayRequest, ai.chalk.protos.chalk.server.v1.GetClusterGatewayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClusterGateway"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetClusterGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetClusterGatewayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("GetClusterGateway"))
              .build();
        }
      }
    }
    return getGetClusterGatewayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceRequest,
      ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceResponse> getGetClusterBackgroundPersistenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClusterBackgroundPersistence",
      requestType = ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceRequest,
      ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceResponse> getGetClusterBackgroundPersistenceMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceRequest, ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceResponse> getGetClusterBackgroundPersistenceMethod;
    if ((getGetClusterBackgroundPersistenceMethod = BuilderServiceGrpc.getGetClusterBackgroundPersistenceMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getGetClusterBackgroundPersistenceMethod = BuilderServiceGrpc.getGetClusterBackgroundPersistenceMethod) == null) {
          BuilderServiceGrpc.getGetClusterBackgroundPersistenceMethod = getGetClusterBackgroundPersistenceMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceRequest, ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClusterBackgroundPersistence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("GetClusterBackgroundPersistence"))
              .build();
        }
      }
    }
    return getGetClusterBackgroundPersistenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBRequest,
      ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBResponse> getCreateClusterTimescaleDBMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateClusterTimescaleDB",
      requestType = ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBRequest,
      ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBResponse> getCreateClusterTimescaleDBMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBRequest, ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBResponse> getCreateClusterTimescaleDBMethod;
    if ((getCreateClusterTimescaleDBMethod = BuilderServiceGrpc.getCreateClusterTimescaleDBMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getCreateClusterTimescaleDBMethod = BuilderServiceGrpc.getCreateClusterTimescaleDBMethod) == null) {
          BuilderServiceGrpc.getCreateClusterTimescaleDBMethod = getCreateClusterTimescaleDBMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBRequest, ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateClusterTimescaleDB"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("CreateClusterTimescaleDB"))
              .build();
        }
      }
    }
    return getCreateClusterTimescaleDBMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBRequest,
      ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBResponse> getMigrateClusterTimescaleDBMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MigrateClusterTimescaleDB",
      requestType = ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBRequest,
      ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBResponse> getMigrateClusterTimescaleDBMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBRequest, ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBResponse> getMigrateClusterTimescaleDBMethod;
    if ((getMigrateClusterTimescaleDBMethod = BuilderServiceGrpc.getMigrateClusterTimescaleDBMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getMigrateClusterTimescaleDBMethod = BuilderServiceGrpc.getMigrateClusterTimescaleDBMethod) == null) {
          BuilderServiceGrpc.getMigrateClusterTimescaleDBMethod = getMigrateClusterTimescaleDBMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBRequest, ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MigrateClusterTimescaleDB"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("MigrateClusterTimescaleDB"))
              .build();
        }
      }
    }
    return getMigrateClusterTimescaleDBMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest,
      ai.chalk.protos.chalk.server.v1.CreateClusterGatewayResponse> getCreateClusterGatewayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateClusterGateway",
      requestType = ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.CreateClusterGatewayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest,
      ai.chalk.protos.chalk.server.v1.CreateClusterGatewayResponse> getCreateClusterGatewayMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest, ai.chalk.protos.chalk.server.v1.CreateClusterGatewayResponse> getCreateClusterGatewayMethod;
    if ((getCreateClusterGatewayMethod = BuilderServiceGrpc.getCreateClusterGatewayMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getCreateClusterGatewayMethod = BuilderServiceGrpc.getCreateClusterGatewayMethod) == null) {
          BuilderServiceGrpc.getCreateClusterGatewayMethod = getCreateClusterGatewayMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest, ai.chalk.protos.chalk.server.v1.CreateClusterGatewayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateClusterGateway"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateClusterGatewayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("CreateClusterGateway"))
              .build();
        }
      }
    }
    return getCreateClusterGatewayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest,
      ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceResponse> getCreateClusterBackgroundPersistenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateClusterBackgroundPersistence",
      requestType = ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest,
      ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceResponse> getCreateClusterBackgroundPersistenceMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest, ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceResponse> getCreateClusterBackgroundPersistenceMethod;
    if ((getCreateClusterBackgroundPersistenceMethod = BuilderServiceGrpc.getCreateClusterBackgroundPersistenceMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getCreateClusterBackgroundPersistenceMethod = BuilderServiceGrpc.getCreateClusterBackgroundPersistenceMethod) == null) {
          BuilderServiceGrpc.getCreateClusterBackgroundPersistenceMethod = getCreateClusterBackgroundPersistenceMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest, ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateClusterBackgroundPersistence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("CreateClusterBackgroundPersistence"))
              .build();
        }
      }
    }
    return getCreateClusterBackgroundPersistenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesRequest,
      ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesResponse> getUpdateEnvironmentVariablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEnvironmentVariables",
      requestType = ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesRequest,
      ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesResponse> getUpdateEnvironmentVariablesMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesRequest, ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesResponse> getUpdateEnvironmentVariablesMethod;
    if ((getUpdateEnvironmentVariablesMethod = BuilderServiceGrpc.getUpdateEnvironmentVariablesMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getUpdateEnvironmentVariablesMethod = BuilderServiceGrpc.getUpdateEnvironmentVariablesMethod) == null) {
          BuilderServiceGrpc.getUpdateEnvironmentVariablesMethod = getUpdateEnvironmentVariablesMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesRequest, ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEnvironmentVariables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("UpdateEnvironmentVariables"))
              .build();
        }
      }
    }
    return getUpdateEnvironmentVariablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.StartBranchRequest,
      ai.chalk.protos.chalk.server.v1.StartBranchResponse> getStartBranchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartBranch",
      requestType = ai.chalk.protos.chalk.server.v1.StartBranchRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.StartBranchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.StartBranchRequest,
      ai.chalk.protos.chalk.server.v1.StartBranchResponse> getStartBranchMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.StartBranchRequest, ai.chalk.protos.chalk.server.v1.StartBranchResponse> getStartBranchMethod;
    if ((getStartBranchMethod = BuilderServiceGrpc.getStartBranchMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getStartBranchMethod = BuilderServiceGrpc.getStartBranchMethod) == null) {
          BuilderServiceGrpc.getStartBranchMethod = getStartBranchMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.StartBranchRequest, ai.chalk.protos.chalk.server.v1.StartBranchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartBranch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.StartBranchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.StartBranchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("StartBranch"))
              .build();
        }
      }
    }
    return getStartBranchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsRequest,
      ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsResponse> getGetKarpenterNodepoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKarpenterNodepools",
      requestType = ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsRequest,
      ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsResponse> getGetKarpenterNodepoolsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsRequest, ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsResponse> getGetKarpenterNodepoolsMethod;
    if ((getGetKarpenterNodepoolsMethod = BuilderServiceGrpc.getGetKarpenterNodepoolsMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getGetKarpenterNodepoolsMethod = BuilderServiceGrpc.getGetKarpenterNodepoolsMethod) == null) {
          BuilderServiceGrpc.getGetKarpenterNodepoolsMethod = getGetKarpenterNodepoolsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsRequest, ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKarpenterNodepools"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("GetKarpenterNodepools"))
              .build();
        }
      }
    }
    return getGetKarpenterNodepoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolRequest,
      ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolResponse> getAddKarpenterNodepoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddKarpenterNodepool",
      requestType = ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolRequest,
      ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolResponse> getAddKarpenterNodepoolMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolRequest, ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolResponse> getAddKarpenterNodepoolMethod;
    if ((getAddKarpenterNodepoolMethod = BuilderServiceGrpc.getAddKarpenterNodepoolMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getAddKarpenterNodepoolMethod = BuilderServiceGrpc.getAddKarpenterNodepoolMethod) == null) {
          BuilderServiceGrpc.getAddKarpenterNodepoolMethod = getAddKarpenterNodepoolMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolRequest, ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddKarpenterNodepool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("AddKarpenterNodepool"))
              .build();
        }
      }
    }
    return getAddKarpenterNodepoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolRequest,
      ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolResponse> getUpdateKarpenterNodepoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateKarpenterNodepool",
      requestType = ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolRequest,
      ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolResponse> getUpdateKarpenterNodepoolMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolRequest, ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolResponse> getUpdateKarpenterNodepoolMethod;
    if ((getUpdateKarpenterNodepoolMethod = BuilderServiceGrpc.getUpdateKarpenterNodepoolMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getUpdateKarpenterNodepoolMethod = BuilderServiceGrpc.getUpdateKarpenterNodepoolMethod) == null) {
          BuilderServiceGrpc.getUpdateKarpenterNodepoolMethod = getUpdateKarpenterNodepoolMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolRequest, ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateKarpenterNodepool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("UpdateKarpenterNodepool"))
              .build();
        }
      }
    }
    return getUpdateKarpenterNodepoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolRequest,
      ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolResponse> getDeleteKarpenterNodepoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteKarpenterNodepool",
      requestType = ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolRequest,
      ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolResponse> getDeleteKarpenterNodepoolMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolRequest, ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolResponse> getDeleteKarpenterNodepoolMethod;
    if ((getDeleteKarpenterNodepoolMethod = BuilderServiceGrpc.getDeleteKarpenterNodepoolMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getDeleteKarpenterNodepoolMethod = BuilderServiceGrpc.getDeleteKarpenterNodepoolMethod) == null) {
          BuilderServiceGrpc.getDeleteKarpenterNodepoolMethod = getDeleteKarpenterNodepoolMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolRequest, ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteKarpenterNodepool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("DeleteKarpenterNodepool"))
              .build();
        }
      }
    }
    return getDeleteKarpenterNodepoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataRequest,
      ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataResponse> getGetKarpenterInstallationMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKarpenterInstallationMetadata",
      requestType = ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataRequest,
      ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataResponse> getGetKarpenterInstallationMetadataMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataRequest, ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataResponse> getGetKarpenterInstallationMetadataMethod;
    if ((getGetKarpenterInstallationMetadataMethod = BuilderServiceGrpc.getGetKarpenterInstallationMetadataMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getGetKarpenterInstallationMetadataMethod = BuilderServiceGrpc.getGetKarpenterInstallationMetadataMethod) == null) {
          BuilderServiceGrpc.getGetKarpenterInstallationMetadataMethod = getGetKarpenterInstallationMetadataMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataRequest, ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKarpenterInstallationMetadata"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("GetKarpenterInstallationMetadata"))
              .build();
        }
      }
    }
    return getGetKarpenterInstallationMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetTagWeightsRequest,
      ai.chalk.protos.chalk.server.v1.GetTagWeightsResponse> getGetTagWeightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTagWeights",
      requestType = ai.chalk.protos.chalk.server.v1.GetTagWeightsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetTagWeightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetTagWeightsRequest,
      ai.chalk.protos.chalk.server.v1.GetTagWeightsResponse> getGetTagWeightsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetTagWeightsRequest, ai.chalk.protos.chalk.server.v1.GetTagWeightsResponse> getGetTagWeightsMethod;
    if ((getGetTagWeightsMethod = BuilderServiceGrpc.getGetTagWeightsMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getGetTagWeightsMethod = BuilderServiceGrpc.getGetTagWeightsMethod) == null) {
          BuilderServiceGrpc.getGetTagWeightsMethod = getGetTagWeightsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetTagWeightsRequest, ai.chalk.protos.chalk.server.v1.GetTagWeightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTagWeights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetTagWeightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetTagWeightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("GetTagWeights"))
              .build();
        }
      }
    }
    return getGetTagWeightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.SetTagWeightsRequest,
      ai.chalk.protos.chalk.server.v1.SetTagWeightsResponse> getSetTagWeightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTagWeights",
      requestType = ai.chalk.protos.chalk.server.v1.SetTagWeightsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.SetTagWeightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.SetTagWeightsRequest,
      ai.chalk.protos.chalk.server.v1.SetTagWeightsResponse> getSetTagWeightsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.SetTagWeightsRequest, ai.chalk.protos.chalk.server.v1.SetTagWeightsResponse> getSetTagWeightsMethod;
    if ((getSetTagWeightsMethod = BuilderServiceGrpc.getSetTagWeightsMethod) == null) {
      synchronized (BuilderServiceGrpc.class) {
        if ((getSetTagWeightsMethod = BuilderServiceGrpc.getSetTagWeightsMethod) == null) {
          BuilderServiceGrpc.getSetTagWeightsMethod = getSetTagWeightsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.SetTagWeightsRequest, ai.chalk.protos.chalk.server.v1.SetTagWeightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTagWeights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.SetTagWeightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.SetTagWeightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuilderServiceMethodDescriptorSupplier("SetTagWeights"))
              .build();
        }
      }
    }
    return getSetTagWeightsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BuilderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BuilderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BuilderServiceStub>() {
        @java.lang.Override
        public BuilderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BuilderServiceStub(channel, callOptions);
        }
      };
    return BuilderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BuilderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BuilderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BuilderServiceBlockingStub>() {
        @java.lang.Override
        public BuilderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BuilderServiceBlockingStub(channel, callOptions);
        }
      };
    return BuilderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BuilderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BuilderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BuilderServiceFutureStub>() {
        @java.lang.Override
        public BuilderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BuilderServiceFutureStub(channel, callOptions);
        }
      };
    return BuilderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getSearchConfig(ai.chalk.protos.chalk.server.v1.GetSearchConfigRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetSearchConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSearchConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Takes an existing (past) deployment and promotes the k8s resources / other things associated with it.
     * Useful for debugging in local development where the auto activation doesn't work b/c no pubsub.
     * </pre>
     */
    default void activateDeployment(ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateDeploymentMethod(), responseObserver);
    }

    /**
     */
    default void indexDeployment(ai.chalk.protos.chalk.server.v1.IndexDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.IndexDeploymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIndexDeploymentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Intermediate step in the deployment activation process. Allows for partial migration to the new
     * go-api-server builder service.
     * </pre>
     */
    default void deployKubeComponents(ai.chalk.protos.chalk.server.v1.DeployKubeComponentsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeployKubeComponentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeployKubeComponentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Takes an existing (past) deployment and re-creates the image associated with it,
     * publishing the image as 'new_image_tag'.
     * </pre>
     */
    default void rebuildDeployment(ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.RebuildDeploymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRebuildDeploymentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Triggers a new build with the source code from this deployment and deploys the result
     * </pre>
     */
    default void redeployDeployment(ai.chalk.protos.chalk.server.v1.RedeployDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.RedeployDeploymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRedeployDeploymentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Triggers a new build with the provided source code archive and deploys the result
     * </pre>
     */
    default void uploadSource(ai.chalk.protos.chalk.server.v1.UploadSourceRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UploadSourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadSourceMethod(), responseObserver);
    }

    /**
     */
    default void lintSource(ai.chalk.protos.chalk.server.v1.LintSourceRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.LintSourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLintSourceMethod(), responseObserver);
    }

    /**
     */
    default void getDeploymentSteps(ai.chalk.protos.chalk.server.v1.GetDeploymentStepsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDeploymentStepsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeploymentStepsMethod(), responseObserver);
    }

    /**
     */
    default void getDeploymentLogs(ai.chalk.protos.chalk.server.v1.GetDeploymentLogsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDeploymentLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeploymentLogsMethod(), responseObserver);
    }

    /**
     */
    default void getClusterTimescaleDB(ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClusterTimescaleDBMethod(), responseObserver);
    }

    /**
     */
    default void getClusterGateway(ai.chalk.protos.chalk.server.v1.GetClusterGatewayRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetClusterGatewayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClusterGatewayMethod(), responseObserver);
    }

    /**
     */
    default void getClusterBackgroundPersistence(ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClusterBackgroundPersistenceMethod(), responseObserver);
    }

    /**
     */
    default void createClusterTimescaleDB(ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateClusterTimescaleDBMethod(), responseObserver);
    }

    /**
     */
    default void migrateClusterTimescaleDB(ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMigrateClusterTimescaleDBMethod(), responseObserver);
    }

    /**
     */
    default void createClusterGateway(ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateClusterGatewayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateClusterGatewayMethod(), responseObserver);
    }

    /**
     */
    default void createClusterBackgroundPersistence(ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateClusterBackgroundPersistenceMethod(), responseObserver);
    }

    /**
     */
    default void updateEnvironmentVariables(ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEnvironmentVariablesMethod(), responseObserver);
    }

    /**
     */
    default void startBranch(ai.chalk.protos.chalk.server.v1.StartBranchRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.StartBranchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartBranchMethod(), responseObserver);
    }

    /**
     */
    default void getKarpenterNodepools(ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetKarpenterNodepoolsMethod(), responseObserver);
    }

    /**
     */
    default void addKarpenterNodepool(ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddKarpenterNodepoolMethod(), responseObserver);
    }

    /**
     */
    default void updateKarpenterNodepool(ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateKarpenterNodepoolMethod(), responseObserver);
    }

    /**
     */
    default void deleteKarpenterNodepool(ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteKarpenterNodepoolMethod(), responseObserver);
    }

    /**
     */
    default void getKarpenterInstallationMetadata(ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetKarpenterInstallationMetadataMethod(), responseObserver);
    }

    /**
     */
    default void getTagWeights(ai.chalk.protos.chalk.server.v1.GetTagWeightsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetTagWeightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTagWeightsMethod(), responseObserver);
    }

    /**
     */
    default void setTagWeights(ai.chalk.protos.chalk.server.v1.SetTagWeightsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.SetTagWeightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTagWeightsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BuilderService.
   */
  public static abstract class BuilderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BuilderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BuilderService.
   */
  public static final class BuilderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BuilderServiceStub> {
    private BuilderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuilderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BuilderServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSearchConfig(ai.chalk.protos.chalk.server.v1.GetSearchConfigRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetSearchConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSearchConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Takes an existing (past) deployment and promotes the k8s resources / other things associated with it.
     * Useful for debugging in local development where the auto activation doesn't work b/c no pubsub.
     * </pre>
     */
    public void activateDeployment(ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateDeploymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void indexDeployment(ai.chalk.protos.chalk.server.v1.IndexDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.IndexDeploymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIndexDeploymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Intermediate step in the deployment activation process. Allows for partial migration to the new
     * go-api-server builder service.
     * </pre>
     */
    public void deployKubeComponents(ai.chalk.protos.chalk.server.v1.DeployKubeComponentsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeployKubeComponentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeployKubeComponentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Takes an existing (past) deployment and re-creates the image associated with it,
     * publishing the image as 'new_image_tag'.
     * </pre>
     */
    public void rebuildDeployment(ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.RebuildDeploymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRebuildDeploymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Triggers a new build with the source code from this deployment and deploys the result
     * </pre>
     */
    public void redeployDeployment(ai.chalk.protos.chalk.server.v1.RedeployDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.RedeployDeploymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRedeployDeploymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Triggers a new build with the provided source code archive and deploys the result
     * </pre>
     */
    public void uploadSource(ai.chalk.protos.chalk.server.v1.UploadSourceRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UploadSourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadSourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lintSource(ai.chalk.protos.chalk.server.v1.LintSourceRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.LintSourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLintSourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDeploymentSteps(ai.chalk.protos.chalk.server.v1.GetDeploymentStepsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDeploymentStepsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeploymentStepsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDeploymentLogs(ai.chalk.protos.chalk.server.v1.GetDeploymentLogsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDeploymentLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeploymentLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClusterTimescaleDB(ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClusterTimescaleDBMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClusterGateway(ai.chalk.protos.chalk.server.v1.GetClusterGatewayRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetClusterGatewayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClusterGatewayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClusterBackgroundPersistence(ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClusterBackgroundPersistenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createClusterTimescaleDB(ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateClusterTimescaleDBMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void migrateClusterTimescaleDB(ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMigrateClusterTimescaleDBMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createClusterGateway(ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateClusterGatewayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateClusterGatewayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createClusterBackgroundPersistence(ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateClusterBackgroundPersistenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEnvironmentVariables(ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEnvironmentVariablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startBranch(ai.chalk.protos.chalk.server.v1.StartBranchRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.StartBranchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartBranchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getKarpenterNodepools(ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetKarpenterNodepoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addKarpenterNodepool(ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddKarpenterNodepoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateKarpenterNodepool(ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateKarpenterNodepoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteKarpenterNodepool(ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteKarpenterNodepoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getKarpenterInstallationMetadata(ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetKarpenterInstallationMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTagWeights(ai.chalk.protos.chalk.server.v1.GetTagWeightsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetTagWeightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTagWeightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTagWeights(ai.chalk.protos.chalk.server.v1.SetTagWeightsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.SetTagWeightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTagWeightsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BuilderService.
   */
  public static final class BuilderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BuilderServiceBlockingStub> {
    private BuilderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuilderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BuilderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetSearchConfigResponse getSearchConfig(ai.chalk.protos.chalk.server.v1.GetSearchConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSearchConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Takes an existing (past) deployment and promotes the k8s resources / other things associated with it.
     * Useful for debugging in local development where the auto activation doesn't work b/c no pubsub.
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse activateDeployment(ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateDeploymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.IndexDeploymentResponse indexDeployment(ai.chalk.protos.chalk.server.v1.IndexDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIndexDeploymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Intermediate step in the deployment activation process. Allows for partial migration to the new
     * go-api-server builder service.
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.DeployKubeComponentsResponse deployKubeComponents(ai.chalk.protos.chalk.server.v1.DeployKubeComponentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeployKubeComponentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Takes an existing (past) deployment and re-creates the image associated with it,
     * publishing the image as 'new_image_tag'.
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.RebuildDeploymentResponse rebuildDeployment(ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRebuildDeploymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Triggers a new build with the source code from this deployment and deploys the result
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.RedeployDeploymentResponse redeployDeployment(ai.chalk.protos.chalk.server.v1.RedeployDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRedeployDeploymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Triggers a new build with the provided source code archive and deploys the result
     * </pre>
     */
    public ai.chalk.protos.chalk.server.v1.UploadSourceResponse uploadSource(ai.chalk.protos.chalk.server.v1.UploadSourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadSourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.LintSourceResponse lintSource(ai.chalk.protos.chalk.server.v1.LintSourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLintSourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetDeploymentStepsResponse getDeploymentSteps(ai.chalk.protos.chalk.server.v1.GetDeploymentStepsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeploymentStepsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetDeploymentLogsResponse getDeploymentLogs(ai.chalk.protos.chalk.server.v1.GetDeploymentLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeploymentLogsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBResponse getClusterTimescaleDB(ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClusterTimescaleDBMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetClusterGatewayResponse getClusterGateway(ai.chalk.protos.chalk.server.v1.GetClusterGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClusterGatewayMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceResponse getClusterBackgroundPersistence(ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClusterBackgroundPersistenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBResponse createClusterTimescaleDB(ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateClusterTimescaleDBMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBResponse migrateClusterTimescaleDB(ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMigrateClusterTimescaleDBMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.CreateClusterGatewayResponse createClusterGateway(ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateClusterGatewayMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceResponse createClusterBackgroundPersistence(ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateClusterBackgroundPersistenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesResponse updateEnvironmentVariables(ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEnvironmentVariablesMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.StartBranchResponse startBranch(ai.chalk.protos.chalk.server.v1.StartBranchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartBranchMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsResponse getKarpenterNodepools(ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetKarpenterNodepoolsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolResponse addKarpenterNodepool(ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddKarpenterNodepoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolResponse updateKarpenterNodepool(ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateKarpenterNodepoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolResponse deleteKarpenterNodepool(ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteKarpenterNodepoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataResponse getKarpenterInstallationMetadata(ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetKarpenterInstallationMetadataMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetTagWeightsResponse getTagWeights(ai.chalk.protos.chalk.server.v1.GetTagWeightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTagWeightsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.SetTagWeightsResponse setTagWeights(ai.chalk.protos.chalk.server.v1.SetTagWeightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTagWeightsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BuilderService.
   */
  public static final class BuilderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BuilderServiceFutureStub> {
    private BuilderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuilderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BuilderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetSearchConfigResponse> getSearchConfig(
        ai.chalk.protos.chalk.server.v1.GetSearchConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSearchConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Takes an existing (past) deployment and promotes the k8s resources / other things associated with it.
     * Useful for debugging in local development where the auto activation doesn't work b/c no pubsub.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse> activateDeployment(
        ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateDeploymentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.IndexDeploymentResponse> indexDeployment(
        ai.chalk.protos.chalk.server.v1.IndexDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIndexDeploymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Intermediate step in the deployment activation process. Allows for partial migration to the new
     * go-api-server builder service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.DeployKubeComponentsResponse> deployKubeComponents(
        ai.chalk.protos.chalk.server.v1.DeployKubeComponentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeployKubeComponentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Takes an existing (past) deployment and re-creates the image associated with it,
     * publishing the image as 'new_image_tag'.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.RebuildDeploymentResponse> rebuildDeployment(
        ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRebuildDeploymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Triggers a new build with the source code from this deployment and deploys the result
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.RedeployDeploymentResponse> redeployDeployment(
        ai.chalk.protos.chalk.server.v1.RedeployDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRedeployDeploymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Triggers a new build with the provided source code archive and deploys the result
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.UploadSourceResponse> uploadSource(
        ai.chalk.protos.chalk.server.v1.UploadSourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadSourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.LintSourceResponse> lintSource(
        ai.chalk.protos.chalk.server.v1.LintSourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLintSourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetDeploymentStepsResponse> getDeploymentSteps(
        ai.chalk.protos.chalk.server.v1.GetDeploymentStepsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeploymentStepsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetDeploymentLogsResponse> getDeploymentLogs(
        ai.chalk.protos.chalk.server.v1.GetDeploymentLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeploymentLogsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBResponse> getClusterTimescaleDB(
        ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClusterTimescaleDBMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetClusterGatewayResponse> getClusterGateway(
        ai.chalk.protos.chalk.server.v1.GetClusterGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClusterGatewayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceResponse> getClusterBackgroundPersistence(
        ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClusterBackgroundPersistenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBResponse> createClusterTimescaleDB(
        ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateClusterTimescaleDBMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBResponse> migrateClusterTimescaleDB(
        ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMigrateClusterTimescaleDBMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.CreateClusterGatewayResponse> createClusterGateway(
        ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateClusterGatewayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceResponse> createClusterBackgroundPersistence(
        ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateClusterBackgroundPersistenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesResponse> updateEnvironmentVariables(
        ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEnvironmentVariablesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.StartBranchResponse> startBranch(
        ai.chalk.protos.chalk.server.v1.StartBranchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartBranchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsResponse> getKarpenterNodepools(
        ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetKarpenterNodepoolsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolResponse> addKarpenterNodepool(
        ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddKarpenterNodepoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolResponse> updateKarpenterNodepool(
        ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateKarpenterNodepoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolResponse> deleteKarpenterNodepool(
        ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteKarpenterNodepoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataResponse> getKarpenterInstallationMetadata(
        ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetKarpenterInstallationMetadataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetTagWeightsResponse> getTagWeights(
        ai.chalk.protos.chalk.server.v1.GetTagWeightsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTagWeightsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.SetTagWeightsResponse> setTagWeights(
        ai.chalk.protos.chalk.server.v1.SetTagWeightsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTagWeightsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SEARCH_CONFIG = 0;
  private static final int METHODID_ACTIVATE_DEPLOYMENT = 1;
  private static final int METHODID_INDEX_DEPLOYMENT = 2;
  private static final int METHODID_DEPLOY_KUBE_COMPONENTS = 3;
  private static final int METHODID_REBUILD_DEPLOYMENT = 4;
  private static final int METHODID_REDEPLOY_DEPLOYMENT = 5;
  private static final int METHODID_UPLOAD_SOURCE = 6;
  private static final int METHODID_LINT_SOURCE = 7;
  private static final int METHODID_GET_DEPLOYMENT_STEPS = 8;
  private static final int METHODID_GET_DEPLOYMENT_LOGS = 9;
  private static final int METHODID_GET_CLUSTER_TIMESCALE_DB = 10;
  private static final int METHODID_GET_CLUSTER_GATEWAY = 11;
  private static final int METHODID_GET_CLUSTER_BACKGROUND_PERSISTENCE = 12;
  private static final int METHODID_CREATE_CLUSTER_TIMESCALE_DB = 13;
  private static final int METHODID_MIGRATE_CLUSTER_TIMESCALE_DB = 14;
  private static final int METHODID_CREATE_CLUSTER_GATEWAY = 15;
  private static final int METHODID_CREATE_CLUSTER_BACKGROUND_PERSISTENCE = 16;
  private static final int METHODID_UPDATE_ENVIRONMENT_VARIABLES = 17;
  private static final int METHODID_START_BRANCH = 18;
  private static final int METHODID_GET_KARPENTER_NODEPOOLS = 19;
  private static final int METHODID_ADD_KARPENTER_NODEPOOL = 20;
  private static final int METHODID_UPDATE_KARPENTER_NODEPOOL = 21;
  private static final int METHODID_DELETE_KARPENTER_NODEPOOL = 22;
  private static final int METHODID_GET_KARPENTER_INSTALLATION_METADATA = 23;
  private static final int METHODID_GET_TAG_WEIGHTS = 24;
  private static final int METHODID_SET_TAG_WEIGHTS = 25;

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
        case METHODID_GET_SEARCH_CONFIG:
          serviceImpl.getSearchConfig((ai.chalk.protos.chalk.server.v1.GetSearchConfigRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetSearchConfigResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE_DEPLOYMENT:
          serviceImpl.activateDeployment((ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse>) responseObserver);
          break;
        case METHODID_INDEX_DEPLOYMENT:
          serviceImpl.indexDeployment((ai.chalk.protos.chalk.server.v1.IndexDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.IndexDeploymentResponse>) responseObserver);
          break;
        case METHODID_DEPLOY_KUBE_COMPONENTS:
          serviceImpl.deployKubeComponents((ai.chalk.protos.chalk.server.v1.DeployKubeComponentsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeployKubeComponentsResponse>) responseObserver);
          break;
        case METHODID_REBUILD_DEPLOYMENT:
          serviceImpl.rebuildDeployment((ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.RebuildDeploymentResponse>) responseObserver);
          break;
        case METHODID_REDEPLOY_DEPLOYMENT:
          serviceImpl.redeployDeployment((ai.chalk.protos.chalk.server.v1.RedeployDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.RedeployDeploymentResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_SOURCE:
          serviceImpl.uploadSource((ai.chalk.protos.chalk.server.v1.UploadSourceRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UploadSourceResponse>) responseObserver);
          break;
        case METHODID_LINT_SOURCE:
          serviceImpl.lintSource((ai.chalk.protos.chalk.server.v1.LintSourceRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.LintSourceResponse>) responseObserver);
          break;
        case METHODID_GET_DEPLOYMENT_STEPS:
          serviceImpl.getDeploymentSteps((ai.chalk.protos.chalk.server.v1.GetDeploymentStepsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDeploymentStepsResponse>) responseObserver);
          break;
        case METHODID_GET_DEPLOYMENT_LOGS:
          serviceImpl.getDeploymentLogs((ai.chalk.protos.chalk.server.v1.GetDeploymentLogsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDeploymentLogsResponse>) responseObserver);
          break;
        case METHODID_GET_CLUSTER_TIMESCALE_DB:
          serviceImpl.getClusterTimescaleDB((ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBResponse>) responseObserver);
          break;
        case METHODID_GET_CLUSTER_GATEWAY:
          serviceImpl.getClusterGateway((ai.chalk.protos.chalk.server.v1.GetClusterGatewayRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetClusterGatewayResponse>) responseObserver);
          break;
        case METHODID_GET_CLUSTER_BACKGROUND_PERSISTENCE:
          serviceImpl.getClusterBackgroundPersistence((ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceResponse>) responseObserver);
          break;
        case METHODID_CREATE_CLUSTER_TIMESCALE_DB:
          serviceImpl.createClusterTimescaleDB((ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBResponse>) responseObserver);
          break;
        case METHODID_MIGRATE_CLUSTER_TIMESCALE_DB:
          serviceImpl.migrateClusterTimescaleDB((ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBResponse>) responseObserver);
          break;
        case METHODID_CREATE_CLUSTER_GATEWAY:
          serviceImpl.createClusterGateway((ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateClusterGatewayResponse>) responseObserver);
          break;
        case METHODID_CREATE_CLUSTER_BACKGROUND_PERSISTENCE:
          serviceImpl.createClusterBackgroundPersistence((ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ENVIRONMENT_VARIABLES:
          serviceImpl.updateEnvironmentVariables((ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesResponse>) responseObserver);
          break;
        case METHODID_START_BRANCH:
          serviceImpl.startBranch((ai.chalk.protos.chalk.server.v1.StartBranchRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.StartBranchResponse>) responseObserver);
          break;
        case METHODID_GET_KARPENTER_NODEPOOLS:
          serviceImpl.getKarpenterNodepools((ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsResponse>) responseObserver);
          break;
        case METHODID_ADD_KARPENTER_NODEPOOL:
          serviceImpl.addKarpenterNodepool((ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolResponse>) responseObserver);
          break;
        case METHODID_UPDATE_KARPENTER_NODEPOOL:
          serviceImpl.updateKarpenterNodepool((ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolResponse>) responseObserver);
          break;
        case METHODID_DELETE_KARPENTER_NODEPOOL:
          serviceImpl.deleteKarpenterNodepool((ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolResponse>) responseObserver);
          break;
        case METHODID_GET_KARPENTER_INSTALLATION_METADATA:
          serviceImpl.getKarpenterInstallationMetadata((ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataResponse>) responseObserver);
          break;
        case METHODID_GET_TAG_WEIGHTS:
          serviceImpl.getTagWeights((ai.chalk.protos.chalk.server.v1.GetTagWeightsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetTagWeightsResponse>) responseObserver);
          break;
        case METHODID_SET_TAG_WEIGHTS:
          serviceImpl.setTagWeights((ai.chalk.protos.chalk.server.v1.SetTagWeightsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.SetTagWeightsResponse>) responseObserver);
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
          getGetSearchConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetSearchConfigRequest,
              ai.chalk.protos.chalk.server.v1.GetSearchConfigResponse>(
                service, METHODID_GET_SEARCH_CONFIG)))
        .addMethod(
          getActivateDeploymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.ActivateDeploymentRequest,
              ai.chalk.protos.chalk.server.v1.ActivateDeploymentResponse>(
                service, METHODID_ACTIVATE_DEPLOYMENT)))
        .addMethod(
          getIndexDeploymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.IndexDeploymentRequest,
              ai.chalk.protos.chalk.server.v1.IndexDeploymentResponse>(
                service, METHODID_INDEX_DEPLOYMENT)))
        .addMethod(
          getDeployKubeComponentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.DeployKubeComponentsRequest,
              ai.chalk.protos.chalk.server.v1.DeployKubeComponentsResponse>(
                service, METHODID_DEPLOY_KUBE_COMPONENTS)))
        .addMethod(
          getRebuildDeploymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.RebuildDeploymentRequest,
              ai.chalk.protos.chalk.server.v1.RebuildDeploymentResponse>(
                service, METHODID_REBUILD_DEPLOYMENT)))
        .addMethod(
          getRedeployDeploymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.RedeployDeploymentRequest,
              ai.chalk.protos.chalk.server.v1.RedeployDeploymentResponse>(
                service, METHODID_REDEPLOY_DEPLOYMENT)))
        .addMethod(
          getUploadSourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.UploadSourceRequest,
              ai.chalk.protos.chalk.server.v1.UploadSourceResponse>(
                service, METHODID_UPLOAD_SOURCE)))
        .addMethod(
          getLintSourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.LintSourceRequest,
              ai.chalk.protos.chalk.server.v1.LintSourceResponse>(
                service, METHODID_LINT_SOURCE)))
        .addMethod(
          getGetDeploymentStepsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetDeploymentStepsRequest,
              ai.chalk.protos.chalk.server.v1.GetDeploymentStepsResponse>(
                service, METHODID_GET_DEPLOYMENT_STEPS)))
        .addMethod(
          getGetDeploymentLogsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetDeploymentLogsRequest,
              ai.chalk.protos.chalk.server.v1.GetDeploymentLogsResponse>(
                service, METHODID_GET_DEPLOYMENT_LOGS)))
        .addMethod(
          getGetClusterTimescaleDBMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBRequest,
              ai.chalk.protos.chalk.server.v1.GetClusterTimescaleDBResponse>(
                service, METHODID_GET_CLUSTER_TIMESCALE_DB)))
        .addMethod(
          getGetClusterGatewayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetClusterGatewayRequest,
              ai.chalk.protos.chalk.server.v1.GetClusterGatewayResponse>(
                service, METHODID_GET_CLUSTER_GATEWAY)))
        .addMethod(
          getGetClusterBackgroundPersistenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceRequest,
              ai.chalk.protos.chalk.server.v1.GetClusterBackgroundPersistenceResponse>(
                service, METHODID_GET_CLUSTER_BACKGROUND_PERSISTENCE)))
        .addMethod(
          getCreateClusterTimescaleDBMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBRequest,
              ai.chalk.protos.chalk.server.v1.CreateClusterTimescaleDBResponse>(
                service, METHODID_CREATE_CLUSTER_TIMESCALE_DB)))
        .addMethod(
          getMigrateClusterTimescaleDBMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBRequest,
              ai.chalk.protos.chalk.server.v1.MigrateClusterTimescaleDBResponse>(
                service, METHODID_MIGRATE_CLUSTER_TIMESCALE_DB)))
        .addMethod(
          getCreateClusterGatewayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.CreateClusterGatewayRequest,
              ai.chalk.protos.chalk.server.v1.CreateClusterGatewayResponse>(
                service, METHODID_CREATE_CLUSTER_GATEWAY)))
        .addMethod(
          getCreateClusterBackgroundPersistenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceRequest,
              ai.chalk.protos.chalk.server.v1.CreateClusterBackgroundPersistenceResponse>(
                service, METHODID_CREATE_CLUSTER_BACKGROUND_PERSISTENCE)))
        .addMethod(
          getUpdateEnvironmentVariablesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesRequest,
              ai.chalk.protos.chalk.server.v1.UpdateEnvironmentVariablesResponse>(
                service, METHODID_UPDATE_ENVIRONMENT_VARIABLES)))
        .addMethod(
          getStartBranchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.StartBranchRequest,
              ai.chalk.protos.chalk.server.v1.StartBranchResponse>(
                service, METHODID_START_BRANCH)))
        .addMethod(
          getGetKarpenterNodepoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsRequest,
              ai.chalk.protos.chalk.server.v1.GetKarpenterNodepoolsResponse>(
                service, METHODID_GET_KARPENTER_NODEPOOLS)))
        .addMethod(
          getAddKarpenterNodepoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolRequest,
              ai.chalk.protos.chalk.server.v1.AddKarpenterNodepoolResponse>(
                service, METHODID_ADD_KARPENTER_NODEPOOL)))
        .addMethod(
          getUpdateKarpenterNodepoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolRequest,
              ai.chalk.protos.chalk.server.v1.UpdateKarpenterNodepoolResponse>(
                service, METHODID_UPDATE_KARPENTER_NODEPOOL)))
        .addMethod(
          getDeleteKarpenterNodepoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolRequest,
              ai.chalk.protos.chalk.server.v1.DeleteKarpenterNodepoolResponse>(
                service, METHODID_DELETE_KARPENTER_NODEPOOL)))
        .addMethod(
          getGetKarpenterInstallationMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataRequest,
              ai.chalk.protos.chalk.server.v1.GetKarpenterInstallationMetadataResponse>(
                service, METHODID_GET_KARPENTER_INSTALLATION_METADATA)))
        .addMethod(
          getGetTagWeightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetTagWeightsRequest,
              ai.chalk.protos.chalk.server.v1.GetTagWeightsResponse>(
                service, METHODID_GET_TAG_WEIGHTS)))
        .addMethod(
          getSetTagWeightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.SetTagWeightsRequest,
              ai.chalk.protos.chalk.server.v1.SetTagWeightsResponse>(
                service, METHODID_SET_TAG_WEIGHTS)))
        .build();
  }

  private static abstract class BuilderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BuilderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.BuilderProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BuilderService");
    }
  }

  private static final class BuilderServiceFileDescriptorSupplier
      extends BuilderServiceBaseDescriptorSupplier {
    BuilderServiceFileDescriptorSupplier() {}
  }

  private static final class BuilderServiceMethodDescriptorSupplier
      extends BuilderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BuilderServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BuilderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BuilderServiceFileDescriptorSupplier())
              .addMethod(getGetSearchConfigMethod())
              .addMethod(getActivateDeploymentMethod())
              .addMethod(getIndexDeploymentMethod())
              .addMethod(getDeployKubeComponentsMethod())
              .addMethod(getRebuildDeploymentMethod())
              .addMethod(getRedeployDeploymentMethod())
              .addMethod(getUploadSourceMethod())
              .addMethod(getLintSourceMethod())
              .addMethod(getGetDeploymentStepsMethod())
              .addMethod(getGetDeploymentLogsMethod())
              .addMethod(getGetClusterTimescaleDBMethod())
              .addMethod(getGetClusterGatewayMethod())
              .addMethod(getGetClusterBackgroundPersistenceMethod())
              .addMethod(getCreateClusterTimescaleDBMethod())
              .addMethod(getMigrateClusterTimescaleDBMethod())
              .addMethod(getCreateClusterGatewayMethod())
              .addMethod(getCreateClusterBackgroundPersistenceMethod())
              .addMethod(getUpdateEnvironmentVariablesMethod())
              .addMethod(getStartBranchMethod())
              .addMethod(getGetKarpenterNodepoolsMethod())
              .addMethod(getAddKarpenterNodepoolMethod())
              .addMethod(getUpdateKarpenterNodepoolMethod())
              .addMethod(getDeleteKarpenterNodepoolMethod())
              .addMethod(getGetKarpenterInstallationMetadataMethod())
              .addMethod(getGetTagWeightsMethod())
              .addMethod(getSetTagWeightsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
