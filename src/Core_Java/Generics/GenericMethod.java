package Core_Java.Generics;

public class GenericMethod {
    public static void main(String[] args) {
        // Calling the generic method 'show' with a String argument
        show("Hello");

        // Calling the generic method 'show' with an Integer argument.
        show(123);

        // Creating an instance of GenericMethod to call the non-static generic method 'display'.
        GenericMethod generic = new GenericMethod();

        // Calling the non-static generic method 'display' with a String argument.
        generic.display("World");

        // Calling the non-static generic method 'display' with an Integer argument.
        generic.display(456);
    }

    // Defining a static generic method 'show' that can accept any type of object.
    public static <T> void show(T t) {
        // Printing the value of the object passed to the method.
        System.out.println(t);
    }

    // Defining a non-static generic method 'display' that can accept any type of object.
    <E> void display(E e) {
        // Printing the value of the object passed to the method.
        System.out.println(e);
    }
}
