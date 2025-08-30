package Practice_3;

//Aşağıda Bilgisayar sınıfı tanımlanmıştır.
// Parametresiz bir yapıcı metot (constructor) ekleyiniz ve nesneyi oluşturup ekrana yazdırınız. Yapılacak Adımlar:
// 1. Bilgisayar sınıfına bir parametresiz constructor ekleyin.
// 2. Constructor içinde marka olarak "Lenovo", fiyat olarak 7500.50 değerlerini atayın.
// 3. Nesneyi oluşturup özelliklerini ekrana yazdırın.

public class Bilgisayar {
    String marka;
    double fiyat;

    public Bilgisayar(){
        this.marka = "Lenovo";
        this.fiyat = 7500.50;
    }
}


public class Main {
    public static void main(String[] args) {
        Bilgisayar bilgisayar = new Bilgisayar();
        System.out.println(bilgisayar.marka);
        System.out.println(bilgisayar.fiyat);
    }
}
