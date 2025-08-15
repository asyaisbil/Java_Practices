package Practice_1;

/*Aşağıdaki kod çalıştırıldığında StringConcat fonksiyonu 2 değişkeni de string beklediğinden dolayı hata almaktadır.
firstNum değişkenini parametre olarak String'e cevirerek yollayınız.
*/

public class main_3 {
    public static void main(String[] args) {
        String message = "Öğrencinin sınav notu: ";
        int firstNum = 100;
        stringConcat(message, firstNum);
    }


    public static void stringConcat(String firstWord, String secondWord){
        System.out.println(firstWord + " " + secondWord);
    }
}
