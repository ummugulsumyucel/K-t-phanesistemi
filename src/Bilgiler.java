// Bu sınıfta üyelerin ve görevlilerin ad-soyad bilgileri tutulacağı için kalıtım yolu kullanılmıştır.

public class Bilgiler {
    private String adSoyad;

    public Bilgiler(String adSoyad){
        this.adSoyad=adSoyad;

    }

    public String getAdSoyad() {
        return adSoyad;
    }

}
