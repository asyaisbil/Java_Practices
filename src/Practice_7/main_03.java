
/*Aşağıdaki kod bloğunda ekranda'Child display" gözükmesi istenmektedir. Bunun için ne yapılabilir ?*/

class Parent {
    void display() {
        System.out.println("Parent display");
    }
}


class Child extends Parent {
    void display() {
        System.out.println("Child display");
    }
}


public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();
    }
}
