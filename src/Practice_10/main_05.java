
/*Aşağıdaki kodda set isminde Collection tipinde ama memoryde HashSet olacak şekilde bir obje tanımlayınız.
list instance değerini bu yeni objenin constructorında parameter olarak veriniz.
Daha sonra yeni elemanı ekrana bastırınız.*/

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3);
        Collection set = new HashSet<>(list);
        System.out.println(set);
    }
}
