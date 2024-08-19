package Assignment_5;

public class DuplicateFinder {
    public static void duplicateFinder(){
        StringBuilder s = new StringBuilder("Hello, world!");

        System.out.print("Duplicate character found:  ");
        for(int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.println ( s.charAt(i) );
                    s.deleteCharAt(j);
                }
            }
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        duplicateFinder();
    }
}
