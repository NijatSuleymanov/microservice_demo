package com.nijatsuleymanov.customers.controller;

import com.nijatsuleymanov.customers.entity.Customers;
import com.nijatsuleymanov.customers.service.ICustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private ICustomerService customerService;

     @PostMapping("/create")
     public ResponseEntity<String> createCustomers(@RequestBody Customers customers) {
         customerService.createCustomer(customers);
         return ResponseEntity.ok("Customer created successfully");
     }

     @GetMapping
     public ResponseEntity<List<Customers>> getAllCustomers() {
         return ResponseEntity.ok(customerService.getAllCustomers());
     }

     @PutMapping("/update")
     public ResponseEntity<String> updateCustomers(@RequestBody Customers customers) {
         customerService.updateCustomers(customers);
         return ResponseEntity.ok("Customer updated successfully");
     }

     @DeleteMapping("/{id}")
    public ResponseEntity<String> removeCustomers(@PathVariable Long id) {
         customerService.deleteCustomer(id);
         return ResponseEntity.ok("Customer deleted successfully");
     }

}
