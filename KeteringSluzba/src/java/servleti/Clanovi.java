package servleti;

import beans.Osoba;
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

/**
 *
 * @author Nikola90
 */
public class Clanovi extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ArrayList<Osoba> la = new ArrayList<Osoba>();

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");
            st = con.createStatement();
            String upit = "select * from dosije where korisnicko_ime!='admin'";
            rs = st.executeQuery(upit);
            
            
       while (rs.next()){

                String korisnicko_ime = rs.getString("korisnicko_ime");
                String slika = rs.getString("slika");
                String ime = rs.getString("ime");
                String prezime = rs.getString("prezime");
               

                la.add(new beans.Osoba(korisnicko_ime,slika, ime, prezime));
            }

            request.setAttribute("listaClanova", la);
            RequestDispatcher rd = request.getRequestDispatcher("clanovi.jsp");
            rd.forward(request, response);
            }
        
         catch (Exception e) {}
        
        
        
        }
    }

   