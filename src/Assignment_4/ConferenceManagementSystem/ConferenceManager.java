package Assignment_4.ConferenceManagementSystem;

import java.util.Scanner;

public class ConferenceManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Attendee a1=new Attendee();
        Session session = new Session();
        Conference c = new Conference("Global warming", "2024-08-15");
        int choice;
        do {
            System.out.println("1. Register Attendee");
            System.out.println("2. Schedule Session");
            System.out.println("3. Display Schedule");
            System.out.println("4. Display Attendees");
            System.out.println("5. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    a1.registerAttendee ();
                    break;
                case 2:
                    session.scheduleSession ();
                    break;
                case 3:
                    c.showConference ();
                    session.showSession ();
                    break;
                case 4:
                    a1.showAttendee ();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}
