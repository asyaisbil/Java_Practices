/*Bir HesapMakinesi sınıfı hem toplama işlemini yapıyor hem de sonuçları dosyaya yazıyor.
Bu tasarım Single Responsibility Principle (SRP) ihlaline neden olmaktadır.
Tasarımı SRP'ye uygun hale getiriniz.
Yapılacak Adımlar:
1. HesapMakinesi sınıfını yalnızca toplama işlemini yapacak şekilde düzenleyin.
2. DosyaIslemleri adında bir sınıf oluşturun.
3. DosyaIslemleri sınıfında sonucuDosyayaYaz(int sonuc) adında bir metot oluşturun. Bu metot aldığı sonucu ekrana yazdırsın.
4. Main sınıfında bir HesapMakinesi ve bir DosyaIslemleri nesnesi oluşturun.
5. topla methoduna 3 ve 5 parametrelerini vererek sonuc değişkenine atayın,
daha sonra DosyaIslemleri sınıfındaki metoda göndererek ekrana yazdırın.*/

public class HesapMakinesi {
    public int topla(int a, int b) {
        return a + b;
    }
}

public class DosyaIslemleri {
    public void sonucuDosyayaYaz(int sonuc) {
        System.out.println(sonuc);
    }
}

public class Main {
    public static void main(String[] args)() {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        DosyaIslemleri dosyaIslemleri = new DosyaIslemleri();
        int sonuc = hesapMakinesi.topla(3, 5);
        dosyaIslemleri.sonucuDosyayaYaz(sonuc);
    }

}