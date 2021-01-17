package com.company;

import com.company.appconfig.AppConfig;
import com.company.controller.CustomerController;
import com.company.model.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerController customerController = context.getBean("controller",CustomerController.class);

        Customer customer = new Customer();
        customer.setFirstName("Elchin");
        customer.setLastName("Akbarov");;

        customerController.saveCustomer(customer);
        customerController.getCustomerInfo();

        /**
         *   Literal injection bu sefer propertiesden edirik lakin bunu ede bilmek ucun
         *   xmlde beans in daxiline 1 ve 2 ini yazmaq sonra asagidanki context ile baslayani yazmaq lazimdirki
         *   sen kodu run etdikde melumati properties den ala bilesen
         *  1 http://www.springframework.org/schema/context
         *  2 https://www.springframework.org/schema/context/spring-context.xsd
         *   <context:property-placeholder location="application.properties"/>
         */
        AppConfig appConfig = context.getBean("appConfig",AppConfig.class);
        System.out.println(appConfig.getCompanyName());
        System.out.println(appConfig.getEmail());

    }
}
