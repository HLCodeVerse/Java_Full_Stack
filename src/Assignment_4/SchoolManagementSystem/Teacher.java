package Assignment_4.SchoolManagementSystem;

import java.util.Scanner;

public class Teacher implements School {
    private String name;
    private String id;
    private int age;
    Scanner sc = new Scanner ( System.in );

    public void setName ( String name ) {
        this.name = name;
    }

    public void setId ( String id ) {
        this.id = id;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    @Override
    public void add ( ) {
        System.out.println ( "Enter name :" );
        this.name = sc.nextLine ( );
        System.out.println ( "Enter id :" );
        this.id = sc.nextLine ( );
        System.out.println ( "Enter age : " );
        this.age = sc.nextInt ( );

    }

    @Override
    public void remove ( ) {
        setName ( "" );
        setId ( "" );
        setAge ( 0 );
    }

    @Override
    public void displayDetails ( ) {
        if ( name != "" && id != "" && age != 0 ) {
            System.out.println ( " User : Teacher" );
            System.out.println ( " Name : " + name );
            System.out.println ( " Id : " + id );
            System.out.println ( " Age : " + age );
        } else {
            System.out.println ( "No teachers" );
        }
    }
    public void randomMethod(){

    }
}
