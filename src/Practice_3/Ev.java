package Practice_3;

//Bir Ev sınıfı tanımlanmıştır. Ev sınıfının özelliklerini kullanarak bir Ev nesnesi oluşturun ve özelliklerini ekrana yazdırın.
// Yapılacak Adımlar:
// 1. Ev sınıfının adres ve odaSayisi özelliklerine "İstanbul, Kadıköy" ve 3 değerlerini atayın.
// 2. Bunları ekrana yazdırın.

public class Ev {
    String adres = "İstanbul, Kadıköy";
    int odaSayisi = 3;
}


public class Main {
    public static void main(String[] args) {
        Ev ev = new Ev();
        System.out.println(ev.adres);
        System.out.println(ev.odaSayisi);
    }
}
