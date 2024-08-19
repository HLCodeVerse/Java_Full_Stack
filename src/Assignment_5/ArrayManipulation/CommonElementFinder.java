package Assignment_5.ArrayManipulation;

import java.util.Scanner;

public class CommonElementFinder {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] commonElements = newArray();
        System.out.println("Common elements:");
        for (int element : commonElements) {
            if (element != 0) {
                System.out.print(element + " ");
            }
        }
    }

    public static int[] newArray() {
        System.out.println("Enter 5 elements for 1st array");
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter 6 elements for 2nd array");
        int[] array2 = new int[6];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }
        int[] tempArray = new int[array1.length];
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    boolean isDuplicate = false;
                    for (int l = 0; l < k; l++) {
                        if (tempArray[l] == array1[i]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        tempArray[k++] = array1[i];
                    }
                    break;
                }
            }
        }

        return tempArray;
    }
}