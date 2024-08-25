package Core_Java.Generics;

public class GenericMethod {
    public static void main(String[] args) {
        // Calling the generic method 'show' with a String argument.
        show("Hello");

        // Calling the generic method 'show' with an Integer argument.
        show(123);
    }

    // Defining a generic method 'show' that can accept any type of object.
    public static <T> void show(T t) {
        // Printing the value of the object passed to the method.
        System.out.println(t);
    }
}
