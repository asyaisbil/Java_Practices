package Practice_3;

//Aşağıdaki Öğrenci sınıfını kullanarak bir nesne oluşturun ve özelliklerini ekrana yazdırın. Yapılacak Adımlar:
// 1. Ogrenci sınıfının isim ve ortalama özelliklerine "Elif" ve 89.5 değerlerini atayın.
// 2. Bunları ekrana yazdırın.


class Ogrenci {
    String isim = "Elif";
    double ortalama = 89.5;
}


public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        System.out.println(ogrenci.isim);
        System.out.println(ogrenci.ortalama);
    }
}
