package com.blcvn.kratos.protos.registry

import com.blcvn.kratos.protos.registry.RegistryServiceGrpc.getServiceDescriptor
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
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for registry.v1.RegistryService.
 */
public object RegistryServiceGrpcKt {
  public const val SERVICE_NAME: String = RegistryServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getPromptMethod:
      MethodDescriptor<AiAgentRegistry.GetPromptRequest, AiAgentRegistry.PromptTemplate>
    @JvmStatic
    get() = RegistryServiceGrpc.getGetPromptMethod()

  public val getAgentConfigMethod:
      MethodDescriptor<AiAgentRegistry.GetAgentConfigRequest, AiAgentRegistry.AgentConfig>
    @JvmStatic
    get() = RegistryServiceGrpc.getGetAgentConfigMethod()

  public val getTemplateConfigMethod:
      MethodDescriptor<AiAgentRegistry.GetTemplateConfigRequest, AiAgentRegistry.TemplateConfig>
    @JvmStatic
    get() = RegistryServiceGrpc.getGetTemplateConfigMethod()

  public val getLLMTemperatureConfigMethod:
      MethodDescriptor<AiAgentRegistry.GetLLMTemperatureConfigRequest, AiAgentRegistry.LLMTemperatureConfig>
    @JvmStatic
    get() = RegistryServiceGrpc.getGetLLMTemperatureConfigMethod()

  /**
   * A stub for issuing RPCs to a(n) registry.v1.RegistryService service as suspending coroutines.
   */
  @StubFor(RegistryServiceGrpc::class)
  public class RegistryServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<RegistryServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): RegistryServiceCoroutineStub =
        RegistryServiceCoroutineStub(channel, callOptions)

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
    public suspend fun getPrompt(request: AiAgentRegistry.GetPromptRequest, headers: Metadata =
        Metadata()): AiAgentRegistry.PromptTemplate = unaryRpc(
      channel,
      RegistryServiceGrpc.getGetPromptMethod(),
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
    public suspend fun getAgentConfig(request: AiAgentRegistry.GetAgentConfigRequest,
        headers: Metadata = Metadata()): AiAgentRegistry.AgentConfig = unaryRpc(
      channel,
      RegistryServiceGrpc.getGetAgentConfigMethod(),
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
    public suspend fun getTemplateConfig(request: AiAgentRegistry.GetTemplateConfigRequest,
        headers: Metadata = Metadata()): AiAgentRegistry.TemplateConfig = unaryRpc(
      channel,
      RegistryServiceGrpc.getGetTemplateConfigMethod(),
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
    public suspend
        fun getLLMTemperatureConfig(request: AiAgentRegistry.GetLLMTemperatureConfigRequest,
        headers: Metadata = Metadata()): AiAgentRegistry.LLMTemperatureConfig = unaryRpc(
      channel,
      RegistryServiceGrpc.getGetLLMTemperatureConfigMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the registry.v1.RegistryService service based on Kotlin coroutines.
   */
  public abstract class RegistryServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for registry.v1.RegistryService.GetPrompt.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getPrompt(request: AiAgentRegistry.GetPromptRequest):
        AiAgentRegistry.PromptTemplate = throw
        StatusException(UNIMPLEMENTED.withDescription("Method registry.v1.RegistryService.GetPrompt is unimplemented"))

    /**
     * Returns the response to an RPC for registry.v1.RegistryService.GetAgentConfig.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getAgentConfig(request: AiAgentRegistry.GetAgentConfigRequest):
        AiAgentRegistry.AgentConfig = throw
        StatusException(UNIMPLEMENTED.withDescription("Method registry.v1.RegistryService.GetAgentConfig is unimplemented"))

    /**
     * Returns the response to an RPC for registry.v1.RegistryService.GetTemplateConfig.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getTemplateConfig(request: AiAgentRegistry.GetTemplateConfigRequest):
        AiAgentRegistry.TemplateConfig = throw
        StatusException(UNIMPLEMENTED.withDescription("Method registry.v1.RegistryService.GetTemplateConfig is unimplemented"))

    /**
     * Returns the response to an RPC for registry.v1.RegistryService.GetLLMTemperatureConfig.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend
        fun getLLMTemperatureConfig(request: AiAgentRegistry.GetLLMTemperatureConfigRequest):
        AiAgentRegistry.LLMTemperatureConfig = throw
        StatusException(UNIMPLEMENTED.withDescription("Method registry.v1.RegistryService.GetLLMTemperatureConfig is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RegistryServiceGrpc.getGetPromptMethod(),
      implementation = ::getPrompt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RegistryServiceGrpc.getGetAgentConfigMethod(),
      implementation = ::getAgentConfig
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RegistryServiceGrpc.getGetTemplateConfigMethod(),
      implementation = ::getTemplateConfig
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RegistryServiceGrpc.getGetLLMTemperatureConfigMethod(),
      implementation = ::getLLMTemperatureConfig
    )).build()
  }
}
