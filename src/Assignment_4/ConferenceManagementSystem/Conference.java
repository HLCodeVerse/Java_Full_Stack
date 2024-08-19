package Assignment_4.ConferenceManagementSystem;

public class Conference {
    private String name;
    private String date;

    public Conference(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public void showConference() {
        System.out.println("Conference: " + name);
        System.out.println("Date: " + date);
    }
}
