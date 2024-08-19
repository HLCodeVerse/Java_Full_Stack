package Assignment_4.ConferenceManagementSystem;

import java.util.Scanner;

public class Session {
    private String title;
    private String speaker;
    private String time;
    Scanner scanner=new Scanner(System.in);
    public  void scheduleSession(){
        System.out.println("Enter Session Title:");
        String title = scanner.nextLine();
        System.out.println("Enter Session Speaker:");
        String speaker = scanner.nextLine();
        System.out.println("Enter Session Time:");
        String time = scanner.nextLine();
        this.title=title;
        this.speaker=speaker;
        this.time=time;
    }
    public void showSession() {
        System.out.println("Title: " + title);
        System.out.println("Speaker: " + speaker);
        System.out.println("Time: " + time);
    }
}
