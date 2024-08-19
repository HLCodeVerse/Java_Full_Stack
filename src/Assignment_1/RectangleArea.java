package Assignment_1;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and width");
        int l=sc.nextInt();
        int w=sc.nextInt();
        if(l>0 && w>0){
            int area;
            System.out.println("The Area of the rectangle is : "+l*w);
        }
    }
}
