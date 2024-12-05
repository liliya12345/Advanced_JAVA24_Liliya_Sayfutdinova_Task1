package org.example.model;
//Model av truck som extends av class Vehicle  med constructor
public class Truck extends Vehicle{
       private double cargoCapacity;
       private int carBodyVolume;


    public Truck(int id,String vehicleManufacturer, int price, boolean rented, String regNumber, int yearProduction, String model, double cargoCapacity, int carBodyVolume) {
        super(id,vehicleManufacturer, price, rented, regNumber, yearProduction, model);
        this.cargoCapacity = cargoCapacity;
        this.carBodyVolume = carBodyVolume;
    }

    @Override
    public String toString() {
        return    id +"."+"Model: " +vehicleManufacturer +" "+model+ " ,"+ cargoCapacity +" cargoCapacity, "+carBodyVolume+" carBodyVolume"+ "price/day: "+price;
    }
}
