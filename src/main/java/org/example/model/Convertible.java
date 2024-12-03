package org.example.model;

import org.example.model.enums.TypeOfEngine;
import org.example.model.enums.TypeOfGearBox;
import org.example.model.enums.TypeOfRoof;

public class Convertible extends Car {
      private TypeOfRoof typeOfRoof;

      public Convertible(int id,String vehicleManufacturer, int price, boolean rented, String regNumber, int yearProduction, String model, int countOfPassengers, int countOfDoors, TypeOfGearBox typeOfGearBox, TypeOfEngine typeOfEngine, TypeOfRoof typeOfRoof) {
            super(id,vehicleManufacturer, price, rented, regNumber, yearProduction, model, countOfPassengers, countOfDoors, typeOfGearBox, typeOfEngine);
            this.typeOfRoof = typeOfRoof;
      }

      public TypeOfRoof getTypeOfRoof() {
            return typeOfRoof;
      }

      public void setTypeOfRoof(TypeOfRoof typeOfRoof) {
            this.typeOfRoof = typeOfRoof;
      }

      @Override
      public String toString() {
            return "Convertible{" +
                    "typeOfRoof=" + typeOfRoof +
                    ", vehicleManufacturer='" + vehicleManufacturer + '\'' +
                    ", price=" + price +
                    ", rented=" + rented +
                    ", regNumber='" + regNumber + '\'' +
                    '}';
      }
}
