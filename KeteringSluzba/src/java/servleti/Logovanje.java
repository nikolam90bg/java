package servleti;

import beans.Osoba;
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
public class Logovanje extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesija = request.getSession();
        String poruka = "";
        String korisnicko_ime = request.getParameter("korisnicko_ime");
        String lozinka = request.getParameter("lozinka");

        if (korisnicko_ime != null && korisnicko_ime.length() > 0 && lozinka != null && lozinka.length() > 0) {
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");
                st = con.createStatement();
                String upit = "select * from dosije where korisnicko_ime='" + korisnicko_ime + "' and lozinka='" + lozinka + "'";
                rs = st.executeQuery(upit);
                if (rs.next()) {
                    String slika = rs.getString("slika");
                    String ime = rs.getString("ime");
                    String prezime = rs.getString("prezime");
                    String adresa = rs.getString("adresa");
                    String telefon = rs.getString("telefon");
                    String mail = rs.getString("mail");
                    Osoba osoba = new Osoba();
                    osoba.setKorisnicko_ime(korisnicko_ime);
                    osoba.setLozinka(lozinka);
                    osoba.setSlika(slika);
                    osoba.setIme(ime);
                    osoba.setPrezime(prezime);
                    osoba.setAdresa(adresa);
                    osoba.setTelefon(telefon);
                    osoba.setEmail(mail);

                    sesija.setAttribute("osoba", osoba);
                    RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                    rd.forward(request, response);

                } else {
                    poruka = "Pogresno korisnicko ime ili lozinka!";
                    request.setAttribute("poruka", poruka);
                    RequestDispatcher rd = request.getRequestDispatcher("prijava.jsp");
                    rd.forward(request, response);

                }

            } catch (Exception e) {
                poruka = "Doslo je do greske sa konekcijom!";
                request.setAttribute("poruka", poruka);
                RequestDispatcher rd = request.getRequestDispatcher("prijava.jsp");
                rd.forward(request, response);
            }

        } else {
            poruka = "Morate popuniti sva polja!";
            request.setAttribute("poruka", poruka);
            RequestDispatcher rd = request.getRequestDispatcher("prijava.jsp");
            rd.forward(request, response);

        }

    }
}
