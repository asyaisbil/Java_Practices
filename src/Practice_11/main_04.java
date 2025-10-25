/*
Bir Map üzerinde döngü kullanarak hem anahtarları hem de değerleri yazdırın.
Yapılacak Adımlar:
1. Haritaya şu çiftleri ekleyin: 101-"Ahmet" 102-"Mehmet" 103-"Selin"
2. for-each döngüsü ile entrySet() kullanarak tüm anahtar ve değerleri yazdırın.*/

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<Integer, String> harita = new HashMap<>();
        harita.put(101, "Ahmet");
        harita.put(102, "Mehmet");
        harita.put(103, "Selin");

        // Anahtar-değer çiftlerini ekleyin
        for(Map.Entry<Integer, String> entry: harita.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
