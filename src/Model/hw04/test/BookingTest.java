package Model.hw04.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import Model.hw04.Booking;
import Model.hw04.Customer;
import Model.hw04.Title;
import org.junit.Before;
import org.junit.Test;

public class BookingTest {

    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("Doe", "123456789", Title.MR);
    }

    @Test
    public void testBookingConstructor() {
        Booking booking = new Booking(customer, 2, 1);
        assertNotNull(booking);
        assertEquals(customer, booking.getCustomer());
        assertEquals(2, booking.getNumAdults());
        assertEquals(1, booking.getNumKids());
    }

    @Test
    public void testBookingDefaultConstructor() {
        Booking booking = new Booking();
        assertNotNull(booking);
        assertNotNull(booking.getCustomer());
        assertEquals(0, booking.getNumAdults());
        assertEquals(0, booking.getNumKids());
    }

    @Test
    public void testBookingSettersAndGetters() {
        Booking booking = new Booking();
        booking.setCustomer(customer);
        booking.setNumAdults(2);
        booking.setNumKids(1);
        booking.setBookingTime(new Date());

        assertEquals(customer, booking.getCustomer());
        assertEquals(2, booking.getNumAdults());
        assertEquals(1, booking.getNumKids());
        assertNotNull(booking.getBookingTime());
    }

    @Test
    public void testCustomerConstructor() {
        Customer customer = new Customer("Doe", "123456789", Title.MR);
        assertNotNull(customer);
        assertEquals("Doe", customer.getSurname());
        assertEquals("123456789", customer.getPhone());
        assertEquals(Title.MR, customer.getTitle());
    }

    @Test
    public void testCustomerDefaultConstructor() {
        Customer customer = new Customer();
        assertNotNull(customer);
        assertEquals("", customer.getSurname());
        assertEquals("", customer.getPhone());
        assertEquals(Title.MR, customer.getTitle());
    }

    @Test
    public void testCustomerSettersAndGetters() {
        Customer customer = new Customer();
        customer.setSurname("Doe");
        customer.setPhone("123456789");
        customer.setTitle(Title.MR);

        assertEquals("Doe", customer.getSurname());
        assertEquals("123456789", customer.getPhone());
        assertEquals(Title.MR, customer.getTitle());
    }
}
