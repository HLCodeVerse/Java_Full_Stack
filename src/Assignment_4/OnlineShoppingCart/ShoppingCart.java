package Assignment_4.OnlineShoppingCart;

import java.util.Scanner;

public class ShoppingCart {
    public static void main ( String[] args ) {
        Scanner sc=new Scanner(System.in);
        Item i1=new Item();
        Item i2=new Item();
        int ch;
        do {
            System.out.println ( "1. Add Items" );
            System.out.println ( "2. Remove Item" );
            System.out.println ( "3. View Item" );
            ch=sc.nextInt ();
            sc.nextLine ();
            switch ( ch ) {
                case 1:
                    i1.addItems ();
                    char more=0;
                    System.out.println ("Want to add more item Y/N" );
                    more=sc.next().charAt ( 0 );
                    if ( more == 'Y' || more == 'y' )
                        i2.addItems ();
                    break;
                case 2:
                    System.out.println("Enter Item Name to Remove: ");
                    String name = sc.nextLine();
                    if (name.equals(i1.getiName())) {
                        i1.removeItem();
                    } else if (name.equals(i2.getiName())) {
                        i2.removeItem();
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 3:
                    i1.showItem ();
                    if(i2.getiName () != null)
                        i2.showItem ();
                    break;
            }
        }while ( ch!=4 );
    }
}
