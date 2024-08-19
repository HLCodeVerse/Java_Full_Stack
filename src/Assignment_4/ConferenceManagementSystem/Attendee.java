package Assignment_4.ConferenceManagementSystem;

import java.util.Scanner;

public class Attendee {
    private String name;
    Scanner sc=new Scanner ( System.in );

    public String getName() {
        return name;
    }

    public void registerAttendee(){
        System.out.println("Enter Attendee Name:");
        String name = sc.nextLine();
        this.name = name;
    }

    public void showAttendee() {
        System.out.println("Name: " + name);
    }
}
