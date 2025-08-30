package Practice_3;


//Aşağıda Kitap sınıfı tanımlanmıştır. Constructor chaining kullanarak üç farklı constructor tanımlayın. Yapılacak Adımlar:
// 1. Kitap sınıfında üç farklı constructor tanımlayın:
// a) Parametresiz constructor, varsayılan olarak "Bilinmeyen" isim ve yazar ile 0 sayfa sayısını ayarlasın.
// b) İsim ve yazar parametresi alan bir constructor tanımlayın ve sayfa sayısını varsayılan olarak 0 yapın.
// c) İsim, yazar ve sayfa sayısını parametre olarak alan bir constructor tanımlayın.
// 2. Constructor chaining kullanarak nesne oluşturun:
// a) "Hayvan Çiftliği", "George Orwell", 150 değerlerini üç parametreli constructor'a gönderin.
// b) Nesnenin isim, yazar ve sayfa sayısı bilgilerini ekrana yazdırın.

public class Kitap {
    String isim;
    String yazar;
    int sayfaSayisi;

    public Kitap(){
        this.isim = "Bilinmeyen";
        this.yazar = "Bilinmeyen";
        this.sayfaSayisi = 0;
    }

    public Kitap(String isim, String yazar){
        this.isim = isim;
        this.yazar = yazar;
        this.sayfaSayisi = 0;
    }

    public Kitap(String isim, String yazar, int sayfaSayisi){
        this.isim = isim;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
    }
}


public class Main {
    public static void main(String[] args) {
        Kitap kitap = new Kitap("Hayvan Çiftliği", "George Orwell", 150);
        System.out.println(kitap.isim);
        System.out.println(kitap.yazar);
        System.out.println(kitap.sayfaSayisi);
    }
}
