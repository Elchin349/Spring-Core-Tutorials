package com.company.controller;

import com.company.model.Customer;
import com.company.service.CustomerService;

/**
 * Customer Service i constructor vasitesi ile inject edirik
 * ve xml faylda da bean ni yaradiriq
 */
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    public void doMyStartUp(){
        System.out.println("* * * PROJECT STARTED * * *");
    }
    public void saveCustomer(Customer customer){
        customerService.save(customer);
    }

    public void getCustomerInfo(){
        System.out.println(customerService.getCustomer());
    }


    public void destroyMyStartUp(){
        System.out.println("* * * DESTROYED MY STARTUP * * *");
    }

}
