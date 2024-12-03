package org.example.repo;

import org.example.model.Convertible;
import org.example.model.enums.TypeOfEngine;
import org.example.model.enums.TypeOfGearBox;
import org.example.model.enums.TypeOfRoof;

import java.util.ArrayList;
import java.util.List;

public class ConvertibleRepo {
    public List<Convertible> findAllConvertibles() {
        return List.of(new Convertible(13,"Aston Martin",95,false,"SDF123",2024,"DB12 Volante",5,5, TypeOfGearBox.AUTOMATIC, TypeOfEngine.PETROL, TypeOfRoof.WITHOUT),
                new Convertible(14,"Audi",95,false,"SDD563",2024,"A5",5,5, TypeOfGearBox.AUTOMATIC, TypeOfEngine.ELECTRIC, TypeOfRoof.WITHOUT),
                new Convertible(15,"Bentley",125,false,"XCF123",2024,"Continental GT",2,3, TypeOfGearBox.AUTOMATIC, TypeOfEngine.PETROL, TypeOfRoof.WITHOUT),
                new Convertible(16,"Maserati",175,false,"LOP234",2024,"GranCabrio",5,5, TypeOfGearBox.AUTOMATIC, TypeOfEngine.PETROL, TypeOfRoof.WITHOUT),
                new Convertible(17,"BMW",85,false,"SDZ453",2022,"M4",5,5, TypeOfGearBox.AUTOMATIC, TypeOfEngine.PETROL, TypeOfRoof.FOLDING),
                new Convertible(18,"BMW",96,false,"RDF123",2024,"M5",5,5, TypeOfGearBox.AUTOMATIC, TypeOfEngine.PETROL, TypeOfRoof.FOLDING));
    }
}
