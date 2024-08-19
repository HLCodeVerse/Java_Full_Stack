package Assignment_4.Ecommers;

public class Order{
    private  String pName;
    private String cName;
    private double price;
    private int quantity;
    void addOrder(String pName, String cName, double price, int quantity){
        this.pName = pName;
        this.cName = cName;
        this.price = price;
        this.quantity = quantity;
    }
    public double calculateTotalPrice(){
        return price * quantity;
    }

   public void displayOrderDetails(){
        System.out.println("Product Name: " + pName);
        System.out.println("Customer Name: " + cName);
        System.out.println("Price: " + price);
       System.out.println ("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}
