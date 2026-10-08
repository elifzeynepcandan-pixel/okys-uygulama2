import java.util.ArrayList;
import java.util.List;

public class Uye extends Kullanici {
    private List<OduncKaydi> okudugumKitaplar = new ArrayList<>();

    public Uye(int id, String ad, String eposta, String sifre) {
        super(id, ad, eposta, sifre);
    }

    public void oduncKaydiEkle(OduncKaydi kayit) {
        okudugumKitaplar.add(kayit);
    }

    public List<OduncKaydi> getOkudugumKitaplar() {
        return okudugumKitaplar;
    }
}