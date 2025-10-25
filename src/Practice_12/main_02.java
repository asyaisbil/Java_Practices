
/*Bir Personel sınıfı hem personelin bilgilerini tutuyor hem de maaş hesaplıyor.
Bu tasarım Single Responsibility Principle (SRP) ihlaline neden olmaktadır.
Tasarımı SRP'ye uygun hale getiriniz.
Yapılacak Adımlar:
1. Personel sınıfını yalnızca personel bilgilerini tutacak şekilde düzenleyin.
2. Maaş hesaplama işlemini gerçekleştirecek MaasHesaplama adında bir sınıf oluşturun.
3. MaasHesaplama sınıfında maasHesapla() adında bir metot oluşturun.
4. Main sınıfında Personel ve MaasHesaplama nesneleri oluşturun.
5. MaasHesaplama sınıfını kullanarak Ahmet, "Yazılım Geliştirici" için maaşı hesaplayın.
6. Çıktı şu şekilde olmalıdır: "Ahmet için maaş hesaplandı."*/

public class Personel {
    private String isim;
    private String pozisyon;


    public Personel(String isim, String pozisyon) {
        this.isim = isim;
        this.pozisyon = pozisyon;
    }

    public String getIsim() {
        return this.isim;
    }

    public String getPozisyon() {
        return this.pozisyon;
    }
}

public class MaasHesaplama {
    public void maasHesapla(Personel personel) {
        System.out.println(personel.getIsim() + " için maaş hesaplandı.");
    }
}

public class Main {
    public static void main(String[] args) {
        Personel personel = new Personel("Ahmet","Yazılım Geliştirici");
        MaasHesaplama maasHesaplama = new MaasHesaplama();
        maasHesaplama.maasHesapla(personel);
    }
}