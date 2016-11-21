<%-- 
    Document   : narudzbenica
    Created on : Feb 20, 2016, 1:43:06 AM
    Author     : Nikola90
--%>

<%@page import="beans.Narudzbenica"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="images/icons/icon.jpg">
        <link rel="stylesheet" type="text/css"  href="css/style.css">
        <title>.::Narudzbenice::.</title>
    </head>
    <body>
        <div class="back">
            <a href="index.jsp">X</a>
        </div>
        
        <div id="conteiner">
            
            <% ArrayList<Narudzbenica> lp = (ArrayList<Narudzbenica>) request.getAttribute("narudzbenica"); %>
            <% for (Narudzbenica n : lp) { %>
            <div class="forma" style="text-align: initial; padding: 3px">
                <table cellpadding="10">
                    <tr>
                        <td><b>Korisnicko ime: </b><%= n.getKorisnicko_ime() %></td>
                         <td><b>Ime i prezime: </b><%= n.getIme_prezime() %></td>
                    </tr>
                    <tr>
                         <td><b>Adresa: </b><%= n.getAdresa() %></td>
                         <td><b>Vreme: </b><%= n.getVreme() %></td>
                    </tr>
                    <tr>
                         <td><b>Datum: </b><%= n.getDatum() %></td>
                         <td><b>Cena: </b><%= n.getCena() %></td>
                    </tr>
                </table>
                
            </div>
            <% } %>
        </div>
    </body>
</html>
