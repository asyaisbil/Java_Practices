package Practice_4;

//Aşağıdaki Personel sınıfında bir protected metot tanımlayın.
// Bu metodu başka bir sınıfta kullanarak ekrana bir bilgi yazdırın. Yapılacak Adımlar:
// 1. Personel sınıfında protected erişim belirleyici ile bir selamVer metodu tanımlayın.
// 2. Bu metot içinde "Merhaba, sisteme hoş geldiniz!" mesajını ekrana yazdırın.
// 3. Main sınıfında bu metodu çağırarak selamlamayı ekrana yazdırın.

public class Personel {
    protected void selamVer(){
        System.out.println("Merhaba, sisteme hoş geldiniz!");
    }

}


public class Main extends Personel {
    public static void main(String[] args) {
        Personel personel = new Personel();
        personel.selamVer();
    }
}
