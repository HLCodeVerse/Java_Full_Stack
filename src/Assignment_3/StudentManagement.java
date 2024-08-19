package Assignment_3;
import java.util.Scanner;
class Student {
    String name;
    String id;
    int grade;

    Student(String name, String id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student's name: ");
        name = scanner.nextLine();
        System.out.println("Enter the student's ID: ");
        id = scanner.nextLine();
        System.out.println("Enter the student's grade: ");
        grade = scanner.nextInt();
    }
}
public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student("", "", 0);
        Student student2 = new Student("", "", 0);
        int choice = 0;

        while (choice != 4) {
            System.out.println("Choose an option");
            System.out.println("1. Add Student");
            System.out.println("2. Calculate Average grade");
            System.out.println("3. Display all students");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    student1.addStudent();
                    student2.addStudent();
                    break;
                case 2:
                    double average = (student1.grade + student2.grade) / 2.0;
                    System.out.println("The average grade is: " + average);
                    break;
                case 3:
                    student1.displayDetails();
                    student2.displayDetails();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
