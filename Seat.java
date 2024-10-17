package p2;

public class Seat {
    private boolean bookingStatus;
    private Passenger passenger;

    public Seat(){}

    public Seat(boolean bookingStatus, Passenger passenger) {
        this.bookingStatus = bookingStatus;
        this.passenger = passenger;
    }

    public boolean isBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
