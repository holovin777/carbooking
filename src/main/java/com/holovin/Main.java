package com.holovin;


import com.holovin.booking.Booking;
import com.holovin.booking.BookingDao;
import com.holovin.car.Car;
import com.holovin.car.Engine;
import com.holovin.customer.Customer;
import com.holovin.customer.CustomerDao;
import com.holovin.car.CarDao;

import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Customer[] customers = CustomerDao.getCustomers();
        Car[] cars = CarDao.getCars();
        Scanner scanner = new Scanner(System.in);

        String menu = """
1️⃣ - Book Car
2️⃣ - View All User Booked Cars
3️⃣ - View All Bookings
4️⃣ - View Available Cars
5️⃣ - View Available Electric Cars
6️⃣ - View all users
7️⃣ - Exit
8 - View all cars
                """;

        System.out.println(menu);
        System.out.println("Enter number: ");
        String menuItem = scanner.nextLine();

        while (!menuItem.equals("7")) {
            if (menuItem.equals("1")) {
                System.out.println("Enter your password: ");
                String password = scanner.nextLine();
                for (Customer customer : customers) {
                    if (password.equals(customer.getPassword())) {
                        System.out.println("Hello, " + customer.getFirstName() + "! You can choose one car: ");
                        for (Car car : cars) {
                            if (!car.isBooked()) {
                                System.out.println(car.getBrandName());
                            }
                        }
                        String carInput = scanner.nextLine();
                        for (Car car : cars) {
                            if (car.getBrandName().equals(carInput)) {
                                System.out.println("How many days you want to drive " + car.getBrandName() + "? ");
                                String daysInput = scanner.nextLine();
                                int days = Integer.parseInt(daysInput);
                                BookingDao.createBooking(car, customer, days);
                                System.out.println("Your " + car.getBrandName() + " is ready");
                            }
                        }

                    }
                }
            } else if (menuItem.equals("2")) {
                for (Car car : cars) {
                    if (car.isBooked()) {
                        System.out.println(car.getBrandName());
                    }
                }
            } else if (menuItem.equals("3")) {
                for (Booking booking : BookingDao.getBookings()) {
                    try {
                        System.out.println(booking.toString());
                    } catch (NullPointerException e) {
                        break;
                    }
                }
                System.out.println();
            } else if (menuItem.equals("4")) {
                for (Car car : cars) {
                    if (!car.isBooked()) {
                        System.out.println(car.getBrandName());
                    }
                }
            } else if (menuItem.equals("5")) {
                for (Car car : cars) {
                    if (car.getEngineType().equals(Engine.ELECTRIC_MOTOR)) {
                        System.out.println(car.getBrandName());
                    }
                }
            } else if (menuItem.equals("6")) {
                System.out.println(Arrays.toString(CustomerDao.getCustomers()));
            } else if (menuItem.equals("8")) {
                System.out.println(Arrays.toString(CarDao.getCars()));
            } else {
                System.out.println("Ciao!");
            }
            System.out.println(menu);
            System.out.println("Enter number: ");
            menuItem = scanner.nextLine();
        }
    }
}