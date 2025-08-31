package Practice_6;

//Bir Book sınıfı tanımlayınız içerisinde title ve author bilgilerini tutmalıdır.
// Encapsulation kurallarına uyunuz.
// Bir constructor tanımlayın ve bu 2 değeri alabilmelidir.
// Daha sonra Library sınıfı içerisinde books adında Book sınıfının arrayini tutacak bir books isminde bir instance tanımlayınız.



class Book {
    private String title;
    private String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}

class Library {
    private Book[] books;
}