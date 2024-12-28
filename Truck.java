// Truck.java
class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate, double loadCapacity) {
        super(vehicleId, model, baseRentalRate);
        if (loadCapacity <= 0) {
            throw new IllegalArgumentException("Load capacity must be greater than zero");
        }
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + loadCapacity * 0.1 * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}