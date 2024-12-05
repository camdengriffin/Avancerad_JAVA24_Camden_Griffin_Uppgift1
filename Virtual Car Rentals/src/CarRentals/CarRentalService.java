package CarRentals;

import java.util.Scanner;

public class CarRentalService {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle car = new Car("Toyota Corolla", 2023, "White", 5, 50.0, true);
        Vehicle suv = new SUV("Volvo XC90", 2022, "Black", 7, 75.0, true);
        Vehicle truck = new Truck("Ford F-150", 2021, "Silver", 5, 100.0, true);
        Vehicle convertible = new Convertible("Mazda MX-5 Miata", 2024, "Red", 2, 125.0, true);

        while (true) {
            System.out.println("\nWelcome to the Vehicle Rental Service!\n");
            System.out.println("1. View Vehicles");
            System.out.println("2. Rent a Vehicle");
            System.out.println("3. Return a Vehicle");
            System.out.println("4. Exit\n");

            System.out.print("Your answer: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nVehicle details: ");
                    System.out.println("==============+=+==============\n");
                    car.displayDetails();
                    suv.displayDetails();
                    truck.displayDetails();
                    convertible.displayDetails();
                    break;
                case 2:
                    System.out.println("\n1. Rent the Car");
                    System.out.println("2. Rent the SUV");
                    System.out.println("3. Rent the Truck");
                    System.out.println("4. Rent the Convertible");
                    System.out.println("\nEnter 1-4 to select the car:");
                    System.out.print("\nYour answer: ");
                    int rentChoice = scanner.nextInt();
                    if (rentChoice == 1) {
                        Rentable rentableCar = (Rentable) car;

                        if (car.isAvailable()) {
                            System.out.print("\nHow many hours would you like to rent it for?: ");
                            int time = scanner.nextInt();
                            rentableCar.rentVehicle();
                            System.out.println("Total cost: $" + rentableCar.calculateCost(time));
                        } else {
                            System.out.println("\nThis car is not available.");
                        }

                    } else if (rentChoice == 2) {
                        Rentable rentableSUV = (Rentable) suv;

                        if (suv.isAvailable()) {
                            System.out.print("\nHow many hours would you like to rent it for?: ");
                            int time = scanner.nextInt();
                            rentableSUV.rentVehicle();
                            System.out.println("Total cost: $" + rentableSUV.calculateCost(time));
                        } else {
                            System.out.println("\nThis SUV is not available.");
                        }

                    } else if (rentChoice == 3) {
                        Rentable rentableTruck = (Rentable) truck;

                        if (truck.isAvailable()) {
                            System.out.print("\nHow many hours would you like to rent it for?: ");
                            int time = scanner.nextInt();
                            rentableTruck.rentVehicle();
                            System.out.println("Total cost: $" + rentableTruck.calculateCost(time));
                        } else {
                            System.out.println("\nThis truck is not available.");
                        }

                    } else if (rentChoice == 4) {
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
                case 3:
                    System.out.println("\n1. Return the Car");
                    System.out.println("2. Return the SUV");
                    System.out.println("3. Return the Truck");
                    System.out.println("4. Return the Convertible");
                    System.out.println("\nEnter 1-4 to select the car:");
                    System.out.print("\nYour answer: ");
                    int returnChoice = scanner.nextInt();
                    if (returnChoice == 1) {
                        Rentable rentableCar = (Rentable) car;
                        rentableCar.returnVehicle();
                    } else if (returnChoice == 2) {
                        Rentable rentableSUV = (Rentable) suv;
                        rentableSUV.returnVehicle();
                    } else if (returnChoice == 3) {
                        Rentable rentableTruck = (Rentable) truck;
                        rentableTruck.returnVehicle();
                    } else if (returnChoice == 4) {
                        Rentable rentableConvertible = (Rentable) convertible;
                        rentableConvertible.returnVehicle();
                    }
                    break;
                case 4:
                    System.out.println("\nThank you for using the Vehicle Rental Service!");
                    return;
                default:
                    System.out.println("\nInvalid choice. Try again.");
            }
        }
    }
}
