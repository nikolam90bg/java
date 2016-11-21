package dodaj;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nikola90
 */
public class DodajHamburger extends HttpServlet {

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String poruka = "";
        String sifra = request.getParameter("sifra");
        String naziv = request.getParameter("naziv");
        String slika = request.getParameter("slika");
        String opis = request.getParameter("opis");
        String cenas = request.getParameter("cena");

        if (sifra != null && sifra.length() > 0 && naziv != null && naziv.length() > 0 && slika != null && slika.length() > 0 && opis != null && opis.length() > 0 && cenas != null && cenas.length() > 0) {

            try {
                float cena = Float.parseFloat(cenas);

                Connection con = null;
                PreparedStatement ps = null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");
                    String upit = "insert into hamburger(sifra, naziv, slika, opis, cena)"
                            + "values(?,?,?,?,?)";
                    ps = con.prepareStatement(upit);

                    ps.setString(1, sifra);
                    ps.setString(2, naziv);
                    ps.setString(3, "images/burger/" + slika);
                    ps.setString(4, opis);
                    ps.setFloat(5, cena);

                    int uspesno = 0;
                    uspesno = ps.executeUpdate();

                    if (uspesno > 0) {
                        response.sendRedirect("ListaHamburgera");
                    }

                } 
                catch (Exception e) {
                    poruka = "Sifra vec postoji, morate uneti drugi!";
                    request.setAttribute("poruka", poruka);
                    RequestDispatcher rd = request.getRequestDispatcher("dodajHamburger.jsp");
                    rd.forward(request, response);
                }
            } 
            catch (NumberFormatException e) {
                poruka = "Greska prilikom unosa cene!";
                request.setAttribute("poruka", poruka);
                RequestDispatcher rd = request.getRequestDispatcher("dodajHamburger.jsp");
                rd.forward(request, response);
            }

        } else {
            poruka = "Nisu popunjena sva polja!";
            request.setAttribute("poruka", poruka);
            RequestDispatcher rd = request.getRequestDispatcher("dodajHamburger.jsp");
            rd.forward(request, response);
        }
      
    }

}