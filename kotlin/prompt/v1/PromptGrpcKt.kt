package prompt.v1

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
import prompt.v1.PromptServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for prompt.v1.PromptService.
 */
public object PromptServiceGrpcKt {
  public const val SERVICE_NAME: String = PromptServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createTemplateMethod:
      MethodDescriptor<Prompt.CreateTemplateRequest, Prompt.CreateTemplateResponse>
    @JvmStatic
    get() = PromptServiceGrpc.getCreateTemplateMethod()

  public val getTemplateMethod:
      MethodDescriptor<Prompt.GetTemplateRequest, Prompt.GetTemplateResponse>
    @JvmStatic
    get() = PromptServiceGrpc.getGetTemplateMethod()

  public val listTemplatesMethod:
      MethodDescriptor<Prompt.ListTemplatesRequest, Prompt.ListTemplatesResponse>
    @JvmStatic
    get() = PromptServiceGrpc.getListTemplatesMethod()

  public val updateTemplateMethod:
      MethodDescriptor<Prompt.UpdateTemplateRequest, Prompt.UpdateTemplateResponse>
    @JvmStatic
    get() = PromptServiceGrpc.getUpdateTemplateMethod()

  public val deleteTemplateMethod:
      MethodDescriptor<Prompt.DeleteTemplateRequest, Prompt.ResponseEmpty>
    @JvmStatic
    get() = PromptServiceGrpc.getDeleteTemplateMethod()

  public val renderTemplateMethod:
      MethodDescriptor<Prompt.RenderTemplateRequest, Prompt.RenderTemplateResponse>
    @JvmStatic
    get() = PromptServiceGrpc.getRenderTemplateMethod()

  public val createExperimentMethod:
      MethodDescriptor<Prompt.CreateExperimentRequest, Prompt.CreateExperimentResponse>
    @JvmStatic
    get() = PromptServiceGrpc.getCreateExperimentMethod()

  public val getExperimentMethod:
      MethodDescriptor<Prompt.GetExperimentRequest, Prompt.GetExperimentResponse>
    @JvmStatic
    get() = PromptServiceGrpc.getGetExperimentMethod()

  public val completeExperimentMethod:
      MethodDescriptor<Prompt.CompleteExperimentRequest, Prompt.CompleteExperimentResponse>
    @JvmStatic
    get() = PromptServiceGrpc.getCompleteExperimentMethod()

