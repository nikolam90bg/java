package beans;

public class Narudzbenica {
    
    private int id;
    private String korisnicko_ime="";
    private String ime_prezime="";
    private String adresa="";
    private String datum="";
    private String vreme="";
    private float cena;
    
    public Narudzbenica(){}
    
    public Narudzbenica(String korisnicko_ime, String ime_prezime, String adresa, String datum, String vreme, float cena){
        this.korisnicko_ime=korisnicko_ime;
        this.ime_prezime=ime_prezime;
        this.adresa=adresa;
        this.datum=datum;
        this.vreme=vreme;
        this.cena=cena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKorisnicko_ime() {
        return korisnicko_ime;
    }

    public void setKorisnicko_ime(String korisnicko_ime) {
        this.korisnicko_ime = korisnicko_ime;
    }

    public String getIme_prezime() {
        return ime_prezime;
    }

    public void setIme_prezime(String ime_prezime) {
        this.ime_prezime = ime_prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }
    
}
