package com.cl.clientservice.services;

import com.cl.clientservice.entities.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> listCustomers();

    Customer obtenirCustomer(Long id);

    List<Customer> toutSauvegarder(List<Customer> customers);
}
