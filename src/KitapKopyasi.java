import java.util.ArrayList;
import java.util.List;

public class KitapKopyasi {
    private String barkod;

    private Kitap kitap;

    private List<OduncKaydi> oduncListesi = new ArrayList<>();

    public KitapKopyasi(String barkod, Kitap kitap) {
        this.barkod = barkod;
        this.kitap = kitap;
    }

    public void oduncKaydiEkle(OduncKaydi kayit) {
        oduncListesi.add(kayit);
    }

    public String getBarkod() { return barkod; }
    public Kitap getKitap() { return kitap; }
    public List<OduncKaydi> getOduncListesi() { return oduncListesi; }
}