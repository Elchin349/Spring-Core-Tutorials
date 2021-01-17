package com.company.service;

import com.company.appconfig.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerSeviceImpl implements CustomerService{

    @Autowired
    private AppConfig appConfig;

    @Override
    public String getInfo() {
        return "CUSTOMER INFO";
    }

    @Override
    public void getInfoAboutCompany() {

        System.out.println(" COMPANY DATA");
        System.out.println("EMAIL: " + appConfig.getEmail());
        System.out.println("COMPANY NAME: " + appConfig.getCompanyName());
    }


}
