package CarRentals;

public interface Rentable {
    void rentVehicle();
    void returnVehicle();
    double calculateCost(int time);
}
