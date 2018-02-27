package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class users_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <title>Credit Transfer</title>\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t<nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t \n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t <span class=\"sr-only\">Toggle navigation</span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t</button> <a class=\"navbar-brand\" href=\"#\">Home</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t<li class=\"active\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"users.jsp\">View Users</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"transfer.jsp\">Transfer credit</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</nav>\n");
      out.write("                    <h1> USERS </h1>\n");
      out.write("                    <div class=\"jumbotron\">\n");
      out.write("               \n");
      out.write("                        ");

                        Connection con;
                        PreparedStatement st;
                        ResultSet rs;
                        try {
                            
                            Class.forName("oracle.jdbc.driver.OracleDriver");
                            
                            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "prakhar");
               
                            st = con.prepareStatement("select * from users");
                            rs = st.executeQuery();
      out.write("                        \n");
      out.write("                    <table class=\"table\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th> Name </th>\n");
      out.write("                                <th> Email </th>\n");
      out.write("                                <th> Credit </th>\n");
      out.write("                                <th> &nbsp; </th>                                \n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                            while(rs.next())
                            {
                                out.println("<tr>");
                                out.println("<td>"+rs.getString(1)+"</td>");
                                out.println("<td>"+rs.getString(2)+"</td>");
                                out.println("<td>"+rs.getInt(3)+"</td>");
                                
                                out.println("</tr>");
                            }
                            con.close();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                        \n");
      out.write("                    </table>\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                        <h1> RECENT TRANSFERS </h1>\n");
      out.write("                    <div class=\"jumbotron\">\n");
      out.write("               \n");
      out.write("                        ");

                            try {
                            
                            Class.forName("oracle.jdbc.driver.OracleDriver");
                            
                            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "prakhar");
               
                            st = con.prepareStatement("select * from transfers");
                            rs = st.executeQuery();
      out.write("                        \n");
      out.write("                    <table class=\"table\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th> Donator </th>\n");
      out.write("                                <th> Amount </th>\n");
      out.write("                                <th> Receiver </th>\n");
      out.write("                                <th> &nbsp; </th>                                \n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                            while(rs.next())
                            {
                                out.println("<tr>");
                                out.println("<td>"+rs.getString(1)+"</td>");
                                out.println("<td>"+rs.getInt(2)+"</td>");
                                out.println("<td>"+rs.getString(3)+"</td>");
                                
                                out.println("</tr>");
                            }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                        \n");
      out.write("                    </table>\n");
      out.write("                    </div>\n");
      out.write("                </body>\n");
      out.write("                </html>\n");
      out.write("                \n");
      out.write("                    ");
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
