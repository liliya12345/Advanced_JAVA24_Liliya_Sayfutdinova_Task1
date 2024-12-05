package org.example;

import org.example.dto.VehicleDto;
import org.example.service.*;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    MenuProgram menuProgram = new MenuProgram();
    MenuOption menuOption = new MenuOption();
    CarService carService = new CarService();
    VehicleService vehicleService = new VehicleService();
    TruckService truckService = new TruckService();
    ConvertibleService convertibleService = new ConvertibleService();
    SuvService suvService = new SuvService();



    public void startMenu() {

        menuProgram.menuProgram();
        int choice = -1;
        //Går i loop tills knapp 0 trycks in.
        do {
            //Här visas alla val av menu

            //Här läsas users val av menu
            Scanner scanner = new Scanner(System.in);
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");

                continue;
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("We have the next cars for rent");
                    carService.getAllFreeCar().forEach(System.out::println);
                    menuOption.rentAction(scanner,carService);


                }
                case 2 -> {
                    System.out.println("We have the next `truck` to rent");
                    truckService.getAllFreeTruck().forEach(System.out::println);
                    menuOption.rentAction(scanner,truckService);

                }case 3 -> {
                    System.out.println("We have the next SUV to rent");
                    suvService.getAllFreeSuv().forEach(System.out::println);
                    menuOption.rentAction(scanner,suvService);

                }case 4 -> {
                    System.out.println("We have the next convertible to rent");
                    convertibleService.findAllFreeCar().forEach(System.out::println);
                    menuOption.rentAction(scanner,convertibleService);

                }
                case 5 -> {
                    System.out.println("The list of rented vehicle");
                    List<VehicleDto> listVehiclesRented = vehicleService.getListVehiclesRented();
                    listVehiclesRented.forEach(System.out::println);
                    if (listVehiclesRented.size() == 0) {
                        System.out.println("You dont have a rented vehicle to return");
                    } else {
                        System.out.println("Enter the number of the vehicle you want to return");
                        int vehicleId = scanner.nextInt();
                        VehicleDto vehicle = listVehiclesRented.stream()
                                .filter(vehicleDto -> vehicleDto.getId() == vehicleId).findFirst().orElse(null);
                        vehicleService.returnVehicle(vehicle);
                    }

                }
                default -> System.out.println("Invalid choice");
            }
            if (choice != 0) {

                menuProgram.menuProgram();
            }

        } while (choice != 0);
        System.out.println("bye");
    }
}

//TODO case 2-4