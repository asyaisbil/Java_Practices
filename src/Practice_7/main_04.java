
/*obj instance üzerinden special isimli metod çağırılmak istenmektedir.
Bu işlemi gerçekleştirebilmek için obj instance ı Child sınıfa cast edip child isimli bir instance değerine atayınız.
Daha sonra bu instance üzerinden special metodunu çalıştırınız.*/

class Parent {
    void display() {
        System.out.println("Parent display");
    }
}


class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child display");
    }


    void special() {
        System.out.println("Child special method");
    }
}


public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        Child child = (Child) obj;
        child.special();
    }
}
