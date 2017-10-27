package xyz.func.setekhid.bigit.minio

import org.eclipse.jgit.internal.storage.dfs.{DfsRefDatabase, DfsRepository}
import org.eclipse.jgit.lib.Ref


class MinioRefDatabase(repo: DfsRepository) extends DfsRefDatabase(repo) {

  override def scanAllRefs(): DfsRefDatabase.RefCache = ???

  override def compareAndPut(oldRef: Ref, newRef: Ref): Boolean = ???

  override def compareAndRemove(oldRef: Ref): Boolean = ???
}
