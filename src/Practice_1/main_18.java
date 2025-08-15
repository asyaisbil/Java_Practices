package Practice_1;

/*String olarak verilmiş word değişkenini karakter dizisine çeviriniz(toCharArray fonksiyonuna bakabilirsin)
ve characters adında bir değişkene atayınız. Daha sonra bu characters dizisini bir for döngüsü ile geziniz.
Eğer bu dizinin herhangi bir karakteri sesliler dizisinin içerisinde geçiyorsa(indexOf fonksiyonunu inceleyebilirsin)
ekrana o karakteri yazdırınız.
 */

public class main_18 {
    public static void main(String[] args) {
        String word = "I will be a Javatar";
        char[] characters = word.toCharArray();

        String sesliler = "AaEeIiOoUu";

        for(char character: characters){
            if(sesliler.indexOf(character) != -1){
                System.out.println(character);
            }
        }
    }
}
