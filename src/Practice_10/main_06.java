/*numbers isminde Set tipinde bir HashSet tanımlayınız. İçerisine 10,20,10 ve 30 değerlerini ekleyip bu seti ekrana bastırınız.*/
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);

        for(Integer number: numbers) {
            System.out.println(number);
        }
    }
}
