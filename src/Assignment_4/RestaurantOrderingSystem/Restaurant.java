package Assignment_4.RestaurantOrderingSystem;

import java.util.Scanner;

public class Restaurant {

    public static void main ( String[] args ) {
        Scanner sc=new Scanner (System.in);
        MenuItem m1=new MenuItem();
        MenuItem m2=new MenuItem();
        Order order=new Order();
        int choice;
        do {
            System.out.println ("1. Add Menu" );
            System.out.println ("2. View Menu" );
            System.out.println ("3. Order Dish" );
            System.out.println ("4. Get Bill" );
            choice=sc.nextInt();
            switch ( choice ) {
                case 1:
                    m1.addItem ();
                    m2.addItem ();
                    break;
                case 2:
                    m1.displayItems ( );
                    m2.displayItems ( );
                    break;
                case 3:
                    order.addOrder ();
                    System.out.println ( "Select Menu" );
                    System.out.println ( "1. " + m1.getiName ());
                    System.out.println ( "2. " + m2.getiName ( ) );
                    int sm=sc.nextInt ( );
                    sc.nextLine ( );
                    switch ( sm ) {
                        case 1:
                            order.setDishName ( m1.getiName () );
                            order.setTotalPrice ( m1.getiPrice () );
                            break;
                        case 2:
                            order.setDishName ( m2.getiName () );
                            order.setTotalPrice ( m2.getiPrice () );
                            break;
                    }
                    System.out.println ("Sucessfully Ordered" );
                    break;
                case 4:
                    order.generateBill ();
                    break;
                default:
                    System.out.println ( "Invalid option" );
            }
        }while ( choice!=5 );

    }
}
