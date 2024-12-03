package org.example.dto;

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

    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    public String getVehicleManufacturer() {
        return vehicleManufacturer;
    }

    public void setVehicleManufacturer(String vehicleManufacturer) {
        this.vehicleManufacturer = vehicleManufacturer;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
//TODO rewrite
    @Override
    public String toString() {
        return "VehicleDto{" +
                "id=" + id +
                ", typeVehicle='" + typeVehicle + '\'' +
                ", vehicleManufacturer='" + vehicleManufacturer + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                '}';
    }
}
