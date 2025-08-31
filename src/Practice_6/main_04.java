package Practice_6;

//Currency enum sınıfını oluşturun. İçerisinde USD, EUR, GBP adında 3 tane değişken tanımlayın.
// enum içerisinde name isminde ve String tipinde bir değişken tanımlayın.
// USD için bu değer "United States Dollar", EUR için "Euro", GBP için "British Pound" olmalıdır.

enum Currency {
    USD("United States Dollar"),
    EUR("Euro"),
    GBP("British Pound");

    private String name;

    Currency(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
