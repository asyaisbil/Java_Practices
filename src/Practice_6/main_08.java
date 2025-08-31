package Practice_6;

//Person sınıfı içerisinde Address sınıfından bir instance oluşturunuz.
// Person sınıfı içerisinde name, age ve address değerlerini alabilecek bir constructor tanımlayınız.

class Address {
    private String city;
    private String street;
    private int number;
}


class Person {
    private String name;
    private int age;

    Address address = new Address();

    Person(String name, int age, Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
