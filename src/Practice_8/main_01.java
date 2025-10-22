/*1. Appliance sınıfı içerisinde bir adet String type isminde bir değişken tanımlayınız ve constructor üzerinden değerini atayınız.
Daha sonra içerisinde 3 tane dönüş değerivod olacak şekilde abstract metod tanımlayınız.
Metodların isimleri turnOn, turnoff ve startWorking olmalıdır*/

abstract class Appliance {
    String type;

    public Appliance(String type) {
        this.type = type;
    }

    abstract void turnOn();
    abstract void turnOff();
    abstract void startWorking();
}


