package Practice_4;

//Aşağıdaki Araba sınıfındaki static değişkene dışarıdan erişim sağlayın. Yapılacak Adımlar:
// 1. Araba sınıfına arabaSayisi adlı static değişken ekleyip başlangıç değerini 1 yapın.
// 2. Main sınıfında bu static değişkene erişip değerini 10 yapıp ekrana yazdırın.

public class Araba {
    public static int arabaSayisi = 1;
}


public class Main {
    public static void main(String[] args) {
        Araba.arabaSayisi = 10;
        System.out.println("Araba Sayısı: " + Araba.arabaSayisi);
    }
}
