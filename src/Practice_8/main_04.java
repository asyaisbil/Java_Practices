/*
main metod içerisinde device isminde bir instance oluşturunuz.
Bu instance olabiliğinde esnek olmalıdır(Polymorphic kurallara en uygun) bu instance üzerinden powerOn metodunu cağırınız.

 */

interface Device {
    void powerOn();
}


class Phone implements Device {
    @Override
    public void powerOn() {
        System.out.println("Phone is powering on");
    }
}


public class Main {
    public static void main(String[] args) {
        Device device = new Phone();
        device.powerOn();
    }
}
