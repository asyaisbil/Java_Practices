package Practice_2;

/*Aşağıdaki verilen metodu, Math.max yönteminin farklı versiyonlarını kullanarak doğru bir şekilde tamamlayın.
Math.max yöntemini kullanarak verilen iki farklı türdeki parametrelerin maksimum değerini bulun. Yapılacak Adımlar:
1. Math.max metodunun int türündeki versiyonunu kullanarak a ve b arasındaki maksimum değeri maxInt değişkenine atayın ve yazdırın.
2. Math.max metodunun double türündeki versiyonunu kullanarak x ve y arasındaki maksimum değeri maxDouble değişkenine atayın ve yazdırın.
*/

public class main_2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        double x = 15.5;
        double y = 25.8;

        int maxInt = Math.max(a, b);
        double maxDouble = Math.max(x, y);

        System.out.println(maxInt);
        System.out.println(maxDouble);

    }
}
