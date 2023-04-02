package com.holovin.customer;

import java.util.UUID;

public class CustomerDao {
    private static final Customer[] customers;
    static {
        customers = new Customer[]{
                new Customer(UUID.randomUUID(), "Viktor", "admin"),
                new Customer(UUID.randomUUID(), "Azzurra", "customer")
        };
    }
    public Customer[] getCustomers() {
        return customers;
    }
}
