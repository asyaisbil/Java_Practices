package Practice_3;

//Bir Ogrenci sınıfı tanımlayın ve bu sınıftan üç farklı nesne oluşturun.
// Her nesne, farklı bir isim ve yaş değeri içermeli. Yapılacak Adımlar:
// 1. Ogrenci adında bir sınıf oluşturun.
// 2. Bu sınıfta, String isim ve int yas adında iki örnek değişken tanımlayın.
// 3. Bu değişkenleri başlatan bir yapıcı metod tanımlayın.
// 4. Üç farklı Ogrenci nesnesi oluşturun (ogrenci1 -> Ali,20 ; ogrenci2 ->Ayşe,22 ; ogrenci3-> Mehmet,19) ve özelliklerini yazdırın.


public class main_4 {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci();
        Ogrenci ogrenci2 = new Ogrenci();
        Ogrenci ogrenci3 = new Ogrenci();

        ogrenci1.isim = "Ali";
        ogrenci1.yas = 20;

        ogrenci2.isim = "Ayşe";
        ogrenci2.yas = 22;

        ogrenci3.isim = "Mehmet";
        ogrenci3.yas = 19;
    }
}


class Ogrenci {
    String isim;
    int yas;
}
