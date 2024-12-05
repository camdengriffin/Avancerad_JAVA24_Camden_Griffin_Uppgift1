package CarRentals;

public class Truck extends Vehicle implements Rentable {

    // this is the constructor for the truck with the given properties
    public Truck(String model, int year, String color, int seats, double rentalPrice, boolean available) {
        super(model, year, color, seats, rentalPrice, available); // calls the constructor to set up the truck's properties
    }

    @Override // this method displays the truck's details
    public void displayDetails() {
        System.out.println("Model: " + getModel()); // displays the truck's model
        System.out.println("Year: " + getYear()); // displays the truck's year
        System.out.println("Color: " + getColor()); // displays the truck's color
        System.out.println("Seats: " + getSeats()); // displays the number of seats in the truck
        System.out.println("Rental Price: $" + getRentalPrice() + " an hour"); // displays the rental price per hour for the truck
        System.out.println("\n==============+=+==============\n");
    }

    @Override // this method rents the truck if it's available
    public void rentVehicle() {
        if (isAvailable()) { // checks if the truck is available for rent
            setAvailability(false); // sets the truck's availability to false
            System.out.println("\nThe truck has been rented."); // confirms the truck has been rented
        } else {
            System.out.println("\nThis truck is already rented."); // if the truck is not available, this message is displayed
        }
    }

    @Override // this method returns the truck if it was rented
    public void returnVehicle() {
        if (!isAvailable()) { // checks if the truck is not availablee
            setAvailability(true); // sets the truck's availability to true
            System.out.println("\nThe truck has been returned."); // confirms the truck has been returned
        } else {
            System.out.println("\nThis truck was not rented."); // if the truck was not rented, this message is displayed
        }
    }

    @Override // this method calculates the rental cost based on the time the truck is rented for
    public double calculateCost(int time) {
        return getRentalPrice() * time; // multiplies the rental price by the number of hours rented to calculate the total cost
    }
}
