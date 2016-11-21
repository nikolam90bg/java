
package korpa;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nikola90
 */
public class KorpaPica extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String sif = request.getParameter("sifra");
        String kolicinaS = request.getParameter("kolicina");
        
        String poruka = "";
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");
            st = con.createStatement();
            String upit = "select * from pica where sifra='" + sif + "'";
            rs = st.executeQuery(upit);

            if (rs.next()) {
                String sifra = rs.getString("sifra");
                String naziv = rs.getString("naziv");
                String slika = rs.getString("slika");
                String opis = rs.getString("opis");
                float cena = rs.getFloat("cena");

                con.close();
                rs.close();

                try {
                    PreparedStatement ps = null;
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");
                    upit = "insert into korpa(sifra, naziv, slika, opis, kolicina, cena)"
                            + "values(?,?,?,?,?,?)";
                    ps = con.prepareStatement(upit);
                    
                    int kolicina = Integer.parseInt(kolicinaS);
                    float nova_cena = (float)kolicina * cena;
                    
                    ps.setString(1, sifra);
                    ps.setString(2, naziv);
                    ps.setString(3, slika);
                    ps.setString(4, opis);
                    ps.setInt(5,kolicina);
                    ps.setFloat(6, nova_cena);

                    int uspesno = 0;
                    uspesno = ps.executeUpdate();

                    if (uspesno > 0) {

                        response.sendRedirect("ListaPica");

                    }

                } catch (Exception e) {

                    response.sendRedirect("ListaPica");

                }
            }

        } catch (Exception e) {
        }

       
    }

}