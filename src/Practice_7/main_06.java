
/*main metod içerisinde Grandparent tipinde ama memorydeki adresi Child sınıfı gösterecek şekilde bir obje tanımlayınız.
instance ismine obj diyiniz.
Bu obj instance üzerinden display metodunu çağırınız.*/

class Grandparent {
    void display() {
        System.out.println("Grandparent display");
    }
}


class Parent extends Grandparent {
    @Override
    void display() {
        System.out.println("Parent display");
    }
}


class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child display");
    }
}


public class Main {
    public static void main(String[] args) {
        Grandparent obj = new Child();
        obj.display();
    }
}
