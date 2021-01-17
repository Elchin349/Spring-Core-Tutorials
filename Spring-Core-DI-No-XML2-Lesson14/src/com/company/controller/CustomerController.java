package com.company.controller;

import com.company.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerController  {

    @Autowired
    private  CustomerService customerService;

    public void getCustomerInfo(){
        System.out.println(customerService.getInfo());
    }

}
