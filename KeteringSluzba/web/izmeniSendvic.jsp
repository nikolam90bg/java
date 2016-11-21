<%-- 
    Document   : izmeniSendvic
    Created on : Feb 16, 2016, 7:30:07 PM
    Author     : Nikola90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="shortcut icon" href="images/icons/icon.jpg">
        <link rel="stylesheet" type="text/css"  href="css/style.css">
        <title>.::Izmeni sendvic::.</title>
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
            <form action="Izmeni_sendvic" method="post">
                <table>
                    <caption>
                        <h3>Izmeni sendvic</h3><br/>
                        <% String poruka = (String) request.getAttribute("poruka");
                            if (poruka != null && poruka.length() > 0) {
                        %>
                        <h4 style="color:red"><%= poruka%></h4>
                        <% }%>
                    </caption>
                    <tr>
                        <td><input type="text" class="textbox" name="sifra" value="${proizvod.getSifra()}" hidden/></td>
                    </tr>
                    <tr>
                        <td><input type="text" class="textbox" name="naziv" value="${proizvod.getNaziv()}"/></td>
                    </tr>
                    <tr>
                        <td><input type="file" class="textbox" name="slika"/></td> 
                    </tr>
                    <tr>
                        <td><textarea class="textbox" name="opis" >${proizvod.getOpis()}</textarea></td>
                    </tr>
                    <tr>
                        <td><input type="text" class="textbox" name="cena" value="${proizvod.getCena()}"/></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" class="button" value="Potvrdi"/>
                            <input type="reset" class="button" value="Odustani"/>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
