package Assignment_4.VehicleRentalSystem;

public class Truck extends Vehicle{
    public Truck ( String vNumber , String vType , double rentalPrice , float totalHours) {
        super ( vNumber , vType , rentalPrice, totalHours );
    }
    @Override
    public void seeDetails() {
        super.seeDetails();
        super.getTotalRentalPrice ();
    }

}
