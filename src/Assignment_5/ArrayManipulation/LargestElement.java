package Assignment_5.ArrayManipulation;
//Develop a method to find the largest element in an array of integers.

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println(large);
    }
}
