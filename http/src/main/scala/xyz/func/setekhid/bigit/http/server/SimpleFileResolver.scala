package xyz.func.setekhid.bigit.http.server

import java.io.File
import java.text.MessageFormat
import javax.servlet.ServletException
import javax.servlet.http.HttpServletRequest

import org.eclipse.jgit.http.server.HttpServerText
import org.eclipse.jgit.transport.resolver.FileResolver


class SimpleFileResolver(params: ResolverParameters) extends FileResolver[HttpServletRequest](SimpleFileResolver.getFile(params), true) {

}

object SimpleFileResolver {

  def getFile(params: ResolverParameters): File = {

    val fileName = params.get("base-path")
    if (fileName == null || "".equals(fileName))
      throw new ServletException(MessageFormat.format(HttpServerText.get().parameterNotSet, "base-path"))

    val file = new File(fileName)
    if (!file.exists())
      throw new ServletException(MessageFormat.format(HttpServerText.get().pathForParamNotFound, file, "base-path"))

    return file
  }
}
