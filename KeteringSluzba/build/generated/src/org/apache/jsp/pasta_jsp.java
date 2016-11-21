package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import beans.Proizvod;
import beans.Osoba;

public final class pasta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"shortcut icon\" href=\"images/icons/icon.jpg\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"  href=\"css/style.css\">\n");
      out.write("        <title>.::Paste::.</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("\n");
      out.write("            <div id=\"header-meni\">\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <img src=\"images/01.png\" alt=\"logo\" height=\"160\" width=\"220\"/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"meni\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"o_nama.jsp\" title=\"\">O nama</a></li>\n");
      out.write("                        ");
 
                          HttpSession sesija = request.getSession();
                            Osoba osoba = (Osoba) sesija.getAttribute("osoba");
                            if(osoba!=null && osoba.getKorisnicko_ime().equals("admin")){
                        
      out.write("\n");
      out.write("                        <li><a href=\"Reklamacije\" title=\"\">Reklamacije</a></li>\n");
      out.write("                        ");
 } else{ 
      out.write("\n");
      out.write("                        <li><a href=\"kontakt.jsp\" title=\"\">Kontakt</a></li>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                        <li><a href=\"#\" title=\"\">Korpa</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"back\">\n");
      out.write("            <a href=\"index.jsp\">X</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"conteiner\">\n");
      out.write("            \n");
      out.write("        ");
 ArrayList<Proizvod> la = (ArrayList<Proizvod>) request.getAttribute("lista");
      out.write("\n");
      out.write("        ");
 for(Proizvod a: la) { 
      out.write(" \n");
      out.write("            <div class=\"product2\">\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"deo\" style=\"padding-top: 12px\">\n");
      out.write("                            <img src=\"");
      out.print( a.getSlika() );
      out.write("\" alt=\"logo\" height=180px\" width=\"175px\" />\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"deo\">\n");
      out.write("                            <table class=\"teble\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"deo2\">");
      out.print( a.getNaziv() );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"deo3\">\n");
      out.write("                                        ");
      out.print( a.getOpis() );
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                \n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"deo4\">Cena:");
      out.print( a.getCena() );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        ");
 
                          
                            if(osoba!=null && osoba.getKorisnicko_ime().equals("admin")){
                        
      out.write("\n");
      out.write("                       \n");
      out.write("                        <td colspan=\"2\" style=\"text-align: center;\">\n");
      out.write("                                <a href=\"#\"><input type=\"submit\" class=\"button3\" value=\"Izmeni\"/></a>\n");
      out.write("                                <a href=\"#\"><input type=\"submit\" class=\"button3\" value=\"Obrisi\"/></a>\n");
      out.write("                            </td>\n");
      out.write("                            \n");
      out.write("                        </td>\n");
      out.write("                        ");
 } else if(osoba!=null){ 
      out.write("\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <a href=\"#\"><input type=\"submit\" class=\"button2\" value=\"Ubaci\"/></a>\n");
      out.write("                        </td>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                 </table>\n");
      out.write("            </div>\n");
      out.write("           ");
 } 
      out.write("\n");
      out.write("                \n");
      out.write("          </div>\n");
      out.write("        <div id=\"login\">\n");
      out.write("             ");

            if(osoba!=null){
            
      out.write("\n");
      out.write("              Dobrodosli:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${osoba.getKorisnicko_ime()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br/>\n");
      out.write("              <a href=\"profil.jsp\">Profil</a><br/>\n");
      out.write("              <a href=\"Logout\">Izloguj se</a>\n");
      out.write("            ");
 } else { 
      out.write("        \n");
      out.write("            <a href=\"prijava.jsp\">Prijavi se</a><br/>\n");
      out.write("            <a href=\"registracija.jsp\">Registracija</a>\n");
      out.write("            ");
 } 
      out.write(" \n");
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
