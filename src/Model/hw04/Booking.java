package Model.hw04;

import java.util.Date;

public class Booking {
    Customer customer;
    int numAdults, numKids;
    Date bookingTime;
    public Booking(Customer customer, int numAdults, int numKids, Date bookingTime){
        this.customer = customer;
        this.numAdults = numAdults;
        this.numKids = numKids;
        this.bookingTime = bookingTime;
    }

    public Booking(Customer customer, int numAdults, int numKids) {
        this(customer, numAdults, numKids, new Date());
    }

    public Booking(Customer customer, int numAdults) {
        this(customer, numAdults, 0, new Date());
    }

    public Booking(Customer customer) {
        this(customer, 0, 0, new Date());
    }

    public Booking() {
        this(new Customer(), 0, 0, new Date());
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getNumAdults() {
        return numAdults;
    }

    public void setNumAdults(int numAdults) {
        this.numAdults = numAdults;
    }

    public int getNumKids() {
        return numKids;
    }

    public void setNumKids(int numKids) {
        this.numKids = numKids;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }
}
