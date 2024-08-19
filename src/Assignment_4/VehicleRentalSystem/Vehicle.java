package Assignment_4.VehicleRentalSystem;

public class Vehicle {
    private String vNumber;
    private String vType;
    private double rentalPrice;

    private float totalHours;

    public Vehicle ( String vNumber , String vType , double rentalPrice , float totalHours ) {
        this.vNumber = vNumber;
        this.vType = vType;
        this.rentalPrice = rentalPrice;
        this.totalHours = totalHours;
    }


    private double totalRentalPrice(){
        double price =rentalPrice*totalHours;
        return price;
    }
    public void getTotalRentalPrice(){
        System.out.println ("Total Rental Price : "+totalRentalPrice());
    }
    public  void seeDetails (){
        System.out.println ("Vehicle Number : "+vNumber );
        System.out.println ("Vehicle Type : "+vType );
        System.out.println ("Rent : "+rentalPrice );
        System.out.println ("Total Hours : "+totalHours );
    }
}

