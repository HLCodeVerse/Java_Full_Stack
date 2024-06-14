package Challanges;

import java.util.Scanner;

// get 3 input from user  for a triangle and check that triangle is valid or not the triangle is equiletral, isosceles and Scelen
class TriangleCalculation{
    TriangleCalculation(float a, float b, float c){
        if(a==b && a==c && b==c ){
            System.out.println("Equilateral triangle");
        } else if (a==b || a==c || b==c) {
            System.out.println("Isosceles");
        }
        else{
            System.out.println("Scelen");
        }
    }
}

public class If_ElseQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter 3 sides of triangle");
           float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
        TriangleCalculation tc = new TriangleCalculation(a,b,c);
    }
}
