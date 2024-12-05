package CarRentals;

import java.util.Scanner;

public class CarRentalService {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creates a new Scanner object to read input from the user

        // creates instances of different types of vehicles and adds details
        Vehicle car = new Car("Toyota Corolla", 2023, "White", 5, 50.0, true);
        Vehicle suv = new SUV("Volvo XC90", 2022, "Black", 7, 75.0, true);
        Vehicle truck = new Truck("Ford F-150", 2021, "Silver", 5, 100.0, true);
        Vehicle convertible = new Convertible("Mazda MX-5 Miata", 2024, "Red", 2, 125.0, true);

        // loops until the user exits
        while (true) {
            // prints menu options for the user
            System.out.println("\nWelcome to the Vehicle Rental Service!\n");
            System.out.println("1. View Vehicles");
            System.out.println("2. Rent a Vehicle");
            System.out.println("3. Return a Vehicle");
            System.out.println("4. Exit\n");

            System.out.print("Your answer: "); // asks the user for input
            int choice = scanner.nextInt(); // reads the users choice as a int

            // switch case handles different options selected by the user
            switch (choice) {
                case 1: // if the user chooses 1, show vehicle details
                    System.out.println("\nVehicle details: ");
                    System.out.println("==============+=+==============\n");
                    car.displayDetails(); // displays details for the car
                    suv.displayDetails(); // displays details for the SUV
                    truck.displayDetails(); // displays details for the truck
                    convertible.displayDetails(); // displays details for the convertible
                    break;
                case 2: // if the user chooses 2, rent a vehicle
                    System.out.println("\n1. Rent the Car");
                    System.out.println("2. Rent the SUV");
                    System.out.println("3. Rent the Truck");
                    System.out.println("4. Rent the Convertible");
                    System.out.println("\nEnter 1-4 to select the car:");
                    System.out.print("\nYour answer: ");
                    int rentChoice = scanner.nextInt(); // reads the user's choice for renting a vehicle

                    // the following checks if the selected vehicle is available and processes the rental
                    if (rentChoice == 1) { // if the user chooses the car
                        Rentable rentableCar = (Rentable) car; // casts the car to Rentable

                        if (car.isAvailable()) { // checks if the car is available
                            System.out.print("\nHow many hours would you like to rent it for?: ");
                            int time = scanner.nextInt(); // reads the rental time from the user
                            rentableCar.rentVehicle(); // rents the car
                            System.out.println("Total cost: $" + rentableCar.calculateCost(time)); // calculates and shows the rental cost
                        } else {
                            System.out.println("\nThis car is not available."); // if the car is not available
                        }

                    } else if (rentChoice == 2) { // same process for renting the SUV
                        Rentable rentableSUV = (Rentable) suv;

                        if (suv.isAvailable()) {
                            System.out.print("\nHow many hours would you like to rent it for?: ");
                            int time = scanner.nextInt();
                            rentableSUV.rentVehicle();
                            System.out.println("Total cost: $" + rentableSUV.calculateCost(time));
                        } else {
                            System.out.println("\nThis SUV is not available.");
                        }

                    } else if (rentChoice == 3) { // same process for renting the truck
                        Rentable rentableTruck = (Rentable) truck;

                        if (truck.isAvailable()) {
                            System.out.print("\nHow many hours would you like to rent it for?: ");
                            int time = scanner.nextInt();
                            rentableTruck.rentVehicle();
                            System.out.println("Total cost: $" + rentableTruck.calculateCost(time));
                        } else {
                            System.out.println("\nThis truck is not available.");
                        }

                    } else if (rentChoice == 4) { // same process for renting the convertible
                        Rentable rentableConvertible = (Rentable) convertible;

                        if (convertible.isAvailable()) {
                            System.out.print("\nHow many hours would you like to rent it for?: ");
                            int time = scanner.nextInt();
                            rentableConvertible.rentVehicle();
                            System.out.println("Total cost: $" + rentableConvertible.calculateCost(time));
                        } else {
                            System.out.println("\nThis convertible is not available.");
                        }

                    }
                    break;
                case 3: // if the user chooses 3, return a vehicle
                    System.out.println("\n1. Return the Car");
                    System.out.println("2. Return the SUV");
                    System.out.println("3. Return the Truck");
                    System.out.println("4. Return the Convertible");
                    System.out.println("\nEnter 1-4 to select the car:");
                    System.out.print("\nYour answer: ");
                    int returnChoice = scanner.nextInt(); // reads the uses choice for returning a vehicle

                    // the following processes the return of the selected vehicle
                    if (returnChoice == 1) { // if the user chooses to return the car
                        Rentable rentableCar = (Rentable) car;
                        rentableCar.returnVehicle(); // returns the car
                    } else if (returnChoice == 2) { // if the user chooses to return the SUV
                        Rentable rentableSUV = (Rentable) suv;
                        rentableSUV.returnVehicle(); // returns the SUV
                    } else if (returnChoice == 3) { // if the user chooses to return the truck
                        Rentable rentableTruck = (Rentable) truck;
                        rentableTruck.returnVehicle(); // returns the truck
                    } else if (returnChoice == 4) { // if the user chooses to return the convertible
                        Rentable rentableConvertible = (Rentable) convertible;
                        rentableConvertible.returnVehicle(); // returns the convertible
                    }
                    break;
                case 4: // if the user chooses 4, exit the program
                    System.out.println("\nThank you for using the Vehicle Rental Service!"); // shows a thank you message
                    return; // ends the program
                default: // if the user enters an invalid option
                    System.out.println("\nInvalid choice. Try again."); // asks the user to try again
            }
        }
    }
}
