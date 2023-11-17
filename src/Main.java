// Ümmügülsüm Yücel 1220505004 //
//Ayşe Koca 1220505043 //

//Kitapların ve Kütüphane Üyelerinin Yönetilmesine Olanak Sağlayacak Basit Bir Kütüphane Yönetim Sistemi//
//Bu kodda kütüphane yönetim sistemi modellenmiştir. //
// Kitap, üye ve kütüphane sınıflarıyla kitap eklemeyi, //
// ödünç verip iade etmeyi ve ödünçteki kitapları takip etmek sağlanmıştır.//
// Main sınıfı ise bu işlemleri örneklerle gerçekleştiriliyor : Kitap ve üye oluşturma, kitap ödünç verme, //
// ödünçteki kitapları görüntüleme gibi adımları gösteriyor //
public class Main {
    public static void main(String[] args) {

        Kutuphane kutuphane = new Kutuphane();


        // Kitap ekleme //
        kutuphane.kitapEkle("Tutunamayanlar", "Oğuz Atay");
        kutuphane.kitapEkle("Romeo ve Juliet", "Sheskpare");
        kutuphane.kitapEkle("Sefiller","Dostoyevski");
        kutuphane.kitapEkle("Stranç","Stefan zweig");
        kutuphane.kitapEkle("Çalıkuşu","Reşat Nuri Güntekin");
        kutuphane.kitapEkle("İnce Memed","Yaşar Kemal");
        kutuphane.kitapEkle("Gece Yarısı Kütüphanesi","Matt Heig");
        kutuphane.kitapEkle("Beyaz Zambaklar Ülkesinde","Grigori Petrov");


        // Görevli ekleme //
        kutuphane.gorevliEkle("Fatih Çelik");
        kutuphane.gorevliEkle("Altay Demir");
        kutuphane.gorevliEkle("Ali Koca");
        kutuphane.gorevliEkle("Zeynep Yücel");

        // Üye ekleme //
        kutuphane.uyeEkle("Gülsüm Yücel", 200);
        kutuphane.uyeEkle("Ayşe Koca", 201);
        kutuphane.uyeEkle("Can Bayındır",202);
        kutuphane.uyeEkle("Talha Aslan",203);

        // Ödünç kitap verme //
        kutuphane.oduncVer("Sefiller", 201);
        kutuphane.oduncVer("Tutunamayanlar",200);
        kutuphane.oduncVer("İnce Memed",202);

        // Ödünç alınan kitapları gösterme //
        kutuphane.oduncAlinanKitaplariGoster();

        kutuphane.oduncIade("İnce Memed",202);

        kutuphane.oduncAlinanKitaplariGoster();

        kutuphane.uyeCikar(202);

        kutuphane.gorevliCikar("Altay Demir");

        kutuphane.kitapCikar("Çalıkuşu");

    }

}