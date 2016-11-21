package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Osoba;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/icons/icon.jpg\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"  href=\"css/style.css\">\n");
      out.write("        <title>.::Ketering sluzba::.</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"header-meni\">\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <img src=\"images/logo.png\" alt=\"logo\" height=\"160\" width=\"220\">\n");
      out.write("                </div>\n");
      out.write("                <div id=\"meni\">\n");
      out.write("                    <ul>\n");
      out.write("                         <li><a href=\"o_nama.jsp\" title=\"\">O nama</a></li>\n");
      out.write("                         <li><a href=\"ListaPica\" title=\"\">Pice</a></li>\n");
      out.write("                         <li><a href=\"ListaPasta\" title=\"\">Paste</a></li>\n");
      out.write("                         <li><a href=\"ListaHamburgera\" title=\"\">Burgeri</a></li>\n");
      out.write("                         <li><a href=\"ListaSendvica\" title=\"\">Sendvici</a></li>\n");
      out.write("                        ");
 
                          HttpSession sesija = request.getSession();
                            Osoba osoba = (Osoba) sesija.getAttribute("osoba");
                            if(osoba!=null && osoba.getKorisnicko_ime().equals("admin")){
                        
      out.write("\n");
      out.write("                        <li><a href=\"Reklamacije\" >Poruke</a></li>\n");
      out.write("                        ");
 } else{ 
      out.write("\n");
      out.write("                        <li><a href=\"kontakt.jsp\" >Kontakt</a></li>\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"socila-network\">\n");
      out.write("            <a href=\"https://www.facebook.com/\" target=\"_blank\"><img src=\"images/social-network/facebook.png\" alt=\"logo\" height=\"35\" wight=\"35\" align=\"center\"></a>\n");
      out.write("            <a href=\"https://www.youtube.com/\" target=\"_blank\"><img src=\"images/social-network/youtube.png\" alt=\"logo\" height=\"35\" wight=\"35\" align=\"center\"></a>\n");
      out.write("            <a href=\"https://www.instagram.com/\" target=\"_blank\"><img src=\"images/social-network/Instagram.png\" alt=\"logo\" height=\"35\" wight=\"35\" align=\"center\"></a>\n");
      out.write("            <a href=\"https://www.pinterest.com/\" target=\"_blank\"><img src=\"images/social-network/pinterest.png\" alt=\"logo\" height=\"35\" wight=\"35\" align=\"center\"></a>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <div id=\"login\">\n");
      out.write("            ");
 if(osoba!=null){ 
      out.write("\n");
      out.write("              Dobrodosli:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${osoba.getKorisnicko_ime()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br/>\n");
      out.write("              <a href=\"profil.jsp\">Profil</a><br/>\n");
      out.write("              ");
 if(osoba.getKorisnicko_ime().equals("admin")){
      out.write("\n");
      out.write("                         <a href=\"Clanovi\">Clanovi</a><br/>\n");
      out.write("                         <a href=\"NarAdmin\">Narudzbenice</a><br/>\n");
      out.write("                        ");
  }else{ 
      out.write("\n");
      out.write("              <a href=\"NarClan?k_ime=");
      out.print( osoba.getKorisnicko_ime());
      out.write("\">Narudzbenice</a><br/>\n");
      out.write("              ");
 } 
      out.write("\n");
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
      out.write("        <div id=\"conteiner\">\n");
      out.write("            <a href=\"ListaPica\">\n");
      out.write("                <div class=\"product\">\n");
      out.write("                    <img src=\"images/picture/pica.png\" alt=\"logo\" height=\"170\" width=\"220\" align=\"center\">\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"ListaPasta\">\n");
      out.write("                <div class=\"product\">\n");
      out.write("                    <img src=\"images/picture/pasta.png\" alt=\"logo\" height=\"190\" width=\"220\" align=\"center\">\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"ListaHamburgera\">\n");
      out.write("                <div class=\"product\">\n");
      out.write("                    <img src=\"images/picture/burger.png\" alt=\"logo\" height=\"170\" width=\"220\" align=\"center\">\n");
      out.write("                </div\n");
      out.write("            </a>\n");
      out.write("            <a href=\"ListaSendvica\">\n");
      out.write("                <div class=\"product\">\n");
      out.write("                    <img src=\"images/picture/sendvic.png\" alt=\"logo\" height=\"170\" width=\"220\" align=\"center\">\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"footer\"></div>\n");
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
