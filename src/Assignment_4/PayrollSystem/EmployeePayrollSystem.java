package Assignment_4.PayrollSystem;

import java.util.Scanner;

public class EmployeePayrollSystem {
    public static void main ( String[] args ) {
        Scanner sc=new Scanner(System.in);
        Payroll payroll = new Payroll ();
       int ch;
       do{
           System.out.println ("1. See Employee Details" );
           System.out.println ("2. Add Attendance" );
           System.out.println ("3. Claculate Bonus" );
           ch=sc.nextInt ();
           switch ( ch ) {
               case 1:
                   payroll.showDetails ();
                   break;
               case 2:
                   payroll.addAttendance ();
                   break;
               case 3:
                   System.out.println ("Enter Employee Name" );
                   sc.nextLine ();
                   String name =sc.nextLine ();
                   payroll.calBonus (name);
                   break;
           }
       }while ( ch!=5 );

    }
}
