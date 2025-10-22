/*Aşağıdaki kodu tamamlayarak set1 - set2 farkını bulun.*/

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4));


        // Burada farkı bulun
        set1.removeAll(set2);


        System.out.println(set1);
    }
}


