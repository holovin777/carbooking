package com.holovin.customer;

import com.holovin.car.Car;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class Customer {
    private UUID id;
    private String firstName;
    private String password;
    private Car[] cars;

    public Customer(UUID id, String firstName, String password) {
        this.id = id;
        this.firstName = firstName;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(firstName, customer.firstName) && Objects.equals(password, customer.password) && Arrays.equals(cars, customer.cars);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, firstName, password);
        result = 31 * result + Arrays.hashCode(cars);
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", password='" + password + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
