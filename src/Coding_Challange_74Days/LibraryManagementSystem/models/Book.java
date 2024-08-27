package Coding_Challange_74Days.LibraryManagementSystem.models;
//DAY 1
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Book {
    // Fields
    private String id;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;
    private List<String> reservationList;
    private LocalDate borrowDate; // Day 11
    private final int borrowingPeriod = 15; // Day 11

    // Constructor
    public Book(String id, String title, String author, String genre, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.reservationList = new ArrayList<>();
        this.borrowDate = null;
    }

    // Getter and Setter Methods
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public List<String> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<String> reservationList) {
        this.reservationList = reservationList;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getBorrowingPeriod() {
        return borrowingPeriod;
    }

    // Method to get the current date
    public static LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    // ToString Method
    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Genre: " + genre + "\n" +
                "Available: " + (isAvailable ? "Yes" : "No") + "\n" +
                "Reservation List: " + reservationList;
    }
}
