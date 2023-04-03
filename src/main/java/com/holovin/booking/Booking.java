package com.holovin.booking;

import com.holovin.car.Car;
import com.holovin.customer.Customer;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Booking {
    private Car car;
    private Customer customer;
    private LocalDateTime date;
    private int days;

    public Booking(Car car, Customer customer, LocalDateTime date, int days) {
        this.car = car;
        this.customer = customer;
        this.date = date;
        this.days = days;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return days == booking.days && Objects.equals(car, booking.car) && Objects.equals(customer, booking.customer) && Objects.equals(date, booking.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, customer, date, days);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "car=" + car +
                ", customer=" + customer +
                ", date=" + date +
                ", days=" + days +
                '}';
    }
}
