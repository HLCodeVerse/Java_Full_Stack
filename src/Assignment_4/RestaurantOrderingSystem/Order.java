package Assignment_4.RestaurantOrderingSystem;

import java.util.Scanner;

public class Order {
    Scanner sc=new Scanner(System.in);
    private String tableNumber;
    private String dishName;
    private double totalPrice;

    public String getTableNumber ( ) {
        return tableNumber;
    }

    public void setTableNumber ( String tableNumber ) {
        this.tableNumber = tableNumber;
    }

    public String getDishName ( ) {
        return dishName;
    }

    public void setDishName ( String dishName ) {
        this.dishName = dishName;
    }

    public double getTotalPrice ( ) {
        return totalPrice;
    }

    public void setTotalPrice ( double totalPrice ) {
        this.totalPrice = totalPrice;
    }

    public void addOrder() {
        System.out.println ("Enter Table Number" );
        String tableNumber= sc.nextLine ( );
        this.tableNumber = tableNumber;
    }
    public  void generateBill(){
        System.out.println ("Ordered dish " + dishName);
        System.out.println ("Table Number "+tableNumber);
        System.out.println ("Billed Amount "+totalPrice);
    }

}
