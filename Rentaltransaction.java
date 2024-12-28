// RentalTransaction.java
class RentalTransaction {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;

    public RentalTransaction(Vehicle vehicle, Customer customer, int rentalDays) {
        if (vehicle == null || customer == null || rentalDays <= 0) {
            throw new IllegalArgumentException("Invalid rental transaction details");
        }
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return vehicle.calculateRentalCost(rentalDays);
    }

    @Override
    public String toString() {
        return "RentalTransaction [vehicle=" + vehicle + ", customer=" + customer + ", rentalDays=" + rentalDays + "]";
    }
}
