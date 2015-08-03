package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import com.hp.j2sh.entity.Voter;

public final class infoPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User Profile - Online Voting System</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");

            String msg = "";
            
            Voter _voter = (Voter) session.getAttribute("VoterObject");
            String name = _voter.getName();
            Short age = _voter.getAge();
            String gender = _voter.getGender();
            String dob = _voter.getDob();
            String email_id = _voter.getEmail_id();
            String password = _voter.getPassword();
            Short vote_status = _voter.getVote_status();
        
      out.write("\n");
      out.write("        <h2>Your Account Details are:</h2><br>\n");
      out.write("        <h3>Name : ");
      out.print( name );
      out.write("</h3>\n");
      out.write("        <h3>Age : ");
      out.print( age );
      out.write("</h3>\n");
      out.write("        <h3>Gender : ");
      out.print( gender );
      out.write("</h3>\n");
      out.write("        <h3>DOB : ");
      out.print( dob );
      out.write("</h3>\n");
      out.write("        <h3>Email-ID or Contact No. : ");
      out.print( email_id );
      out.write("</h3>\n");
      out.write("        <h3>\n");
      out.write("            Vote Status : ");
      out.print( vote_status );
      out.write(" &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            ");

                if (vote_status == 0) {
            
      out.write("\n");
      out.write("            <a href=\"GetVote\">Vote Now</a>\n");
      out.write("            ");

                } else {
                    try {
                        msg = (String)request.getAttribute("msg");
                    }
                    catch(Exception e) {
                        msg = "";
                    }
                    finally {
                    }
            
      out.write("\n");
      out.write("            ");
      out.print( msg );
      out.write("\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </h3>\n");
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
