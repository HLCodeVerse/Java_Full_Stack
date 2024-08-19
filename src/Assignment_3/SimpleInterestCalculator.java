package Assignment_3;

import java.util.Scanner;

public class SimpleInterestCalculator {
    private double principal;
    private double rate;
    private double time;
    public double interest;
    public SimpleInterestCalculator(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }
    public double getInterest() {

        return interest = (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        double principal;
        double rate;
        double time;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        rate = sc.nextDouble();
        System.out.print("Enter Time in Year: ");
        time = sc.nextDouble();
        SimpleInterestCalculator s = new SimpleInterestCalculator(principal, rate, time);
        System.out.println("The interest is : " + s.getInterest());

    }
}
