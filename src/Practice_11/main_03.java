
/*Bir Map oluşturun, anahtar olarak bir Integer ve değer olarak bir String kullanın. Tüm değerleri döngü ile yazdırın.
Yapılacak Adımlar:
1. put metodu ile haritaya şu değerleri ekleyin: 1-"Ali" 2-"Ayşe" 3-"Fatma"
2. for-each döngüsü ile haritanın tüm değerlerini ekrana yazdırın.*/
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<Integer, String> harita = new HashMap<>();
        harita.put(1,"Ali");
        harita.put(2,"Ayşe");
        harita.put(3,"Fatma");

        // Anahtar-değer çiftlerini ekleyin
        for(String name: harita.values()) {
            System.out.println(name);
        }
    }
}
