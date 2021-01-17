package com.company.service;

import com.company.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerSeviceImpl implements CustomerService{

    @Override
    public void save(Customer customer) {
        System.out.println("Saved Succesfully");
    }

    @Override
    public String getCustomer() {
        return "CUSTOMER INFO";
    }
}
