package beans;

/**
 *
 * @author Nikola90
 */
public class Poruka {
    private int id;
    private String ime_prezime="";
    private String mail="";
    private String telefon="";
    private String sadrzaj="";
    
    public Poruka(){}
    
    public Poruka(int id, String ime_prezime, String mail, String telefon, String sadrzaj){
        this.id=id;
        this.ime_prezime=ime_prezime;
        this.mail=mail;
        this.telefon=telefon;
        this.sadrzaj=sadrzaj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme_prezime() {
        return ime_prezime;
    }

    public void setIme_prezime(String ime_prezime) {
        this.ime_prezime = ime_prezime;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getSadrzaj() {
        return sadrzaj;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }
    
}
