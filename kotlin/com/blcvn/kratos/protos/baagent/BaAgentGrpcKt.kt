package com.blcvn.kratos.protos.baagent

import com.blcvn.kratos.protos.baagent.BAAgentServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for baagent.v1.BAAgentService.
 */
public object BAAgentServiceGrpcKt {
  public const val SERVICE_NAME: String = BAAgentServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val executeTaskMethod:
      MethodDescriptor<BaAgent.ExecuteTaskRequest, BaAgent.ExecuteTaskResponse>
    @JvmStatic
    get() = BAAgentServiceGrpc.getExecuteTaskMethod()

  public val submitInputMethod:
      MethodDescriptor<BaAgent.SubmitInputRequest, BaAgent.StreamExecuteTaskResponse>
    @JvmStatic
    get() = BAAgentServiceGrpc.getSubmitInputMethod()

  public val streamExecuteTaskMethod:
      MethodDescriptor<BaAgent.ExecuteTaskRequest, BaAgent.StreamExecuteTaskResponse>
    @JvmStatic
    get() = BAAgentServiceGrpc.getStreamExecuteTaskMethod()

  public val getTaskMethod: MethodDescriptor<BaAgent.GetTaskRequest, BaAgent.GetTaskResponse>
    @JvmStatic
    get() = BAAgentServiceGrpc.getGetTaskMethod()

  public val listToolsMethod: MethodDescriptor<BaAgent.ListToolsRequest, BaAgent.ListToolsResponse>
    @JvmStatic
    get() = BAAgentServiceGrpc.getListToolsMethod()

  public val getMemoryMethod: MethodDescriptor<BaAgent.GetMemoryRequest, BaAgent.GetMemoryResponse>
    @JvmStatic
    get() = BAAgentServiceGrpc.getGetMemoryMethod()

  public val clearMemoryMethod:
      MethodDescriptor<BaAgent.ClearMemoryRequest, BaAgent.ClearMemoryResponse>
    @JvmStatic
    get() = BAAgentServiceGrpc.getClearMemoryMethod()

  public val generateRequirementMethod:
      MethodDescriptor<BaAgent.GenerateRequirementRequest, BaAgent.GenerateRequirementResponse>
    @JvmStatic
    get() = BAAgentServiceGrpc.getGenerateRequirementMethod()

  public val getDocumentMethod:
      MethodDescriptor<BaAgent.GetDocumentRequest, BaAgent.ExecuteTaskResponse>
    @JvmStatic
    get() = BAAgentServiceGrpc.getGetDocumentMethod()

  public val getTierIndexMethod:
      MethodDescriptor<BaAgent.GetDocumentRequest, BaAgent.ExecuteTaskResponse>
    @JvmStatic
    get() = BAAgentServiceGrpc.getGetTierIndexMethod()

  public val getTierOutlineMethod:
      MethodDescriptor<BaAgent.GetDocumentRequest, BaAgent.ExecuteTaskResponse>
    @JvmStatic
    get() = BAAgentServiceGrpc.getGetTierOutlineMethod()

  public val getTierFullMethod:
      MethodDescriptor<BaAgent.GetDocumentRequest, BaAgent.ExecuteTaskResponse>
    @JvmStatic
    get() = BAAgentServiceGrpc.getGetTierFullMethod()

  public val approveRequirementMethod:
      MethodDescriptor<BaAgent.ApproveRequirementRequest, BaAgent.EmptyResponse>
    @JvmStatic
    get() = BAAgentServiceGrpc.getApproveRequirementMethod()

  public val reviewRequirementMethod:
      MethodDescriptor<BaAgent.ReviewRequirementRequest, BaAgent.EmptyResponse>
    @JvmStatic
    get() = BAAgentServiceGrpc.getReviewRequirementMethod()

  public val regenerateRequirementMethod:
      MethodDescriptor<BaAgent.GenerateRequirementRequest, BaAgent.GenerateRequirementResponse>
    @JvmStatic
    get() = BAAgentServiceGrpc.getRegenerateRequirementMethod()

  public val getLineageMethod: MethodDescriptor<BaAgent.GetDocumentRequest, BaAgent.EmptyResponse>
    @JvmStatic
    get() = BAAgentServiceGrpc.getGetLineageMethod()

