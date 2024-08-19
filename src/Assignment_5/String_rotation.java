package Assignment_5;

import java.util.Scanner;

public class String_rotation {
    public static void rotationCheck(String str, String str2) {
        char[] arr = str.toCharArray();
        String temp = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            temp += arr[i];
        }
        if (temp.equals(str2)) {
            System.out.println("Rotate String");
        } else {
            System.out.println("Not a rotate Stirng");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String and rotate string");
        String str = scanner.nextLine();
        String str2 = scanner.nextLine();
        rotationCheck(str, str2);

    }
}
