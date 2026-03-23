package com.blcvn.kratos.protos.planner

import com.blcvn.kratos.protos.planner.PlannerServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for planner.v1.PlannerService.
 */
public object PlannerServiceGrpcKt {
  public const val SERVICE_NAME: String = PlannerServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createPlanMethod:
      MethodDescriptor<AiAgentPlanner.CreatePlanRequest, AiAgentPlanner.ExecutionPlan>
    @JvmStatic
    get() = PlannerServiceGrpc.getCreatePlanMethod()

  public val validatePlanMethod:
      MethodDescriptor<AiAgentPlanner.ExecutionPlan, AiAgentPlanner.ValidationResult>
    @JvmStatic
    get() = PlannerServiceGrpc.getValidatePlanMethod()

  /**
   * A stub for issuing RPCs to a(n) planner.v1.PlannerService service as suspending coroutines.
   */
  @StubFor(PlannerServiceGrpc::class)
  public class PlannerServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<PlannerServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): PlannerServiceCoroutineStub =
        PlannerServiceCoroutineStub(channel, callOptions)

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
    public suspend fun createPlan(request: AiAgentPlanner.CreatePlanRequest, headers: Metadata =
        Metadata()): AiAgentPlanner.ExecutionPlan = unaryRpc(
      channel,
      PlannerServiceGrpc.getCreatePlanMethod(),
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
    public suspend fun validatePlan(request: AiAgentPlanner.ExecutionPlan, headers: Metadata =
        Metadata()): AiAgentPlanner.ValidationResult = unaryRpc(
      channel,
      PlannerServiceGrpc.getValidatePlanMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the planner.v1.PlannerService service based on Kotlin coroutines.
   */
  public abstract class PlannerServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for planner.v1.PlannerService.CreatePlan.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createPlan(request: AiAgentPlanner.CreatePlanRequest):
        AiAgentPlanner.ExecutionPlan = throw
        StatusException(UNIMPLEMENTED.withDescription("Method planner.v1.PlannerService.CreatePlan is unimplemented"))

    /**
     * Returns the response to an RPC for planner.v1.PlannerService.ValidatePlan.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun validatePlan(request: AiAgentPlanner.ExecutionPlan):
        AiAgentPlanner.ValidationResult = throw
        StatusException(UNIMPLEMENTED.withDescription("Method planner.v1.PlannerService.ValidatePlan is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PlannerServiceGrpc.getCreatePlanMethod(),
      implementation = ::createPlan
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PlannerServiceGrpc.getValidatePlanMethod(),
      implementation = ::validatePlan
    )).build()
  }
}
