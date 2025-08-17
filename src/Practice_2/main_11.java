package Practice_2;

//topla isminde bir metod tanımlayınız. İki int parametre alıp, bu parametrelerin toplamını döndüren bir metod olmasını bekliyoruz.
// Yapılacak Adımlar:
// 1. topla metodunu tamamlayın. Alacağı parametrelere a ve b isimlerini veriniz.
// 2. Metodu sonuc değişkenine atayıp a değişkenine 5, b değişkenine 3 parametresini verip çağırın.

public class main_11 {
    public static void main(String[] args) {
        //int sonuc; // Metodu sonuc değişkenine atayıp ilk değişkene 5, ikinci değişkene 3 parametresini verip çağırın
        System.out.println("Toplam: " + topla(5,3));
    }

    public static int topla(int a, int b){
        int sonuc = a + b;
        return sonuc;
    }
}
