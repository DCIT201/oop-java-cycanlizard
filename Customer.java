// Customer.java
class Customer {
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        if (customerId == null || name == null || customerId.isEmpty() || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid customer details");
        }
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}

