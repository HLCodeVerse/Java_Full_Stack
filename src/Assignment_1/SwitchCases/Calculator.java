package Assignments;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 numbers for Calculate");
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("Choose an operator like +, -, *, /");
        char op= sc.next().charAt(0);
        switch (op){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
