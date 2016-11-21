package servleti;

import beans.Proizvod;
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


public class ListaPica extends HttpServlet {

 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Proizvod> lp = new ArrayList<Proizvod>();
        
        String broj="0";
    

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");
            st = con.createStatement();
            String upit = "SELECT sifra,naziv,slika,opis,cena,(select count(*) from korpa) as br from pica ORDER by sifra,naziv,slika,opis,cena";
            rs = st.executeQuery(upit);

            while (rs.next()) {

                String sifra = rs.getString("sifra");
                String naziv = rs.getString("naziv");
                String slika = rs.getString("slika");
                String opis = rs.getString("opis");
                
                String cenaS = rs.getString("cena");
                broj = rs.getString("br");
                

                request.setAttribute("broj", broj);

                float cena = Float.parseFloat(cenaS);

                lp.add(new Proizvod(sifra, naziv, slika, opis, cena));
            }

            request.setAttribute("listaPica", lp);
            RequestDispatcher rd = request.getRequestDispatcher("pica.jsp");
            rd.forward(request, response);

        } catch (Exception e) {

        }
      
        
    }

}