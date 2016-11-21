package servleti;

import beans.Poruka;
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
public class Reklamacije extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Poruka> la = new ArrayList<Poruka>();

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");
            st = con.createStatement();
            String upit = "select * from poruka";
            rs = st.executeQuery(upit);
            
            
            
            if (!rs.first()) {

                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);

            } else {
            
            
            
            do {

                int id = Integer.parseInt(rs.getString("id"));
                String ime_prezime = rs.getString("ime_prezime");
                String mail = rs.getString("mail");
                String telefon = rs.getString("telefon");
                String sadrzaj = rs.getString("sadrzaj");

                la.add(new Poruka(id, ime_prezime, mail, telefon, sadrzaj));
            }while (rs.next());

            request.setAttribute("lista", la);
            RequestDispatcher rd = request.getRequestDispatcher("reklamacije.jsp");
            rd.forward(request, response);
            }
        }
         catch (Exception e) {}
        

    
}}
