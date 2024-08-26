//Day 3
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
    //Day 4
    public String searchBookByTitle(String title) throws BookNotFoundException {
        Iterator<Book> iterator =  books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book.toString();
            }
        }throw new BookNotFoundException ( title+" Currently not available in Library" );
    }
    public String searchMemberByName(String name) throws MemberNotFoundException {
        Iterator<Member> iterator = members.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getName().equalsIgnoreCase(name)) {
                return member.toString();
            }
        }
        throw new MemberNotFoundException (name+" not found" );
    }
}
