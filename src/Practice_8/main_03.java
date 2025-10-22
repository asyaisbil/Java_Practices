/*Car sınıfının Vehicle interface ten türetiniz.
start metodu ekrana "Car is starting" stop metodu ekrana "Car is stopping" yazmalıdır.*/

interface Vehicle {
    void start();
    void stop();
}


class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
    public void stop() {
        System.out.println("Car is stopping");
    }
}


