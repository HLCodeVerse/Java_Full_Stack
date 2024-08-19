package Assignment_5.ArrayManipulation;

public class SecondLargestElement {
    public static void main ( String[] args ) {
        int []arr={1,22,32,43,52,53,3,4,5,34,2};
        int f_large=0;
        int s_large=0;
        for ( int i=0; i<arr.length; i++ ){
            if(arr[i]>f_large){
                s_large=f_large;
                f_large=arr[i];
            }
        }
        System.out.println ("Second large number is "+s_large );
    }
}
