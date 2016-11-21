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


public class Naruci extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String korisnicko_ime = request.getParameter("korisnicko_ime");
            String ime_prezime = request.getParameter("ime_prezime");
            String adresa = request.getParameter("adresa");
            String datum = request.getParameter("datum");
            String vreme = request.getParameter("vreme");
            String cenas = request.getParameter("cena");
            
            float cena = Float.parseFloat(cenas);
       
            
            Connection con = null;
            PreparedStatement ps = null;
            String upit="";
            try{
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");
                    upit = "insert into narudzbenica(korisnicko_ime, ime_prezime, adresa, datum, vreme, cena)"
                            + "values(?,?,?,?,?,?)";
                    ps = con.prepareStatement(upit);
                    
                    ps.setString(1, korisnicko_ime);
                    ps.setString(2, ime_prezime);
                    ps.setString(3, adresa);
                    ps.setString(4, datum);
                    ps.setString(5, vreme);
                    ps.setFloat(6, cena);

                    
                    int uspesno = 0;
                    uspesno = ps.executeUpdate();
                    
                    


                    if (uspesno > 0) {
                           response.sendRedirect("BrisiKorpu?uspelo=1");
                        
                    }
                    
                    
        }
            catch(Exception e){
            
            }
    }

} 