package com.nijatsuleymanov.customers.repository;

import com.nijatsuleymanov.customers.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long> {

    Optional<Customers> findCustomersByEmail(String email);

}

