package com.blcvn.kratos.protos.aimodel

import com.blcvn.kratos.protos.aimodel.AIModelServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for ai.model.v1.AIModelService.
 */
public object AIModelServiceGrpcKt {
  public const val SERVICE_NAME: String = AIModelServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createModelMethod:
      MethodDescriptor<AiModel.CreateModelRequest, AiModel.CreateModelResponse>
    @JvmStatic
    get() = AIModelServiceGrpc.getCreateModelMethod()

  public val getModelMethod: MethodDescriptor<AiModel.GetModelRequest, AiModel.GetModelResponse>
    @JvmStatic
    get() = AIModelServiceGrpc.getGetModelMethod()

  public val listModelsMethod:
      MethodDescriptor<AiModel.ListModelsRequest, AiModel.ListModelsResponse>
    @JvmStatic
    get() = AIModelServiceGrpc.getListModelsMethod()

  public val updateModelMethod:
      MethodDescriptor<AiModel.UpdateModelRequest, AiModel.UpdateModelResponse>
    @JvmStatic
    get() = AIModelServiceGrpc.getUpdateModelMethod()

  public val deleteModelMethod: MethodDescriptor<AiModel.DeleteModelRequest, AiModel.ResponseEmpty>
    @JvmStatic
    get() = AIModelServiceGrpc.getDeleteModelMethod()

  public val getCredentialsMethod:
      MethodDescriptor<AiModel.GetCredentialsRequest, AiModel.GetCredentialsResponse>
    @JvmStatic
    get() = AIModelServiceGrpc.getGetCredentialsMethod()

  public val logUsageMethod: MethodDescriptor<AiModel.LogUsageRequest, AiModel.ResponseEmpty>
    @JvmStatic
    get() = AIModelServiceGrpc.getLogUsageMethod()

  public val checkQuotaMethod:
      MethodDescriptor<AiModel.CheckQuotaRequest, AiModel.CheckQuotaResponse>
    @JvmStatic
    get() = AIModelServiceGrpc.getCheckQuotaMethod()

  public val getUsageStatsMethod:
      MethodDescriptor<AiModel.GetUsageStatsRequest, AiModel.GetUsageStatsResponse>
    @JvmStatic
    get() = AIModelServiceGrpc.getGetUsageStatsMethod()

