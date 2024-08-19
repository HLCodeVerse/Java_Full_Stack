package Assignment_4.VehicleRentalSystem;

public class VRS {
    public static void main ( String[] args ) {
        Vehicle c=new Car("AB53 632","Car",500,12);
        details (c);
        Vehicle t=new Truck ( "AD36 3464","Truck",800,4 );
        details (t);
        Vehicle b=new Bike ( "AG62 3243","Bike",300,24 );
        details (b);

    }
    public static void details (Vehicle vehicle) {
        vehicle.seeDetails ();
    }
}
