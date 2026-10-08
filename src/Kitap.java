import java.util.ArrayList;
import java.util.List;

public class Kitap {
    private String isbn;
    private String baslik;
    private String yazar;
    private int yayinYili;
    private String durum;

    private List<KitapKopyasi> fizikselKopyalar = new ArrayList<>();

    public Kitap(String isbn, String baslik, String yazar, int yayinYili, String durum) {
        this.isbn = isbn;
        this.baslik = baslik;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
        this.durum = durum;
    }

    public KitapKopyasi kopyaEkle(String barkod) {
        KitapKopyasi kopya = new KitapKopyasi(barkod, this);
        fizikselKopyalar.add(kopya);
        return kopya;
    }

    public String kitapBilgisi() {
        return "ADI: " + baslik + " YAZARI: " + yazar
                + " yayın yılı: " + yayinYili + " ISBN: " + isbn
                + " DURUM: " + durum + " KOPYA SAYISI: " + fizikselKopyalar.size();
    }

    public String getIsbn() { return isbn; }
    public String getBaslik() { return baslik; }
    public String getYazar() { return yazar; }
    public int getYayinYili() { return yayinYili; }
    public String getDurum() { return durum; }
    public void setDurum(String durum) { this.durum = durum; }
    public List<KitapKopyasi> getFizikselKopyalar() { return fizikselKopyalar; }
}

