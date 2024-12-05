package org.example.service;

import org.example.dto.VehicleDto;
import org.example.model.Car;
import org.example.model.Convertible;
import org.example.model.SUV;
import org.example.model.Truck;

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
        for (SUV suv : suvService.getRentedSuv()) {
            vehicleDtos.add(new VehicleDto(suv.getId(),"SUV",suv.getVehicleManufacturer(),suv.getModel()));
        }for (Truck truck : truckService.getRentedTruck()) {
            vehicleDtos.add(new VehicleDto(truck.getId(),"Truck",truck.getVehicleManufacturer(),truck.getModel()));
        }
        for (Convertible convertible : convertibleService.getRentedConvertible()) {
            vehicleDtos.add(new VehicleDto(convertible.getId(),"Convertible",convertible.getVehicleManufacturer(),convertible.getModel()));
        }

        return vehicleDtos;
    }

   public void returnVehicle(VehicleDto vehicleDto){
        switch (vehicleDto.getTypeVehicle()){
            case "Car"->{
                carService.returnVehicle(vehicleDto.getId());
            }
                case"Suv"->{
                    suvService.returnVehicle(vehicleDto.getId());
                }
                case"Truck"->{
                    truckService.returnVehicle(vehicleDto.getId());
                }
                case"Convertible"->{
                    convertibleService.returnVehicle(vehicleDto.getId());
                }
        }
   }
}
