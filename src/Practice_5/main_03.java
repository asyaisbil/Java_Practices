package Practice_5;

//1- Child isminde bir sınıf oluşturunuz ve parent sınıfından türetiniz.
// 2- Child sınıfı içerisinde printName isminde bir metod tanımlayınız.
// 3- İlk olarak metodun içerisinde Parent sınıfında tanımlanmış name değişkenini ekrana bastırınız.
// Daha sonra Parent sınıfında tanımlanmış sayMyName() metodunu ekrana bastırınız.

class Parent {
    public String name = "Heisenberg";


    public void sayMyName(){
        System.out.println(name);
    }
}

class Child extends Parent{
    public void printName(){
        System.out.println(this.name);
        this.sayMyName();
    }
}


