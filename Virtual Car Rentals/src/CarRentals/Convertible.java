package CarRentals;

public class Convertible extends Vehicle implements Rentable {

    // the constructor for the Convertible class with the given properties
    public Convertible(String model, int year, String color, int seats, double rentalPrice, boolean available) {
        super(model, year, color, seats, rentalPrice, available); // calls the parent class constructor to set up the convertible's properties
    }

    @Override // this method displays the convertible's details
    public void displayDetails() {
        System.out.println("Model: " + getModel()); // displays the convertible's model
        System.out.println("Year: " + getYear()); // displays the convertible's year
        System.out.println("Color: " + getColor()); // displays the convertible's color
        System.out.println("Seats: " + getSeats()); // displays the number of seats in the convertible
        System.out.println("Rental Price: $" + getRentalPrice() + " an hour"); // displays the rental price per hour for the convertible
        System.out.println("\n==============+=+==============\n");
    }

    @Override // this method rents the convertible if its available
    public void rentVehicle() {
        if (isAvailable()) { // checks if the convertible is available for rent
            setAvailability(false); // sets the convertible's availability to false
            System.out.println("\nThe convertible has been rented."); // confirms the convertible has been rented
        } else {
            System.out.println("\nThis convertible is already rented."); // if the convertible is not available, this message is displayed
        }
    }

    @Override // this method returns the convertible if it was rented
    public void returnVehicle() {
        if (!isAvailable()) { // checks if the convertible is not available
            setAvailability(true); // sets the convertible's availability to true
            System.out.println("\nThe convertible has been returned."); // confirms the convertible has been returned
        } else {
            System.out.println("\nThis convertible was not rented."); // if the convertible was not rented, this message is displayed
        }
    }

    @Override // this method calculates the rental cost based on the time the convertible is rented for
    public double calculateCost(int time) {
        return getRentalPrice() * time; // multiplies the rental price by the number of hours rented to calculate the total cost
    }
}
