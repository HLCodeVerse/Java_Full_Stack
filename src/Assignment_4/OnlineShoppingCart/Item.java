package Assignment_4.OnlineShoppingCart;

import java.util.Scanner;

public class Item {
    private String iName;
    private double iPrice;

    public String getiName() {
        return iName;
    }

    Scanner sc = new Scanner(System.in);

    public void addItems() {
        System.out.println("Enter Item Name: ");
        String name = sc.nextLine();
        this.iName = name;
        System.out.println("Enter Item Price: ");
        double price = sc.nextDouble();
        this.iPrice = price;
        sc.nextLine();
    }

    public void removeItem() {
        this.iName = null;
        this.iPrice = 0;
        System.out.println("Successfully Removed.");
    }

    public void showItem() {
        if (iName != null) {
            System.out.println("Item Name: " + iName);
            System.out.println("Item Price: " + iPrice);
        } else {
            System.out.println("There are no items in the cart, Add Now..!");
        }
    }
}
