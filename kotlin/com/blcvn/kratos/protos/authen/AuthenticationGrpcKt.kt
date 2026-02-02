package com.blcvn.kratos.protos.authen

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
import com.blcvn.kratos.protos.authen.AuthenticateServiceGrpc.getServiceDescriptor as authenticateServiceGrpcGetServiceDescriptor
import com.blcvn.kratos.protos.authen.UserRoleServiceGrpc.getServiceDescriptor as userRoleServiceGrpcGetServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for authen.v1.AuthenticateService.
 */
public object AuthenticateServiceGrpcKt {
  public const val SERVICE_NAME: String = AuthenticateServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = authenticateServiceGrpcGetServiceDescriptor()

  public val registerMethod:
      MethodDescriptor<Authentication.RegisterRequest, Authentication.RegisterResponse>
    @JvmStatic
    get() = AuthenticateServiceGrpc.getRegisterMethod()

  public val loginMethod:
      MethodDescriptor<Authentication.LoginRequest, Authentication.LoginResponse>
    @JvmStatic
    get() = AuthenticateServiceGrpc.getLoginMethod()

  public val loginWithGoogleMethod:
      MethodDescriptor<Authentication.LoginWithGoogleRequest, Authentication.LoginResponse>
    @JvmStatic
    get() = AuthenticateServiceGrpc.getLoginWithGoogleMethod()

  public val logoutMethod:
      MethodDescriptor<Authentication.AuthenticationRequest, Authentication.AuthenticationResponse>
    @JvmStatic
    get() = AuthenticateServiceGrpc.getLogoutMethod()

  public val verifyTokenMethod:
      MethodDescriptor<Authentication.AuthenticationRequest, Authentication.TokenResponse>
    @JvmStatic
    get() = AuthenticateServiceGrpc.getVerifyTokenMethod()

  public val renewAccessTokenMethod:
      MethodDescriptor<Authentication.AuthenticationRequest, Authentication.TokenResponse>
    @JvmStatic
    get() = AuthenticateServiceGrpc.getRenewAccessTokenMethod()

  public val revokeAccessTokenMethod:
      MethodDescriptor<Authentication.RevokeTokenRequest, Authentication.TokenResponse>
    @JvmStatic
    get() = AuthenticateServiceGrpc.getRevokeAccessTokenMethod()

  public val revokeRefreshTokenMethod:
      MethodDescriptor<Authentication.RevokeTokenRequest, Authentication.TokenResponse>
    @JvmStatic
    get() = AuthenticateServiceGrpc.getRevokeRefreshTokenMethod()

