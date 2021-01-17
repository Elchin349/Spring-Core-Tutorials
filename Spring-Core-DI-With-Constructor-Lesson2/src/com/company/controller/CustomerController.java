package com.company.controller;

import com.company.model.Customer;
import com.company.service.CustomerService;

/**
 * Customer Service i constructor vasitesi ile inject edirik
 * ve xml faylda da bean ni yaradiriq
 */
public class CustomerController {

    private CustomerService customerService;

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
