package Practice_1;

/*strNumber değişkenini integer bir değere cevirip, strDecimal değerini de double bir değere çevirip toplayınız.
Sonucu total adında uygun tipte bir değişkene atayınız.
*/

public class main_10 {
    public static void main(String[] args) {
        String strNumber = "5100";
        int number = Integer.parseInt(strNumber);

        String strDecimal = "44.40";
        double decimal = Double.parseDouble(strDecimal);

        double total = number + decimal;

    }
}