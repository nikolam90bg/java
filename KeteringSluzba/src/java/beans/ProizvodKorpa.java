
package beans;


public class ProizvodKorpa {
    
    private String sifra="";
    private String naziv="";
    private String slika="";
    private String opis="";
    private int kolicina=1;
    private float cena;
    
    public ProizvodKorpa(){
        
    }
    public ProizvodKorpa(String sifra, String naziv, String slika, String opis, int kolicina, float cena){
        this.sifra=sifra;
        this.naziv=naziv;
        this.slika=slika;
        this.opis=opis;
        this.kolicina=kolicina;
        this.cena=cena;
        
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

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }
    
}
