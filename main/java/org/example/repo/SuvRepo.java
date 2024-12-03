package org.example.repo;

import org.example.model.SUV;
import org.example.model.enums.DriveOfType;
import org.example.model.enums.TypeOfEngine;
import org.example.model.enums.TypeOfGearBox;

import java.util.List;

public class SuvRepo {
    public List<SUV> findAll() {
        return  List.of( new SUV(19,"Volvo",100,false,"989JUH",2021,"XC90",7,5, TypeOfGearBox.AUTOMATIC, TypeOfEngine.DIESEL, DriveOfType.AWD),
                new SUV(20,"Porsche",150,false,"945JUH",2021,"Macan S",7,5, TypeOfGearBox.AUTOMATIC, TypeOfEngine.DIESEL, DriveOfType.AWD),
                new SUV(21,"Toyota",80,false,"349JUH",2021,"C-HR Hybrid",5,5, TypeOfGearBox.MANUAL, TypeOfEngine.HYBRID, DriveOfType.RWD),
                new SUV(22,"Volkswagen",70,false,"169JUH",2022,"Taigo 1.0 TSI OPF",5,5, TypeOfGearBox.AUTOMATIC, TypeOfEngine.DIESEL, DriveOfType.FOUR_WD),
                new SUV(23,"Citroën",70,false,"679JUH",2024,"C5 Aircross Hybrid",5,5, TypeOfGearBox.MANUAL, TypeOfEngine.PETROL, DriveOfType.AWD),
                new SUV(24,"Porsche",100,false,"888JUH",2023,"Cayenne E-Hybrid",5,5, TypeOfGearBox.AUTOMATIC, TypeOfEngine.HYBRID, DriveOfType.AWD)


                );
    }
}
//TODO change List tot static final
