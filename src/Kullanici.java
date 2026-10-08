public class Kullanici {
    private int id;
    private String ad;
    private String eposta;
    private String sifre;

    public Kullanici(int id, String ad, String eposta, String sifre) {
        this.id = id;
        this.ad = ad;
        this.eposta = eposta;
        this.sifre = sifre;
    }

    public int getId() { return id; }
    public String getAd() { return ad; }
    public String getEposta() { return eposta; }

    public boolean girisYap(String eposta, String sifre) {
        return this.eposta.equals(eposta) && this.sifre.equals(sifre);
    }

    public String bilgi() {
        return "ID: " + id + " Ad: " + ad + " E-posta: " + eposta;
    }
}