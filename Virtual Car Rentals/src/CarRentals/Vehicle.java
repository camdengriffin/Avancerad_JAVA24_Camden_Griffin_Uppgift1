package CarRentals;

public abstract class Vehicle {

    private String model; // this defines the model of the vehicle
    private int year; // this defines the year of the vehicle
    private String color; // this defines the color of the vehicle
    private int seats; // this defines the number of seats in the vehicle
    private double rentalPrice; // this defines the rental price per hour for the vehicle
    private boolean available; // this defines whether the vehicle is available for rent (true = available, false = not available)

    // the constructor for the Vehicle class, which gives the vehicle's properties
    public Vehicle(String model, int year, String color, int seats, double rentalPrice, boolean available) {
        this.model = model; // sets the model of the vehicle
        this.year = year; // sets the year of the vehicle
        this.color = color; // sets the color of the vehicle
        this.seats = seats; // sets the number of seats in the vehicle
        this.rentalPrice = rentalPrice; // sets the rental price of the vehicle
        this.available = available; // sets the availability status of the vehicle
    }

    // returns the model of the vehicle
    public String getModel() {
        return model;
    }

    // returns the year of the vehicle
    public int getYear() {
        return year;
    }

    // returns the color of the vehicle
    public String getColor() {
        return color;
    }

    // returns the number of seats in the vehicle
    public int getSeats() {
        return seats;
    }

    // returns the rental price of the vehicle
    public double getRentalPrice() {
        return rentalPrice;
    }

    // returns if the vehicle is available for rent
    public boolean isAvailable() {
        return available;
    }

    // sets the availability of the vehicle
    public void setAvailability(boolean available) {
        this.available = available;
    }

    // an abstract method that will be implemented by subclasses to display vehicle details
    public abstract void displayDetails();
}