  /**
   * A stub for issuing RPCs to a(n) baagent.v1.BAAgentService service as suspending coroutines.
   */
  @StubFor(BAAgentServiceGrpc::class)
  public class BAAgentServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<BAAgentServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): BAAgentServiceCoroutineStub =
        BAAgentServiceCoroutineStub(channel, callOptions)

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
    public suspend fun executeTask(request: BaAgent.ExecuteTaskRequest, headers: Metadata =
        Metadata()): BaAgent.ExecuteTaskResponse = unaryRpc(
      channel,
      BAAgentServiceGrpc.getExecuteTaskMethod(),
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
    public fun submitInput(request: BaAgent.SubmitInputRequest, headers: Metadata = Metadata()):
        Flow<BaAgent.StreamExecuteTaskResponse> = serverStreamingRpc(
      channel,
      BAAgentServiceGrpc.getSubmitInputMethod(),
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
    public fun streamExecuteTask(request: BaAgent.ExecuteTaskRequest, headers: Metadata =
        Metadata()): Flow<BaAgent.StreamExecuteTaskResponse> = serverStreamingRpc(
      channel,
      BAAgentServiceGrpc.getStreamExecuteTaskMethod(),
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
    public suspend fun getTask(request: BaAgent.GetTaskRequest, headers: Metadata = Metadata()):
        BaAgent.GetTaskResponse = unaryRpc(
      channel,
      BAAgentServiceGrpc.getGetTaskMethod(),
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
    public suspend fun listTools(request: BaAgent.ListToolsRequest, headers: Metadata = Metadata()):
        BaAgent.ListToolsResponse = unaryRpc(
      channel,
      BAAgentServiceGrpc.getListToolsMethod(),
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
    public suspend fun getMemory(request: BaAgent.GetMemoryRequest, headers: Metadata = Metadata()):
        BaAgent.GetMemoryResponse = unaryRpc(
      channel,
      BAAgentServiceGrpc.getGetMemoryMethod(),
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
    public suspend fun clearMemory(request: BaAgent.ClearMemoryRequest, headers: Metadata =
        Metadata()): BaAgent.ClearMemoryResponse = unaryRpc(
      channel,
      BAAgentServiceGrpc.getClearMemoryMethod(),
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
    public suspend fun generateRequirement(request: BaAgent.GenerateRequirementRequest,
        headers: Metadata = Metadata()): BaAgent.GenerateRequirementResponse = unaryRpc(
      channel,
      BAAgentServiceGrpc.getGenerateRequirementMethod(),
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
    public suspend fun getDocument(request: BaAgent.GetDocumentRequest, headers: Metadata =
        Metadata()): BaAgent.ExecuteTaskResponse = unaryRpc(
      channel,
      BAAgentServiceGrpc.getGetDocumentMethod(),
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
    public suspend fun getTierIndex(request: BaAgent.GetDocumentRequest, headers: Metadata =
        Metadata()): BaAgent.ExecuteTaskResponse = unaryRpc(
      channel,
      BAAgentServiceGrpc.getGetTierIndexMethod(),
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
    public suspend fun getTierOutline(request: BaAgent.GetDocumentRequest, headers: Metadata =
        Metadata()): BaAgent.ExecuteTaskResponse = unaryRpc(
      channel,
      BAAgentServiceGrpc.getGetTierOutlineMethod(),
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
    public suspend fun getTierFull(request: BaAgent.GetDocumentRequest, headers: Metadata =
        Metadata()): BaAgent.ExecuteTaskResponse = unaryRpc(
      channel,
      BAAgentServiceGrpc.getGetTierFullMethod(),
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
    public suspend fun approveRequirement(request: BaAgent.ApproveRequirementRequest,
        headers: Metadata = Metadata()): BaAgent.EmptyResponse = unaryRpc(
      channel,
      BAAgentServiceGrpc.getApproveRequirementMethod(),
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
    public suspend fun reviewRequirement(request: BaAgent.ReviewRequirementRequest,
        headers: Metadata = Metadata()): BaAgent.EmptyResponse = unaryRpc(
      channel,
      BAAgentServiceGrpc.getReviewRequirementMethod(),
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
    public suspend fun regenerateRequirement(request: BaAgent.GenerateRequirementRequest,
        headers: Metadata = Metadata()): BaAgent.GenerateRequirementResponse = unaryRpc(
      channel,
      BAAgentServiceGrpc.getRegenerateRequirementMethod(),
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
    public suspend fun getLineage(request: BaAgent.GetDocumentRequest, headers: Metadata =
        Metadata()): BaAgent.EmptyResponse = unaryRpc(
      channel,
      BAAgentServiceGrpc.getGetLineageMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the baagent.v1.BAAgentService service based on Kotlin coroutines.
   */
  public abstract class BAAgentServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for baagent.v1.BAAgentService.ExecuteTask.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun executeTask(request: BaAgent.ExecuteTaskRequest):
        BaAgent.ExecuteTaskResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method baagent.v1.BAAgentService.ExecuteTask is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for baagent.v1.BAAgentService.SubmitInput.
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
    public open fun submitInput(request: BaAgent.SubmitInputRequest):
        Flow<BaAgent.StreamExecuteTaskResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method baagent.v1.BAAgentService.SubmitInput is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for baagent.v1.BAAgentService.StreamExecuteTask.
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
    public open fun streamExecuteTask(request: BaAgent.ExecuteTaskRequest):
        Flow<BaAgent.StreamExecuteTaskResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method baagent.v1.BAAgentService.StreamExecuteTask is unimplemented"))

    /**
     * Returns the response to an RPC for baagent.v1.BAAgentService.GetTask.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getTask(request: BaAgent.GetTaskRequest): BaAgent.GetTaskResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method baagent.v1.BAAgentService.GetTask is unimplemented"))

    /**
     * Returns the response to an RPC for baagent.v1.BAAgentService.ListTools.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listTools(request: BaAgent.ListToolsRequest): BaAgent.ListToolsResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method baagent.v1.BAAgentService.ListTools is unimplemented"))

    /**
     * Returns the response to an RPC for baagent.v1.BAAgentService.GetMemory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getMemory(request: BaAgent.GetMemoryRequest): BaAgent.GetMemoryResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method baagent.v1.BAAgentService.GetMemory is unimplemented"))

    /**
     * Returns the response to an RPC for baagent.v1.BAAgentService.ClearMemory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun clearMemory(request: BaAgent.ClearMemoryRequest):
        BaAgent.ClearMemoryResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method baagent.v1.BAAgentService.ClearMemory is unimplemented"))

    /**
     * Returns the response to an RPC for baagent.v1.BAAgentService.GenerateRequirement.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun generateRequirement(request: BaAgent.GenerateRequirementRequest):
        BaAgent.GenerateRequirementResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method baagent.v1.BAAgentService.GenerateRequirement is unimplemented"))

    /**
     * Returns the response to an RPC for baagent.v1.BAAgentService.GetDocument.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getDocument(request: BaAgent.GetDocumentRequest):
        BaAgent.ExecuteTaskResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method baagent.v1.BAAgentService.GetDocument is unimplemented"))

    /**
     * Returns the response to an RPC for baagent.v1.BAAgentService.GetTierIndex.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getTierIndex(request: BaAgent.GetDocumentRequest):
        BaAgent.ExecuteTaskResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method baagent.v1.BAAgentService.GetTierIndex is unimplemented"))

    /**
     * Returns the response to an RPC for baagent.v1.BAAgentService.GetTierOutline.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getTierOutline(request: BaAgent.GetDocumentRequest):
        BaAgent.ExecuteTaskResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method baagent.v1.BAAgentService.GetTierOutline is unimplemented"))

    /**
     * Returns the response to an RPC for baagent.v1.BAAgentService.GetTierFull.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getTierFull(request: BaAgent.GetDocumentRequest):
        BaAgent.ExecuteTaskResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method baagent.v1.BAAgentService.GetTierFull is unimplemented"))

    /**
     * Returns the response to an RPC for baagent.v1.BAAgentService.ApproveRequirement.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveRequirement(request: BaAgent.ApproveRequirementRequest):
        BaAgent.EmptyResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method baagent.v1.BAAgentService.ApproveRequirement is unimplemented"))

    /**
     * Returns the response to an RPC for baagent.v1.BAAgentService.ReviewRequirement.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reviewRequirement(request: BaAgent.ReviewRequirementRequest):
        BaAgent.EmptyResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method baagent.v1.BAAgentService.ReviewRequirement is unimplemented"))

    /**
     * Returns the response to an RPC for baagent.v1.BAAgentService.RegenerateRequirement.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun regenerateRequirement(request: BaAgent.GenerateRequirementRequest):
        BaAgent.GenerateRequirementResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method baagent.v1.BAAgentService.RegenerateRequirement is unimplemented"))

    /**
     * Returns the response to an RPC for baagent.v1.BAAgentService.GetLineage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getLineage(request: BaAgent.GetDocumentRequest): BaAgent.EmptyResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method baagent.v1.BAAgentService.GetLineage is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BAAgentServiceGrpc.getExecuteTaskMethod(),
      implementation = ::executeTask
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = BAAgentServiceGrpc.getSubmitInputMethod(),
      implementation = ::submitInput
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = BAAgentServiceGrpc.getStreamExecuteTaskMethod(),
      implementation = ::streamExecuteTask
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BAAgentServiceGrpc.getGetTaskMethod(),
      implementation = ::getTask
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BAAgentServiceGrpc.getListToolsMethod(),
      implementation = ::listTools
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BAAgentServiceGrpc.getGetMemoryMethod(),
      implementation = ::getMemory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BAAgentServiceGrpc.getClearMemoryMethod(),
      implementation = ::clearMemory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BAAgentServiceGrpc.getGenerateRequirementMethod(),
      implementation = ::generateRequirement
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BAAgentServiceGrpc.getGetDocumentMethod(),
      implementation = ::getDocument
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BAAgentServiceGrpc.getGetTierIndexMethod(),
      implementation = ::getTierIndex
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BAAgentServiceGrpc.getGetTierOutlineMethod(),
      implementation = ::getTierOutline
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BAAgentServiceGrpc.getGetTierFullMethod(),
      implementation = ::getTierFull
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BAAgentServiceGrpc.getApproveRequirementMethod(),
      implementation = ::approveRequirement
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BAAgentServiceGrpc.getReviewRequirementMethod(),
      implementation = ::reviewRequirement
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BAAgentServiceGrpc.getRegenerateRequirementMethod(),
      implementation = ::regenerateRequirement
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BAAgentServiceGrpc.getGetLineageMethod(),
      implementation = ::getLineage
    )).build()
  }
}
