package Core_Java.WrapperClass;
public class Wrap1 {
    public static void main(String[] args) {

        // Create an Integer object i using the valueOf() method of the Integer class
        // This method returns an Integer object representing the specified integer value
        //autoBoxing
        Integer i = Integer.valueOf(5);

        // Create another Integer object j directly by assigning the integer value 54 to it
        Integer j = 54;
        System.out.println(i + j);

        // Declare a primitive datatype variable k and assign the value of j to it
        //unBoxing
        int k = j;
        System.out.println(k);
    }
}