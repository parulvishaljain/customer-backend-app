package com.parul.eazystore.Controller;

import com.parul.eazystore.model.Customer;
import com.parul.eazystore.service.CustomerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin(origins = "*") // React Vite
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return service.getAllCustomers();
    }
}