package Practice_1;

/*Aşağıdaki kod çalıştırıldığında StringConcat fonksiyonu 2 değişkeni de string beklediğinden dolayı hata almaktadır.
avgScore değişkenini parametre olarak String'e cevirerek yollayınız.
*/

public class main_5 {
    public static void main(String[] args) {
        String message = "Öğrencinin not artalaması: ";
        double avgScore = 86.7;
        String avgScoreStr = Double.toString(avgScore);
        stringConcat(message, avgScoreStr);
    }


    public static void stringConcat(String firstWord, String secondWord){
        System.out.println(firstWord + " " + secondWord);
    }
}


