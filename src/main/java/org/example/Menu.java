package org.example;

import org.example.dto.VehicleDto;
import org.example.service.CarService;
import org.example.service.VehicleService;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    MenuProgram menuProgram = new MenuProgram();
    CarService carService = new CarService();
    VehicleService vehicleService = new VehicleService();


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
                    System.out.println("Enter the number of the car you want to rent");
                    int carId = scanner.nextInt();
                    System.out.println("Enter the number of days you want to rent");
                    int days = scanner.nextInt();
                    double priceOfRent = carService.countPrice(carId, days);
                    if (priceOfRent == 0) System.out.println("Invalid input");
                    else {
                        System.out.println("Your rent of the car costs  " + priceOfRent);
                        System.out.println("Would you like to rent the car? yes/no");
                        String answer = scanner.next();
                        if (answer.equalsIgnoreCase("yes")) {
                            carService.rent(carId);
                            System.out.println("Congratulations, you rent the car");
                        }

                    }


                }
                case 5 -> {
                    System.out.println("The list of rented cars");
                    List<VehicleDto> listVehiclesRented = vehicleService.getListVehiclesRented();
                    listVehiclesRented.forEach(System.out::println);
                    if (listVehiclesRented.size() == 0) {
                        System.out.println("You dont have a rented car to return");
                    } else {
                        System.out.println("Enter the number of the car you want to return");
                        int carId = scanner.nextInt();
                        VehicleDto vehicle = listVehiclesRented.stream()
                                .filter(vehicleDto -> vehicleDto.getId() == carId).findFirst().orElse(null);
                        vehicleService.returnVehicle(vehicle);
                    }

                }
            }
            if (choice != 0) {

                menuProgram.menuProgram();
            }

        } while (choice != 0);
        System.out.println("bye");
    }
}

//TODO case 2-4