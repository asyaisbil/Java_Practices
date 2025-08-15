package Practice_1;


/*numbers dizisini bir for loop ile dönerek eğer içerisindeki eleman 2 ile tam bölünüyorsa ekrana 'Çift sayı'
bölünmüyorsa ekrana 'Tek sayı' yazdırınız.
Şartlı ifade kullanımlarını if/else ile yapmaya çalışınız.
 */

public class main_13 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int number: numbers){
            if(number % 2 == 0){
                System.out.println("Çift sayı");
            } else {
                System.out.println("Tek sayı");
            }
        }
    }
}
