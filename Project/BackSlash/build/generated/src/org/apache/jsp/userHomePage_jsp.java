package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.hp.j2sh.project.entity.AllCommunities;
import java.util.List;

public final class userHomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            try {
                Integer user = (Integer)session.getAttribute("user_id");
                if (user.equals(null) || user == null) response.sendRedirect("Logout");
            }
            catch (Exception e) {
                response.sendRedirect("Logout");
            }
            Integer user = (Integer) session.getAttribute("user_id");
        
      out.write("\n");
      out.write("        <h3 style=\"text-align: right;\"><a href=\"Logout\">LogOut</a></h3>\n");
      out.write("        <h1>Login successful</h1>\n");
      out.write("        ");
      out.print( (String) session.getAttribute("RegisterMessage") );
      out.write("\n");
      out.write("        ");
      out.print( user );
      out.write("\n");
      out.write("        ");

            session.removeAttribute("RegisterMessage");
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            List<AllCommunities> communityListAll = (ArrayList<AllCommunities>) session.getAttribute("communityListAll");
            List<AllCommunities> communityListUser = (ArrayList<AllCommunities>) session.getAttribute("communityListUser");
            
            if (communityListAll == null) communityListAll = new ArrayList<AllCommunities>(0);
            if (communityListUser == null) communityListUser = new ArrayList<AllCommunities>(0);
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"Enter\" method=\"POST\">\n");
      out.write("            Enter community :\n");
      out.write("            <select name=\"community_Id\">\n");
      out.write("            ");

                for (AllCommunities ac : communityListUser) {
            
      out.write("\n");
      out.write("            <option value=\"");
      out.print( ac.getCommunityId());
      out.write('"');
      out.write('>');
      out.print( ac.getCommunityName() );
      out.write("</option>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <input type=\"submit\" value=\"Enter\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <form action=\"Join\" method=\"POST\">\n");
      out.write("            Join community :\n");
      out.write("            <select name=\"communityId\">\n");
      out.write("            ");

                for (AllCommunities ac : communityListAll) {
            
      out.write("\n");
      out.write("            <option value=\"");
      out.print( ac.getCommunityId());
      out.write('"');
      out.write('>');
      out.print( ac.getCommunityName() );
      out.write("</option>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <input type=\"submit\" value=\"Join\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <a href=\"createCommunityPage.jsp\">Create new community</a>\n");
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
