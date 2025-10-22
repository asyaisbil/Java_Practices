/*Bir ArrayList ve bir LinkedList oluşturun.
Her ikisine de sırasıyla "A", "B", "C" harflerini ekleyin ve elemanları sırayla ekrana yazdırın.
1. Bir ArrayList ve bir LinkedList oluşturun.
2. Her iki listeye de sırasıyla "A", "B", "C" harflerini ekleyin.
3. İki listeyi de sırayla yazdırın ve sonuçları karşılaştırın.*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        List<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        for(String array: arrayList) {
            System.out.println(array);
        }
        for(String link: linkedList) {
            System.out.println(link);
        }
    }
}
