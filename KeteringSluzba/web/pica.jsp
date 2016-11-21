<%-- 
    Document   : pica
    Created on : Feb 10, 2016, 5:56:40 PM
    Author     : Nikola90
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="beans.Proizvod"%>
<%@page import="beans.Osoba"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="images/icons/icon.jpg">
        <link rel="stylesheet" type="text/css"  href="css/style.css">
        <title>.::Pice::.</title>
    </head>
    <body>
        <div id="header">
            <div id="header-meni">
                <div id="logo">
                    <img src="images/logo.png" alt="logo" height="160" width="220">
                </div>
                <div id="meni">
                    <ul>
                        <li><a href="o_nama.jsp" title="">O nama</a></li>
                        <li><a href="ListaPica" title="">Pice</a></li>
                         <li><a href="ListaPasta" title="">Paste</a></li>
                         <li><a href="ListaHamburgera" title="">Burgeri</a></li>
                         <li><a href="ListaSendvica" title="">Sendvici</a></li>
                            <%
                                HttpSession sesija = request.getSession();
                                Osoba osoba = (Osoba) sesija.getAttribute("osoba");
                                if (osoba != null && osoba.getKorisnicko_ime().equals("admin")) {
                            %>
                        <li><a href="Reklamacije">Poruke</a></li>
                            <% } else { %>
                        <li><a href="kontakt.jsp">Kontakt</a></li>
                            <% } %>
                    </ul>
                </div>
            </div>
        </div>
                    
                    <div id="conteiner">
             
            <% ArrayList<Proizvod> lp = (ArrayList<Proizvod>) request.getAttribute("listaPica");
                for (Proizvod p : lp) {
            %>
            <div class="product2">
                <table class="table">
                    <tr>
                        <td class="deo0" style="padding-top: 12px">
                            <img src="<%= p.getSlika()%>" alt="logo" height="170px" width="170px" />
                        </td>
                        <td class="deo1">
                            <table class="teble">
                                <tr>
                                    <td class="deo2"><%= p.getNaziv()%></td>
                                </tr>
                                <tr>
                                    <td class="deo3"><%= p.getOpis()%></td>
                                </tr>
                                <tr>
                                    <td class="deo4">Cena:<%= p.getCena()%></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                   
                        <%if (osoba != null && osoba.getKorisnicko_ime().equals("admin")) {%>
                        <tr>
                        <td colspan="2" style="text-align: center;">
                            <a href="PrikaziPicu?sifra=<%= p.getSifra()%>" ><input type="button" class="button3" value="Izmeni"/></a>
                            <a href="BrisiPicu?sifra=<%= p.getSifra()%>" ><input type="button" class="button3" value="Obrisi"/></a>
                        </td>
                        </tr>
                        <% } else if (osoba != null) {%>
                    
                    <tr>
                       
                        <td>
                        
                            <form action="KorpaPica" method="post"> 
                                <input type="text" name="sifra" value="<%= p.getSifra()%>" hidden />
                                <b>Kolicina:</b>
                            <select  name="kolicina" class="textbox" style="width:105px; height: 40px; ">
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                            </select>
                            <input type="submit" class="button3" value="Ubaci u korpu" />
                           
                            </form>
                        </td>
                    </tr>
                        <% } %>
                    
                </table>
            </div>
            <% } %> 
        </div>

        <div class="back">
            <a href="index.jsp">X</a>
        </div>
        
         <% if (osoba != null) { %>
        <div id="tool-bar">
            <% if (osoba.getKorisnicko_ime().equals("admin")) { %>
            <a href="dodajPicu.jsp">Dodaj proizovd</a>
            <% } else { %>        
           
                <% String br = (String) request.getAttribute("broj");%>
                <% if(!br.equals("0")) { %>
                <a href="Korpa">
                Korpa: <%= br %> 
                 </a>
                <% } else { %>
                <a href="Korpa" onClick="alert('Korpa je prazna!')"> Korpa: 0 </a>
                <% } %>
          
            <% } %>
        </div>
        <% } %> 
        
        
        
        

        
        <div id="login">
           <% if(osoba!=null){ %>
              Dobrodosli:${osoba.getKorisnicko_ime()}<br/>
              <a href="profil.jsp">Profil</a><br/>
              <% if(osoba.getKorisnicko_ime().equals("admin")){%>
                         <a href="Clanovi">Clanovi</a><br/>
                        <%  } %>
              <a href="Logout">Izloguj se</a>
            <% } else { %>        
            <a href="prijava.jsp">Prijavi se</a><br/>
            <a href="registracija.jsp">Registracija</a>
            <% } %> 
        </div>
    </body>
</html>
