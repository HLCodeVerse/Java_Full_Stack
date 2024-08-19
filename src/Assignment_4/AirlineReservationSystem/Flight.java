package Assignment_4.AirlineReservationSystem;

 public class Flight {
    private String flightName;
    private String departureAirport;
    private String destination;
    private double flightCost;
    Flight(String flightName,String departureAirport,String destination, double flightCost){
        this.flightName = flightName;
        this.departureAirport = departureAirport;
        this.destination = destination;
        this.flightCost = flightCost;
    }

     public String getFlightName ( ) {
         return flightName;
     }

     public void setFlightName ( String flightName ) {
         this.flightName = flightName;
     }

     public String getDepartureAirport ( ) {
         return departureAirport;
     }

     public void setDepartureAirport ( String departureAirport ) {
         this.departureAirport = departureAirport;
     }

     public String getDestination ( ) {
         return destination;
     }

     public void setDestination ( String destination ) {
         this.destination = destination;
     }

     public double getFlightCost ( ) {
         return flightCost;
     }

     public void setFlightCost ( double flightCost ) {
         this.flightCost = flightCost;
     }
 }
