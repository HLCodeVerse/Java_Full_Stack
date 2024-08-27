package Coding_Challange_74Days.LibraryManagementSystem;

import Coding_Challange_74Days.LibraryManagementSystem.exceptions.BookNotFoundException;
import Coding_Challange_74Days.LibraryManagementSystem.exceptions.MemberNotFoundException;
import Coding_Challange_74Days.LibraryManagementSystem.models.Book;
import Coding_Challange_74Days.LibraryManagementSystem.models.Library;
import Coding_Challange_74Days.LibraryManagementSystem.models.Member;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            try {
                System.out.println("Library Management System");
                System.out.println("1. Add Book");
                System.out.println("2. Remove Book");
                System.out.println("3. Register Member");
                System.out.println("4. Remove Member");
                System.out.println("5. Issue Book");
                System.out.println("6. Return Book");
                System.out.println("7. Reserve Book");
                System.out.println("8. Display Books");
                System.out.println("9. Display Members");
                System.out.println("10. Notify Members");
                System.out.println("11. Manage Overdue Books");
                System.out.println("12. Search Book by Title");
                System.out.println("13. Search Member by Name");
                System.out.println("14. Exit");
                System.out.print("Choose an option: ");
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Enter Number options only");
                scanner.nextLine(); // Clear the buffer
                continue;
            }
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    String bookId = title.substring(0, title.length() - 1).toUpperCase() + title.length() + "" + library.getBooks().size();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Book Genre: ");
                    String genre = scanner.nextLine();
                    Book book = new Book(bookId, title, author, genre, true); // Default borrowing period of 14 days
                    library.addBook(book);
                    System.out.println("Book added successfully with book ID " + bookId);
                    break;

                case 2:
                    System.out.print("Enter Book ID to Remove: ");
                    String removeBookId = scanner.nextLine();
                    try {
                        library.removeBook(removeBookId);
                        System.out.println("Book removed successfully.");
                    } catch (BookNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Enter Member Name: ");
                    String name = scanner.nextLine();
                    String memberId = name.substring(0, name.length() - 1).toUpperCase() + name.length() + "" + library.getMembers().size();
                    System.out.print("Enter Membership Type: ");
                    String membershipType = scanner.nextLine();
                    Member member = new Member(memberId, name, membershipType);
                    try {
                        library.registerMember(member);
                        System.out.println("Member registered successfully with member ID " + memberId);
                    } catch (MemberNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Enter Member ID to Remove: ");
                    String removeMemberId = scanner.nextLine();
                    try {
                        library.removeMember(removeMemberId);
                        System.out.println("Member removed successfully.");
                    } catch (MemberNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to Issue: ");
                    String issueBookId = scanner.nextLine();
                    System.out.print("Enter Member ID: ");
                    String issueMemberId = scanner.nextLine();
                    try {
                        library.issueBook(issueBookId, issueMemberId);
                    } catch (BookNotFoundException | MemberNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 6:
                    System.out.print("Enter Book ID to Return: ");
                    String returnBookId = scanner.nextLine();
                    System.out.print("Enter Member ID: ");
                    String returnMemberId = scanner.nextLine();
                    try {
                        library.returnBook(returnBookId, returnMemberId);
                    } catch (BookNotFoundException | MemberNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:
                    System.out.print("Enter Book ID to Reserve: ");
                    String reserveBookId = scanner.nextLine();
                    System.out.print("Enter Member ID: ");
                    String reserveMemberId = scanner.nextLine();
                    try {
                        library.reserveBook(reserveBookId, reserveMemberId);
                    } catch (BookNotFoundException | MemberNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 8:
                    try {
                        library.displayBooks();
                    } catch (BookNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 9:
                    try {
                        library.displayMembers();
                    } catch (MemberNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 10:
                    library.notifyMembers();
                    break;

                case 11:
                    try {
                        library.manageOverdueBooks();
                    } catch (BookNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 12:
                    System.out.print("Enter Book Title to Search: ");
                    String searchTitle = scanner.nextLine();
                    try {
                        String bookInfo = library.searchBookByTitle(searchTitle);
                        System.out.println("Book found: " + bookInfo);
                    } catch (BookNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 13:
                    System.out.print("Enter Member Name to Search: ");
                    String searchName = scanner.nextLine();
                    try {
                        String memberInfo = library.searchMemberByName(searchName);
                        System.out.println("Member found: " + memberInfo);
                    } catch (MemberNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 14:
                    System.out.println("Exiting system...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
