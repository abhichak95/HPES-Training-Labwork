package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("        <div style=\"background-image: -webkit-linear-gradient(270deg,rgba(250,255,77,1.00) 0%,rgba(251,255,158,1.00) 26.42%,rgba(253,255,210,1.00) 47.67%,rgba(248,255,133,1.00) 73.58%,rgba(245,255,93,1.00) 100%); background-image: -moz-linear-gradient(270deg,rgba(250,255,77,1.00) 0%,rgba(251,255,158,1.00) 26.42%,rgba(253,255,210,1.00) 47.67%,rgba(248,255,133,1.00) 73.58%,rgba(245,255,93,1.00) 100%); background-image: -o-linear-gradient(270deg,rgba(250,255,77,1.00) 0%,rgba(251,255,158,1.00) 26.42%,rgba(253,255,210,1.00) 47.67%,rgba(248,255,133,1.00) 73.58%,rgba(245,255,93,1.00) 100%); background-image: linear-gradient(180deg,rgba(250,255,77,1.00) 0%,rgba(251,255,158,1.00) 26.42%,rgba(253,255,210,1.00) 47.67%,rgba(248,255,133,1.00) 73.58%,rgba(245,255,93,1.00) 100%);\">\n");
      out.write("\n");
      out.write("\t<h1 align=\"center\" style=\"font-family:Segoe, 'Segoe UI', 'DejaVu Sans', 'Trebuchet MS', Verdana, sans-serif;\">\n");
      out.write("    \tHP Education Summer Training, Noida\n");
      out.write("        </h1>\n");
      out.write("        <h2 align=\"center\" style=\"font-family:Segoe, 'Segoe UI', 'DejaVu Sans', 'Trebuchet MS', Verdana, sans-serif;\">\n");
      out.write("    \tJ2EE - Struts with Hibernate Framework\n");
      out.write("        </h2>\n");
      out.write("        <br><br><br>\n");
      out.write("        ");

            String userName = "Welcome, ";
            try {
                userName += session.getAttribute("userName").toString();
            }
            catch(NullPointerException e) {
                userName = "";
            }
        
      out.write("\n");
      out.write("        <h3> ");
      out.print( userName);
      out.write(" </h3>\n");
      out.write("        </div>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
