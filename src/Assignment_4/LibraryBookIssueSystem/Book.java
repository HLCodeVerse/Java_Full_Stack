package Assignment_4.LibraryBookIssueSystem;

import java.util.Scanner;

public class Book {
    private String bookName;


    public String getBookName ( ) {
        return bookName;
    }

    public void addBook(){
        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter Book Name :" );
        String bookName = sc.nextLine();
        this.bookName = bookName;
    }
}
