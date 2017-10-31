package xyz.func.setekhid.bigit.http.server.backend

import javax.servlet.http.HttpServletRequest

import org.eclipse.jgit.transport.resolver.RepositoryResolver


class FileBackend(params: Params) extends Backend {

  lazy val resolver = new SimpleFileResolver(params)
  lazy val manager = new FileRepoManager(params)

  override def getResolver(): RepositoryResolver[HttpServletRequest] = resolver

  override def getManager(): RepoManager = manager
}
