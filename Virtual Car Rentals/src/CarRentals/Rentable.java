package CarRentals;

public interface Rentable { // this defines the Rentable interface
    void rentVehicle(); // this method allows renting a vehicle
    void returnVehicle(); // this method allows returning a rented vehicle
    double calculateCost(int time); // this method calculates the cost of renting a vehicle for a specified amount of time, in hourds
}
