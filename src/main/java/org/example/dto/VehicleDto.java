package org.example.dto;
//Data Transfer Object används för att kapsla in data
public class VehicleDto {
    private int id;
    private String typeVehicle;
    private String vehicleManufacturer;
    private String vehicleModel;

    public VehicleDto(int id, String typeVehicle, String vehicleManufacturer, String vehicleModel) {
        this.id = id;
        this.typeVehicle = typeVehicle;
        this.vehicleManufacturer = vehicleManufacturer;
        this.vehicleModel = vehicleModel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeVehicle() {
        return typeVehicle;
    }


    @Override
    public String toString() {
        return
                id+". Model: "+  typeVehicle+" , "+vehicleManufacturer+", "+vehicleModel;
    }
}
