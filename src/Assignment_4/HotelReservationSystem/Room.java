package Assignment_4.HotelReservationSystem;

public class Room {
    private int roomNumber;
    private boolean isAvailable;
    private double pricePerNight;

    public Room(int roomNumber, boolean isAvailable, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.isAvailable = isAvailable;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }
}
