package Practice_3;

//Aşağıdaki Telefon sınıfını tamamlayarak bir nesne oluşturun ve özelliklerini ekrana yazdırın. Yapılacak Adımlar:
// 1. Telefon sınıfının marka ve fiyat özelliklerine "Samsung" ve 15000.5 değerlerini atayın.
// 2. Bunları ekrana yazdırın.

public class Telefon {
    String marka = "Samsung";
    double fiyat = 15000.5;
}


class Main {
    public static void main(String[] args) {
        Telefon telefon = new Telefon();
        System.out.println(telefon.marka);
        System.out.println(telefon.fiyat);
    }

}