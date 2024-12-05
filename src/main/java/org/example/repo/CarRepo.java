package org.example.repo;

import org.example.model.Car;
import org.example.model.enums.TypeOfEngine;
import org.example.model.enums.TypeOfGearBox;

import java.util.List;

public class CarRepo {
   static final List<Car> carList= List.of(new Car(1,"Toyota", 50, false, "ASH123", 2020, "Corolla", 5, 5, TypeOfGearBox.AUTOMATIC, TypeOfEngine.PETROL),
                new Car(2,"Toyota", 70, false, "BA223", 2021, "Camri", 5, 5, TypeOfGearBox.AUTOMATIC, TypeOfEngine.PETROL),
                new Car(3,"Telsa", 80, false, "AA213", 2022, "Model3", 5, 5, TypeOfGearBox.AUTOMATIC, TypeOfEngine.ELECTRIC),
                new Car(4,"Telsa", 90, false, "PL2413", 2022, "ModelY", 5, 5, TypeOfGearBox.AUTOMATIC, TypeOfEngine.ELECTRIC),
                new Car(5,"Telsa", 95, false, "PL3413", 2022, "ModelS", 5, 5, TypeOfGearBox.AUTOMATIC, TypeOfEngine.ELECTRIC),
                new Car(6,"Nissan", 65, false, "ADS113", 2024, "X-trail", 7, 5, TypeOfGearBox.MANUAL, TypeOfEngine.PETROL));


    public List<Car> findAll() {
        return carList;  }

    public Car findById(int id) {
       return findAll().stream().filter(car -> car.getId() == id).findFirst().orElse(null);
    }

    public  void  rentCar(int id) {
        Car car = findById(id);
        car.setRented(true);

    }
    public void returnCar(int id) {
        Car car = findById(id);
        car.setRented(false);

    }
}
