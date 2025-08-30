package Practice_3;

//Aşağıda oluşturulmuş Kişi sınıfının özelliklerini doldurup ekrana yazdıracak şekilde tamamlayınız. Yapılacak Adımlar:
// 1. Kişi sınıfınının ad ve yaş özelliğine Ahmet ve 25 değerlerini atayın.
// 2. Bunları ekrana yazdırın.

public class Kisi {
    String ad = "Ahmet";
    int yas = 25;
}


class Main {
    public static void main(String[] args) {
        Kisi kisi = new Kisi();
        System.out.println(kisi.ad);
        System.out.println(kisi.yas);
    }
}
