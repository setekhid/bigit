package xyz.func.setekhid.bigit.http.server

import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}


class PingServlet extends HttpServlet {

  override def doGet(req: HttpServletRequest, resp: HttpServletResponse): Unit = {

    val out = resp.getWriter
    out.println("pong!")
    out.close()
  }
}