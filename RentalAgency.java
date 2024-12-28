// RentalAgency.java
import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException("Cannot add a null vehicle to the fleet");
        }
        fleet.add(vehicle);
    }

    public void rentVehicle(String vehicleId, Customer customer, int days) {
        if (vehicleId == null || customer == null || days <= 0) {
            throw new IllegalArgumentException("Invalid rental request");
        }
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                vehicle.setAvailable(false);
                RentalTransaction transaction = new RentalTransaction(vehicle, customer, days);
                transactions.add(transaction);
                System.out.println("Vehicle rented successfully: " + transaction);
                return;
            }
        }
        System.out.println("Vehicle not available for rental.");
    }

    public void returnVehicle(String vehicleId) {
        if (vehicleId == null) {
            throw new IllegalArgumentException("Invalid vehicle ID");
        }
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                vehicle.setAvailable(true);
                System.out.println("Vehicle returned successfully: " + vehicle);
                return;
            }
        }
        System.out.println("Vehicle not found in the fleet.");
    }
}
