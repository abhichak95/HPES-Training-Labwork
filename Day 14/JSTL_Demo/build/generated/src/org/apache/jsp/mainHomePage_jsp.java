package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainHomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>User DB HomePage</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<table width=\"100%\" border=\"0\" height=\"100%\" style=\"border-collapse:collapse;\">\n");
      out.write("  <tbody>\n");
      out.write("    <tr>\n");
      out.write("      <td style=\"background-color: #C4C4C4\">\n");
      out.write("      \t<h2 style=\"text-align: center; text-decoration: underline; font-weight:bold; font-size: 36px; text-transform: uppercase;\">User DB Project</h2>\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td style=\"background-image: -webkit-linear-gradient(270deg,rgba(187,180,180,1.00) 0%,rgba(221,221,221,1.00) 49.22%,rgba(177,175,175,1.00) 99.48%); background-image: -moz-linear-gradient(270deg,rgba(187,180,180,1.00) 0%,rgba(221,221,221,1.00) 49.22%,rgba(177,175,175,1.00) 99.48%); background-image: -o-linear-gradient(270deg,rgba(187,180,180,1.00) 0%,rgba(221,221,221,1.00) 49.22%,rgba(177,175,175,1.00) 99.48%); background-image: linear-gradient(180deg,rgba(187,180,180,1.00) 0%,rgba(221,221,221,1.00) 49.22%,rgba(177,175,175,1.00) 99.48%);\">\n");
      out.write("      \t<div align=\"center\" style=\"margin-top:100px; margin-bottom:100px; font-size:20px;\">\n");
      out.write("        \t<form action=\"index.jsp\" method=\"POST\">\n");
      out.write("                ");

                    String msgUser = (String) request.getAttribute("msgUser");
                    String msgPass = (String) request.getAttribute("msgPass");
                    if (msgUser != null) out.println(msgUser);
                
      out.write("\n");
      out.write("                <br><label>Username: </label><input type=\"text\" name=\"username\" autofocus=\"true\"><br><br>\n");
      out.write("                ");

                    if (msgPass != null) out.println(msgPass);
                
      out.write("\n");
      out.write("                <br><label>Password: </label><input type=\"password\" name=\"password\"><br><br>\n");
      out.write("                <input type=\"submit\" value=\"Sign In\">\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input type=\"reset\" value=\"Clear\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td style=\"background-color:#CDCDCD\">&copy; Abhishek Chakraborty, 2015</td>\n");
      out.write("    </tr>\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
