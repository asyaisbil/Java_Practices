package Practice_5;

// 1- main metodu içerisinde car isminde ve bike isminde 2 tane instance tanımlayınız.
// 2- iki instance içinde start metodunu çalıştırınız.

class Vehicle {
    public void start() {
        System.out.println("Vehicle starts");
    }
}


class Car extends Vehicle {

}


class Bike extends Vehicle {
}


public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.start();
        bike.start();
    }
}

