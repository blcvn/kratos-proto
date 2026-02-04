package com.blcvn.kratos.protos.session

import com.blcvn.kratos.protos.session.SessionServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for session.v1.SessionService.
 */
public object SessionServiceGrpcKt {
  public const val SERVICE_NAME: String = SessionServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createSessionMethod:
      MethodDescriptor<SessionOuterClass.CreateSessionRequest, SessionOuterClass.SessionReply>
    @JvmStatic
    get() = SessionServiceGrpc.getCreateSessionMethod()

  public val updateSessionMethod:
      MethodDescriptor<SessionOuterClass.UpdateSessionRequest, SessionOuterClass.SessionReply>
    @JvmStatic
    get() = SessionServiceGrpc.getUpdateSessionMethod()

  public val getSessionMethod:
      MethodDescriptor<SessionOuterClass.GetSessionRequest, SessionOuterClass.SessionReply>
    @JvmStatic
    get() = SessionServiceGrpc.getGetSessionMethod()

  public val getSessionByProjectMethod:
      MethodDescriptor<SessionOuterClass.GetSessionByProjectRequest, SessionOuterClass.SessionReply>
    @JvmStatic
    get() = SessionServiceGrpc.getGetSessionByProjectMethod()

  /**
   * A stub for issuing RPCs to a(n) session.v1.SessionService service as suspending coroutines.
   */
  @StubFor(SessionServiceGrpc::class)
  public class SessionServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<SessionServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): SessionServiceCoroutineStub =
        SessionServiceCoroutineStub(channel, callOptions)

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
    public suspend fun createSession(request: SessionOuterClass.CreateSessionRequest,
        headers: Metadata = Metadata()): SessionOuterClass.SessionReply = unaryRpc(
      channel,
      SessionServiceGrpc.getCreateSessionMethod(),
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
    public suspend fun updateSession(request: SessionOuterClass.UpdateSessionRequest,
        headers: Metadata = Metadata()): SessionOuterClass.SessionReply = unaryRpc(
      channel,
      SessionServiceGrpc.getUpdateSessionMethod(),
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
    public suspend fun getSession(request: SessionOuterClass.GetSessionRequest, headers: Metadata =
        Metadata()): SessionOuterClass.SessionReply = unaryRpc(
      channel,
      SessionServiceGrpc.getGetSessionMethod(),
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
    public suspend fun getSessionByProject(request: SessionOuterClass.GetSessionByProjectRequest,
        headers: Metadata = Metadata()): SessionOuterClass.SessionReply = unaryRpc(
      channel,
      SessionServiceGrpc.getGetSessionByProjectMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the session.v1.SessionService service based on Kotlin coroutines.
   */
  public abstract class SessionServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for session.v1.SessionService.CreateSession.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createSession(request: SessionOuterClass.CreateSessionRequest):
        SessionOuterClass.SessionReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method session.v1.SessionService.CreateSession is unimplemented"))

    /**
     * Returns the response to an RPC for session.v1.SessionService.UpdateSession.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateSession(request: SessionOuterClass.UpdateSessionRequest):
        SessionOuterClass.SessionReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method session.v1.SessionService.UpdateSession is unimplemented"))

    /**
     * Returns the response to an RPC for session.v1.SessionService.GetSession.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getSession(request: SessionOuterClass.GetSessionRequest):
        SessionOuterClass.SessionReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method session.v1.SessionService.GetSession is unimplemented"))

    /**
     * Returns the response to an RPC for session.v1.SessionService.GetSessionByProject.
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
        fun getSessionByProject(request: SessionOuterClass.GetSessionByProjectRequest):
        SessionOuterClass.SessionReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method session.v1.SessionService.GetSessionByProject is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SessionServiceGrpc.getCreateSessionMethod(),
      implementation = ::createSession
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SessionServiceGrpc.getUpdateSessionMethod(),
      implementation = ::updateSession
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SessionServiceGrpc.getGetSessionMethod(),
      implementation = ::getSession
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SessionServiceGrpc.getGetSessionByProjectMethod(),
      implementation = ::getSessionByProject
    )).build()
  }
}
