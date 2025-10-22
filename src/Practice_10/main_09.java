/*Aşağıdaki set içerisinde "Banana" stringi geçiyorsa ekrana "Eleman mevcut" yazdırınız.*/
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");

        if(set.contains("Banana")) {
            System.out.println("Eleman mevcut");
        }
    }
}
