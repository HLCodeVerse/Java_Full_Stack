package Assignment_3;

import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private float baseSalary;
    private String position;

    Employee ( String name , int id , float baseSalary , String position ) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        this.position = position;
    }

    public void addEmployee ( ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter Employee name:" );
        name = sc.nextLine ( );
        System.out.println ( "Enter Employee ID:" );
        id = sc.nextInt ( );
        sc.nextLine ( );
        System.out.println ( "Enter position:" );
        position = sc.nextLine ( );
        System.out.println ( "Enter base salary:" );
        baseSalary = sc.nextFloat ( );
    }

    float calculateSalary ( ) {
        return baseSalary;
    }

    void displayDetails ( ) {
        System.out.println ( "Name: " + name );
        System.out.println ( "ID: " + id );
        System.out.println ( "Base Salary: " + baseSalary );
        System.out.println ( "Position: " + position );
    }
}

//fulltime employeee
class FullTimeEmployee {
    float monthlySalary;
    Employee employee = new Employee ( "" , 0 , 0 , "" );

    public void addFullTimeEmployee ( ) {
        Scanner sc = new Scanner ( System.in );
        employee.addEmployee ( );
        System.out.println ( "Enter monthly salary: " );
        monthlySalary = sc.nextFloat ( );
    }

    public void Details ( ) {
        employee.displayDetails ( );
        System.out.println ( "Monthly salary " + monthlySalary );
    }

    public double calculateSalary ( ) {
        Details ( );
        employee.calculateSalary ( );
        return monthlySalary;
    }
}

class PartTimeEmployee {

    float hourlyWage;
    int hoursWorked;
    Employee employee2 = new Employee ( "" , 0 , 0 , "" );

    PartTimeEmployee ( float hourlyWage , int hoursWorked ) {
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public void addPartTimeEmployee ( ) {
        Scanner sc = new Scanner ( System.in );
        employee2.addEmployee ( );
        System.out.println ( "Enter hourly wage: " );
        hourlyWage = sc.nextFloat ( );
        System.out.println ( "Enter total worked hours: " );
        hoursWorked = sc.nextInt ( );
    }

    public void details ( ) {
        employee2.displayDetails ( );
        System.out.println ( "Hourly Wages " + hourlyWage );
        System.out.println ( "Total worked hours " + hoursWorked );
    }

    float calculateSalary ( ) {
        details ( );
        float totalSalary = hourlyWage * hoursWorked + employee2.calculateSalary ( );
        return totalSalary;
    }
}

public class EmployeePayrollSystem {
    public static void main ( String[] args ) {
        FullTimeEmployee fte = new FullTimeEmployee ( );
        PartTimeEmployee pte = new PartTimeEmployee ( 0 , 0 );
        Scanner sc = new Scanner ( System.in );
        int option = 0;
        while ( option != 5 ) {
            System.out.println ( "Choose an option:" );
            System.out.println ( "1. Add full-time Employee" );
            System.out.println ( "2. Add part-time Employee" );
            System.out.println ( "3. Calculate salary" );
            System.out.println ( "4. view All Employees" );
            System.out.println ( "4. Exit" );
            option = sc.nextInt ( );
            switch ( option ) {
                case 1:

                    fte.addFullTimeEmployee ( );
                    break;
                case 2:
                    pte.addPartTimeEmployee ( );
                    break;
                case 3:
                    System.out.println ( "Full time employee salary : " + fte.calculateSalary ( ) );
                    System.out.println ( "Part time employee salary : " + pte.calculateSalary ( ) );
                    break;
                case 4:
                    fte.Details ( );
                    pte.details ( );
                    break;
                case 5:
                    System.out.println ( "Exiting..." );
                    break;
                default:
                    System.out.println ( "Invalid option" );
            }
        }
    }
}
