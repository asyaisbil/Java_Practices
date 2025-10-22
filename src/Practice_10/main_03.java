/*Aşağıdaki kodda set1 ve set2 yi birleştiren kodu yazınız.*/
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));


        // Burada set1 ve set2'yi birleştiren işlemi yapın
        set1.addAll(set2);


        System.out.println(set1);
    }
}
