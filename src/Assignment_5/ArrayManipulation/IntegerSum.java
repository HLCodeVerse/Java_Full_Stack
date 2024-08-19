package Assignment_5.ArrayManipulation;

public class IntegerSum {
    public static void main(String[] args) {
        int number[] = { 1, 3, 1, 3, 34, 4, 34, 4, 4, 4 };
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        System.out.println("Sum of the array is : " + sum);
    }
}
