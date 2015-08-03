package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      com.hp.stp.j2sh.mysql.MySQLConnection mysql = null;
      synchronized (_jspx_page_context) {
        mysql = (com.hp.stp.j2sh.mysql.MySQLConnection) _jspx_page_context.getAttribute("mysql", PageContext.PAGE_SCOPE);
        if (mysql == null){
          mysql = new com.hp.stp.j2sh.mysql.MySQLConnection();
          _jspx_page_context.setAttribute("mysql", mysql, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Page</title>\n");
      out.write("        <style type='text/css'>\n");
      out.write("            table { border-collapse: collapse; }\n");
      out.write("            table, th, td { border: 2px dashed black; text-align: center; width: 1000px; height: 30px; }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");

            String UpdationMsg = (String)request.getAttribute("UpdationMsg");
            if (UpdationMsg != null)
                out.println("<h3>" + UpdationMsg + "</h3>");
            String logoutPage = (String) application.getInitParameter("logout");
        
      out.write("\n");
      out.write("        <div style=\"text-align: right;\"><a href=\"");
      out.print( logoutPage );
      out.write("\"><h3>Log Out</h3></a></div>\n");
      out.write("        <h3>Details of all users are:</h3><br><br>\n");
      out.write("        ");

            String driver = application.getInitParameter("driver");
            String url = application.getInitParameter("url");
            String dbuser = application.getInitParameter("dbUser");
            String dbpass = application.getInitParameter("dbPass");
            Connection con = mysql.getMySQLConnection(driver, url, dbuser, dbpass);
            PreparedStatement ps = con.prepareStatement("select * from user;");
            ResultSet rs = ps.executeQuery();
        
      out.write("\n");
      out.write("        <form action='DBUpdate' method='POST'>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"background-color: #e3e3e3\"></td>\n");
      out.write("                    <td style=\"background-color: #99ffff\"><h2>User ID</h2></td>\n");
      out.write("                    <td style=\"background-color: #9999ff\"><h2>User Name</h2></td>\n");
      out.write("                    <td style=\"background-color: #ff9999\"><h2>Password</h2></td>\n");
      out.write("                    <td style=\"background-color: #ccff99\"><h2>Status</h2></td>\n");
      out.write("                    <td style=\"background-color: #cccccc\"><h2>User Type</h2></td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 while(rs.next()) {
                    int userid = rs.getInt(1);
                    String user = rs.getString(2);
                    String pass = rs.getString(3);
                    int status = rs.getInt(4);
                    String type = rs.getString(5);
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type='radio' name='entryID' value=\"");
      out.print( userid );
      out.write("\"></td>\n");
      out.write("                    <td>");
      out.print( userid );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( user );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( pass );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( status );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( type );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </table><br><br>\n");
      out.write("            <h3>Database Update Options:</h3>\n");
      out.write("            <input type='radio' name='option' value='insert'> Insert Entry\n");
      out.write("            &nbsp;&nbsp;<input type='radio' name='option' value='delete'> Delete Entry\n");
      out.write("            &nbsp;&nbsp;<input type='radio' name='option' value='update'> Update Entry\n");
      out.write("            <br><br><input type='submit' value='Submit'>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
