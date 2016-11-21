package servleti;

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
public class Registracija extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String poruka = "";
        String korisnicko_ime = request.getParameter("korisnicko_ime");
        String lozinka = request.getParameter("lozinka");
        String slika = request.getParameter("slika");
        String ime = request.getParameter("ime");
        String prezime = request.getParameter("prezime");
        String adresa = request.getParameter("adresa");
        String telefon = request.getParameter("telefon");
        String mail = request.getParameter("mail");

        if (korisnicko_ime != null && korisnicko_ime.length() > 0 && lozinka != null && lozinka.length() > 0 && ime != null && ime.length() > 0 && prezime != null && prezime.length() > 0 && adresa != null && adresa.length() > 0 && telefon != null && telefon.length() > 0 && mail != null && mail.length() > 0) {

            Connection con = null;
            PreparedStatement ps = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");
                String upit = "insert into dosije(korisnicko_ime, lozinka, slika, ime, prezime, adresa, telefon, mail)"
                        + "values(?,?,?,?,?,?,?,?)";
                ps = con.prepareStatement(upit);

                ps.setString(1, korisnicko_ime);
                ps.setString(2, lozinka);
                ps.setString(3, "images/profil/" + slika);
                ps.setString(4, ime);
                ps.setString(5, prezime);
                ps.setString(6, adresa);
                ps.setString(7, telefon);
                ps.setString(8, mail);

                int uspesno = 0;
                uspesno = ps.executeUpdate();

                if (uspesno > 0) {
                    poruka = "Uspesno ste se registrovali!";
                    request.setAttribute("poruka", poruka);
                    RequestDispatcher rd = request.getRequestDispatcher("prijava.jsp");
                    rd.forward(request, response);

                }

            } catch (Exception e) {
                poruka = "Korisnicko ime vec postoji!";
                request.setAttribute("poruka", poruka);
                RequestDispatcher rd = request.getRequestDispatcher("registracija.jsp");
                rd.forward(request, response);

            }

        } else {
            poruka = "Nisu popunjena sva polja!";
            request.setAttribute("poruka", poruka);
            RequestDispatcher rd = request.getRequestDispatcher("registracija.jsp");
            rd.forward(request, response);
        }

    }
}
