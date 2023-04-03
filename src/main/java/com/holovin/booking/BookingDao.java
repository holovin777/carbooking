package com.holovin.booking;

import com.holovin.car.Car;
import com.holovin.customer.Customer;

import java.time.LocalDateTime;

public class BookingDao {
    private static Booking[] bookings = new Booking[99];
    public static Booking[] getBookings() {
        return bookings;
    }
    public static void createBooking(Car car, Customer customer, int days) {
        for (int i = 0; i < bookings.length; i++) {
            try {
                bookings[i].getCar();
            } catch (NullPointerException e) {
                bookings[i] = new Booking(car, customer, LocalDateTime.now(), days);
                car.setBooked(true);
                break;
            }
        }
    }
}
