package prikazi;

import beans.Proizvod;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nikola90
 */
public class PrikaziHamburger extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesija = request.getSession();
        String sifra = request.getParameter("sifra");

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");
            st = con.createStatement();
            String upit = "select * from hamburger where sifra='" + sifra + "'";
            rs = st.executeQuery(upit);

            if (rs.next()) {

                String naziv = rs.getString("naziv");
                String slika = rs.getString("slika");
                String opis = rs.getString("opis");
                float cena = rs.getFloat("cena");
                Proizvod proizvod = new Proizvod();

                proizvod.setSifra(sifra);
                proizvod.setNaziv(naziv);
                proizvod.setSlika(slika);
                proizvod.setOpis(opis);
                proizvod.setCena(cena);

                sesija.setAttribute("proizvod", proizvod);
                RequestDispatcher rd = request.getRequestDispatcher("izmeniHamburger.jsp");
                rd.forward(request, response);

            }

        } 
        catch (Exception e) {}
    }
       
    }

