package org.example;

import org.example.service.Rentable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuOption {

    public void rentAction(Scanner scanner, Rentable rentable) {


        System.out.println("Enter the number of the vehicle you want to rent");
        int carId = 0;
        int days=1;
        try {
            carId = scanner.nextInt();
            System.out.println("Enter the number of days you want to rent");
             days = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            return;
        }

        double priceOfRent = rentable.countPrice(carId, days);
        if (priceOfRent <= 0.0) {
            System.out.println("Invalid input ");
        } else {
            System.out.println("Your rent of the vehicle costs  " + priceOfRent);
            System.out.println("Would you like to rent the vehicle? yes/no");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("yes")) {
                rentable.rent(carId);
                System.out.println("Congratulations, you rent the vehicle");
            }

        }
    }
}
