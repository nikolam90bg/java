package beans;

/**
 *
 * @author Nikola90
 */
public class Osoba {
    
    private String korisnicko_ime="";
    private String lozinka="";
    private String slika="";
    private String ime="";
    private String prezime="";
    private String adresa="";
    private String telefon="";
    private String email="";
    
    
    public Osoba(){}
    
    public Osoba(String korisnicko_ime,String slika, String ime, String prezime){
        this.korisnicko_ime=korisnicko_ime;
        this.slika=slika;
        this.ime=ime;
        this.prezime=prezime;
    }

    public String getKorisnicko_ime() {
        return korisnicko_ime;
    }

    public void setKorisnicko_ime(String korisnicko_ime) {
        this.korisnicko_ime = korisnicko_ime;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }
    
        public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }
    
    

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
