package Assignment_4.OnlineCourseRegistrationSystem;

import java.util.Scanner;

public class ManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        Courses c1 = new Courses();
        int ch;
        do {
            System.out.println("1. Enroll Student");
            System.out.println("2. Add Courses");
            System.out.println("3. Enrolled Students");
            System.out.println("4. Exit");
            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    s1.enrollStudent();
                    System.out.println("Want to add more Student Y/N");
                    char ams = sc.next().charAt(0);
                    if (ams == 'Y' || ams == 'y') {
                        s2.enrollStudent();
                    } else {
                        s2 = null;
                    }
                    break;
                case 2:
                    c1.addCourse();
                    if (c1.getCourseClass() == s1.getsClass()) {
                        s1.setsCourse(c1.getCourseName());
                    }
                    if (s2 != null && c1.getCourseClass() == s2.getsClass()) {
                        s2.setsCourse(c1.getCourseName());
                    }
                    break;
                case 3:
                    s1.enrolledStudents();
                    if (s2 != null) {
                        s2.enrolledStudents();
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (ch != 4);
    }
}
