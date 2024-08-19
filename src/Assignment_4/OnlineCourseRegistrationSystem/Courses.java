package Assignment_4.OnlineCourseRegistrationSystem;

import java.util.Scanner;

public class Courses {
    private String courseName;
    private String courseBranch;
    private int courseClass;

    public void addCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Course Name: ");
        this.courseName = sc.nextLine();
        System.out.println("Enter Course Branch: ");
        this.courseBranch = sc.nextLine();
        System.out.println("Enter Course Class: ");
        this.courseClass = sc.nextInt();
    }

    public String getCourseBranch() {
        return courseBranch;
    }

    public int getCourseClass() {
        return courseClass;
    }

    public String getCourseName() {
        return courseName;
    }
}
