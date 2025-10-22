/*programmingLanguages adında bir Set tanımlayınız.
İçerisine "Java", "Python", "JavaScript" textlerini ekleyin ve iterator kullanarak bu elemanları ekrana bastırınız.*/

import java.util.HashSet;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        Set<String> programmingLanguages = new HashSet<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");

        for(String language: programmingLanguages) {
            System.out.println(language);
        }
    }
}
