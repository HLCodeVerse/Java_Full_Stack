package Assignment_4.RealEstateManagementSystem;

public class Client {
    private String name;
    private String contact;

    public Client(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void showClient() {
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contact);
    }
}
