package Practice_2;

//Aşağıda verilen metin üzerinde split metodunu kullanarak boşluklara göre ayırın ve her bir kelimeyi ekrana yazdırın. Yapılacak Adımlar:
// 1. split metodunu kullanarak metin değişkenini boşluklara göre ayırın ve kelimler isminde bir değişkene atayınız.
// 2. Her bir kelimeyi ekrana yazdırın.

public class main_4 {
    public static void main(String[] args) {
        String metin = "Java çok güzel bir dil";
        String[] kelimeler = metin.split(" ");

        for(int i = 0; i < kelimeler.length; i++){
            System.out.println(kelimeler[i]);
        }

    }
}

