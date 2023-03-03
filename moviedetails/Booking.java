package moviedetails;
 

public class Booking {
    private int numSeats;
    private String customerName;

    public Booking(int numSeats, String customerName) {
        this.numSeats = numSeats;
        this.customerName = customerName;
    }
 
	public int getNumSeats() {
        return numSeats;
    }

    public String getCustomerName() {
        return customerName;
    }
}
