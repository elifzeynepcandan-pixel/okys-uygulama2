import java.time.LocalDate;

public class OduncKaydi {
    private int islemNo;
    private LocalDate oduncTarihi;
    private LocalDate sonTeslimTarihi;
    private LocalDate teslimTarihi; // teslim edilmediyse null

    // Tam olarak bir Üye ve bir KitapKopyasi ile ilişkili
    private Uye uye;
    private KitapKopyasi kitapKopyasi;

    public OduncKaydi(int islemNo, Uye uye, KitapKopyasi kopya, int gunSayisi) {
        this.islemNo = islemNo;
        this.uye = uye;
        this.kitapKopyasi = kopya;
        this.oduncTarihi = LocalDate.now();
        this.sonTeslimTarihi = oduncTarihi.plusDays(gunSayisi);

        // İlişkiyi iki yönlü kur
        uye.oduncKaydiEkle(this);
        kopya.oduncKaydiEkle(this);
    }

    public void teslimEt() {
        this.teslimTarihi = LocalDate.now();
    }

    public void sureUzat(int gun) {
        this.sonTeslimTarihi = sonTeslimTarihi.plusDays(gun);
    }

    public String bilgi() {
        return "İşlem No: " + islemNo
                + " | Üye: " + uye.getAd()
                + " | Kitap: " + kitapKopyasi.getKitap().getBaslik()
                + " | Barkod: " + kitapKopyasi.getBarkod()
                + " | Ödünç: " + oduncTarihi
                + " | Son teslim: " + sonTeslimTarihi
                + " | Teslim: " + (teslimTarihi == null ? "henüz teslim edilmedi" : teslimTarihi);
    }

    public int getIslemNo() { return islemNo; }
    public Uye getUye() { return uye; }
    public KitapKopyasi getKitapKopyasi() { return kitapKopyasi; }
}