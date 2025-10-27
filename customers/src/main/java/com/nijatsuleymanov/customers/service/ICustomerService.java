package com.nijatsuleymanov.customers.service;

import com.nijatsuleymanov.customers.entity.Customers;

import java.util.List;

public interface ICustomerService {
    void createCustomer(Customers customers);

    List<Customers> getAllCustomers();

    void updateCustomers(Customers customers);
    void deleteCustomer( Long customerId);
}

