package CarRentals;

public class SUV extends Vehicle implements Rentable {

    // this is the constructor for the SUV claas with the given properties
    public SUV(String model, int year, String color, int seats, double rentalPrice, boolean available) {
        super(model, year, color, seats, rentalPrice, available); // calls the parent class constructor to set up the SUV's properties
    }

    @Override // this method displays the SUV's details
    public void displayDetails() {
        System.out.println("Model: " + getModel()); // displays the SUV's model
        System.out.println("Year: " + getYear()); // displays the SUV's year
        System.out.println("Color: " + getColor()); // displays the SUV's color
        System.out.println("Seats: " + getSeats()); // displays the number of seats in the SUV
        System.out.println("Rental Price: $" + getRentalPrice() + " an hour"); // displays the rental price per hour for the SUV
        System.out.println("\n==============+=+==============\n");
    }

    @Override // this method rents the SUV if it's available
    public void rentVehicle() {
        if (isAvailable()) { // checks if the SUV is available for rent
            setAvailability(false); // sets the SUV's availability to false
            System.out.println("\nThe SUV has been rented."); // confirms the SUV has been rented
        } else {
            System.out.println("\nThis SUV is already rented."); // if the SUV is not available, this message is displayed
        }
    }

    @Override // this method returns the SUV if it was rented
    public void returnVehicle() {
        if (!isAvailable()) { // checks if the SUV is not available
            setAvailability(true); // sets the SUV's availability to true
            System.out.println("\nThe SUV has been returned."); // confirms the SUV has been returned
        } else {
            System.out.println("\nThis SUV was not rented."); // if the SUV was not rented, this message is displayed
        }
    }

    @Override // this method calculates the rental cost based on the time the SUV is rented for
    public double calculateCost(int time) {
        return getRentalPrice() * time; // multiplies the rental price by the number of hours rented to calculate the total cost
    }
}
