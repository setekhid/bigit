package xyz.func.setekhid.bigit.http.server

import javax.servlet.http.HttpServletRequest

import org.eclipse.jgit.lib.Repository
import org.eclipse.jgit.transport.ReceivePack
import org.eclipse.jgit.transport.resolver.ReceivePackFactory


class SimpleReceivePackFactory extends ReceivePackFactory[HttpServletRequest] {

  override def create(req: HttpServletRequest, db: Repository): ReceivePack = new ReceivePack(db)
}
