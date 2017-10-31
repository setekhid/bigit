package xyz.func.setekhid.bigit.http.server

import java.text.MessageFormat
import javax.servlet.ServletException

import org.eclipse.jgit.http.server.HttpServerText


package object backend {

  def getParameters[A <: {def getInitParameter(name : String) : String}](servletInit: A): Params = new Params {
    override def get(name: String): String = servletInit.getInitParameter(name)
  }

  def createBackend(params: Params): Backend = {

    val backendName = params.get("backend-class")
    if (backendName == null || "".equals(backendName))
      throw new ServletException(MessageFormat.format(HttpServerText.get().parameterNotSet, "backend-class"))

    val backendClass = Class.forName(backendName)
    val backend = backendClass.getConstructor(classOf[Params]).newInstance(params).asInstanceOf[Backend]

    return backend
  }
}
