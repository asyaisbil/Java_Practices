package Practice_2;

//Verilen dizideki çift sayıların toplamını hesaplayarak ekrana yazdırınız. Yapılacak Adımlar:
// 1. Verilen dizi üzerinde döngü ile ilerleyin.
// 2. Sadece çift olan sayıları toplayın ve toplamı ekrana yazdırın.

public class main_12 {
    public static void main(String[] args) {
        int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  // Verilen dizi

        int toplam = 0;
        // Çift sayıların toplamını hesaplayın ve yazdırın.

        for(int i = 0; i < sayilar.length; i++) {
            if(sayilar[i] % 2 == 0){
                toplam = toplam + sayilar[i];
            }
        }

        System.out.println(toplam);

    }
}
