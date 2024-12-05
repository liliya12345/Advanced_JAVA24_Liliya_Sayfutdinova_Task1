package org.example.model;

import org.example.service.Rentable;
//class Vehicle som implements av interface Rentable med constructor
abstract class Vehicle implements Rentable {
    protected  int id;
    protected String vehicleManufacturer;
    protected int price;
    protected boolean rented;
    protected String regNumber;
    protected int yearProduction;
    protected String model;


    public Vehicle(int id,String vehicleManufacturer, int price, boolean rented, String regNumber, int yearProduction, String model) {
        this.id=id;
        this.vehicleManufacturer = vehicleManufacturer;
        this.price = price;
        this.rented = rented;
        this.regNumber = regNumber;
        this.yearProduction = yearProduction;
        this.model = model;
    }

    public String getVehicleManufacturer() {
        return vehicleManufacturer;
    }

    public void setVehicleManufacturer(String vehicleManufacturer) {
        this.vehicleManufacturer = vehicleManufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void rent(int id) {

    }

    @Override
    public double countPrice(int id, int days) {
        return 0;
    }

    @Override
    public void returnVehicle(int id) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


