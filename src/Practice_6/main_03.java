package Practice_6;

//Bir foreach loop ile tüm month değerlerini geziniz. 'ayın ismi + " is at index " + ayın index'i' şeklinde ekrana yazdırınız.

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}


public class Main {
    public static void main(String[] args) {
        for(Month month : Month.values()){
            System.out.println(month.name() + " is at index " + month.ordinal());
        }
    }
}
