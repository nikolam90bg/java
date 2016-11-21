<%-- 
    Document   : izmena
    Created on : Feb 11, 2016, 6:51:55 PM
    Author     : Nikola90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="images/icons/icon.jpg">
        <link rel="stylesheet" type="text/css"  href="css/style.css">
        <title>JSP Page</title>
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
            <a href="profil.jsp">X</a>
        </div>
        <div class="naslov">
            <h2>Izmena</h2>
            <% String poruka = (String) request.getAttribute("poruka");
               if(poruka!= null && poruka.length()>0) {
            %>
            <h4 style="color:red"><%= poruka %></h4>
            <% } %>
        </div>
        <div class="forma">
            <form action="Izmena" method="post">
                <table>
                    <tr>
                        <td class="red">Lozinka:</td>
                        <td><input type="text" class="textbox" value="${osoba.getLozinka()}" name="lozinka" /></td>
                    </tr>
                    <tr>
                        <td class="red">Slika:</td>
                        <td><input type="file" class="textbox"  name="slika" /></td>
                    </tr>

                    <tr>
                        <td class="red">Ime:</td>
                        <td><input type="text" class="textbox" value="${osoba.getIme()}" name="ime" /></td>
                    </tr>
                    <tr>
                        <td class="red">Prezime:</td>
                        <td><input type="text" class="textbox" value="${osoba.getPrezime()}"  name="prezime"/></td>
                    </tr>
                    <tr>
                        <td class="red">Adresa:</td>
                        <td><input type="text" class="textbox" value="${osoba.getAdresa()}"  name="adresa"/></td>
                    </tr>
                    <tr>
                        <td class="red">Telefon:</td>
                        <td><input type="text" class="textbox" value="${osoba.getTelefon()}"  name="telefon"/></td>
                    </tr>
                    <tr>
                        <td class="red">Email:</td>
                        <td><input type="text" class="textbox" value="${osoba.getEmail()}" name="email" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" class="button" value="Potvrdi"/></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
