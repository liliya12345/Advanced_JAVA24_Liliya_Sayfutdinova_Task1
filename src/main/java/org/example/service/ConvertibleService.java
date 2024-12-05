package org.example.service;

import org.example.model.Convertible;
import org.example.repo.ConvertibleRepo;

import java.util.List;
// Class ConvertibleService som implements från Rentable Interface
public class ConvertibleService implements Rentable{
    ConvertibleRepo convertibleRepo= new ConvertibleRepo();

    public List<Convertible> findAllFreeCar(){
        return convertibleRepo.findAll().stream().filter(convertible -> !convertible.isRented()).toList();
    }
    public List<Convertible> getRentedConvertible(){
        return convertibleRepo.findAll().stream().filter(convertible -> convertible.isRented()).toList();

    }

    //overwrite metod från Interface som rent a vehicle by id
    @Override
    public void rent(int id) {
      convertibleRepo.rentConvertible(id);
    }
    //overwrite metod från Interface som count price
    @Override
    public double countPrice(int id, int days) {
        Convertible convertible = convertibleRepo.findById(id);
        if (convertible!=null) {
            return convertible.getPrice()*days;
        }
        else return 0;
    }
    //overwrite metod från Interface som return  a vehicle by id
    @Override
    public void returnVehicle(int id) {
    convertibleRepo.returnConvertible(id);
    }
}
