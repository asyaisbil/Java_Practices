package Practice_3;

//Aşağıdaki Ucak sınıfını kullanarak üç farklı nesne oluşturun. Her nesne farklı özelliklere sahip olmalıdır. Yapılacak Adımlar:
// 1. Ucak sınıfından üç farklı nesne oluşturun:
// a) İlk ucak1 nesnesi için model "Boeing 737" ve yolcu kapasitesi 200 olsun.
// b) İkinci ucak2 nesnesi için model "Airbus A320" ve yolcu kapasitesi 180 olsun.
// c) Üçüncü ucak3 nesnesi için model "Concorde" ve yolcu kapasitesi 100 olsun.
// 2. Nesnelerin model ve yolcu kapasitesini ekrana yazdırın.

public class Ucak {
    String model;
    int yolcuKapasitesi;

    public Ucak(String model, int yolcuKapasitesi) {
        this.model = model;
        this.yolcuKapasitesi = yolcuKapasitesi;
    }
}

class Main {
    public static void main(String[] args) {
        Ucak ucak1 = new Ucak("Boeing 737", 200);
        Ucak ucak2 = new Ucak("Airbus A320", 180);
        Ucak ucak3 = new Ucak("Concorde", 100);

        System.out.println(ucak1.model);
        System.out.println(ucak1.yolcuKapasitesi);

        System.out.println(ucak2.model);
        System.out.println(ucak2.yolcuKapasitesi);

        System.out.println(ucak3.model);
        System.out.println(ucak3.yolcuKapasitesi);
    }
}

