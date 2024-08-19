package Assignment_4.UniversityGradingSystem;

import java.util.Scanner;

public class University {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s1 =null;
        Student s2 = null;

        Course c1 = new Course("CSE");
        Course c2 = new Course("EE");

        Grade grade = new Grade();

        int choice;
        do {
            System.out.println("1. Enroll Student");
            System.out.println("2. Update Marks");
            System.out.println("3. Calculate Grade");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (s1 == null) {
                        s1 = new Student();
                        s1.addStudent();
                    } else if (s2 == null) {
                        s2 = new Student();
                        s2.addStudent();
                    } else {
                        System.out.println("No seats available");
                    }
                    break;

                case 2:
                        System.out.println("Enter marks for " + s1.getName() + " (Math, Science, English, Bio):");
                        c1.setMarks(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
                        System.out.println("Enter marks for " + s2.getName() + " (Math, Science, English, Bio):");
                        c2.setMarks(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
                    break;

                case 3:
                        double percentage = c1.percentage ();
                        System.out.println("Marks in Percentage for " + s1.getName() + ": " + percentage);
                        System.out.println("Grade for " + s1.getName() + ": " + grade.calculateGrade(percentage));
                      if ( s2!=null ){
                          double percentage2 = c2.percentage ();
                          System.out.println("Marks in Percentage for " + s2.getName() + ": " + percentage2);
                          System.out.println("Grade for " + s2.getName() + ": " + grade.calculateGrade(percentage2));
                      }
                    break;

                case 4:
                        s1.showStudent();
                    System.out.println ( );
                    if (s2 != null)
                        s2.showStudent();
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}
