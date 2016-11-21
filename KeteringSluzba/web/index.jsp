<%-- 
    Document   : index
    Created on : Feb 1, 2016, 6:22:34 PM
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
        <title>.::Ketering sluzba::.</title>
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
                            if(osoba!=null && osoba.getKorisnicko_ime().equals("admin")){
                        %>
                        <li><a href="Reklamacije" >Poruke</a></li>
                        <% } else{ %>
                        <li><a href="kontakt.jsp" >Kontakt</a></li>
                        
                       
                        <% } %>
                    </ul>
                </div>
            </div>
        </div>
        <div id="socila-network">
            <a href="https://www.facebook.com/" target="_blank"><img src="images/social-network/facebook.png" alt="logo" height="35" wight="35" align="center"></a>
            <a href="https://www.youtube.com/" target="_blank"><img src="images/social-network/youtube.png" alt="logo" height="35" wight="35" align="center"></a>
            <a href="https://www.instagram.com/" target="_blank"><img src="images/social-network/Instagram.png" alt="logo" height="35" wight="35" align="center"></a>
            <a href="https://www.pinterest.com/" target="_blank"><img src="images/social-network/pinterest.png" alt="logo" height="35" wight="35" align="center"></a>
        </div>
       
        <div id="login">
            <% if(osoba!=null){ %>
              Dobrodosli:${osoba.getKorisnicko_ime()}<br/>
              <a href="profil.jsp">Profil</a><br/>
              <% if(osoba.getKorisnicko_ime().equals("admin")){%>
                         <a href="Clanovi">Clanovi</a><br/>
                         <a href="NarAdmin">Narudzbenice</a><br/>
                        <%  }else{ %>
              <a href="NarClan?k_ime=<%= osoba.getKorisnicko_ime()%>">Narudzbenice</a><br/>
              <% } %>
              <a href="Logout">Izloguj se</a>
            <% } else { %>        
            <a href="prijava.jsp">Prijavi se</a><br/>
            <a href="registracija.jsp">Registracija</a>
            <% } %> 
        </div>
        <div id="conteiner">
            <a href="ListaPica">
                <div class="product">
                    <img src="images/picture/pica.png" alt="logo" height="170" width="220" align="center">
                </div>
            </a>
            <a href="ListaPasta">
                <div class="product">
                    <img src="images/picture/pasta.png" alt="logo" height="190" width="220" align="center">
                </div>
            </a>
            <a href="ListaHamburgera">
                <div class="product">
                    <img src="images/picture/burger.png" alt="logo" height="170" width="220" align="center">
                </div
            </a>
            <a href="ListaSendvica">
                <div class="product">
                    <img src="images/picture/sendvic.png" alt="logo" height="170" width="220" align="center">
                </div>
            </a>
        </div>

        <div id="footer"></div>
    </body>
</html>
