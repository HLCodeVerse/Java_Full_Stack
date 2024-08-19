package Assignment_4.VehicleRentalSystem;

public class Car extends Vehicle{
    public Car ( String vNumber , String vType , double rentalPrice , float totalHours ) {
        super ( vNumber , vType , rentalPrice,totalHours );
    }

    @Override
    public void seeDetails ( ) {
        super.seeDetails ( );
        super.getTotalRentalPrice ();
    }
}
