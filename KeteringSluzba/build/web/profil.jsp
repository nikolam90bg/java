<%-- 
    Document   : profil
    Created on : Feb 11, 2016, 6:35:04 PM
    Author     : Nikola90
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="images/icons/icon.jpg">
        <link rel="stylesheet" type="text/css"  href="css/style.css">
        <title>.::Profil::.</title>
    </head>
    <body>
         <div id="header">
             <div id="header-meni">
                <div id="logo">
                    <img src="images/logo.png" alt="logo" height="160" width="220">
                </div>
            </div>
        </div>
        <div class="back">
            <a href="index.jsp">X</a>
        </div>
        <div class="naslov">
            <h2>Profil</h2>
            <% String poruka = (String) request.getAttribute("poruka");
               if(poruka!= null && poruka.length()>0) {
            %>
            <h4 style="color:red"><%= poruka %></h4>
            <% } %>
        </div>
        <div class="forma">
            <table>
                <tr>
                    <td colspan="2">
                    <img src="${osoba.getSlika()}" alt="profil" height="120" width="120" align="center">
                    <td>
                </tr>
                <tr>
                    <td class="red">Korisnicko ime:</td>
                    <td><input type="text" class="textbox" value="${osoba.getKorisnicko_ime()}"  readonly /></td>
                </tr>
                <tr>
                    <td class="red">Lozinka:</td>
                    <td><input type="text" class="textbox" value="${osoba.getLozinka()}"  readonly /></td>
                </tr>
                <tr>
                    <td class="red">Ime:</td>
                    <td><input type="text" class="textbox" value="${osoba.getIme()}"  readonly /></td>
                </tr>
                <tr>
                    <td class="red">Prezime:</td>
                    <td><input type="text" class="textbox" value="${osoba.getPrezime()}"  readonly/></td>
                </tr>
                <tr>
                    <td class="red">Adresa:</td>
                    <td><input type="text" class="textbox" value="${osoba.getAdresa()}" readonly /></td>
                </tr>
                <tr>
                    <td class="red">Telefon:</td>
                    <td><input type="text" class="textbox" value="${osoba.getTelefon()}" readonly /></td>
                </tr>
                <tr>
                    <td class="red">Email:</td>
                    <td><input type="text" class="textbox" value="${osoba.getEmail()}" readonly /></td>
                </tr>
                <tr>
                    <td><a href="ObrisiProfil?ime=${osoba.getKorisnicko_ime()}" style="color:yellow;">Obrsi profil</td>
                    <td>
                        <a href="Logout"> <button class="button">Izloguj se</button></a>
                        <a href="izmena.jsp"> <button class="button">Izmeni</button></a>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>
