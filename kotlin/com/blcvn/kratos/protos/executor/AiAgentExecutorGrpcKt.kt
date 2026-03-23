package com.blcvn.kratos.protos.executor

import com.blcvn.kratos.protos.executor.ExecutorServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for executor.v1.ExecutorService.
 */
public object ExecutorServiceGrpcKt {
  public const val SERVICE_NAME: String = ExecutorServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val executeStepMethod:
      MethodDescriptor<AiAgentExecutor.ExecuteStepRequest, AiAgentExecutor.StepResult>
    @JvmStatic
    get() = ExecutorServiceGrpc.getExecuteStepMethod()

  public val executePhaseMethod:
      MethodDescriptor<AiAgentExecutor.ExecutePhaseRequest, AiAgentExecutor.PhaseResult>
    @JvmStatic
    get() = ExecutorServiceGrpc.getExecutePhaseMethod()

  public val listSkillsMethod:
      MethodDescriptor<AiAgentExecutor.ListSkillsRequest, AiAgentExecutor.ListSkillsResponse>
    @JvmStatic
    get() = ExecutorServiceGrpc.getListSkillsMethod()

  /**
   * A stub for issuing RPCs to a(n) executor.v1.ExecutorService service as suspending coroutines.
   */
  @StubFor(ExecutorServiceGrpc::class)
  public class ExecutorServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ExecutorServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ExecutorServiceCoroutineStub =
        ExecutorServiceCoroutineStub(channel, callOptions)

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
    public suspend fun executeStep(request: AiAgentExecutor.ExecuteStepRequest, headers: Metadata =
        Metadata()): AiAgentExecutor.StepResult = unaryRpc(
      channel,
      ExecutorServiceGrpc.getExecuteStepMethod(),
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
    public suspend fun executePhase(request: AiAgentExecutor.ExecutePhaseRequest, headers: Metadata
        = Metadata()): AiAgentExecutor.PhaseResult = unaryRpc(
      channel,
      ExecutorServiceGrpc.getExecutePhaseMethod(),
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
    public suspend fun listSkills(request: AiAgentExecutor.ListSkillsRequest, headers: Metadata =
        Metadata()): AiAgentExecutor.ListSkillsResponse = unaryRpc(
      channel,
      ExecutorServiceGrpc.getListSkillsMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the executor.v1.ExecutorService service based on Kotlin coroutines.
   */
  public abstract class ExecutorServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for executor.v1.ExecutorService.ExecuteStep.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun executeStep(request: AiAgentExecutor.ExecuteStepRequest):
        AiAgentExecutor.StepResult = throw
        StatusException(UNIMPLEMENTED.withDescription("Method executor.v1.ExecutorService.ExecuteStep is unimplemented"))

    /**
     * Returns the response to an RPC for executor.v1.ExecutorService.ExecutePhase.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun executePhase(request: AiAgentExecutor.ExecutePhaseRequest):
        AiAgentExecutor.PhaseResult = throw
        StatusException(UNIMPLEMENTED.withDescription("Method executor.v1.ExecutorService.ExecutePhase is unimplemented"))

    /**
     * Returns the response to an RPC for executor.v1.ExecutorService.ListSkills.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listSkills(request: AiAgentExecutor.ListSkillsRequest):
        AiAgentExecutor.ListSkillsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method executor.v1.ExecutorService.ListSkills is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ExecutorServiceGrpc.getExecuteStepMethod(),
      implementation = ::executeStep
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ExecutorServiceGrpc.getExecutePhaseMethod(),
      implementation = ::executePhase
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ExecutorServiceGrpc.getListSkillsMethod(),
      implementation = ::listSkills
    )).build()
  }
}
