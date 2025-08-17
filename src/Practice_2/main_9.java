package Practice_2;

//Aşağıdaki verilen cumle değişkenini, replaceAll ve split metodlarını kullanarak, tüm boşluklarını kaldırın
// ve ardından harflere ayırarak ekrana yazdırın. Yapılacak Adımlar:
// 1. cumle değişkenindeki tüm boşlukları replaceAll metoduyla kaldırın.
// 2. Boşlukları kaldırılmış cümleyi, split metodu ile harflere ayırın ve bunu harfler adlı değişkene atayın.
// 3. Her harfi ekrana yazdırın.

public class main_9 {
    public static void main(String[] args) {
        String cumle = "Java programlama dilini öğrenmek çok eğlencelidir";
        cumle = cumle.replaceAll(" ","");
        String[] harfler = cumle.split("");

        for(int i = 0; i < harfler.length; i++) {
            System.out.println(harfler[i]);
        }
    }
}
