package xyz.func.setekhid.bigit.minio

import java.util

import org.eclipse.jgit.internal.storage.dfs._
import org.eclipse.jgit.internal.storage.pack.PackExt


class MinioObjDatabase(repo: DfsRepository, opt: DfsReaderOptions) extends DfsObjDatabase(repo, opt) {

  override def newPack(source: DfsObjDatabase.PackSource): DfsPackDescription = ???

  override def commitPackImpl(desc: util.Collection[DfsPackDescription], replaces: util.Collection[DfsPackDescription]): Unit = ???

  override def rollbackPack(desc: util.Collection[DfsPackDescription]): Unit = ???

  override def listPacks(): util.List[DfsPackDescription] = ???

  override def openFile(desc: DfsPackDescription, ext: PackExt): ReadableChannel = ???

  override def writeFile(desc: DfsPackDescription, ext: PackExt): DfsOutputStream = ???
}
