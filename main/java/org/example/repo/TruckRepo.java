package org.example.repo;

import org.example.model.Truck;

import java.util.List;

public class TruckRepo {
    public List<Truck> findAll(){
        return List.of( new Truck(12,"STILL",30,false,"JKL156",2020,"RX 20 3 Rad",2,9),
        new Truck(7,"STILL",30,false,"MKN156",2020,"R 08",1,8),
        new Truck(8,"STILL",35,false,"LOK156",2020,"R 10rad ",6,10),
        new Truck(9,"STILL",20,false,"SED156",2020,"RX NN",2,5),
        new Truck(10,"STILL",50,false,"KLO156",2020,"RX WSEd",3,20),
        new Truck(11,"STILL",40,false,"MMM156",2020,"RX JZ",2,5)
                );
    }
}
