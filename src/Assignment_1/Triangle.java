package Assignment_1;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 sides of triangle");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        if(s1==s2 &&s2==s3){
            System.out.println(" This is Equilateral");
        } else if (s1==s2 || s2==s3 || s3==s1) {
            System.out.println(" This is isosceles");
        }else {
            System.out.println(" This is Scalene");
        }
    }
}
