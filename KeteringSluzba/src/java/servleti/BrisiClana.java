package servleti;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nikola90
 */
public class BrisiClana extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String ime = request.getParameter("ime");
       
        Connection con = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");
            String upit = "delete from dosije where korisnicko_ime = '" + ime + "'";
            ps = con.prepareStatement(upit);

            int uspesno = 0;
            uspesno = ps.executeUpdate();

            if (uspesno > 0) {

                response.sendRedirect("Clanovi");
            }

        } catch (Exception e) {
        }

       
    }

  
}