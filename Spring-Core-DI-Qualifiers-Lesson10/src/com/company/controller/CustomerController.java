package com.company.controller;

import com.company.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("customerController")
public class CustomerController {

    @Autowired
    @Qualifier("customerSeviceImpl")
    private  CustomerService customerService;

    public void getCustomerInfo(){
        System.out.println(customerService.getInfo());
    }
}
