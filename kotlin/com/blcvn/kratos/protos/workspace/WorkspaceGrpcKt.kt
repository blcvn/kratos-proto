package com.blcvn.kratos.protos.workspace

import com.blcvn.kratos.protos.workspace.WorkspaceServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for workspace.v1.WorkspaceService.
 */
public object WorkspaceServiceGrpcKt {
  public const val SERVICE_NAME: String = WorkspaceServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createProjectMethod:
      MethodDescriptor<Workspace.CreateProjectRequest, Workspace.ProjectReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getCreateProjectMethod()

  public val listProjectsMethod:
      MethodDescriptor<Workspace.ListProjectsRequest, Workspace.ListProjectsReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getListProjectsMethod()

  public val getProjectMethod: MethodDescriptor<Workspace.GetProjectRequest, Workspace.ProjectReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getGetProjectMethod()

  public val updateProjectMethod:
      MethodDescriptor<Workspace.UpdateProjectRequest, Workspace.ProjectReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getUpdateProjectMethod()

  public val deleteProjectMethod:
      MethodDescriptor<Workspace.DeleteProjectRequest, Workspace.EmptyReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getDeleteProjectMethod()

  public val addProjectMemberMethod:
      MethodDescriptor<Workspace.AddProjectMemberRequest, Workspace.ProjectMemberReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getAddProjectMemberMethod()

  public val removeProjectMemberMethod:
      MethodDescriptor<Workspace.RemoveProjectMemberRequest, Workspace.EmptyReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getRemoveProjectMemberMethod()

  public val listProjectMembersMethod:
      MethodDescriptor<Workspace.ListProjectMembersRequest, Workspace.ListProjectMembersReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getListProjectMembersMethod()

  public val updateProjectMemberRoleMethod:
      MethodDescriptor<Workspace.UpdateProjectMemberRoleRequest, Workspace.ProjectMemberReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getUpdateProjectMemberRoleMethod()

  public val getFeatureTreeMethod:
      MethodDescriptor<Workspace.GetFeatureTreeRequest, Workspace.GetFeatureTreeReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getGetFeatureTreeMethod()

  public val getRootFeatureMethod:
      MethodDescriptor<Workspace.GetRootFeatureRequest, Workspace.FeatureReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getGetRootFeatureMethod()

  public val createFeatureMethod:
      MethodDescriptor<Workspace.CreateFeatureRequest, Workspace.FeatureReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getCreateFeatureMethod()

  public val createFeatureGroupMethod:
      MethodDescriptor<Workspace.CreateFeatureGroupRequest, Workspace.FeatureReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getCreateFeatureGroupMethod()

  public val getFeatureMethod: MethodDescriptor<Workspace.GetFeatureRequest, Workspace.FeatureReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getGetFeatureMethod()

  public val updateFeatureMethod:
      MethodDescriptor<Workspace.UpdateFeatureRequest, Workspace.FeatureReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getUpdateFeatureMethod()

  public val deleteFeatureMethod:
      MethodDescriptor<Workspace.DeleteFeatureRequest, Workspace.EmptyReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getDeleteFeatureMethod()

  public val addFeatureMemberMethod:
      MethodDescriptor<Workspace.AddFeatureMemberRequest, Workspace.FeatureMemberReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getAddFeatureMemberMethod()

  public val listFeatureMembersMethod:
      MethodDescriptor<Workspace.ListFeatureMembersRequest, Workspace.ListFeatureMembersReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getListFeatureMembersMethod()

  public val updateFeatureMemberRoleMethod:
      MethodDescriptor<Workspace.UpdateFeatureMemberRoleRequest, Workspace.FeatureMemberReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getUpdateFeatureMemberRoleMethod()

  public val removeFeatureMemberMethod:
      MethodDescriptor<Workspace.RemoveFeatureMemberRequest, Workspace.EmptyReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getRemoveFeatureMemberMethod()

  public val createDocumentMethod:
      MethodDescriptor<Workspace.CreateDocumentRequest, Workspace.DocumentReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getCreateDocumentMethod()

  public val listDocumentsMethod:
      MethodDescriptor<Workspace.ListDocumentsRequest, Workspace.ListDocumentsReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getListDocumentsMethod()

  public val listDocumentSectionsMethod:
      MethodDescriptor<Workspace.ListDocumentSectionsRequest, Workspace.ListDocumentSectionsReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getListDocumentSectionsMethod()

