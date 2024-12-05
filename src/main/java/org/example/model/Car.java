package org.example.model;

import org.example.model.enums.DriveOfType;
import org.example.model.enums.TypeOfEngine;
import org.example.model.enums.TypeOfGearBox;
//Model av Car med constructor som extends av Vehicle
public class Car extends Vehicle {
    private int countOfPassengers;
    private int countOfDoors;
    private TypeOfGearBox typeOfGearBox;
    private TypeOfEngine typeOfEngine;

    public Car(int id, String vehicleManufacturer, int price, boolean rented, String regNumber, int yearProduction, String model, int countOfPassengers, int countOfDoors, TypeOfGearBox typeOfGearBox, TypeOfEngine typeOfEngine) {
        super(id, vehicleManufacturer, price, rented, regNumber, yearProduction, model);
        this.countOfPassengers = countOfPassengers;
        this.countOfDoors = countOfDoors;
        this.typeOfGearBox = typeOfGearBox;
        this.typeOfEngine = typeOfEngine;
    }


    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    public void setCountOfDoors(int countOfDoors) {
        this.countOfDoors = countOfDoors;
    }

    public TypeOfGearBox getTypeOfGearBox() {
        return typeOfGearBox;
    }

    public void setTypeOfGearBox(TypeOfGearBox typeOfGearBox) {
        this.typeOfGearBox = typeOfGearBox;
    }

    public TypeOfEngine getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(TypeOfEngine typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }


    @Override
    public String toString() {
        return id +"."+"Model: " +vehicleManufacturer +" "+model+ " ,"+ countOfDoors + " doors,"+ countOfPassengers+ "max passengers, "+ typeOfEngine+ ", "+ typeOfGearBox+ ", price/day: "+price;
    }


}
