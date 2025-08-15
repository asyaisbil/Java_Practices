package Practice_1;

/*Aşağıdaki kod çalıştırıldığında StringConcat fonksiyonu 2 değişkeni de string beklediğinden dolayı hata almaktadır.
isSuccesfull değişkenini parametre olarak String'e cevirerek yollayınız.
*/

public class main_4 {
    public static void main(String[] args) {
        String message = "Öğrencinin sınıfı geçti mi: ";
        boolean isSuccesfull = true;
        String isSuccesfullStr = Boolean.toString(isSuccesfull);
        stringConcat(message, isSuccesfullStr);
    }


    public static void stringConcat(String firstWord, String secondWord){
        System.out.println(firstWord + " " + secondWord);
    }
}
