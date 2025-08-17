package Practice_2;

//Aşağıda verilen metin üzerinde trim metodunu kullanarak başındaki ve sonundaki boşlukları kaldırın ve sonucu ekrana yazdırın.

public class main_3 {
    public static void main(String[] args) {
        String metin = "   Merhaba Java!   ";

        metin = metin.trim();
        System.out.println(metin);
    }
}
