package Assignment_5;

public class PallindromePairCheck {

    public static void main(String[] args) {
        String[] words = { "Moon", "madam", "101", "1001" };
        boolean isPalindromePairFound = false;

        System.out.println("Palindrome Pairs:");
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPalindrome(words[i]) && isPalindrome(words[j])) {
                    System.out.println(words[i] + " and " + words[j]);
                    isPalindromePairFound = true;
                }
            }
        }

        if (!isPalindromePairFound) {
            System.out.println("No palindrome pair found.");
        }
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
