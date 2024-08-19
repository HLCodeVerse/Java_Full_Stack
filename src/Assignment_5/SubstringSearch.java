package Assignment_5;

public class SubstringSearch {
    public static void main(String[] args) {
        String oString = "hello world";
        String subString = "ll";
        int result = str(oString, subString);

    }

    public static int str(String oString, String subString) {
        int index = oString.indexOf(subString);
        System.out.println("Substring found at index of " + index);
        return index;
    }
}
