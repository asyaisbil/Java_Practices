/*Bir ArrayList ve bir LinkedList oluşturun. Her ikisine de 5 eleman ekleyin
ve bu elemanları baştan ve sondan kaldırarak listeyi ekrana yazdırın.
Yapılacak Adımlar:
1. Bir ArrayList ve bir LinkedList oluşturun.
2. Her iki listeye de 1, 2, 3, 4, 5 sayılarını ekleyin.
3. Hem ArrayList hem de LinkedList'ten ilk ve son elemanları kaldırın.
4. Kalan elemanları ekrana yazdırın.*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        arrayList.remove(0);
        arrayList.remove(arrayList.size() - 1);
        linkedList.remove(0);
        linkedList.remove(linkedList.size() - 1);

        for(Integer array: arrayList) {
            System.out.println(array);
        }

        for(Integer link: linkedList) {
            System.out.println(link);
        }
    }
}
