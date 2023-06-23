package com.customer.data.customer.service;

import com.customer.data.customer.repository.CustomerRepository;
import com.customer.data.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public CustomerEntity saveCustomer(CustomerEntity customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<CustomerEntity> fetchDCustomer() {
        return customerRepository.findAll();
    }
}
