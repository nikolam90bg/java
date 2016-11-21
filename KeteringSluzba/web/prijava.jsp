<%-- 
    Document   : prijava
    Created on : Feb 10, 2016, 6:45:53 PM
    Author     : Nikola90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="images/icons/icon.jpg">
        <link rel="stylesheet" type="text/css"  href="css/style.css">
        <title>.::Prijava::.</title>
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
               <% String poruka = (String) request.getAttribute("poruka");
                  if(poruka!= null && poruka.length()>0) {
               %>
               <h4 style="color:red"><%= poruka %></h4>
               <% } %>
            <form action="Logovanje" method="post">
                <table>
                    <tr>
                        <td colspan="2"><input type="text" class="textbox" placeholder="korisnicko ime" name="korisnicko_ime"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="password" class="textbox" placeholder="lozinka" name="lozinka" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" class="button" value="Potvrdi"/></td>
                        <td><input type="reset" class="button" value="Odustani"/></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><a href="registracija.jsp"/>Registracija</a></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
