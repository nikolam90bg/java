package servleti;

import beans.Osoba;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nikola90
 */
public class Izmena extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sesija = request.getSession();
        Osoba osoba = (Osoba) sesija.getAttribute("osoba");

        String korisnicko_ime = osoba.getKorisnicko_ime();
        String poruka = "";

        String lozinka = request.getParameter("lozinka");
        String slika = request.getParameter("slika");
        String ime = request.getParameter("ime");
        String prezime = request.getParameter("prezime");
        String adresa = request.getParameter("adresa");
        String telefon = request.getParameter("telefon");
        String email = request.getParameter("email");

        if (lozinka != null && lozinka.length() > 0 && ime != null && ime.length() > 0 && prezime != null && prezime.length() > 0 && adresa != null && adresa.length() > 0 && telefon != null && telefon.length() > 0 && email != null && email.length() > 0) {

            Connection con = null;
            PreparedStatement ps = null;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");

                String upit = "update dosije set lozinka=?,slika=?, ime=?, prezime=?, adresa=?, telefon=?, mail=? where korisnicko_ime='" + korisnicko_ime + "'";
                ps = con.prepareStatement(upit);

                ps.setString(1, lozinka);
                ps.setString(2, "images/profil/" + slika);
                ps.setString(3, ime);
                ps.setString(4, prezime);
                ps.setString(5, adresa);
                ps.setString(6, telefon);
                ps.setString(7, email);

                int uspesno = 0;
                uspesno = ps.executeUpdate();

                if (uspesno > 0) {
                    osoba.setLozinka(lozinka);
                    osoba.setSlika("images/profil/" + slika);
                    osoba.setIme(ime);
                    osoba.setPrezime(prezime);
                    osoba.setAdresa(adresa);
                    osoba.setTelefon(telefon);
                    osoba.setEmail(email);

                    sesija.setAttribute("osoba", osoba);

                    poruka = "Uspesno ste izmenili podatke!";
                    request.setAttribute("poruka", poruka);
                    RequestDispatcher rd = request.getRequestDispatcher("profil.jsp");
                    rd.forward(request, response);

                }
            } catch (Exception e) {
            }

        } else {
            poruka = "Nisu popunjena sva polja!";
            request.setAttribute("poruka", poruka);
            RequestDispatcher rd = request.getRequestDispatcher("izmena.jsp");
            rd.forward(request, response);
        }

    }
}
