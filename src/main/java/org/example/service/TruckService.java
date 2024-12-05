package org.example.service;
import org.example.model.Truck;
import org.example.repo.TruckRepo;

import java.util.List;
// Class TruckService som implements från Rentable Interface
public class TruckService implements Rentable {
    TruckRepo truckRepo = new TruckRepo();

    public List<Truck> getAllFreeTruck(){
        return truckRepo.findAll().stream()
                .filter(car -> !car.isRented()).toList();
    }
    public List<Truck> getRentedTruck(){
        return truckRepo.findAll().stream()
                .filter(car -> car.isRented()).toList();
    }
    //overwrite metod från Interface som rent a vehicle by id
    @Override
    public void rent(int id) {
        truckRepo.rentTruck(id);

    }
    //overwrite metod från Interface som count price
    @Override
    public double countPrice(int id, int days) {
       Truck byId = truckRepo.findById(id);
        if(byId!=null){
            return byId.getPrice() * days;
        }
        return 0;
    }
    //overwrite metod från Interface som return  a vehicle by id
    @Override
    public void returnVehicle(int id) {
        truckRepo.returnTruck(id);
    }
}

