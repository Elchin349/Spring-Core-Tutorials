package com.company.controller;

import com.company.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("customerController")
@Scope("prototype")
public class CustomerController {

    @Autowired
    private  CustomerService customerService;

    public void getCustomerInfo(){
        System.out.println(customerService.getInfo());
    }
}
