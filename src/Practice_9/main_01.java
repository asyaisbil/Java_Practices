/*Aşağıdaki kod parçasında bir LinkedList nesnesine şehirler ekleyin ve bu şehirleri sırayla ekrana yazdıran bir kod yazınız.
java
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List cities = new LinkedList<>();
        // Şehirleri ekleyin ve ekrana yazdırın
    }
}

Yapılacak Adımlar:
1. LinkedList içine "Ankara", "Istanbul", "Izmir" şehirlerini ekleyin.
2. Bir döngü kullanarak her bir şehri sırayla ekrana yazdırın.*/

import java.util.LinkedList;
import java.util.List;


    public class Main {
        public static void main(String[] args) {
            List<String> cities = new LinkedList<>();
            cities.add("Ankara");
            cities.add("Istanbul");
            cities.add("Izmir");

            for(int i = 0; i < cities.size(); i++) {
                System.out.println(cities.get(i));
            }
        }
    }
