package Assignment_4.AirlineReservationSystem;

import java.util.Scanner;

public class Airline {
    Scanner sc = new Scanner(System.in);
    Flight f1, f2;

    public void addFlight() {
        while (true) {
            System.out.println("Enter flight name:");
            String flightName = sc.nextLine();
            System.out.println("Enter Depart Airport:");
            String dA = sc.nextLine();
            System.out.println("Enter Destination Airport:");
            String lA = sc.nextLine();
            System.out.println("Enter Cost:");
            double cost = sc.nextDouble();
            sc.nextLine();

            if (f1 == null || f1.getFlightName() == null) {
                f1 = new Flight(flightName, dA, lA, cost);
            } else if (f2 == null || f2.getFlightName() == null) {
                f2 = new Flight(flightName, dA, lA, cost);
                break;
            }
        }
    }

    public void showFlightDetails() {
            System.out.println(f1.getFlightName());
            System.out.println(f1.getDepartureAirport() + " " + f1.getDestination ());
            System.out.println(f1.getFlightCost());

            System.out.println(f2.getFlightName());
            System.out.println(f2.getDepartureAirport() + " " + f2.getDestination ());
            System.out.println(f2.getFlightCost());
    }

    public void reserve(int choice) {
        if (choice == 1) {
            System.out.println(f1.getFlightName() + " Successfully Booked");
            System.out.println("Your Cost is: " + f1.getFlightCost());
        } else if (choice == 2 ) {
            System.out.println(f2.getFlightName() + " Successfully Booked");
            System.out.println("Your Cost is: " + f2.getFlightCost());
        } else {
            System.out.println("Invalid choice or no flight available.");
        }
    }
}
