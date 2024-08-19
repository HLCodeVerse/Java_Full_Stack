package Assignment_4.RealEstateManagementSystem;

public class Property {
    private String address;
    private double price;
    private String type;
    private boolean isAvailable;

    public Property(String address, double price, String type) {
        this.address = address;
        this.price = price;
        this.type = type;
        this.isAvailable = true;
    }

    public String getAddress() {
        return address;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void showProperty() {
        System.out.println("Address: " + address);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}
