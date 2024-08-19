package Assignment_4.HotelReservationSystem;

public class Guest{
    private String name;
    private Long contactNumber;
    private static int totalNights;

    public Guest( String name, Long contactNumber, int totalNights) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.totalNights = totalNights;
    }

    public String getName ( ) {
        return name;
    }

    public Long getContactNumber ( ) {
        return contactNumber;
    }

    public static int getTotalNights ( ) {
        return totalNights;
    }
}
