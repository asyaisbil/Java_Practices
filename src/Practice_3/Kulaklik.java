package Practice_3;

//Aşağıda Kulaklık sınıfı tanımlanmıştır.
// Yapıcı metotların (constructors) aşırı yüklenmesini (overloading) kullanarak iki farklı constructor oluşturun. Yapılacak Adımlar:
// 1. Kulaklık sınıfında iki farklı constructor tanımlayın:
// a)Sadece marka parametresi alan bir constructor.
// b)Marka ve kablosuz parametresi alan bir constructor.
// 2. İki farklı constructor'ı kullanarak, kulaklik1 ve kulaklik2 nesnelerini oluşturun
// ve ilkine "Sony", ikincisine "JBL", true değerini verin ve ekrana yazdırın.

class Kulaklik {
    String marka;
    boolean kablosuz;

    public Kulaklik(String marka){
        this.marka = marka;
    }

    public Kulaklik(String marka, boolean kablosuz){
        this(marka);
        this.kablosuz = kablosuz;
    }
}


public class Main {
    public static void main(String[] args) {
        Kulaklik kulaklik1 = new Kulaklik("Sony");
        Kulaklik kulaklik2 = new Kulaklik("JBL", true);
    }
}
