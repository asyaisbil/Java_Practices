/*Aşağıdaki kod parçasında bir ArrayList kullanarak sayılar ekleyin ve Collections sınıfını kullanarak bu sayıları sıralayıp
ekrana yazdıran bir kod yazınız.
 java import java.util.ArrayList; import java.util.Collections; import java.util.List; public class Main { public static void main(String[] args) { List numbers = new ArrayList<>(); // Sayıları ekleyin, sıralayın ve ekrana yazdırın } }
 Yapılacak Adımlar:
 1. ArrayList içine (4, 15, 16, 42, 8, 23) sayılarını ekleyin.
 2. Collections.sort metodunu kullanarak sayıları sıralayın.
 3. Sıralanmış listeyi bir döngü ile ekrana yazdırın.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
   public static void main(String[] args) {
       List<Integer> numbers = new ArrayList<>();
       numbers.add(4);
       numbers.add(15);
       numbers.add(16);
       numbers.add(42);
       numbers.add(8);
       numbers.add(23);

       Collections.sort(numbers);

       for(int number: numbers) {
           System.out.println(number);
       }
   }
}


