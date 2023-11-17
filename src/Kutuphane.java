//Kütüphane sınıfı, kitapların ve üyelerin yönetildiği ana işlevsel bölümdür.//
// Bu sınıfta kitap ekleme ve silme, üye ekleme ve silme gibi temel işlemleri gerçekleştirilir.//
// Ayrıca kitap ödünç verme, iade alma ve ödünçteki kitapları takip etme gibi işlevleri de sağlar.//
// Bu şekilde, kütüphane sistemini genel olarak kontrol eder ve işlemleri yönetir.//
import java.util.ArrayList;
public class Kutuphane {
    private ArrayList<Kitapislem> kitaplar = new ArrayList<>();
    private ArrayList<Uyeislem> uyeler = new ArrayList<>();
    private ArrayList<Gorevliislem> gorevliler = new ArrayList<>();

    public void kitapEkle(String kitapAdi, String yazar) {
        Kitapislem yeniKitap = new Kitapislem(kitapAdi, yazar);
        kitaplar.add(yeniKitap);
        System.out.println("Kitap eklenmiştir: " + yeniKitap.getKitapAdi());
    }

    public void kitapCikar(String kitapAdi) {
        for (Kitapislem kitap : kitaplar) {
            if (kitap.getKitapAdi().equals(kitapAdi)) {
                kitaplar.remove(kitap);
                System.out.println("Kitap çıkarılmıştır: " + kitapAdi);
                return;
            }
        }
        System.out.println("Kitap bulunamadı: " + kitapAdi);
    }

    public void uyeEkle(String adSoyad, int uyeNumarasi) {
        Uyeislem yeniUye = new Uyeislem(adSoyad, uyeNumarasi);
        uyeler.add(yeniUye);
        System.out.println("Üye eklenmiştir: " + yeniUye.getAdSoyad());
    }

    public void uyeCikar(int uyeNumarasi) {
        for (Uyeislem uye : uyeler) {
            if (uye.getUyeNumarasi() == uye.getUyeNumarasi()) {
                uyeler.remove(uye);
                System.out.println("Üye çıkarılmıştır: " + uye.getAdSoyad());
                return;
            }
        }
        System.out.println("Üye bulunamadı: " + uyeNumarasi);
    }

    public void gorevliEkle(String adSoyad) {
        Gorevliislem yeniGorevli = new Gorevliislem(adSoyad);
        gorevliler.add(yeniGorevli);
        System.out.println("Görevli eklenmiştir: " + yeniGorevli.getAdSoyad());
    }

    public void gorevliCikar(String adSoyad) {
        for (Gorevliislem gorevli : gorevliler) {
            if (gorevli.getAdSoyad().equals(adSoyad)) {
                gorevliler.remove(gorevli);
                System.out.println("Görevli çıkarılmıştır: " + adSoyad);
                return;
            }
        }
        System.out.println("Görevli bulunamadı: " + adSoyad);
    }

    public void oduncVer(String kitapAdi, int uyeNumarasi) {
        Kitapislem oduncKitap = null;
        Uyeislem uye = null;

        for (Kitapislem kitap : kitaplar) {
            if (kitap.getKitapAdi().equals(kitapAdi) && !kitap.isOduncAlindi()) {
                oduncKitap = kitap;
                break;
            }
        }

        for (Uyeislem u : uyeler) {
            if (u.getUyeNumarasi() == uyeNumarasi) {
                uye = u;
                break;
            }
        }

        if (oduncKitap != null && uye != null) {
            oduncKitap.oduncAl();
            System.out.println("Ödünç verilen kitap: " + oduncKitap.getKitapAdi() +
                    " - Üye adı: " + uye.getAdSoyad());
        } else {
            System.out.println("Kitap veya üye bulunamadı, veya kitap ödünç alınmış.");
        }
    }

    public void oduncIade(String kitapAdi, int uyeNumarasi) {
        Kitapislem oduncKitap = null;
        Uyeislem uye = null;

        for (Kitapislem kitap : kitaplar) {
            if (kitap.getKitapAdi().equals(kitapAdi) && kitap.isOduncAlindi()) {
                oduncKitap = kitap;
                break;
            }
        }

        for (Uyeislem u : uyeler) {
            if (u.getUyeNumarasi() == uyeNumarasi) {
                uye = u;
                break;
            }
        }

        if (oduncKitap != null && uye != null) {
            oduncKitap.iadeEt();
            System.out.println("Kitap iade edilmiştir: " + oduncKitap.getKitapAdi() +
                    " - Üye adı: " + uye.getAdSoyad());
        } else {
            System.out.println("Kitap veya üye bulunamadı, veya kitap zaten iade edilmiş.");
        }
    }

    public void oduncAlinanKitaplariGoster() {
        System.out.println("Ödünç alınan kitaplar:");

        for (Kitapislem kitap : kitaplar) {
            if (kitap.isOduncAlindi()) {
                System.out.println("Kitap Adı: " + kitap.getKitapAdi() +
                        " - Yazar: " + kitap.getYazar());
            }
        }
    }
}
