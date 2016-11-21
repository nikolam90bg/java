package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import beans.Proizvod;
import beans.Osoba;

public final class korpa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      \n");
      out.write("        <title>.::Korpa::.</title>\n");
      out.write("    </head>\n");
      out.write("    <body onload =\"ukupna_cena()\">\n");
      out.write("        <div class=\"back\">\n");
      out.write("            <a href=\"ListaPasta\">X</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"conteiner\">\n");
      out.write("           \n");
      out.write("            ");
 ArrayList<Proizvod> lp = (ArrayList<Proizvod>) request.getAttribute("korpa"); 
      out.write("\n");
      out.write("            ");
 for (Proizvod a : lp) { 
      out.write("\n");
      out.write("        \n");
      out.write("           \n");
      out.write("            <div class=\"product2\">\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"deo0\" style=\"padding-top: 12px\">\n");
      out.write("                            <img src=\"");
      out.print( a.getSlika());
      out.write("\" alt=\"logo\" height=\"180\" width=\"175\" />\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"deo1\">\n");
      out.write("                            <table class=\"teble\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"deo2\">");
      out.print( a.getNaziv());
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"deo3\">");
      out.print( a.getOpis());
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                \n");
      out.write("                                <tr>\n");
      out.write("                                   <!-- <td class=\"deo4\"><input class=\"text-fail\" type=\"text\" value=\"");
      out.print( a.getCena());
      out.write("\" style=\"width: 188px\" readonly/></td> -->\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <b>Kolicina:</b>\n");
      out.write("                            <select name=\"kolicina\" class=\"textbox\" style=\"width: 80px; height: 40px;\" onchange=\"Kolicina\">\n");
      out.write("                                <option>1</option>\n");
      out.write("                                <option>2</option>\n");
      out.write("                                <option>3</option>\n");
      out.write("                                <option>4</option>\n");
      out.write("                                <option>5</option>\n");
      out.write("                            </select>\n");
      out.write("                            \n");
      out.write("                            <b>Cena:</b><input  class=\"textbox\" type=\"text\"  style=\"width: 140px\" value=\"");
      out.print( a.getCena());
      out.write("\" readonly /> \n");
      out.write("                             \n");
      out.write("                        </td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                  \n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"IzbaciPastu?sifra=");
      out.print( a.getSifra());
      out.write("\"><input type=\"button\" class=\"button2\" value=\"Izbaci\"/></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("        \n");
      out.write("            </div>\n");
      out.write("            ");
 }
      out.write(" \n");
      out.write("           \n");
      out.write("           \n");
      out.write("            \n");
      out.write("           <div class=\"korpa-bar\">\n");
      out.write("               \n");
      out.write("                <table>\n");
      out.write("                    ");
 String suma = (String) request.getAttribute("suma");
                    float s = Float.parseFloat(suma);
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <!--<td><b>Ukupna cena:</b><input type=\"text\" class=\"text-fail\" value=\"");
      out.print( s );
      out.write("\"/></td>-->\n");
      out.write("                        <td><b>Ukupna cena:</b><input type=\"text\" class=\"textbox\" id=\"ukupna_cena\" readonly/></td>\n");
      out.write("                        <td><a href=\"BrisiKorpu?x=brisi\" onClick=\"alert('Uspesno ste izvrsili narudzbinu!')\"><input type=\"button\" class=\"button3\" value=\"Naruci\"/></a></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                        \n");
      out.write("            <div id=\"login\">\n");
      out.write("            ");
 
                HttpSession sesija = request.getSession();
                Osoba osoba = (Osoba) sesija.getAttribute("osoba");
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
      out.write("        \n");
      out.write("            \n");
      out.write("      \n");
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
