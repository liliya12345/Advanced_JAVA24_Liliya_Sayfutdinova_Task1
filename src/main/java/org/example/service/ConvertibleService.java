package org.example.service;

import org.example.model.Convertible;
import org.example.repo.ConvertibleRepo;

import java.util.List;

public class ConvertibleService implements Rentable{
    ConvertibleRepo convertibleRepo= new ConvertibleRepo();

    public List<Convertible> findAllFreeCar(){
        return convertibleRepo.findAll().stream().filter(convertible -> !convertible.isRented()).toList();
    }
    public List<Convertible> getRentedConvertible(){
        return convertibleRepo.findAll().stream().filter(convertible -> convertible.isRented()).toList();

    }


    @Override
    public void rent(int id) {
      convertibleRepo.rentConvertible(id);
    }

    @Override
    public double countPrice(int id, int days) {
        Convertible convertible = convertibleRepo.findById(id);
        if (convertible!=null) {
            return convertible.getPrice()*days;
        }
        else return 0;
    }

    @Override
    public void returnVehicle(int id) {
    convertibleRepo.returnConvertible(id);
    }
}
