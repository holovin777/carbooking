package com.holovin.car;

import java.math.BigDecimal;

public class CarDao {
    private static final Car[] cars;
    static {
        cars = new Car[]{
                new Car(1L, "Gesla", Engine.ELECTRIC_MOTOR, "IF444UF", new BigDecimal("120.50")),
                new Car(2L, "Gamborgini", Engine.INTERNAL_COMBUSTION_ENGINE, "GA911UI", new BigDecimal("201.85")),
                new Car(3L, "Giguli", Engine.INTERNAL_COMBUSTION_ENGINE, "XA888XA", new BigDecimal("78.98"))
        };
    }
    public Car[] getCars() {
        return cars;
    }
}
