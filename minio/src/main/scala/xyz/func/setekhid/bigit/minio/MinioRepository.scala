package xyz.func.setekhid.bigit.minio

import org.eclipse.jgit.internal.storage.dfs.DfsRepository


class MinioRepository(builder: MinioRepositoryBuilder) extends DfsRepository(builder) {

  override def getObjectDatabase: MinioObjDatabase = ???

  override def getRefDatabase: MinioRefDatabase = ???
}
