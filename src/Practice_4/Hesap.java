package Practice_4;

//Aşağıdaki Hesap sınıfında bir private değişken tanımlayın ve bu değişkene sadece getter ve setter metodları üzerinden erişim sağlayın. Yapılacak Adımlar:
// 1. Hesap sınıfında bakiye adında bir private double değişken tanımlayın.
// 2. Getter ve setter metodlarını oluşturun.
// 3. Main metodunda setter metodu kullanarak 500.75 değerini atayın ve getter ile ekrana yazdırın.

public class Hesap {
    private double bakiye;

    public double getBakiye(){
        return this.bakiye;
    }

    public void setBakiye(double bakiye){
        this.bakiye = bakiye;
    }
}


public class Main {
    public static void main(String[] args) {
        Hesap hesap = new Hesap();
        hesap.setBakiye(500.75);
        System.out.println(hesap.getBakiye());
    }
}
