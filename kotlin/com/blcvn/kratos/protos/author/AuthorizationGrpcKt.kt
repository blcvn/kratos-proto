package com.blcvn.kratos.protos.author

import com.blcvn.kratos.protos.author.AuthorizationServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for author.v1.AuthorizationService.
 */
public object AuthorizationServiceGrpcKt {
  public const val SERVICE_NAME: String = AuthorizationServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createTenantMethod:
      MethodDescriptor<Authorization.TenantRequest, Authorization.TenantResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getCreateTenantMethod()

  public val updateTenantMethod:
      MethodDescriptor<Authorization.TenantRequest, Authorization.TenantResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getUpdateTenantMethod()

  public val deleteTenantMethod:
      MethodDescriptor<Authorization.TenantRequest, Authorization.TenantResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getDeleteTenantMethod()

  public val getTenantMethod:
      MethodDescriptor<Authorization.TenantRequest, Authorization.TenantResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getGetTenantMethod()

  public val listTenantMethod:
      MethodDescriptor<Authorization.ListTenantRequest, Authorization.ListTenantResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getListTenantMethod()

  public val searchTenantMethod:
      MethodDescriptor<Authorization.SearchRequest, Authorization.ListTenantResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getSearchTenantMethod()

  public val createRoleMethod:
      MethodDescriptor<Authorization.RoleRequest, Authorization.RoleResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getCreateRoleMethod()

  public val updateRoleMethod:
      MethodDescriptor<Authorization.RoleRequest, Authorization.RoleResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getUpdateRoleMethod()

  public val deleteRoleMethod:
      MethodDescriptor<Authorization.RoleRequest, Authorization.RoleResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getDeleteRoleMethod()

  public val getRoleMethod: MethodDescriptor<Authorization.RoleRequest, Authorization.RoleResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getGetRoleMethod()

  public val listRoleMethod:
      MethodDescriptor<Authorization.ListRoleRequest, Authorization.ListRoleResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getListRoleMethod()

  public val searchRoleMethod:
      MethodDescriptor<Authorization.SearchRequest, Authorization.ListRoleResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getSearchRoleMethod()

  public val createPermissionMethod:
      MethodDescriptor<Authorization.PermissionRequest, Authorization.PermissionResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getCreatePermissionMethod()

  public val updatePermissionMethod:
      MethodDescriptor<Authorization.PermissionRequest, Authorization.PermissionResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getUpdatePermissionMethod()

  public val deletePermissionMethod:
      MethodDescriptor<Authorization.PermissionRequest, Authorization.PermissionResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getDeletePermissionMethod()

  public val getPermissionMethod:
      MethodDescriptor<Authorization.PermissionRequest, Authorization.PermissionResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getGetPermissionMethod()

  public val listPermissionMethod:
      MethodDescriptor<Authorization.ListPermissionRequest, Authorization.ListPermissionResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getListPermissionMethod()

  public val searchPermissionMethod:
      MethodDescriptor<Authorization.SearchRequest, Authorization.ListPermissionResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getSearchPermissionMethod()

  public val assignPermissionMethod:
      MethodDescriptor<Authorization.RolePermissionRequest, Authorization.RolePermissionResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getAssignPermissionMethod()

  public val unassignPermissionMethod:
      MethodDescriptor<Authorization.RolePermissionRequest, Authorization.RolePermissionResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getUnassignPermissionMethod()

  public val overridePermissionMethod:
      MethodDescriptor<Authorization.RolePermissionRequest, Authorization.RolePermissionResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getOverridePermissionMethod()

  public val searchRolePermissionMethod:
      MethodDescriptor<Authorization.SearchRequest, Authorization.ListRolePermissionResponse>
    @JvmStatic
    get() = AuthorizationServiceGrpc.getSearchRolePermissionMethod()

