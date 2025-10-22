
/*
Shape isminde bir abstract sınıf yazınız ve içerisinde dönüş değeri void olacak şekilde draw isminde bir metod tanımlayınız.
Daha sonra Circle isminde bir sınıf yazınız ve Shape sınıfından türetiniz.
draw metodunu ekrana "Drawing Circle" yazacak şekilde güncelleyiniz.*/

abstract class Shape {
    abstract void draw() ;
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}