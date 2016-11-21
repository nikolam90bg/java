<%-- 
    Document   : o_nama
    Created on : Feb 12, 2016, 11:35:23 AM
    Author     : Nikola90
--%>

<%@page import="beans.Osoba"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="images/icons/icon.jpg">
        <link rel="stylesheet" type="text/css"  href="css/style.css">
        <title>.::O nama::.</title>
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
                        <li><a href="Reklamacije" title="">Reklamacije</a></li>
                            <% } else { %>
                        <li><a href="kontakt.jsp" title="">Kontakt</a></li>
                            <% } %>
                    </ul>
                </div>
            </div>
        </div>
        
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
        <div class="forma" style="font-size:24px; width:690px; text-align: justify;"> 
            <p>
                <b>Food to you.com</b> predstavlja restoran brze hrane čiji meni je baziran na specijalitetima domaće i internacionalne kuhinje.<br/>
                Fast food se nalazi na Vidikovcu u Ulici Ratka Mitrovića 164/16.  Prepoznatljiv je po odlično pripremljenoj hrani, brzoj usluzi, zimskoj i letnjoj bašti i timom zaposlenih koji su maksimalno posvećeni zadovoljenju potreba naših klijenata.<br/><br/>
                <b>Food to you.com!</b> vrši besplatnu dostavu hrane od 09.00-04.00h za porudzbine vece od 500 din. 
                Za firme i sve vrste slavlja moguć poseban dogovor.
            </p>
        </div>
        <div class="back">
            <a href="index.jsp">X</a>
        </div>
    </body>
</html>
