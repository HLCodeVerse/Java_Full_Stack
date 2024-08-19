package Assignment_4.OnlineCourseRegistrationSystem;

import java.util.Scanner;

public class Student {
    private String sName;
    private String sBranch;
    private int sClass;
    private String sCourse;

    public void enrollStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        this.sName = name;
        System.out.println("Enter Branch: ");
        String branch = sc.nextLine();
        this.sBranch = branch;
        System.out.println("Enter Class: ");
        int sclass = sc.nextInt();
        this.sClass = sclass;
    }

    public String getsName() {
        return sName;
    }

    public String getsBranch() {
        return sBranch;
    }

    public int getsClass() {
        return sClass;
    }

    public String getsCourse() {
        return sCourse;
    }

    public void setsCourse(String sCourse) {
        this.sCourse = sCourse;
    }

    public void enrolledStudents() {
        System.out.println("Student Name : " + sName);
        System.out.println("Student Branch : " + sBranch);
        System.out.println("Students class: " + sClass);
        System.out.println("Assigned Course Name : " + sCourse);
    }
}
