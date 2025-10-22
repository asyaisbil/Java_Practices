
/*Aşağıdaki od bloğunda ekrana sırasıyla
Child display
Parent
yazdırılmak istenmektedir. Bu işlem için eksik kodu main metod içerisinde ekleyiniz.*/

class Parent {
    String name = "Parent";
    void display() {
        System.out.println("Parent display");
    }
}


class Child extends Parent {
    String name = "Child";
    @Override
    void display() {
        System.out.println("Child display");
    }
}


public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        Child child = (Child) obj;
        child.display();
        System.out.println(obj.name);
    }
}
