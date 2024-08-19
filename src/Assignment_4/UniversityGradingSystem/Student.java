package Assignment_4.UniversityGradingSystem;

import java.util.Scanner;

public class Student {
    private String sName;
    private String sClass;
    private int rollno;
    Scanner sc = new Scanner(System.in);

    public String getName() {
        return sName;
    }

    public void addStudent() {
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        this.sName = name;
        System.out.println("Enter Class: ");
        String sClass = sc.nextLine();
        this.sClass = sClass;
        System.out.println("Enter Roll Number: ");
        int rollno = sc.nextInt();
        this.rollno = rollno;
    }

    public void showStudent() {
        System.out.println("Student Name: " + sName);
        System.out.println("Student Class: " + sClass);
        System.out.println("Student Roll No: " + rollno);
    }
}
