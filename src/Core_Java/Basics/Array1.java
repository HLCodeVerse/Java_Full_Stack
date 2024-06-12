package Core_Java.Basics;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}