package p2;

public class Flight {
    private String sourceAirport;
    private String destinationAirport;
    private Seat[] seats=new Seat[10];
    private int index=0;

    public Flight(String sourceAirport, String destinationAirport){
        this.sourceAirport=sourceAirport;
        this.destinationAirport=destinationAirport;
    }

    public boolean doSeatBooking(Passenger passenger)
    {
        boolean bookingStatus=false;
        if (passenger != null && index < seats.length) {
            seats[index] = new Seat();
            seats[index].setPassenger(passenger);
            seats[index].setBookingStatus(true);
            index++;
            bookingStatus = true;
        }
        return bookingStatus;
    }
    public void displayFlightBookingStatus() {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] != null && seats[i].isBookingStatus()) {
                Passenger p = seats[i].getPassenger();
                System.out.println("Seat " + (i + 1) + " is booked by " +
                        p.getName() + ", Age: " + p.getAge() +
                        ", Gender: " + p.getGender());
            } else {
                System.out.println("Seat " + (i + 1) + " is Free.");
            }
        }
    }
}
