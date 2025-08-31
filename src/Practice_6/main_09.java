package Practice_6;

//InheritanceBird sınıfını Bird sınıfından türetiniz.
// Bu sınıfın constructor'ında parent sınıfının fly metodunu cağırınız.
// CompositionBird sınfının içerisinde FlyingAbility tipinde bir instance tanımlayınız(flyingAbility).
// Constructor içerisinde bu objeyi atama yapınız.

class Bird {
    void fly() {
        System.out.println("Bird is flying.");
    }
}


class FlyingAbility {
    void fly() {
        System.out.println("Flying with ability.");
    }
}


class InheritanceBird extends Bird {
    InheritanceBird(){
        super.fly();
    }

}


class CompositionBird {
    FlyingAbility flyingAbility = new FlyingAbility();

    CompositionBird(FlyingAbility flyingAbility){
        this.flyingAbility = flyingAbility;
    }
}
