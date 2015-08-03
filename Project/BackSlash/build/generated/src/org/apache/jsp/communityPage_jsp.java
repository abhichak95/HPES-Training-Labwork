package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hp.j2sh.project.other.Post;
import java.util.List;
import com.hp.j2sh.project.entity.AllUsers;
import com.hp.j2sh.project.other.CommunityPageData;

public final class communityPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        
      out.write("\n");
      out.write("        <h3 style=\"text-align: right;\"><a href=\"Logout\">LogOut</a></h3>\n");
      out.write("        <h1>Community Page</h1>\n");
      out.write("        ");

            CommunityPageData data = (CommunityPageData) session.getAttribute("communityPageDataObject");
            if (data == null) request.getRequestDispatcher("Logout").forward(request, response);
        
      out.write("\n");
      out.write("        <h2>Users: </h2>\n");
      out.write("        ");

            List<AllUsers> userList = data.getAllUsersList();
            for (AllUsers e : userList) {
        
      out.write("\n");
      out.write("        <h4>");
      out.print( e.getUsername() );
      out.write("</h4>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        <br><br><br>\n");
      out.write("        <h2>Post: </h2>\n");
      out.write("        ");

            List<Post> postList = data.getPostList();
            for (Post e : postList) {
        
      out.write("\n");
      out.write("        <h4>Content : ");
      out.print( e.getContent());
      out.write(" ::: Posted by ");
      out.print( e.getUserId() );
      out.write(" ::: Posted on : ");
      out.print( e.getDateTime() );
      out.write(" </h4>\n");
      out.write("        ");

            }
        
      out.write("\n");
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
