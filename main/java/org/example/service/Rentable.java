package org.example.service;

public interface Rentable {
    void rent(int id);
    double countPrice(int id,int days);
    void returnVehicle(int id);

}

