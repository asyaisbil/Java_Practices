/*Aşağıdaki kod bloğunda equals metodunu control ederek hashCode metodunu override ediniz.*/

import java.util.*;


class Car {
    String model;


    Car(String model) {
        this.model = model;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Objects.equals(model, car.model);
    }


    // Burada hashCode metodunu tanımlayın
}


