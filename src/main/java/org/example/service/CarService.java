package org.example.service;

import org.example.model.Car;
import org.example.repo.CarRepo;

import java.util.List;
// Class CarService som implements från Rentable Interface
public class CarService implements Rentable {
   CarRepo carRepo = new CarRepo();

    public List<Car> getAll(){
        return carRepo.findAll();
    }
    public List<Car> getAllFreeCar(){
        return carRepo.findAll().stream()
                .filter(car -> !car.isRented()).toList();
    }
    public List<Car> getRentedCar(){
        return carRepo.findAll().stream()
                .filter(car -> car.isRented()).toList();
    }
//overwrite metod från Interface som rent a vehicle by id
    @Override
    public void rent(int id) {
        carRepo.rentCar(id);

    }
    //overwrite metod från Interface som count price
    @Override
    public double countPrice(int id, int days) {
        Car byId = carRepo.findById(id);
        if(byId!=null){
            return byId.getPrice() * days;
        }
        return 0;
    }
    //overwrite metod från Interface som return  a vehicle by id
    @Override
    public void returnVehicle(int id) {
       carRepo.returnCar(id);
    }
}
