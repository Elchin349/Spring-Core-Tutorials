package com.company.service;

import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceImpl implements CustomerService {

    @Override
    public String getInfo() {
        return "EMPLOYEE INFO";
    }
}
