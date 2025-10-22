/*set1 isminde bir HashSet oluşturun ve içerisine sırayla "A", "B" ve "C" harflerini ekleyiniz.
set2 isminde bir HashSet oluşturun ve içerisine sırayla "B", "C" ve "D" harflerini ekleyiniz.
set1 ile set2 objelerinin kesişimini bulunuz.*/

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        Set<String> set2 = new HashSet<>();
        set2.add("B");
        set2.add("C");
        set2.add("D");

        set1.retainAll(set2);
    }
}
