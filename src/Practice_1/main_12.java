/*Pazartesi haftanın 1. günü Pazar günü de haftanın 7.günü olacak şekilde haftanın her gününün bir numara olduğunu varsayalım.
day değeri haçtaiçi bir güne denk geliyorsa ekrana 'Hafta içi'.
Haftasonu bir güne denk geliyorsa ekrana 'Hafta sonu' yazdırınız.
Eğer day değeri 1-7 dışında bir değer gelirse ekrana 'Geçersiz gün' yazdırınız.
Tüm bu işlemleri switch/case kullanarak yapınız.
*/

public class main_12 {
    public static void main(String[] args) {
        int day = 1;

        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Geçersiz gün");
        }
    }
}
