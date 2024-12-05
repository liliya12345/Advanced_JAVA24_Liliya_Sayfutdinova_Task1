package org.example.service;
//Interface som inehåller 3 metoder utan realisering
public interface Rentable {
    void rent(int id);
    double countPrice(int id,int days);
    void returnVehicle(int id);


}

