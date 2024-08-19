package Assignment_1;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Scores");
        System.out.println("Math, English, Physics,Chemistry");
        int m=scanner.nextInt();
        int e=scanner.nextInt();
        int p=scanner.nextInt();
        int c=scanner.nextInt();

        float totalMarks=m+e+p+c;
        float percentage = totalMarks/400*100; //with typecasting
        System.out.println(totalMarks);
        System.out.println(percentage);
        if(percentage>90){
            System.out.println("Grade A");
        } else if (percentage>80 && percentage<90) {
            System.out.println("Grade B");
        } else if (percentage>70 && percentage<80) {
            System.out.println("Grade C");
        }else if (percentage>60 && percentage<70){
            System.out.println("Grade D");
        }else {
            System.out.println("Grade F");
        }
    }
}
