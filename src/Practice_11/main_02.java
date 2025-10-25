/*Bir Map oluşturun, anahtar olarak bir String ve değer olarak bir Integer kullanın.
Anahtar-değer çiftlerini ekleyin ve tüm anahtarları döngü ile ekrana yazdırın.
Yapılacak Adımlar:
1. harita.put metodu ile "Elma", 5 ve "Armut", 3 anahtar-değer çiftlerini ekleyin.
2. for-each döngüsü ile haritanın tüm anahtarlarını ekrana yazdırın.*/

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> harita = new HashMap<>();
        harita.put("Elma", 5);
        harita.put("Armut", 3);

        // Anahtar-değer çiftlerini ekleyin
        for(String fruit: harita.keySet()) {
            System.out.println(fruit);
        }
    }
}
