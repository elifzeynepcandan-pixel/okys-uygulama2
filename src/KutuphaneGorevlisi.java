public class KutuphaneGorevlisi extends Kullanici {

    public KutuphaneGorevlisi(int id, String ad, String eposta, String sifre) {
        super(id, ad, eposta, sifre);
    }

    public Kitap kitapEkle(String isbn, String baslik, String yazar, int yayinYili) {
        return new Kitap(isbn, baslik, yazar, yayinYili, "Ödünç Verilebilir");
    }
}