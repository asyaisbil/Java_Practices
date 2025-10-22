/*Device sınıfı içerisinde turnoff ve turnOn isminde 2 tane abstract ve dönüş değeri void olacak şekilde metod tanımalyınız.
Computer sınıfını Device sınfından türetip bu 2 metodu Override ediniz.
turnOn ekrana "Computer is ON" yazdırmalıdır. turnOff ekrana "Computer is OFF" yazdırmalıdır.*/

abstract class Device {
    abstract void turnOff();
    abstract void turnOn();


}


class Computer extends Device {
    @Override
    public void turnOn() {
        System.out.println("Computer is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Computer is OFF");
    }
}



