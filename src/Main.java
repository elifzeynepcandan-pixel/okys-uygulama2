public class Main {
    public static void main(String[] args) {
        
        Uye uye1 = new Uye(1, "Ayşe Yılmaz", "ayse@mail.com", "1234");
        KutuphaneGorevlisi gorevli = new KutuphaneGorevlisi(2, "Mehmet Demir", "mehmet@mail.com", "abcd");

        System.out.println(uye1.bilgi());
        System.out.println(gorevli.bilgi());
        System.out.println("Giriş başarılı mı? " + uye1.girisYap("ayse@mail.com", "1234"));

        Kitap kitap1 = gorevli.kitapEkle("978-605-1", "Nutuk", "Mustafa Kemal Atatürk", 1927);
        KitapKopyasi kopya1 = kitap1.kopyaEkle("BRK-001");
        KitapKopyasi kopya2 = kitap1.kopyaEkle("BRK-002");

        System.out.println(kitap1.kitapBilgisi());

        OduncKaydi kayit1 = new OduncKaydi(100, uye1, kopya1, 14);
        OduncKaydi kayit2 = new OduncKaydi(101, uye1, kopya2, 14);

        kayit1.sureUzat(7);

        System.out.println(kayit1.bilgi());
        System.out.println(kayit2.bilgi());

        System.out.println("\n" + uye1.getAd() + " üyesinin ödünç aldıkları:");
        for (OduncKaydi k : uye1.getOkudugumKitaplar()) {
            System.out.println(" - " + k.getKitapKopyasi().getKitap().getBaslik()
                    + " (" + k.getKitapKopyasi().getBarkod() + ")");
        }

        kayit1.teslimEt();
        System.out.println("\nTeslim sonrası: " + kayit1.bilgi());
    }
}