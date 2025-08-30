package Practice_4;

//Aşağıdaki Araba sınıfında bir public static metot tanımlayın ve main metodunda bu metodu çağırarak ekrana bilgi yazdırın. Yapılacak Adımlar:
// 1. Araba sınıfında static erişim belirleyici ile bir bilgiYazdir metodu tanımlayın.
// 2. Bu metot içinde "Araba Markası: BMW" yazdırın.
// 3. Main metodunda bu metodu çağırarak bilgiyi ekrana yazdırın.

public class Araba2 {
    public static void bilgiYazdir(){
        System.out.println("Araba Markası: BMW");
    };
}


public class Main {
    public static void main(String[] args) {
        Araba2.bilgiYazdir();
    }
}
