/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package korpa;

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
public class IzbaciPastu extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String sifra = request.getParameter("sifra");
        

        Connection con = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");
            String upit = "delete from korpa where sifra = '" + sifra + "'";
            ps = con.prepareStatement(upit);

            int uspesno = 0;
            uspesno = ps.executeUpdate();

            if (uspesno > 0) {

                response.sendRedirect("Korpa");
            }
            else{
                RequestDispatcher rd = request.getRequestDispatcher("korpa.jsp");
            rd.forward(request, response);
            }
            

        } catch (Exception e) {
            
        }
    }
      
    }

 