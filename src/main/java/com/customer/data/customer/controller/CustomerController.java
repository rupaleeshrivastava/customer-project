package com.customer.data.customer.controller;

import com.customer.data.customer.service.CustomerService;
import com.customer.data.entity.CustomerEntity;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
@Autowired
    private CustomerService customerService;
    @PostMapping("/customers")
    public CustomerEntity saveCustomer(@Valid @RequestBody CustomerEntity customer){
        return customerService .saveCustomer(customer);
    }
    @GetMapping("/customers")
    public List<CustomerEntity> fetchCustomer(){
        return customerService.fetchDCustomer();
    }
}
