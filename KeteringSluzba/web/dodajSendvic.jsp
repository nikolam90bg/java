<%-- 
    Document   : dodajSendvic
    Created on : Feb 16, 2016, 7:22:57 PM
    Author     : Nikola90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="images/icons/icon.jpg">
        <link rel="stylesheet" type="text/css"  href="css/style.css">
        <title>.::Dodaj sendvic::.</title>
    </head>
    <body>
         <div class="back">
            <a href="ListaSendvica">X</a>
        </div>
        <div id="header">
            <div id="header-meni">
                <div id="logo">
                    <img src="images/logo.png" alt="logo" height="160" width="220"/>
                </div>
            </div>
        </div>

        <div class="forma">
            <form action="DodajSendvic" method="post">
                <table>
                    <caption>
                        <h2>Dodaj sendvic</h2>

                        <% String poruka = (String) request.getAttribute("poruka");
                            if (poruka != null && poruka.length() > 0) {
                        %>
                        <h4 style="color:red"><%= poruka%></h4>
                        <% } %>
                    </caption>
                    <tr>
                        <td colspan="2"><input type="text" class="textbox" placeholder="sifra" name="sifra"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="text" class="textbox" placeholder="naziv" name="naziv"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="file" class="textbox"  name="slika"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><textarea class="textbox" placeholder="opis" name="opis"></textarea></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="text" class="textbox" placeholder="cena" name="cena"/></td>
                    </tr>
                    <td>
                        <input type="submit" class="button" value="Dodaj"/> 
                        <input type="reset" class="button" value="Odustani"/> 
                    </td>
                </table>
            </form>
        </div>
    </body>
</html>
