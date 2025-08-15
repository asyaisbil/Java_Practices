package Practice_1;

/*text isminde String tipinde bir değişken tanımlayınız ve Java dğerini atayınız.
Daha sonra bir for döngüsü ile tüm karakterlerini ekrana bastırınız.
*/

public class main_15 {
    public static void main(String[] args) {

        String text = "Java";


        for(char character: text.toCharArray()){
            System.out.println(character);
        }

    }
}
