package com.nijatsuleymanov.customers.service.impl;

import com.nijatsuleymanov.customers.entity.Customers;
import com.nijatsuleymanov.customers.exception.CustomersAlreadyExistsException;
import com.nijatsuleymanov.customers.repository.CustomerRepository;
import com.nijatsuleymanov.customers.service.ICustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements ICustomerService {

    private CustomerRepository customerRepository;

    @Override
    public void createCustomer(Customers customers) {
        final Optional<Customers> customersByEmail = customerRepository.findCustomersByEmail(customers.getEmail());
        if (customersByEmail.isPresent()) {
            throw new CustomersAlreadyExistsException("Customer with email " + customers.getEmail() + " already exists");
        }
        customerRepository.save(customers);
    }

    @Override
    public List<Customers> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void updateCustomers(Customers customers) {
        customerRepository.save(customers);
    }

    @Override
    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }

}
