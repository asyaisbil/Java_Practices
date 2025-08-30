package Practice_3;

//Bir Kitap sınıfı verilmiştir. Bu sınıfın özelliklerini tamamlayarak bir nesne oluşturun ve ekrana yazdırın. Yapılacak Adımlar:
// 1. Kitap sınıfının ad ve sayfaSayisi özelliklerine "Java 101" ve 300 değerlerini atayın.
// 2. Bunları ekrana yazdırın.

public class Kitap {
    String ad = "Java 101";
    int sayfaSayisi = 300;
}


class Main {
    public static void main(String[] args) {
        Kitap kitap = new Kitap();
        System.out.println(kitap.ad);
        System.out.println(kitap.sayfaSayisi);
    }
}