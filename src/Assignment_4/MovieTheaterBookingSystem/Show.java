package Assignment_4.MovieTheaterBookingSystem;

public class Show {
    private static String show1 = "Matinee Show";
    private static String show2 = "Eveining Show";
    private static String show3 = "Night Show";

    public String getShow1 ( ) {
        return show1;
    }

    public String getShow2 ( ) {
        return show2;
    }

    public String getShow3 ( ) {
        return show3;
    }

    public static void shows ( ) {
        System.out.println ( show1 );
        System.out.println ( show2 );
        System.out.println ( show3 );
    }
}
