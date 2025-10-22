/*set1 isminde bir HashSet oluşturun ve içerisine sırayla "A", "B" ve "C" harflerini ekleyiniz.
set2 isminde bir HashSet oluşturun ve içerisine sırayla "C", "D" ve "E" harflerini ekleyiniz.
set1 Set'ine set2 setini ekleyiniz(birleşimini bulunuz) ve ekrana bastırınız.*/

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("A");
        set1.add("B");
        set1.add("C");
        set2.add("C");
        set2.add("D");
        set2.add("E");

        set1.addAll(set2);

        System.out.println(set1);

    }
}
