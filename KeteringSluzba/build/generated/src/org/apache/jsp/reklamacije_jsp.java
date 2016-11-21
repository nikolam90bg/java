package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import beans.Poruka;

public final class reklamacije_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/icons/icon.jpg\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"  href=\"css/style.css\">\n");
      out.write("        <title>.::Reklamacije::.</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("\n");
      out.write("            <div id=\"header-meni\">\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <img src=\"images/01.png\" alt=\"logo\" height=\"160\" width=\"220\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
 ArrayList<Poruka> la = (ArrayList<Poruka>) request.getAttribute("lista");
      out.write("\n");
      out.write("        ");
 for(Poruka a: la) { 
      out.write(" \n");
      out.write("        <div class=\"poruka\">\n");
      out.write("            <form action=\"BrisiPoruku\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <input type=\"text\" value=\"");
      out.print( a.getId() );
      out.write("\" hidden name=\"id\"/>\n");
      out.write("                    <td><input type=\"text\" class=\"text-fail\" readonly value=\"");
      out.print( a.getIme_prezime() );
      out.write("\"/></td>\n");
      out.write("                    <td><input type=\"text\" class=\"text-fail\"  readonly value=\"");
      out.print( a.getMail() );
      out.write("\"/></td>\n");
      out.write("                    <td><input type=\"text\" class=\"text-fail\"  readonly value=\"");
      out.print( a.getTelefon() );
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"3\">\n");
      out.write("                        <textarea class=\"text-area\" style=\"width: 735px; height: 80px;\" readonly />");
      out.print( a.getSadrzaj() );
      out.write("</textarea>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"3\"> \n");
      out.write("                        <a href=\"#\"><button class=\"button-brisi\">Brisi</button></a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"back\">\n");
      out.write("            <a href=\"index.jsp\">X</a>\n");
      out.write("        </div>\n");
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
