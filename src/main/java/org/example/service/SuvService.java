package org.example.service;
import org.example.model.Car;
import org.example.model.SUV;
import org.example.repo.SuvRepo;
import java.util.List;

public class SuvService implements Rentable {
    SuvRepo suvRepo = new SuvRepo();

    public List<SUV> getAllFreeSuv(){
        return suvRepo.findAll().stream()
                .filter(car -> !car.isRented()).toList();
    }
    public List<SUV> getRentedSuv(){
        return suvRepo.findAll().stream()
                .filter(car -> car.isRented()).toList();
    }

    @Override
    public void rent(int id) {
        suvRepo.rentSuv(id);

    }

    @Override
    public double countPrice(int id, int days) {
        Car byId = suvRepo.findById(id);
        if(byId!=null){
            return byId.getPrice() * days;
        }
        return 0;
    }

    @Override
    public void returnVehicle(int id) {
        suvRepo.returnSuv(id);
    }
}

