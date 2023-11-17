//Bu sınıfta her bir üyenin adı soyadı ve her bir üyeye özel olarak verilen üye numarası tutulmaktadır.//
//Bilgiler sınıfı Extend edilip ad soyad bilgileri oradan çekilmiştir.//
public class Uyeislem extends Bilgiler {

    private int uyeNumarasi;

    public Uyeislem(String adSoyad, int uyeNumarasi) {
        super(adSoyad);
        this.uyeNumarasi = uyeNumarasi;
    }


    public int getUyeNumarasi() {
        return uyeNumarasi;
    }
}
