package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginHomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>BackSlash Community Network - HomePage</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("@font-face {\n");
      out.write("\tfont-family: 'Backslash Font';\n");
      out.write("\tsrc: url('fonts/Backslash.ttf') format('truetype');\n");
      out.write("}\n");
      out.write("#form1 #username {\n");
      out.write("\twidth: 250px;\n");
      out.write("\theight: 30px;\n");
      out.write("\tborder-style: double;\n");
      out.write("\tborder-radius: 10px 10px 0px 0px;\n");
      out.write("}\n");
      out.write("#password {\n");
      out.write("\twidth: 250px;\n");
      out.write("\tborder-bottom-left-radius: 10px;\n");
      out.write("\tborder-bottom-right-radius: 10px;\n");
      out.write("\theight: 30px;\n");
      out.write("}\n");
      out.write("#submit {\n");
      out.write("\twidth: 100px;\n");
      out.write("\theight: 50px;\n");
      out.write("\tborder-radius: 30px;\n");
      out.write("}td p a {\n");
      out.write("\tmargin-left: 10px;\n");
      out.write("\tcolor: #00D18C;\n");
      out.write("\tfont-family: \"Gill Sans\", \"Gill Sans MT\", \"Myriad Pro\", \"DejaVu Sans Condensed\", Helvetica, Arial, sans-serif;\n");
      out.write("}\n");
      out.write("a {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("td p em {\n");
      out.write("\tmargin-top: -15px;\n");
      out.write("\tmargin-bottom: -15px;\n");
      out.write("}\n");
      out.write(".header {\n");
      out.write("\tbackground-image: -webkit-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(3,51,4,1.00) 67.88%);\n");
      out.write("\tbackground-image: -moz-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(3,51,4,1.00) 67.88%);\n");
      out.write("\tbackground-image: -o-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(3,51,4,1.00) 67.88%);\n");
      out.write("\tbackground-image: linear-gradient(180deg,rgba(255,255,255,1.00) 0%,rgba(3,51,4,1.00) 67.88%);\n");
      out.write("\tborder-radius: 30px;\n");
      out.write("\tfont-family: Consolas, 'Andale Mono', 'Lucida Console', 'Lucida Sans Typewriter', Monaco, 'Courier New', monospace; font-size: 24px;\n");
      out.write("\tbackground-color: #033304; \n");
      out.write("\tcolor: #E9E9E9; \n");
      out.write("\tbackground-image: -webkit-repeating-linear-gradient(90deg,rgba(16,73,0,1.00) 0%,rgba(19,119,0,1.00) 22.80%,rgba(40,154,6,1.00) 44.56%,rgba(32,166,6,1.00) 54.40%,rgba(14,126,5,1.00) 66.32%,rgba(37,86,2,1.00) 82.90%,rgba(7,70,0,1.00) 100%); \n");
      out.write("\tbackground-image: -moz-repeating-linear-gradient(90deg,rgba(16,73,0,1.00) 0%,rgba(19,119,0,1.00) 22.80%,rgba(40,154,6,1.00) 44.56%,rgba(32,166,6,1.00) 54.40%,rgba(14,126,5,1.00) 66.32%,rgba(37,86,2,1.00) 82.90%,rgba(7,70,0,1.00) 100%); \n");
      out.write("\tbackground-image: -o-repeating-linear-gradient(90deg,rgba(16,73,0,1.00) 0%,rgba(19,119,0,1.00) 22.80%,rgba(40,154,6,1.00) 44.56%,rgba(32,166,6,1.00) 54.40%,rgba(14,126,5,1.00) 66.32%,rgba(37,86,2,1.00) 82.90%,rgba(7,70,0,1.00) 100%); \n");
      out.write("\tbackground-image: repeating-linear-gradient(0deg,rgba(16,73,0,1.00) 0%,rgba(19,119,0,1.00) 22.80%,rgba(40,154,6,1.00) 44.56%,rgba(32,166,6,1.00) 54.40%,rgba(14,126,5,1.00) 66.32%,rgba(37,86,2,1.00) 82.90%,rgba(7,70,0,1.00) 100%);\n");
      out.write("}\n");
      out.write(".main-left {\n");
      out.write("\tbackground-color: #164100;\n");
      out.write("\tborder-radius: 30px;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("\tbackground-color: #0C4100;\n");
      out.write("\tcolor: #C1C9FF;\n");
      out.write("\tfont-family: Cambria, \"Hoefler Text\", \"Liberation Serif\", Times, \"Times New Roman\", serif;\n");
      out.write("\tfont-size: large;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<table width=\"100%\" border=\"0\" align=\"center\" height=\"100%\">\n");
      out.write("  <tbody>\n");
      out.write("    <tr>\n");
      out.write("      <td class=\"header\" height=\"50\"><p align=\"center\"><em>A virtual community for each of your real-life communities...</em></p>\n");
      out.write("      <p align=\"center\"><em>where you connect to everyone!</em></p></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"369\"><table width=\"100%\" border=\"0\" height=\"100%\">\n");
      out.write("        <tbody>\n");
      out.write("          <tr>\n");
      out.write("            <td class=\"main-left\" width=\"71%\" height=\"100%\"><img src=\"images/102877-3d-glossy-green-orb-icon-alphanumeric-back-slash.png\" width=\"187\" height=\"194\" alt=\"\"/><img src=\"images/Backslash_transparent-3.png\" width=\"500\" height=\"150\" alt=\"\"/></td>\n");
      out.write("            <td width=\"29%\" height=\"100%\"><form action=\"Login\" id=\"form1\" name=\"form1\" method=\"post\">\n");
      out.write("              <p>\n");
      out.write("                <label for=\"username\"></label>\n");
      out.write("                </p>\n");
      out.write("              <p>\n");
      out.write("                <input type=\"text\" name=\"username\" id=\"username\" placeholder=\" Username\">\n");
      out.write("              </p>\n");
      out.write("            \n");
      out.write("              <p>\n");
      out.write("                <label for=\"password\"></label>\n");
      out.write("                <input type=\"password\" name=\"password\" id=\"password\" placeholder=\" Password\">\n");
      out.write("              </p>\n");
      out.write("              <p>\n");
      out.write("                <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Sign In\">\n");
      out.write("                \n");
      out.write("               &nbsp;&nbsp;&nbsp;&nbsp;<a href=\"pages/ForgotPassword.html\" title=\"Forgot Password?\" target=\"_blank\">Forgot Password?</a></p> </form>\n");
      out.write("              <p>&nbsp;</p>\n");
      out.write("              <form id=\"form2\" name=\"form2\" method=\"post\">\n");
      out.write("                <p>Log In using...</p>\n");
      out.write("                <p><a href=\"http://www.facebook.com\">Facebook</a>   <a href=\"http://plus.google.com\">Google+</a> <a href=\"http://www.github.com\">GitHub</a></p>\n");
      out.write("              </form>\n");
      out.write("              <p>&nbsp;</p>\n");
      out.write("              <p>New User? <a href=\"signUpPage.jsp\" title=\"Sign Up\" target=\"_parent\">Sign Up</a></p></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td height=\"100%\">&nbsp;</td>\n");
      out.write("            <td height=\"100%\">&nbsp;</td>\n");
      out.write("          </tr>\n");
      out.write("        </tbody>\n");
      out.write("      </table></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td><p>&copy; Abhishek Chakraborty, 2015</p>\n");
      out.write("      <p>All rights reserved.</p></td>\n");
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