  /**
   * A stub for issuing RPCs to a(n) ai.model.v1.AIModelService service as suspending coroutines.
   */
  @StubFor(AIModelServiceGrpc::class)
  public class AIModelServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AIModelServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): AIModelServiceCoroutineStub =
        AIModelServiceCoroutineStub(channel, callOptions)

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
    public suspend fun createModel(request: AiModel.CreateModelRequest, headers: Metadata =
        Metadata()): AiModel.CreateModelResponse = unaryRpc(
      channel,
      AIModelServiceGrpc.getCreateModelMethod(),
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
    public suspend fun getModel(request: AiModel.GetModelRequest, headers: Metadata = Metadata()):
        AiModel.GetModelResponse = unaryRpc(
      channel,
      AIModelServiceGrpc.getGetModelMethod(),
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
    public suspend fun listModels(request: AiModel.ListModelsRequest, headers: Metadata =
        Metadata()): AiModel.ListModelsResponse = unaryRpc(
      channel,
      AIModelServiceGrpc.getListModelsMethod(),
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
    public suspend fun updateModel(request: AiModel.UpdateModelRequest, headers: Metadata =
        Metadata()): AiModel.UpdateModelResponse = unaryRpc(
      channel,
      AIModelServiceGrpc.getUpdateModelMethod(),
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
    public suspend fun deleteModel(request: AiModel.DeleteModelRequest, headers: Metadata =
        Metadata()): AiModel.ResponseEmpty = unaryRpc(
      channel,
      AIModelServiceGrpc.getDeleteModelMethod(),
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
    public suspend fun getCredentials(request: AiModel.GetCredentialsRequest, headers: Metadata =
        Metadata()): AiModel.GetCredentialsResponse = unaryRpc(
      channel,
      AIModelServiceGrpc.getGetCredentialsMethod(),
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
    public suspend fun logUsage(request: AiModel.LogUsageRequest, headers: Metadata = Metadata()):
        AiModel.ResponseEmpty = unaryRpc(
      channel,
      AIModelServiceGrpc.getLogUsageMethod(),
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
    public suspend fun checkQuota(request: AiModel.CheckQuotaRequest, headers: Metadata =
        Metadata()): AiModel.CheckQuotaResponse = unaryRpc(
      channel,
      AIModelServiceGrpc.getCheckQuotaMethod(),
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
    public suspend fun getUsageStats(request: AiModel.GetUsageStatsRequest, headers: Metadata =
        Metadata()): AiModel.GetUsageStatsResponse = unaryRpc(
      channel,
      AIModelServiceGrpc.getGetUsageStatsMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the ai.model.v1.AIModelService service based on Kotlin coroutines.
   */
  public abstract class AIModelServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for ai.model.v1.AIModelService.CreateModel.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createModel(request: AiModel.CreateModelRequest):
        AiModel.CreateModelResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ai.model.v1.AIModelService.CreateModel is unimplemented"))

    /**
     * Returns the response to an RPC for ai.model.v1.AIModelService.GetModel.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getModel(request: AiModel.GetModelRequest): AiModel.GetModelResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method ai.model.v1.AIModelService.GetModel is unimplemented"))

    /**
     * Returns the response to an RPC for ai.model.v1.AIModelService.ListModels.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listModels(request: AiModel.ListModelsRequest):
        AiModel.ListModelsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ai.model.v1.AIModelService.ListModels is unimplemented"))

    /**
     * Returns the response to an RPC for ai.model.v1.AIModelService.UpdateModel.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateModel(request: AiModel.UpdateModelRequest):
        AiModel.UpdateModelResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ai.model.v1.AIModelService.UpdateModel is unimplemented"))

    /**
     * Returns the response to an RPC for ai.model.v1.AIModelService.DeleteModel.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteModel(request: AiModel.DeleteModelRequest): AiModel.ResponseEmpty
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ai.model.v1.AIModelService.DeleteModel is unimplemented"))

    /**
     * Returns the response to an RPC for ai.model.v1.AIModelService.GetCredentials.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getCredentials(request: AiModel.GetCredentialsRequest):
        AiModel.GetCredentialsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ai.model.v1.AIModelService.GetCredentials is unimplemented"))

    /**
     * Returns the response to an RPC for ai.model.v1.AIModelService.LogUsage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun logUsage(request: AiModel.LogUsageRequest): AiModel.ResponseEmpty =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method ai.model.v1.AIModelService.LogUsage is unimplemented"))

    /**
     * Returns the response to an RPC for ai.model.v1.AIModelService.CheckQuota.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun checkQuota(request: AiModel.CheckQuotaRequest):
        AiModel.CheckQuotaResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ai.model.v1.AIModelService.CheckQuota is unimplemented"))

    /**
     * Returns the response to an RPC for ai.model.v1.AIModelService.GetUsageStats.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getUsageStats(request: AiModel.GetUsageStatsRequest):
        AiModel.GetUsageStatsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ai.model.v1.AIModelService.GetUsageStats is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AIModelServiceGrpc.getCreateModelMethod(),
      implementation = ::createModel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AIModelServiceGrpc.getGetModelMethod(),
      implementation = ::getModel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AIModelServiceGrpc.getListModelsMethod(),
      implementation = ::listModels
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AIModelServiceGrpc.getUpdateModelMethod(),
      implementation = ::updateModel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AIModelServiceGrpc.getDeleteModelMethod(),
      implementation = ::deleteModel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AIModelServiceGrpc.getGetCredentialsMethod(),
      implementation = ::getCredentials
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AIModelServiceGrpc.getLogUsageMethod(),
      implementation = ::logUsage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AIModelServiceGrpc.getCheckQuotaMethod(),
      implementation = ::checkQuota
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AIModelServiceGrpc.getGetUsageStatsMethod(),
      implementation = ::getUsageStats
    )).build()
  }
}
