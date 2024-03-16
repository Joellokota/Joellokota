package com.cl.clientservice.services.impl;

import com.cl.clientservice.entities.Customer;
import com.cl.clientservice.repository.CustomerRepository;
import com.cl.clientservice.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> listCustomers() {
        return this.customerRepository.findAll();
    }

    @Override
    public Customer obtenirCustomer(Long id) {
        return this.customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> toutSauvegarder(List<Customer> customers) {
        return this.customerRepository.saveAll(customers);
    }
}
