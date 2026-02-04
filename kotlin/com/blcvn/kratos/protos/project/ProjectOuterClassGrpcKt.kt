package com.blcvn.kratos.protos.project

import com.blcvn.kratos.protos.project.ProjectServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for project.v1.ProjectService.
 */
public object ProjectServiceGrpcKt {
  public const val SERVICE_NAME: String = ProjectServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createProjectMethod:
      MethodDescriptor<ProjectOuterClass.CreateProjectRequest, ProjectOuterClass.ProjectReply>
    @JvmStatic
    get() = ProjectServiceGrpc.getCreateProjectMethod()

  public val updateProjectMethod:
      MethodDescriptor<ProjectOuterClass.UpdateProjectRequest, ProjectOuterClass.ProjectReply>
    @JvmStatic
    get() = ProjectServiceGrpc.getUpdateProjectMethod()

  public val listProjectsMethod:
      MethodDescriptor<ProjectOuterClass.ListProjectsRequest, ProjectOuterClass.ListProjectsReply>
    @JvmStatic
    get() = ProjectServiceGrpc.getListProjectsMethod()

  public val getProjectMethod:
      MethodDescriptor<ProjectOuterClass.GetProjectRequest, ProjectOuterClass.ProjectReply>
    @JvmStatic
    get() = ProjectServiceGrpc.getGetProjectMethod()

  public val deleteProjectMethod:
      MethodDescriptor<ProjectOuterClass.DeleteProjectRequest, ProjectOuterClass.DeleteReply>
    @JvmStatic
    get() = ProjectServiceGrpc.getDeleteProjectMethod()

  /**
   * A stub for issuing RPCs to a(n) project.v1.ProjectService service as suspending coroutines.
   */
  @StubFor(ProjectServiceGrpc::class)
  public class ProjectServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ProjectServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ProjectServiceCoroutineStub =
        ProjectServiceCoroutineStub(channel, callOptions)

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
    public suspend fun createProject(request: ProjectOuterClass.CreateProjectRequest,
        headers: Metadata = Metadata()): ProjectOuterClass.ProjectReply = unaryRpc(
      channel,
      ProjectServiceGrpc.getCreateProjectMethod(),
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
    public suspend fun updateProject(request: ProjectOuterClass.UpdateProjectRequest,
        headers: Metadata = Metadata()): ProjectOuterClass.ProjectReply = unaryRpc(
      channel,
      ProjectServiceGrpc.getUpdateProjectMethod(),
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
    public suspend fun listProjects(request: ProjectOuterClass.ListProjectsRequest,
        headers: Metadata = Metadata()): ProjectOuterClass.ListProjectsReply = unaryRpc(
      channel,
      ProjectServiceGrpc.getListProjectsMethod(),
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
    public suspend fun getProject(request: ProjectOuterClass.GetProjectRequest, headers: Metadata =
        Metadata()): ProjectOuterClass.ProjectReply = unaryRpc(
      channel,
      ProjectServiceGrpc.getGetProjectMethod(),
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
    public suspend fun deleteProject(request: ProjectOuterClass.DeleteProjectRequest,
        headers: Metadata = Metadata()): ProjectOuterClass.DeleteReply = unaryRpc(
      channel,
      ProjectServiceGrpc.getDeleteProjectMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the project.v1.ProjectService service based on Kotlin coroutines.
   */
  public abstract class ProjectServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for project.v1.ProjectService.CreateProject.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createProject(request: ProjectOuterClass.CreateProjectRequest):
        ProjectOuterClass.ProjectReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method project.v1.ProjectService.CreateProject is unimplemented"))

    /**
     * Returns the response to an RPC for project.v1.ProjectService.UpdateProject.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateProject(request: ProjectOuterClass.UpdateProjectRequest):
        ProjectOuterClass.ProjectReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method project.v1.ProjectService.UpdateProject is unimplemented"))

    /**
     * Returns the response to an RPC for project.v1.ProjectService.ListProjects.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listProjects(request: ProjectOuterClass.ListProjectsRequest):
        ProjectOuterClass.ListProjectsReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method project.v1.ProjectService.ListProjects is unimplemented"))

    /**
     * Returns the response to an RPC for project.v1.ProjectService.GetProject.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getProject(request: ProjectOuterClass.GetProjectRequest):
        ProjectOuterClass.ProjectReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method project.v1.ProjectService.GetProject is unimplemented"))

    /**
     * Returns the response to an RPC for project.v1.ProjectService.DeleteProject.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteProject(request: ProjectOuterClass.DeleteProjectRequest):
        ProjectOuterClass.DeleteReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method project.v1.ProjectService.DeleteProject is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectServiceGrpc.getCreateProjectMethod(),
      implementation = ::createProject
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectServiceGrpc.getUpdateProjectMethod(),
      implementation = ::updateProject
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectServiceGrpc.getListProjectsMethod(),
      implementation = ::listProjects
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectServiceGrpc.getGetProjectMethod(),
      implementation = ::getProject
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectServiceGrpc.getDeleteProjectMethod(),
      implementation = ::deleteProject
    )).build()
  }
}
