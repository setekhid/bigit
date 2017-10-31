package xyz.func.setekhid.bigit.http.server.backend


trait RepoManager {

  def create(name: String)

  def delete(name: String)

  def list(prefix: String): Seq[String]
}
