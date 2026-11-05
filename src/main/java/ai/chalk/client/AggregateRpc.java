package ai.chalk.client;

import ai.chalk.exceptions.ChalkException;
import io.grpc.MethodDescriptor;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.ClientCalls;

/**
 * Sends one unary call to the API server's AggregateService, so {@link AggregateBackfills}
 * runs the same logic over gRPC and over HTTP. Either way, an RPC error is thrown as an
 * {@link io.grpc.StatusRuntimeException} carrying the server's status code.
 */
interface AggregateRpc {
    <ReqT, RespT> RespT call(MethodDescriptor<ReqT, RespT> method, ReqT request) throws ChalkException;

    static AggregateRpc grpc(AbstractStub<?> stub) {
        return new AggregateRpc() {
            @Override
            public <ReqT, RespT> RespT call(MethodDescriptor<ReqT, RespT> method, ReqT request) {
                return ClientCalls.blockingUnaryCall(stub.getChannel(), method, stub.getCallOptions(), request);
            }
        };
    }
}
