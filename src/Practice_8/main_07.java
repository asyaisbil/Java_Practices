/*
Aşağıdaki kod bloğunda main metod içerisinde Animal tipinde ve animal isminde
ama memory'de Dog tipinde oluşturulacak şekilde bir obje tanımlayınız.
Daha sonra bu instance değerinin sound metodunu çağırınız.
Ekrana "Bark" yazdırması istenmektedir.
*/

abstract class Animal {
    abstract void sound();
}


class Dog extends Animal {
    public void sound() {
        System.out.println("Bark");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
    }
}
