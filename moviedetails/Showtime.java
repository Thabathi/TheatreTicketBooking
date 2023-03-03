package moviedetails;
 

import java.util.ArrayList;
import java.util.List;

public class Showtime {
    private String time;
    private int capacity;
    private int availableSeats;
    private List<Booking> bookings;

    public Showtime(String time, int capacity) {
        this.time = time;
        this.capacity = capacity;
        this.availableSeats = capacity;
        this.bookings = new ArrayList<>();
    }

    public String getTime() {
        return time;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public boolean bookSeats(int numSeats, String customerName) {
        if (availableSeats >= numSeats) {
            availableSeats -= numSeats;
            boolean add = bookings.add(new Booking(numSeats, customerName));
            return true;
        }
        return false;
    }
}
