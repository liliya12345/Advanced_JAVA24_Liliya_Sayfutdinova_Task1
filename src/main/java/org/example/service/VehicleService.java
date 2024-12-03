package org.example.service;

import org.example.dto.VehicleDto;
import org.example.model.Car;

import java.util.ArrayList;
import java.util.List;

public class VehicleService  {
    CarService carService = new CarService();
    TruckService truckService= new TruckService();
    ConvertibleService convertibleService = new ConvertibleService();
    SuvService suvService = new SuvService();

    public List<VehicleDto> getListVehiclesRented(){
        List<VehicleDto> vehicleDtos = new ArrayList<>();
        for (Car car : carService.getRentedCar()) {
            vehicleDtos.add(new VehicleDto(car.getId(),"Car",car.getVehicleManufacturer(),car.getModel()));
        }

//TODO add another services;

        return vehicleDtos;
    }

   public void returnVehicle(VehicleDto vehicleDto){
        switch (vehicleDto.getTypeVehicle()){
            case "Car"->{
                carService.returnVehicle(vehicleDto.getId());
            }
                case"Suv"->{
                    //TODO
                }
                case"Truck"->{
                    //TODO
                }
                case"Convertible"->{
                    //TODO
                }
        }
   }
}
