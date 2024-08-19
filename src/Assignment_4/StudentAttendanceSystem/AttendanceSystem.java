package Assignment_4.StudentAttendanceSystem;

import java.util.Scanner;

public class AttendanceSystem {
    public static void main ( String[] args ) {
        Scanner sc=new Scanner(System.in);
        Student s1=new Student("Chandan",12,"Btech cse",21);
        Attendance a1=new Attendance ();
        int ch;
        do{
            System.out.println ("1. Check attendance" );
            System.out.println ("2. Check attendance in Percent" );
            System.out.println ("3. Get Attendance Report" );
            ch=sc.nextInt ();
            switch ( ch ) {
                case 1:
                    System.out.println ("Your Total attendance is : "+ s1.getMonthlyAttendance ()*10 );
                    break;
                case 2:
                    a1.totalAttendance ( s1.getMonthlyAttendance () );
                    break;
                case 3:
                    generateReports ( s1 );
                    a1.totalAttendance ( s1.getMonthlyAttendance () );

                    break;
            }
        }while ( ch!=4 );

    }
    private static void generateReports(Student s){
        System.out.println ("---Your Attendance Report---" );
        System.out.println ("Name : "+s.getsName () );
        System.out.println ("Class : "+s.getClassName () );
        System.out.println ("Roll Number : "+s.getRollNumber () );

    }
}
