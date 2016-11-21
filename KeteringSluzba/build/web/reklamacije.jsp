<%-- 
    Document   : reklamacije
    Created on : Feb 1, 2016, 6:22:34 PM
    Author     : Nikola90
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="beans.Poruka"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="images/icons/icon.jpg">
        <link rel="stylesheet" type="text/css"  href="css/style.css">
        <title>.::Reklamacije::.</title>
    </head>
    <body>
        <div id="header">
            <div id="header-meni">
                <div id="logo">
                    <img src="images/logo.png" alt="logo" height="160" width="220">
                </div>
            </div>
        </div>

        <% ArrayList<Poruka> la = (ArrayList<Poruka>) request.getAttribute("lista");%>
        <% for(Poruka a: la) { %> 
        <div class="poruka">
            <form action="BrisiPoruku" method="post">
            <table>
                <tr>
                    <input type="text" value="<%= a.getId() %>" hidden name="id"/>
                    <td><input type="text" class="textbox" readonly value="<%= a.getIme_prezime() %>"/></td>
                    <td><input type="text" class="textbox"  readonly value="<%= a.getMail() %>"/></td>
                    <td><input type="text" class="textbox"  readonly value="<%= a.getTelefon() %>"/></td>
                </tr>
                <tr>
                    <td colspan="3">
                        <textarea class="text-area" style="width: 735px; height: 80px;" readonly /><%= a.getSadrzaj() %></textarea>
                    </td>
                </tr>
                <tr>
                    <td colspan="3"> 
                        <button class="button-brisi">Brisi</button>
                    </td>
                </tr>
            </table>
            </form>
        </div>
        <% } %>

        <div class="back">
            <a href="index.jsp">X</a>
        </div>
    </body>
</html>
