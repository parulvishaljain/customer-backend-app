package com.parul.eazystore.service;




import com.parul.eazystore.model.Customer;
import com.parul.eazystore.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }
}
