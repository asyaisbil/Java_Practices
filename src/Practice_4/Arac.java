package Practice_4;

//Aşağıdaki Arac sınıfında bir protected değişken ve bir protected metot tanımlayın.
// Bu metot, değişkeni kullanarak ekrana bir bilgi yazdırmalıdır. Yapılacak Adımlar:
// 1. Arac sınıfında protected String marka adında bir değişken tanımlayıp "Mercedes" değerini verin.
// 2. Bu değişkeni kullanan protected void bilgiYazdir() adında bir metot oluşturun. (""Aracın Markası: " + marka")
// 3. Main sınıfında bir Arac nesnesi oluşturun ve metodu çağırarak bilgiyi ekrana yazdırın.

public class Arac {
    protected String marka = "Mercedes";

    protected void bilgiYazdir(){
        System.out.println("Aracın Markası: " + this.marka);
    }
}


public class Main {
    public static void main(String[] args) {
        Arac arac = new Arac();
        arac.bilgiYazdir();
    }
}

