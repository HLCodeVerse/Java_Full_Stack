package Assignment_4.LibraryBookIssueSystem;

import java.util.Scanner;

public class Student {
    private String studentName;
    private String className;
    private String rollNo;
    private String bookName;

    public String getStudentName ( ) {
        return studentName;
    }

    public String getBookName ( ) {
        return bookName;
    }

    public void setBookName ( String bookName ) {
        this.bookName = bookName;
    }

    public void addStudent(){
        Scanner  sc=new Scanner(System.in);
        System.out.println ("Enter student name :" );
        String studentName =sc.nextLine();
        this.studentName =studentName;
        System.out.println ("Enter class name :" );
        String className =sc.nextLine();
        this.className =className;
        System.out.println ("Enter roll no. :" );
        String rollNo =sc.nextLine();
        this.rollNo =rollNo;
    }
    public void studentDetails(){
        System.out.println (" Student name "+studentName );
        System.out.println (" Class name "+className);
        System.out.println (" Roll no "+rollNo);
        System.out.println ("Choosed Book "+bookName );
    }
}