  /**
   * A stub for issuing RPCs to a(n) authen.v1.AuthenticateService service as suspending coroutines.
   */
  @StubFor(AuthenticateServiceGrpc::class)
  public class AuthenticateServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AuthenticateServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): AuthenticateServiceCoroutineStub
        = AuthenticateServiceCoroutineStub(channel, callOptions)

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
    public suspend fun register(request: Authentication.RegisterRequest, headers: Metadata =
        Metadata()): Authentication.RegisterResponse = unaryRpc(
      channel,
      AuthenticateServiceGrpc.getRegisterMethod(),
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
    public suspend fun login(request: Authentication.LoginRequest, headers: Metadata = Metadata()):
        Authentication.LoginResponse = unaryRpc(
      channel,
      AuthenticateServiceGrpc.getLoginMethod(),
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
    public suspend fun loginWithGoogle(request: Authentication.LoginWithGoogleRequest,
        headers: Metadata = Metadata()): Authentication.LoginResponse = unaryRpc(
      channel,
      AuthenticateServiceGrpc.getLoginWithGoogleMethod(),
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
    public suspend fun logout(request: Authentication.AuthenticationRequest, headers: Metadata =
        Metadata()): Authentication.AuthenticationResponse = unaryRpc(
      channel,
      AuthenticateServiceGrpc.getLogoutMethod(),
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
    public suspend fun verifyToken(request: Authentication.AuthenticationRequest, headers: Metadata
        = Metadata()): Authentication.TokenResponse = unaryRpc(
      channel,
      AuthenticateServiceGrpc.getVerifyTokenMethod(),
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
    public suspend fun renewAccessToken(request: Authentication.AuthenticationRequest,
        headers: Metadata = Metadata()): Authentication.TokenResponse = unaryRpc(
      channel,
      AuthenticateServiceGrpc.getRenewAccessTokenMethod(),
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
    public suspend fun revokeAccessToken(request: Authentication.RevokeTokenRequest,
        headers: Metadata = Metadata()): Authentication.TokenResponse = unaryRpc(
      channel,
      AuthenticateServiceGrpc.getRevokeAccessTokenMethod(),
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
    public suspend fun revokeRefreshToken(request: Authentication.RevokeTokenRequest,
        headers: Metadata = Metadata()): Authentication.TokenResponse = unaryRpc(
      channel,
      AuthenticateServiceGrpc.getRevokeRefreshTokenMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the authen.v1.AuthenticateService service based on Kotlin
   * coroutines.
   */
  public abstract class AuthenticateServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for authen.v1.AuthenticateService.Register.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun register(request: Authentication.RegisterRequest):
        Authentication.RegisterResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authen.v1.AuthenticateService.Register is unimplemented"))

    /**
     * Returns the response to an RPC for authen.v1.AuthenticateService.Login.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun login(request: Authentication.LoginRequest):
        Authentication.LoginResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authen.v1.AuthenticateService.Login is unimplemented"))

    /**
     * Returns the response to an RPC for authen.v1.AuthenticateService.LoginWithGoogle.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun loginWithGoogle(request: Authentication.LoginWithGoogleRequest):
        Authentication.LoginResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authen.v1.AuthenticateService.LoginWithGoogle is unimplemented"))

    /**
     * Returns the response to an RPC for authen.v1.AuthenticateService.Logout.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun logout(request: Authentication.AuthenticationRequest):
        Authentication.AuthenticationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authen.v1.AuthenticateService.Logout is unimplemented"))

    /**
     * Returns the response to an RPC for authen.v1.AuthenticateService.VerifyToken.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun verifyToken(request: Authentication.AuthenticationRequest):
        Authentication.TokenResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authen.v1.AuthenticateService.VerifyToken is unimplemented"))

    /**
     * Returns the response to an RPC for authen.v1.AuthenticateService.RenewAccessToken.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun renewAccessToken(request: Authentication.AuthenticationRequest):
        Authentication.TokenResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authen.v1.AuthenticateService.RenewAccessToken is unimplemented"))

    /**
     * Returns the response to an RPC for authen.v1.AuthenticateService.RevokeAccessToken.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun revokeAccessToken(request: Authentication.RevokeTokenRequest):
        Authentication.TokenResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authen.v1.AuthenticateService.RevokeAccessToken is unimplemented"))

    /**
     * Returns the response to an RPC for authen.v1.AuthenticateService.RevokeRefreshToken.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun revokeRefreshToken(request: Authentication.RevokeTokenRequest):
        Authentication.TokenResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authen.v1.AuthenticateService.RevokeRefreshToken is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(authenticateServiceGrpcGetServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthenticateServiceGrpc.getRegisterMethod(),
      implementation = ::register
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthenticateServiceGrpc.getLoginMethod(),
      implementation = ::login
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthenticateServiceGrpc.getLoginWithGoogleMethod(),
      implementation = ::loginWithGoogle
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthenticateServiceGrpc.getLogoutMethod(),
      implementation = ::logout
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthenticateServiceGrpc.getVerifyTokenMethod(),
      implementation = ::verifyToken
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthenticateServiceGrpc.getRenewAccessTokenMethod(),
      implementation = ::renewAccessToken
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthenticateServiceGrpc.getRevokeAccessTokenMethod(),
      implementation = ::revokeAccessToken
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthenticateServiceGrpc.getRevokeRefreshTokenMethod(),
      implementation = ::revokeRefreshToken
    )).build()
  }
}

/**
 * Holder for Kotlin coroutine-based client and server APIs for authen.v1.UserRoleService.
 */
public object UserRoleServiceGrpcKt {
  public const val SERVICE_NAME: String = UserRoleServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = userRoleServiceGrpcGetServiceDescriptor()

  public val assignRoleMethod:
      MethodDescriptor<Authentication.UserRoleRequest, Authentication.UserRoleResponse>
    @JvmStatic
    get() = UserRoleServiceGrpc.getAssignRoleMethod()

  public val unassignRoleMethod:
      MethodDescriptor<Authentication.UserRoleRequest, Authentication.UserRoleResponse>
    @JvmStatic
    get() = UserRoleServiceGrpc.getUnassignRoleMethod()

  public val overrideRoleMethod:
      MethodDescriptor<Authentication.UserRoleRequest, Authentication.UserRoleResponse>
    @JvmStatic
    get() = UserRoleServiceGrpc.getOverrideRoleMethod()

  public val listRoleMethod:
      MethodDescriptor<Authentication.SearchRequest, Authentication.ListUserRoleResponse>
    @JvmStatic
    get() = UserRoleServiceGrpc.getListRoleMethod()

  public val activeUserMethod:
      MethodDescriptor<Authentication.UserStatusRequest, Authentication.UserRoleResponse>
    @JvmStatic
    get() = UserRoleServiceGrpc.getActiveUserMethod()

  public val inactiveUserMethod:
      MethodDescriptor<Authentication.UserStatusRequest, Authentication.UserRoleResponse>
    @JvmStatic
    get() = UserRoleServiceGrpc.getInactiveUserMethod()

  /**
   * A stub for issuing RPCs to a(n) authen.v1.UserRoleService service as suspending coroutines.
   */
  @StubFor(UserRoleServiceGrpc::class)
  public class UserRoleServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<UserRoleServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): UserRoleServiceCoroutineStub =
        UserRoleServiceCoroutineStub(channel, callOptions)

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
    public suspend fun assignRole(request: Authentication.UserRoleRequest, headers: Metadata =
        Metadata()): Authentication.UserRoleResponse = unaryRpc(
      channel,
      UserRoleServiceGrpc.getAssignRoleMethod(),
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
    public suspend fun unassignRole(request: Authentication.UserRoleRequest, headers: Metadata =
        Metadata()): Authentication.UserRoleResponse = unaryRpc(
      channel,
      UserRoleServiceGrpc.getUnassignRoleMethod(),
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
    public suspend fun overrideRole(request: Authentication.UserRoleRequest, headers: Metadata =
        Metadata()): Authentication.UserRoleResponse = unaryRpc(
      channel,
      UserRoleServiceGrpc.getOverrideRoleMethod(),
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
    public suspend fun listRole(request: Authentication.SearchRequest, headers: Metadata =
        Metadata()): Authentication.ListUserRoleResponse = unaryRpc(
      channel,
      UserRoleServiceGrpc.getListRoleMethod(),
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
    public suspend fun activeUser(request: Authentication.UserStatusRequest, headers: Metadata =
        Metadata()): Authentication.UserRoleResponse = unaryRpc(
      channel,
      UserRoleServiceGrpc.getActiveUserMethod(),
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
    public suspend fun inactiveUser(request: Authentication.UserStatusRequest, headers: Metadata =
        Metadata()): Authentication.UserRoleResponse = unaryRpc(
      channel,
      UserRoleServiceGrpc.getInactiveUserMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the authen.v1.UserRoleService service based on Kotlin coroutines.
   */
  public abstract class UserRoleServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for authen.v1.UserRoleService.AssignRole.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun assignRole(request: Authentication.UserRoleRequest):
        Authentication.UserRoleResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authen.v1.UserRoleService.AssignRole is unimplemented"))

    /**
     * Returns the response to an RPC for authen.v1.UserRoleService.UnassignRole.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun unassignRole(request: Authentication.UserRoleRequest):
        Authentication.UserRoleResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authen.v1.UserRoleService.UnassignRole is unimplemented"))

    /**
     * Returns the response to an RPC for authen.v1.UserRoleService.OverrideRole.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun overrideRole(request: Authentication.UserRoleRequest):
        Authentication.UserRoleResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authen.v1.UserRoleService.OverrideRole is unimplemented"))

    /**
     * Returns the response to an RPC for authen.v1.UserRoleService.ListRole.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listRole(request: Authentication.SearchRequest):
        Authentication.ListUserRoleResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authen.v1.UserRoleService.ListRole is unimplemented"))

    /**
     * Returns the response to an RPC for authen.v1.UserRoleService.ActiveUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun activeUser(request: Authentication.UserStatusRequest):
        Authentication.UserRoleResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authen.v1.UserRoleService.ActiveUser is unimplemented"))

    /**
     * Returns the response to an RPC for authen.v1.UserRoleService.InactiveUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun inactiveUser(request: Authentication.UserStatusRequest):
        Authentication.UserRoleResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authen.v1.UserRoleService.InactiveUser is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(userRoleServiceGrpcGetServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserRoleServiceGrpc.getAssignRoleMethod(),
      implementation = ::assignRole
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserRoleServiceGrpc.getUnassignRoleMethod(),
      implementation = ::unassignRole
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserRoleServiceGrpc.getOverrideRoleMethod(),
      implementation = ::overrideRole
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserRoleServiceGrpc.getListRoleMethod(),
      implementation = ::listRole
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserRoleServiceGrpc.getActiveUserMethod(),
      implementation = ::activeUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserRoleServiceGrpc.getInactiveUserMethod(),
      implementation = ::inactiveUser
    )).build()
  }
}
