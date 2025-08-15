package Practice_1;

//numberStr değeri 0'dan büyükse ekrana pozitif, değilse ekrana negatif yazdırınız.(değişkenin String verilmesine dikkat ediniz.)

public class main_08 {
    public static void main(String[] args) {
        String numberStr = "-15";
        int number = Integer.parseInt(numberStr);

        if (number > 0){
            System.out.println("pozitif");
        } else {
            System.out.println("negatif");
        }
    }
}
