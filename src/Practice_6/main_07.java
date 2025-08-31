package Practice_6;
/*
GameLevel isminde bir Enum tanımlayınız. Bu Enum içerisindeki eğişkenler şu şekilde tutulmalıdırlar.

EASY(1), MEDIUM(2), HARD(3);

zorluk değerlerini numerik olarakta tutabilmek için GageLevel Enum içerisinde difficulty isminde bir değişken tanımlayınız.
Sınıfın kalanını buna göre yönetiniz.
*/

enum GameLevel {
    EASY(1),
    MEDIUM(2),
    HARD(3);

    private int difficulty;

    GameLevel(int difficulty){
        this.difficulty = difficulty;
    }

}