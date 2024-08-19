package Assignment_5.ArrayManipulation;

public class DuplicateRemove {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 21, 3, 5, 23, 3, 2, 32, 3 };
        int backup[] = new int[arr.length];
        int k = 0;
        boolean isDuplicate;

        for (int i = 0; i < arr.length; i++) {
            isDuplicate = false;
            for (int j = 0; j < k; j++) {
                if (arr[i] == backup[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                backup[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(backup[i]);
        }
    }
}
