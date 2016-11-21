package servleti;

import beans.Narudzbenica;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NarClan extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
        String k_ime = request.getParameter("k_ime");
        
        ArrayList<Narudzbenica> lp = new ArrayList<Narudzbenica>();
        
         
        
    

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
       
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");
            st = con.createStatement();
            String upit = "SELECT korisnicko_ime, ime_prezime, adresa, datum, vreme, cena from narudzbenica where korisnicko_ime='" + k_ime + "' ";
            rs = st.executeQuery(upit);
            
         
           

            while (rs.next()) {

                String korisnicko_ime = rs.getString("korisnicko_ime");
                String ime_prezime = rs.getString("ime_prezime");
                String adresa = rs.getString("adresa");
                String datum = rs.getString("datum");
                String vreme = rs.getString("vreme");
                
                String cenaS = rs.getString("cena");
                float cena = Float.parseFloat(cenaS);

       
            
                lp.add(new Narudzbenica(korisnicko_ime,ime_prezime, adresa, datum, vreme, cena));
            }

            request.setAttribute("narudzbenica", lp);
                         RequestDispatcher rd = request.getRequestDispatcher("narudzbenica.jsp");
         rd.forward(request, response);
           

        } catch (Exception e) {

        }

        
    }}

  