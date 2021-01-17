package com.company.service;

import org.springframework.stereotype.Component;

@Component
public class CustomerSeviceImpl implements CustomerService{

    @Override
    public String getInfo() {
        return "CUSTOMER INFO";
    }


}
