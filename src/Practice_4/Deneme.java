package Practice_4;

//Aşağıdaki projede ornekpaket adında package tanımlanmıştır, bu paketin içindeki bir sınıftan main metodunda bilgi yazdırın. Yapılacak Adımlar:
// 1. Main sınıfında paketi import ederek metodu çağırın.

public class Deneme {
    public static void bilgiGoster() {
        System.out.println("Bu bir örnek pakettir.");
    }
}


public class Main {
    public static void main(String[] args) {
        Deneme deneme = new Deneme();
        deneme.bilgiGoster();
    }
}
