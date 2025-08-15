package Practice_1;

/*1-) avg değeri 30'dan küçükse ekrana Yetersiz,
2-) avg değeri 30 ile 50(dahil) arasındaysa ekrana Ortalama
3-) avg değeri 50 ile 70(dahil) arasındaysa ekrana İyi
4-) avg değeri 70'den büyükse ekrana Çok iyi yazdırınız.
*/

public class main_11 {
    public static void main(String[] args) {
        int avg = 45;

        if(avg <= 30){
            System.out.println("Yetersiz");
        } else if(avg > 30 && avg <= 50){
            System.out.println("Ortalama");
        } else if(avg > 50 && avg <= 70){
            System.out.println("İyi");
        } else if(avg > 70){
            System.out.println("Çok iyi");
        }

    }
}
