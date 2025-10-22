
/*Instrument sınıfı içerisinde void dönüş tipinde play isminde bir abstract metod tanımlayınız
ve içerisine stop isminde void dönüş değeri olacak concrete bir metod tanımlayınız.
stop metodu ekrana "Stopping Instrument" basmalıdır.
Piano sınıfında abstract olan metodu Override ediniz ve ekrana "Playing Piano" metnini bastırınız.*/

abstract class Instrument {
    abstract void play();
    public void stop() {
        System.out.println("Stopping Instrument");
    }
}


class Piano extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing Piano");
    }
}
