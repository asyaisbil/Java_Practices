/*Aşağıdaki kod bloğunda main metod içerisinde Animal tipinde ama memeory deki lokasyonu Cat olacak şekilde
bir instance tanımlayınız. Daha sonra bu instance üzerinden makeSound etodunu çağırınız.
 */

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeSound();
    }
}