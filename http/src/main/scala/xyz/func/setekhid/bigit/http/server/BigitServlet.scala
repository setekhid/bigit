package xyz.func.setekhid.bigit.http.server

import java.text.MessageFormat
import java.util
import javax.servlet.http.HttpServletRequest
import javax.servlet.{ServletConfig, ServletException}

import org.eclipse.jgit.http.server.{GitServlet, HttpServerText}
import org.eclipse.jgit.transport.resolver.RepositoryResolver

import scala.collection.JavaConversions


class BigitServlet extends GitServlet {

  override def init(config: ServletConfig): Unit = {

    val resolverName = config.getInitParameter("resolver-class")
    if (resolverName == null || "".equals(resolverName))
      throw new ServletException(MessageFormat.format(HttpServerText.get().parameterNotSet, "resolver-class"))

    val resolverClass = Class.forName(resolverName)
    val params = convertParameters(config)
    val resolver = resolverClass.getConstructor(classOf[ResolverParameters]).newInstance(params).asInstanceOf[RepositoryResolver[HttpServletRequest]]

    setRepositoryResolver(resolver)
    setUploadPackFactory(new SimpleUploadPackFactory)
    setReceivePackFactory(new SimpleReceivePackFactory)

    super.init(config)
  }

  def convertParameters(conf: ServletConfig): ResolverParameters = new ResolverParameters {

    override def names(): Seq[String] = {
      val jList = util.Collections.list(conf.getInitParameterNames().asInstanceOf[util.Enumeration[String]])
      JavaConversions.asScalaBuffer[String](jList)
    }

    override def get(name: String): String = conf.getInitParameter(name)
  }
}
