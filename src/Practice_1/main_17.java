package Practice_1;

//while döngüsü kullanarak verilen sayının faktoriyelini hesaplamaya çalışın.
public class main_17 {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;
        int result = 1;

        while(factorial <= 5){
            result = result * factorial;
            factorial++;
        }

        System.out.println("Faktöriyel: " + result);
    }
}
