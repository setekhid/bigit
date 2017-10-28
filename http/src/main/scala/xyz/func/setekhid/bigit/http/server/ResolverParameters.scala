package xyz.func.setekhid.bigit.http.server


trait ResolverParameters {

  def get(name: String): String

  def names(): Seq[String]
}
