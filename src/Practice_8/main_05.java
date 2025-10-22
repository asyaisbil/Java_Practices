/*
Constants interface içerisinde MAX_SPEED isminde bir değişken tanımlayınız ve değerini 120 ye eşitleyiniz.
Daha sonra main metod içerisinde ekrana "Max speed: " diyerek MAX_SPEED değişkenini bastırınız.
*/

interface Constants {
    int MAX_SPEED = 120;
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Max speed: " + Constants.MAX_SPEED);
    }
}


