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
public class Poruka extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String poruka = "";

        String ime_prezime = request.getParameter("ime_prezime");
        String mail = request.getParameter("mail");
        String telefon = request.getParameter("telefon");
        String sadrzaj = request.getParameter("sadrzaj");

        if (ime_prezime != null && ime_prezime.length() > 0 && mail != null && mail.length() > 0 && telefon != null && telefon.length() > 0 && sadrzaj != null && sadrzaj.length() > 0) {
            Connection con = null;
            PreparedStatement ps = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");
                String upit = "insert into poruka(ime_prezime, mail, telefon, sadrzaj)"
                        + "values(?,?,?,?)";
                ps = con.prepareStatement(upit);

                ps.setString(1, ime_prezime);
                ps.setString(2, mail);
                ps.setString(3, telefon);
                ps.setString(4, sadrzaj);

                int uspesno = 0;
                uspesno = ps.executeUpdate();

                if (uspesno > 0) {
                    poruka = "Uspesno ste poslali poruku!";
                    request.setAttribute("poruka", poruka);
                    RequestDispatcher rd = request.getRequestDispatcher("kontakt.jsp");
                    rd.forward(request, response);

                }

            } catch (Exception e) {
                poruka = "Doslo je do greske sa konekcioj!";
                request.setAttribute("poruka", poruka);
                RequestDispatcher rd = request.getRequestDispatcher("kontakt.jsp");
                rd.forward(request, response);

            }
        } else {
            poruka = "Nisu popunjena sva polja!";
            request.setAttribute("poruka", poruka);
            RequestDispatcher rd = request.getRequestDispatcher("kontakt.jsp");
            rd.forward(request, response);

        }
    }
}
