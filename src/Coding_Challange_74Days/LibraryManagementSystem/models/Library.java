package Coding_Challange_74Days.LibraryManagementSystem.models;

import Coding_Challange_74Days.LibraryManagementSystem.exceptions.BookNotFoundException;
import Coding_Challange_74Days.LibraryManagementSystem.exceptions.MemberNotFoundException;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
        } else {
            System.out.println("Book already exists");
        }
    }

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

    public void registerMember(Member member) throws MemberNotFoundException {
        if (!members.contains(member)) {
            members.add(member);
        } else {
            throw new MemberNotFoundException("Member already exists");
        }
    }

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

    public String searchBookByTitle(String title) throws BookNotFoundException {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book.toString();
            }
        }
        throw new BookNotFoundException(title + " is currently not available in the library");
    }

    public String searchMemberByName(String name) throws MemberNotFoundException {
        Iterator<Member> iterator = members.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getName().equalsIgnoreCase(name)) {
                return member.toString();
            }
        }
        throw new MemberNotFoundException(name + " not found");
    }

    // Day 5 - Display Methods
    public void displayBooks() throws BookNotFoundException {
        if (books.isEmpty()) {
            throw new BookNotFoundException("There are no books available");
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayMembers() throws MemberNotFoundException {
        if (members.isEmpty()) {
            throw new MemberNotFoundException("There are no members available");
        }
        for (Member member : members) {
            System.out.println(member);
        }
    }

    // Day 8 - Issue Book Method
    public void issueBook(String bookId, String memberId) throws BookNotFoundException, MemberNotFoundException {
        Book book = null;
        Member member = null;
        for (Book b : books) {
            if (b.getId().equalsIgnoreCase(bookId)) {
                book = b;
                break;
            }
        }
        if (book == null) {
            throw new BookNotFoundException("Book with ID " + bookId + " not found");
        }
        for (Member m : members) {
            if (m.getId().equalsIgnoreCase(memberId)) {
                member = m;
                break;
            }
        }
        if (member == null) {
            throw new MemberNotFoundException("Member with ID " + memberId + " not found");
        }
        if (book.isAvailable()) {
            book.setAvailable(false);
            member.addBorrowedBook(bookId);
            System.out.println("Book issued successfully");
        } else {
            System.out.println("Book is currently not available");
        }
    }
    // Day 9 - Return Book Method
    public void returnBook(String bookId, String memberId) throws BookNotFoundException, MemberNotFoundException {
        Book book = null;
        Member member = null;
        for (Book b : books) {
            if (b.getId().equalsIgnoreCase(bookId)) {
                book = b;
                break;
            }
        }
        if (book == null) {
            throw new BookNotFoundException("Book with ID " + bookId + " not found");
        }
        for (Member m : members) {
            if (m.getId().equalsIgnoreCase(memberId)) {
                member = m;
                break;
            }
        }
        if (member == null) {
            throw new MemberNotFoundException("Member with ID " + memberId + " not found");
        }
        if (!book.isAvailable()) {
            book.setAvailable(true);
            member.removeBorrowedBook(bookId);
            System.out.println("Book returned successfully");
        } else {
            System.out.println("Book is already available");
        }
    }

}
