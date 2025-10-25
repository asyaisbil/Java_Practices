
/*Collection ve Iterable arasındaki ilişkiyi anlamak için aşağıdaki kodu tamamlayın. Collection türünden bir liste oluşturun
ve elemanları döngüyle yazdırın.
Yapılacak Adımlar:
1. Collection türünden olan listeye "Armut" ve "Muz" elemanlarını da ekleyin.
2. for-each döngüsü kullanarak tüm elemanları ekrana yazdırın.*/

import java.util.ArrayList;
import java.util.Collection;


public class Main {
   public static void main(String[] args) {
       Collection<String> liste = new ArrayList<>();
       liste.add("Elma");
       liste.add("Armut");
       liste.add("Muz");

       // Elemanları döngüyle yazdırın
       for(String fruit: liste) {
           System.out.println(fruit);
       }
   }
}
