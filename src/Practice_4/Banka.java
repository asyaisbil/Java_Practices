package Practice_4;

//Aşağıdaki Banka sınıfında bir static değişken tanımlayın ve bu değişkene erişimi başka bir sınıfta gerçekleştirin. Yapılacak Adımlar:
// 1. Banka sınıfında static double faizOrani adında bir değişken tanımlayın.
// 2. Bu değişkene 1.5 değerini atayın.
// 3. Main sınıfında bu static değişkene erişerek değeri ekrana yazdırın.

public class Banka {
    public static double faizOrani = 1.5;
}


public class Main {
    public static void main(String[] args) {
        System.out.println(Banka.faizOrani);
    }
}

