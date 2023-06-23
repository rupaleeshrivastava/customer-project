package com.customer.data.customer.service;

import com.customer.data.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {

    public  CustomerEntity saveCustomer(CustomerEntity customer);

    public List<CustomerEntity> fetchDCustomer();

}
