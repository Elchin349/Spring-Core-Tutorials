package com.company.controller;

import com.company.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeController {

    @Autowired
    @Qualifier("employeeServiceImpl")
    private CustomerService customerService;

    public void getEmployeeInfo(){
        System.out.println(customerService.getInfo());
    }
}
