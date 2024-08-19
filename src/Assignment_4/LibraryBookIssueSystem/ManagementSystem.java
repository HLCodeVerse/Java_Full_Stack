package Assignment_4.LibraryBookIssueSystem;

import java.util.Scanner;

public class ManagementSystem {
    public static void main ( String[] args ) {
        Scanner sc=new Scanner(System.in);
        Library library=new Library();
        library.student1.addStudent ();
        library.book1.addBook ();
        library.book2.addBook ();
        library.Books ();
        int ch;
        System.out.println ( "Enter Choosed books number (like 1,2 3... ) from Library :" );
        do {
            System.out.println ("3. Return Issued Book" );
            System.out.println ("4. Check Fine" );
            ch = sc.nextInt ( );
            switch ( ch ){
                case 1:
                   library.student1.setBookName ( library.book1.getBookName ());
                    System.out.println (library.book1.getBookName ()+" Book Issued to "+library.student1.getStudentName ());
                   break;
                case 2:
                    library.student1.setBookName ( library.book2.getBookName ());
                    System.out.println ("Book Issued to "+library.student1.getStudentName ());
                    break;
                case 3:
                    System.out.println ("How many day you kept the book with u" );
                    int keptday= sc.nextInt ( );
                    library.setKeptDays ( keptday );
                    if(library.student1.getBookName ().equals ( library.book1.getBookName () )){
                        System.out.println (library.book1.getBookName () +" has Sucessfully returned" );
                        library.student1.setBookName ( "" );
                    }else if(library.student1.getBookName ().equals ( library.book1.getBookName () )){
                        System.out.println (library.book2.getBookName () +" has Sucessfully returned" );
                        library.student1.setBookName ( "" );
                    }
                    System.out.println ("Please Check Fine" );
                    break;
                case 4:
                    int totlaKeptDay=0;
                    if(library.getKeptDays ()>library.getMaxDay ()){
                        totlaKeptDay=library.getKeptDays ()-library.getMaxDay ();
                        double fine=totlaKeptDay*library.getFinePerDay ();
                        library.setFineAmount ( fine );
                        System.out.println ("Please pay your fine amount : "+library.getFineAmount () );
                    }
                    break;
                case 5:
                       library.student1.studentDetails ();
            }
        } while ( ch!=5);

    }
}
