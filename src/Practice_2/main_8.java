package Practice_2;

//Aşağıda verilen metin üzerinde toUpperCase metodunu kullanarak tüm harfleri büyük yapın
// ve toLowerCase metodunu kullanarak tüm harfleri küçük yapın. Sonuçları ekrana yazdırın. Yapılacak Adımlar:
// 1. toUpperCase metodunu kullanarak metin2 değişkeninin tüm harfleri büyük yapın ve buyuk isminde bir değişkene atayınız.
// 2. toLowerCase metodunu kullanarak metin değişkeninin tüm harfleri küçük yapın ve kucuk adında bir değişkene atayınız.
// 3. Sonuçları ekrana yazdırın.

public class main_8 {
    public static void main(String[] args) {
        String metin = "Java Programlama"; //Metnin harflerini küçük yap
        metin = metin.toLowerCase();

        String metin2 = "java çok eğlenceli"; // Metnin harflerini büyük yap
        metin2 = metin2.toUpperCase();


        // toUpperCase ve toLowerCase metodlarını kullanarak metni değiştirin
        // Sonuçları ekrana yazdırın
        System.out.println(metin);
        System.out.println(metin2);
    }
}
