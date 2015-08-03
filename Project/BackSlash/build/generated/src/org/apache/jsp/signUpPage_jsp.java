package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signUpPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Sign Up - Backslash Community Network</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("@font-face {\n");
      out.write("\tfont-family: 'Backslash Font';\n");
      out.write("\tsrc: url('fonts/Backslash.ttf') format('truetype');\n");
      out.write("}\n");
      out.write("header {\n");
      out.write("\tposition: fixed;\n");
      out.write("\tmargin-top: -100px;\n");
      out.write("\tbackground-image: -webkit-linear-gradient(270deg,rgba(16,73,0,1.00) 0%,rgba(19,119,0,1.00) 16.06%,rgba(40,154,6,1.00) 33.68%,rgba(32,166,6,1.00) 51.81%,rgba(40,154,6,1.00) 69.95%,rgba(19,119,0,1.00) 84.97%,rgba(16,73,0,1.00) 100%);\n");
      out.write("\tbackground-image: -moz-linear-gradient(270deg,rgba(16,73,0,1.00) 0%,rgba(19,119,0,1.00) 16.06%,rgba(40,154,6,1.00) 33.68%,rgba(32,166,6,1.00) 51.81%,rgba(40,154,6,1.00) 69.95%,rgba(19,119,0,1.00) 84.97%,rgba(16,73,0,1.00) 100%);\n");
      out.write("\tbackground-image: -o-linear-gradient(270deg,rgba(16,73,0,1.00) 0%,rgba(19,119,0,1.00) 16.06%,rgba(40,154,6,1.00) 33.68%,rgba(32,166,6,1.00) 51.81%,rgba(40,154,6,1.00) 69.95%,rgba(19,119,0,1.00) 84.97%,rgba(16,73,0,1.00) 100%);\n");
      out.write("\tbackground-image: linear-gradient(180deg,rgba(16,73,0,1.00) 0%,rgba(19,119,0,1.00) 16.06%,rgba(40,154,6,1.00) 33.68%,rgba(32,166,6,1.00) 51.81%,rgba(40,154,6,1.00) 69.95%,rgba(19,119,0,1.00) 84.97%,rgba(16,73,0,1.00) 100%);\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 60px;\n");
      out.write("\tborder-radius: 30px;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("\tbackground-color: #0C4100;\n");
      out.write("}\n");
      out.write("main {\n");
      out.write("\tmargin-top: 100px;\n");
      out.write("}\n");
      out.write("article {\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("\tmargin-top: 10px;\n");
      out.write("\tpadding-bottom: 10px;\n");
      out.write("}\n");
      out.write(".user_pass {\n");
      out.write("\ttext-align: center;\n");
      out.write("\tbackground-image: -webkit-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(203,203,203,1.00) 100%);\n");
      out.write("\tbackground-image: -moz-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(203,203,203,1.00) 100%);\n");
      out.write("\tbackground-image: -o-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(203,203,203,1.00) 100%);\n");
      out.write("\tbackground-image: linear-gradient(180deg,rgba(255,255,255,1.00) 0%,rgba(203,203,203,1.00) 100%);\n");
      out.write("\tborder-radius: 40px;\n");
      out.write("\tbackground-size: auto 100px;\n");
      out.write("}\n");
      out.write(".personal {\n");
      out.write("\ttext-align: right;\n");
      out.write("\tbackground-image: -webkit-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(163,160,160,1.00) 100%);\n");
      out.write("\tbackground-image: -moz-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(163,160,160,1.00) 100%);\n");
      out.write("\tbackground-image: -o-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(163,160,160,1.00) 100%);\n");
      out.write("\tbackground-image: linear-gradient(180deg,rgba(255,255,255,1.00) 0%,rgba(163,160,160,1.00) 100%);\n");
      out.write("\tborder-radius: 100px;\n");
      out.write("}\n");
      out.write(".personal_t {\n");
      out.write("\ttext-align: right;\n");
      out.write("}\n");
      out.write(".personal_t {\n");
      out.write("\tmargin-left: 110px;\n");
      out.write("}\n");
      out.write("#personal_input {\n");
      out.write("\twidth: 300px;\n");
      out.write("\tmargin-right: 20px;\n");
      out.write("}\n");
      out.write("#educational_input {\n");
      out.write("\twidth: 300px;\n");
      out.write("\tmargin-left: 20px;\n");
      out.write("}\n");
      out.write(".educational_t {\n");
      out.write("\tmargin-left: 50px;\n");
      out.write("}\n");
      out.write(".educational {\n");
      out.write("\ttext-align: right;\n");
      out.write("\tbackground-image: -webkit-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(164,162,162,1.00) 100%);\n");
      out.write("\tbackground-image: -moz-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(164,162,162,1.00) 100%);\n");
      out.write("\tbackground-image: -o-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(164,162,162,1.00) 100%);\n");
      out.write("\tbackground-image: linear-gradient(180deg,rgba(255,255,255,1.00) 0%,rgba(164,162,162,1.00) 100%);\n");
      out.write("\tborder-radius: 80px;\n");
      out.write("}\n");
      out.write("#work_input {\n");
      out.write("\twidth: 300px;\n");
      out.write("\tmargin-left: 20px;\n");
      out.write("}\n");
      out.write(".work_t {\n");
      out.write("\tmargin-left: 110px;\n");
      out.write("}\n");
      out.write(".work {\n");
      out.write("\ttext-align: right;\n");
      out.write("\tborder-radius: 60px;\n");
      out.write("\tbackground-image: -webkit-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(154,150,150,1.00) 100%);\n");
      out.write("\tbackground-image: -moz-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(154,150,150,1.00) 100%);\n");
      out.write("\tbackground-image: -o-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(154,150,150,1.00) 100%);\n");
      out.write("\tbackground-image: linear-gradient(180deg,rgba(255,255,255,1.00) 0%,rgba(154,150,150,1.00) 100%);\n");
      out.write("}\n");
      out.write("#other_input {\n");
      out.write("\twidth: 300px;\n");
      out.write("\tmargin-left: 20px;\n");
      out.write("}\n");
      out.write(".other_t {\n");
      out.write("\tmargin-left: 100px;\n");
      out.write("}\n");
      out.write(".other {\n");
      out.write("\ttext-align: right;\n");
      out.write("\tbackground-image: -webkit-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(150,146,146,1.00) 100%);\n");
      out.write("\tbackground-image: -moz-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(150,146,146,1.00) 100%);\n");
      out.write("\tbackground-image: -o-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(150,146,146,1.00) 100%);\n");
      out.write("\tbackground-image: linear-gradient(180deg,rgba(255,255,255,1.00) 0%,rgba(150,146,146,1.00) 100%);\n");
      out.write("\tborder-radius: 100px;\n");
      out.write("}#submit {\n");
      out.write("\ttext-align: center;\n");
      out.write("\twidth: 150px;\n");
      out.write("\theight: 50px;\n");
      out.write("\tmargin-left: 80px;\n");
      out.write("\tleft: 100%;\n");
      out.write("\tright: 100%;\n");
      out.write("\tborder-radius: 30px;\n");
      out.write("}\n");
      out.write("h2 {\n");
      out.write("\tcolor: #E9E9E9;\n");
      out.write("\tfont-family: \"Backslash Font\";\n");
      out.write("\tline-height: normal;\n");
      out.write("\ttext-decoration: underline;\n");
      out.write("\twidth: 100%;\n");
      out.write("\tbackground-image: -webkit-linear-gradient(270deg,rgba(87,183,0,1.00) 0%,rgba(163,156,55,1.00) 48.70%,rgba(68,213,0,1.00) 100%);\n");
      out.write("\tbackground-image: -moz-linear-gradient(270deg,rgba(87,183,0,1.00) 0%,rgba(163,156,55,1.00) 48.70%,rgba(68,213,0,1.00) 100%);\n");
      out.write("\tbackground-image: -o-linear-gradient(270deg,rgba(87,183,0,1.00) 0%,rgba(163,156,55,1.00) 48.70%,rgba(68,213,0,1.00) 100%);\n");
      out.write("\tbackground-image: linear-gradient(180deg,rgba(87,183,0,1.00) 0%,rgba(163,156,55,1.00) 48.70%,rgba(68,213,0,1.00) 100%);\n");
      out.write("\ttext-indent: 20px;\n");
      out.write("\tfont-size: xx-large;\n");
      out.write("\tborder-radius: 50px 50px 10px 10px;\n");
      out.write("}\n");
      out.write("#end {\n");
      out.write("\tcolor: #E9E9E9;\n");
      out.write("\tfont-family: \"Backslash Font\";\n");
      out.write("\tline-height: normal;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\twidth: 100%;\n");
      out.write("\tbackground-image: -webkit-linear-gradient(270deg,rgba(87,183,0,1.00) 0%,rgba(163,156,55,1.00) 48.70%,rgba(68,213,0,1.00) 100%);\n");
      out.write("\tbackground-image: -moz-linear-gradient(270deg,rgba(87,183,0,1.00) 0%,rgba(163,156,55,1.00) 48.70%,rgba(68,213,0,1.00) 100%);\n");
      out.write("\tbackground-image: -o-linear-gradient(270deg,rgba(87,183,0,1.00) 0%,rgba(163,156,55,1.00) 48.70%,rgba(68,213,0,1.00) 100%);\n");
      out.write("\tbackground-image: linear-gradient(180deg,rgba(87,183,0,1.00) 0%,rgba(163,156,55,1.00) 48.70%,rgba(68,213,0,1.00) 100%);\n");
      out.write("\ttext-indent: 20px;\n");
      out.write("\tfont-size: xx-large;\n");
      out.write("\tborder-radius: 10px 10px 50px 50px;\n");
      out.write("}\n");
      out.write("h3 {\n");
      out.write("\ttext-indent: 30px;\n");
      out.write("\tbackground-color: #28B000;\n");
      out.write("\tcolor: #EAFF9F;\n");
      out.write("\tfont-family: \"Lucida Grande\", \"Lucida Sans Unicode\", \"Lucida Sans\", \"DejaVu Sans\", Verdana, sans-serif;\n");
      out.write("\tborder-radius: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header><a href=\"loginHomePage.jsp\"><img src=\"images/backslash-logo-thumb.png\" width=\"51\" height=\"51\" alt=\"\"/><img src=\"images/Backslash_transparent-thumb.png\" width=\"170\" height=\"40\" alt=\"\"/></a></header>\n");
      out.write("<main>\n");
      out.write("\t<article>\n");
      out.write("    \t<h2>New User Registration</h2>\n");
      out.write("        <form action=\"Register\" method=\"POST\">\n");
      out.write("        \t<div class=\"user_pass\">\n");
      out.write("        \t<p><label>Username: </label>*<input type=\"text\" name=\"username\" id=\"username\" placeholder=\"example\" required></p>\n");
      out.write("            <p><label>Password: </label>*<input type=\"password\" name=\"password\" id=\"password\" placeholder=\"example123\" required></p></div>\n");
      out.write("\t\t<article><h3>Personal Details</h3>\n");
      out.write("        \t<div class=\"personal\">\n");
      out.write("            <table class=\"personal_t\">\n");
      out.write("            <tr>\n");
      out.write("            <td><label>Name: </label></td>\n");
      out.write("            <td>*<input type=\"text\" name=\"fname\" id=\"personal_input\" placeholder=\"First\" required></td>\n");
      out.write("            <td><input type=\"text\" name=\"mname\" id=\"personal_input\" placeholder=\"Middle\"></td>\n");
      out.write("            <td><input type=\"text\" name=\"lname\" id=\"personal_input\" placeholder=\"Last\"></td></tr>\n");
      out.write("            <tr><td><label>E-Mail ID: </label></td>\n");
      out.write("            <td>*<input type=\"email\" name=\"p_email\" id=\"personal_input\" placeholder=\"Primary\" required></td>\n");
      out.write("            <td><input type=\"email\" name=\"s_email\" id=\"personal_input\" placeholder=\"Secondary\" ></td></tr>\n");
      out.write("            <tr><td><label>Contact Number: </label></td>\n");
      out.write("            <td>*<input type=\"tel\" name=\"p_contact\" id=\"personal_input\" placeholder=\"Primary\" required></td>\n");
      out.write("            <td><input type=\"tel\" name=\"s_contact\" id=\"personal_input\" placeholder=\"Secondary\" ></td></tr>\n");
      out.write("            <tr><td><label>Date of Birth:</label></td>\n");
      out.write("            <td><input type=\"number\" name=\"day_dob\" id=\"personal_input\" min=\"1\" max=\"31\" placeholder=\"Day\" ></td>\n");
      out.write("            <td><input type=\"number\" name=\"month_dob\" id=\"personal_input\" min=\"1\" max=\"12\" placeholder=\"Month\" ></td>\n");
      out.write("            <td><input type=\"number\" name=\"year_dob\" id=\"personal_input\" min=\"1971\" max=\"2015\" placeholder=\"Year\" ></td></tr>\n");
      out.write("            <tr><td><label>Gender: *</label></td>\n");
      out.write("            <td><input type=\"radio\" name=\"gender\" id=\"gender_input\" value=\"male\" required>Male</td>\n");
      out.write("            <td><input type=\"radio\" name=\"gender\" id=\"gender_input\" value=\"female\">Female</td>\n");
      out.write("            <td><input type=\"radio\" name=\"gender\" id=\"gender_input\" value=\"other\">Prefer not to say</td></tr>\n");
      out.write("            </table>\n");
      out.write("    \t</article>\n");
      out.write("    \t<article><h3>Educational Details</h3>\n");
      out.write("        \t<div class=\"educational\">\n");
      out.write("        \t<table class=\"educational_t\">\n");
      out.write("            <tr><td><label>Last Institution Attended: </label></td>\n");
      out.write("\t        <td><input type=\"text\" name=\"cur_institution\" id=\"educational_input\" placeholder=\"Delhi Public School\" ></td></tr>\n");
      out.write("    \t    <tr><td><label>Degree: </label></td>\n");
      out.write("        \t<td><input type=\"text\" name=\"degree\" id=\"educational_input\" placeholder=\"Bachelor of Technology\" ></td></tr>\n");
      out.write("\t        <tr><td><label>Major: </label></td>\n");
      out.write("    \t    <td><input type=\"text\" name=\"major\" id=\"educational_input\" placeholder=\"Computer Science\" ></td></tr>\n");
      out.write("        \t<tr><td><label>Year of Completion: </label></td>\n");
      out.write("\t        <td><input type=\"number\" name=\"degree_comp\" id=\"educational_input\" min=\"2000\" max=\"2020\" placeholder=\"2015\" value=\"2015\" ></td></tr></table></div>\n");
      out.write("    \t</article>\n");
      out.write("    \t<article><h3>Work Details</h3>\n");
      out.write("        \t<div class=\"work\">\n");
      out.write("            <table class=\"work_t\">\n");
      out.write("\t        <tr><td><label>Organization: </label></td>\n");
      out.write("    \t    <td><input type=\"text\" name=\"work_organization\" id=\"work_input\" placeholder=\"Hewlett-Packard\" ></td></tr>\n");
      out.write("        \t<tr><td><label>Position: </label></td>\n");
      out.write("\t        <td><input type=\"text\" name=\"work_position\" id=\"work_input\" placeholder=\"Web Developer\" ></td></tr>\n");
      out.write("    \t    <tr><td><label>Working Since: </label></td>\n");
      out.write("        \t<td><input type=\"number\" name=\"work_since\" id=\"work_input\" min=\"2000\" max=\"2015\" placeholder=\"2012\" value=\"2012\"></td></tr></table></div>\n");
      out.write("    \t</article>\n");
      out.write("    \t<article><h3>Other Details</h3>\n");
      out.write("        \t<div class=\"other\">\n");
      out.write("            <table class=\"other_t\">\n");
      out.write("\t        <tr><td><label>Hometown: </label></td>\n");
      out.write("    \t    <td><input type=\"text\" name=\"hometown\" id=\"other_input\" placeholder=\"New Delhi\" ></td></tr>\n");
      out.write("            <tr><td><label>Current Address: </label></td>\n");
      out.write("    \t    <td><input type=\"text\" name=\"address1\" id=\"other_input\" placeholder=\"House/Apartment No.\" ></td></tr>\n");
      out.write("            <tr><td></td><td><input type=\"text\" name=\"address2\" id=\"other_input\" placeholder=\"Street\" ></td></tr>\n");
      out.write("            <tr><td></td><td><input type=\"text\" name=\"address3\" id=\"other_input\" placeholder=\"City\" ></td></tr>\n");
      out.write("            <tr><td></td><td><input type=\"text\" name=\"address4\" id=\"other_input\" placeholder=\"State\" ></td></tr></table></div>\n");
      out.write("    \t</article>\n");
      out.write("        <article><h2 id=\"end\">&nbsp;</h2></article>\n");
      out.write("        <article>\n");
      out.write("        \t<center><input type=\"submit\" id=\"submit\" value=\"Register\">\n");
      out.write("            <input type=\"reset\" id=\"submit\" value=\"Reset\"></center>\n");
      out.write("        </article>\n");
      out.write("    \t</form>\n");
      out.write("    </article>\n");
      out.write("</main>\n");
      out.write("<footer>\n");
      out.write("</footer>\n");
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
