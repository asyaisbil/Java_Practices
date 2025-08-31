package Practice_5;
/*
 1- Bir Animal sınıfı oluşturun ve bu sınıftan Dog sınıfını türetin. İçerisinde sound isminde bir metod tanımlayınız.
        2- sound metodu ekrana "Animal makes a sound" mesajını basmalıdır.
        3- Dog sınıfı oluşturun ve Animal sınıfından türesin.
 4- Cat sınıfı oluşturun ve Animal sınıfından türesin.
*/

class Animal{
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{

}

class Cat extends Animal{

}