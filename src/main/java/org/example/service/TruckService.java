package org.example.service;
import org.example.model.Truck;
import org.example.repo.TruckRepo;

import java.util.List;

public class TruckService implements Rentable {
    TruckRepo truckRepo = new TruckRepo();

    public List<Truck> getAll(){
        return truckRepo.findAll();
    }
    public List<Truck> getAllFreeTruck(){
        return truckRepo.findAll().stream()
                .filter(car -> !car.isRented()).toList();
    }
    public List<Truck> getRentedTruck(){
        return truckRepo.findAll().stream()
                .filter(car -> car.isRented()).toList();
    }

    @Override
    public void rent(int id) {
        truckRepo.rentTruck(id);

    }

    @Override
    public double countPrice(int id, int days) {
       Truck byId = truckRepo.findById(id);
        if(byId!=null){
            return byId.getPrice() * days;
        }
        return 0;
    }

    @Override
    public void returnVehicle(int id) {
        truckRepo.returnTruck(id);
    }
}

