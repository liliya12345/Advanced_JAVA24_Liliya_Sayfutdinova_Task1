package org.example.model;

import org.example.model.enums.DriveOfType;
import org.example.model.enums.TypeOfEngine;
import org.example.model.enums.TypeOfGearBox;

public class SUV extends Car{
    private DriveOfType driveOfType;


    public SUV(int id,String vehicleManufacturer, int price, boolean rented, String regNumber, int yearProduction, String model, int countOfPassengers, int countOfDoors, TypeOfGearBox typeOfGearBox, TypeOfEngine typeOfEngine, DriveOfType driveOfType) {
        super(id,vehicleManufacturer, price, rented, regNumber, yearProduction, model, countOfPassengers, countOfDoors, typeOfGearBox, typeOfEngine);
        this.driveOfType = driveOfType;
    }


    @Override
    public String toString() {
        return id +"."+"Model: " +vehicleManufacturer +" "+model+ " ,"+ " driveOfType"+ driveOfType +", price/day: "+price;

    }
}

