package Assignment_1;

import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperture to convert");
        float temp = sc.nextFloat();
        System.out.println("Choose Convertion type");
        char ch = sc.next().charAt(0);
        if (ch == 'F') {
            float newTemp = temp * 9 / 5 + 32;
            System.out.println("Temperture in Fahrenheit: " + newTemp);
        } else if (ch == 'C') {
            float newTemp = (temp - 32) * 5 / 9;
            System.out.println("Temperture in Celsius: " + newTemp);
        }
    }
}
