package xyz.func.setekhid.bigit.http.server

import javax.servlet.ServletConfig
import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}

import xyz.func.setekhid.bigit.http.server.backend.{Backend, RepoManager}


class ManagerServlet extends HttpServlet {

  var manager: RepoManager = null

  override def init(config: ServletConfig): Unit = {

    val backend = createBackend
    manager = backend.getManager

    super.init(config)
  }

  def createBackend(): Backend = backend.createBackend(backend.getParameters(getServletContext))

  override def doPost(req: HttpServletRequest, resp: HttpServletResponse): Unit = {

    val repoName = req.getPathInfo
    manager.create(repoName)
  }

  override def doGet(req: HttpServletRequest, resp: HttpServletResponse): Unit = {

    val repoPrefix = req.getPathInfo
    manager.list(repoPrefix)
  }

  override def doDelete(req: HttpServletRequest, resp: HttpServletResponse): Unit = {

    val repoName = req.getPathInfo
    manager.delete(repoName)
  }
}
