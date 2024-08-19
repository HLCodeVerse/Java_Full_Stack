package Assignment_3;

import java.util.Scanner;

public class AreaCalculator {
    //for rectangle
    //Here i used the keyword static , i can also use constructor instead of static keyword
    float width;
    float length;
    float areaRect;
    //for circle
    float radius;
    double areaOfCircle;

    //Method to calculate the area of the Rectangle
    public float AreaOfRect ( float length , float width ) {
        this.length = length;
        this.width = width;

        return areaRect = length * width;
    }

    //method to calculate the area of the circle
    public double AreaOfCircle ( float radius ) {
        this.radius = radius;
        return areaOfCircle = 2 * Math.PI * Math.pow ( radius , 2 );
    }

    public static void main ( String[] args ) {
        AreaCalculator ac = new AreaCalculator ( );
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter R to calculate the area of the Rectangle\n Enter C to calculate the area of the Circle" );
        char ch = sc.next ( ).charAt ( 0 );
        if ( ch == 'R' ) {
            System.out.println ( "Enter width and length" );
            float width = sc.nextFloat ( );
            float length = sc.nextFloat ( );
            System.out.println ( "Area of the Rectangle is: " + ac.AreaOfRect ( length , width ) );
        }
        if ( ch == 'C' ) {
            System.out.println ( "Enter Radius of Circle" );
            float radius = sc.nextFloat ( );
            System.out.println ( "Area of the Circle is: " + ac.AreaOfCircle ( radius ) );
        }
    }
}
