package Practice_4;

//Aşağıdaki HesapMakinesi sınıfına bir static metot ekleyin. Bu metot, iki sayıyı toplamalıdır. Yapılacak Adımlar:
// 1. HesapMakinesi sınıfına static bir topla metodu ekleyin.
// 2. Main sınıfında bu metodu çağırarak sonucu ekrana yazdırın.

public class HesapMakinesi {
    // Static metot ekleyin
    public static int topla(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }
}


public class Main {
    public static void main(String[] args) {
        int sonuc = HesapMakinesi.topla(5, 7); // Static metot çağrılacak
        System.out.println("Toplam: " + sonuc);
    }
}

