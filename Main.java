// Main.java
public class Main {
    public static void main(String[] args) {
        RentalAgency rentalAgency = new RentalAgency();

        // Add vehicles to the agency
        Car car = new Car("C001", "Toyota Corolla", 50.0, true);
        Motorcycle motorcycle = new Motorcycle("M001", "Yamaha R15", 30.0, true);
        Truck truck = new Truck("T001", "Ford F-150", 100.0, 1000.0);

        rentalAgency.addVehicle(car);
        rentalAgency.addVehicle(motorcycle);
        rentalAgency.addVehicle(truck);

        // Add a customer
        Customer customer = new Customer("CU001", "John Doe");

        // Rent a vehicle
        rentalAgency.rentVehicle("C001", customer, 3); // Renting car for 3 days
        rentalAgency.rentVehicle("M001", customer, 2); // Renting motorcycle for 2 days

        // Return a vehicle
        rentalAgency.returnVehicle("C001");
        rentalAgency.returnVehicle("M001");
    }
}