  /**
   * A stub for issuing RPCs to a(n) prompt.v1.PromptService service as suspending coroutines.
   */
  @StubFor(PromptServiceGrpc::class)
  public class PromptServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<PromptServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): PromptServiceCoroutineStub =
        PromptServiceCoroutineStub(channel, callOptions)

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
    public suspend fun createTemplate(request: Prompt.CreateTemplateRequest, headers: Metadata =
        Metadata()): Prompt.CreateTemplateResponse = unaryRpc(
      channel,
      PromptServiceGrpc.getCreateTemplateMethod(),
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
    public suspend fun getTemplate(request: Prompt.GetTemplateRequest, headers: Metadata =
        Metadata()): Prompt.GetTemplateResponse = unaryRpc(
      channel,
      PromptServiceGrpc.getGetTemplateMethod(),
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
    public suspend fun listTemplates(request: Prompt.ListTemplatesRequest, headers: Metadata =
        Metadata()): Prompt.ListTemplatesResponse = unaryRpc(
      channel,
      PromptServiceGrpc.getListTemplatesMethod(),
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
    public suspend fun updateTemplate(request: Prompt.UpdateTemplateRequest, headers: Metadata =
        Metadata()): Prompt.UpdateTemplateResponse = unaryRpc(
      channel,
      PromptServiceGrpc.getUpdateTemplateMethod(),
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
    public suspend fun deleteTemplate(request: Prompt.DeleteTemplateRequest, headers: Metadata =
        Metadata()): Prompt.ResponseEmpty = unaryRpc(
      channel,
      PromptServiceGrpc.getDeleteTemplateMethod(),
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
    public suspend fun renderTemplate(request: Prompt.RenderTemplateRequest, headers: Metadata =
        Metadata()): Prompt.RenderTemplateResponse = unaryRpc(
      channel,
      PromptServiceGrpc.getRenderTemplateMethod(),
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
    public suspend fun createExperiment(request: Prompt.CreateExperimentRequest, headers: Metadata =
        Metadata()): Prompt.CreateExperimentResponse = unaryRpc(
      channel,
      PromptServiceGrpc.getCreateExperimentMethod(),
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
    public suspend fun getExperiment(request: Prompt.GetExperimentRequest, headers: Metadata =
        Metadata()): Prompt.GetExperimentResponse = unaryRpc(
      channel,
      PromptServiceGrpc.getGetExperimentMethod(),
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
    public suspend fun completeExperiment(request: Prompt.CompleteExperimentRequest,
        headers: Metadata = Metadata()): Prompt.CompleteExperimentResponse = unaryRpc(
      channel,
      PromptServiceGrpc.getCompleteExperimentMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the prompt.v1.PromptService service based on Kotlin coroutines.
   */
  public abstract class PromptServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for prompt.v1.PromptService.CreateTemplate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createTemplate(request: Prompt.CreateTemplateRequest):
        Prompt.CreateTemplateResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method prompt.v1.PromptService.CreateTemplate is unimplemented"))

    /**
     * Returns the response to an RPC for prompt.v1.PromptService.GetTemplate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getTemplate(request: Prompt.GetTemplateRequest):
        Prompt.GetTemplateResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method prompt.v1.PromptService.GetTemplate is unimplemented"))

    /**
     * Returns the response to an RPC for prompt.v1.PromptService.ListTemplates.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listTemplates(request: Prompt.ListTemplatesRequest):
        Prompt.ListTemplatesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method prompt.v1.PromptService.ListTemplates is unimplemented"))

    /**
     * Returns the response to an RPC for prompt.v1.PromptService.UpdateTemplate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateTemplate(request: Prompt.UpdateTemplateRequest):
        Prompt.UpdateTemplateResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method prompt.v1.PromptService.UpdateTemplate is unimplemented"))

    /**
     * Returns the response to an RPC for prompt.v1.PromptService.DeleteTemplate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteTemplate(request: Prompt.DeleteTemplateRequest):
        Prompt.ResponseEmpty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method prompt.v1.PromptService.DeleteTemplate is unimplemented"))

    /**
     * Returns the response to an RPC for prompt.v1.PromptService.RenderTemplate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun renderTemplate(request: Prompt.RenderTemplateRequest):
        Prompt.RenderTemplateResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method prompt.v1.PromptService.RenderTemplate is unimplemented"))

    /**
     * Returns the response to an RPC for prompt.v1.PromptService.CreateExperiment.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createExperiment(request: Prompt.CreateExperimentRequest):
        Prompt.CreateExperimentResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method prompt.v1.PromptService.CreateExperiment is unimplemented"))

    /**
     * Returns the response to an RPC for prompt.v1.PromptService.GetExperiment.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getExperiment(request: Prompt.GetExperimentRequest):
        Prompt.GetExperimentResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method prompt.v1.PromptService.GetExperiment is unimplemented"))

    /**
     * Returns the response to an RPC for prompt.v1.PromptService.CompleteExperiment.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun completeExperiment(request: Prompt.CompleteExperimentRequest):
        Prompt.CompleteExperimentResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method prompt.v1.PromptService.CompleteExperiment is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PromptServiceGrpc.getCreateTemplateMethod(),
      implementation = ::createTemplate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PromptServiceGrpc.getGetTemplateMethod(),
      implementation = ::getTemplate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PromptServiceGrpc.getListTemplatesMethod(),
      implementation = ::listTemplates
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PromptServiceGrpc.getUpdateTemplateMethod(),
      implementation = ::updateTemplate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PromptServiceGrpc.getDeleteTemplateMethod(),
      implementation = ::deleteTemplate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PromptServiceGrpc.getRenderTemplateMethod(),
      implementation = ::renderTemplate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PromptServiceGrpc.getCreateExperimentMethod(),
      implementation = ::createExperiment
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PromptServiceGrpc.getGetExperimentMethod(),
      implementation = ::getExperiment
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PromptServiceGrpc.getCompleteExperimentMethod(),
      implementation = ::completeExperiment
    )).build()
  }
}
