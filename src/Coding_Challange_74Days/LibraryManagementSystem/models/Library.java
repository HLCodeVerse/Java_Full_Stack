package Coding_Challange_74Days.LibraryManagementSystem.models;

import Coding_Challange_74Days.LibraryManagementSystem.exceptions.BookNotFoundException;
import Coding_Challange_74Days.LibraryManagementSystem.exceptions.MemberNotFoundException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private Map<String, Integer> overDue = new HashMap<>();

    // Getters and Setters
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    public Map<String, Integer> getOverDue() {
        return overDue;
    }

    public void setOverDue(Map<String, Integer> overDue) {
        this.overDue = overDue;
    }

    // Day 1: Add and Remove Books
    // ------------------------------------
    // Add a new book to the library
    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
        } else {
            System.out.println("Book already exists");
        }
    }

    // Remove an existing book by ID
    public void removeBook(String bookId) throws BookNotFoundException {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId().equalsIgnoreCase(bookId)) {
                iterator.remove();
                return;
            }
        }
        throw new BookNotFoundException("Book with ID " + bookId + " not found");
    }

    // Day 2: Register and Remove Members
    // ------------------------------------
    // Register a new member to the library
    public void registerMember(Member member) throws MemberNotFoundException {
        if (!members.contains(member)) {
            members.add(member);
        } else {
            throw new MemberNotFoundException("Member already exists");
        }
    }

    // Remove an existing member by ID
    public void removeMember(String memberId) throws MemberNotFoundException {
        Iterator<Member> iterator = members.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getId().equalsIgnoreCase(memberId)) {
                iterator.remove();
                return;
            }
        }
        throw new MemberNotFoundException("Member with ID " + memberId + " not found");
    }

    // Day 3: Search Books and Members
    // ------------------------------------
    // Search for a book by title
    public String searchBookByTitle(String title) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book.toString();
            }
        }
        throw new BookNotFoundException(title + " is currently not available in the library");
    }

    // Search for a member by name
    public String searchMemberByName(String name) throws MemberNotFoundException {
        for (Member member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                return member.toString();
            }
        }
        throw new MemberNotFoundException(name + " not found");
    }

    // Day 4: Display Books and Members
    // ------------------------------------
    // Display all existing books in the library
    public void displayBooks() throws BookNotFoundException {
        if (books.isEmpty()) {
            throw new BookNotFoundException("Books are not available");
        }
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    // Display all existing members in the library
    public void displayMembers() throws MemberNotFoundException {
        if (members.isEmpty()) {
            throw new MemberNotFoundException("There are no members available");
        }
        for (Member member : members) {
            System.out.println(member.toString());
        }
    }

    // Day 5: Issue and Return Books
    // ------------------------------------
    // Issue a book to a member
    public void issueBook(String bookId, String memberId) throws BookNotFoundException, MemberNotFoundException {
        Book book = getBookById(bookId);
        Member member = getMemberById(memberId);

        if (book.isAvailable()) {
            book.setAvailable(false);
            member.addBorrowedBook(bookId);
            member.addNotification("Book " + book.getTitle() + " borrowed successfully");
            book.setBorrowDate(LocalDate.now()); // Set the borrow date to today
            System.out.println("Book " + book.getTitle() + " issued successfully");
        } else {
            System.out.println("Book is currently not available");
        }
    }

    // Return a borrowed book
    public void returnBook(String bookId, String memberId) throws BookNotFoundException, MemberNotFoundException {
        Book book = getBookById(bookId);
        Member member = getMemberById(memberId);

        if (!book.isAvailable()) {
            book.setAvailable(true);
            member.removeBorrowedBook(bookId);
            member.clearNotifications();
            System.out.println("Book " + book.getTitle() + " returned successfully");
        } else {
            System.out.println("Book is already available");
        }
    }

    // Day 6: Reserve Books
    // ------------------------------------
    // Reserve a book for a member
    public void reserveBook(String bookId, String memberId) throws BookNotFoundException, MemberNotFoundException {
        Book book = getBookById(bookId);
        Member member = getMemberById(memberId);

        if (!book.isAvailable()) {
            if (!book.getReservationList().contains(memberId)) {
                book.getReservationList().add(memberId);
                member.addNotification("Book " + book.getTitle() + " reserved successfully");
                System.out.println("Book " + book.getTitle() + " reserved successfully");
            } else {
                System.out.println("Member has already reserved this book");
            }
        } else {
            System.out.println("Book is already available");
        }
    }

    // Day 7: Overdue Book Management
    // ------------------------------------
    // Manage overdue books
    public void manageOverdueBooks() throws BookNotFoundException {
        LocalDate today = LocalDate.now();
        for (Member member : members) {
            for (String bookId : member.getBorrowedBooks()) {
                Book book = getBookById(bookId);
                if (book != null && !book.isAvailable()) {
                    LocalDate borrowDate = book.getBorrowDate();
                    long daysBorrowed = java.time.temporal.ChronoUnit.DAYS.between(borrowDate, today);
                    int overdueDays = (int) (daysBorrowed - book.getBorrowingPeriod());
                    if (overdueDays > 0) {
                        System.out.println("Member " + member.getName() + " has overdue book " + book.getTitle() + " for " + overdueDays + " days");
                        overDue.put(bookId, overdueDays);
                    }
                }
            }
        }
    }

    // Day 8: Notification System
    // ------------------------------------
    // Notify members about reserved books becoming available
    public void notifyMembers() {
        for (Member member : members) {
            System.out.println("Notifications for: " + member.getName());

            // Check for reserved books that are now available
            for (Book book : books) {
                if (book.getReservationList().contains(member.getId()) && book.isAvailable()) {
                    String notification = "The book '" + book.getTitle() + "' is now available for you.";
                    System.out.println(notification); // Display the notification immediately
                }
            }

            // Display any existing notifications
            if (member.getNotifications().isEmpty()) {
                System.out.println("No notifications.");
            } else {
                for (String notification : member.getNotifications()) {
                    System.out.println(notification);
                }
            }
        }
    }

    // Helper Methods
    // ------------------------------------
    private Book getBookById(String bookId) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getId().equalsIgnoreCase(bookId)) {
                return book;
            }
        }
        throw new BookNotFoundException("Book with ID " + bookId + " not found");
    }

    private Member getMemberById(String memberId) throws MemberNotFoundException {
        for (Member member : members) {
            if (member.getId().equalsIgnoreCase(memberId)) {
                return member;
            }
        }
        throw new MemberNotFoundException("Member with ID " + memberId + " not found");
    }
}
