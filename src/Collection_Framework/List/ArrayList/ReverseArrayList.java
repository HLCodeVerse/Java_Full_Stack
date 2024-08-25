package Collection_Framework.List.ArrayList;

import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<> ();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original ArrayList: " + list);


        // i starts from the beginning of the list (index 0)
        // j starts from the end of the list (index size-1)
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            // Store the current element at index i in a temporary variable
          int  reverse = list.get(i);

            // Swap the elements at index i and index j
            list.set(i, list.get(j));
            list.set(j, reverse);
        }

        System.out.println("Reversed ArrayList: " + list);
    }
}
