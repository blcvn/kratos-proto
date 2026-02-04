package com.blcvn.kratos.protos.feature

import com.blcvn.kratos.protos.feature.FeatureServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for feature.v1.FeatureService.
 */
public object FeatureServiceGrpcKt {
  public const val SERVICE_NAME: String = FeatureServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createFeatureMethod:
      MethodDescriptor<FeatureOuterClass.CreateFeatureRequest, FeatureOuterClass.FeatureReply>
    @JvmStatic
    get() = FeatureServiceGrpc.getCreateFeatureMethod()

  public val updateFeatureMethod:
      MethodDescriptor<FeatureOuterClass.UpdateFeatureRequest, FeatureOuterClass.FeatureReply>
    @JvmStatic
    get() = FeatureServiceGrpc.getUpdateFeatureMethod()

  public val getFeatureMethod:
      MethodDescriptor<FeatureOuterClass.GetFeatureRequest, FeatureOuterClass.FeatureReply>
    @JvmStatic
    get() = FeatureServiceGrpc.getGetFeatureMethod()

  public val listFeaturesMethod:
      MethodDescriptor<FeatureOuterClass.ListFeaturesRequest, FeatureOuterClass.ListFeaturesReply>
    @JvmStatic
    get() = FeatureServiceGrpc.getListFeaturesMethod()

  public val deleteFeatureMethod:
      MethodDescriptor<FeatureOuterClass.DeleteFeatureRequest, FeatureOuterClass.FeatureReply>
    @JvmStatic
    get() = FeatureServiceGrpc.getDeleteFeatureMethod()

  /**
   * A stub for issuing RPCs to a(n) feature.v1.FeatureService service as suspending coroutines.
   */
  @StubFor(FeatureServiceGrpc::class)
  public class FeatureServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<FeatureServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): FeatureServiceCoroutineStub =
        FeatureServiceCoroutineStub(channel, callOptions)

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
    public suspend fun createFeature(request: FeatureOuterClass.CreateFeatureRequest,
        headers: Metadata = Metadata()): FeatureOuterClass.FeatureReply = unaryRpc(
      channel,
      FeatureServiceGrpc.getCreateFeatureMethod(),
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
    public suspend fun updateFeature(request: FeatureOuterClass.UpdateFeatureRequest,
        headers: Metadata = Metadata()): FeatureOuterClass.FeatureReply = unaryRpc(
      channel,
      FeatureServiceGrpc.getUpdateFeatureMethod(),
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
    public suspend fun getFeature(request: FeatureOuterClass.GetFeatureRequest, headers: Metadata =
        Metadata()): FeatureOuterClass.FeatureReply = unaryRpc(
      channel,
      FeatureServiceGrpc.getGetFeatureMethod(),
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
    public suspend fun listFeatures(request: FeatureOuterClass.ListFeaturesRequest,
        headers: Metadata = Metadata()): FeatureOuterClass.ListFeaturesReply = unaryRpc(
      channel,
      FeatureServiceGrpc.getListFeaturesMethod(),
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
    public suspend fun deleteFeature(request: FeatureOuterClass.DeleteFeatureRequest,
        headers: Metadata = Metadata()): FeatureOuterClass.FeatureReply = unaryRpc(
      channel,
      FeatureServiceGrpc.getDeleteFeatureMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the feature.v1.FeatureService service based on Kotlin coroutines.
   */
  public abstract class FeatureServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for feature.v1.FeatureService.CreateFeature.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createFeature(request: FeatureOuterClass.CreateFeatureRequest):
        FeatureOuterClass.FeatureReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method feature.v1.FeatureService.CreateFeature is unimplemented"))

    /**
     * Returns the response to an RPC for feature.v1.FeatureService.UpdateFeature.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateFeature(request: FeatureOuterClass.UpdateFeatureRequest):
        FeatureOuterClass.FeatureReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method feature.v1.FeatureService.UpdateFeature is unimplemented"))

    /**
     * Returns the response to an RPC for feature.v1.FeatureService.GetFeature.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getFeature(request: FeatureOuterClass.GetFeatureRequest):
        FeatureOuterClass.FeatureReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method feature.v1.FeatureService.GetFeature is unimplemented"))

    /**
     * Returns the response to an RPC for feature.v1.FeatureService.ListFeatures.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listFeatures(request: FeatureOuterClass.ListFeaturesRequest):
        FeatureOuterClass.ListFeaturesReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method feature.v1.FeatureService.ListFeatures is unimplemented"))

    /**
     * Returns the response to an RPC for feature.v1.FeatureService.DeleteFeature.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteFeature(request: FeatureOuterClass.DeleteFeatureRequest):
        FeatureOuterClass.FeatureReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method feature.v1.FeatureService.DeleteFeature is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeatureServiceGrpc.getCreateFeatureMethod(),
      implementation = ::createFeature
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeatureServiceGrpc.getUpdateFeatureMethod(),
      implementation = ::updateFeature
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeatureServiceGrpc.getGetFeatureMethod(),
      implementation = ::getFeature
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeatureServiceGrpc.getListFeaturesMethod(),
      implementation = ::listFeatures
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FeatureServiceGrpc.getDeleteFeatureMethod(),
      implementation = ::deleteFeature
    )).build()
  }
}