  /**
   * A stub for issuing RPCs to a(n) author.v1.AuthorizationService service as suspending
   * coroutines.
   */
  @StubFor(AuthorizationServiceGrpc::class)
  public class AuthorizationServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AuthorizationServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        AuthorizationServiceCoroutineStub = AuthorizationServiceCoroutineStub(channel, callOptions)

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
    public suspend fun createTenant(request: Authorization.TenantRequest, headers: Metadata =
        Metadata()): Authorization.TenantResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getCreateTenantMethod(),
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
    public suspend fun updateTenant(request: Authorization.TenantRequest, headers: Metadata =
        Metadata()): Authorization.TenantResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getUpdateTenantMethod(),
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
    public suspend fun deleteTenant(request: Authorization.TenantRequest, headers: Metadata =
        Metadata()): Authorization.TenantResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getDeleteTenantMethod(),
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
    public suspend fun getTenant(request: Authorization.TenantRequest, headers: Metadata =
        Metadata()): Authorization.TenantResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getGetTenantMethod(),
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
    public suspend fun listTenant(request: Authorization.ListTenantRequest, headers: Metadata =
        Metadata()): Authorization.ListTenantResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getListTenantMethod(),
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
    public suspend fun searchTenant(request: Authorization.SearchRequest, headers: Metadata =
        Metadata()): Authorization.ListTenantResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getSearchTenantMethod(),
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
    public suspend fun createRole(request: Authorization.RoleRequest, headers: Metadata =
        Metadata()): Authorization.RoleResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getCreateRoleMethod(),
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
    public suspend fun updateRole(request: Authorization.RoleRequest, headers: Metadata =
        Metadata()): Authorization.RoleResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getUpdateRoleMethod(),
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
    public suspend fun deleteRole(request: Authorization.RoleRequest, headers: Metadata =
        Metadata()): Authorization.RoleResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getDeleteRoleMethod(),
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
    public suspend fun getRole(request: Authorization.RoleRequest, headers: Metadata = Metadata()):
        Authorization.RoleResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getGetRoleMethod(),
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
    public suspend fun listRole(request: Authorization.ListRoleRequest, headers: Metadata =
        Metadata()): Authorization.ListRoleResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getListRoleMethod(),
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
    public suspend fun searchRole(request: Authorization.SearchRequest, headers: Metadata =
        Metadata()): Authorization.ListRoleResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getSearchRoleMethod(),
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
    public suspend fun createPermission(request: Authorization.PermissionRequest, headers: Metadata
        = Metadata()): Authorization.PermissionResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getCreatePermissionMethod(),
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
    public suspend fun updatePermission(request: Authorization.PermissionRequest, headers: Metadata
        = Metadata()): Authorization.PermissionResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getUpdatePermissionMethod(),
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
    public suspend fun deletePermission(request: Authorization.PermissionRequest, headers: Metadata
        = Metadata()): Authorization.PermissionResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getDeletePermissionMethod(),
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
    public suspend fun getPermission(request: Authorization.PermissionRequest, headers: Metadata =
        Metadata()): Authorization.PermissionResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getGetPermissionMethod(),
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
    public suspend fun listPermission(request: Authorization.ListPermissionRequest,
        headers: Metadata = Metadata()): Authorization.ListPermissionResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getListPermissionMethod(),
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
    public suspend fun searchPermission(request: Authorization.SearchRequest, headers: Metadata =
        Metadata()): Authorization.ListPermissionResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getSearchPermissionMethod(),
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
    public suspend fun assignPermission(request: Authorization.RolePermissionRequest,
        headers: Metadata = Metadata()): Authorization.RolePermissionResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getAssignPermissionMethod(),
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
    public suspend fun unassignPermission(request: Authorization.RolePermissionRequest,
        headers: Metadata = Metadata()): Authorization.RolePermissionResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getUnassignPermissionMethod(),
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
    public suspend fun overridePermission(request: Authorization.RolePermissionRequest,
        headers: Metadata = Metadata()): Authorization.RolePermissionResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getOverridePermissionMethod(),
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
    public suspend fun searchRolePermission(request: Authorization.SearchRequest, headers: Metadata
        = Metadata()): Authorization.ListRolePermissionResponse = unaryRpc(
      channel,
      AuthorizationServiceGrpc.getSearchRolePermissionMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the author.v1.AuthorizationService service based on Kotlin
   * coroutines.
   */
  public abstract class AuthorizationServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.CreateTenant.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createTenant(request: Authorization.TenantRequest):
        Authorization.TenantResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.CreateTenant is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.UpdateTenant.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateTenant(request: Authorization.TenantRequest):
        Authorization.TenantResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.UpdateTenant is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.DeleteTenant.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteTenant(request: Authorization.TenantRequest):
        Authorization.TenantResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.DeleteTenant is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.GetTenant.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getTenant(request: Authorization.TenantRequest):
        Authorization.TenantResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.GetTenant is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.ListTenant.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listTenant(request: Authorization.ListTenantRequest):
        Authorization.ListTenantResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.ListTenant is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.SearchTenant.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchTenant(request: Authorization.SearchRequest):
        Authorization.ListTenantResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.SearchTenant is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.CreateRole.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createRole(request: Authorization.RoleRequest):
        Authorization.RoleResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.CreateRole is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.UpdateRole.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateRole(request: Authorization.RoleRequest):
        Authorization.RoleResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.UpdateRole is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.DeleteRole.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteRole(request: Authorization.RoleRequest):
        Authorization.RoleResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.DeleteRole is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.GetRole.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getRole(request: Authorization.RoleRequest): Authorization.RoleResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.GetRole is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.ListRole.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listRole(request: Authorization.ListRoleRequest):
        Authorization.ListRoleResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.ListRole is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.SearchRole.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchRole(request: Authorization.SearchRequest):
        Authorization.ListRoleResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.SearchRole is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.CreatePermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createPermission(request: Authorization.PermissionRequest):
        Authorization.PermissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.CreatePermission is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.UpdatePermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updatePermission(request: Authorization.PermissionRequest):
        Authorization.PermissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.UpdatePermission is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.DeletePermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deletePermission(request: Authorization.PermissionRequest):
        Authorization.PermissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.DeletePermission is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.GetPermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getPermission(request: Authorization.PermissionRequest):
        Authorization.PermissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.GetPermission is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.ListPermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listPermission(request: Authorization.ListPermissionRequest):
        Authorization.ListPermissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.ListPermission is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.SearchPermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchPermission(request: Authorization.SearchRequest):
        Authorization.ListPermissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.SearchPermission is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.AssignPermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun assignPermission(request: Authorization.RolePermissionRequest):
        Authorization.RolePermissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.AssignPermission is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.UnassignPermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun unassignPermission(request: Authorization.RolePermissionRequest):
        Authorization.RolePermissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.UnassignPermission is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.OverridePermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun overridePermission(request: Authorization.RolePermissionRequest):
        Authorization.RolePermissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.OverridePermission is unimplemented"))

    /**
     * Returns the response to an RPC for author.v1.AuthorizationService.SearchRolePermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchRolePermission(request: Authorization.SearchRequest):
        Authorization.ListRolePermissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method author.v1.AuthorizationService.SearchRolePermission is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getCreateTenantMethod(),
      implementation = ::createTenant
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getUpdateTenantMethod(),
      implementation = ::updateTenant
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getDeleteTenantMethod(),
      implementation = ::deleteTenant
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getGetTenantMethod(),
      implementation = ::getTenant
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getListTenantMethod(),
      implementation = ::listTenant
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getSearchTenantMethod(),
      implementation = ::searchTenant
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getCreateRoleMethod(),
      implementation = ::createRole
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getUpdateRoleMethod(),
      implementation = ::updateRole
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getDeleteRoleMethod(),
      implementation = ::deleteRole
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getGetRoleMethod(),
      implementation = ::getRole
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getListRoleMethod(),
      implementation = ::listRole
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getSearchRoleMethod(),
      implementation = ::searchRole
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getCreatePermissionMethod(),
      implementation = ::createPermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getUpdatePermissionMethod(),
      implementation = ::updatePermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getDeletePermissionMethod(),
      implementation = ::deletePermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getGetPermissionMethod(),
      implementation = ::getPermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getListPermissionMethod(),
      implementation = ::listPermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getSearchPermissionMethod(),
      implementation = ::searchPermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getAssignPermissionMethod(),
      implementation = ::assignPermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getUnassignPermissionMethod(),
      implementation = ::unassignPermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getOverridePermissionMethod(),
      implementation = ::overridePermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthorizationServiceGrpc.getSearchRolePermissionMethod(),
      implementation = ::searchRolePermission
    )).build()
  }
}
