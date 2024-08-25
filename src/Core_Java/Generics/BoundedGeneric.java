package Core_Java.Generics;

public class BoundedGeneric {
    public static void main ( String[] args ) {
        BoundedGeneric b = new BoundedGeneric();
        b.show(10);
//        b.show("Hello"); // This will not work because it extends Number class only

    }
    <T extends Number> void show(T t){
        System.out.println (t );
    }
}
