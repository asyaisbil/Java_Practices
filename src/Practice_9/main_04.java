/*Bir LinkedList kullanarak bir kitap listesi oluşturun ve her kitabı sırayla ekrana yazdıran bir kod yazınız.
java import java.util.LinkedList; import java.util.List; public class Main { public static void main(String[] args) { List books = new LinkedList<>(); // Kitapları ekleyin ve ekrana yazdırın } }
Yapılacak Adımlar:
1. LinkedList içine ("Homo Deus", "Sapiens", "Neksus") kitap isimlerini ekleyin .
2. Bir döngü kullanarak her bir kitabı ekrana yazdırın*/


import java.util.LinkedList;
import java.util.List;


    public class Main {
        public static void main(String[] args) {
            List<String> books = new LinkedList<>();
            books.add("Homo Deus");
            books.add("Sapiens");
            books.add("Neksus");

            for(String book: books) {
                System.out.println(book);
            }
        }
    }
