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
public class BrisiKorpu extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      
        String uspelo=request.getParameter("uspelo");
        if(uspelo.equals("1")){
        
        Connection con = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");
            String upit = "delete  from korpa";
            ps = con.prepareStatement(upit);
            

            int uspesno = 0;
            uspesno = ps.executeUpdate();

            if (uspesno > 0) {
                
                response.sendRedirect("index.jsp");
            }
             else{
          response.sendRedirect("index.jsp");  
        }
          
            
        
        } 
        catch (Exception e) {
            
            
            
        }}
         
       
    }}

