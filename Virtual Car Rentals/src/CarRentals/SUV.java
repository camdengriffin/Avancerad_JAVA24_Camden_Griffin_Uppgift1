package CarRentals;

public class SUV extends Vehicle implements Rentable {

    public SUV(String model, int year, String color, int seats, double rentalPrice, boolean available) {
        super(model, year, color, seats, rentalPrice, available);
    }

    @Override
    public void displayDetails() {
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Color: " + getColor());
        System.out.println("Seats: " + getSeats());
        System.out.println("Rental Price: $" + getRentalPrice() + " an hour");
        System.out.println("\n==============+=+==============\n");
    }

    @Override
    public void rentVehicle() {
        if (isAvailable()) {
            setAvailability(false);
            System.out.println("\nThe SUV has been rented.");
        } else {
            System.out.println("\nThis SUV is already rented.");
        }
    }

    @Override
    public void returnVehicle() {
        if (!isAvailable()) {
            setAvailability(true);
            System.out.println("\nThe SUV has been returned.");
        } else {
            System.out.println("\nThis SUV was not rented.");
        }
    }


    @Override
    public double calculateCost(int time) {
        return getRentalPrice() * time;
    }
}
