//Day 2
package Coding_Challange_74Days.LibraryManagementSystem.models;

import Coding_Challange_74Days.LibraryManagementSystem.exceptions.BookNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String id;
    private String name;
    private String membershipType;
    private List<String> borrowedBooks;
    private List<String> notifications;
    public Member(String id, String name, String membershipType, List<String> borrowedBooks, List<String> notifications) {
        this.id = id;
        this.name = name;
        this.membershipType = membershipType;
        this.borrowedBooks = new ArrayList<> (  );
        this.notifications = new ArrayList<> ( );
    }

    public String getId ( ) {
        return id;
    }

    public void setId ( String id ) {
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getMembershipType ( ) {
        return membershipType;
    }

    public void setMembershipType ( String membershipType ) {
        this.membershipType = membershipType;
    }

    public List<String> getBorrowedBooks ( ) {
        return borrowedBooks;
    }

    public void setBorrowedBooks ( List<String> borrowedBooks ) {
        this.borrowedBooks = borrowedBooks;
    }

    public List<String> getNotifications ( ) {
        return notifications;
    }

    public void setNotifications ( List<String> notifications ) {
        this.notifications = notifications;
    }
    protected void addBorrowedBook(String bookId){
        if(!borrowedBooks.contains(bookId)){
            borrowedBooks.add(bookId);
        }
    }
    protected void removeBorrowedBook(String bookId){
    try{
        if ( borrowedBooks.contains ( bookId ) ){
            borrowedBooks.remove(bookId);
        }else {
            throw new BookNotFoundException ( "Book " + bookId + " not exist" );
        }
    }catch (BookNotFoundException e){
        System.out.println (e.getMessage () );
    }
    }
    protected void addNotification(String notification){
        notifications.add(notification);
    }
    protected void removeNotification(String notification){
        notifications.remove(notification);
    }
    protected void clearNotifications(){
        notifications.clear();
    }
}
