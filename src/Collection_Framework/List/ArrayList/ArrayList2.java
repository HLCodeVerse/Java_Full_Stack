package Collection_Framework.List.ArrayList;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main ( String[] args ) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println (list.contains ( String.valueOf ( "Banana" ) ) );
    }
}
