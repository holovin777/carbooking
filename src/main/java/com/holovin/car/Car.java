package com.holovin.car;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {
    private Long id;
    private String brandName;
    private Engine engineType;
    private String regNumber;
    private BigDecimal price;
    private boolean booked;

    public Car(Long id, String brandName, Engine engineType, String regNumber, BigDecimal price) {
        this.id = id;
        this.brandName = brandName;
        this.engineType = engineType;
        this.regNumber = regNumber;
        this.price = price;
        this.booked = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Engine getEngineType() {
        return engineType;
    }

    public void setEngineType(Engine engineType) {
        this.engineType = engineType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return booked == car.booked && Objects.equals(id, car.id) && Objects.equals(brandName, car.brandName) && engineType == car.engineType && Objects.equals(regNumber, car.regNumber) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brandName, engineType, regNumber, price, booked);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", engineType=" + engineType +
                ", regNumber='" + regNumber + '\'' +
                ", price=" + price +
                ", booked=" + booked +
                '}';
    }
}
