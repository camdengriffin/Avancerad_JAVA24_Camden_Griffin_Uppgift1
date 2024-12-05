package CarRentals;

public class Car extends Vehicle implements Rentable { // the Car class extends Vehicle and implements Rentable

    // the constructor for the Car class, gives the following properties
    public Car(String model, int year, String color, int seats, double rentalPrice, boolean available) {
        super(model, year, color, seats, rentalPrice, available); // calls the parent class constructor to set up the car's properties
    }

    @Override // this method displays the car's details
    public void displayDetails() {
        System.out.println("Model: " + getModel()); // displays the car's model
        System.out.println("Year: " + getYear()); // the car's year
        System.out.println("Color: " + getColor()); // the car's color
        System.out.println("Seats: " + getSeats()); // number of seats in the car
        System.out.println("Rental Price: $" + getRentalPrice() + " an hour"); // the car's rental price per hour
        System.out.println("\n==============+=+==============\n");
    }

    @Override // this method rents the car if it's available
    public void rentVehicle() {
        if (isAvailable()) { // checks if the car is available for rent
            setAvailability(false); // sets the car's availability to false
            System.out.println("\nThe car has been rented."); // confirms the car has been rented
        } else {
            System.out.println("\nThis car is already rented."); // if the car is not available, this message is displayed
        }
    }

    @Override // this method returns the car if it was rented
    public void returnVehicle() {
        if (!isAvailable()) { // checks if the car is not available
            setAvailability(true); // sets the car's availability to true
            System.out.println("\nThe car has been returned."); // confirms the car has been returned
        } else {
            System.out.println("\nThis car was not rented."); // if the car was not rented, this message is displayed
        }
    }

    @Override // this method calculates the rental cost based on the time the car is rented for
    public double calculateCost(int time) {
        return getRentalPrice() * time; // multiplies the rental price by the number of hours rented to calculate the total cost
    }
}
