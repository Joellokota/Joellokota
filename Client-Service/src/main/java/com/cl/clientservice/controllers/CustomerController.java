package com.cl.clientservice.controllers;

import com.cl.clientservice.entities.Customer;
import com.cl.clientservice.services.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> customerList(){
        return this.customerService.listCustomers();
    }
    @GetMapping("/customers/{id}")
    public Customer toGetCustomer(@PathVariable Long id){
        return this.customerService.obtenirCustomer(id);
    }
}
