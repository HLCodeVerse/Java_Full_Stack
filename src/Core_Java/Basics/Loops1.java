package Core_Java.Basics;

public class Loops1 {
    // while loop
    public static void main(String[] args) {
        int i=1;
        while (i<=4) {
            System.out.println("Running"+i);
            int j=1;
            while(j<=3){
                System.out.println("Hii");
                j++;
            }
            i++;
        }
    }
}
