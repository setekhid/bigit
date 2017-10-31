package xyz.func.setekhid.bigit.http.server

import javax.servlet.ServletConfig

import org.eclipse.jgit.http.server.GitServlet
import xyz.func.setekhid.bigit.http.server.backend.Backend


class BigitServlet extends GitServlet {

  override def init(config: ServletConfig): Unit = {

    val backend = createBackend

    setRepositoryResolver(backend.getResolver)
    setUploadPackFactory(new SimpleUploadPackFactory)
    setReceivePackFactory(new SimpleReceivePackFactory)

    super.init(config)
  }

  def createBackend(): Backend = backend.createBackend(backend.getParameters(getServletContext))
}
