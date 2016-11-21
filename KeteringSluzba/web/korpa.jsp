<%-- 
    Document   : korpa
    Created on : Feb 14, 2016, 1:58:08 PM
    Author     : Nikola90
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="beans.ProizvodKorpa"%>
<%@page import="beans.Osoba"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="images/icons/icon.jpg">
        <link rel="stylesheet" type="text/css"  href="css/style.css">
       
      
        <title>.::Korpa::.</title>
    </head>
    <body>
        <div class="back">
            <a href="ListaPasta">X</a>
        </div>
        
        <div id="conteiner">
           
            <% ArrayList<ProizvodKorpa> lp = (ArrayList<ProizvodKorpa>) request.getAttribute("korpa"); %>
            <% for (ProizvodKorpa a : lp) { %>
        
           
            <div class="product2">
                <table class="table">
                    <tr>
                        <td class="deo0" style="padding-top: 12px">
                            <img src="<%= a.getSlika()%>" alt="logo" height="180" width="175" />
                        </td>
                        <td class="deo1">
                            <table class="teble">
                                <tr>
                                    <td class="deo2"><%= a.getNaziv()%></td>
                                </tr>
                                <tr>
                                    <td class="deo3"><%= a.getOpis()%></td>
                                </tr>
                                
                                <tr>
                                    <td class="deo4"><%= a.getCena()%></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                
                  
                    <tr>
                        <td>
                            <a href="IzbaciPastu?sifra=<%= a.getSifra()%>"><input type="button" class="button3" value="Izbaci"/></a>
                            <b>Kolicina: </b><input type="text" value="<%= a.getKolicina() %>"  class="textbox" style="width:95px;" readonly/>
                            
                        </td>
                    </tr>
                </table>
                        

        
            </div>
            <% }%> 
           
           
            
           <div class="korpa-bar">
            <% java.util.Date date = new java.util.Date();
            SimpleDateFormat dan = new SimpleDateFormat ("dd.MM.yyyy.");
            SimpleDateFormat vreme  = new SimpleDateFormat("hh:mm");
            %>
            <form action="Naruci" method="post">
                <table>
                    <tr>
                        <td><input type="text" class="textbox" value="${osoba.getKorisnicko_ime()}" name="korisnicko_ime" hidden /></td>
                        
                    </tr>
                    <tr>
                        <td class="red">Ime i prezime:</td>
                        <td><input type="text" class="textbox" value="${osoba.getIme()} ${osoba.getPrezime()}" name="ime_prezime" readonly /></td>
                        
                   
                        <td class="red">Na adresu:</td>
                        <td><input type="text" class="textbox" value="${osoba.getAdresa()}" name="adresa" readonly /></td>
                       
                    </tr>
                    <tr>
                        <td class="red">Datum:</td>
                        <td><input type="text" class="textbox" value="<%= dan.format(date) %>" name="datum" readonly /></td>
                        
                        
                   
                        <td class="red">Vreme:</td>
                        <td><input type="text" class="textbox" value="<%= vreme.format(date) %>" name="vreme" readonly /></td>
                        
                        
                    </tr>
                    <% String suma = (String) request.getAttribute("suma");
                    float s = Float.parseFloat(suma);
                    %>
                    <tr>
                        <td class="red">Ukupna cena:</td>
                        <td><input type="text" class="textbox" value="<%= s %>" name="cena" readonly/></td>
                        <td class="red">Vreme isporuke:</td>
                        <td><input type="text" class="textbox" value="45 minuta"  readonly /></td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            <input type="submit" class="button2" value="Naruci" onClick="alert('Uspesno ste izvrsili narudzbinu!')"/>
                        </td>
                       
                    </tr>
                </table>
           </form>
            </div>
        </div>
                        
            <div id="login">
            <% 
                HttpSession sesija = request.getSession();
                Osoba osoba = (Osoba) sesija.getAttribute("osoba");
                if(osoba!=null){ %>
              Dobrodosli:${osoba.getKorisnicko_ime()}<br/>
              <a href="profil.jsp">Profil</a><br/>
              <a href="Logout">Izloguj se</a>
            <% } else { %>        
            <a href="prijava.jsp">Prijavi se</a><br/>
            <a href="registracija.jsp">Registracija</a>
            <% } %> 
        </div>
        
            
      
    </body>
</html>
