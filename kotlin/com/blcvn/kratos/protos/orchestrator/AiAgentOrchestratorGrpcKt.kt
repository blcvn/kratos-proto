package com.blcvn.kratos.protos.orchestrator

import com.blcvn.kratos.protos.orchestrator.OrchestratorServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for orchestrator.v1.OrchestratorService.
 */
public object OrchestratorServiceGrpcKt {
  public const val SERVICE_NAME: String = OrchestratorServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val runTaskMethod:
      MethodDescriptor<AiAgentOrchestrator.RunTaskRequest, AiAgentOrchestrator.RunTaskResponse>
    @JvmStatic
    get() = OrchestratorServiceGrpc.getRunTaskMethod()

  public val createPlanMethod:
      MethodDescriptor<AiAgentOrchestrator.CreatePlanRequest, AiAgentOrchestrator.ExecutionPlan>
    @JvmStatic
    get() = OrchestratorServiceGrpc.getCreatePlanMethod()

  public val executePlanMethod:
      MethodDescriptor<AiAgentOrchestrator.ExecutionPlan, AiAgentOrchestrator.RunTaskResponse>
    @JvmStatic
    get() = OrchestratorServiceGrpc.getExecutePlanMethod()

  /**
   * A stub for issuing RPCs to a(n) orchestrator.v1.OrchestratorService service as suspending
   * coroutines.
   */
  @StubFor(OrchestratorServiceGrpc::class)
  public class OrchestratorServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<OrchestratorServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): OrchestratorServiceCoroutineStub
        = OrchestratorServiceCoroutineStub(channel, callOptions)

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
    public suspend fun runTask(request: AiAgentOrchestrator.RunTaskRequest, headers: Metadata =
        Metadata()): AiAgentOrchestrator.RunTaskResponse = unaryRpc(
      channel,
      OrchestratorServiceGrpc.getRunTaskMethod(),
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
    public suspend fun createPlan(request: AiAgentOrchestrator.CreatePlanRequest, headers: Metadata
        = Metadata()): AiAgentOrchestrator.ExecutionPlan = unaryRpc(
      channel,
      OrchestratorServiceGrpc.getCreatePlanMethod(),
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
    public suspend fun executePlan(request: AiAgentOrchestrator.ExecutionPlan, headers: Metadata =
        Metadata()): AiAgentOrchestrator.RunTaskResponse = unaryRpc(
      channel,
      OrchestratorServiceGrpc.getExecutePlanMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the orchestrator.v1.OrchestratorService service based on Kotlin
   * coroutines.
   */
  public abstract class OrchestratorServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for orchestrator.v1.OrchestratorService.RunTask.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun runTask(request: AiAgentOrchestrator.RunTaskRequest):
        AiAgentOrchestrator.RunTaskResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method orchestrator.v1.OrchestratorService.RunTask is unimplemented"))

    /**
     * Returns the response to an RPC for orchestrator.v1.OrchestratorService.CreatePlan.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createPlan(request: AiAgentOrchestrator.CreatePlanRequest):
        AiAgentOrchestrator.ExecutionPlan = throw
        StatusException(UNIMPLEMENTED.withDescription("Method orchestrator.v1.OrchestratorService.CreatePlan is unimplemented"))

    /**
     * Returns the response to an RPC for orchestrator.v1.OrchestratorService.ExecutePlan.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun executePlan(request: AiAgentOrchestrator.ExecutionPlan):
        AiAgentOrchestrator.RunTaskResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method orchestrator.v1.OrchestratorService.ExecutePlan is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OrchestratorServiceGrpc.getRunTaskMethod(),
      implementation = ::runTask
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OrchestratorServiceGrpc.getCreatePlanMethod(),
      implementation = ::createPlan
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OrchestratorServiceGrpc.getExecutePlanMethod(),
      implementation = ::executePlan
    )).build()
  }
}
