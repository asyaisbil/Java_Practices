/*Bir Map oluşturun ve containsKey metodunu kullanarak bir anahtarın var olup olmadığını kontrol edin.

Yapılacak Adımlar:

        1. Kullanıcıdan bir anahtar (örneğin "Elma") alın. (İpucu: scanner)
        2. containsKey metodunu kullanarak haritada bu anahtarın olup olmadığını kontrol edin.
        3. Sonucu ekrana yazdırın.
*/
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<String, Integer> harita = new HashMap<>();
        harita.put("Elma", 5);
        harita.put("Armut", 3);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir meyve adı girin: ");
        String anahtar = scanner.nextLine();



        // containsKey metodunu kullanarak kontrol edin
        if(harita.containsKey(anahtar)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
