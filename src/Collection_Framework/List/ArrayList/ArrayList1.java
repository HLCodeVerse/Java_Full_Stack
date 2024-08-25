package Collection_Framework.List.ArrayList;

import java.util.ArrayList;

//Write a Java program to create an ArrayList of integers. Add five integers to the list, remove one, and print the remaining elements.
public class ArrayList1 {
    public static void main ( String[] args ) {
        ArrayList<Integer> list = new ArrayList<> ();
        list.add ( 5 );
        list.add (7);
        list.add (21);
        list.add (27);
        list.add (12);

        list.remove ( Integer.valueOf (5) );
        for (int i = 0; i < list.size(); i++) {
            System.out.println (list.get (i) );
        }
    }
}
