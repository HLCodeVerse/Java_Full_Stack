package Assignment_5.ArrayManipulation;

import java.util.Arrays;

public class ArraySorting {
    public static void main ( String[] args ) {
        int arr1[] = { 12, 11, 13, 5, 6 };
        int arr2[] ={2,3,42,4,53,5};
        Arrays.sort(arr1 );
        Arrays.sort(arr2 );
        int array3[]=Arrays.copyOf ( arr1,arr1.length+arr2.length );
        System.arraycopy ( arr2,0,array3,arr1.length,arr2.length );
        Arrays.sort ( array3 );
        for(int s : array3){
            System.out.print ( s+" " );
        }


    }
}
