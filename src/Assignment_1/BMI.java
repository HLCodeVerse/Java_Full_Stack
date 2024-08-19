package Assignment_1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in METER: ");
        float height = sc.nextFloat();
        System.out.println("Enter your weight: ");
        float weight = sc.nextFloat();
        float BMI = (height * height) / weight;
        if (BMI > 25.0) {
            System.out.println(" over weight");
        } else if (BMI>=18.5 && BMI<=24.9) {
            System.out.println("normal weight");
        }else{
            System.out.println("under weight");
        }
    }
}
