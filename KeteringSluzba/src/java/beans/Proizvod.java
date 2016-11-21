package beans;

/**
 *
 * @author Nikola90
 */
public class Proizvod {
    
    private String sifra="";
    private String naziv="";
    private String slika="";
    private String opis="";
    private float cena;
    
    public Proizvod(){}
    
    public Proizvod(String sifra, String naziv, String slika, String opis, float cena){
        this.sifra = sifra;
        this.naziv = naziv;
        this.slika = slika;
        this.opis = opis;
        this.cena = cena;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

   

  
    
}
