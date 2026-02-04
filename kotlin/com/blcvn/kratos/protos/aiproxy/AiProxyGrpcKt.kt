package com.blcvn.kratos.protos.aiproxy

import com.blcvn.kratos.protos.aiproxy.AIProxyServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.serverStreamingRpc
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for aiproxy.v1.AIProxyService.
 */
public object AIProxyServiceGrpcKt {
  public const val SERVICE_NAME: String = AIProxyServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val completeMethod: MethodDescriptor<AiProxy.CompleteRequest, AiProxy.CompleteResponse>
    @JvmStatic
    get() = AIProxyServiceGrpc.getCompleteMethod()

  public val streamCompleteMethod:
      MethodDescriptor<AiProxy.CompleteRequest, AiProxy.StreamCompleteResponse>
    @JvmStatic
    get() = AIProxyServiceGrpc.getStreamCompleteMethod()

  public val healthCheckMethod:
      MethodDescriptor<AiProxy.HealthCheckRequest, AiProxy.HealthCheckResponse>
    @JvmStatic
    get() = AIProxyServiceGrpc.getHealthCheckMethod()

  public val getProviderStatusMethod:
      MethodDescriptor<AiProxy.GetProviderStatusRequest, AiProxy.GetProviderStatusResponse>
    @JvmStatic
    get() = AIProxyServiceGrpc.getGetProviderStatusMethod()

  /**
   * A stub for issuing RPCs to a(n) aiproxy.v1.AIProxyService service as suspending coroutines.
   */
  @StubFor(AIProxyServiceGrpc::class)
  public class AIProxyServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AIProxyServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): AIProxyServiceCoroutineStub =
        AIProxyServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun complete(request: AiProxy.CompleteRequest, headers: Metadata = Metadata()):
        AiProxy.CompleteResponse = unaryRpc(
      channel,
      AIProxyServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun streamComplete(request: AiProxy.CompleteRequest, headers: Metadata = Metadata()):
        Flow<AiProxy.StreamCompleteResponse> = serverStreamingRpc(
      channel,
      AIProxyServiceGrpc.getStreamCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun healthCheck(request: AiProxy.HealthCheckRequest, headers: Metadata =
        Metadata()): AiProxy.HealthCheckResponse = unaryRpc(
      channel,
      AIProxyServiceGrpc.getHealthCheckMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getProviderStatus(request: AiProxy.GetProviderStatusRequest,
        headers: Metadata = Metadata()): AiProxy.GetProviderStatusResponse = unaryRpc(
      channel,
      AIProxyServiceGrpc.getGetProviderStatusMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the aiproxy.v1.AIProxyService service based on Kotlin coroutines.
   */
  public abstract class AIProxyServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for aiproxy.v1.AIProxyService.Complete.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun complete(request: AiProxy.CompleteRequest): AiProxy.CompleteResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method aiproxy.v1.AIProxyService.Complete is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for aiproxy.v1.AIProxyService.StreamComplete.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun streamComplete(request: AiProxy.CompleteRequest):
        Flow<AiProxy.StreamCompleteResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method aiproxy.v1.AIProxyService.StreamComplete is unimplemented"))

    /**
     * Returns the response to an RPC for aiproxy.v1.AIProxyService.HealthCheck.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun healthCheck(request: AiProxy.HealthCheckRequest):
        AiProxy.HealthCheckResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method aiproxy.v1.AIProxyService.HealthCheck is unimplemented"))

    /**
     * Returns the response to an RPC for aiproxy.v1.AIProxyService.GetProviderStatus.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getProviderStatus(request: AiProxy.GetProviderStatusRequest):
        AiProxy.GetProviderStatusResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method aiproxy.v1.AIProxyService.GetProviderStatus is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AIProxyServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = AIProxyServiceGrpc.getStreamCompleteMethod(),
      implementation = ::streamComplete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AIProxyServiceGrpc.getHealthCheckMethod(),
      implementation = ::healthCheck
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AIProxyServiceGrpc.getGetProviderStatusMethod(),
      implementation = ::getProviderStatus
    )).build()
  }
}
