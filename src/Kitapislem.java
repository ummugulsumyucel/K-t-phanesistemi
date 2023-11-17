//Bu sınıfta kitabın adı, yazarın adı ve kitabın ödünç alınıp alınmama durumu tutulmaktadır.//
public class Kitapislem {

    private String kitapAdi;
    private String yazar;
    private boolean oduncAlindi;

    public Kitapislem(String kitapAdi, String yazar) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        this.oduncAlindi = false;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public String getYazar() {
        return yazar;
    }

    public boolean isOduncAlindi() {
        return oduncAlindi;
    }

    public void oduncAl() {
        this.oduncAlindi = true;
    }

    public void iadeEt() {
        this.oduncAlindi = false;
    }

}
