package com.company.controller;

import com.company.model.Customer;
import com.company.service.CustomerService;
import org.springframework.stereotype.Component;

@Component("customerController")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void saveCustomer(Customer customer){
        customerService.save(customer);
    }

    public void getCustomerInfo(){
        System.out.println(customerService.getCustomer());
    }

}