  public val getDocumentSectionMethod:
      MethodDescriptor<Workspace.GetDocumentSectionRequest, Workspace.DocumentSectionReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getGetDocumentSectionMethod()

  public val createDocumentSectionMethod:
      MethodDescriptor<Workspace.CreateDocumentSectionRequest, Workspace.DocumentSectionReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getCreateDocumentSectionMethod()

  public val updateDocumentSectionMethod:
      MethodDescriptor<Workspace.UpdateDocumentSectionRequest, Workspace.DocumentSectionReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getUpdateDocumentSectionMethod()

  public val updateDocumentSectionContentMethod:
      MethodDescriptor<Workspace.UpdateDocumentSectionContentRequest, Workspace.DocumentSectionReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getUpdateDocumentSectionContentMethod()

  public val createDocumentSectionVersionMethod:
      MethodDescriptor<Workspace.CreateDocumentSectionVersionRequest, Workspace.DocumentSectionReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getCreateDocumentSectionVersionMethod()

  public val upsertDocumentAndSectionMethod:
      MethodDescriptor<Workspace.UpsertDocumentAndSectionRequest, Workspace.DocumentSectionReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getUpsertDocumentAndSectionMethod()

  public val listDocumentSectionVersionsMethod:
      MethodDescriptor<Workspace.ListDocumentSectionVersionsRequest, Workspace.ListDocumentSectionsReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getListDocumentSectionVersionsMethod()

  public val getCurrentDocumentSectionVersionMethod:
      MethodDescriptor<Workspace.GetCurrentDocumentSectionVersionRequest, Workspace.DocumentSectionReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getGetCurrentDocumentSectionVersionMethod()

  public val setCurrentDocumentSectionVersionMethod:
      MethodDescriptor<Workspace.SetCurrentDocumentSectionVersionRequest, Workspace.DocumentSectionReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getSetCurrentDocumentSectionVersionMethod()

  public val listChatMessagesMethod:
      MethodDescriptor<Workspace.ListChatMessagesRequest, Workspace.ListChatMessagesReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getListChatMessagesMethod()

  public val appendChatMessageMethod:
      MethodDescriptor<Workspace.AppendChatMessageRequest, Workspace.ChatMessageReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getAppendChatMessageMethod()

  public val createSessionMethod:
      MethodDescriptor<Workspace.CreateSessionRequest, Workspace.SessionReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getCreateSessionMethod()

  public val updateSessionContextMethod:
      MethodDescriptor<Workspace.UpdateSessionContextRequest, Workspace.EmptyReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getUpdateSessionContextMethod()

  public val getSessionMethod: MethodDescriptor<Workspace.GetSessionRequest, Workspace.SessionReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getGetSessionMethod()

  public val listProjectSessionsMethod:
      MethodDescriptor<Workspace.ListProjectSessionsRequest, Workspace.ListSessionsReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getListProjectSessionsMethod()

  public val pushUrdConfluenceMethod:
      MethodDescriptor<Workspace.PushUrdConfluenceRequest, Workspace.PushUrdConfluenceReply>
    @JvmStatic
    get() = WorkspaceServiceGrpc.getPushUrdConfluenceMethod()

