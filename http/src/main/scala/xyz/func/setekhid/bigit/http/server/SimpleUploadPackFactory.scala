package xyz.func.setekhid.bigit.http.server

import javax.servlet.http.HttpServletRequest

import org.eclipse.jgit.lib.Repository
import org.eclipse.jgit.transport.UploadPack
import org.eclipse.jgit.transport.resolver.UploadPackFactory


class SimpleUploadPackFactory extends UploadPackFactory[HttpServletRequest] {

  override def create(req: HttpServletRequest, db: Repository): UploadPack = new UploadPack(db)
}
