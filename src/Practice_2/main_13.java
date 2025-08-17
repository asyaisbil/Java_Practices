package Practice_2;

//Kullanıcıdan bir cümle alın ve bu cümledeki en uzun kelimeyi bulun.(Scanner kütüphanesinin kullanımına bakmalısın) Yapılacak Adımlar:
// 1. Kullanıcıdan bir cümle alın.
// 2. Bu cümleyi boşluklara göre ayırarak kelimeler adli bir diziye çevirin.
// 3. Her kelimeyi kontrol ederek enUzunKelime'yi bulun. 4. Sonuç olarak enUzunKelime'yi ekrana yazdırın.

import java.util.Scanner;


public class main_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Bir cümle girin: ");
        String cumle = scanner.nextLine();

        String[] kelimeler = cumle.split(" ");
        String enUzunKelime = kelimeler[0];

        for(int i = 0; i < kelimeler.length-1; i++){
            if(kelimeler[i+1].length() > enUzunKelime.length()){
                enUzunKelime = kelimeler[i+1];
            }
        }

        System.out.println(enUzunKelime);
    }
}
