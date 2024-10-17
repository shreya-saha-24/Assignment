package p2;
import java.util.*;

public class MainClass {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Flight flight = new Flight("IND", "NY");

            while (true) {
                System.out.println("1. Book Seat");
                System.out.println("2. Show Booking Status");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("Enter passenger name: ");
                        String name = sc.next();
                        System.out.print("Enter passenger age: ");
                        int age = sc.nextInt();
                        System.out.print("Enter passenger gender: ");
                        String gender = sc.next();

                        Passenger passenger = new Passenger(name, age, gender);

                        boolean booked = flight.doSeatBooking(passenger);
                        if (booked) {
                            System.out.println("Seat successfully booked!");
                        } else {
                            System.out.println("No available seats!");
                        }
                        break;

                    case 2:
                        flight.displayFlightBookingStatus();
                        break;

                    case 3: // Exit
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid option! Please try again.");
                        break;
                }
            }
        }
    }


