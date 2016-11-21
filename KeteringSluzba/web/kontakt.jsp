<%-- 
    Document   : reklamacija
    Created on : Feb 12, 2016, 12:22:43 PM
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
        <title>.::Kontakt::.</title>
    </head>
    <body>
        <div id="header">
            <div id="header-meni">
                <div id="logo">
                    <img src="images/logo.png" alt="logo" height="160" width="220"/>
                </div>

                <div id="meni">
                    <ul>
                        <li><a href="o_nama.jsp" title="">O nama</a></li>
                         <li><a href="ListaPica" title="">Pice</a></li>
                         <li><a href="ListaPasta" title="">Paste</a></li>
                         <li><a href="ListaHamburgera" title="">Burgeri</a></li>
                         <li><a href="ListaSendvica" title="">Sendvici</a></li>
                        <li><a href="kontakt.jsp" title="">Kontakt</a></li>
                    </ul>
                </div>
            </div>
        </div>
        
        <div id="login">
            <%
                HttpSession sesija = request.getSession();
                Osoba osoba = (Osoba) sesija.getAttribute("osoba");
                if (osoba != null) {
            %>
            Dobrodosli:${osoba.getKorisnicko_ime()}<br/>
            <a href="profil.jsp">Profil</a><br/>
            <a href="Logout">Izloguj se</a>
            <% } else { %>        
            <a href="prijava.jsp">Prijavi se</a><br/>
            <a href="registracija.jsp">Registracija</a>
            <% } %> 
        </div>

        <div class="forma">
            <% String poruka = (String) request.getAttribute("poruka");
                if (poruka != null && poruka.length() > 0) {
            %>
            <h4 style="color:red"><%= poruka%></h4>
            <% }%>
            <form action="Poruka" method="post">
                <table>
                    <tr>
                        <td colspan="2"><input type="text" class="textbox" placeholder="Ime i prezime" name="ime_prezime"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="text" class="textbox" placeholder="mail adresa" name="mail" /></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="text" class="textbox" placeholder="kontakt telefon" name="telefon" /></td>
                    </tr>
                    <tr>
                        <td colspan="2"><textarea class="text-area" placeholder="poruka" name="sadrzaj" /></textarea></td>
                    </tr>
                    <tr>
                        <td><input type="submit" class="button" value="Potvrdi"/></td>
                        <td><input type="reset" class="button" value="Odustani"/></td>
                    </tr>
                </table>
            </form>
        </div>
        <div class="back">
            <a href="index.jsp">X</a>
        </div>
    </body>
</html>
