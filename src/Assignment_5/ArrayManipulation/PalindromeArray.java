package Assignment_5.ArrayManipulation;

public class PalindromeArray {
    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c' };
        int left = 0;
        int right = arr.length - 1;
        boolean isPallindrome = false;
        while (left < right) {
            if (arr[left] == arr[right]) {
                isPallindrome = true;
                break;
            }
            left++;
            right--;
        }
        if (isPallindrome) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not a pallindrome");
        }
    }
}
