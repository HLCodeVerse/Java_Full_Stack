//Day 1
package Coding_Challange_74Days.LibraryManagementSystem.models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String id;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;
    private List<String> reservationList;
    public Book(String id, String title, String author, String genre, boolean isAvailable, List<String> reservationList){
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.reservationList = new ArrayList<> (  );
    }
//Getter and setter Methods
    public String getId ( ) {
        return id;
    }

    public void setId ( String id ) {
        this.id = id;
    }

    public String getTitle ( ) {
        return title;
    }

    public void setTitle ( String title ) {
        this.title = title;
    }

    public String getAuthor ( ) {
        return author;
    }

    public void setAuthor ( String author ) {
        this.author = author;
    }

    public String getGenre ( ) {
        return genre;
    }

    public void setGenre ( String genre ) {
        this.genre = genre;
    }

    public boolean isAvailable ( ) {
        return isAvailable;
    }

    public void setAvailable ( boolean available ) {
        isAvailable = available;
    }

    public List<String> getReservationList ( ) {
        return reservationList;
    }

    public void setReservationList ( List<String> reservationList ) {
        this.reservationList = reservationList;
    }
    //toString method
    @Override
    public String toString ( ) {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", isAvailable=" + isAvailable +
                ", reservationList=" + reservationList +
                '}';
    }
}
