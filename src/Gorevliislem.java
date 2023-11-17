//Bu sınıfta görevlilerin adı ve sayısı tutulmaktadır.//
// Görevli sayısına başlangıçta 0 değeri verilmiştir ve her bir görevli girildiğinde görevli sayısı artmaktadır.//
//Bilgiler sınıfı Extend edilip ad soyad bilgileri oradan çekilmiştir.//
public class Gorevliislem extends Bilgiler {

    private static int gorevliSayisi = 0;

    public Gorevliislem(String adSoyad) {
        super(adSoyad);
        gorevliSayisi++;
    }

    public static int getGorevliSayisi() {
        return gorevliSayisi;
    }
}