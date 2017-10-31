package xyz.func.setekhid.bigit.http.server.backend

import javax.servlet.http.HttpServletRequest

import org.eclipse.jgit.transport.resolver.RepositoryResolver


trait Backend {

  def getResolver(): RepositoryResolver[HttpServletRequest]

  def getManager(): RepoManager
}
