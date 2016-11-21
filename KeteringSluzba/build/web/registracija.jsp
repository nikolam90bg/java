<%-- 
    Document   : registracija
    Created on : Feb 10, 2016, 6:59:32 PM
    Author     : Nikola90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="images/icons/icon.jpg">
        <link rel="stylesheet" type="text/css"  href="css/style.css">
        <title>.::Registracija::.</title>
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

        <div class="back">
            <a href="index.jsp">X</a>
        </div>

        <div class="forma">
            <form action="Registracija" method="post">
                <table>
                    <% String poruka = (String) request.getAttribute("poruka");
                        if (poruka != null && poruka.length() > 0) {
                    %>
                    <h4 style="color:red"><%= poruka%></h4>
                    <% }%>
                    <tr>
                        <td colspan="2"><input type="text" class="textbox" placeholder="korisnicko ime" name="korisnicko_ime"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="password" class="textbox" placeholder="lozina" name="lozinka"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="file" class="textbox" name="slika" /></td> 
                    </tr>
                    <tr>
                        <td colspan="2"><input type="text" class="textbox" placeholder="ime" name="ime"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="text" class="textbox" placeholder="prezime" name="prezime"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="text" class="textbox" placeholder="adresa" name="adresa"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="text" class="textbox" placeholder="telefon" name="telefon"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="text" class="textbox" placeholder="email" name="mail"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" class="button" value="Potvrdi"/></td>
                        <td><input type="reset" class="button" value="Odustani"/></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
