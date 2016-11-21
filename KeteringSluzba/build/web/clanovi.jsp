<%-- 
    Document   : clanovi
    Created on : Feb 16, 2016, 8:04:37 PM
    Author     : Nikola90
--%>

<%@page import="beans.Osoba"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="images/icons/icon.jpg">
        <link rel="stylesheet" type="text/css"  href="css/style.css">
        <title>.::Clanovi::.</title>
    </head>
    <body>
        <div id="header">
            <div id="header-meni">
                <div id="logo">
                    <img src="images/logo.png" alt="logo" height="160" width="220">
                </div>
            </div>
        </div>

        <div id="conteiner">
        <% ArrayList<Osoba> la = (ArrayList<Osoba>) request.getAttribute("listaClanova");%>
        <% for(Osoba a: la) { %> 
        <div class="product2" style="width:380px ">
            <form action="BrisiClana" method="post">
            <table>
                <tr>
                    <input type="text" value="<%= a.getKorisnicko_ime() %>" hidden name="ime"/>
                    <td><img src="<%= a.getSlika() %>" alt="profil" height="120" width="120" align="center"><td>
                    <td>
                        <input type="text" class="textbox" readonly value="<%= a.getIme() %>" style="width: 225px" /><br/>
                    <input type="text" class="textbox"  readonly value="<%= a.getPrezime() %>" style="width: 225px"/></td>
            
                </tr>
                
                <tr>
                    <td colspan="3"> 
                        <button class="button2">Brisi</button>
                    </td>
                </tr>
            </table>
            </form>
        </div>
        <% } %>
        </div>

        <div class="back">
            <a href="index.jsp">X</a>
        </div>
    </body>
</html>
