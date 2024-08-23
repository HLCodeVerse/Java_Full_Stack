// Generate the Fibonacci series up to a specified limit using an array.
package Assignment_5.ArrayManipulation;

public class Fibonacci {
    public static void main ( String[] args ) {
        int limit = 5;
        //declare an array to store fibonacci numbers
        int fibonacciArray[] = new int[limit];
        //initialize first 2 indexes
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        //loop start from index 2 till limit
        for (int i = 2; i < limit; i++) {
            // like index 2 = 1+0 (index)
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        //loop for print fibonacci numbers
        for (int fb : fibonacciArray) {
            System.out.print ( fb + " " );
        }
    }
}
