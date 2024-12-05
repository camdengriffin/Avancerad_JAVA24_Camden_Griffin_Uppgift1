package CarRentals;

public abstract class Vehicle {
    private String model;
    private int year;
    private String color;
    private int seats;
    private double rentalPrice;
    private boolean available;

    public Vehicle(String model, int year, String color, int seats, double rentalPrice, boolean available) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.seats = seats;
        this.rentalPrice = rentalPrice;
        this.available = available;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getSeats() {
        return seats;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailability(boolean available) {
        this.available = available;
    }

    public abstract void displayDetails();
}
