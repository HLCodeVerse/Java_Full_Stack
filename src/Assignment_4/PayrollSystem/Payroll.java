package Assignment_4.PayrollSystem;

import java.util.Scanner;
public class   Payroll {
        Scanner sc=new Scanner(System.in);
        Employee e=new Employee("Chandan","A53",35000);
        Manager m=new Manager("Rohan","D324",43779);
        Clerk c=new Clerk("Raghav","A12",20399);
        public void showDetails(){
            System.out.println ("Employee Name : "+e.getName() );
            System.out.println ("Employee Position :"+e.getPosition ());
            System.out.println ("Employee ID: "+e.getId () );

            System.out.println ("Employee Name : "+m.getName() );
            System.out.println ("Employee Position :"+m.getPosition ());
            System.out.println ("Employee ID: "+m.getId () );

            System.out.println ("Employee Name : "+c.getName() );
            System.out.println ("Employee Position :"+c.getPosition ());
            System.out.println ("Employee ID: "+c.getId () );
        }
        public void addAttendance(){
            System.out.println ("Add Employee Attendance" );
            System.out.println ("Manager" );
            int attendanceM=sc.nextInt();
            m.setTotalAtendence ( attendanceM );
            System.out.println ("Clerk" );
            int attendanceC=sc.nextInt();
            c.setTotalAtendence(attendanceC);
            System.out.println ("Employee" );
            int attendanceE=sc.nextInt();
            e.setTotalAtendence(attendanceE);
        }

       public void calBonus(String name){
         if( name.equals ( m.getName () ) ){
             if ( m.getTotalAtendence ()>=25 ){
                 m.setBonus ( 3000 );
                 System.out.println ("Your Bonous is "+m.getBonus () );
             }else if ( m.getTotalAtendence ()>22 && m.getTotalAtendence()<25){
                 m.setBonus ( 2000 );
                 System.out.println ("Your Bonous is "+m.getBonus () );
             }else {
                 System.out.println ("Your attendance is not sufficient" );
             }
         } else if ( name.equals ( c.getName () ) ) {
             if ( c.getTotalAtendence ()>=25 ){
                 c.setBonus ( 2500 );
                 System.out.println ("Your Bonous is "+c.getBonus () );
             }else if ( c.getTotalAtendence ()>22 && c.getTotalAtendence()<25){
                 c.setBonus ( 1800 );
                 System.out.println ("Your Bonous is "+c.getBonus () );
             }else {
                 System.out.println ("Your attendance is not sufficient" );
             }
         } else if ( name.equals ( e.getName () ) ) {
             if ( e.getTotalAtendence ()>=25 ){
                 e.setBonus ( 2000 );
                 System.out.println ("Your Bonous is "+e.getBonus () );
             }else if ( e.getTotalAtendence ()>22 && e.getTotalAtendence()<25){
                 e.setBonus ( 1500 );
                 System.out.println ("Your Bonous is "+e.getBonus () );
             }else {
                 System.out.println ("Your attendance is not sufficient" );
             }
         }
       }
}