  /**
   * A stub for issuing RPCs to a(n) workspace.v1.WorkspaceService service as suspending coroutines.
   */
  @StubFor(WorkspaceServiceGrpc::class)
  public class WorkspaceServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<WorkspaceServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): WorkspaceServiceCoroutineStub =
        WorkspaceServiceCoroutineStub(channel, callOptions)

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
    public suspend fun createProject(request: Workspace.CreateProjectRequest, headers: Metadata =
        Metadata()): Workspace.ProjectReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getCreateProjectMethod(),
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
    public suspend fun listProjects(request: Workspace.ListProjectsRequest, headers: Metadata =
        Metadata()): Workspace.ListProjectsReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getListProjectsMethod(),
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
    public suspend fun getProject(request: Workspace.GetProjectRequest, headers: Metadata =
        Metadata()): Workspace.ProjectReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getGetProjectMethod(),
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
    public suspend fun updateProject(request: Workspace.UpdateProjectRequest, headers: Metadata =
        Metadata()): Workspace.ProjectReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getUpdateProjectMethod(),
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
    public suspend fun deleteProject(request: Workspace.DeleteProjectRequest, headers: Metadata =
        Metadata()): Workspace.EmptyReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getDeleteProjectMethod(),
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
    public suspend fun addProjectMember(request: Workspace.AddProjectMemberRequest,
        headers: Metadata = Metadata()): Workspace.ProjectMemberReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getAddProjectMemberMethod(),
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
    public suspend fun removeProjectMember(request: Workspace.RemoveProjectMemberRequest,
        headers: Metadata = Metadata()): Workspace.EmptyReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getRemoveProjectMemberMethod(),
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
    public suspend fun listProjectMembers(request: Workspace.ListProjectMembersRequest,
        headers: Metadata = Metadata()): Workspace.ListProjectMembersReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getListProjectMembersMethod(),
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
    public suspend fun updateProjectMemberRole(request: Workspace.UpdateProjectMemberRoleRequest,
        headers: Metadata = Metadata()): Workspace.ProjectMemberReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getUpdateProjectMemberRoleMethod(),
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
    public suspend fun getFeatureTree(request: Workspace.GetFeatureTreeRequest, headers: Metadata =
        Metadata()): Workspace.GetFeatureTreeReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getGetFeatureTreeMethod(),
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
    public suspend fun getRootFeature(request: Workspace.GetRootFeatureRequest, headers: Metadata =
        Metadata()): Workspace.FeatureReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getGetRootFeatureMethod(),
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
    public suspend fun createFeature(request: Workspace.CreateFeatureRequest, headers: Metadata =
        Metadata()): Workspace.FeatureReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getCreateFeatureMethod(),
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
    public suspend fun createFeatureGroup(request: Workspace.CreateFeatureGroupRequest,
        headers: Metadata = Metadata()): Workspace.FeatureReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getCreateFeatureGroupMethod(),
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
    public suspend fun getFeature(request: Workspace.GetFeatureRequest, headers: Metadata =
        Metadata()): Workspace.FeatureReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getGetFeatureMethod(),
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
    public suspend fun updateFeature(request: Workspace.UpdateFeatureRequest, headers: Metadata =
        Metadata()): Workspace.FeatureReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getUpdateFeatureMethod(),
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
    public suspend fun deleteFeature(request: Workspace.DeleteFeatureRequest, headers: Metadata =
        Metadata()): Workspace.EmptyReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getDeleteFeatureMethod(),
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
    public suspend fun addFeatureMember(request: Workspace.AddFeatureMemberRequest,
        headers: Metadata = Metadata()): Workspace.FeatureMemberReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getAddFeatureMemberMethod(),
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
    public suspend fun listFeatureMembers(request: Workspace.ListFeatureMembersRequest,
        headers: Metadata = Metadata()): Workspace.ListFeatureMembersReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getListFeatureMembersMethod(),
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
    public suspend fun updateFeatureMemberRole(request: Workspace.UpdateFeatureMemberRoleRequest,
        headers: Metadata = Metadata()): Workspace.FeatureMemberReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getUpdateFeatureMemberRoleMethod(),
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
    public suspend fun removeFeatureMember(request: Workspace.RemoveFeatureMemberRequest,
        headers: Metadata = Metadata()): Workspace.EmptyReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getRemoveFeatureMemberMethod(),
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
    public suspend fun createDocument(request: Workspace.CreateDocumentRequest, headers: Metadata =
        Metadata()): Workspace.DocumentReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getCreateDocumentMethod(),
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
    public suspend fun listDocuments(request: Workspace.ListDocumentsRequest, headers: Metadata =
        Metadata()): Workspace.ListDocumentsReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getListDocumentsMethod(),
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
    public suspend fun listDocumentSections(request: Workspace.ListDocumentSectionsRequest,
        headers: Metadata = Metadata()): Workspace.ListDocumentSectionsReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getListDocumentSectionsMethod(),
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
    public suspend fun getDocumentSection(request: Workspace.GetDocumentSectionRequest,
        headers: Metadata = Metadata()): Workspace.DocumentSectionReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getGetDocumentSectionMethod(),
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
    public suspend fun createDocumentSection(request: Workspace.CreateDocumentSectionRequest,
        headers: Metadata = Metadata()): Workspace.DocumentSectionReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getCreateDocumentSectionMethod(),
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
    public suspend fun updateDocumentSection(request: Workspace.UpdateDocumentSectionRequest,
        headers: Metadata = Metadata()): Workspace.DocumentSectionReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getUpdateDocumentSectionMethod(),
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
    public suspend
        fun updateDocumentSectionContent(request: Workspace.UpdateDocumentSectionContentRequest,
        headers: Metadata = Metadata()): Workspace.DocumentSectionReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getUpdateDocumentSectionContentMethod(),
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
    public suspend
        fun createDocumentSectionVersion(request: Workspace.CreateDocumentSectionVersionRequest,
        headers: Metadata = Metadata()): Workspace.DocumentSectionReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getCreateDocumentSectionVersionMethod(),
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
    public suspend fun upsertDocumentAndSection(request: Workspace.UpsertDocumentAndSectionRequest,
        headers: Metadata = Metadata()): Workspace.DocumentSectionReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getUpsertDocumentAndSectionMethod(),
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
    public suspend
        fun listDocumentSectionVersions(request: Workspace.ListDocumentSectionVersionsRequest,
        headers: Metadata = Metadata()): Workspace.ListDocumentSectionsReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getListDocumentSectionVersionsMethod(),
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
    public suspend
        fun getCurrentDocumentSectionVersion(request: Workspace.GetCurrentDocumentSectionVersionRequest,
        headers: Metadata = Metadata()): Workspace.DocumentSectionReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getGetCurrentDocumentSectionVersionMethod(),
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
    public suspend
        fun setCurrentDocumentSectionVersion(request: Workspace.SetCurrentDocumentSectionVersionRequest,
        headers: Metadata = Metadata()): Workspace.DocumentSectionReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getSetCurrentDocumentSectionVersionMethod(),
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
    public suspend fun listChatMessages(request: Workspace.ListChatMessagesRequest,
        headers: Metadata = Metadata()): Workspace.ListChatMessagesReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getListChatMessagesMethod(),
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
    public suspend fun appendChatMessage(request: Workspace.AppendChatMessageRequest,
        headers: Metadata = Metadata()): Workspace.ChatMessageReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getAppendChatMessageMethod(),
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
    public suspend fun createSession(request: Workspace.CreateSessionRequest, headers: Metadata =
        Metadata()): Workspace.SessionReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getCreateSessionMethod(),
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
    public suspend fun updateSessionContext(request: Workspace.UpdateSessionContextRequest,
        headers: Metadata = Metadata()): Workspace.EmptyReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getUpdateSessionContextMethod(),
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
    public suspend fun getSession(request: Workspace.GetSessionRequest, headers: Metadata =
        Metadata()): Workspace.SessionReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getGetSessionMethod(),
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
    public suspend fun listProjectSessions(request: Workspace.ListProjectSessionsRequest,
        headers: Metadata = Metadata()): Workspace.ListSessionsReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getListProjectSessionsMethod(),
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
    public suspend fun pushUrdConfluence(request: Workspace.PushUrdConfluenceRequest,
        headers: Metadata = Metadata()): Workspace.PushUrdConfluenceReply = unaryRpc(
      channel,
      WorkspaceServiceGrpc.getPushUrdConfluenceMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the workspace.v1.WorkspaceService service based on Kotlin
   * coroutines.
   */
  public abstract class WorkspaceServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.CreateProject.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createProject(request: Workspace.CreateProjectRequest):
        Workspace.ProjectReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.CreateProject is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.ListProjects.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listProjects(request: Workspace.ListProjectsRequest):
        Workspace.ListProjectsReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.ListProjects is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.GetProject.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getProject(request: Workspace.GetProjectRequest): Workspace.ProjectReply
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.GetProject is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.UpdateProject.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateProject(request: Workspace.UpdateProjectRequest):
        Workspace.ProjectReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.UpdateProject is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.DeleteProject.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteProject(request: Workspace.DeleteProjectRequest):
        Workspace.EmptyReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.DeleteProject is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.AddProjectMember.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addProjectMember(request: Workspace.AddProjectMemberRequest):
        Workspace.ProjectMemberReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.AddProjectMember is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.RemoveProjectMember.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun removeProjectMember(request: Workspace.RemoveProjectMemberRequest):
        Workspace.EmptyReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.RemoveProjectMember is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.ListProjectMembers.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listProjectMembers(request: Workspace.ListProjectMembersRequest):
        Workspace.ListProjectMembersReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.ListProjectMembers is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.UpdateProjectMemberRole.
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
        fun updateProjectMemberRole(request: Workspace.UpdateProjectMemberRoleRequest):
        Workspace.ProjectMemberReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.UpdateProjectMemberRole is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.GetFeatureTree.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getFeatureTree(request: Workspace.GetFeatureTreeRequest):
        Workspace.GetFeatureTreeReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.GetFeatureTree is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.GetRootFeature.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getRootFeature(request: Workspace.GetRootFeatureRequest):
        Workspace.FeatureReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.GetRootFeature is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.CreateFeature.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createFeature(request: Workspace.CreateFeatureRequest):
        Workspace.FeatureReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.CreateFeature is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.CreateFeatureGroup.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createFeatureGroup(request: Workspace.CreateFeatureGroupRequest):
        Workspace.FeatureReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.CreateFeatureGroup is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.GetFeature.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getFeature(request: Workspace.GetFeatureRequest): Workspace.FeatureReply
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.GetFeature is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.UpdateFeature.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateFeature(request: Workspace.UpdateFeatureRequest):
        Workspace.FeatureReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.UpdateFeature is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.DeleteFeature.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteFeature(request: Workspace.DeleteFeatureRequest):
        Workspace.EmptyReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.DeleteFeature is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.AddFeatureMember.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addFeatureMember(request: Workspace.AddFeatureMemberRequest):
        Workspace.FeatureMemberReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.AddFeatureMember is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.ListFeatureMembers.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listFeatureMembers(request: Workspace.ListFeatureMembersRequest):
        Workspace.ListFeatureMembersReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.ListFeatureMembers is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.UpdateFeatureMemberRole.
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
        fun updateFeatureMemberRole(request: Workspace.UpdateFeatureMemberRoleRequest):
        Workspace.FeatureMemberReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.UpdateFeatureMemberRole is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.RemoveFeatureMember.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun removeFeatureMember(request: Workspace.RemoveFeatureMemberRequest):
        Workspace.EmptyReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.RemoveFeatureMember is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.CreateDocument.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createDocument(request: Workspace.CreateDocumentRequest):
        Workspace.DocumentReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.CreateDocument is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.ListDocuments.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listDocuments(request: Workspace.ListDocumentsRequest):
        Workspace.ListDocumentsReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.ListDocuments is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.ListDocumentSections.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listDocumentSections(request: Workspace.ListDocumentSectionsRequest):
        Workspace.ListDocumentSectionsReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.ListDocumentSections is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.GetDocumentSection.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getDocumentSection(request: Workspace.GetDocumentSectionRequest):
        Workspace.DocumentSectionReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.GetDocumentSection is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.CreateDocumentSection.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createDocumentSection(request: Workspace.CreateDocumentSectionRequest):
        Workspace.DocumentSectionReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.CreateDocumentSection is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.UpdateDocumentSection.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateDocumentSection(request: Workspace.UpdateDocumentSectionRequest):
        Workspace.DocumentSectionReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.UpdateDocumentSection is unimplemented"))

    /**
     * Returns the response to an RPC for
     * workspace.v1.WorkspaceService.UpdateDocumentSectionContent.
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
        fun updateDocumentSectionContent(request: Workspace.UpdateDocumentSectionContentRequest):
        Workspace.DocumentSectionReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.UpdateDocumentSectionContent is unimplemented"))

    /**
     * Returns the response to an RPC for
     * workspace.v1.WorkspaceService.CreateDocumentSectionVersion.
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
        fun createDocumentSectionVersion(request: Workspace.CreateDocumentSectionVersionRequest):
        Workspace.DocumentSectionReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.CreateDocumentSectionVersion is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.UpsertDocumentAndSection.
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
        fun upsertDocumentAndSection(request: Workspace.UpsertDocumentAndSectionRequest):
        Workspace.DocumentSectionReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.UpsertDocumentAndSection is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.ListDocumentSectionVersions.
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
        fun listDocumentSectionVersions(request: Workspace.ListDocumentSectionVersionsRequest):
        Workspace.ListDocumentSectionsReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.ListDocumentSectionVersions is unimplemented"))

    /**
     * Returns the response to an RPC for
     * workspace.v1.WorkspaceService.GetCurrentDocumentSectionVersion.
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
        fun getCurrentDocumentSectionVersion(request: Workspace.GetCurrentDocumentSectionVersionRequest):
        Workspace.DocumentSectionReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.GetCurrentDocumentSectionVersion is unimplemented"))

    /**
     * Returns the response to an RPC for
     * workspace.v1.WorkspaceService.SetCurrentDocumentSectionVersion.
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
        fun setCurrentDocumentSectionVersion(request: Workspace.SetCurrentDocumentSectionVersionRequest):
        Workspace.DocumentSectionReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.SetCurrentDocumentSectionVersion is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.ListChatMessages.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listChatMessages(request: Workspace.ListChatMessagesRequest):
        Workspace.ListChatMessagesReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.ListChatMessages is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.AppendChatMessage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun appendChatMessage(request: Workspace.AppendChatMessageRequest):
        Workspace.ChatMessageReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.AppendChatMessage is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.CreateSession.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createSession(request: Workspace.CreateSessionRequest):
        Workspace.SessionReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.CreateSession is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.UpdateSessionContext.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateSessionContext(request: Workspace.UpdateSessionContextRequest):
        Workspace.EmptyReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.UpdateSessionContext is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.GetSession.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getSession(request: Workspace.GetSessionRequest): Workspace.SessionReply
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.GetSession is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.ListProjectSessions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listProjectSessions(request: Workspace.ListProjectSessionsRequest):
        Workspace.ListSessionsReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.ListProjectSessions is unimplemented"))

    /**
     * Returns the response to an RPC for workspace.v1.WorkspaceService.PushUrdConfluence.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun pushUrdConfluence(request: Workspace.PushUrdConfluenceRequest):
        Workspace.PushUrdConfluenceReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method workspace.v1.WorkspaceService.PushUrdConfluence is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getCreateProjectMethod(),
      implementation = ::createProject
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getListProjectsMethod(),
      implementation = ::listProjects
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getGetProjectMethod(),
      implementation = ::getProject
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getUpdateProjectMethod(),
      implementation = ::updateProject
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getDeleteProjectMethod(),
      implementation = ::deleteProject
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getAddProjectMemberMethod(),
      implementation = ::addProjectMember
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getRemoveProjectMemberMethod(),
      implementation = ::removeProjectMember
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getListProjectMembersMethod(),
      implementation = ::listProjectMembers
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getUpdateProjectMemberRoleMethod(),
      implementation = ::updateProjectMemberRole
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getGetFeatureTreeMethod(),
      implementation = ::getFeatureTree
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getGetRootFeatureMethod(),
      implementation = ::getRootFeature
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getCreateFeatureMethod(),
      implementation = ::createFeature
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getCreateFeatureGroupMethod(),
      implementation = ::createFeatureGroup
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getGetFeatureMethod(),
      implementation = ::getFeature
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getUpdateFeatureMethod(),
      implementation = ::updateFeature
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getDeleteFeatureMethod(),
      implementation = ::deleteFeature
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getAddFeatureMemberMethod(),
      implementation = ::addFeatureMember
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getListFeatureMembersMethod(),
      implementation = ::listFeatureMembers
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getUpdateFeatureMemberRoleMethod(),
      implementation = ::updateFeatureMemberRole
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getRemoveFeatureMemberMethod(),
      implementation = ::removeFeatureMember
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getCreateDocumentMethod(),
      implementation = ::createDocument
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getListDocumentsMethod(),
      implementation = ::listDocuments
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getListDocumentSectionsMethod(),
      implementation = ::listDocumentSections
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getGetDocumentSectionMethod(),
      implementation = ::getDocumentSection
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getCreateDocumentSectionMethod(),
      implementation = ::createDocumentSection
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getUpdateDocumentSectionMethod(),
      implementation = ::updateDocumentSection
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getUpdateDocumentSectionContentMethod(),
      implementation = ::updateDocumentSectionContent
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getCreateDocumentSectionVersionMethod(),
      implementation = ::createDocumentSectionVersion
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getUpsertDocumentAndSectionMethod(),
      implementation = ::upsertDocumentAndSection
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getListDocumentSectionVersionsMethod(),
      implementation = ::listDocumentSectionVersions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getGetCurrentDocumentSectionVersionMethod(),
      implementation = ::getCurrentDocumentSectionVersion
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getSetCurrentDocumentSectionVersionMethod(),
      implementation = ::setCurrentDocumentSectionVersion
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getListChatMessagesMethod(),
      implementation = ::listChatMessages
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getAppendChatMessageMethod(),
      implementation = ::appendChatMessage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getCreateSessionMethod(),
      implementation = ::createSession
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getUpdateSessionContextMethod(),
      implementation = ::updateSessionContext
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getGetSessionMethod(),
      implementation = ::getSession
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getListProjectSessionsMethod(),
      implementation = ::listProjectSessions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WorkspaceServiceGrpc.getPushUrdConfluenceMethod(),
      implementation = ::pushUrdConfluence
    )).build()
  }
}
