package Practice_5;

//Aşağıdaki kod bloğunda Child sınıfın constructor metodu içerisinde Parent sınıfın constructoru metodunu
// "Hello from Child" parametresi ile çağırınız.

class Parent {
    Parent() {
        System.out.println("Parent no-arg constructor");
    }


    Parent(String msg) {
        System.out.println("Parent constructor with message: " + msg);
    }
}


class Child extends Parent {
    Child() {
        //Kodlar buraya
        super("Hello from Child");
        System.out.println("Child no-arg constructor");
    }
}


public class Main {
    public static void main(String[] args) {
        new Child();
    }
}
