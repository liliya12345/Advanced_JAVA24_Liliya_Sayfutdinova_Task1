package org.example.model;

public class Truck extends Vehicle{
       private double cargoCapacity;
       private int carBodyVolume;


    public Truck(int id,String vehicleManufacturer, int price, boolean rented, String regNumber, int yearProduction, String model, double cargoCapacity, int carBodyVolume) {
        super(id,vehicleManufacturer, price, rented, regNumber, yearProduction, model);
        this.cargoCapacity = cargoCapacity;
        this.carBodyVolume = carBodyVolume;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getCarBodyVolume() {
        return carBodyVolume;
    }

    public void setCarBodyVolume(int carBodyVolume) {
        this.carBodyVolume = carBodyVolume;
    }


    @Override
    public String toString() {
        return    id +"."+"Model: " +vehicleManufacturer +" "+model+ " ,"+ cargoCapacity +" cargoCapacity, "+carBodyVolume+" carBodyVolume"+ "price/day: "+price;
    }
}
