package korpa;

import beans.ProizvodKorpa;
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

public class Korpa extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<ProizvodKorpa> lp = new ArrayList<ProizvodKorpa>();
        String suma = "0";

        String poruka = "";

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");
            st = con.createStatement();
            String upit = "SELECT sifra,naziv,slika,opis,kolicina,cena,(select sum(cena) from korpa) as suma from korpa ORDER by sifra,naziv,slika,opis,kolicina,cena ";
            rs = st.executeQuery(upit);

            if (!rs.first()) {

                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);

            } else {

                do {
                    String sifra = rs.getString("sifra");
                    String naziv = rs.getString("naziv");
                    String slika = rs.getString("slika");
                    String opis = rs.getString("opis");
                    String cenaS = rs.getString("cena");
                    String kolicinas = rs.getString("kolicina");
                    int kolicina = Integer.parseInt(kolicinas);
                    float cena = Float.parseFloat(cenaS);
                    suma = rs.getString("suma");

                    request.setAttribute("suma", suma);
                    lp.add(new ProizvodKorpa(sifra, naziv, slika, opis, kolicina, cena));

                } while (rs.next());

                request.setAttribute("korpa", lp);
                RequestDispatcher rd = request.getRequestDispatcher("korpa.jsp");
                rd.forward(request, response);
            }

        } catch (Exception e) {

        }

    }

}
